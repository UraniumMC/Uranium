package net.minecraft.server.v1_7_R4;
public class BlockWoodStep extends net.minecraft.block.BlockWoodSlab
{
    public BlockWoodStep(boolean p_i45437_1_) {
        super(p_i45437_1_);
    }

    public java.lang.String b(int arg1){
       return super.func_150002_b(arg1);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public net.minecraft.item.ItemStack j(int arg1){
       return super.createStackedBlock(arg1);
}
}