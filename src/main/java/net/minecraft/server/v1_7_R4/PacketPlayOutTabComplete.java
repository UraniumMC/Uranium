package net.minecraft.server.v1_7_R4;
public class PacketPlayOutTabComplete extends net.minecraft.network.play.server.S3APacketTabComplete implements Packet
{
    public PacketPlayOutTabComplete() {
    }

    public PacketPlayOutTabComplete(String[] p_i45178_1_) {
        super(p_i45178_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}