package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockFluids extends net.minecraft.block.BlockLiquid
{
    public BlockFluids(Material p_i45413_1_) {
        super(p_i45413_1_);
    }

    public boolean a(int arg1, boolean arg2){
       return super.canCollideCheck(arg1,arg2);
}
   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5,net.minecraft.util.Vec3 arg6){
       super.velocityToAddToEntity(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public int b(){
       return super.getRenderType();
}
   public float b(int arg1){
       return super.getLiquidHeightPercent(arg1);
}
   public boolean b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getBlocksMovement(arg1,arg2,arg3,arg4);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public boolean d(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isBlockSolid(arg1,arg2,arg3,arg4,arg5);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public int e(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getEffectiveFlowDecay(arg1,arg2,arg3,arg4);
}
   public int e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_149804_e(arg1,arg2,arg3,arg4);
}
   public void fizz(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_149799_m(arg1,arg2,arg3,arg4);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
}