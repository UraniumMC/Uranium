package net.minecraft.server.v1_7_R4;
public class BlockQuartz extends net.minecraft.block.BlockQuartz
{

   public int b(){
       return super.getRenderType();
}
   public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public int getPlacedData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,float arg7,float arg8,int arg9){
       return super.onBlockPlaced(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public net.minecraft.item.ItemStack j(int arg1){
       return super.createStackedBlock(arg1);
}
}