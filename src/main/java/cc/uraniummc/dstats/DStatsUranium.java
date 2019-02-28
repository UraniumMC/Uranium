package cc.uraniummc.dstats;

import cc.uraniummc.ULog;
import cc.uraniummc.Uranium;
import lombok.Getter;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import static com.google.common.math.DoubleMath.mean;

public class DStatsUranium extends DStatsBukkitCommon {
    private YamlConfiguration dstats_new_config=new YamlConfiguration();
    private YamlConfiguration dstats_config=new YamlConfiguration();
    private File dstats_file=new File(MinecraftServer.serverConfigDir,"DStats.yml");
    private final Object lock =new Object();
    @Getter
    private boolean enabled=true;
    @Getter
    private UUID guid=UUID.randomUUID();
    public DStatsUranium() {}
    public void start(){
        try {
            if (!dstats_file.exists()) {
                saveConfig();
            }else{
                loadConfig();
            }
        }catch (IOException e){
            try {
                guid=UUID.randomUUID();
                saveConfig();
            }catch (IOException ee){}
        }
        if(enabled){
            loadDStats();
            ULog.get().info("DStats Enabled");
        }
    }
    public void restart(){
        try {
            getThread_dstats().interrupt();
            getThread_dstats().wait();
        }catch (Exception e){}
        start();
    }
    public void loadConfig() throws IOException {
        synchronized (lock) {
            try {
                dstats_new_config.load(dstats_file);
            } catch (InvalidConfigurationException e) {
                throw new IOException(e);
            }
            dstats_config=dstats_new_config;
            enabled = dstats_config.getBoolean("Enable",enabled);
            guid = UUID.fromString(dstats_config.getString("Guid",guid.toString()));
        }
    }
    public void saveConfig() throws IOException{
        synchronized (lock){
            dstats_config.set("Enable",enabled);
            dstats_config.set("Guid",guid.toString());
            dstats_config.save(dstats_file);
        }
    }
    @Override
    public double getTPS() {
        final MinecraftServer server = MinecraftServer.getServer();
        double meanTickTime = mean(server.tickTimeArray) * 1.0E-6D;
        return Math.min(1000.0 / meanTickTime, 20);
    }

    @Override
    public UUID getServerId() {
        return guid;
    }

    @Override
    public void updateServerId(UUID uuid) {
        guid=uuid;
        try {
            saveConfig();
        }catch (IOException e){

        }
    }

    @Override
    public void findServerDetails() {
        getStats().setMinecraftVersion(MinecraftForge.MC_VERSION);
        getStats().setServerSoftware(Uranium.name);
        getStats().setServerVersion(Uranium.getCurrentVersion());
        getStats().setPort(Bukkit.getPort());
    }
}
