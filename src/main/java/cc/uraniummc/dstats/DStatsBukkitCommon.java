package cc.uraniummc.dstats;

import cc.uraniummc.ULog;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lombok.*;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import org.bukkit.Bukkit;
import org.spigotmc.SpigotConfig;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static cc.uraniummc.dstats.DStatsMetricsCommon.AuthMode.BUNGEECORD;
import static cc.uraniummc.dstats.DStatsMetricsCommon.AuthMode.OFFLINE;
import static com.google.common.math.DoubleMath.mean;

public abstract class DStatsBukkitCommon {
    @Getter(AccessLevel.PROTECTED)
    private Thread thread_dstats;
    @Getter
    private DStatsMetricsCommon.DstatsModel stats=new DStatsMetricsCommon.DstatsModel();
    public abstract double getTPS();
    protected void loadDStats(){
        if(Bukkit.getOnlineMode()){
            stats.setAuthMode(DStatsMetricsCommon.getAuthMode());
        }else{
            if(checkIsBungee()){
                stats.setAuthMode(BUNGEECORD);
            }else{
                stats.setAuthMode(OFFLINE);
            }
        }
        parseDetails();
        findServerDetails();
        val t=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(60000 * 5); //等待五分钟等插件和模组 加载完成
                    parseDetails();
                    while (true) {
                        getStats().setServerId(getServerId().toString());
                        getStats().setTps(Double.valueOf(getTPS()).floatValue());
                        getStats().setOnlinePlayers(Bukkit.getOnlinePlayers().size());
                        DStatsMetricsCommon.DstatsRetModel ret=DStatsMetricsCommon.sendToServer("https://dstats.xyz/api/v1/ServerSoftwareData/Parse",getStats());
                        if(ret==null)continue;
                        switch (ret.getStatus()){
                            case 1:
                                updateServerId(UUID.fromString(ret.getExtraDetails()));
                                break;
                            default:
                                handleLog("Remote server result\n Code:"+ret.getStatus()+"\n"+ret.getExtraDetails());
                                break;
                        }
                        Thread.sleep(60000 * 20); //每20分钟发送一次数据
                    }
                }catch (Exception e){
                }
            }
        });
        thread_dstats=t;
        t.setName("DStats MineCraft Data Center Thread");
        t.start();
    }
    public void parseDetails(){
        val osarch = System.getProperty("os.arch");
        val osname = System.getProperty("os.name");
        val osversion = System.getProperty("os.version");
        val oscores = Runtime.getRuntime().availableProcessors();
        val osusemem = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024;
        val ostotalmem = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        val javaversion = System.getProperty("java.version");
        val javavendor = System.getProperty("java.vendor");
        getStats().setOS(osname);
        getStats().setOSPlatform(osarch);
        getStats().setOSVersion(osversion);
        getStats().setCore(oscores);
        getStats().setServerSoftware(Bukkit.getServerName());
        getStats().setServerVersion(Bukkit.getVersion());
        getStats().setUseMemory(osusemem);
        getStats().setTotalMemory(ostotalmem);
        getStats().setJavaVersion(javaversion);
        getStats().setJavaVendor(javavendor);
        findServerDetails();
        getServerId();
    }
    public abstract UUID getServerId();
    public abstract void updateServerId(UUID uuid);
    public abstract void findServerDetails();
    public abstract void handleLog(String info);
    public boolean checkIsBungee(){
        return SpigotConfig.bungee;
    }

}
