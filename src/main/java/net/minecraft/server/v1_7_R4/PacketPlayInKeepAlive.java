package net.minecraft.server.v1_7_R4;
public class PacketPlayInKeepAlive extends net.minecraft.network.play.client.C00PacketKeepAlive implements Packet
{
    public PacketPlayInKeepAlive() {
    }

    public PacketPlayInKeepAlive(int p_i45252_1_) {
        super(p_i45252_1_);
    }

    public boolean a(){
       return super.hasPriority();
}
   public int c(){
       return super.func_149460_c();
}
}