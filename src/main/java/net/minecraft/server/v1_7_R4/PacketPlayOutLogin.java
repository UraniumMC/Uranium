package net.minecraft.server.v1_7_R4;

import net.minecraft.world.*;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;

public class PacketPlayOutLogin extends net.minecraft.network.play.server.S01PacketJoinGame implements Packet
{
    public PacketPlayOutLogin() {
    }

    public PacketPlayOutLogin(int p_i45201_1_, WorldSettings.GameType p_i45201_2_, boolean p_i45201_3_, int p_i45201_4_, EnumDifficulty p_i45201_5_, int p_i45201_6_, WorldType p_i45201_7_) {
        super(p_i45201_1_, p_i45201_2_, p_i45201_3_, p_i45201_4_, p_i45201_5_, p_i45201_6_, p_i45201_7_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}