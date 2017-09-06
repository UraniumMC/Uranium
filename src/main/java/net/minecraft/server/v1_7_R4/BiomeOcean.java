package net.minecraft.server.v1_7_R4;
public class BiomeOcean extends net.minecraft.world.biome.BiomeGenOcean
{

   public void a(net.minecraft.world.World arg1,java.util.Random arg2,net.minecraft.server.v1_7_R4.Block[] arg3,byte[] arg4,int arg5,int arg6,double arg7){
       super.genTerrainBlocks(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public net.minecraft.world.biome.BiomeGenBase$TempCategory m(){
       return super.getTempCategory();
}
}