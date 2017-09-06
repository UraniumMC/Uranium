package net.minecraft.server.v1_7_R4;

import net.minecraft.potion.PotionEffect;

public class PacketPlayOutRemoveEntityEffect extends net.minecraft.network.play.server.S1EPacketRemoveEntityEffect implements Packet
{
    public PacketPlayOutRemoveEntityEffect() {
    }

    public PacketPlayOutRemoveEntityEffect(int p_i45212_1_, PotionEffect p_i45212_2_) {
        super(p_i45212_1_, p_i45212_2_);
    }
}