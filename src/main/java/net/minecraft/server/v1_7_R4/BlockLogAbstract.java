package net.minecraft.server.v1_7_R4;
public class BlockLogAbstract extends net.minecraft.block.BlockLog
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public int c(int arg1){
       return super.func_150165_c(arg1);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}