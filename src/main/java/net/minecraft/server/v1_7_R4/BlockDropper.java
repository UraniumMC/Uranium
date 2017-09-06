package net.minecraft.server.v1_7_R4;
public class BlockDropper extends net.minecraft.block.BlockDropper
{

   public net.minecraft.dispenser.IBehaviorDispenseItem a(net.minecraft.item.ItemStack arg1){
       return super.func_149940_a(arg1);
}
   public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1,int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public void dispense(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_149941_e(arg1,arg2,arg3,arg4);
}
}