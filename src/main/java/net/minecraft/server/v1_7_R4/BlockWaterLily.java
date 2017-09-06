package net.minecraft.server.v1_7_R4;
public class BlockWaterLily extends net.minecraft.block.BlockLilyPad
{

   public boolean a(net.minecraft.block.Block arg1){
       return super.canPlaceBlockOn(arg1);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.AxisAlignedBB arg5,java.util.List arg6,net.minecraft.entity.Entity arg7){
       super.addCollisionBoxesToList(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int b(){
       return super.getRenderType();
}
   public boolean j(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canBlockStay(arg1,arg2,arg3,arg4);
}
}