package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.*;

public class BlockStainedGlass extends net.minecraft.block.BlockStainedGlass
{
    public BlockStainedGlass(net.minecraft.block.material.Material p_i45427_1_) {
        super(p_i45427_1_);
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
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
}