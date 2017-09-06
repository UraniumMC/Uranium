package net.minecraft.server.v1_7_R4;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeSavannaSub extends net.minecraft.world.biome.BiomeGenSavanna.Mutated
{
    public BiomeSavannaSub(int p_i45382_1_, BiomeGenBase p_i45382_2_) {
        super(p_i45382_1_, p_i45382_2_);
    }

    public void a(net.minecraft.world.World arg1, java.util.Random arg2, int arg3, int arg4){
       super.decorate(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,net.minecraft.server.v1_7_R4.Block[] arg3,byte[] arg4,int arg5,int arg6,double arg7){
       super.genTerrainBlocks(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
}