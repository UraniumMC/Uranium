package net.minecraft.server.v1_7_R4;
public class BiomeBase extends net.minecraft.world.biome.BiomeGenBase
{

   public net.minecraft.world.biome.BiomeDecorator a(){
       return super.createBiomeDecorator();
}
   public net.minecraft.world.biome.BiomeGenBase a(float arg1,float arg2){
       super.setTemperatureRainfall(arg1,arg2);
       return this;
}
   public net.minecraft.world.biome.BiomeGenBase a(int arg1){
       super.func_76733_a(arg1);
       return this;
}
   public float a(int arg1,int arg2,int arg3){
       return super.getFloatTemperature(arg1,arg2,arg3);
}
   public net.minecraft.world.biome.BiomeGenBase a(int arg1,boolean arg2){
       super.func_150557_a(arg1,arg2);
       return this;
}
   public net.minecraft.world.biome.BiomeGenBase a(java.lang.String arg1){
       super.setBiomeName(arg1);
       return this;
}
   public net.minecraft.world.gen.feature.WorldGenAbstractTree a(java.util.Random arg1){
       return super.func_150567_a(arg1);
}
   public java.lang.String a(java.util.Random arg1,int arg2,int arg3,int arg4){
       return super.func_150572_a(arg1,arg2,arg3,arg4);
}
   public boolean a(net.minecraft.world.biome.BiomeGenBase arg1){
       return super.isEqualTo(arg1);
}
   public net.minecraft.world.biome.BiomeGenBase a(net.minecraft.world.biome.BiomeGenBase$Height arg1){
       super.setHeight(arg1);
       return this;
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4){
       super.decorate(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,net.minecraft.server.v1_7_R4.Block[] arg3,byte[] arg4,int arg5,int arg6,double arg7){
       super.genTerrainBlocks(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.world.biome.BiomeGenBase b(){
       super.setDisableRain();
       return this;
}
   public net.minecraft.world.biome.BiomeGenBase b(int arg1){
       super.setColor(arg1);
       return this;
}
   public net.minecraft.world.gen.feature.WorldGenerator b(java.util.Random arg1){
       return super.getRandomWorldGenForGrass(arg1);
}
   public void b(net.minecraft.world.World arg1,java.util.Random arg2,net.minecraft.server.v1_7_R4.Block[] arg3,byte[] arg4,int arg5,int arg6,double arg7){
       super.genBiomeTerrain(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.world.biome.BiomeGenBase c(){
       super.setEnableSnow();
       return this;
}
   public net.minecraft.world.biome.BiomeGenBase c(int arg1){
       super.func_150563_c(arg1);
       return this;
}
   public boolean d(){
       return super.getEnableSnow();
}
   public boolean e(){
       return super.canSpawnLightningBolt();
}
   public boolean f(){
       return super.isHighHumidity();
}
   public float g(){
       return super.getSpawningChance();
}
   public net.minecraft.world.biome.BiomeGenBase getBiome(int arg1){
       super.getBiome(arg1);
       return this;
}
   public net.minecraft.server.v1_7_R4.BiomeBase[] getBiomes(){
       return super.getBiomeGenArray();
}
   public java.util.List getMobs(net.minecraft.entity.EnumCreatureType arg1){
       return super.getSpawnableList(arg1);
}
   public int h(){
       return super.getIntRainfall();
}
   public boolean j(){
       return super.func_150559_j();
}
   public net.minecraft.world.biome.BiomeGenBase k(){
       super.createMutation();
       return this;
}
   public java.lang.Class l(){
       return super.getBiomeClass();
}
   public net.minecraft.world.biome.BiomeGenBase$TempCategory m(){
       return super.getTempCategory();
}
}