package net.minecraft.server.v1_7_R4;
public class BlockEnderPortal extends net.minecraft.block.BlockEndPortal
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1,int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.AxisAlignedBB arg5,java.util.List arg6,net.minecraft.entity.Entity arg7){
       super.addCollisionBoxesToList(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
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
   public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}