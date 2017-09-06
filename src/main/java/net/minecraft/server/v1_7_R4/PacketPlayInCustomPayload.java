package net.minecraft.server.v1_7_R4;

import io.netty.buffer.ByteBuf;

public class PacketPlayInCustomPayload extends net.minecraft.network.play.client.C17PacketCustomPayload implements Packet
{
    public PacketPlayInCustomPayload() {
    }

    public PacketPlayInCustomPayload(String p_i45248_1_, ByteBuf p_i45248_2_) {
        super(p_i45248_1_, p_i45248_2_);
    }

    public PacketPlayInCustomPayload(String p_i45249_1_, byte[] p_i45249_2_) {
        super(p_i45249_1_, p_i45249_2_);
    }
}