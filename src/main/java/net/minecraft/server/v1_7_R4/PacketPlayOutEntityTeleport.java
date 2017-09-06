package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayOutEntityTeleport extends net.minecraft.network.play.server.S18PacketEntityTeleport implements Packet
{
    public PacketPlayOutEntityTeleport() {
    }

    public PacketPlayOutEntityTeleport(Entity p_i45233_1_) {
        super(p_i45233_1_);
    }

    public PacketPlayOutEntityTeleport(int p_i45234_1_, int p_i45234_2_, int p_i45234_3_, int p_i45234_4_, byte p_i45234_5_, byte p_i45234_6_) {
        super(p_i45234_1_, p_i45234_2_, p_i45234_3_, p_i45234_4_, p_i45234_5_, p_i45234_6_);
    }
}