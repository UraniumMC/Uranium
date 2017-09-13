package cc.uraniummc;

import cc.uraniummc.util.NMSClassUtil;
import net.md_5.specialsource.RemappingClassAdapter;
import net.md_5.specialsource.SpecialSource;
import net.md_5.specialsource.repo.ClassRepo;
import org.bukkit.plugin.java.PluginClassLoader;

import net.md_5.specialsource.JarMapping;
import net.md_5.specialsource.JarRemapper;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.ClassNode;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import static org.objectweb.asm.ClassWriter.COMPUTE_MAXS;

public class UraniumRemapper extends JarRemapper implements Opcodes{
    protected final PluginClassLoader mLoader;
    private int writerFlags = COMPUTE_MAXS;
    private int readerFlags = 0;

    public UraniumRemapper(JarMapping jarMapping,PluginClassLoader pPluginClassLoader){
        super(jarMapping);

        this.mLoader=pPluginClassLoader;
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
        return remapClassFile(new ClassReader(super.remapClassFile(is, repo)));
    }

    public byte[] remapClassFile(byte[] in, ClassRepo repo) {
        return remapClassFile(new ClassReader(super.remapClassFile(in, repo)));
    }

    @SuppressWarnings("unchecked")
    private byte[] remapClassFile(ClassReader reader) {
        ClassWriter cw=new ClassWriter(writerFlags);
        CV cv = new CV(cw);
        reader.accept(cv,readerFlags);
        return cw.toByteArray();
    }
    class CV extends ClassVisitor{
        public CV(ClassVisitor cv) {
            super(ASM5,cv);
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
            MethodVisitor mv= super.visitMethod(access, name, desc, signature, exceptions);
            return new MV(mv,access,name,desc);
        }
    }
    enum nowt{
        none,Class
    }
    class MV extends GeneratorAdapter {
        public MV(MethodVisitor mv, int access, String name, String desc) {
            super(ASM5, mv,access,name,desc);
        }
        nowt now=nowt.none;
        int nvar=0;
        Object ldcobj="";
        HashMap<Integer,nowt> varTypes=new HashMap();
        @Override
        public void visitFieldInsn(int opcode, String owner, String name, String desc) {
            if(opcode==INVOKESTATIC){
                if(owner.equals("java/lang/Class")){
                    if(name.equals("forName")){
                        invokeStatic(Type.getType(NMSClassUtil.class),new Method(name,desc));
                        now=nowt.Class;
                        return;
                    }
                }
            }else if(opcode==INVOKEVIRTUAL){
                if(now!=nowt.none) {
                    if (owner.equals("java/lang/Class")) {
                        if (name.equals("forName") || name.equals("getDeclaredMethod") || name.equals("getMethod") || name.equals("getField") || name.equals("getDeclaredField")) {
                            newInstance(Type.getType(NMSClassUtil.class));
                            dup();
                            super.visitVarInsn(ALOAD, nvar);
                            super.visitFieldInsn(INVOKESPECIAL, Type.getType(NMSClassUtil.class).getInternalName(), "<init>", "((Ljava/lang/Class;)V)");
                            super.visitLdcInsn(ldcobj);
                            invokeVirtual(Type.getType(NMSClassUtil.class), new Method(name, desc));
                        } else {
                            super.visitVarInsn(ALOAD, nvar);
                            super.visitLdcInsn(ldcobj);
                            super.visitFieldInsn(opcode, owner, name, desc);
                        }
                        now = nowt.none;
                        return;
                    }
                }
            }
            super.visitFieldInsn(opcode, owner, name, desc);
        }

        @Override
        public void visitInsn(int opcode) {
            if(opcode==Opcodes.POP){
                now=nowt.none;
            }
            super.visitInsn(opcode);
        }

        @Override
        public void visitLdcInsn(Object cst) {
            if(now == nowt.none){
                super.visitLdcInsn(cst);
            }else{
                ldcobj=cst;
            }
        }

        @Override
        public void visitVarInsn(int opcode, int var) {
            if(opcode==Opcodes.ASTORE) {
                if (now != nowt.none) {
                    varTypes.put(var,now);
                    now = nowt.none;
                }
            }else if(opcode==Opcodes.ALOAD){
                nowt vt=varTypes.get(var);
                switch (vt){
                    case Class:
                        now=nowt.Class;
                        nvar=var;
                        return;
                }
            }
            super.visitVarInsn(opcode,var);
        }
    }
}
