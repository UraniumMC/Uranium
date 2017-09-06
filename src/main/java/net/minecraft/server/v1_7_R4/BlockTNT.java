package net.minecraft.server.v1_7_R4;
public class BlockTNT extends net.minecraft.block.BlockTNT
{

   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public boolean a(net.minecraft.world.Explosion arg1){
       return super.canDropFromExplosion(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,net.minecraft.entity.EntityLivingBase arg6){
       super.func_150114_a(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5){
       super.onEntityCollidedWithBlock(arg1,arg2,arg3,arg4,arg5);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void postBreak(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.onBlockDestroyedByPlayer(arg1,arg2,arg3,arg4,arg5);
}
   public void wasExploded(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.world.Explosion arg5){
       super.onBlockDestroyedByExplosion(arg1,arg2,arg3,arg4,arg5);
}
}