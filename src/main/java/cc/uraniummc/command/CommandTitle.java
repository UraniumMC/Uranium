package cc.uraniummc.command;

import cc.uraniummc.UraniumPlusCommon;
import cc.uraniummc.packet.PacketChatWithType;
import cc.uraniummc.packet.S45PacketTitle;
import cc.uraniummc.util.ChatComponentProcessor;
import com.google.gson.JsonParseException;
import net.minecraft.command.*;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.IChatComponent;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandTitle extends CommandBase
{
    private static final Logger LOGGER = LogManager.getLogger();

    private final String[] alltypes;
    public CommandTitle() {
        alltypes=new String[S45PacketTitle.Type.getNames().length+1];
        int i=0;
        for(String name:S45PacketTitle.Type.getNames()){
            alltypes[i++]=name;
        }
        alltypes[i++]="actionbar";
    }

    /**
     * Gets the name of the command
     */
    public String getCommandName()
    {
        return "title";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 2;
    }

    /**
     * Gets the usage string for the command.
     */
    public String getCommandUsage(ICommandSender sender)
    {
        return "commands.title.usage";
    }

    /**
     * Callback when the command is invoked
     */
    public void processCommand(ICommandSender sender, String[] args) throws CommandException
    {
        if (args.length < 2)
        {
            throw new WrongUsageException("commands.title.usage", new Object[0]);
        }
        else
        {
            if (args.length < 3)
            {
                if ("title".equals(args[1]) || "subtitle".equals(args[1]) || "actionbar".equals(args[1]))
                {
                    throw new WrongUsageException("commands.title.usage.title", new Object[0]);
                }

                if ("times".equals(args[1]))
                {
                    throw new WrongUsageException("commands.title.usage.times", new Object[0]);
                }
            }

            EntityPlayerMP entityplayermp = getPlayer(sender, args[0]);
            if("actionbar".equals(args[1])){
                String s = func_82360_a(sender,args, 2);
                IChatComponent ichatcomponent;

                try
                {
                    ichatcomponent = IChatComponent.Serializer.func_150699_a(s);
                }
                catch (JsonParseException jsonparseexception)
                {
                    Throwable throwable = ExceptionUtils.getRootCause(jsonparseexception);
                    throw new SyntaxErrorException("commands.tellraw.jsonException", new Object[] {throwable == null ? "" : throwable.getMessage()});
                }
                PacketChatWithType chatWithType=new PacketChatWithType(ichatcomponent,(byte)2);
                UraniumPlusCommon.getChancel().sendTo(chatWithType,entityplayermp);
            }
            S45PacketTitle.Type s45packettitle$type = S45PacketTitle.Type.byName(args[1]);

            if (s45packettitle$type != S45PacketTitle.Type.CLEAR && s45packettitle$type != S45PacketTitle.Type.RESET)
            {
                if (s45packettitle$type == S45PacketTitle.Type.TIMES)
                {
                    if (args.length != 5)
                    {
                        throw new WrongUsageException("commands.title.usage", new Object[0]);
                    }
                    else
                    {
                        int i = parseInt(sender,args[2]);
                        int j = parseInt(sender,args[3]);
                        int k = parseInt(sender,args[4]);
                        S45PacketTitle s45packettitle2 = new S45PacketTitle(i, j, k);
                        UraniumPlusCommon.getChancel().sendTo(s45packettitle2,entityplayermp);
                        func_152373_a(sender, this, "commands.title.success", new Object[0]);
                    }
                }
                else if (args.length < 3)
                {
                    throw new WrongUsageException("commands.title.usage", new Object[0]);
                }
                else
                {
                    String s = func_82360_a(sender,args, 2);
                    IChatComponent ichatcomponent;

                    try
                    {
                        ichatcomponent = IChatComponent.Serializer.func_150699_a(s);
                    }
                    catch (JsonParseException jsonparseexception)
                    {
                        Throwable throwable = ExceptionUtils.getRootCause(jsonparseexception);
                        throw new SyntaxErrorException("commands.tellraw.jsonException", new Object[] {throwable == null ? "" : throwable.getMessage()});
                    }

                    S45PacketTitle s45packettitle1 = new S45PacketTitle(s45packettitle$type, ChatComponentProcessor.processComponent(sender, ichatcomponent, entityplayermp));
                    UraniumPlusCommon.getChancel().sendTo(s45packettitle1,entityplayermp);
                    func_152373_a(sender, this, "commands.title.success", new Object[0]);
                }
            }
            else if (args.length != 2)
            {
                throw new WrongUsageException("commands.title.usage", new Object[0]);
            }
            else
            {
                S45PacketTitle s45packettitle = new S45PacketTitle(s45packettitle$type, (IChatComponent)null);
                UraniumPlusCommon.getChancel().sendTo(s45packettitle,entityplayermp);
                func_152373_a(sender, this, "commands.title.success", new Object[0]);
            }
        }
    }

    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args)
    {
        return args.length == 1 ? getListOfStringsMatchingLastWord(args, MinecraftServer.getServer().getAllUsernames()) : (args.length == 2 ? getListOfStringsMatchingLastWord(args,alltypes) : null);
    }

    /**
     * Return whether the specified command parameter index is a username parameter.
     */
    public boolean isUsernameIndex(String[] args, int index)
    {
        return index == 0;
    }
}