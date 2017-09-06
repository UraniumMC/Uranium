package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayOutEntityVelocity extends net.minecraft.network.play.server.S12PacketEntityVelocity implements Packet
{
    public PacketPlayOutEntityVelocity() {
    }

    public PacketPlayOutEntityVelocity(Entity p_i45219_1_) {
        super(p_i45219_1_);
    }

    public PacketPlayOutEntityVelocity(int p_i45220_1_, double p_i45220_2_, double p_i45220_4_, double p_i45220_6_) {
        super(p_i45220_1_, p_i45220_2_, p_i45220_4_, p_i45220_6_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}