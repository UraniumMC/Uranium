package net.minecraft.server.v1_7_R4;
public class BlockLever extends net.minecraft.block.BlockLever
{

   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public int b(){
       return super.getRenderType();
}
   public int b(int arg1){
       return super.invertMetadata(arg1);
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
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.canPlaceBlockOnSide(arg1,arg2,arg3,arg4,arg5);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public boolean e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_149820_e(arg1,arg2,arg3,arg4);
}
   public int getPlacedData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,float arg7,float arg8,int arg9){
       return super.onBlockPlaced(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public boolean isPowerSource(){
       return super.canProvidePower();
}
   public void postPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.EntityLivingBase arg5,net.minecraft.item.ItemStack arg6){
       super.onBlockPlacedBy(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}