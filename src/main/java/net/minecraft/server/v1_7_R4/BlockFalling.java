package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockFalling extends net.minecraft.block.BlockFalling
{
    public BlockFalling() {
    }

    public BlockFalling(Material p_i45405_1_) {
        super(p_i45405_1_);
    }

    public void a(net.minecraft.entity.item.EntityFallingBlock arg1){
       super.func_149829_a(arg1);
}
   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       super.func_149828_a(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public boolean canFall(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.func_149831_e(arg1,arg2,arg3,arg4);
}
   public void doPhysics(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.onNeighborBlockChange(arg1,arg2,arg3,arg4,arg5);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
}