package net.minecraft.server.v1_7_R4;

import net.minecraft.potion.PotionEffect;

public class MobEffect extends net.minecraft.potion.PotionEffect
{
    public MobEffect(int p_i1574_1_, int p_i1574_2_) {
        super(p_i1574_1_, p_i1574_2_);
    }

    public MobEffect(int p_i1575_1_, int p_i1575_2_, int p_i1575_3_) {
        super(p_i1575_1_, p_i1575_2_, p_i1575_3_);
    }

    public MobEffect(int p_i1576_1_, int p_i1576_2_, int p_i1576_3_, boolean p_i1576_4_) {
        super(p_i1576_1_, p_i1576_2_, p_i1576_3_, p_i1576_4_);
    }

    public MobEffect(PotionEffect p_i1577_1_) {
        super(p_i1577_1_);
    }

    public void a(net.minecraft.potion.PotionEffect arg1){
       super.combine(arg1);
}
   public net.minecraft.nbt.NBTTagCompound a(net.minecraft.nbt.NBTTagCompound arg1){
       return super.writeCustomPotionEffectToNBT(arg1);
}
   public void b(net.minecraft.entity.EntityLivingBase arg1){
       super.performEffect(arg1);
}
   public net.minecraft.potion.PotionEffect b(net.minecraft.nbt.NBTTagCompound arg1){
       super.readCustomPotionEffectFromNBT(arg1);
       return this;
}
   public java.lang.String f(){
       return super.getEffectName();
}
   public int getEffectId(){
       return super.getPotionID();
}
   public boolean isAmbient(){
       return super.getIsAmbient();
}
   public void setSplash(boolean arg1){
       super.setSplashPotion(arg1);
}
   public boolean tick(net.minecraft.entity.EntityLivingBase arg1){
       return super.onUpdate(arg1);
}
}