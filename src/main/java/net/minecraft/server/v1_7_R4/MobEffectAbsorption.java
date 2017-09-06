package net.minecraft.server.v1_7_R4;
public class MobEffectAbsorption extends net.minecraft.potion.PotionAbsoption
{
    public MobEffectAbsorption(int p_i1569_1_, boolean p_i1569_2_, int p_i1569_3_) {
        super(p_i1569_1_, p_i1569_2_, p_i1569_3_);
    }

    public void a(net.minecraft.entity.EntityLivingBase arg1, net.minecraft.entity.ai.attributes.BaseAttributeMap arg2, int arg3){
       super.removeAttributesModifiersFromEntity(arg1,arg2,arg3);
}
   public void b(net.minecraft.entity.EntityLivingBase arg1,net.minecraft.entity.ai.attributes.BaseAttributeMap arg2,int arg3){
       super.applyAttributesModifiersToEntity(arg1,arg2,arg3);
}
}