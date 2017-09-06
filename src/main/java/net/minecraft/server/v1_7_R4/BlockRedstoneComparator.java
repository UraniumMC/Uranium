package net.minecraft.server.v1_7_R4;
public class BlockRedstoneComparator extends net.minecraft.block.BlockRedstoneComparator
{
    public BlockRedstoneComparator(boolean p_i45399_1_) {
        super(p_i45399_1_);
    }

    public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World arg1, int arg2){
       return super.createNewTileEntity(arg1,arg2);
}
   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.isGettingInput(arg1,arg2,arg3,arg4,arg5);
}
   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6){
       return super.onBlockEventReceived(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public void a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,java.util.Random arg5){
       super.updateTick(arg1,arg2,arg3,arg4,arg5);
}
   public int b(){
       return super.getRenderType();
}
   public int b(int arg1){
       return super.func_149901_b(arg1);
}
   public void b(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5){
       super.func_149897_b(arg1,arg2,arg3,arg4,arg5);
}
   public boolean c(int arg1){
       return super.func_149905_c(arg1);
}
   public boolean d(int arg1){
       return super.func_149969_d(arg1);
}
   public net.minecraft.block.BlockRedstoneDiode e(){
       return super.getBlockPowered();
}
   public net.minecraft.tileentity.TileEntityComparator e(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4){
       return super.getTileEntityComparator(arg1,arg2,arg3,arg4);
}
   public int f(net.minecraft.world.IBlockAccess arg1,int arg2,int arg3,int arg4,int arg5){
       return super.func_149904_f(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.item.Item getDropType(int arg1,java.util.Random arg2,int arg3){
       return super.getItemDropped(arg1,arg2,arg3);
}
   public int h(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5){
       return super.getInputStrength(arg1,arg2,arg3,arg4,arg5);
}
   public net.minecraft.block.BlockRedstoneDiode i(){
       return super.getBlockUnpowered();
}
   public boolean interact(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5,int arg6,float arg7,float arg8,float arg9){
       return super.onBlockActivated(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
}
   public void onPlace(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       super.onBlockAdded(arg1,arg2,arg3,arg4);
}
   public void remove(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.block.Block arg5,int arg6){
       super.breakBlock(arg1,arg2,arg3,arg4,arg5,arg6);
}
}