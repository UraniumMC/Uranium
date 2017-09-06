package net.minecraft.server.v1_7_R4;

import io.netty.buffer.ByteBuf;

public class PacketPlayOutCustomPayload extends net.minecraft.network.play.server.S3FPacketCustomPayload implements Packet
{
    public PacketPlayOutCustomPayload() {
    }

    public PacketPlayOutCustomPayload(String p_i45189_1_, ByteBuf p_i45189_2_) {
        super(p_i45189_1_, p_i45189_2_);
    }

    public PacketPlayOutCustomPayload(String p_i45190_1_, byte[] p_i45190_2_) {
        super(p_i45190_1_, p_i45190_2_);
    }
}