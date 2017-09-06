package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.player.EntityPlayer;

public class PacketPlayOutBed extends net.minecraft.network.play.server.S0APacketUseBed implements Packet
{
    public PacketPlayOutBed() {
    }

    public PacketPlayOutBed(EntityPlayer p_i45210_1_, int p_i45210_2_, int p_i45210_3_, int p_i45210_4_) {
        super(p_i45210_1_, p_i45210_2_, p_i45210_3_, p_i45210_4_);
    }
}