package cc.uraniummc.util;

import org.bukkit.plugin.java.PluginClassLoader;

/**
 * Created by xjboss on 2017/9/6.
 */
public class RemapUtils {
    public String getRemapClass(String pOldName){
        ClassLoader cl=Thread.currentThread().getContextClassLoader();
        if(cl instanceof PluginClassLoader){
            return ((PluginClassLoader) cl).remapClassName(pOldName);
        }
        return pOldName;
    }
    public String getRemapMethod(Class pClass,String method){
        ClassLoader cl=Thread.currentThread().getContextClassLoader();
        if(cl instanceof PluginClassLoader){
            return ((PluginClassLoader) cl).remapClassName(pOldName);
        }
        return pOldName;
    }
}
