package cc.uraniummc.updater;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

import cc.uraniummc.Uranium;
import cc.uraniummc.updater.UVersionRetriever.IVersionCheckCallback;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class CommandSenderUpdateCallback implements IVersionCheckCallback {
    private Reference<CommandSender> mSender;

    public CommandSenderUpdateCallback(CommandSender sender) {
        mSender = new WeakReference<CommandSender>(sender);
    }

    protected CommandSender getSender() {
        return mSender.get();
    }

    @Override
    public void upToDate() {
        CommandSender sender = mSender.get();
        if (sender != null) {
            sender.sendMessage(ChatColor.GREEN
                    + "Running version of Uranium is up-to-date: "
                    + Uranium.getCurrentVersion());
        }
        DefaultUpdateCallback.INSTANCE.upToDate();
    }

    @Override
    public void newVersion(String newVersion) {
        CommandSender sender = mSender.get();
        if (sender != null) {
            newVersion(sender, Uranium.getCurrentVersion(), newVersion);
        }
        DefaultUpdateCallback.INSTANCE.newVersion(newVersion);
    }

    public static void newVersion(CommandSender sender, String currentVersion,
            String newVersion) {
        sender.sendMessage(new String[] {
                ChatColor.YELLOW + "Found new version of Uranium: "
                        + newVersion,
                ChatColor.YELLOW + "Current is " + currentVersion,
                ChatColor.YELLOW + "Type '" + ChatColor.BLUE + "/kc update"
                        + ChatColor.YELLOW + "' to update" });
    }

    @Override
    public void error(Throwable t) {
        CommandSender sender = mSender.get();
        if (sender != null) {
            sender.sendMessage(ChatColor.RED
                    + "Error ocurred durring version check, see details in server log");
        }
    }
}
