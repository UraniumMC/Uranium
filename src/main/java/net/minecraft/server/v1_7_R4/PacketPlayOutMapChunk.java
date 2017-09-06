package net.minecraft.server.v1_7_R4;

import net.minecraft.world.chunk.Chunk;

public class PacketPlayOutMapChunk extends net.minecraft.network.play.server.S21PacketChunkData implements Packet
{
    public PacketPlayOutMapChunk() {
    }

    public PacketPlayOutMapChunk(Chunk p_i45196_1_, boolean p_i45196_2_, int p_i45196_3_) {
        super(p_i45196_1_, p_i45196_2_, p_i45196_3_);
    }

    public Extracted a(net.minecraft.world.chunk.Chunk arg1, boolean arg2, int arg3){
       return super.func_149269_a(arg1,arg2,arg3);
}
   public java.lang.String b(){
       return super.serialize();
}
   public int c(){
       return super.func_149275_c();
}
}