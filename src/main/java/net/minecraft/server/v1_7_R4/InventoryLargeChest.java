package net.minecraft.server.v1_7_R4;

import net.minecraft.inventory.IInventory;

public class InventoryLargeChest extends net.minecraft.inventory.InventoryLargeChest
{
    public InventoryLargeChest(String p_i1559_1_, IInventory p_i1559_2_, IInventory p_i1559_3_) {
        super(p_i1559_1_, p_i1559_2_, p_i1559_3_);
    }

    public boolean a(net.minecraft.entity.player.EntityPlayer arg1){
       return super.isUseableByPlayer(arg1);
}
   public boolean a(net.minecraft.inventory.IInventory arg1){
       return super.isPartOfLargeChest(arg1);
}
   public boolean b(int arg1,net.minecraft.item.ItemStack arg2){
       return super.isItemValidForSlot(arg1,arg2);
}
   public void closeContainer(){
       super.closeInventory();
}
   public net.minecraft.item.ItemStack getItem(int arg1){
       return super.getStackInSlot(arg1);
}
   public int getMaxStackSize(){
       return super.getInventoryStackLimit();
}
   public int getSize(){
       return super.getSizeInventory();
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