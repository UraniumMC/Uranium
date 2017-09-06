package net.minecraft.server.v1_7_R4;

import net.minecraft.network.*;
import net.minecraft.server.*;

public class LoginListener extends net.minecraft.server.network.NetHandlerLoginServer
{
    public LoginListener(net.minecraft.server.MinecraftServer p_i45298_1_, net.minecraft.network.NetworkManager p_i45298_2_) {
        super(p_i45298_1_, p_i45298_2_);
    }

    public void a(){
       super.onNetworkTick();
}
   public void a(net.minecraft.network.EnumConnectionState arg1,net.minecraft.network.EnumConnectionState arg2){
       super.onConnectionStateTransition(arg1,arg2);
}
   public void a(net.minecraft.util.IChatComponent arg1){
       super.onDisconnect(arg1);
}
   public void a(net.minecraft.network.login.client.C01PacketEncryptionResponse arg1){
       super.processEncryptionResponse(arg1);
}
   public void a(net.minecraft.network.login.client.C00PacketLoginStart arg1){
       super.processLoginStart(arg1);
}
   public void c(){
       super.func_147326_c();
}
   public void disconnect(java.lang.String arg1){
       super.func_147322_a(arg1);
}
   public java.lang.String getName(){
       return super.func_147317_d();
}
}