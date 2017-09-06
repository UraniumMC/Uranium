package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.ai.attributes.*;

public class AttributeModifiable extends net.minecraft.entity.ai.attributes.ModifiableAttributeInstance implements AttributeInstance
{
    public AttributeModifiable(BaseAttributeMap p_i1608_1_, net.minecraft.entity.ai.attributes.IAttribute p_i1608_2_) {
        super(p_i1608_1_, p_i1608_2_);
    }

    public java.util.Collection a(int arg1){
       return super.getModifiersByOperation(arg1);
}
   public net.minecraft.entity.ai.attributes.AttributeModifier a(java.util.UUID arg1){
       return super.getModifier(arg1);
}
   public void a(net.minecraft.entity.ai.attributes.AttributeModifier arg1){
       super.applyModifier(arg1);
}
   public double b(){
       return super.getBaseValue();
}
   public void b(net.minecraft.entity.ai.attributes.AttributeModifier arg1){
       super.removeModifier(arg1);
}
   public java.util.Collection c(){
       return super.func_111122_c();
}
   public net.minecraft.entity.ai.attributes.IAttribute getAttribute(){
       return super.getAttribute();
}
   public double getValue(){
       return super.getAttributeValue();
}
   public void setValue(double arg1){
       super.setBaseValue(arg1);
}
}