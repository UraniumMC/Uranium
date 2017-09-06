package net.minecraft.server.v1_7_R4;
public class PacketPlayOutOpenSignEditor extends net.minecraft.network.play.server.S36PacketSignEditorOpen
{
    public PacketPlayOutOpenSignEditor() {
    }

    public PacketPlayOutOpenSignEditor(int p_i45207_1_, int p_i45207_2_, int p_i45207_3_) {
        super(p_i45207_1_, p_i45207_2_, p_i45207_3_);
    }

    public void a(net.minecraft.network.play.INetHandlerPlayClient arg1){
       super.processPacket(arg1);
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}