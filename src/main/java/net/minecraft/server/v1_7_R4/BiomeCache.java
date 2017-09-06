package net.minecraft.server.v1_7_R4;

import net.minecraft.world.biome.WorldChunkManager;

public class BiomeCache extends net.minecraft.world.biome.BiomeCache
{
    public BiomeCache(WorldChunkManager p_i1973_1_) {
        super(p_i1973_1_);
    }

    public void a(){
       super.cleanupCache();
}
   public BiomeCache.Block a(int arg1,int arg2){
       return super.getBiomeCacheBlock(arg1,arg2);
    }
   public net.minecraft.world.biome.BiomeGenBase b(int arg1,int arg2){
       return super.getBiomeGenAt(arg1,arg2);
}
   public net.minecraft.world.biome.BiomeGenBase[] d(int arg1,int arg2){
       return super.getCachedBiomes(arg1,arg2);
}
}