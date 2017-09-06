package net.minecraft.server.v1_7_R4;
public class BlockClay extends net.minecraft.block.BlockClay
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}