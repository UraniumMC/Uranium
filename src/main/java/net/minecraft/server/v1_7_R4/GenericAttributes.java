package net.minecraft.server.v1_7_R4;
public class GenericAttributes extends net.minecraft.entity.SharedMonsterAttributes
{

   public net.minecraft.nbt.NBTTagCompound a(net.minecraft.entity.ai.attributes.IAttributeInstance arg1){
       return super.writeAttributeInstanceToNBT(arg1);
}
   public void a(net.minecraft.entity.ai.attributes.IAttributeInstance arg1,net.minecraft.nbt.NBTTagCompound arg2){
       super.applyModifiersToAttributeInstance(arg1,arg2);
}
   public net.minecraft.nbt.NBTTagList a(net.minecraft.entity.ai.attributes.BaseAttributeMap arg1){
       return super.writeBaseAttributeMapToNBT(arg1);
}
   public void a(net.minecraft.entity.ai.attributes.BaseAttributeMap arg1,net.minecraft.nbt.NBTTagList arg2){
       super.func_151475_a(arg1,arg2);
}
   public net.minecraft.nbt.NBTTagCompound a(net.minecraft.entity.ai.attributes.AttributeModifier arg1){
       return super.writeAttributeModifierToNBT(arg1);
}
   public net.minecraft.entity.ai.attributes.AttributeModifier a(net.minecraft.nbt.NBTTagCompound arg1){
       return super.readAttributeModifierFromNBT(arg1);
}
}