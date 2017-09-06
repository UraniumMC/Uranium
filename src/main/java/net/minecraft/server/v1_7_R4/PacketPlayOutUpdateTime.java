package net.minecraft.server.v1_7_R4;
public class PacketPlayOutUpdateTime extends net.minecraft.network.play.server.S03PacketTimeUpdate
{
    public PacketPlayOutUpdateTime() {
    }

    public PacketPlayOutUpdateTime(long p_i45230_1_, long p_i45230_3_, boolean p_i45230_5_) {
        super(p_i45230_1_, p_i45230_3_, p_i45230_5_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}