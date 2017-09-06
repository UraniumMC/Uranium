package net.minecraft.server.v1_7_R4;

import net.minecraft.scoreboard.ScorePlayerTeam;

import java.util.Collection;

public class PacketPlayOutScoreboardTeam extends net.minecraft.network.play.server.S3EPacketTeams implements Packet
{
    public PacketPlayOutScoreboardTeam() {
    }

    public PacketPlayOutScoreboardTeam(ScorePlayerTeam p_i45225_1_, int p_i45225_2_) {
        super(p_i45225_1_, p_i45225_2_);
    }

    public PacketPlayOutScoreboardTeam(ScorePlayerTeam p_i45226_1_, Collection p_i45226_2_, int p_i45226_3_) {
        super(p_i45226_1_, p_i45226_2_, p_i45226_3_);
    }
}