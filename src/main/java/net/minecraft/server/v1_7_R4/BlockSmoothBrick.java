package net.minecraft.server.v1_7_R4;
public class BlockSmoothBrick extends net.minecraft.block.BlockStoneBrick
{

   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
}