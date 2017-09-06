package net.minecraft.server.v1_7_R4;
public class BlockPumpkin extends net.minecraft.block.BlockPumpkin
{
    public BlockPumpkin(boolean p_i45419_1_) {
        super(p_i45419_1_);
    }

    public boolean canPlace(net.minecraft.world.World arg1, int arg2, int arg3, int arg4){
       return super.canPlaceBlockAt(arg1,arg2,arg3,arg4);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void postPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.EntityLivingBase arg5,net.minecraft.item.ItemStack arg6){
       super.onBlockPlacedBy(arg1,arg2,arg3,arg4,arg5,arg6);
}
}