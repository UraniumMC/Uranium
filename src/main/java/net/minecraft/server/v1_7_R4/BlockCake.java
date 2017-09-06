package net.minecraft.server.v1_7_R4;
public class BlockCake extends net.minecraft.block.BlockCake
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void attack(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5){
       super.onBlockClicked(arg1,arg2,arg3,arg4,arg5);
}
   public void b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5){
       super.func_150036_b(arg1,arg2,arg3,arg4,arg5);
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
   public void g(){
       super.setBlockBoundsForItemRender();
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public boolean j(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canBlockStay(arg1,arg2,arg3,arg4);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}