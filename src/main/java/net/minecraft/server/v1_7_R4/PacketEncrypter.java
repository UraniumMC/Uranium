package net.minecraft.server.v1_7_R4;

import javax.crypto.Cipher;
import java.io.IOException;

public class PacketEncrypter extends net.minecraft.network.NettyEncryptingEncoder
{
    public PacketEncrypter(Cipher p_i45142_1_) {
        super(p_i45142_1_);
    }

    public void a(io.netty.channel.ChannelHandlerContext arg1, io.netty.buffer.ByteBuf arg2, io.netty.buffer.ByteBuf arg3) throws Exception{
       super.encode(arg1,arg2,arg3);
}
   public void encode(io.netty.channel.ChannelHandlerContext arg1,java.lang.Object arg2,io.netty.buffer.ByteBuf arg3) throws Exception{
       super.encode(arg1,arg2,arg3);
}
}