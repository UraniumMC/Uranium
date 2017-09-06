package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayInEntityAction extends net.minecraft.network.play.client.C0BPacketEntityAction implements Packet
{
    public PacketPlayInEntityAction() {
    }

    public PacketPlayInEntityAction(Entity p_i45259_1_, int p_i45259_2_) {
        super(p_i45259_1_, p_i45259_2_);
    }

    public PacketPlayInEntityAction(Entity p_i45260_1_, int p_i45260_2_, int p_i45260_3_) {
        super(p_i45260_1_, p_i45260_2_, p_i45260_3_);
    }

}