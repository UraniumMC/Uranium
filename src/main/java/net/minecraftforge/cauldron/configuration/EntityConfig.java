package net.minecraftforge.cauldron.configuration;

import org.bukkit.configuration.file.YamlConfiguration;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.cauldron.CauldronHooks;
import net.minecraftforge.cauldron.EntityCache;
import net.minecraftforge.cauldron.command.EntityCommand;

public class EntityConfig extends ConfigBase{

    private final String HEADER="Made By Imcc,to skip entity tick";

    /*
     * ========================================================================
     */
    public final BoolSetting skipEntityTicks=new BoolSetting(this,"settings.skip-entity-ticks",true,
            "If enabled, turns on entity tick skip feature");
    /*
     * ========================================================================
     */

    public EntityConfig(String fileName,String commandName){
        super(fileName,commandName);
        init();
    }

    public void addCommands(){
        commands.put(this.commandName,new EntityCommand());
    }

    public void init(){
        settings.put(skipEntityTicks.path,skipEntityTicks);
        load();
    }

    public void load(){
        try{
            config=YamlConfiguration.loadConfiguration(configFile);
            String header=HEADER+"\n";
            for(Setting toggle : settings.values()){
                if(!toggle.description.equals(""))
                    header+="Setting: "+toggle.path+" Default: "+toggle.def+"   # "+toggle.description+"\n";

                config.addDefault(toggle.path,toggle.def);
                settings.get(toggle.path).setValue(config.getString(toggle.path));
            }
            config.options().header(header);
            config.options().copyDefaults(true);

            version=getInt("config-version",1);
            set("config-version",1);

            for(EntityCache tCache : CauldronHooks.entityCache.values()){
                tCache.tickInterval=config.getInt("world-settings."+tCache.worldName+"."+tCache.configPath+".tick-interval",config.getInt("world-settings.default."+tCache.configPath+".tick-interval"));
            }
            this.saveWorldConfigs();
            this.save();
        }catch(Exception ex){
            MinecraftServer.getServer().logSevere("Could not load "+this.configFile);
            ex.printStackTrace();
        }
    }

    @Override
    public void saveWorldConfigs(){
        for(int i=0;i<MinecraftServer.getServer().worlds.size();++i){
            WorldServer worldserver=MinecraftServer.getServer().worlds.get(i);

            if(worldserver!=null&&worldserver.entityConfig!=null){
                worldserver.entityConfig.save();
            }
        }
    }

}
