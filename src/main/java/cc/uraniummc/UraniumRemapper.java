package cc.uraniummc;

import static org.objectweb.asm.ClassWriter.COMPUTE_MAXS;

import java.io.IOException;
import java.io.InputStream;

import org.bukkit.plugin.java.PluginClassLoader;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import cc.uraniummc.util.NMSClassUtil;
import lombok.Setter;
import net.md_5.specialsource.JarMapping;
import net.md_5.specialsource.JarRemapper;
import net.md_5.specialsource.repo.ClassRepo;

public class UraniumRemapper extends JarRemapper implements Opcodes{

    protected final PluginClassLoader mLoader;
    private int writerFlags=COMPUTE_MAXS;
    private int readerFlags=0;
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
    public byte[] remapClassFile(InputStream is,ClassRepo repo) throws IOException{
        return RemapReflection?remapClassFile(new ClassReader(super.remapClassFile(is,repo))):super.remapClassFile(is,repo);
    }

    public byte[] remapClassFile(byte[] in,ClassRepo repo){
        return RemapReflection?remapClassFile(new ClassReader(super.remapClassFile(in,repo))):super.remapClassFile(in,repo);
    }

    private void logR(String message){
        if(debug){
            System.out.println("[ReflectionRemapper] "+message);
        }
    }

    @SuppressWarnings("unchecked")
    private byte[] remapClassFile(ClassReader pCReader){
        ClassNode tCNode=new ClassNode();
        pCReader.accept(tCNode,ClassReader.EXPAND_FRAMES);
        for(int i=0;i<tCNode.methods.size();i++){
            MethodNode tMNode=tCNode.methods.get(i);
            for(int j=0;j<tMNode.instructions.size();j++){
                AbstractInsnNode tInsnNode=tMNode.instructions.get(j);
                if(tInsnNode instanceof MethodInsnNode&&(tInsnNode.getOpcode()>=INVOKEVIRTUAL&&tInsnNode.getOpcode()<INVOKEDYNAMIC)){
                    MethodInsnNode mi=(MethodInsnNode)tInsnNode;
                    if(mi.owner.equals("java/lang/Class")&&(mi.name.equals("getDeclaredMethod")||
                            mi.name.equals("getMethod")||
                            mi.name.equals("getField")||
                            mi.name.equals("getDeclaredField"))){
                        mi.setOpcode(INVOKESTATIC);
                        mi.owner=Type.getType(NMSClassUtil.class).getInternalName();
                        tMNode.instructions.insertBefore(mi,new LdcInsnNode(Type.getObjectType(mLoader.getDescription().getMain().replace(".","/"))));
                        int tIndex=mi.desc.indexOf(')');
                        mi.desc="(Ljava/lang/Class;"+(mi.desc.substring(1,tIndex))+"Ljava/lang/Class;"+(mi.desc.substring(tIndex));
                    }else if(mi.getOpcode()==INVOKESTATIC&&mi.owner.equals("java/lang/Class")&&mi.name.equals("forName")){
                        tMNode.instructions.insertBefore(mi,new LdcInsnNode(Type.getObjectType(mLoader.getDescription().getMain().replace(".","/"))));
                        mi.owner=Type.getType(NMSClassUtil.class).getInternalName();
                        int tIndex=mi.desc.indexOf(')');
                        mi.desc=mi.desc.substring(0,tIndex)+"Ljava/lang/Class;"+(mi.desc.substring(tIndex));
                    }
                }
            }
        }
        ClassWriter cw=new ClassWriter(ClassWriter.COMPUTE_MAXS);
        tCNode.accept(cw);
        return cw.toByteArray();
    }

}
