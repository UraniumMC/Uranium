package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockPressurePlateBinary extends net.minecraft.block.BlockPressurePlate
{
    public BlockPressurePlateBinary(String p_i45418_1_, Material p_i45418_2_, Sensitivity p_i45418_3_) {
        super(p_i45418_1_, p_i45418_2_, p_i45418_3_);
    }

    public int c(int arg1){
       return super.func_150060_c(arg1);
}
   public int d(int arg1){
       return super.func_150066_d(arg1);
}
   public int e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_150065_e(arg1,arg2,arg3,arg4);
}
}