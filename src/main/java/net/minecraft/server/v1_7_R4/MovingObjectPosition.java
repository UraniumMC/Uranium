package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;

public class MovingObjectPosition extends net.minecraft.util.MovingObjectPosition
{
    public MovingObjectPosition(int p_i2303_1_, int p_i2303_2_, int p_i2303_3_, int p_i2303_4_, Vec3 p_i2303_5_) {
        super(p_i2303_1_, p_i2303_2_, p_i2303_3_, p_i2303_4_, p_i2303_5_);
    }

    public MovingObjectPosition(int p_i45481_1_, int p_i45481_2_, int p_i45481_3_, int p_i45481_4_, Vec3 p_i45481_5_, boolean p_i45481_6_) {
        super(p_i45481_1_, p_i45481_2_, p_i45481_3_, p_i45481_4_, p_i45481_5_, p_i45481_6_);
    }

    public MovingObjectPosition(Entity p_i2304_1_) {
        super(p_i2304_1_);
    }

    public MovingObjectPosition(Entity p_i45482_1_, Vec3 p_i45482_2_) {
        super(p_i45482_1_, p_i45482_2_);
    }
}