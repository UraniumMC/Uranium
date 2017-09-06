package net.minecraft.server.v1_7_R4;
public class BlockLongGrass extends net.minecraft.block.BlockTallGrass
{

   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,boolean arg5){
       return super.func_149851_a(arg1,arg2,arg3,arg4,arg5);
}
   public boolean a(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4,int arg5){
       return super.func_149852_a(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,net.minecraft.entity.player.EntityPlayer arg2,int arg3,int arg4,int arg5,int arg6){
       super.harvestBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void b(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4,int arg5){
       super.func_149853_b(arg1,arg2,arg3,arg4,arg5);
}
   public int getDropCount(int arg1,java.util.Random arg2){
       return super.quantityDroppedWithBonus(arg1,arg2);
}
   public int getDropData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getDamageValue(arg1,arg2,arg3,arg4);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public boolean j(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canBlockStay(arg1,arg2,arg3,arg4);
}
}