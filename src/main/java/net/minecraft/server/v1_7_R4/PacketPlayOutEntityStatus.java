package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayOutEntityStatus extends net.minecraft.network.play.server.S19PacketEntityStatus implements Packet
{
    public PacketPlayOutEntityStatus() {
    }

    public PacketPlayOutEntityStatus(Entity p_i45192_1_, byte p_i45192_2_) {
        super(p_i45192_1_, p_i45192_2_);
    }
}