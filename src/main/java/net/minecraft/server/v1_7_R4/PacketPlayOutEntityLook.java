package net.minecraft.server.v1_7_R4;
public class PacketPlayOutEntityLook extends net.minecraft.network.play.server.S14PacketEntity.S16PacketEntityLook implements Packet
{
    public PacketPlayOutEntityLook() {
    }

    public PacketPlayOutEntityLook(int p_i45205_1_, byte p_i45205_2_, byte p_i45205_3_) {
        super(p_i45205_1_, p_i45205_2_, p_i45205_3_);
    }

   public java.lang.String b(){
       return super.serialize();
}
}