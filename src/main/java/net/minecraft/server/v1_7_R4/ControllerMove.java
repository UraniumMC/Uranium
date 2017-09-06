package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.*;

public class ControllerMove extends net.minecraft.entity.ai.EntityMoveHelper
{
    public ControllerMove(net.minecraft.entity.EntityLiving p_i1614_1_) {
        super(p_i1614_1_);
    }

    public boolean a(){
       return super.isUpdating();
}
   public void a(double arg1,double arg2,double arg3,double arg4){
       super.setMoveTo(arg1,arg2,arg3,arg4);
}
   public double b(){
       return super.getSpeed();
}
   public void c(){
       super.onUpdateMoveHelper();
}
}