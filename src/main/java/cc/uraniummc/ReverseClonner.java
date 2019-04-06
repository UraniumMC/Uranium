package cc.uraniummc;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;

public enum ReverseClonner {
    ;

    public static EntityPlayerMP clone(EntityPlayerMP player, boolean wasDeath) {
        /*
        EntityPlayerMP shadowCopy = new EntityPlayerMP(player.mcServer, (WorldServer) player.worldObj,
                player.getGameProfile(), new ItemInWorldManager(player.worldObj));
        shadowCopy.bukkitEntity = player.bukkitEntity;
        shadowCopy.playerNetServerHandler = player.playerNetServerHandler;
        shadowCopy.clonePlayer(player, true);
        if (wasDeath && !player.worldObj.getGameRules().getGameRuleBooleanValue("keepInventory")) {
            player.inventory.clearInventory(null, -1);
            player.inventoryContainer = new ContainerPlayer(player.inventory, !player.worldObj.isRemote, player);
        }
        MinecraftForge.EVENT_BUS.post(new PlayerEvent.Clone(player, shadowCopy, wasDeath));
         */
        //Send clone event................Fix some issues
        MinecraftForge.EVENT_BUS.post(new PlayerEvent.Clone(player, player, wasDeath));
        return player;
    }
}
