package net.minecraft.server.v1_7_R4;
public class BlockGravel extends net.minecraft.block.BlockGravel
{

   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}