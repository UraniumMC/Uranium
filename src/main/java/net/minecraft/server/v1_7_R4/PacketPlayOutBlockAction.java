package net.minecraft.server.v1_7_R4;

import net.minecraft.block.*;

public class PacketPlayOutBlockAction extends net.minecraft.network.play.server.S24PacketBlockAction implements Packet
{
    public PacketPlayOutBlockAction() {
    }

    public PacketPlayOutBlockAction(int p_i45176_1_, int p_i45176_2_, int p_i45176_3_, net.minecraft.block.Block p_i45176_4_, int p_i45176_5_, int p_i45176_6_) {
        super(p_i45176_1_, p_i45176_2_, p_i45176_3_, p_i45176_4_, p_i45176_5_, p_i45176_6_);
    }
}