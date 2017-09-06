package net.minecraft.server.v1_7_R4;
public class BiomeTaiga extends net.minecraft.world.biome.BiomeGenTaiga
{
    public BiomeTaiga(int p_i45385_1_, int p_i45385_2_) {
        super(p_i45385_1_, p_i45385_2_);
    }

    public net.minecraft.world.gen.feature.WorldGenAbstractTree a(java.util.Random arg1){
       return super.func_150567_a(arg1);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4){
       super.decorate(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,net.minecraft.server.v1_7_R4.Block[] arg3,byte[] arg4,int arg5,int arg6,double arg7){
       super.genTerrainBlocks(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.world.gen.feature.WorldGenerator b(java.util.Random arg1){
       return super.getRandomWorldGenForGrass(arg1);
}
   public net.minecraft.world.biome.BiomeGenBase k(){
       return super.createMutation();
}
}