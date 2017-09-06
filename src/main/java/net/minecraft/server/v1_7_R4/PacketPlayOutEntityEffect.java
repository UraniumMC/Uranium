package net.minecraft.server.v1_7_R4;

import net.minecraft.potion.PotionEffect;

public class PacketPlayOutEntityEffect extends net.minecraft.network.play.server.S1DPacketEntityEffect implements Packet
{
    public PacketPlayOutEntityEffect() {
    }

    public PacketPlayOutEntityEffect(int p_i45237_1_, PotionEffect p_i45237_2_) {
        super(p_i45237_1_, p_i45237_2_);
    }
}