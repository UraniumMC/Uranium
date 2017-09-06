package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.*;

public class BlockTrapdoor extends net.minecraft.block.BlockTrapDoor
{
    public BlockTrapdoor(net.minecraft.block.material.Material p_i45434_1_) {
        super(p_i45434_1_);
    }

   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.Vec3 arg5,net.minecraft.util.Vec3 arg6){
       return super.collisionRayTrace(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void attack(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5){
       super.onBlockClicked(arg1,arg2,arg3,arg4,arg5);
}
   public int b(){
       return super.getRenderType();
}
   public void b(int arg1){
       super.func_150117_b(arg1);
}
   public boolean b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getBlocksMovement(arg1,arg2,arg3,arg4);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.canPlaceBlockOnSide(arg1,arg2,arg3,arg4,arg5);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public boolean d(int arg1){
       return super.func_150118_d(arg1);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public void g(){
       super.setBlockBoundsForItemRender();
}
   public int getPlacedData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,float arg7,float arg8,int arg9){
       return super.onBlockPlaced(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void setOpen(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,boolean arg5){
       super.func_150120_a(arg1,arg2,arg3,arg4,arg5);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}