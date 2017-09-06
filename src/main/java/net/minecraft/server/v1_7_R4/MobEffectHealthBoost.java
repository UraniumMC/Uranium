package net.minecraft.server.v1_7_R4;
public class MobEffectHealthBoost extends net.minecraft.potion.PotionHealthBoost
{

   public void a(net.minecraft.entity.EntityLivingBase arg1,net.minecraft.entity.ai.attributes.BaseAttributeMap arg2,int arg3){
       super.removeAttributesModifiersFromEntity(arg1,arg2,arg3);
}
}