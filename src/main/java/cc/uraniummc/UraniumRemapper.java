package cc.uraniummc;

import cc.uraniummc.util.NMSClassUtil;
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

    private void logR(String message) {
        if (debug) {
            System.out.println("[ReflectionRemapper] " + message);
        }
    }
    @SuppressWarnings("unchecked")
    private byte[] remapClassFile(ClassReader reader) {
        ClassNode cn=new ClassNode();
        reader.accept(cn, ClassReader.EXPAND_FRAMES);
        HashSet<Object> varTypes=new HashSet();
        for(int i=0;i<cn.methods.size();i++){
            MethodNode nm=cn.methods.get(i);
            if(nm.name.equals("<cinit>")){

            }
            String[] exceptions = new String[nm.exceptions.size()];
            nm.exceptions.toArray(exceptions);
            MethodNode mn=new MethodNode(ASM5,nm.access,nm.name,nm.desc,nm.signature,exceptions);
            MV mv=new MV(mn,nm.access,nm.name,nm.desc,varTypes);
            nm.accept(mv);
            /*
            for(int o=0;o<mn.instructions.size();o++){
                AbstractInsnNode insnN=mn.instructions.get(o);
                if(insnN instanceof TypeInsnNode){
                    if(insnN.getOpcode()==NEW&&((TypeInsnNode) insnN).desc.equals(Type.getType(NMSClassUtil.class).getInternalName())){
                        AbstractInsnNode LI=mn.instructions.get(o-1);
                        if(LI instanceof VarInsnNode){
                            if(LI.getOpcode()==ALOAD&&insnN.getNext().getOpcode()==DUP&&insnN.getNext().getNext().getOpcode()==GETFIELD){
                                mn.instructions.remove(LI);
                                mn.instructions.insert(insnN.getNext(),LI);
                                logR("output");
                            }
                        }
                    }
                }
            }
            */
            cn.methods.set(i,mn);
        }
        ClassWriter cw=new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        return cw.toByteArray();
    }
    class MV extends GeneratorAdapter{
        private int access;
        private String desc;
        public MV(MethodVisitor mv, int access, String name, String desc,HashSet types) {
            super(ASM5, mv,access,name,desc);
            this.access=access;
            this.desc=desc;
            this.varTypes=types;
            ga_list=new GeneratorAdapter(new MethodVisitor(ASM5) {
                @Override
                public void visitLdcInsn(Object cst) {
                    insnList.add(new LdcInsnNode(cst));
                }

                @Override
                public void visitIntInsn(int opcode, int operand) {
                    insnList.add(new IntInsnNode(opcode,operand));
                }

                @Override
                public void visitFieldInsn(int opcode, String owner, String name, String desc) {
                    insnList.add(new FieldInsnNode(opcode, owner, name, desc));
                }

                @Override
                public void visitInsn(int opcode) {
                    insnList.add(new InsnNode(opcode));
                }

                @Override
                public void visitIincInsn(int var, int increment) {
                    insnList.add(new IincInsnNode(var,increment));
                }

                @Override
                public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
                    insnList.add(new MethodInsnNode(opcode, owner, name, desc,itf));
                }

                @Override
                public void visitTypeInsn(int opcode, String type) {
                    insnList.add(new TypeInsnNode(opcode, type));
                }

                @Override
                public void visitVarInsn(int opcode, int var) {
                    insnList.add(new VarInsnNode(opcode, var));
                }

                @Override
                public void visitJumpInsn(int opcode, Label label) {
                    insnList.add(new JumpInsnNode(opcode,new LabelNode(label)));
                }

                @Override
                public void visitFrame(int type, int nLocal, Object[] local, int nStack, Object[] stack) {
                    insnList.add(new FrameNode(type,nLocal,local,nStack,stack));
                }

                @Override
                public void visitInvokeDynamicInsn(String name, String desc, Handle bsm, Object... bsmArgs) {
                    insnList.add(new InvokeDynamicInsnNode(name,desc,bsm,bsmArgs));
                }

                @Override
                public void visitLabel(Label label) {
                    insnList.add(new LabelNode(label));
                }

            }, this.access, "", desc);
        }
        public boolean inclass=false;
        public boolean inclassstart=false;
        public boolean ininclass=false;
        Object nvar=null;
        public int nvar_type;
        HashSet<Object> varTypes;
        boolean isicount=false;
        private LinkedList<Object> insnList=new LinkedList();
        private boolean remaped=false;
        private GeneratorAdapter ga_list;

        @Override
        public void visitLocalVariable(String name, String desc, String signature, Label start, Label end, int index) {
            mv.visitLocalVariable(name, desc, signature, start, end, index);
        }

        @Override
        public void visitTypeInsn(int opcode, String type) {
            MethodVisitor ga=inclassstart?ga_list:mv;
            ga.visitTypeInsn(opcode, type);
        }

        @Override
        public void visitIincInsn(int var, int increment) {
            MethodVisitor ga=inclassstart?ga_list:mv;
            ga.visitIincInsn(var,increment);
        }

        @Override
        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            GeneratorAdapter ga=inclassstart?ga_list:this;
            MethodVisitor gmv=inclassstart?ga_list:mv;
            if(opcode==INVOKESTATIC&&!inclassstart){
                if(owner.equals("java/lang/Class")){
                    if(name.equals("forName")){
                        if(desc.equals("(Ljava/lang/String;)Ljava/lang/Class;")) {
                            gmv.visitLdcInsn(Type.getObjectType(mLoader.getDescription().getMain().replace(".", "/")));
                            ga.invokeStatic(Type.getType(NMSClassUtil.class), new Method(name, "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;"));
                            if (inclassstart) {
                                ininclass = true;
                            } else {
                                inclass = true;
                            }
                            remaped = true;
                        }else{
                            gmv.visitLdcInsn(Type.getObjectType(mLoader.getDescription().getMain().replace(".", "/")));
                            ga.invokeStatic(Type.getType(NMSClassUtil.class), new Method(name, "(Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Class;"));
                            if (inclassstart) {
                                ininclass = true;
                            } else {
                                inclass = true;
                            }
                            remaped = true;
                        }
                        logR("Remapped Class.forName");
                        return;
                    }
                }else if(owner.equals("org/bukkit/Bukkit")){
                    if(name.equals("getName")){
                        /*
                        ga.dup();
                        ga.visitLdcInsn(Type.getObjectType(mLoader.getDescription().getMain().replace(".","/")));
                        ga.invokeStatic(Type.getType(NMSClassUtil.class),new Method("BgetName","(Ljava/lang/Class;)Ljava/lang/String;"));
                        logR("Remapped Bukkit.getName");
                        return;
                        */
                    }
                }
            }else if((opcode==INVOKEVIRTUAL||opcode==INVOKESTATIC||opcode==INVOKEINTERFACE)&&inclassstart){
                    if (owner.equals("java/lang/Class")&&(name.equals("getDeclaredMethod") || name.equals("getMethod") || name.equals("getField") || name.equals("getDeclaredField"))) {
                            newInstance(Type.getType(NMSClassUtil.class));
                            dup();
                            if(nvar instanceof Integer) {
                                mv.visitVarInsn(ALOAD, (Integer)nvar);
                            }else if(nvar instanceof String){
                                String[] nvars=((String) nvar).split("\\.");
                                mv.visitFieldInsn(nvar_type,nvars[0],nvars[1],"Ljava/lang/Class;");
                            }
                            mv.visitLdcInsn(Type.getObjectType(mLoader.getDescription().getMain().replace(".","/")));
                            mv.visitMethodInsn(INVOKESPECIAL, Type.getType(NMSClassUtil.class).getInternalName(), "<init>", "(Ljava/lang/Class;Ljava/lang/Class;)V",false);

                            for (Object node:insnList) {
                                if (node instanceof LdcInsnNode) {
                                    mv.visitLdcInsn(((LdcInsnNode) node).cst);
                                } else if (node instanceof IntInsnNode) {
                                    mv.visitIntInsn(((IntInsnNode) node).getOpcode(), ((IntInsnNode) node).operand);
                                } else if (node instanceof FieldInsnNode) {
                                    mv.visitFieldInsn(((FieldInsnNode) node).getOpcode(), ((FieldInsnNode) node).owner, ((FieldInsnNode) node).name, ((FieldInsnNode) node).desc);
                                } else if (node instanceof InsnNode) {
                                    mv.visitInsn(((InsnNode) node).getOpcode());
                                } else if (node instanceof MethodInsnNode){
                                    mv.visitMethodInsn(((MethodInsnNode) node).getOpcode(),((MethodInsnNode) node).owner,((MethodInsnNode) node).name,((MethodInsnNode) node).desc,((MethodInsnNode) node).itf);
                                } else if( node instanceof IincInsnNode){
                                    mv.visitIincInsn(((IincInsnNode) node).incr,((IincInsnNode) node).var);
                                } else if(node instanceof TypeInsnNode){
                                    mv.visitTypeInsn(((TypeInsnNode) node).getOpcode(),((TypeInsnNode) node).desc);
                                } else if(node instanceof VarInsnNode){
                                    mv.visitVarInsn(((VarInsnNode) node).getOpcode(),((VarInsnNode) node).var);
                                } else if(node instanceof JumpInsnNode){
                                    mv.visitJumpInsn(((JumpInsnNode) node).getOpcode(),((JumpInsnNode) node).label.getLabel());
                                } else if(node instanceof FrameNode){
                                    mv.visitFrame(((FrameNode) node).type,((FrameNode) node).local.size(),((FrameNode) node).local.toArray(),((FrameNode) node).stack.size(),((FrameNode) node).stack.toArray());
                                }else if(node instanceof InvokeDynamicInsnNode){
                                    mv.visitInvokeDynamicInsn(((InvokeDynamicInsnNode) node).name,((InvokeDynamicInsnNode) node).desc,((InvokeDynamicInsnNode) node).bsm,((InvokeDynamicInsnNode) node).bsmArgs);
                                }else if(node instanceof LabelNode){
                                    mv.visitLabel(((LabelNode) node).getLabel());
                                }
                            }
                            insnList.clear();
                            invokeVirtual(Type.getType(NMSClassUtil.class), new Method(name, desc));
                        } else {
                            if(nvar instanceof Integer) {
                                mv.visitVarInsn(ALOAD, (Integer)nvar);
                            }else if(nvar instanceof String){
                                String[] nvars=((String) nvar).split("\\.");
                                mv.visitFieldInsn(nvar_type,nvars[0],nvars[1],"Ljava/lang/Class;");
                            }
                            for (Object node:insnList){
                                if(node instanceof LdcInsnNode){
                                    mv.visitLdcInsn(((LdcInsnNode) node).cst);
                                }else if(node instanceof IntInsnNode){
                                    mv.visitIntInsn(((IntInsnNode) node).getOpcode(),((IntInsnNode) node).operand);
                                }else if(node instanceof FieldInsnNode){
                                    mv.visitFieldInsn(((FieldInsnNode) node).getOpcode(),((FieldInsnNode) node).owner,((FieldInsnNode) node).name,((FieldInsnNode) node).desc);
                                }else if(node instanceof InsnNode){
                                    mv.visitInsn(((InsnNode) node).getOpcode());
                                } else if (node instanceof MethodInsnNode){
                                    mv.visitMethodInsn(((MethodInsnNode) node).getOpcode(),((MethodInsnNode) node).owner,((MethodInsnNode) node).name,((MethodInsnNode) node).desc,((MethodInsnNode) node).itf);
                                } else if( node instanceof IincInsnNode){
                                    mv.visitIincInsn(((IincInsnNode) node).incr,((IincInsnNode) node).var);
                                } else if(node instanceof TypeInsnNode){
                                    mv.visitTypeInsn(((TypeInsnNode) node).getOpcode(),((TypeInsnNode) node).desc);
                                }else if(node instanceof VarInsnNode){
                                    mv.visitVarInsn(((VarInsnNode) node).getOpcode(),((VarInsnNode) node).var);
                                } else if(node instanceof JumpInsnNode){
                                    mv.visitJumpInsn(((JumpInsnNode) node).getOpcode(),((JumpInsnNode) node).label.getLabel());
                                } else if(node instanceof FrameNode){
                                    mv.visitFrame(((FrameNode) node).type,((FrameNode) node).local.size(),((FrameNode) node).local.toArray(),((FrameNode) node).stack.size(),((FrameNode) node).stack.toArray());
                                }else if(node instanceof InvokeDynamicInsnNode){
                                    mv.visitInvokeDynamicInsn(((InvokeDynamicInsnNode) node).name,((InvokeDynamicInsnNode) node).desc,((InvokeDynamicInsnNode) node).bsm,((InvokeDynamicInsnNode) node).bsmArgs);
                                }else if(node instanceof LabelNode){
                                    mv.visitLabel(((LabelNode) node).getLabel());
                                }
                            }
                            insnList.clear();
                            mv.visitMethodInsn(opcode, owner, name, desc,itf);
                        }
                        logR("Remapped Class."+name);
                        inclassstart=false;
                        return;
            }
            if(inclassstart){
                ga.visitMethodInsn(opcode,owner,name,desc,itf);
            }else {
                mv.visitMethodInsn(opcode, owner, name, desc,itf);
            }
        }

        @Override
        public void visitInvokeDynamicInsn(String name, String desc, Handle bsm, Object... bsmArgs) {
            MethodVisitor ga=inclassstart?ga_list:mv;
            ga.visitInvokeDynamicInsn(name,desc,bsm,bsmArgs);
        }

        @Override
        public void visitFieldInsn(int opcode, String owner, String name, String desc) {
            GeneratorAdapter ga=inclassstart?ga_list:this;
            if(opcode==PUTSTATIC||opcode==PUTFIELD){
                if (inclass&&!inclassstart) {
                    varTypes.add(owner+"."+name);
                    inclass=false;
                }else if(ininclass&&!inclass&&inclassstart){
                    varTypes.add(owner+"."+name);
                    ininclass=false;
                }
            }else if(opcode==GETSTATIC||opcode==GETFIELD){
                if(!inclassstart&&varTypes.contains(owner+"."+name)) {
                    inclassstart=true;
                    nvar = owner+"."+name;
                    nvar_type=opcode;
                    return;
                }
            }
            if(inclassstart){
                ga.visitFieldInsn(opcode,owner,name,desc);
            }else {
                mv.visitFieldInsn(opcode, owner, name, desc);
            }
        }

        @Override
        public void visitLabel(Label label) {
            super.visitLabel(label);
            inclass=false;
            ininclass=false;
            inclassstart=false;
        }

        @Override
        public void visitInsn(int opcode) {
            MethodVisitor ga=inclassstart?ga_list:mv;
            ga.visitInsn(opcode);
        }

        @Override
        public void visitLdcInsn(Object cst) {
            MethodVisitor ga=inclassstart?ga_list:mv;
            ga.visitLdcInsn(cst);
        }
        boolean hasT=false;
        int lastTArg=-1;
        @Override
        public void visitVarInsn(int opcode, int var) {
            MethodVisitor ga=inclassstart?ga_list:mv;
            if(opcode==Opcodes.ASTORE) {
                if (inclass) {
                    varTypes.add(var);
                    inclass=false;
                }
            }else if(opcode==Opcodes.ALOAD){
                if(!inclassstart&&varTypes.contains(var)) {
                    inclassstart=true;
                    nvar = new Integer(var);
                    return;
                }
            }
            ga.visitVarInsn(opcode, var);
        }

        @Override
        public void visitEnd() {
            for(Object obj:(HashSet)varTypes.clone()){
                if(obj instanceof Integer){
                    varTypes.remove(obj);
                }
            }
            super.visitEnd();
        }
    }
}
