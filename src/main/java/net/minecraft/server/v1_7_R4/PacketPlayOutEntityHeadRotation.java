package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayOutEntityHeadRotation extends net.minecraft.network.play.server.S19PacketEntityHeadLook implements Packet
{
    public PacketPlayOutEntityHeadRotation() {
    }

    public PacketPlayOutEntityHeadRotation(Entity p_i45214_1_, byte p_i45214_2_) {
        super(p_i45214_1_, p_i45214_2_);
    }

    public java.lang.String b(){
       return super.serialize();
    }
}