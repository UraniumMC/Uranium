package net.minecraft.server.v1_7_R4;

import net.minecraft.block.*;

public class BlockActionData extends net.minecraft.block.BlockEventData
{
    public BlockActionData(int p_i45362_1_, int p_i45362_2_, int p_i45362_3_, net.minecraft.block.Block p_i45362_4_, int p_i45362_5_, int p_i45362_6_) {
        super(p_i45362_1_, p_i45362_2_, p_i45362_3_, p_i45362_4_, p_i45362_5_, p_i45362_6_);
    }

    public int a(){
       return super.func_151340_a();
}
   public int b(){
       return super.func_151342_b();
}
   public int c(){
       return super.func_151341_c();
}
   public int d(){
       return super.getEventID();
}
   public int e(){
       return super.getEventParameter();
}
   public net.minecraft.block.Block f(){
       return super.getBlock();
}
}