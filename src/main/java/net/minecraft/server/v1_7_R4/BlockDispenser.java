package net.minecraft.server.v1_7_R4;
public class BlockDispenser extends net.minecraft.block.BlockDispenser
{

   public net.minecraft.dispenser.IPosition a(net.minecraft.dispenser.IBlockSource arg1){
       return super.func_149939_a(arg1);
}
   public net.minecraft.dispenser.IBehaviorDispenseItem a(net.minecraft.item.ItemStack arg1){
       return super.func_149940_a(arg1);
}
   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1,int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.util.EnumFacing b(int arg1){
       return super.func_149937_b(arg1);
}
   public void dispense(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_149941_e(arg1,arg2,arg3,arg4);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
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
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void postPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.EntityLivingBase arg5,net.minecraft.item.ItemStack arg6){
       super.onBlockPlacedBy(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}