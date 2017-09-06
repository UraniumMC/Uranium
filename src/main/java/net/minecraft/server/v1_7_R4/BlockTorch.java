package net.minecraft.server.v1_7_R4;
public class BlockTorch extends net.minecraft.block.BlockTorch
{

   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.Vec3 arg5,net.minecraft.util.Vec3 arg6){
       return super.collisionRayTrace(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public int b(){
       return super.getRenderType();
}
   public boolean b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       return super.func_150108_b(arg1,arg2,arg3,arg4,arg5);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canPlaceBlockAt(arg1,arg2,arg3,arg4);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public boolean e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_150109_e(arg1,arg2,arg3,arg4);
}
   public int getPlacedData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,float arg7,float arg8,int arg9){
       return super.onBlockPlaced(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
}