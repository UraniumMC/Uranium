package net.minecraft.server.v1_7_R4;

import java.util.UUID;

public class AttributeModifier extends net.minecraft.entity.ai.attributes.AttributeModifier
{
    public AttributeModifier(String p_i1605_1_, double p_i1605_2_, int p_i1605_4_) {
        super(p_i1605_1_, p_i1605_2_, p_i1605_4_);
    }

    public AttributeModifier(UUID p_i1606_1_, String p_i1606_2_, double p_i1606_3_, int p_i1606_5_) {
        super(p_i1606_1_, p_i1606_2_, p_i1606_3_, p_i1606_5_);
    }

    public java.util.UUID a(){
       return super.getID();
}
   public net.minecraft.entity.ai.attributes.AttributeModifier a(boolean arg1){
       super.setSaved(arg1);
       return this;
}
   public java.lang.String b(){
       return super.getName();
}
   public int c(){
       return super.getOperation();
}
   public double d(){
       return super.getAmount();
}
   public boolean e(){
       return super.isSaved();
}
}