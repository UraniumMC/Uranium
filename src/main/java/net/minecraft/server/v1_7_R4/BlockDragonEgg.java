package net.minecraft.server.v1_7_R4;
public class BlockDragonEgg extends net.minecraft.block.BlockDragonEgg
{

   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void attack(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5){
       super.onBlockClicked(arg1,arg2,arg3,arg4,arg5);
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
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public void e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_150018_e(arg1,arg2,arg3,arg4);
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void m(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_150019_m(arg1,arg2,arg3,arg4);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
}