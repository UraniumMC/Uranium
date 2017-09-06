package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonElement;

public class BanEntrySerializer extends net.minecraft.server.management.PlayerProfileCache.Serializer
{
    public BanEntrySerializer() {
    }

    public JsonElement a(net.minecraft.server.management.PlayerProfileCache.ProfileEntry arg1, java.lang.reflect.Type arg2, net.minecraft.util.com.google.gson.JsonSerializationContext arg3){
       return super.func_152676_a(arg1,arg2,arg3);
}
   public net.minecraft.server.management.PlayerProfileCache$ProfileEntry a(net.minecraft.util.com.google.gson.JsonElement arg1,java.lang.reflect.Type arg2,net.minecraft.util.com.google.gson.JsonDeserializationContext arg3){
       return super.func_152675_a(arg1,arg2,arg3);
}
   public java.lang.Object deserialize(net.minecraft.util.com.google.gson.JsonElement arg1,java.lang.reflect.Type arg2,net.minecraft.util.com.google.gson.JsonDeserializationContext arg3){
       return super.deserialize(arg1,arg2,arg3);
}
   public net.minecraft.util.com.google.gson.JsonElement serialize(java.lang.Object arg1,java.lang.reflect.Type arg2,net.minecraft.util.com.google.gson.JsonSerializationContext arg3){
       return super.serialize(arg1,arg2,arg3);
}
}