package net.minecraft.server.v1_7_R4;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class PacketDecrypter extends net.minecraft.network.NettyEncryptingDecoder
{
    public PacketDecrypter(Cipher p_i45141_1_) {
        super(p_i45141_1_);
    }

    public void a(io.netty.channel.ChannelHandlerContext arg1, io.netty.buffer.ByteBuf arg2, java.util.List arg3) throws ShortBufferException{
       super.decode(arg1,arg2,arg3);
}
   public void decode(io.netty.channel.ChannelHandlerContext arg1,java.lang.Object arg2,java.util.List arg3)throws ShortBufferException{
       super.decode(arg1,arg2,arg3);
}
}