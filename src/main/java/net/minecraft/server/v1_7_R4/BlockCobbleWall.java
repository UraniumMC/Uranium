package net.minecraft.server.v1_7_R4;

import net.minecraft.block.*;

public class BlockCobbleWall extends net.minecraft.block.BlockWall
{
    public BlockCobbleWall(net.minecraft.block.Block p_i45435_1_) {
        super(p_i45435_1_);
    }

    public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1, int arg2, int arg3, int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public int b(){
       return super.getRenderType();
}
   public boolean b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getBlocksMovement(arg1,arg2,arg3,arg4);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public boolean e(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.canConnectWallTo(arg1,arg2,arg3,arg4);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}