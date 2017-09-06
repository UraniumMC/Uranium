package net.minecraft.server.v1_7_R4;

import net.minecraft.world.chunk.Chunk;

public class PacketPlayOutMultiBlockChange extends net.minecraft.network.play.server.S22PacketMultiBlockChange implements Packet
{
    public PacketPlayOutMultiBlockChange() {
    }

    public PacketPlayOutMultiBlockChange(int p_i45181_1_, short[] p_i45181_2_, Chunk p_i45181_3_) {
        super(p_i45181_1_, p_i45181_2_, p_i45181_3_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}