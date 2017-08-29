package cc.uraniummc;

import org.bukkit.plugin.java.PluginClassLoader;

import net.md_5.specialsource.JarMapping;
import net.md_5.specialsource.JarRemapper;

public class UraniumRemapper extends JarRemapper{

    protected final PluginClassLoader mLoader;

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
}
