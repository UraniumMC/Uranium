package net.minecraft.server.v1_7_R4;
public class AttributeMapServer extends net.minecraft.entity.ai.attributes.ServersideAttributeMap implements AttributeMapBase
{

   public net.minecraft.entity.ai.attributes.IAttributeInstance a(java.lang.String arg1){
       return super.getAttributeInstanceByName(arg1);
}
   public void a(net.minecraft.entity.ai.attributes.ModifiableAttributeInstance arg1){
       super.addAttributeInstance(arg1);
}
   public net.minecraft.entity.ai.attributes.IAttributeInstance a(net.minecraft.entity.ai.attributes.IAttribute arg1){
       return super.getAttributeInstance(arg1);
}
   public net.minecraft.entity.ai.attributes.ModifiableAttributeInstance b(java.lang.String arg1){
       return super.getAttributeInstanceByName(arg1);
}
   public net.minecraft.entity.ai.attributes.IAttributeInstance b(net.minecraft.entity.ai.attributes.IAttribute arg1){
       return super.registerAttribute(arg1);
}
   public java.util.Collection c(){
       return super.getWatchedAttributes();
}
   public net.minecraft.entity.ai.attributes.ModifiableAttributeInstance c(net.minecraft.entity.ai.attributes.IAttribute arg1){
       return super.getAttributeInstance(arg1);
}
   public java.util.Set getAttributes(){
       return super.getAttributeInstanceSet();
}
}