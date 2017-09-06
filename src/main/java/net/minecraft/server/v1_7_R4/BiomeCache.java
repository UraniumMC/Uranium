package net.minecraft.server.v1_7_R4;
public class BiomeCache extends net.minecraft.world.biome.BiomeCache
{

   public void a(){
       super.cleanupCache();
}
   public net.minecraft.world.biome.BiomeCache$Block a(int arg1,int arg2){
       return super.getBiomeCacheBlock(arg1,arg2);
}
   public net.minecraft.world.biome.WorldChunkManager a(net.minecraft.world.biome.BiomeCache arg1){
       return super.access$000(arg1);
}
   public net.minecraft.world.biome.BiomeGenBase b(int arg1,int arg2){
       return super.getBiomeGenAt(arg1,arg2);
}
   public net.minecraft.server.v1_7_R4.BiomeBase[] d(int arg1,int arg2){
       return super.getCachedBiomes(arg1,arg2);
}
}