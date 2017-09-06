package net.minecraft.server.v1_7_R4;

import java.util.Random;

public class NoiseGenerator3Handler extends net.minecraft.world.gen.NoiseGeneratorSimplex
{
    public NoiseGenerator3Handler(Random p_i45471_1_) {
        super(p_i45471_1_);
    }

    public double a(double arg1, double arg2){
       return super.func_151605_a(arg1,arg2);
}
   public void a(double[] arg1,double arg2,double arg3,int arg4,int arg5,double arg6,double arg7,double arg8){
       super.func_151606_a(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8);
}
}