package net.minecraft.server.v1_7_R4;
public class BlockDeadBush extends net.minecraft.block.BlockDeadBush
{

   public boolean a(net.minecraft.block.Block arg1){
       return super.canPlaceBlockOn(arg1);
}
   public void a(net.minecraft.world.World arg1,net.minecraft.entity.player.EntityPlayer arg2,int arg3,int arg4,int arg5,int arg6){
       super.harvestBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
}