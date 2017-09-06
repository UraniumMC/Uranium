package net.minecraft.server.v1_7_R4;
public class MobEffectAbsorption extends net.minecraft.potion.PotionAbsoption
{

   public void a(net.minecraft.entity.EntityLivingBase arg1,net.minecraft.entity.ai.attributes.BaseAttributeMap arg2,int arg3){
       super.removeAttributesModifiersFromEntity(arg1,arg2,arg3);
}
   public void b(net.minecraft.entity.EntityLivingBase arg1,net.minecraft.entity.ai.attributes.BaseAttributeMap arg2,int arg3){
       super.applyAttributesModifiersToEntity(arg1,arg2,arg3);
}
}