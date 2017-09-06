package net.minecraft.server.v1_7_R4;
public class BlockIce extends net.minecraft.block.BlockIce
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
   public int h(){
       return super.getMobilityFlag();
}
}