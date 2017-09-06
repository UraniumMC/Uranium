package net.minecraft.server.v1_7_R4;
public class BlockOre extends net.minecraft.block.BlockOre
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int getDropCount(int arg1,java.util.Random arg2){
       return super.quantityDroppedWithBonus(arg1,arg2);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}