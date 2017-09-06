package net.minecraft.server.v1_7_R4;
public class BlockMushroom extends net.minecraft.block.BlockMushroom
{

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
   public void b(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4,int arg5){
       super.func_149853_b(arg1,arg2,arg3,arg4,arg5);
}
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canPlaceBlockAt(arg1,arg2,arg3,arg4);
}
   public boolean grow(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       return super.func_149884_c(arg1,arg2,arg3,arg4,arg5);
}
   public boolean j(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canBlockStay(arg1,arg2,arg3,arg4);
}
}