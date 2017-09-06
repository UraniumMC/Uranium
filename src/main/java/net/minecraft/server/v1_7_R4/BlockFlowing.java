package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockFlowing extends net.minecraft.block.BlockDynamicLiquid
{
    public BlockFlowing(Material p_i45403_1_) {
        super(p_i45403_1_);
    }

    public boolean L(){
       return super.func_149698_L();
}
   public int a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149810_a(arg1,arg2,arg3,arg4,arg5);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
}