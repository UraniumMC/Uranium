package net.minecraft.server.v1_7_R4;
public class PacketPlayInTransaction extends net.minecraft.network.play.client.C0FPacketConfirmTransaction implements Packet
{
    public PacketPlayInTransaction() {
    }

    public PacketPlayInTransaction(int p_i45244_1_, short p_i45244_2_, boolean p_i45244_3_) {
        super(p_i45244_1_, p_i45244_2_, p_i45244_3_);
    }

    public void a(net.minecraft.network.play.INetHandlerPlayServer arg1){
       super.processPacket(arg1);
}
   public java.lang.String b(){
       return super.serialize();
}
   public int c(){
       return super.func_149532_c();
}
   public short d(){
       return super.func_149533_d();
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}