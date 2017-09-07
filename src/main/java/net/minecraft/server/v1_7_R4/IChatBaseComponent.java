package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.IChatComponent;

public interface IChatBaseComponent extends net.minecraft.util.IChatComponent
{

   public java.util.List a();
   public net.minecraft.util.IChatComponent a(java.lang.String arg1);
   public net.minecraft.util.IChatComponent addSibling(net.minecraft.util.IChatComponent arg1);
   public java.lang.String c();
   public java.lang.String e();
   public net.minecraft.util.IChatComponent f();
   public net.minecraft.util.ChatStyle getChatModifier();
   public net.minecraft.util.IChatComponent setChatModifier(net.minecraft.util.ChatStyle arg1);

    public static class Serializer extends net.minecraft.util.IChatComponent.Serializer{
        public net.minecraft.util.IChatComponent a(java.lang.String arg1){
            return super.func_150699_a(arg1);
        }
        public java.lang.String a(net.minecraft.util.IChatComponent arg1){
            return super.func_150696_a(arg1);
        }
        public JsonElement a(net.minecraft.util.IChatComponent arg1, java.lang.reflect.Type arg2, JsonSerializationContext arg3){
            return super.serialize(arg1,arg2,arg3);
        }
        public net.minecraft.util.IChatComponent a(JsonElement arg1,java.lang.reflect.Type arg2,JsonDeserializationContext arg3){
            return super.deserialize(arg1,arg2,arg3);
        }
        public IChatComponent deserialize(JsonElement arg1, java.lang.reflect.Type arg2, JsonDeserializationContext arg3){
            return super.deserialize(arg1,arg2,arg3);
        }
        public JsonElement serialize(java.lang.Object arg1,java.lang.reflect.Type arg2,JsonSerializationContext arg3){
            return super.serialize(arg1,arg2,arg3);
        }
    }
}