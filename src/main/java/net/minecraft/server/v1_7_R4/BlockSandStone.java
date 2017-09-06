package net.minecraft.server.v1_7_R4;
public class BlockSandStone extends net.minecraft.block.BlockSandStone
{

   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
}