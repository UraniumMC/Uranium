package net.minecraft.server.v1_7_R4;
public class MobEffectAttackDamage extends net.minecraft.potion.PotionAttackDamage
{
    public MobEffectAttackDamage(int p_i1570_1_, boolean p_i1570_2_, int p_i1570_3_) {
        super(p_i1570_1_, p_i1570_2_, p_i1570_3_);
    }

    public double a(int arg1, net.minecraft.entity.ai.attributes.AttributeModifier arg2){
       return super.func_111183_a(arg1,arg2);
}
}