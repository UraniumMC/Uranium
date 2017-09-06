package net.minecraft.server.v1_7_R4;
public class BlockPressurePlateWeighted extends net.minecraft.block.BlockPressurePlateWeighted
{

   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public int c(int arg1){
       return super.func_150060_c(arg1);
}
   public int d(int arg1){
       return super.func_150066_d(arg1);
}
   public int e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_150065_e(arg1,arg2,arg3,arg4);
}
}