package net.minecraft.server.v1_7_R4;
public class NoiseGeneratorOctaves extends net.minecraft.world.gen.NoiseGeneratorOctaves
{

   public double[] a(double[] arg1,int arg2,int arg3,int arg4,int arg5,double arg6,double arg7,double arg8){
       return super.generateNoiseOctaves(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8);
}
   public double[] a(double[] arg1,int arg2,int arg3,int arg4,int arg5,int arg6,int arg7,double arg8,double arg9,double arg10){
       return super.generateNoiseOctaves(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10);
}
}