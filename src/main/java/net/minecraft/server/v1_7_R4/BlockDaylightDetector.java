package net.minecraft.server.v1_7_R4;
public class BlockDaylightDetector extends net.minecraft.block.BlockDaylightDetector
{

   public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1,int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public int b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingWeakPower(arg1,arg2,arg3,arg4,arg5);
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
   public void e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_149957_e(arg1,arg2,arg3,arg4);
}
   public boolean isPowerSource(){
       return super.canProvidePower();
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}