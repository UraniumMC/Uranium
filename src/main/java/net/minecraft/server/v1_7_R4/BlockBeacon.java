package net.minecraft.server.v1_7_R4;
public class BlockBeacon extends net.minecraft.block.BlockBeacon
{

   public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1,int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public int b(){
       return super.getRenderType();
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void postPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.EntityLivingBase arg5,net.minecraft.item.ItemStack arg6){
       super.onBlockPlacedBy(arg1,arg2,arg3,arg4,arg5,arg6);
}
}