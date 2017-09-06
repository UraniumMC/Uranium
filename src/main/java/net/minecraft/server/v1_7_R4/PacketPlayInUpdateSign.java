package net.minecraft.server.v1_7_R4;
public class PacketPlayInUpdateSign extends net.minecraft.network.play.client.C12PacketUpdateSign implements Packet
{
    public PacketPlayInUpdateSign() {
    }

    public PacketPlayInUpdateSign(int p_i45264_1_, int p_i45264_2_, int p_i45264_3_, String[] p_i45264_4_) {
        super(p_i45264_1_, p_i45264_2_, p_i45264_3_, p_i45264_4_);
    }

    public int c(){
       return super.func_149588_c();
}
   public int d(){
       return super.func_149586_d();
}
   public int e(){
       return super.func_149585_e();
}
   public java.lang.String[] f(){
       return super.func_149589_f();
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}