package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockHugeMushroom extends net.minecraft.block.BlockHugeMushroom
{
    public BlockHugeMushroom(Material p_i45412_1_, int p_i45412_2_) {
        super(p_i45412_1_, p_i45412_2_);
    }

    public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}