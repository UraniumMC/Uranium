package cc.uraniummc.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLClassLoader;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.PluginClassLoader;

import net.minecraft.server.MinecraftServer;
import sun.reflect.CallerSensitive;

public class NMSClassUtil{

    private final Class<?> mClass;
    private final URLClassLoader mCL;

    public NMSClassUtil(Class<?> pClass,Class<?> pPClass){
        this.mClass=pClass;
        mCL=(URLClassLoader)pPClass.getClassLoader();
    }

    public static String BgetName(Class<?> pPClass){
        URLClassLoader mCL=(URLClassLoader)pPClass.getClassLoader();
        if(mCL instanceof PluginClassLoader){
            String sname;
            sname=MinecraftServer.uraniumConfig.getString("plugin-settings."+((PluginClassLoader)mCL).getDescription().getName()+".custom-server-name","");
            if(sname!=null&&!sname.isEmpty()){
                return sname;
            }
        }
        return Bukkit.getServerName();
    }

    @CallerSensitive
    public static Class<?> forName(String pClassName,Class<?> pClass) throws ClassNotFoundException{
        return forName0(pClass,pClassName,true,pClass.getClassLoader());
    }

    @CallerSensitive
    public static Class<?> forName(String pClassName,boolean pInit,ClassLoader pLoader,Class<?> pClass) throws ClassNotFoundException{
        return forName0(pClass,pClassName,pInit,pLoader);
    }

    @CallerSensitive
    private static Class<?> forName0(Class<?> pClass,String pClassName,boolean pInit,ClassLoader pLoader) throws ClassNotFoundException{
        URLClassLoader mCL=(URLClassLoader)pClass.getClassLoader();
        if(mCL instanceof PluginClassLoader){
            pClassName=((PluginClassLoader)mCL).umcl.remapClass(pClassName).replace("/",".");
        }
        return Class.forName(pClassName,pInit,pLoader==null?pClass.getClassLoader():pLoader);
    }

    @CallerSensitive
    public static Method getMethod(Class<?> pOwnClazz,String pMethodName,Class<?>[] pParamTypes,Class<?> pCaller) throws NoSuchMethodException,SecurityException{
        if(pCaller.getClassLoader() instanceof PluginClassLoader){
            pMethodName=((PluginClassLoader)pCaller.getClassLoader()).umcl.remapMethod(pOwnClazz,pMethodName,pParamTypes);
        }
        return pOwnClazz.getMethod(pMethodName,pParamTypes);
    }

    @CallerSensitive
    public static Method getDeclaredMethod(Class<?> pOwnClazz,String pMethodName,Class<?>[] pParamTypes,Class<?> pCaller) throws NoSuchMethodException,SecurityException{
        if(pCaller.getClassLoader() instanceof PluginClassLoader){
            pMethodName=((PluginClassLoader)pCaller.getClassLoader()).umcl.remapMethod(pOwnClazz,pMethodName,pParamTypes);
        }
        return pOwnClazz.getDeclaredMethod(pMethodName,pParamTypes);
    }

    @CallerSensitive
    public static Field getField(Class<?> pOwnClazz,String pFieldName,Class<?> pCaller) throws NoSuchFieldException,SecurityException{
        if(pCaller.getClassLoader() instanceof PluginClassLoader){
            pFieldName=((PluginClassLoader)pCaller.getClassLoader()).umcl.remapField(pOwnClazz,pFieldName);
        }
        return pOwnClazz.getField(pFieldName);
    }

    @CallerSensitive
    public static Field getDeclaredField(Class<?> pOwnClazz,String pFieldName,Class<?> pCaller) throws NoSuchFieldException,SecurityException{
        if(pCaller.getClassLoader() instanceof PluginClassLoader){
            pFieldName=((PluginClassLoader)pCaller.getClassLoader()).umcl.remapField(pOwnClazz,pFieldName);
        }
        return pOwnClazz.getDeclaredField(pFieldName);
    }

}
