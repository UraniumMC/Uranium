package net.minecraft.server.v1_7_R4;
public class PacketPlayOutMap extends net.minecraft.network.play.server.S34PacketMaps implements Packet
{
    public PacketPlayOutMap() {
    }

    public PacketPlayOutMap(int p_i45202_1_, byte[] p_i45202_2_) {
        super(p_i45202_1_, p_i45202_2_);
    }

   public java.lang.String b(){
       return super.serialize();
}
}