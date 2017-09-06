package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.*;

public class BlockThin extends net.minecraft.block.BlockPane
{
    public BlockThin(String p_i45432_1_, String p_i45432_2_, net.minecraft.block.material.Material p_i45432_3_, boolean p_i45432_4_) {
        super(p_i45432_1_, p_i45432_2_, p_i45432_3_, p_i45432_4_);
    }

    public boolean E(){
       return super.canSilkHarvest();
}
   public boolean a(net.minecraft.block.Block arg1){
       return super.canPaneConnectToBlock(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.AxisAlignedBB arg5,java.util.List arg6,net.minecraft.entity.Entity arg7){
       super.addCollisionBoxesToList(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int b(){
       return super.getRenderType();
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public void g(){
       super.setBlockBoundsForItemRender();
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public net.minecraft.item.ItemStack j(int arg1){
       return super.createStackedBlock(arg1);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}