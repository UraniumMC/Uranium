package net.minecraft.server.v1_7_R4;
public class PacketPlayOutPosition extends net.minecraft.network.play.server.S08PacketPlayerPosLook implements Packet
{
    public PacketPlayOutPosition() {
    }

    public PacketPlayOutPosition(double p_i45164_1_, double p_i45164_3_, double p_i45164_5_, float p_i45164_7_, float p_i45164_8_, boolean p_i45164_9_) {
        super(p_i45164_1_, p_i45164_3_, p_i45164_5_, p_i45164_7_, p_i45164_8_, p_i45164_9_);
    }
}