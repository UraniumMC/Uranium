package net.minecraft.server.v1_7_R4;

import net.minecraft.item.ItemStack;

public class PacketPlayInSetCreativeSlot extends net.minecraft.network.play.client.C10PacketCreativeInventoryAction implements Packet
{
    public PacketPlayInSetCreativeSlot() {
    }

    public PacketPlayInSetCreativeSlot(int p_i45263_1_, ItemStack p_i45263_2_) {
        super(p_i45263_1_, p_i45263_2_);
    }

    public int c(){
       return super.func_149627_c();
}
   public net.minecraft.item.ItemStack getItemStack(){
       return super.func_149625_d();
}
}