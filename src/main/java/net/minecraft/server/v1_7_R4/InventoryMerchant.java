package net.minecraft.server.v1_7_R4;
public class InventoryMerchant extends net.minecraft.inventory.InventoryMerchant
{

   public boolean a(net.minecraft.entity.player.EntityPlayer arg1){
       return super.isUseableByPlayer(arg1);
}
   public boolean b(int arg1,net.minecraft.item.ItemStack arg2){
       return super.isItemValidForSlot(arg1,arg2);
}
   public void c(int arg1){
       super.setCurrentRecipeIndex(arg1);
}
   public void closeContainer(){
       super.closeInventory();
}
   public boolean d(int arg1){
       return super.inventoryResetNeededOnSlotChange(arg1);
}
   public net.minecraft.item.ItemStack getItem(int arg1){
       return super.getStackInSlot(arg1);
}
   public int getMaxStackSize(){
       return super.getInventoryStackLimit();
}
   public net.minecraft.village.MerchantRecipe getRecipe(){
       return super.getCurrentRecipe();
}
   public int getSize(){
       return super.getSizeInventory();
}
   public void h(){
       super.resetRecipeAndSlots();
}
   public boolean k_(){
       return super.hasCustomInventoryName();
}
   public void setItem(int arg1,net.minecraft.item.ItemStack arg2){
       super.setInventorySlotContents(arg1,arg2);
}
   public net.minecraft.item.ItemStack splitStack(int arg1,int arg2){
       return super.decrStackSize(arg1,arg2);
}
   public net.minecraft.item.ItemStack splitWithoutUpdate(int arg1){
       return super.getStackInSlotOnClosing(arg1);
}
   public void startOpen(){
       super.openInventory();
}
   public void update(){
       super.markDirty();
}
}