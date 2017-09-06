package net.minecraft.server.v1_7_R4;
public class BlockSnowBlock extends net.minecraft.block.BlockSnowBlock
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}