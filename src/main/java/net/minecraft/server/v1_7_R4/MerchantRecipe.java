package net.minecraft.server.v1_7_R4;
public class MerchantRecipe extends net.minecraft.village.MerchantRecipe
{

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