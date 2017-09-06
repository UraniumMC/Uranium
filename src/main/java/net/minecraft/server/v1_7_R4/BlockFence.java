package net.minecraft.server.v1_7_R4;
public class BlockFence extends net.minecraft.block.BlockFence
{

   public boolean a(net.minecraft.block.Block arg1){
       return super.func_149825_a(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.AxisAlignedBB arg5,java.util.List arg6,net.minecraft.entity.Entity arg7){
       super.addCollisionBoxesToList(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int b(){
       return super.getRenderType();
}
   public boolean b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getBlocksMovement(arg1,arg2,arg3,arg4);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public boolean e(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.canConnectFenceTo(arg1,arg2,arg3,arg4);
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
}