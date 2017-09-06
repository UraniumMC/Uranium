package net.minecraft.server.v1_7_R4;
public class MerchantRecipeList extends net.minecraft.village.MerchantRecipeList
{

   public net.minecraft.nbt.NBTTagCompound a(){
       return super.getRecipiesAsTags();
}
   public net.minecraft.village.MerchantRecipe a(net.minecraft.item.ItemStack arg1,net.minecraft.item.ItemStack arg2,int arg3){
       return super.canRecipeBeUsed(arg1,arg2,arg3);
}
   public void a(net.minecraft.village.MerchantRecipe arg1){
       super.addToListWithCheck(arg1);
}
   public void a(net.minecraft.nbt.NBTTagCompound arg1){
       super.readRecipiesFromTags(arg1);
}
   public void a(net.minecraft.network.PacketBuffer arg1){
       super.func_151391_a(arg1);
}
}