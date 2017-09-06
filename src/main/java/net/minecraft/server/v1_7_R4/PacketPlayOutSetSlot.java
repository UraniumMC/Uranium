package net.minecraft.server.v1_7_R4;

import net.minecraft.item.ItemStack;

public class PacketPlayOutSetSlot extends net.minecraft.network.play.server.S2FPacketSetSlot implements Packet
{
    public PacketPlayOutSetSlot() {
    }

    public PacketPlayOutSetSlot(int p_i45188_1_, int p_i45188_2_, ItemStack p_i45188_3_) {
        super(p_i45188_1_, p_i45188_2_, p_i45188_3_);
    }
}