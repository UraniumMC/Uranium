package net.minecraft.server.v1_7_R4;
public class BlockFlowing extends net.minecraft.block.BlockDynamicLiquid
{

   public boolean L(){
       return super.func_149698_L();
}
   public int a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149810_a(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public int c(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6){
       return super.func_149812_c(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void flow(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.func_149813_h(arg1,arg2,arg3,arg4,arg5);
}
   public void n(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_149811_n(arg1,arg2,arg3,arg4);
}
   public boolean[] o(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_149808_o(arg1,arg2,arg3,arg4);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public boolean p(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_149807_p(arg1,arg2,arg3,arg4);
}
   public boolean q(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_149809_q(arg1,arg2,arg3,arg4);
}
}