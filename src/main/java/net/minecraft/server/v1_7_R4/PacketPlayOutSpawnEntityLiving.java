package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.EntityLivingBase;

public class PacketPlayOutSpawnEntityLiving extends net.minecraft.network.play.server.S0FPacketSpawnMob implements Packet
{
    public PacketPlayOutSpawnEntityLiving() {
    }

    public PacketPlayOutSpawnEntityLiving(EntityLivingBase p_i45192_1_) {
        super(p_i45192_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}