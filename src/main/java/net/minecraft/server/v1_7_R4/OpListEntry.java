package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

public class OpListEntry extends net.minecraft.server.management.UserListOpsEntry
{
    public OpListEntry(GameProfile p_i1149_1_, int p_i1149_2_) {
        super(p_i1149_1_, p_i1149_2_);
    }

    public OpListEntry(JsonObject p_i1150_1_) {
        super(p_i1150_1_);
    }

    public int a(){
       return super.func_152644_a();
}
   public void a(JsonObject arg1){
       super.func_152641_a(arg1);
}
}