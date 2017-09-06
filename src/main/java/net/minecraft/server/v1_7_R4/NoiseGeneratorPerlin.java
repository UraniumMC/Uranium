package net.minecraft.server.v1_7_R4;
public class NoiseGeneratorPerlin extends net.minecraft.world.gen.NoiseGeneratorImproved
{

   public double a(int arg1,double arg2,double arg3){
       return super.func_76309_a(arg1,arg2,arg3);
}
   public double a(int arg1,double arg2,double arg3,double arg4){
       return super.grad(arg1,arg2,arg3,arg4);
}
   public void a(double[] arg1,double arg2,double arg3,double arg4,int arg5,int arg6,int arg7,double arg8,double arg9,double arg10,double arg11){
       super.populateNoiseArray(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11);
}
   public double b(double arg1,double arg2,double arg3){
       return super.lerp(arg1,arg2,arg3);
}
}