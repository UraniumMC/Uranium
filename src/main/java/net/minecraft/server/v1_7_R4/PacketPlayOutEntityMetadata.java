package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.*;

public class PacketPlayOutEntityMetadata extends net.minecraft.network.play.server.S1CPacketEntityMetadata implements Packet
{
    public PacketPlayOutEntityMetadata() {
    }

    public PacketPlayOutEntityMetadata(int p_i45217_1_, net.minecraft.entity.DataWatcher p_i45217_2_, boolean p_i45217_3_) {
        super(p_i45217_1_, p_i45217_2_, p_i45217_3_);
    }
}