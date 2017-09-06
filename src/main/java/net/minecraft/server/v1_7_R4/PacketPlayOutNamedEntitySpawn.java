package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.player.EntityPlayer;

public class PacketPlayOutNamedEntitySpawn extends net.minecraft.network.play.server.S0CPacketSpawnPlayer
{
    public PacketPlayOutNamedEntitySpawn() {
    }

    public PacketPlayOutNamedEntitySpawn(EntityPlayer p_i45171_1_) {
        super(p_i45171_1_);
    }

    public void a(net.minecraft.network.play.INetHandlerPlayClient arg1){
       super.processPacket(arg1);
}
   public java.lang.String b(){
       return super.serialize();
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}