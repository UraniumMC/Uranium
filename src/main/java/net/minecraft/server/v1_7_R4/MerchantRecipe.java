package net.minecraft.server.v1_7_R4;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class MerchantRecipe extends net.minecraft.village.MerchantRecipe
{
    public MerchantRecipe(NBTTagCompound p_i1940_1_) {
        super(p_i1940_1_);
    }

    public MerchantRecipe(ItemStack p_i1941_1_, ItemStack p_i1941_2_, ItemStack p_i1941_3_) {
        super(p_i1941_1_, p_i1941_2_, p_i1941_3_);
    }

    public MerchantRecipe(ItemStack p_i1942_1_, ItemStack p_i1942_2_) {
        super(p_i1942_1_, p_i1942_2_);
    }

    public MerchantRecipe(ItemStack p_i1943_1_, Item p_i1943_2_) {
        super(p_i1943_1_, p_i1943_2_);
    }

    public void a(int arg1){
       super.func_82783_a(arg1);
}
   public boolean a(net.minecraft.village.MerchantRecipe arg1){
       return super.hasSameIDsAs(arg1);
}
   public void a(net.minecraft.nbt.NBTTagCompound arg1){
       super.readFromTags(arg1);
}
   public boolean b(net.minecraft.village.MerchantRecipe arg1){
       return super.hasSameItemsAs(arg1);
}
   public void f(){
       super.incrementToolUses();
}
   public boolean g(){
       return super.isRecipeDisabled();
}
   public net.minecraft.item.ItemStack getBuyItem1(){
       return super.getItemToBuy();
}
   public net.minecraft.item.ItemStack getBuyItem2(){
       return super.getSecondItemToBuy();
}
   public net.minecraft.item.ItemStack getBuyItem3(){
       return super.getItemToSell();
}
   public boolean hasSecondItem(){
       return super.hasSecondItemToBuy();
}
   public net.minecraft.nbt.NBTTagCompound i(){
       return super.writeToTags();
}
}