package net.minecraft.server.v1_7_R4;
public class PacketPlayInSteerVehicle extends net.minecraft.network.play.client.C0CPacketInput implements Packet
{
    public PacketPlayInSteerVehicle() {
    }

    public PacketPlayInSteerVehicle(float p_i45261_1_, float p_i45261_2_, boolean p_i45261_3_, boolean p_i45261_4_) {
        super(p_i45261_1_, p_i45261_2_, p_i45261_3_, p_i45261_4_);
    }

    public float c(){
       return super.func_149620_c();
}
   public float d(){
       return super.func_149616_d();
}
   public boolean e(){
       return super.func_149618_e();
}
   public boolean f(){
       return super.func_149617_f();
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}