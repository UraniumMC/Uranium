package net.minecraft.server.v1_7_R4;
public class BlockTripwire extends net.minecraft.block.BlockTripWire
{

   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,net.minecraft.entity.player.EntityPlayer arg6){
       super.onBlockHarvested(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5){
       super.onEntityCollidedWithBlock(arg1,arg2,arg3,arg4,arg5);
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
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}