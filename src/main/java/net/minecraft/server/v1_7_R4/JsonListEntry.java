package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonObject;

public class JsonListEntry extends net.minecraft.server.management.UserListEntry
{
    public JsonListEntry(Object p_i1146_1_) {
        super(p_i1146_1_);
    }

    public JsonListEntry(Object p_i1147_1_, JsonObject p_i1147_2_) {
        super(p_i1147_1_, p_i1147_2_);
    }

    public void a(JsonObject arg1){
       super.func_152641_a(arg1);
}
   public java.lang.Object getKey(){
       return super.func_152640_f();
}
}