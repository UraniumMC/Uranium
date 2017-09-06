package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.*;

public class BlockTransparent extends net.minecraft.block.BlockLeavesBase
{
    public BlockTransparent(net.minecraft.block.material.Material p_i45433_1_, boolean p_i45433_2_) {
        super(p_i45433_1_, p_i45433_2_);
    }

    public boolean c(){
       return super.isOpaqueCube();
}
}