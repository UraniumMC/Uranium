package net.minecraft.server.v1_7_R4;
public class BlockSkull extends net.minecraft.block.BlockSkull
{

   public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1,int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,net.minecraft.entity.player.EntityPlayer arg6){
       super.onBlockHarvested(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.tileentity.TileEntitySkull arg5){
       super.func_149965_a(arg1,arg2,arg3,arg4,arg5);
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
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public int getDropData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getDamageValue(arg1,arg2,arg3,arg4);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
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