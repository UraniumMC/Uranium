package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayOutAttachEntity extends net.minecraft.network.play.server.S1BPacketEntityAttach implements Packet
{
    public PacketPlayOutAttachEntity() {
    }

    public PacketPlayOutAttachEntity(int p_i45218_1_, Entity p_i45218_2_, Entity p_i45218_3_) {
        super(p_i45218_1_, p_i45218_2_, p_i45218_3_);
    }
}