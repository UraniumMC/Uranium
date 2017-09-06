package net.minecraft.server.v1_7_R4;
public class BlockStainedGlassPane extends net.minecraft.block.BlockStainedGlassPane
{

   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
}