package net.minecraft.server.v1_7_R4;
public class BlockMinecartTrackAbstract extends net.minecraft.block.BlockRailBase
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public boolean a(net.minecraft.block.Block arg1){
       return super.func_150051_a(arg1);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6,net.minecraft.block.Block arg7){
       super.func_150048_a(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.Vec3 arg5,net.minecraft.util.Vec3 arg6){
       return super.collisionRayTrace(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,boolean arg5){
       super.func_150052_a(arg1,arg2,arg3,arg4,arg5);
}
   public int b(){
       return super.getRenderType();
}
   public boolean b_(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_150049_b_(arg1,arg2,arg3,arg4);
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
   public boolean e(){
       return super.isPowered();
}
   public int h(){
       return super.getMobilityFlag();
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