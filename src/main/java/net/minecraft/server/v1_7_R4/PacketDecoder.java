package net.minecraft.server.v1_7_R4;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.NetworkStatistics;

import java.io.IOException;

public class PacketDecoder extends net.minecraft.util.MessageDeserializer
{
    public PacketDecoder(NetworkStatistics p_i1183_1_) {
        super(p_i1183_1_);
    }

    public void decode(ChannelHandlerContext arg1, ByteBuf arg2, java.util.List arg3) throws IOException{
       super.decode(arg1,arg2,arg3);
    }
}