package net.minecraft.server.v1_7_R4;
public class PacketPlayOutOpenWindow extends net.minecraft.network.play.server.S2DPacketOpenWindow
{
    public PacketPlayOutOpenWindow() {
    }

    public PacketPlayOutOpenWindow(int p_i45184_1_, int p_i45184_2_, String p_i45184_3_, int p_i45184_4_, boolean p_i45184_5_) {
        super(p_i45184_1_, p_i45184_2_, p_i45184_3_, p_i45184_4_, p_i45184_5_);
    }

    public PacketPlayOutOpenWindow(int p_i45185_1_, int p_i45185_2_, String p_i45185_3_, int p_i45185_4_, boolean p_i45185_5_, int p_i45185_6_) {
        super(p_i45185_1_, p_i45185_2_, p_i45185_3_, p_i45185_4_, p_i45185_5_, p_i45185_6_);
    }

    public void a(net.minecraft.network.play.INetHandlerPlayClient arg1){
       super.processPacket(arg1);
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}