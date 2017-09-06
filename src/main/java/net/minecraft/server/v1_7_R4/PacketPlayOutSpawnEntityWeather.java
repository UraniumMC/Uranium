package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayOutSpawnEntityWeather extends net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity
{
    public PacketPlayOutSpawnEntityWeather() {
    }

    public PacketPlayOutSpawnEntityWeather(Entity p_i45191_1_) {
        super(p_i45191_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}