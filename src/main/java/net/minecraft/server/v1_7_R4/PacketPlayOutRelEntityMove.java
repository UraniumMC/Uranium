package net.minecraft.server.v1_7_R4;
public class PacketPlayOutRelEntityMove extends net.minecraft.network.play.server.S14PacketEntity.S15PacketEntityRelMove implements Packet
{
    public PacketPlayOutRelEntityMove() {
    }

    public PacketPlayOutRelEntityMove(int p_i45203_1_, byte p_i45203_2_, byte p_i45203_3_, byte p_i45203_4_) {
        super(p_i45203_1_, p_i45203_2_, p_i45203_3_, p_i45203_4_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}