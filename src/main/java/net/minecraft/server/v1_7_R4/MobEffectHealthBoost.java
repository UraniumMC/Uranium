package net.minecraft.server.v1_7_R4;
public class MobEffectHealthBoost extends net.minecraft.potion.PotionHealthBoost
{
    public MobEffectHealthBoost(int p_i1571_1_, boolean p_i1571_2_, int p_i1571_3_) {
        super(p_i1571_1_, p_i1571_2_, p_i1571_3_);
    }

    public void a(net.minecraft.entity.EntityLivingBase arg1, net.minecraft.entity.ai.attributes.BaseAttributeMap arg2, int arg3){
       super.removeAttributesModifiersFromEntity(arg1,arg2,arg3);
}
}