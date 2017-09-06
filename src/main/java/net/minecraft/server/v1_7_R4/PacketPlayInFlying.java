package net.minecraft.server.v1_7_R4;
public class PacketPlayInFlying extends net.minecraft.network.play.client.C03PacketPlayer implements Packet
{
    public PacketPlayInFlying() {
    }

    public PacketPlayInFlying(boolean p_i45256_1_) {
        super(p_i45256_1_);
    }

    public double c(){
       return super.func_149464_c();
}
   public double d(){
       return super.func_149467_d();
}
   public double e(){
       return super.func_149472_e();
}
   public double f(){
       return super.func_149471_f();
}
   public float g(){
       return super.func_149462_g();
}
   public float h(){
       return super.func_149470_h();
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
   public boolean i(){
       return super.func_149465_i();
}
   public boolean j(){
       return super.func_149466_j();
}
   public boolean k(){
       return super.func_149463_k();
}
}