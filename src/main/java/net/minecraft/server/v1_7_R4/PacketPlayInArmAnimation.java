package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayInArmAnimation extends net.minecraft.network.play.client.C0APacketAnimation implements Packet
{
    public PacketPlayInArmAnimation() {
    }

    public PacketPlayInArmAnimation(Entity p_i45238_1_, int p_i45238_2_) {
        super(p_i45238_1_, p_i45238_2_);
    }
}