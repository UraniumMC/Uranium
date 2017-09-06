package net.minecraft.server.v1_7_R4;
public class BlockPressurePlateAbstract extends net.minecraft.block.BlockBasePressurePlate
{

   public net.minecraft.util.AxisAlignedBB a(int arg1,int arg2,int arg3){
       return super.func_150061_a(arg1,arg2,arg3);
}
   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.func_150062_a(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5){
       super.onEntityCollidedWithBlock(arg1,arg2,arg3,arg4,arg5);
}
   public void a_(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_150064_a_(arg1,arg2,arg3,arg4);
}
   public void b(int arg1){
       super.func_150063_b(arg1);
}
   public boolean b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getBlocksMovement(arg1,arg2,arg3,arg4);
}
   public int b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingWeakPower(arg1,arg2,arg3,arg4,arg5);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public int c(int arg1){
       return super.func_150060_c(arg1);
}
   public int c(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingStrongPower(arg1,arg2,arg3,arg4,arg5);
}
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canPlaceBlockAt(arg1,arg2,arg3,arg4);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public int d(int arg1){
       return super.func_150066_d(arg1);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public int e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_150065_e(arg1,arg2,arg3,arg4);
}
   public void g(){
       super.setBlockBoundsForItemRender();
}
   public int h(){
       return super.getMobilityFlag();
}
   public boolean isPowerSource(){
       return super.canProvidePower();
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}