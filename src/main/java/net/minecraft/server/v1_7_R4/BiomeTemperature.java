package net.minecraft.server.v1_7_R4;
public class BiomeTemperature extends net.minecraft.world.biome.BiomeGenBase.Height
{
    public BiomeTemperature(float p_i45371_1_, float p_i45371_2_) {
        super(p_i45371_1_, p_i45371_2_);
    }

    public BiomeTemperature a(){
       super.attenuate();
       return this;
}
}