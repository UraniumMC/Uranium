package net.minecraft.server.v1_7_R4;
public class BlockRedstoneWire extends net.minecraft.block.BlockRedstoneWire
{

   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6,int arg7){
       super.func_150175_a(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int b(){
       return super.getRenderType();
}
   public int b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingWeakPower(arg1,arg2,arg3,arg4,arg5);
}
   public boolean c(){
       return super.isOpaqueCube();
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
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public void e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_150177_e(arg1,arg2,arg3,arg4);
}
   public boolean f(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isPowerProviderOrWire(arg1,arg2,arg3,arg4,arg5);
}
   public boolean g(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_150176_g(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public int getPower(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_150178_a(arg1,arg2,arg3,arg4,arg5);
}
   public boolean isPowerSource(){
       return super.canProvidePower();
}
   public void m(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_150172_m(arg1,arg2,arg3,arg4);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}