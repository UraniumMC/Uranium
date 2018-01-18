package cc.uraniummc;

import cc.uraniummc.util.NMSClassUtil;
import com.sun.org.apache.bcel.internal.classfile.LocalVariable;
import lombok.Setter;
import lombok.experimental.var;
import net.md_5.specialsource.RemappingClassAdapter;
import net.md_5.specialsource.SpecialSource;
import net.md_5.specialsource.repo.ClassRepo;
import org.bukkit.plugin.java.PluginClassLoader;

import net.md_5.specialsource.JarMapping;
import net.md_5.specialsource.JarRemapper;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static org.objectweb.asm.ClassWriter.COMPUTE_MAXS;

public class UraniumRemapper extends JarRemapper implements Opcodes{
    protected final PluginClassLoader mLoader;
    private int writerFlags = COMPUTE_MAXS;
    private int readerFlags = 0;
    @Setter
    private boolean debug=false;

    private boolean RemapReflection=false;
    public UraniumRemapper(JarMapping jarMapping,PluginClassLoader pPluginClassLoader){
        super(jarMapping);

        this.mLoader=pPluginClassLoader;
    }

    public UraniumRemapper(JarMapping jarMapping,PluginClassLoader pPluginClassLoader,boolean reflection){
        this(jarMapping,pPluginClassLoader);
        this.RemapReflection=reflection;
    }

    @Override
    public String mapSignature(String signature,boolean typeSignature){
        try{
            return super.mapSignature(signature,typeSignature);
        }catch(Exception e){
            return signature;
        }
    }

    @Override
    public String map(String typeName){
        // not remap class that exist in jar file
        // this mean plugin use it's owner lib 
        return this.mLoader.findResource(typeName.replace('.','/').concat(".class"))!=null?typeName:super.map(typeName);
    }
    /**
     * Remap an individual class given an InputStream to its bytecode
     */
    public byte[] remapClassFile(InputStream is, ClassRepo repo) throws IOException {
        return RemapReflection?remapClassFile(new ClassReader(super.remapClassFile(is, repo))):super.remapClassFile(is,repo);
    }

    public byte[] remapClassFile(byte[] in, ClassRepo repo) {
        return RemapReflection?remapClassFile(new ClassReader(super.remapClassFile(in, repo))):super.remapClassFile(in,repo);
    }

    private void logR(String message) {
        if (debug) {
            System.out.println("[ReflectionRemapper] " + message);
        }
    }
    private int FindMethodStartPos(int start,InsnList list,MethodInsnNode method){
        Type mt=Type.getMethodType(method.desc);
        AbstractInsnNode new_pos=null;
        Type[] types=mt.getArgumentTypes();
        if(types!=null) {
            for (int ti = types.length - 1; ti >= 0; ti--) {
                Type ft = types[ti];
                if (ft.getSort() == Type.ARRAY) {
                    if ((new_pos = list.get(start - 1)).getOpcode() != AALOAD) {
                        do {
                            new_pos = list.get(--start);
                            if (new_pos.getOpcode() == ANEWARRAY) {
                                String ndec=ft.getDescriptor();
                                ndec=ndec.substring(2);
                                if(ndec.equals(((TypeInsnNode) new_pos).desc+";")){
                                    new_pos = list.get(--start);
                                    break;
                            }
                            } else if (new_pos instanceof MethodInsnNode) {
                                    start = FindMethodStartPos(start, list, (MethodInsnNode) new_pos);
                            }
                        } while (true);
                    }
                } else {
                    boolean bre=false;
                    do {
                        new_pos = list.get(--start);
                        if (new_pos instanceof MethodInsnNode) {
                            start = FindMethodStartPos(start, list, (MethodInsnNode) new_pos);
                            break;
                        }
                        switch (new_pos.getOpcode()) {
                            case INVOKEDYNAMIC:
                            case LDC:
                            case ICONST_0:
                            case ICONST_1:
                            case ICONST_2:
                            case ICONST_3:
                            case ICONST_4:
                            case ICONST_5:
                            case LCONST_0:
                            case LCONST_1:
                            case FCONST_0:
                            case FCONST_1:
                            case FCONST_2:
                            case DCONST_0:
                            case DCONST_1:
                            case BIPUSH:
                            case SIPUSH:
                            case ILOAD:
                            case LLOAD:
                            case FLOAD:
                            case DLOAD:
                            case ALOAD:
                                bre=true;
                        }
                    }
                    while (!(new_pos instanceof IntInsnNode || new_pos instanceof VarInsnNode || new_pos instanceof LdcInsnNode || bre));
                }
            }
        }
        if(method.getOpcode()==INVOKEVIRTUAL||method.getOpcode()==INVOKESPECIAL||method.getOpcode()==INVOKEINTERFACE)--start;
        return start;
    }
    @SuppressWarnings("unchecked")
    private byte[] remapClassFile(ClassReader reader) {
        ClassNode cn=new ClassNode();
        reader.accept(cn, ClassReader.EXPAND_FRAMES);
        HashSet<Object> varTypes=new HashSet();
        for(int i=0;i<cn.methods.size();i++){
            MethodNode nm=cn.methods.get(i);
            ArrayList vt=new ArrayList();
            vt.addAll(varTypes);
            if(nm.localVariables!=null) {
                for (int lv = 0; lv < nm.localVariables.size(); lv++) {
                    LocalVariableNode lvar = nm.localVariables.get(lv);
                    if (lvar.desc.equals("Ljava/lang/Class;")) vt.add(lvar.index);
                }
            }
            AbstractInsnNode loadedclass_pos=null;
            for(int inst=0;inst<nm.instructions.size();inst++){
                AbstractInsnNode in=nm.instructions.get(inst);
                if(in instanceof VarInsnNode){
                    if(vt.contains(((VarInsnNode) in).var)&&in.getOpcode()==ALOAD){
                        loadedclass_pos=in;
                    }
                }else if(in instanceof MethodInsnNode){
                    MethodInsnNode mi=(MethodInsnNode) in;
                    if(in.getOpcode()>=INVOKEVIRTUAL&&in.getOpcode()<INVOKEDYNAMIC){
                        if(loadedclass_pos!=null&&mi.owner.equals("java/lang/Class")&&(mi.name.equals("getDeclaredMethod") || mi.name.equals("getMethod") || mi.name.equals("getField") || mi.name.equals("getDeclaredField"))){
                            AbstractInsnNode new_pos=nm.instructions.get(FindMethodStartPos(inst,nm.instructions,mi));
                            nm.instructions.insertBefore(loadedclass_pos,new TypeInsnNode(NEW,Type.getType(NMSClassUtil.class).getInternalName()));
                            nm.instructions.insertBefore(loadedclass_pos,new InsnNode(DUP));
                            MethodInsnNode newNMS=new MethodInsnNode(INVOKESPECIAL, Type.getType(NMSClassUtil.class).getInternalName(), "<init>", "(Ljava/lang/Class;Ljava/lang/Class;)V",false);
                            nm.instructions.insert(new_pos,newNMS);
                            nm.instructions.insertBefore(newNMS,new LdcInsnNode(Type.getObjectType(mLoader.getDescription().getMain().replace(".", "/"))));
                            mi.setOpcode(INVOKEVIRTUAL);
                            mi.owner=Type.getType(NMSClassUtil.class).getInternalName();
                            loadedclass_pos=null;
                            inst+=4;
                            logR("Remapped Class."+mi.name);
                        }else if(mi.getOpcode()==INVOKESTATIC&&mi.owner.equals("java/lang/Class")&&mi.name.equals("forName")){
                            if(mi.desc.equals("(Ljava/lang/String;)Ljava/lang/Class;")) {
                                nm.instructions.insertBefore(mi,new LdcInsnNode(Type.getObjectType(mLoader.getDescription().getMain().replace(".", "/"))));
                                mi.owner=Type.getType(NMSClassUtil.class).getInternalName();
                                mi.desc="(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;";
                                inst+=1;
                            }else{
                                nm.instructions.insertBefore(mi,new LdcInsnNode(Type.getObjectType(mLoader.getDescription().getMain().replace(".", "/"))));
                                mi.owner=Type.getType(NMSClassUtil.class).getInternalName();
                                mi.desc="(Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Class;";
                                inst+=1;
                            }
                            logR("Remapped Class.forName");
                        }else if(mi.desc.endsWith("Ljava/lang/Class;")&&loadedclass_pos==null){
                            loadedclass_pos=nm.instructions.get(FindMethodStartPos(inst,nm.instructions,mi));
                        }
                    }
                }else if(in instanceof LabelNode){
                    loadedclass_pos=null;
                }else if(in instanceof FieldInsnNode&&loadedclass_pos==null){
                    if(((FieldInsnNode) in).desc.equals("Ljava/lang/Class;")){
                        if(in.getOpcode()==GETFIELD){
                            loadedclass_pos=nm.instructions.get(inst-1);
                            if(loadedclass_pos instanceof MethodInsnNode){
                                loadedclass_pos=nm.instructions.get(FindMethodStartPos(inst-1,nm.instructions,(MethodInsnNode)loadedclass_pos));
                            }
                        }else if(in.getOpcode()==GETSTATIC) {
                            loadedclass_pos = in;
                        }
                        vt.add(((FieldInsnNode) in).owner+"."+((FieldInsnNode) in).name);
                    }
                }
            }
            for(Object v:vt){
                if(v instanceof String){
                    varTypes.add(v);
                }
            }
        }
        ClassWriter cw=new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        return cw.toByteArray();
    }

}
