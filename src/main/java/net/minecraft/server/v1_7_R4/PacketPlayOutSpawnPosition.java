package net.minecraft.server.v1_7_R4;
public class PacketPlayOutSpawnPosition extends net.minecraft.network.play.server.S05PacketSpawnPosition implements Packet
{
    public PacketPlayOutSpawnPosition() {
    }

    public PacketPlayOutSpawnPosition(int p_i45229_1_, int p_i45229_2_, int p_i45229_3_) {
        super(p_i45229_1_, p_i45229_2_, p_i45229_3_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}