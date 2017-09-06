package net.minecraft.server.v1_7_R4;

import java.util.Random;

public class NoiseGenerator3 extends net.minecraft.world.gen.NoiseGeneratorPerlin
{
    public NoiseGenerator3(Random p_i45470_1_, int p_i45470_2_) {
        super(p_i45470_1_, p_i45470_2_);
    }

    public double a(double arg1, double arg2){
       return super.func_151601_a(arg1,arg2);
}
   public double[] a(double[] arg1,double arg2,double arg3,int arg4,int arg5,double arg6,double arg7,double arg8){
       return super.func_151599_a(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8);
}
   public double[] a(double[] arg1,double arg2,double arg3,int arg4,int arg5,double arg6,double arg7,double arg8,double arg9){
       return super.func_151600_a(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
}