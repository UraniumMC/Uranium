package net.minecraft.server.v1_7_R4;
public class PacketPlayInHeldItemSlot extends net.minecraft.network.play.client.C09PacketHeldItemChange implements Packet
{
    public PacketPlayInHeldItemSlot() {
    }

    public PacketPlayInHeldItemSlot(int p_i45262_1_) {
        super(p_i45262_1_);
    }

   public int c(){
       return super.func_149614_c();
}
}