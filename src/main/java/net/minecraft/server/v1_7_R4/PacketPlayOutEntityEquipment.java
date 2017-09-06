package net.minecraft.server.v1_7_R4;

import net.minecraft.item.ItemStack;

public class PacketPlayOutEntityEquipment extends net.minecraft.network.play.server.S04PacketEntityEquipment implements Packet
{
    public PacketPlayOutEntityEquipment() {
    }

    public PacketPlayOutEntityEquipment(int p_i45221_1_, int p_i45221_2_, ItemStack p_i45221_3_) {
        super(p_i45221_1_, p_i45221_2_, p_i45221_3_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}