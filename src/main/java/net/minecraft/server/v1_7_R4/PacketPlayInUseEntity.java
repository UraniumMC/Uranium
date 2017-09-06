package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.Entity;

public class PacketPlayInUseEntity extends net.minecraft.network.play.client.C02PacketUseEntity implements Packet
{
    public PacketPlayInUseEntity() {
    }

    public PacketPlayInUseEntity(Entity p_i45251_1_, Action p_i45251_2_) {
        super(p_i45251_1_, p_i45251_2_);
    }

    public void a(net.minecraft.network.play.INetHandlerPlayServer arg1){
       super.processPacket(arg1);
}
   public net.minecraft.entity.Entity a(net.minecraft.world.World arg1){
       return super.func_149564_a(arg1);
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}