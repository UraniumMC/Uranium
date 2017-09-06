package net.minecraft.server.v1_7_R4;
public class BlockFire extends net.minecraft.block.BlockFire
{

   public boolean L(){
       return super.func_149698_L();
}
   public void a(int arg1,int arg2,int arg3){
       super.func_149842_a(arg1,arg2,arg3);
}
   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public int a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149846_a(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,java.util.Random arg6,int arg7){
       super.tryCatchFire(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public int b(){
       return super.getRenderType();
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
   public void e(){
       super.func_149843_e();
}
   public boolean e(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.canBlockCatchFire(arg1,arg2,arg3,arg4);
}
   public boolean e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canNeighborBurn(arg1,arg2,arg3,arg4);
}
   public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
   public int m(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getChanceOfNeighborsEncouragingFire(arg1,arg2,arg3,arg4);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public boolean v(){
       return super.isCollidable();
}
}