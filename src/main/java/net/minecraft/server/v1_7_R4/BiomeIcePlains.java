package net.minecraft.server.v1_7_R4;
public class BiomeIcePlains extends net.minecraft.world.biome.BiomeGenSnow
{

   public net.minecraft.world.gen.feature.WorldGenAbstractTree a(java.util.Random arg1){
       return super.func_150567_a(arg1);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4){
       super.decorate(arg1,arg2,arg3,arg4);
}
   public net.minecraft.world.biome.BiomeGenBase k(){
       return super.createMutation();
}
}