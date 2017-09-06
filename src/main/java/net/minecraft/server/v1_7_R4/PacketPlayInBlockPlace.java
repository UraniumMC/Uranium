package net.minecraft.server.v1_7_R4;

import net.minecraft.item.ItemStack;

public class PacketPlayInBlockPlace extends net.minecraft.network.play.client.C08PacketPlayerBlockPlacement implements Packet
{
    public PacketPlayInBlockPlace() {
    }

    public PacketPlayInBlockPlace(int p_i45265_1_, int p_i45265_2_, int p_i45265_3_, int p_i45265_4_, ItemStack p_i45265_5_, float p_i45265_6_, float p_i45265_7_, float p_i45265_8_) {
        super(p_i45265_1_, p_i45265_2_, p_i45265_3_, p_i45265_4_, p_i45265_5_, p_i45265_6_, p_i45265_7_, p_i45265_8_);
    }

    public int getFace(){
       return super.func_149568_f();
}
   public net.minecraft.item.ItemStack getItemStack(){
       return super.func_149574_g();
}
}