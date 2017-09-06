package net.minecraft.server.v1_7_R4;

import net.minecraft.util.Vec3;

import java.util.List;

public class PacketPlayOutExplosion extends net.minecraft.network.play.server.S27PacketExplosion implements Packet
{
    public PacketPlayOutExplosion() {
    }

    public PacketPlayOutExplosion(double p_i45193_1_, double p_i45193_3_, double p_i45193_5_, float p_i45193_7_, List p_i45193_8_, Vec3 p_i45193_9_) {
        super(p_i45193_1_, p_i45193_3_, p_i45193_5_, p_i45193_7_, p_i45193_8_, p_i45193_9_);
    }
}