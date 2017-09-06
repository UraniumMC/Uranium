package net.minecraft.server.v1_7_R4;
public class BiomePlains extends net.minecraft.world.biome.BiomeGenPlains
{

   public java.lang.String a(java.util.Random arg1,int arg2,int arg3,int arg4){
       return super.func_150572_a(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4){
       super.decorate(arg1,arg2,arg3,arg4);
}
   public net.minecraft.world.biome.BiomeGenBase k(){
       return super.createMutation();
}
}