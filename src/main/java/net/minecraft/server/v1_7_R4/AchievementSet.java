package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonElement;

public class AchievementSet extends net.minecraft.util.JsonSerializableSet
{

   public JsonElement a(){
       return super.getSerializableElement();
}
   public void a(JsonElement arg1){
       super.func_152753_a(arg1);
}
}