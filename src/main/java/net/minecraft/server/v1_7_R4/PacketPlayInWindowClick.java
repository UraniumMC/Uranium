package net.minecraft.server.v1_7_R4;

import net.minecraft.item.ItemStack;

public class PacketPlayInWindowClick extends net.minecraft.network.play.client.C0EPacketClickWindow implements Packet
{
    public PacketPlayInWindowClick() {
    }

    public PacketPlayInWindowClick(int p_i45246_1_, int p_i45246_2_, int p_i45246_3_, int p_i45246_4_, ItemStack p_i45246_5_, short p_i45246_6_) {
        super(p_i45246_1_, p_i45246_2_, p_i45246_3_, p_i45246_4_, p_i45246_5_, p_i45246_6_);
    }

    public java.lang.String b(){
       return super.serialize();
}
   public int c(){
       return super.func_149548_c();
}
   public int d(){
       return super.func_149544_d();
}
   public int e(){
       return super.func_149543_e();
}
   public short f(){
       return super.func_149547_f();
}
   public net.minecraft.item.ItemStack g(){
       return super.func_149546_g();
}
   public int h(){
       return super.func_149542_h();
}
}