package net.minecraft.server.v1_7_R4;
public class BlockRepeater extends net.minecraft.block.BlockRedstoneRepeater
{

   public boolean a(net.minecraft.block.Block arg1){
       return super.func_149908_a(arg1);
}
   public int b(){
       return super.getRenderType();
}
   public int b(int arg1){
       return super.func_149901_b(arg1);
}
   public net.minecraft.block.BlockRedstoneDiode e(){
       return super.getBlockPowered();
}
   public boolean g(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149910_g(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public net.minecraft.block.BlockRedstoneDiode i(){
       return super.getBlockUnpowered();
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}