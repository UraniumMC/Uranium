package net.minecraft.server.v1_7_R4;

import net.minecraft.world.*;

public class EmptyChunk extends net.minecraft.world.chunk.EmptyChunk
{
    public EmptyChunk(net.minecraft.world.World p_i1994_1_, int p_i1994_2_, int p_i1994_3_) {
        super(p_i1994_1_, p_i1994_2_, p_i1994_3_);
    }

    public boolean a(int arg1, int arg2){
       return super.isAtLocation(arg1,arg2);
}
   public boolean a(int arg1,int arg2,int arg3,int arg4){
       return super.setBlockMetadata(arg1,arg2,arg3,arg4);
}
   public boolean a(int arg1,int arg2,int arg3,net.minecraft.block.Block arg4,int arg5){
       return super.func_150807_a(arg1,arg2,arg3,arg4,arg5);
}
   public void a(int arg1,int arg2,int arg3,net.minecraft.tileentity.TileEntity arg4){
       super.func_150812_a(arg1,arg2,arg3,arg4);
}
   public java.util.Random a(long arg1){
       return super.getRandomWithSeed(arg1);
}
   public void a(java.lang.Class arg1,net.minecraft.util.AxisAlignedBB arg2,java.util.List arg3,net.minecraft.command.IEntitySelector arg4){
       super.getEntitiesOfTypeWithinAAAB(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.entity.Entity arg1){
       super.addEntity(arg1);
}
   public void a(net.minecraft.entity.Entity arg1,int arg2){
       super.removeEntityAtIndex(arg1,arg2);
}
   public void a(net.minecraft.entity.Entity arg1,net.minecraft.util.AxisAlignedBB arg2,java.util.List arg3,net.minecraft.command.IEntitySelector arg4){
       super.getEntitiesWithinAABBForEntity(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.EnumSkyBlock arg1,int arg2,int arg3,int arg4,int arg5){
       super.setLightValue(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.tileentity.TileEntity arg1){
       super.addTileEntity(arg1);
}
   public boolean a(boolean arg1){
       return super.needsSaving(arg1);
}
   public void addEntities(){
       super.onChunkLoad();
}
   public int b(int arg1,int arg2){
       return super.getHeightValue(arg1,arg2);
}
   public int b(int arg1,int arg2,int arg3){
       return super.func_150808_b(arg1,arg2,arg3);
}
   public int b(int arg1,int arg2,int arg3,int arg4){
       return super.getBlockLightValue(arg1,arg2,arg3,arg4);
}
   public void b(net.minecraft.entity.Entity arg1){
       super.removeEntity(arg1);
}
   public boolean c(int arg1,int arg2){
       return super.getAreLevelsEmpty(arg1,arg2);
}
   public boolean d(int arg1,int arg2,int arg3){
       return super.canBlockSeeTheSky(arg1,arg2,arg3);
}
   public void e(){
       super.setChunkModified();
}
   public net.minecraft.tileentity.TileEntity e(int arg1,int arg2,int arg3){
       return super.func_150806_e(arg1,arg2,arg3);
}
   public void f(int arg1,int arg2,int arg3){
       super.removeTileEntity(arg1,arg2,arg3);
}
   public int getBrightness(net.minecraft.world.EnumSkyBlock arg1,int arg2,int arg3,int arg4){
       return super.getSavedLightValue(arg1,arg2,arg3,arg4);
}
   public int getData(int arg1,int arg2,int arg3){
       return super.getBlockMetadata(arg1,arg2,arg3);
}
   public net.minecraft.block.Block getType(int arg1,int arg2,int arg3){
       return super.getBlock(arg1,arg2,arg3);
}
   public void initLighting(){
       super.generateSkylightMap();
}
   public void removeEntities(){
       super.onChunkUnload();
}
}