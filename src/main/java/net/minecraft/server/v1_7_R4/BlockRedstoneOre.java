package net.minecraft.server.v1_7_R4;
public class BlockRedstoneOre extends net.minecraft.block.BlockRedstoneOre
{
    public BlockRedstoneOre(boolean p_i45420_1_) {
        super(p_i45420_1_);
    }

    public int a(java.util.Random arg1){
       return super.quantityDropped(arg1);
}
   public int a(net.minecraft.world.World arg1){
       return super.tickRate(arg1);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public void attack(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5){
       super.onBlockClicked(arg1,arg2,arg3,arg4,arg5);
}
   public void b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.Entity arg5){
       super.onEntityWalking(arg1,arg2,arg3,arg4,arg5);
}
   public void dropNaturally(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,float arg6,int arg7){
       super.dropBlockAsItemWithChance(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public int getDropCount(int arg1,java.util.Random arg2){
       return super.quantityDroppedWithBonus(arg1,arg2);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public net.minecraft.item.ItemStack j(int arg1){
       return super.createStackedBlock(arg1);
}
}