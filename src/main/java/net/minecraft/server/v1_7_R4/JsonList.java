package net.minecraft.server.v1_7_R4;

import com.google.gson.JsonObject;
import net.minecraft.server.management.UserListEntry;

import java.io.File;

public class JsonList extends net.minecraft.server.management.UserList
{
    public JsonList(File p_i1144_1_) {
        super(p_i1144_1_);
    }

    public java.lang.String a(java.lang.Object arg1){
       return super.func_152681_a(arg1);
}
   public net.minecraft.server.management.UserListEntry a(JsonObject arg1){
       return super.func_152682_a(arg1);
}
   public void a(boolean arg1){
       super.func_152686_a(arg1);
}
   public void add(UserListEntry arg1){
       super.func_152687_a(arg1);
}
   public java.io.File c(){
       return super.func_152691_c();
}
   public boolean d(java.lang.Object arg1){
       return super.func_152692_d(arg1);
}
   public java.util.Map e(){
       return super.func_152688_e();
}
   public net.minecraft.server.management.UserListEntry get(java.lang.Object arg1){
       return super.func_152683_b(arg1);
}
   public java.lang.String[] getEntries(){
       return super.func_152685_a();
}
   public boolean isEmpty(){
       return super.func_152690_d();
}
   public boolean isEnabled(){
       return super.func_152689_b();
}
   public void remove(java.lang.Object arg1){
       super.func_152684_c(arg1);
}
}