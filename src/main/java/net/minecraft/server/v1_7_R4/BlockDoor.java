package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockDoor extends net.minecraft.block.BlockDoor
{
    public BlockDoor(Material p_i45402_1_) {
        super(p_i45402_1_);
    }

    public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1, int arg2, int arg3, int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,net.minecraft.entity.player.EntityPlayer arg6){
       super.onBlockHarvested(arg1,arg2,arg3,arg4,arg5,arg6);
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
   public boolean b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getBlocksMovement(arg1,arg2,arg3,arg4);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canPlaceBlockAt(arg1,arg2,arg3,arg4);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public int e(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.func_150013_e(arg1,arg2,arg3,arg4);
}
   public boolean f(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.func_150015_f(arg1,arg2,arg3,arg4);
}
   public int g(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.func_150012_g(arg1,arg2,arg3,arg4);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public int h(){
       return super.getMobilityFlag();
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void setDoor(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,boolean arg5){
       super.func_150014_a(arg1,arg2,arg3,arg4,arg5);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}