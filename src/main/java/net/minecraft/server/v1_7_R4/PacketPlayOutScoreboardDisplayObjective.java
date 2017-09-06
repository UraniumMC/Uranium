package net.minecraft.server.v1_7_R4;

import net.minecraft.scoreboard.ScoreObjective;

public class PacketPlayOutScoreboardDisplayObjective extends net.minecraft.network.play.server.S3DPacketDisplayScoreboard implements Packet
{
    public PacketPlayOutScoreboardDisplayObjective() {
    }

    public PacketPlayOutScoreboardDisplayObjective(int p_i45216_1_, ScoreObjective p_i45216_2_) {
        super(p_i45216_1_, p_i45216_2_);
    }
}