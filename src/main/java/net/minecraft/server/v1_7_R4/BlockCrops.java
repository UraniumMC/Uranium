package net.minecraft.server.v1_7_R4;
public class BlockCrops extends net.minecraft.block.BlockCrops
{

   public net.minecraft.item.Item P(){
       return super.func_149865_P();
}
   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public boolean a(net.minecraft.block.Block arg1){
       return super.canPlaceBlockOn(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,boolean arg5){
       return super.func_149851_a(arg1,arg2,arg3,arg4,arg5);
}
   public boolean a(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4,int arg5){
       return super.func_149852_a(arg1,arg2,arg3,arg4,arg5);
}
   public int b(){
       return super.getRenderType();
}
   public void b(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4,int arg5){
       super.func_149853_b(arg1,arg2,arg3,arg4,arg5);
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public net.minecraft.item.Item i(){
       return super.func_149866_i();
}
   public void m(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_149863_m(arg1,arg2,arg3,arg4);
}
   public float n(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_149864_n(arg1,arg2,arg3,arg4);
}
}