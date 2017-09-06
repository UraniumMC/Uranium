package net.minecraft.server.v1_7_R4;

import java.util.Map;

public class PacketPlayOutStatistic extends net.minecraft.network.play.server.S37PacketStatistics implements Packet
{
    public PacketPlayOutStatistic() {
    }

    public PacketPlayOutStatistic(Map p_i45173_1_) {
        super(p_i45173_1_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}