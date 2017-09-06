package net.minecraft.server.v1_7_R4;
public class PacketPlayOutEntityDestroy extends net.minecraft.network.play.server.S13PacketDestroyEntities implements Packet
{
    public PacketPlayOutEntityDestroy() {
    }

    public PacketPlayOutEntityDestroy(int... p_i45211_1_) {
        super(p_i45211_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}