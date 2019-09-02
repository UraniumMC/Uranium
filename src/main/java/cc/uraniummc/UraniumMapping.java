package cc.uraniummc;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.Type;

import cc.uraniummc.util.ReflectUtil;
import lombok.Getter;
import net.md_5.specialsource.InheritanceMap;
import net.md_5.specialsource.JarComparer;
import net.md_5.specialsource.JarMapping;
import net.md_5.specialsource.provider.InheritanceProvider;

public class UraniumMapping extends JarMapping{

    /**
     * key = mcp class name<br />
     * value= cb class name
     */
    @Getter
    private Map<String,String> mRclasses=new HashMap<String,String>();
    @Getter
    /**bukkit_class_name/bukkit_method_name (forge_class_name) ->  forge_method_name*/
    private Map<String,String> mMethodsNR=new HashMap<String,String>();
    @Getter
    /**forge_class_name/bukkit_method_name (forge_class_name)forge_class_name ->  forge_method_name*/
    private Map<String,String> mMethodsExtends=new HashMap<String, String>();
    @Getter
    /**forge_class_name/forge_method_name (forge_class_name)forge_class_name ->  bukkit_method_name*/
    private Map<String,String> mReverseMethods=new HashMap<String, String>();
    @Getter
    private InheritanceMap inheritanceMap;
    @Getter
    private InheritanceProvider fallbackInheritanceProvider;

    public UraniumMapping(){
        super();
    }

    public UraniumMapping(JarComparer oldJar,JarComparer newJar,File logFile,boolean compact) throws IOException{
        super(oldJar,newJar,logFile,compact);
    }

    public UraniumMapping(JarComparer oldJar,JarComparer newJar,File logfile,boolean compact,boolean full) throws IOException{
        super(oldJar,newJar,logfile,compact,full);
    }

    @Override
    public void loadMappings(String filename,boolean reverse,boolean numericSrgNames,String inShadeRelocation,String outShadeRelocation) throws IOException{
        super.loadMappings(filename,reverse,numericSrgNames,inShadeRelocation,outShadeRelocation);
    }

    @Override
    public void loadMappings(File file) throws IOException{
        super.loadMappings(file);
    }

    public void setInheritanceMap(InheritanceMap inheritanceMap){
        this.inheritanceMap=inheritanceMap;
        super.setInheritanceMap(inheritanceMap);
    }

    public void setFallbackInheritanceProvider(InheritanceProvider fallbackInheritanceProvider){
        this.fallbackInheritanceProvider=fallbackInheritanceProvider;
        super.setFallbackInheritanceProvider(fallbackInheritanceProvider);
    }

    public void loadRClasses(){
        for(Map.Entry<String,String> CLASS : classes.entrySet()){
            if(!CLASS.getKey().startsWith("net/minecraft/server/v1_7_R4")){
                continue;
            }
            mRclasses.put(CLASS.getValue(),CLASS.getKey());
        }
    }
    
    /**
     * 依据指定的map,映射方法或字段
     * @param pRemap 映射依据
     * @param pOwner 字段或方法的所有者,与pDescHead构成key进行查找
     * @param pDef 默认字段或方法
     * @param pDescHead 签名
     * @param pDeclared
     * @return
     */
    public String remapFieldOrMethod(Map<String, String> pRemap,String pOwner,String pDef,String pDescHead,boolean pDeclared){
        if(pOwner==null) return pDef;
        String tDesc=pOwner+"/"+pDescHead;
        String newmethod=pRemap.get(tDesc);
        if(newmethod!=null){
            return newmethod;
        }else{
            Collection<String> parents=null;;
            if(this.inheritanceMap.hasParents(pOwner)){
                parents=this.inheritanceMap.getParents(pOwner);
            }else if(this.fallbackInheritanceProvider!=null){
                parents=this.fallbackInheritanceProvider.getParents(pOwner);
                this.inheritanceMap.setParents(pOwner,parents);
            }

            if(parents!=null){
                for(String parent : parents){
                    newmethod=remapFieldOrMethod(pRemap,parent,pDef,pDescHead,pDeclared);
                    if(newmethod!=null){
                        return newmethod;
                    }
                }
            }
        }
        return pDef;
    }

    public String remapExtendsMethod(String pOwner,String pName,String pParamDescWithName,boolean pDeclared){
        return this.remapFieldOrMethod(this.mMethodsExtends,pOwner,pName,pParamDescWithName,pDeclared);
    }

    /**
     * 将Forge类型的方法名字映射为Bukkit类型方法名
     * @param pMethod Forge类型方法
     * @return Bukkit类型方法名字
     */
    public String reverseMapMethod(Method pMethod){
        String tClazz = pMethod.getDeclaringClass().getName();
        if(tClazz.equals(this.reverseMapClass(tClazz))) return pMethod.getName();

        return this.remapFieldOrMethod(this.mReverseMethods, pMethod.getDeclaringClass().getName().replace('.', '/')
                , pMethod.getName(), pMethod.getName()+" "+Type.getMethodDescriptor(pMethod), true);
    }
    
    /**
     * 将Bukkit类型方法的名字映射为Forge类型的方法名
     * @param pClass Forge类型
     * @param pName Bukkit类型方法名字
     * @param pParamTypes Forge类型参数
     * @param pDeclared 
     * @return Forge类型的方法名
     */
    public String remapMethod(Class<?> pClass,String pName, Class<?>[] pParamTypes,boolean pDeclared){
        String tOwner = this.reverseMapClass(pClass);
        if (tOwner.equals(pClass.getName())) return pName;

        StringBuilder tDesc = new StringBuilder(pName + " (");
        if (pParamTypes != null && pParamTypes.length > 0) {
            for (Class<?> type : pParamTypes) {
                tDesc.append(Type.getType(type).getDescriptor());
            }
        }
        tDesc.append(")");
        return this.remapFieldOrMethod(this.mMethodsNR,tOwner,pName,tDesc.toString(),pDeclared);
    }

    /**
     * 将Bukkit类型的字段名字映射为Forge类型的字段名字
     * @param pClass Forge类型
     * @param pName Bukkit类型的字段名字
     * @param pDeclared
     * @return Forge类型的字段名字
     */
    public String remapField(Class<?> pClass, String pName, boolean pDeclared){
        String tOwner = this.reverseMapClass(pClass);
        if (tOwner.equals(pClass.getName())) return pName;

        return this.remapFieldOrMethod(this.fields,tOwner,pName,pName,pDeclared);
    }

    /**
     * 反向Map,Forge 类型,重映射到Bukkit类型
     * @param pClazz Forge类型
     * @return Bukkit类型,非null
     */
    public String reverseMapClass(Class pClazz){
        return reverseMapClass(pClazz.getName());
    }

    /**
     * 反向Map,Forge 类型,重映射到Bukkit类型
     * @param pClazz Forge类型,可以使用.名称
     * @return Bukkit类型,非null
     */
    public String reverseMapClass(String pClazz) {
        String tStr = this.mRclasses.get(pClazz.replace('.', '/'));
        return tStr == null ? pClazz : tStr;
    }

    public void loadMethodsNR(){
        for(Map.Entry<String,String> METHOD : methods.entrySet()){
            if(!METHOD.getKey().startsWith("net/minecraft/server")){
                continue;
            }
            String[] key=METHOD.getKey().split(" ");
            boolean obj=false;
            StringBuilder newkey=new StringBuilder(" ");
            StringBuilder obj_name=new StringBuilder();
            for(char i : key[1].toCharArray()){
                if(i=='L'){
                    obj=true;
                }else if(obj){
                    if(i==';'){
                        String newclass=classes.get(obj_name.toString());
                        newkey.append(newclass==null?obj_name.toString():newclass).append(";");
                        obj_name.delete(0,obj_name.length());
                        obj=false;
                        continue;
                    }
                    obj_name.append(i);
                    continue;
                }
                newkey.append(i);
            }

            String tMCPDesc = newkey.toString();
            int class_end = key[0].lastIndexOf('/');

            String tCBClazz = key[0].substring(0, class_end);
            String tMCPClazz = classes.get(tCBClazz);
            if (tMCPClazz == null) tMCPClazz = tCBClazz;
            mReverseMethods.put(tMCPClazz + "/" + METHOD.getValue() + tMCPDesc, key[0].substring(class_end + 1));
            mMethodsExtends.put(tMCPClazz + key[0].substring(class_end) + tMCPDesc, METHOD.getValue());
            if (METHOD.getKey().startsWith("net/minecraft/server/v1_7_R4")) {
                int args_end = tMCPDesc.lastIndexOf(')') + 1;
                if (args_end != -1) {
                    String tParamMCPDesc = tMCPDesc.substring(0, args_end);
                    mMethodsNR.put(key[0] + tParamMCPDesc, METHOD.getValue());
                }
            }
        }
    }
    
    public UraniumMapping doCopy() {
        UraniumMapping tNew = new UraniumMapping();

        tNew.mMethodsNR = this.mMethodsNR;
        tNew.mRclasses = this.mRclasses;
        tNew.mMethodsExtends = this.mMethodsExtends;

        ReflectUtil.setFinalFieldValue(Jarmapping_packages, tNew, this.packages);
        ReflectUtil.setFinalFieldValue(Jarmapping_classes, tNew, this.classes);
        ReflectUtil.setFinalFieldValue(Jarmapping_fields, tNew, this.fields);
        ReflectUtil.setFinalFieldValue(Jarmapping_methods, tNew, this.methods);

        return tNew;
    }

    public static final Field Jarmapping_packages;
    public static final Field Jarmapping_classes;
    public static final Field Jarmapping_fields;
    public static final Field Jarmapping_methods;

    public static final Logger log = LogManager.getLogger("Uranium");

    static {
        Jarmapping_packages = ReflectUtil.getField(JarMapping.class, "packages", true);
        Jarmapping_classes = ReflectUtil.getField(JarMapping.class, "classes", true);
        Jarmapping_fields = ReflectUtil.getField(JarMapping.class, "fields", true);
        Jarmapping_methods = ReflectUtil.getField(JarMapping.class, "methods", true);
    }

}
