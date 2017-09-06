package net.minecraft.server.v1_7_R4;

import net.minecraft.block.*;

public class NextTickListEntry extends net.minecraft.world.NextTickListEntry
{
    public NextTickListEntry(int p_i45370_1_, int p_i45370_2_, int p_i45370_3_, net.minecraft.block.Block p_i45370_4_) {
        super(p_i45370_1_, p_i45370_2_, p_i45370_3_, p_i45370_4_);
    }

    public net.minecraft.block.Block a(){
       return super.func_151351_a();
}
   public void a(int arg1){
       super.setPriority(arg1);
}
   public net.minecraft.world.NextTickListEntry a(long arg1){
       super.setScheduledTime(arg1);
       return this;
}
   public int compareTo(net.minecraft.world.NextTickListEntry arg1){
       return super.compareTo(arg1);
}
}