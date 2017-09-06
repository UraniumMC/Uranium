package net.minecraft.server.v1_7_R4;

import net.minecraft.util.IChatComponent;

public class PacketPlayOutChat extends net.minecraft.network.play.server.S02PacketChat implements Packet
{
    public PacketPlayOutChat() {
    }

    public PacketPlayOutChat(IChatComponent p_i45179_1_) {
        super(p_i45179_1_);
    }

    public PacketPlayOutChat(IChatComponent p_i45180_1_, boolean p_i45180_2_) {
        super(p_i45180_1_, p_i45180_2_);
    }

    public java.lang.String b(){
       return super.serialize();
}
   public boolean d(){
       return super.func_148916_d();
}
}