package net.minecraft.server.v1_7_R4;

import net.minecraft.scoreboard.Score;

public class PacketPlayOutScoreboardScore extends net.minecraft.network.play.server.S3CPacketUpdateScore implements Packet
{
    public PacketPlayOutScoreboardScore() {
    }

    public PacketPlayOutScoreboardScore(Score p_i45227_1_, int p_i45227_2_) {
        super(p_i45227_1_, p_i45227_2_);
    }

    public PacketPlayOutScoreboardScore(String p_i45228_1_) {
        super(p_i45228_1_);
    }
}