package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class Block extends net.minecraft.block.Block
{
    public Block(Material p_i45394_1_) {
        super(p_i45394_1_);
    }

    public double A(){
       return super.getBlockBoundsMaxY();
}
   public double B(){
       return super.getBlockBoundsMinZ();
}
   public double C(){
       return super.getBlockBoundsMaxZ();
}
   public boolean E(){
       return super.canSilkHarvest();
}
   public boolean G(){
       return super.getEnableStats();
}
   public net.minecraft.block.Block H(){
       super.disableStats();
       return this;
}
   public boolean L(){
       return super.func_149698_L();
}
   public java.lang.String a(){
       return super.getUnlocalizedName();
}
   public net.minecraft.block.Block a(float arg1){
       super.setLightLevel(arg1);
       return this;
}
   public void a(float arg1,float arg2,float arg3,float arg4,float arg5,float arg6){
       super.setBlockBounds(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public boolean a(int arg1,boolean arg2){
       return super.canCollideCheck(arg1,arg2);
}
   public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public boolean a(net.minecraft.block.Block arg1,net.minecraft.block.Block arg2){
       return super.isEqualTo(arg1,arg2);
}
   public net.minecraft.block.Block a(net.minecraft.creativetab.CreativeTabs arg1){
       super.setCreativeTab(arg1);
       return this;
}
   public float a(net.minecraft.entity.Entity arg1){
       return super.getExplosionResistance(arg1);
}
   public boolean a(net.minecraft.world.Explosion arg1){
       return super.canDropFromExplosion(arg1);
}
   public net.minecraft.block.Block a(net.minecraft.item.Item arg1){
       super.getBlockFromItem(arg1);
       return this;
}
   public net.minecraft.block.Block a(net.minecraft.block.Block.SoundType arg1){
       super.setStepSound(arg1);
       return this;
}
   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getCollisionBoundingBoxFromPool(arg1,arg2,arg3,arg4);
}
   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6){
       return super.onBlockEventReceived(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,net.minecraft.entity.player.EntityPlayer arg6){
       super.onBlockHarvested(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.AxisAlignedBB arg5,java.util.List arg6,net.minecraft.entity.Entity arg7){
       super.addCollisionBoxesToList(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5){
       super.onEntityCollidedWithBlock(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5,float arg6){
       super.onFallenUpon(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5,net.minecraft.util.Vec3 arg6){
       super.velocityToAddToEntity(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.item.ItemStack arg5){
       super.dropBlockAsItem(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.util.Vec3 arg5,net.minecraft.util.Vec3 arg6){
       return super.collisionRayTrace(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,net.minecraft.entity.player.EntityPlayer arg2,int arg3,int arg4,int arg5,int arg6){
       super.harvestBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public net.minecraft.block.Block a(boolean arg1){
       super.setTickRandomly(arg1);
       return this;
}
   public void attack(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5){
       super.onBlockClicked(arg1,arg2,arg3,arg4,arg5);
}
   public int b(){
       return super.getRenderType();
}
   public net.minecraft.block.Block b(float arg1){
       super.setResistance(arg1);
       return this;
}
   public net.minecraft.block.Block b(java.lang.String arg1){
       super.getBlockFromName(arg1);
       return this;
}
   public boolean b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getBlocksMovement(arg1,arg2,arg3,arg4);
}
   public int b(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isProvidingWeakPower(arg1,arg2,arg3,arg4,arg5);
}
   public void b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6){
       super.dropBlockAsItem(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5){
       super.onEntityWalking(arg1,arg2,arg3,arg4,arg5);
}
   public boolean c(){
       return super.isOpaqueCube();
}
   public net.minecraft.block.Block c(float arg1){
       super.setHardness(arg1);
       return this;
}
   public net.minecraft.block.Block c(java.lang.String arg1){
       super.setBlockName(arg1);
       return this;
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
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.canPlaceBlockOnSide(arg1,arg2,arg3,arg4,arg5);
}
   public boolean canPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,net.minecraft.item.ItemStack arg6){
       return super.canReplace(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public boolean d(){
       return super.renderAsNormalBlock();
}
   public net.minecraft.block.Block d(java.lang.String arg1){
       super.setBlockTextureName(arg1);
       return this;
}
   public boolean d(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isBlockSolid(arg1,arg2,arg3,arg4,arg5);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public void dropExperience(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.dropXpOnBlockBreak(arg1,arg2,arg3,arg4,arg5);
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
   public float f(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getBlockHardness(arg1,arg2,arg3,arg4);
}
   public void f(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.onBlockPreDestroy(arg1,arg2,arg3,arg4,arg5);
}
   public void g(){
       super.setBlockBoundsForItemRender();
}
   public net.minecraft.block.Block g(int arg1){
       super.setLightOpacity(arg1);
       return this;
}
   public int g(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.getComparatorInputOverride(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.block.Block getById(int arg1){
       super.getBlockById(arg1);
       return this;
}
   public float getDamage(net.minecraft.entity.player.EntityPlayer arg1,net.minecraft.world.World arg2,int arg3,int arg4,int arg5){
       return super.getPlayerRelativeBlockHardness(arg1,arg2,arg3,arg4,arg5);
}
   public int getDropCount(int arg1,java.util.Random arg2){
       return super.quantityDroppedWithBonus(arg1,arg2);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public int getDropData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getDamageValue(arg1,arg2,arg3,arg4);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public int getId(net.minecraft.block.Block arg1){
       return super.getIdFromBlock(arg1);
}
   public net.minecraft.block.material.Material getMaterial(){
       return super.getMaterial();
}
   public java.lang.String getName(){
       return super.getLocalizedName();
}
   public int getPlacedData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,float arg7,float arg8,int arg9){
       return super.onBlockPlaced(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public int h(){
       return super.getMobilityFlag();
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public boolean isComplexRedstone(){
       return super.hasComparatorInputOverride();
}
   public boolean isPowerSource(){
       return super.canProvidePower();
}
   public boolean isTicking(){
       return super.getTickRandomly();
}
   public boolean isTileEntity(){
       return super.hasTileEntity();
}
   public boolean j(){
       return super.func_149730_j();
}
   public net.minecraft.item.ItemStack j(int arg1){
       return super.createStackedBlock(arg1);
}
   public boolean j(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.canBlockStay(arg1,arg2,arg3,arg4);
}
   public int k(){
       return super.getLightOpacity();
}
   public void l(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.fillWithRain(arg1,arg2,arg3,arg4);
}
   public int m(){
       return super.getLightValue();
}
   public boolean n(){
       return super.getUseNeighborBrightness();
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void p(){
       super.registerBlocks();
}
   public void postBreak(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.onBlockDestroyedByPlayer(arg1,arg2,arg3,arg4,arg5);
}
   public void postPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.onPostBlockPlaced(arg1,arg2,arg3,arg4,arg5);
}
   public void postPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.EntityLivingBase arg5,net.minecraft.item.ItemStack arg6){
       super.onBlockPlacedBy(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public boolean r(){
       return super.isNormalCube();
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public net.minecraft.block.Block s(){
       super.setBlockUnbreakable();
       return this;
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
   public double x(){
       return super.getBlockBoundsMinX();
}
   public double y(){
       return super.getBlockBoundsMaxX();
}
   public double z(){
       return super.getBlockBoundsMinY();
}
}