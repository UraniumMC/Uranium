package cc.uraniummc;

import static org.objectweb.asm.ClassWriter.COMPUTE_MAXS;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.bukkit.plugin.java.PluginClassLoader;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import cc.uraniummc.util.NMSClassUtil;
import lombok.Setter;
import net.md_5.specialsource.JarRemapper;
import net.md_5.specialsource.repo.ClassRepo;

public class UraniumRemapper extends JarRemapper implements Opcodes {

    protected final PluginClassLoader mLoader;
    private int writerFlags = COMPUTE_MAXS;
    private int readerFlags = 0;
    @Setter
    private boolean debug = false;
    private UraniumMapping fUmap;
    private boolean remapReflection = false;

    public UraniumRemapper(UraniumMapping jarMapping, PluginClassLoader pPluginClassLoader) {
        super(jarMapping);
        this.fUmap = jarMapping;
        this.mLoader = pPluginClassLoader;
    }

    public UraniumRemapper(UraniumMapping jarMapping, PluginClassLoader pPluginClassLoader, boolean reflection) {
        this(jarMapping, pPluginClassLoader);
        this.remapReflection = reflection;
    }

    @Override
    public String mapSignature(String signature, boolean typeSignature) {
        try {
            return super.mapSignature(signature, typeSignature);
        } catch (Exception e) {
            return signature;
        }
    }

    @Override
    public String map(String typeName) {
        // not remap class that exist in jar file
        // this mean plugin use it's owner lib 
        return this.mLoader.findResource(typeName.replace('.', '/').concat(".class")) != null ? typeName : super.map(typeName);
    }

    /**
     * Remap an individual class given an InputStream to its bytecode
     */
    public byte[] remapClassFile(InputStream is, ClassRepo repo) throws IOException {
        byte[] remapped = super.remapClassFile(is, repo);
        return remapReflection ? remapClassFile2(new ClassReader(remapped)) : remapped;
    }

    public byte[] remapClassFile(byte[] in, ClassRepo repo) {
        byte[] remapped = super.remapClassFile(in, repo);
        return remapReflection ? remapClassFile2(new ClassReader(remapped)) : remapped;
    }

    private void logR(String message) {
        if (debug) {
            System.out.println("[ReflectionRemapper] " + message);
        }
    }

    @SuppressWarnings("unchecked")
    private byte[] remapClassFile2(ClassReader pCReader){
        ClassNode tCNode=new ClassNode();
        pCReader.accept(tCNode,ClassReader.EXPAND_FRAMES);

        for (int i = 0; i < tCNode.methods.size(); i++) {
            MethodNode tMNode = tCNode.methods.get(i);
            for (int j = 0; j < tMNode.instructions.size(); j++) {
                AbstractInsnNode tInsnNode = tMNode.instructions.get(j);
                if (tInsnNode instanceof MethodInsnNode && (tInsnNode.getOpcode() >= INVOKEVIRTUAL && tInsnNode.getOpcode() < INVOKEDYNAMIC)) {

                    MethodInsnNode mi = (MethodInsnNode) tInsnNode;
                    if (mi.owner.equals("java/lang/Class") && (mi.name.equals("getDeclaredMethod") ||
                            mi.name.equals("getMethod") ||
                            mi.name.equals("getField") ||
                            mi.name.equals("getDeclaredField"))) {
                        mi.setOpcode(INVOKESTATIC);
                        mi.owner = Type.getType(NMSClassUtil.class).getInternalName();
                        tMNode.instructions.insertBefore(mi, new LdcInsnNode(Type.getObjectType(mLoader.getDescription().getMain().replace(".", "/"))));
                        j++;
                        int tIndex = mi.desc.indexOf(')');
                        mi.desc = "(Ljava/lang/Class;" + (mi.desc.substring(1, tIndex)) + "Ljava/lang/Class;" + (mi.desc.substring(tIndex));
                    } else if (mi.getOpcode() == INVOKESTATIC && mi.owner.equals("java/lang/Class") && mi.name.equals("forName")) {
                        tMNode.instructions.insertBefore(mi, new LdcInsnNode(Type.getObjectType(mLoader.getDescription().getMain().replace(".", "/"))));
                        j++;
                        mi.owner = Type.getType(NMSClassUtil.class).getInternalName();
                        int tIndex = mi.desc.indexOf(')');
                        mi.desc = mi.desc.substring(0, tIndex) + "Ljava/lang/Class;" + (mi.desc.substring(tIndex));
                    } else if (mi.owner.equals("java/lang/ClassLoader") && mi.name.equals("loadClass")){
                        boolean tBooleanArgs=mi.desc.contains("Z)");
                        if(tBooleanArgs){
                            tMNode.instructions.insertBefore(mi,new InsnNode(Opcodes.SWAP));
                            j++;
                        }

                        tMNode.instructions.insertBefore(mi, new LdcInsnNode(Type.getObjectType(mLoader.getDescription().getMain().replace(".", "/"))));
                        tMNode.instructions.insertBefore(mi, new MethodInsnNode(INVOKESTATIC, 
                                Type.getType(NMSClassUtil.class).getInternalName(),
                                "remapClass", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;",false));
                        
                        if(tBooleanArgs){
                            tMNode.instructions.insertBefore(mi,new InsnNode(Opcodes.SWAP));
                            j++;
                        }
                        j+=2;
                    }
                }
            }
        }

        // create method in child class witch is interface method and instance at super class
        ArrayList<String> tSelfMethods = new ArrayList<String>();
        if (!Modifier.isInterface(tCNode.access)) {
            for (MethodNode sMethod : tCNode.methods) {
                tSelfMethods.add(sMethod.name+sMethod.desc);
            }
        }

        ArrayList<Method> tInterfaceMethods = new ArrayList<Method>();
        Class tInterface = null;
        if(!tSelfMethods.isEmpty()){
            ArrayList<String> tAdded = new ArrayList<String>();
            for (String sInteface : tCNode.interfaces) {
                if(!sInteface.startsWith("net/minecraft")) continue;
                try {
                    tInterface = mLoader.findClass(sInteface.replace('/', '.'));
                    for (Method sMethod : tInterface.getMethods()) {
                        String tDesc = sMethod.getName()+Type.getMethodDescriptor(sMethod);
                        if(!tSelfMethods.contains(tDesc)&&tAdded.add(tDesc))
                            tInterfaceMethods.add(sMethod);
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        if(!tInterfaceMethods.isEmpty()){
            for(Method sMethod : tInterfaceMethods){
                String tCBMName = this.fUmap.reverseMapMethod(sMethod);
                String tSuperClazzStr = tCNode.superName.replace('/', '.');
                Method tFound = null;
                try {
                    Class tSuperClass = mLoader.findClass(tSuperClazzStr);
                    tFound = tSuperClass.getMethod(tCBMName, sMethod.getParameterTypes());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException ignore) {

                } catch (SecurityException e) {
                    e.printStackTrace();
                }

                if(tFound != null){
                    String[] tExps=new String[sMethod.getExceptionTypes().length];
                    int i=0;
                    for(Class sClazz : sMethod.getExceptionTypes()) tExps[i++]=Type.getInternalName(sClazz);
                    MethodVisitor tMV = tCNode.visitMethod(tFound.getModifiers(), sMethod.getName()
                            , Type.getMethodDescriptor(sMethod), null, tExps);

                    tMV.visitCode();
                    tMV.visitVarInsn(ALOAD, 0);
                    for(int j=0;j<tFound.getParameterCount();j++){
                        tMV.visitVarInsn(Type.getType(tFound.getParameterTypes()[j]).getOpcode(Opcodes.ILOAD), j+1);
                    }
                    tMV.visitMethodInsn(Opcodes.INVOKEVIRTUAL, tCNode.name, tFound.getName(), Type.getMethodDescriptor(tFound), false);
                    tMV.visitInsn(Type.getType(tFound.getReturnType()).getOpcode(Opcodes.IRETURN));
                    tMV.visitEnd();

                    tCNode.visitEnd();
                }
            }
        }

        ClassWriter cw=new ClassWriter(ClassWriter.COMPUTE_MAXS);
        tCNode.accept(cw);
        byte[] tData = cw.toByteArray();
        if (Boolean.getBoolean("CC_DEBUG")) {
            try {
                FileUtils.writeByteArrayToFile(new File("tmp/" + tCNode.name + ".class"), tData, false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tData;
    }

}
