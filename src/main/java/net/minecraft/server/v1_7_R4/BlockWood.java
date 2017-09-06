package net.minecraft.server.v1_7_R4;
public class BlockWood extends net.minecraft.block.BlockWood
{

   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
}