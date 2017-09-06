package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.item.EntityPainting;

public class PacketPlayOutSpawnEntityPainting extends net.minecraft.network.play.server.S10PacketSpawnPainting implements Packet
{
    public PacketPlayOutSpawnEntityPainting() {
    }

    public PacketPlayOutSpawnEntityPainting(EntityPainting p_i45170_1_) {
        super(p_i45170_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}