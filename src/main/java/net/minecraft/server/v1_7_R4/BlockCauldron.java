package net.minecraft.server.v1_7_R4;
public class BlockCauldron extends net.minecraft.block.BlockCauldron
{

   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.func_150024_a(arg1,arg2,arg3,arg4,arg5);
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
   public int b(int arg1){
       return super.func_150027_b(arg1);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean d(){
       return super.renderAsNormalBlock();
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
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public boolean isComplexRedstone(){
       return super.hasComparatorInputOverride();
}
   public void l(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.fillWithRain(arg1,arg2,arg3,arg4);
}
}