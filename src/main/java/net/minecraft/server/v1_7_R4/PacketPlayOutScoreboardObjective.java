package net.minecraft.server.v1_7_R4;

import net.minecraft.scoreboard.ScoreObjective;

public class PacketPlayOutScoreboardObjective extends net.minecraft.network.play.server.S3BPacketScoreboardObjective implements Packet
{
    public PacketPlayOutScoreboardObjective() {
    }

    public PacketPlayOutScoreboardObjective(ScoreObjective p_i45224_1_, int p_i45224_2_) {
        super(p_i45224_1_, p_i45224_2_);
    }
}