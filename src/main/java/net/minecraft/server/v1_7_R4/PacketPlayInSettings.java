package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;

public class PacketPlayInSettings extends net.minecraft.network.play.client.C15PacketClientSettings implements Packet
{
    public PacketPlayInSettings() {
    }

    public PacketPlayInSettings(String p_i45243_1_, int p_i45243_2_, EntityPlayer.EnumChatVisibility p_i45243_3_, boolean p_i45243_4_, EnumDifficulty p_i45243_5_, boolean p_i45243_6_) {
        super(p_i45243_1_, p_i45243_2_, p_i45243_3_, p_i45243_4_, p_i45243_5_, p_i45243_6_);
    }

    public java.lang.String b(){
       return super.serialize();
}
   public java.lang.String c(){
       return super.func_149524_c();
}
   public net.minecraft.entity.player.EntityPlayer.EnumChatVisibility e(){
       return super.func_149523_e();
}
   public boolean f(){
       return super.func_149520_f();
}
   public net.minecraft.world.EnumDifficulty g(){
       return super.func_149518_g();
}
   public boolean h(){
       return super.func_149519_h();
}
}