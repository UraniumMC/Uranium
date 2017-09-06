package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.ChatStyle;

public class ChatModifierSerializer extends net.minecraft.util.ChatStyle.Serializer
{

   public JsonElement a(net.minecraft.util.ChatStyle arg1,java.lang.reflect.Type arg2,JsonSerializationContext arg3){
       return super.serialize(arg1,arg2,arg3);
}
   public net.minecraft.util.ChatStyle a(JsonElement arg1, java.lang.reflect.Type arg2, JsonDeserializationContext arg3){
       return super.deserialize(arg1,arg2,arg3);
}
   public ChatStyle deserialize(JsonElement arg1, java.lang.reflect.Type arg2, JsonDeserializationContext arg3){
       return super.deserialize(arg1,arg2,arg3);
}
   public JsonElement serialize(java.lang.Object arg1,java.lang.reflect.Type arg2,JsonSerializationContext arg3){
       return super.serialize(arg1,arg2,arg3);
}
}