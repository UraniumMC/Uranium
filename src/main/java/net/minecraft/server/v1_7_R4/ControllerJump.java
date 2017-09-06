package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.*;

public class ControllerJump extends net.minecraft.entity.ai.EntityJumpHelper
{
    public ControllerJump(net.minecraft.entity.EntityLiving p_i1612_1_) {
        super(p_i1612_1_);
    }

    public void a(){
       super.setJumping();
}
   public void b(){
       super.doJump();
}
}