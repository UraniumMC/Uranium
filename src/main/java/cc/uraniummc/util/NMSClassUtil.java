package cc.uraniummc.util;

import net.minecraft.server.MinecraftServer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.PluginClassLoader;
import sun.reflect.CallerSensitive;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.net.URLClassLoader;

public class NMSClassUtil {
    private final Class<?> mClass;
    private final URLClassLoader mCL;
    public NMSClassUtil(Class<?> pClass,Class<?> pPClass){
        this.mClass=pClass;
        mCL=(URLClassLoader) pPClass.getClassLoader();
    }
    public static String BgetName(Class<?> pPClass){
        URLClassLoader mCL=(URLClassLoader) pPClass.getClassLoader();
        if(mCL instanceof PluginClassLoader){
            String sname;
            sname= MinecraftServer.uraniumConfig.getString("plugin-settings." + ((PluginClassLoader) mCL).getDescription().getName()+ ".custom-server-name", "");
            if(sname!=null&&!sname.isEmpty()){
                return sname;
            }
        }
        return Bukkit.getServerName();
    }
    @CallerSensitive
    public static Class<?> forName(String className,Class<?> pPClass)
            throws ClassNotFoundException {
        URLClassLoader mCL=(URLClassLoader) pPClass.getClassLoader();
        if(mCL instanceof PluginClassLoader){
            return Class.forName(((PluginClassLoader) mCL).umcl.remapClass(className).replace("/","."));
        }
        return Class.forName(className);
    }
    @CallerSensitive
    public static Class<?> forName(String className,boolean init,ClassLoader loader,Class<?> pPClass)
            throws ClassNotFoundException {
        URLClassLoader mCL=(URLClassLoader) pPClass.getClassLoader();
        if(mCL instanceof PluginClassLoader){
            return Class.forName(((PluginClassLoader) mCL).umcl.remapClass(className).replace("/","."),init,loader);
        }
        return Class.forName(className,init,loader);
    }
    @CallerSensitive
    public Method getDeclaredMethod(String name, Class<?>... parameterTypes)
            throws NoSuchMethodException, SecurityException {
        if(mCL instanceof PluginClassLoader) {
            String newName = ((PluginClassLoader) mCL).umcl.remapMethod(mClass,name,parameterTypes);
            return mClass.getDeclaredMethod(newName,parameterTypes);
        }
        return mClass.getDeclaredMethod(name,parameterTypes);
    }

    @CallerSensitive
    public Method getMethod(String name, Class<?>... parameterTypes)
            throws NoSuchMethodException, SecurityException {
        if(mCL instanceof PluginClassLoader) {
            String newName = ((PluginClassLoader) mCL).umcl.remapMethod(mClass,name,parameterTypes);
            return mClass.getMethod(newName,parameterTypes);
        }
        return mClass.getMethod(name,parameterTypes);
    }

    @CallerSensitive
    public Field getField(String name)
            throws NoSuchFieldException, SecurityException {
        if(mCL instanceof PluginClassLoader) {
            String newName = ((PluginClassLoader) mCL).umcl.remapField(mClass,name);
            return mClass.getField(newName);
        }
        return mClass.getField(name);
    }
    @CallerSensitive
    public Field getDeclaredField(String name)
            throws NoSuchFieldException, SecurityException {
        if(mCL instanceof PluginClassLoader) {
            String newName = ((PluginClassLoader) mCL).umcl.remapField(mClass,name);
            return mClass.getDeclaredField(newName);
        }
        return mClass.getDeclaredField(name);
    }
}
