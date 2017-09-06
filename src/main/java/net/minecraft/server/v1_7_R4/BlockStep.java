package net.minecraft.server.v1_7_R4;
public class BlockStep extends net.minecraft.block.BlockStoneSlab implements BlockStepAbstract
{
    public BlockStep(boolean p_i45431_1_) {
        super(p_i45431_1_);
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