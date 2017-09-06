package net.minecraft.server.v1_7_R4;
public class PacketPlayInPosition extends net.minecraft.network.play.client.C03PacketPlayer.C04PacketPlayerPosition implements Packet
{
    public PacketPlayInPosition() {
    }

    public PacketPlayInPosition(double p_i45253_1_, double p_i45253_3_, double p_i45253_5_, double p_i45253_7_, boolean p_i45253_9_) {
        super(p_i45253_1_, p_i45253_3_, p_i45253_5_, p_i45253_7_, p_i45253_9_);
    }
}