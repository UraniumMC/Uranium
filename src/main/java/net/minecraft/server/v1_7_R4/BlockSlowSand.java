package net.minecraft.server.v1_7_R4;
public class BlockSlowSand extends net.minecraft.block.BlockSoulSand
{

   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5){
       super.onEntityCollidedWithBlock(arg1,arg2,arg3,arg4,arg5);
}
}