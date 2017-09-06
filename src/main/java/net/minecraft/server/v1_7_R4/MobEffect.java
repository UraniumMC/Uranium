package net.minecraft.server.v1_7_R4;
public class MobEffect extends net.minecraft.potion.PotionEffect
{

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
   public int h(){
       return super.deincrementDuration();
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