package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.player.EntityPlayer;

public class FoodMetaData extends net.minecraft.util.FoodStats
{
    public FoodMetaData(EntityPlayer entityplayer) {
        super(entityplayer);
    }

    public void a(float arg1){
       super.addExhaustion(arg1);
}
   public void a(net.minecraft.entity.player.EntityPlayer arg1){
       super.onUpdate(arg1);
}
   public void a(net.minecraft.item.ItemFood arg1,net.minecraft.item.ItemStack arg2){
       super.func_151686_a(arg1,arg2);
}
   public void a(net.minecraft.nbt.NBTTagCompound arg1){
       super.readNBT(arg1);
}
   public void b(net.minecraft.nbt.NBTTagCompound arg1){
       super.writeNBT(arg1);
}
   public boolean c(){
       return super.needFood();
}
   public void eat(int arg1,float arg2){
       super.addStats(arg1,arg2);
}
}