package net.minecraft.server.v1_7_R4;

import net.minecraft.network.NetworkStatistics;
import net.minecraft.util.MessageSerializer;

import java.io.IOException;

public class PacketEncoder extends MessageSerializer
{
    public PacketEncoder(NetworkStatistics p_i1182_1_) {
        super(p_i1182_1_);
    }

    public void a(io.netty.channel.ChannelHandlerContext arg1, net.minecraft.network.Packet arg2, io.netty.buffer.ByteBuf arg3) throws IOException{
       super.encode(arg1,arg2,arg3);
}
   public void encode(io.netty.channel.ChannelHandlerContext arg1,java.lang.Object arg2,io.netty.buffer.ByteBuf arg3)throws IOException{
       super.encode(arg1,arg2,arg3);
}
}