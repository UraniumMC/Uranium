package cc.uraniummc;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ItemInWorldManager;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class ReverseClonner {
    public static EntityPlayerMP clone(EntityPlayerMP player, boolean wasDeath) {
        if(MinecraftServer.uraniumConfig.enableForgeRespawnClone.getValue()) {
            EntityPlayerMP shadowCopy = new EntityPlayerMP(player.mcServer, (WorldServer) player.worldObj,
                    player.getGameProfile(), new ItemInWorldManager(player.worldObj));
            shadowCopy.bukkitEntity = player.bukkitEntity;
            shadowCopy.playerNetServerHandler = player.playerNetServerHandler;
            shadowCopy.clonePlayer(player, true);
            if (wasDeath && !player.worldObj.getGameRules().getGameRuleBooleanValue("keepInventory")) {
                shadowCopy.inventory.clearInventory(null, -1);
                shadowCopy.inventoryContainer = new ContainerPlayer(shadowCopy.inventory, !player.worldObj.isRemote, player);
            }
            if(!wasDeath){
                shadowCopy.activePotionsMap.clear();
                shadowCopy.activePotionsMap.putAll(player.activePotionsMap);
            }
            MinecraftForge.EVENT_BUS.post(new PlayerEvent.Clone(player, shadowCopy, wasDeath));
            return shadowCopy;
        }
        return player;
    }
}
