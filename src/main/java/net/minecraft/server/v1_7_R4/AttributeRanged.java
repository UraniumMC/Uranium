package net.minecraft.server.v1_7_R4;
public class AttributeRanged extends net.minecraft.entity.ai.attributes.RangedAttribute implements AttributeBase
{
    public AttributeRanged(String p_i1609_1_, double p_i1609_2_, double p_i1609_4_, double p_i1609_6_) {
        super(p_i1609_1_, p_i1609_2_, p_i1609_4_, p_i1609_6_);
    }

    public double a(double arg1){
       return super.clampValue(arg1);
}
   public net.minecraft.entity.ai.attributes.RangedAttribute a(java.lang.String arg1){
       super.setDescription(arg1);
       return this;
}
   public java.lang.String f(){
       return super.getDescription();
}
}