package net.minecraft.server.v1_7_R4;
public class BiomeDecorator extends net.minecraft.world.biome.BiomeDecorator
{

   public void a(){
       super.generateOres();
}
   public void a(int arg1,net.minecraft.world.gen.feature.WorldGenerator arg2,int arg3,int arg4){
       super.genStandardOre1(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.biome.BiomeGenBase arg1){
       super.genDecorations(arg1);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,net.minecraft.world.biome.BiomeGenBase arg3,int arg4,int arg5){
       super.decorateChunk(arg1,arg2,arg3,arg4,arg5);
}
   public void b(int arg1,net.minecraft.world.gen.feature.WorldGenerator arg2,int arg3,int arg4){
       super.genStandardOre2(arg1,arg2,arg3,arg4);
}
}