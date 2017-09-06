package net.minecraft.server.v1_7_R4;
public class BlockPistonExtension extends net.minecraft.block.BlockPistonExtension
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,net.minecraft.entity.player.EntityPlayer arg6){
       super.onBlockHarvested(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.AxisAlignedBB arg5,java.util.List arg6,net.minecraft.entity.Entity arg7){
       super.addCollisionBoxesToList(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int b(){
       return super.getRenderType();
}
   public int b(int arg1){
       return super.getDirectionMeta(arg1);
}
   public boolean c(){
       return super.isOpaqueCube();
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
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}