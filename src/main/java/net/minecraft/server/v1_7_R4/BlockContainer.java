package net.minecraft.server.v1_7_R4;
public class BlockContainer extends net.minecraft.block.BlockContainer
{

   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6){
       return super.onBlockEventReceived(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}