package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayOutSpawnEntity extends net.minecraft.network.play.server.S0EPacketSpawnObject implements Packet
{
    public PacketPlayOutSpawnEntity() {
    }

    public PacketPlayOutSpawnEntity(Entity p_i45165_1_, int p_i45165_2_) {
        super(p_i45165_1_, p_i45165_2_);
    }

    public PacketPlayOutSpawnEntity(Entity p_i45166_1_, int p_i45166_2_, int p_i45166_3_) {
        super(p_i45166_1_, p_i45166_2_, p_i45166_3_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}