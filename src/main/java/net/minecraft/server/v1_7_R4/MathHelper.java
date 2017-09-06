package net.minecraft.server.v1_7_R4;
public class MathHelper extends net.minecraft.util.MathHelper
{

   public double a(double arg1,double arg2){
       return super.abs_max(arg1,arg2);
}
   public double a(double arg1,double arg2,double arg3){
       return super.clamp_double(arg1,arg2,arg3);
}
   public float a(float arg1,float arg2,float arg3){
       return super.clamp_float(arg1,arg2,arg3);
}
   public int a(int arg1){
       return super.abs_int(arg1);
}
   public int a(int arg1,int arg2,int arg3){
       return super.clamp_int(arg1,arg2,arg3);
}
   public double a(java.lang.String arg1,double arg2){
       return super.parseDoubleWithDefault(arg1,arg2);
}
   public double a(java.lang.String arg1,double arg2,double arg3){
       return super.parseDoubleWithDefaultAndMax(arg1,arg2,arg3);
}
   public int a(java.lang.String arg1,int arg2){
       return super.parseIntWithDefault(arg1,arg2);
}
   public int a(java.lang.String arg1,int arg2,int arg3){
       return super.parseIntWithDefaultAndMax(arg1,arg2,arg3);
}
   public double a(java.util.Random arg1,double arg2,double arg3){
       return super.getRandomDoubleInRange(arg1,arg2,arg3);
}
   public float a(java.util.Random arg1,float arg2,float arg3){
       return super.randomFloatClamp(arg1,arg2,arg3);
}
   public double a(long[] arg1){
       return super.average(arg1);
}
   public double b(double arg1,double arg2,double arg3){
       return super.denormalizeClamp(arg1,arg2,arg3);
}
   public float c(float arg1){
       return super.sqrt_float(arg1);
}
   public long d(double arg1){
       return super.floor_double_long(arg1);
}
   public int d(float arg1){
       return super.floor_float(arg1);
}
   public int f(double arg1){
       return super.ceiling_double_int(arg1);
}
   public int f(float arg1){
       return super.ceiling_float_int(arg1);
}
   public int floor(double arg1){
       return super.floor_double(arg1);
}
   public double g(double arg1){
       return super.wrapAngleTo180_double(arg1);
}
   public float g(float arg1){
       return super.wrapAngleTo180_float(arg1);
}
   public int nextInt(java.util.Random arg1,int arg2,int arg3){
       return super.getRandomIntegerInRange(arg1,arg2,arg3);
}
   public float sqrt(double arg1){
       return super.sqrt_double(arg1);
}
}