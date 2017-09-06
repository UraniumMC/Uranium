package net.minecraft.server.v1_7_R4;
public class PacketPlayInTabComplete extends net.minecraft.network.play.client.C14PacketTabComplete implements Packet
{
    public PacketPlayInTabComplete() {
    }

    public PacketPlayInTabComplete(String p_i45239_1_) {
        super(p_i45239_1_);
    }

    public void a(net.minecraft.network.play.INetHandlerPlayServer arg1){
       super.processPacket(arg1);
}
   public java.lang.String b(){
       return super.serialize();
}
   public java.lang.String c(){
       return super.func_149419_c();
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}