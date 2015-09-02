package kcauldron;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.entity.CraftPlayer;

import kcauldron.updater.CommandSenderUpdateCallback;
import kcauldron.updater.KCauldronUpdater;
import kcauldron.updater.KVersionRetriever;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.server.command.ForgeCommand;

public class KCauldronCommand extends Command {
	public static final String NAME = "kc";
	public static final String CHECK = NAME + ".check";
	public static final String UPDATE = NAME + ".update";
	public static final String TPS = NAME + ".tps";
	public static final String RESTART = NAME + ".restart";

	public KCauldronCommand() {
		super(NAME);

		StringBuilder builder = new StringBuilder();
		builder.append(String.format("/%s check - Check to update\n", NAME));
		builder.append(String.format("/%s update [version] - Update to specified or latest version\n", NAME));
		builder.append(String.format("/%s tps - Show tps statistics\n", NAME));
		builder.append(String.format("/%s restart - Restart server\n", NAME));
		setUsage(builder.toString());

		setPermission("kcauldron");
	}

	public boolean testPermission(CommandSender target, String permission) {
		if (testPermissionSilent(target, permission)) {
			return true;
		}
		target.sendMessage(ChatColor.RED
				+ "I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
		return false;
	}

	public boolean testPermissionSilent(CommandSender target, String permission) {
		if (!super.testPermissionSilent(target)) {
			return false;
		}
		for (String p : permission.split(";"))
			if (target.hasPermission(p))
				return true;
		return false;
	}

	@Override
	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		if (!testPermission(sender))
			return true;
		if (args.length == 0) {
			sender.sendMessage(ChatColor.YELLOW + "Please specify action");
			sender.sendMessage(ChatColor.AQUA + usageMessage);
			return true;
		}
		String action = args[0];
		if ("check".equals(action)) {
			if (!testPermission(sender, CHECK))
				return true;
			sender.sendMessage(ChatColor.GREEN + "Initiated version check...");
			KVersionRetriever.startServer(new CommandSenderUpdateCallback(sender), false);
		} else if ("update".equals(action)) {
			KCauldronUpdater.initUpdate(sender, args.length > 1 ? args[1] : null);
		} else if ("tps".equals(action)) {
			if (!testPermission(sender, TPS))
				return true;
			World currentWorld = null;
			if (sender instanceof CraftPlayer) {
				currentWorld = ((CraftPlayer) sender).getWorld();
			}
			sender.sendMessage(ChatColor.DARK_BLUE + "---------------------------------------");
			final MinecraftServer server = MinecraftServer.getServer();
			for (World world : server.server.getWorlds()) {
				if (world instanceof CraftWorld) {
					boolean current = currentWorld != null && currentWorld == world;
					net.minecraft.world.World mcWorld = ((CraftWorld) world).getHandle();
					String bukkitName = world.getName();
					int dimensionId = mcWorld.provider.dimensionId;
					String name = mcWorld.provider.getDimensionName();
					String displayName = name.equals(bukkitName) ? name : String.format("%s | %s", name, bukkitName);

					double worldTickTime = mean(server.worldTickTimes.get(dimensionId)) * 1.0E-6D;
					double worldTPS = Math.min(1000.0 / worldTickTime, 20);

					sender.sendMessage(String.format("%s[%d] %s%s %s- %s%.2fms / %.2ftps", ChatColor.GOLD, dimensionId,
							current ? ChatColor.GREEN : ChatColor.YELLOW, displayName, ChatColor.RESET, ChatColor.DARK_RED, worldTickTime,
							worldTPS));
				}
			}
			double meanTickTime = mean(server.tickTimeArray) * 1.0E-6D;
			double meanTPS = Math.min(1000.0 / meanTickTime, 20);
			sender.sendMessage(String.format("%sOverall - %s%s%.2fms / %.2ftps", ChatColor.BLUE, ChatColor.RESET,
					ChatColor.DARK_RED, meanTickTime, meanTPS));
		} else if ("restart".equals(action)) {
			if (!testPermission(sender, RESTART))
				return true;
			KCauldron.restart();
		} else {
			sender.sendMessage(ChatColor.RED + "Unknown action");
		}
		return true;
	}

	private static final long mean(long[] array) {
		long r = 0;
		for (long i : array)
			r += i;
		return r / array.length;
	}

}
