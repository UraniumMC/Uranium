package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockGlass extends net.minecraft.block.BlockGlass
{
    public BlockGlass(Material p_i45408_1_, boolean p_i45408_2_) {
        super(p_i45408_1_, p_i45408_2_);
    }

    public boolean E(){
       return super.canSilkHarvest();
}
   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
}