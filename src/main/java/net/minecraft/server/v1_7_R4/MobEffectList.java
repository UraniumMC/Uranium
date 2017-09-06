package net.minecraft.server.v1_7_R4;
public class MobEffectList extends net.minecraft.potion.Potion
{

   public java.lang.String a(){
       return super.getName();
}
   public net.minecraft.potion.Potion a(double arg1){
       super.setEffectiveness(arg1);
       return this;
}
   public boolean a(int arg1,int arg2){
       return super.isReady(arg1,arg2);
}
   public double a(int arg1,net.minecraft.entity.ai.attributes.AttributeModifier arg2){
       return super.func_111183_a(arg1,arg2);
}
   public void a(net.minecraft.entity.EntityLivingBase arg1,net.minecraft.entity.ai.attributes.BaseAttributeMap arg2,int arg3){
       super.removeAttributesModifiersFromEntity(arg1,arg2,arg3);
}
   public net.minecraft.potion.Potion a(net.minecraft.entity.ai.attributes.IAttribute arg1,java.lang.String arg2,double arg3,int arg4){
       super.func_111184_a(arg1,arg2,arg3,arg4);
       return this;
}
   public void applyInstantEffect(net.minecraft.entity.EntityLivingBase arg1,net.minecraft.entity.EntityLivingBase arg2,int arg3,double arg4){
       super.affectEntity(arg1,arg2,arg3,arg4);
}
   public net.minecraft.potion.Potion b(int arg1,int arg2){
       super.setIconIndex(arg1,arg2);
       return this;
}
   public net.minecraft.potion.Potion b(java.lang.String arg1){
       super.setPotionName(arg1);
       return this;
}
   public void b(net.minecraft.entity.EntityLivingBase arg1,net.minecraft.entity.ai.attributes.BaseAttributeMap arg2,int arg3){
       super.applyAttributesModifiersToEntity(arg1,arg2,arg3);
}
   public double getDurationModifier(){
       return super.getEffectiveness();
}
   public boolean i(){
       return super.isUsable();
}
   public int j(){
       return super.getLiquidColor();
}
   public void tick(net.minecraft.entity.EntityLivingBase arg1,int arg2){
       super.performEffect(arg1,arg2);
}
}