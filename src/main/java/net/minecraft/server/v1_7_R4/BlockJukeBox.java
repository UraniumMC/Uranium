package net.minecraft.server.v1_7_R4;
public class BlockJukeBox extends net.minecraft.block.BlockJukebox
{

   public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1,int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public void b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.item.ItemStack arg5){
       super.func_149926_b(arg1,arg2,arg3,arg4,arg5);
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public void dropRecord(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_149925_e(arg1,arg2,arg3,arg4);
}
   public int g(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.getComparatorInputOverride(arg1,arg2,arg3,arg4,arg5);
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public boolean isComplexRedstone(){
       return super.hasComparatorInputOverride();
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}