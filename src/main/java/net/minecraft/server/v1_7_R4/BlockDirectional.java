package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockDirectional extends net.minecraft.block.BlockDirectional
{
    public BlockDirectional(Material p_i45401_1_) {
        super(p_i45401_1_);
    }

    public int l(int arg1){
       return super.getDirection(arg1);
}
}