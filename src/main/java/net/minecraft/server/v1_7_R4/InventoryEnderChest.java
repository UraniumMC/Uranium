package net.minecraft.server.v1_7_R4;
public class InventoryEnderChest extends net.minecraft.inventory.InventoryEnderChest
{

   public boolean a(net.minecraft.entity.player.EntityPlayer arg1){
       return super.isUseableByPlayer(arg1);
}
   public void a(net.minecraft.nbt.NBTTagList arg1){
       super.loadInventoryFromNBT(arg1);
}
   public void a(net.minecraft.tileentity.TileEntityEnderChest arg1){
       super.func_146031_a(arg1);
}
   public void closeContainer(){
       super.closeInventory();
}
   public net.minecraft.nbt.NBTTagList h(){
       return super.saveInventoryToNBT();
}
   public void startOpen(){
       super.openInventory();
}
}