package net.minecraft.server.v1_7_R4;
public class PacketPlayOutEntity extends net.minecraft.network.play.server.S14PacketEntity implements Packet
{
    public PacketPlayOutEntity() {
    }

    public PacketPlayOutEntity(int p_i45206_1_) {
        super(p_i45206_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}