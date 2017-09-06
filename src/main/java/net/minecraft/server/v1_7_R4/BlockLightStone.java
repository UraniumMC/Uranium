package net.minecraft.server.v1_7_R4;
public class BlockLightStone extends net.minecraft.block.BlockGlowstone
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
   public int getDropCount(int arg1,java.util.Random arg2){
       return super.quantityDroppedWithBonus(arg1,arg2);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}