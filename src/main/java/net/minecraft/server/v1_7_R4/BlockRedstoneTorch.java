package net.minecraft.server.v1_7_R4;
public class BlockRedstoneTorch extends net.minecraft.block.BlockRedstoneTorch
{

   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,boolean arg5){
       return super.func_150111_a(arg1,arg2,arg3,arg4,arg5);
}
   public int b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingWeakPower(arg1,arg2,arg3,arg4,arg5);
}
   public boolean c(net.minecraft.block.Block arg1){
       return super.isAssociatedBlock(arg1);
}
   public int c(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingStrongPower(arg1,arg2,arg3,arg4,arg5);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public boolean isPowerSource(){
       return super.canProvidePower();
}
   public boolean m(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_150110_m(arg1,arg2,arg3,arg4);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}