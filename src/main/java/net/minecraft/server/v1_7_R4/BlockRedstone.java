package net.minecraft.server.v1_7_R4;
public class BlockRedstone extends net.minecraft.block.BlockCompressedPowered
{

   public int b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingWeakPower(arg1,arg2,arg3,arg4,arg5);
}
   public boolean isPowerSource(){
       return super.canProvidePower();
}
}