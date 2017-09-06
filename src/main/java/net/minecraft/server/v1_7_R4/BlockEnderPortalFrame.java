package net.minecraft.server.v1_7_R4;
public class BlockEnderPortalFrame extends net.minecraft.block.BlockEndPortalFrame
{

   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.AxisAlignedBB arg5,java.util.List arg6,net.minecraft.entity.Entity arg7){
       super.addCollisionBoxesToList(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int b(){
       return super.getRenderType();
}
   public boolean b(int arg1){
       return super.isEnderEyeInserted(arg1);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public void g(){
       super.setBlockBoundsForItemRender();
}
   public int g(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.getComparatorInputOverride(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public boolean isComplexRedstone(){
       return super.hasComparatorInputOverride();
}
   public void postPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.EntityLivingBase arg5,net.minecraft.item.ItemStack arg6){
       super.onBlockPlacedBy(arg1,arg2,arg3,arg4,arg5,arg6);
}
}