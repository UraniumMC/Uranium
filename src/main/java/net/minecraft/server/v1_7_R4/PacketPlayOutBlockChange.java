package net.minecraft.server.v1_7_R4;

import net.minecraft.world.*;

public class PacketPlayOutBlockChange extends net.minecraft.network.play.server.S23PacketBlockChange implements Packet
{
    public PacketPlayOutBlockChange() {
    }

    public PacketPlayOutBlockChange(int p_i45177_1_, int p_i45177_2_, int p_i45177_3_, net.minecraft.world.World p_i45177_4_) {
        super(p_i45177_1_, p_i45177_2_, p_i45177_3_, p_i45177_4_);
    }
}