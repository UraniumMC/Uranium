package net.minecraft.server.v1_7_R4;

import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;

public class PacketPlayOutRespawn extends net.minecraft.network.play.server.S07PacketRespawn implements Packet
{
    public PacketPlayOutRespawn() {
    }

    public PacketPlayOutRespawn(int p_i45213_1_, EnumDifficulty p_i45213_2_, WorldType p_i45213_3_, WorldSettings.GameType p_i45213_4_) {
        super(p_i45213_1_, p_i45213_2_, p_i45213_3_, p_i45213_4_);
    }
}