package net.minecraft.server.v1_7_R4;
public class PacketPlayOutKeepAlive extends net.minecraft.network.play.server.S00PacketKeepAlive implements Packet
{
    public PacketPlayOutKeepAlive() {
    }

    public PacketPlayOutKeepAlive(int p_i45195_1_) {
        super(p_i45195_1_);
    }

    public boolean a(){
       return super.hasPriority();
}
}