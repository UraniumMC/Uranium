package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockHalfTransparent extends net.minecraft.block.BlockBreakable
{
    public BlockHalfTransparent(String p_i45411_1_, Material p_i45411_2_, boolean p_i45411_3_) {
        super(p_i45411_1_, p_i45411_2_, p_i45411_3_);
    }

    public boolean c(){
       return super.isOpaqueCube();
}
}