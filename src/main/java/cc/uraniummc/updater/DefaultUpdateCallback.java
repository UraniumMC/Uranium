package cc.uraniummc.updater;

import cc.uraniummc.Uranium;
import cc.uraniummc.UraniumCommand;
import cc.uraniummc.updater.UVersionRetriever.IVersionCheckCallback;
import net.minecraft.server.MinecraftServer;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class DefaultUpdateCallback implements IVersionCheckCallback {
    public static DefaultUpdateCallback INSTANCE;

    static {
        INSTANCE = new DefaultUpdateCallback();
    }

    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (hasPermission(player)) {
            /*
            if (Uranium.isLegacy()) {
                player.sendMessage(ChatColor.YELLOW + "We're running on legacy version on Uranium, please update your version");
            }            
            if (!Uranium.isOfficial()) {
                player.sendMessage(ChatColor.YELLOW + "We're running on non-official version on Uranium, please update your version");
            }            
            if (mHasUpdate) {
                sendUpdate(player);
            }
            */
        }
    }

    private boolean hasPermission(CommandSender player) {
        return player.hasPermission(UraniumCommand.UPDATE) || player.isOp();
    }

    private void sendUpdate(CommandSender player) {
        CommandSenderUpdateCallback.newVersion(player, mCurrentVersion,
                mNewVersion);
    }

    private boolean mHasUpdate;
    private String mCurrentVersion;
    private String mNewVersion;

    private DefaultUpdateCallback() {
    }

    @Override
    public void upToDate() {
        mHasUpdate = false;
        mCurrentVersion = Uranium.getCurrentVersion();
        mNewVersion = null;
    }

    @Override
    public void newVersion(String newVersion) {
        mCurrentVersion = Uranium.getCurrentVersion();
        mNewVersion = newVersion;
        if (!mHasUpdate) {
            Bukkit.getConsoleSender().sendMessage(
                    "New version of Uranium avaiable: " + newVersion);
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (hasPermission(player)) {
                    sendUpdate(player);
                }
            }
        }
        mHasUpdate = true;
        if (MinecraftServer.uraniumConfig.updatecheckerAutoinstall.getValue()
                && !mNewVersion.equals(Uranium.sNewServerVersion)
                && !Uranium.sUpdateInProgress) {
            Bukkit.getConsoleSender().sendMessage("Triggering auto update");
            UraniumUpdater.initUpdate(Bukkit.getConsoleSender(), newVersion);
        }
    }

    @Override
    public void error(Throwable t) {

    }
}
