package net.minecraft.server.v1_7_R4;
public class BlockGrass extends net.minecraft.block.BlockGrass
{

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
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}