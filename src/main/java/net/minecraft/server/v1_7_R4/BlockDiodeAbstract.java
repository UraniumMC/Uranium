package net.minecraft.server.v1_7_R4;
public abstract class BlockDiodeAbstract extends net.minecraft.block.BlockRedstoneDiode
{
    public BlockDiodeAbstract(boolean p_i45400_1_) {
        super(p_i45400_1_);
    }

    public boolean a(net.minecraft.block.Block arg1){
       return super.func_149908_a(arg1);
}
   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isGettingInput(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public int b(){
       return super.getRenderType();
}
   public int b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingWeakPower(arg1,arg2,arg3,arg4,arg5);
}
   public void b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.func_149897_b(arg1,arg2,arg3,arg4,arg5);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public boolean c(int arg1){
       return super.func_149905_c(arg1);
}
   public boolean c(net.minecraft.block.Block arg1){
       return super.isAssociatedBlock(arg1);
}
   public int c(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingStrongPower(arg1,arg2,arg3,arg4,arg5);
}
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canPlaceBlockAt(arg1,arg2,arg3,arg4);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public boolean d(net.minecraft.block.Block arg1){
       return super.isRedstoneRepeaterBlockID(arg1);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public boolean e(net.minecraft.block.Block arg1){
       return super.func_149907_e(arg1);
}
   public void e(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.func_149911_e(arg1,arg2,arg3,arg4);
}
   public int f(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149904_f(arg1,arg2,arg3,arg4,arg5);
}
   public boolean g(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149910_g(arg1,arg2,arg3,arg4,arg5);
}
   public int h(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149902_h(arg1,arg2,arg3,arg4,arg5);
}
   public int h(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.getInputStrength(arg1,arg2,arg3,arg4,arg5);
}
   public int i(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149913_i(arg1,arg2,arg3,arg4,arg5);
}
   public boolean i(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149912_i(arg1,arg2,arg3,arg4,arg5);
}
   public boolean isPowerSource(){
       return super.canProvidePower();
}
   public boolean j(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canBlockStay(arg1,arg2,arg3,arg4);
}
   public int k(int arg1){
       return super.func_149899_k(arg1);
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
}