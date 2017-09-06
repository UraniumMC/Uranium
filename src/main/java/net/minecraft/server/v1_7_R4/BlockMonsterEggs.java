package net.minecraft.server.v1_7_R4;

import org.apache.commons.lang3.tuple.ImmutablePair;

public class BlockMonsterEggs extends net.minecraft.block.BlockSilverfish
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public boolean a(net.minecraft.block.Block arg1){
       return super.func_150196_a(arg1);
}
   public int a(net.minecraft.block.Block arg1,int arg2){
       return super.func_150195_a(arg1,arg2);
}
   public ImmutablePair b(int arg1){
       return super.func_150197_b(arg1);
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int getDropData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getDamageValue(arg1,arg2,arg3,arg4);
}
   public net.minecraft.item.ItemStack j(int arg1){
       return super.createStackedBlock(arg1);
}
   public void postBreak(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.onBlockDestroyedByPlayer(arg1,arg2,arg3,arg4,arg5);
}
}