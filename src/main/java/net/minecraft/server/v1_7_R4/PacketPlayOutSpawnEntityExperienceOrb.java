package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.item.EntityXPOrb;

public class PacketPlayOutSpawnEntityExperienceOrb extends net.minecraft.network.play.server.S11PacketSpawnExperienceOrb implements Packet
{
    public PacketPlayOutSpawnEntityExperienceOrb() {
    }

    public PacketPlayOutSpawnEntityExperienceOrb(EntityXPOrb p_i45167_1_) {
        super(p_i45167_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}