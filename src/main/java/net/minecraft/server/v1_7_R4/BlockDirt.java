package net.minecraft.server.v1_7_R4;
public class BlockDirt extends net.minecraft.block.BlockDirt
{

   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public int getDropData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getDamageValue(arg1,arg2,arg3,arg4);
}
   public net.minecraft.item.ItemStack j(int arg1){
       return super.createStackedBlock(arg1);
}
}