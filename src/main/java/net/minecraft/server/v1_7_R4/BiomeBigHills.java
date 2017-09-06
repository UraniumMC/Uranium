package net.minecraft.server.v1_7_R4;
public class BiomeBigHills extends net.minecraft.world.biome.BiomeGenHills
{

   public net.minecraft.world.gen.feature.WorldGenAbstractTree a(java.util.Random arg1){
       return super.func_150567_a(arg1);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4){
       super.decorate(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,net.minecraft.server.v1_7_R4.Block[] arg3,byte[] arg4,int arg5,int arg6,double arg7){
       super.genTerrainBlocks(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.world.biome.BiomeGenHills b(net.minecraft.world.biome.BiomeGenBase arg1){
       super.mutateHills(arg1);
       return this;
}
   public net.minecraft.world.biome.BiomeGenBase k(){
       return super.createMutation();
}
}