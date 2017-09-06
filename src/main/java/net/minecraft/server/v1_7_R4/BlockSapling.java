package net.minecraft.server.v1_7_R4;
public class BlockSapling extends net.minecraft.block.BlockSapling
{

   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149880_a(arg1,arg2,arg3,arg4,arg5);
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
   public void d(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.func_149878_d(arg1,arg2,arg3,arg4,arg5);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public void grow(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.func_149879_c(arg1,arg2,arg3,arg4,arg5);
}
}