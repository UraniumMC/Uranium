package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.MapColor;

public class BlockOreBlock extends net.minecraft.block.BlockCompressed
{
    public BlockOreBlock(MapColor p_i45414_1_) {
        super(p_i45414_1_);
    }

    public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
}