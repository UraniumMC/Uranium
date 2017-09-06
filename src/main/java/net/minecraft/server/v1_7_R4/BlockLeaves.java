package net.minecraft.server.v1_7_R4;
public class BlockLeaves extends net.minecraft.block.BlockLeaves
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,net.minecraft.entity.player.EntityPlayer arg2,int arg3,int arg4,int arg5,int arg6){
       super.harvestBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public int b(int arg1){
       return super.func_150123_b(arg1);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public void c(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6){
       super.func_150124_c(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public java.lang.String[] e(){
       return super.func_150125_e();
}
   public void e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.removeLeaves(arg1,arg2,arg3,arg4);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public net.minecraft.item.ItemStack j(int arg1){
       return super.createStackedBlock(arg1);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}