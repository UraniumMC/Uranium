package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ChatDeserializer extends net.minecraft.util.JsonUtils
{

   public java.lang.String a(JsonElement arg1,java.lang.String arg2){
       return super.getJsonElementStringValue(arg1,arg2);
}
   public java.lang.String d(JsonElement arg1){
       return super.getJsonElementTypeDescription(arg1);
}
   public boolean d(JsonObject arg1, java.lang.String arg2){
       return super.jsonObjectFieldTypeIsArray(arg1,arg2);
}
   public int f(JsonElement arg1, java.lang.String arg2){
       return super.getJsonElementIntegerValue(arg1,arg2);
}
   public boolean g(JsonObject arg1,java.lang.String arg2){
       return super.jsonObjectHasNamedField(arg1,arg2);
}
   public java.lang.String h(JsonObject arg1,java.lang.String arg2){
       return super.getJsonObjectStringFieldValue(arg1,arg2);
}
   public JsonObject l(JsonElement arg1,java.lang.String arg2){
       return super.getJsonElementAsJsonObject(arg1,arg2);
}
   public JsonArray m(JsonElement arg1, java.lang.String arg2){
       return super.getJsonElementAsJsonArray(arg1,arg2);
}
   public int m(JsonObject arg1,java.lang.String arg2){
       return super.getJsonObjectIntegerFieldValue(arg1,arg2);
}
   public JsonArray t(JsonObject arg1,java.lang.String arg2){
       return super.getJsonObjectJsonArrayField(arg1,arg2);
}
}