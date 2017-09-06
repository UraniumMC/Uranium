package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

import java.io.File;

public class OpList extends net.minecraft.server.management.UserListOps
{
    public OpList(File p_i1152_1_) {
        super(p_i1152_1_);
    }

    public java.lang.String a(java.lang.Object arg1){
       return super.func_152681_a(arg1);
}
   public net.minecraft.server.management.UserListEntry a(JsonObject arg1){
       return super.func_152682_a(arg1);
}
   public java.lang.String b(GameProfile arg1){
       return super.func_152699_b(arg1);
}
   public java.lang.String[] getEntries(){
       return super.func_152685_a();
}
}