package net.minecraft.server.v1_7_R4;
public class BlockGlass extends net.minecraft.block.BlockGlass
{

   public boolean E(){
       return super.canSilkHarvest();
}
   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
}