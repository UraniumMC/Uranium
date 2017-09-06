package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.*;

public class ControllerLook extends net.minecraft.entity.ai.EntityLookHelper
{
    public ControllerLook(net.minecraft.entity.EntityLiving p_i1613_1_) {
        super(p_i1613_1_);
    }

    public void a(){
       super.onUpdateLook();
}
   public void a(double arg1,double arg2,double arg3,float arg4,float arg5){
       super.setLookPosition(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.entity.Entity arg1,float arg2,float arg3){
       super.setLookPositionWithEntity(arg1,arg2,arg3);
}
}