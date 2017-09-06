package net.minecraft.server.v1_7_R4;
public class PacketPlayOutRelEntityMoveLook extends net.minecraft.network.play.server.S14PacketEntity.S17PacketEntityLookMove implements Packet
{
    public PacketPlayOutRelEntityMoveLook() {
    }

    public PacketPlayOutRelEntityMoveLook(int p_i45204_1_, byte p_i45204_2_, byte p_i45204_3_, byte p_i45204_4_, byte p_i45204_5_, byte p_i45204_6_) {
        super(p_i45204_1_, p_i45204_2_, p_i45204_3_, p_i45204_4_, p_i45204_5_, p_i45204_6_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}