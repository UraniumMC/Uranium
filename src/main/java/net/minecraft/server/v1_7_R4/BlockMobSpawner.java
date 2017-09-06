package net.minecraft.server.v1_7_R4;
public class BlockMobSpawner extends net.minecraft.block.BlockMobSpawner
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1,int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}