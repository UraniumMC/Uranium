package net.minecraft.server.v1_7_R4;
public class BlockPotatoes extends net.minecraft.block.BlockPotato
{

   public net.minecraft.item.Item P(){
       return super.func_149865_P();
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.item.Item i(){
       return super.func_149866_i();
}
}