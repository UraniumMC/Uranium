package net.minecraft.server.v1_7_R4;
public class BlockFurnace extends net.minecraft.block.BlockFurnace
{
    public BlockFurnace(boolean p_i45407_1_) {
        super(p_i45407_1_);
    }

    public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1, int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public void a(boolean arg1,net.minecraft.world.World arg2,int arg3,int arg4,int arg5){
       super.updateFurnaceBlockState(arg1,arg2,arg3,arg4,arg5);
}
   public int g(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.getComparatorInputOverride(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
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