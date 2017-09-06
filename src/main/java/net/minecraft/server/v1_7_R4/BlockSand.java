package net.minecraft.server.v1_7_R4;
public class BlockSand extends net.minecraft.block.BlockSand
{

   public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
}