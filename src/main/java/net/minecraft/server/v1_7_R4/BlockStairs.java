package net.minecraft.server.v1_7_R4;

import net.minecraft.block.*;

public class BlockStairs extends net.minecraft.block.BlockStairs
{
    public BlockStairs(net.minecraft.block.Block p_i45428_1_, int p_i45428_2_) {
        super(p_i45428_1_, p_i45428_2_);
    }

    public boolean a(int arg1, boolean arg2){
       return super.canCollideCheck(arg1,arg2);
}
   public boolean a(net.minecraft.block.Block arg1){
       return super.func_150148_a(arg1);
}
   public float a(net.minecraft.entity.Entity arg1){
       return super.getExplosionResistance(arg1);
}
   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.AxisAlignedBB arg5,java.util.List arg6,net.minecraft.entity.Entity arg7){
       super.addCollisionBoxesToList(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5,net.minecraft.util.Vec3 arg6){
       super.velocityToAddToEntity(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.Vec3 arg5,net.minecraft.util.Vec3 arg6){
       return super.collisionRayTrace(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void attack(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5){
       super.onBlockClicked(arg1,arg2,arg3,arg4,arg5);
}
   public int b(){
       return super.getRenderType();
}
   public void b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5){
       super.onEntityWalking(arg1,arg2,arg3,arg4,arg5);
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
   public void e(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.func_150147_e(arg1,arg2,arg3,arg4);
}
   public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
   public boolean f(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.func_150145_f(arg1,arg2,arg3,arg4);
}
   public boolean g(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.func_150144_g(arg1,arg2,arg3,arg4);
}
   public int getPlacedData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,float arg7,float arg8,int arg9){
       return super.onBlockPlaced(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
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
   public void postPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.EntityLivingBase arg5,net.minecraft.item.ItemStack arg6){
       super.onBlockPlacedBy(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void updateShape(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       super.setBlockBoundsBasedOnState(arg1,arg2,arg3,arg4);
}
   public boolean v(){
       return super.isCollidable();
}
   public void wasExploded(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.world.Explosion arg5){
       super.onBlockDestroyedByExplosion(arg1,arg2,arg3,arg4,arg5);
}
}