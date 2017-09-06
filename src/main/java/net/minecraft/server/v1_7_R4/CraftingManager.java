package net.minecraft.server.v1_7_R4;
public class CraftingManager extends net.minecraft.item.crafting.CraftingManager
{

   public net.minecraft.item.ItemStack craft(net.minecraft.inventory.InventoryCrafting arg1,net.minecraft.world.World arg2){
       return super.findMatchingRecipe(arg1,arg2);
}
   public java.util.List getRecipes(){
       return super.getRecipeList();
}
   public net.minecraft.item.crafting.ShapedRecipes registerShapedRecipe(net.minecraft.item.ItemStack arg1,java.lang.Object[] arg2){
       return super.addRecipe(arg1,arg2);
}
   public void registerShapelessRecipe(net.minecraft.item.ItemStack arg1,java.lang.Object[] arg2){
       super.addShapelessRecipe(arg1,arg2);
}
}