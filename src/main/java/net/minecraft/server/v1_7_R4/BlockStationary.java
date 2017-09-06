package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.*;

public class BlockStationary extends net.minecraft.block.BlockStaticLiquid
{
    public BlockStationary(net.minecraft.block.material.Material p_i45429_1_) {
        super(p_i45429_1_);
    }

    public void a(net.minecraft.world.World arg1, int arg2, int arg3, int arg4, java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
}