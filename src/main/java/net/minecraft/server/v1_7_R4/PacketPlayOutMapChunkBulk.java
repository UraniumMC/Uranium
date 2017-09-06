package net.minecraft.server.v1_7_R4;

import java.util.List;

public class PacketPlayOutMapChunkBulk extends net.minecraft.network.play.server.S26PacketMapChunkBulk implements Packet
{
    public PacketPlayOutMapChunkBulk() {
    }

    public PacketPlayOutMapChunkBulk(List p_i45197_1_) {
        super(p_i45197_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
   public int c(){
       return super.func_149258_c();
}
}