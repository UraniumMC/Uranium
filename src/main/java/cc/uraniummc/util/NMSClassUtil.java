package cc.uraniummc.util;

import org.bukkit.plugin.java.PluginClassLoader;
import sun.reflect.CallerSensitive;
import sun.reflect.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class NMSClassUtil {
    private final Class mClass;
    public NMSClassUtil(Class pClass){
        this.mClass=pClass;
    }
    @CallerSensitive
    public static Class<?> forName(String className)
            throws ClassNotFoundException {
        ClassLoader mCL=Thread.currentThread().getContextClassLoader();
        if(mCL instanceof PluginClassLoader){
            return Class.forName(((PluginClassLoader) mCL).umcl.remapClass(className));
        }
        return Class.forName(className);
    }
    @CallerSensitive
    public Method getDeclaredMethod(String name, Class<?>... parameterTypes)
            throws NoSuchMethodException, SecurityException {
        ClassLoader mCL=Thread.currentThread().getContextClassLoader();
        if(mCL instanceof PluginClassLoader) {
            String newName = ((PluginClassLoader) mCL).umcl.remapMethod(mClass,name,parameterTypes);
            return mClass.getDeclaredMethod(newName,parameterTypes);
        }
        return mClass.getDeclaredMethod(name,parameterTypes);
    }

    @CallerSensitive
    public Method getMethod(String name, Class<?>... parameterTypes)
            throws NoSuchMethodException, SecurityException {
        ClassLoader mCL=Thread.currentThread().getContextClassLoader();
        if(mCL instanceof PluginClassLoader) {
            String newName = ((PluginClassLoader) mCL).umcl.remapMethod(mClass,name,parameterTypes);
            return mClass.getMethod(newName,parameterTypes);
        }
        return mClass.getMethod(name,parameterTypes);
    }

    @CallerSensitive
    public Field getField(String name)
            throws NoSuchFieldException, SecurityException {
        ClassLoader mCL=Thread.currentThread().getContextClassLoader();
        if(mCL instanceof PluginClassLoader) {
            String newName = ((PluginClassLoader) mCL).umcl.remapField(mClass,name);
            return mClass.getField(newName);
        }
        return mClass.getField(name);
    }
    @CallerSensitive
    public Field getDeclaredField(String name)
            throws NoSuchFieldException, SecurityException {
        ClassLoader mCL=Thread.currentThread().getContextClassLoader();
        if(mCL instanceof PluginClassLoader) {
            String newName = ((PluginClassLoader) mCL).umcl.remapField(mClass,name);
            return mClass.getDeclaredField(newName);
        }
        return mClass.getDeclaredField(name);
    }
}
