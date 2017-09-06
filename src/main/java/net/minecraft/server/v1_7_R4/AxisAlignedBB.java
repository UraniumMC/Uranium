package net.minecraft.server.v1_7_R4;
public class AxisAlignedBB extends net.minecraft.util.AxisAlignedBB
{
    public AxisAlignedBB(double p_i2300_1_, double p_i2300_3_, double p_i2300_5_, double p_i2300_7_, double p_i2300_9_, double p_i2300_11_) {
        super(p_i2300_1_, p_i2300_3_, p_i2300_5_, p_i2300_7_, p_i2300_9_, p_i2300_11_);
    }

    public double a(){
       return super.getAverageEdgeLength();
}
   public net.minecraft.util.AxisAlignedBB a(double arg1,double arg2,double arg3){
       super.addCoord(arg1,arg2,arg3);
       return this;
}
   public net.minecraft.util.AxisAlignedBB a(double arg1,double arg2,double arg3,double arg4,double arg5,double arg6){
       super.getBoundingBox(arg1,arg2,arg3,arg4,arg5,arg6);
       return this;
}
   public net.minecraft.util.AxisAlignedBB a(net.minecraft.util.AxisAlignedBB arg1){
       super.func_111270_a(arg1);
       return this;
}
   public double a(net.minecraft.util.AxisAlignedBB arg1,double arg2){
       return super.calculateXOffset(arg1,arg2);
}
   public boolean a(net.minecraft.util.Vec3 arg1){
       return super.isVecInside(arg1);
}
   public net.minecraft.util.MovingObjectPosition a(net.minecraft.util.Vec3 arg1,net.minecraft.util.Vec3 arg2){
       return super.calculateIntercept(arg1,arg2);
}
   public net.minecraft.util.AxisAlignedBB b(double arg1,double arg2,double arg3,double arg4,double arg5,double arg6){
       super.setBounds(arg1,arg2,arg3,arg4,arg5,arg6);
       return this;
}
   public boolean b(net.minecraft.util.AxisAlignedBB arg1){
       return super.intersectsWith(arg1);
}
   public double b(net.minecraft.util.AxisAlignedBB arg1,double arg2){
       return super.calculateYOffset(arg1,arg2);
}
   public net.minecraft.util.AxisAlignedBB c(double arg1,double arg2,double arg3){
       super.getOffsetBoundingBox(arg1,arg2,arg3);
       return this;
}
   public double c(net.minecraft.util.AxisAlignedBB arg1,double arg2){
       return super.calculateZOffset(arg1,arg2);
}
   public net.minecraft.util.AxisAlignedBB clone(){
       super.copy();
       return this;
}
   public net.minecraft.util.AxisAlignedBB d(double arg1,double arg2,double arg3){
       super.offset(arg1,arg2,arg3);
       return this;
}
   public void d(net.minecraft.util.AxisAlignedBB arg1){
       super.setBB(arg1);
}
   public net.minecraft.util.AxisAlignedBB grow(double arg1,double arg2,double arg3){
       super.expand(arg1,arg2,arg3);
       return this;
}
   public net.minecraft.util.AxisAlignedBB shrink(double arg1,double arg2,double arg3){
       super.contract(arg1,arg2,arg3);
       return this;
}
}