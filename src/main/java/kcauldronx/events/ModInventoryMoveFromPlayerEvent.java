package kcauldronx.events;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftInventoryPlayer;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.PlayerInventory;

/**
 * Created by xjboss on 2017/7/3.
 */
public class ModInventoryMoveFromPlayerEvent extends InventoryMoveItemEvent {
    public ModInventoryMoveFromPlayerEvent(IInventory sourceInventory, net.minecraft.item.ItemStack itemStack, PlayerInventory destinationInventory, boolean didSourceInitiate) {
        super(new CraftInventory(sourceInventory), CraftItemStack.asCraftMirror(itemStack), new CraftInventoryPlayer((InventoryPlayer)destinationInventory), didSourceInitiate);
    }
}
