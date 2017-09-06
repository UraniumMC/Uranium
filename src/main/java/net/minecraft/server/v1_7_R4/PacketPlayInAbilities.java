package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.player.PlayerCapabilities;

public class PacketPlayInAbilities extends net.minecraft.network.play.client.C13PacketPlayerAbilities implements Packet
{
    public PacketPlayInAbilities() {
    }

    public PacketPlayInAbilities(PlayerCapabilities p_i45257_1_) {
        super(p_i45257_1_);
    }
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
   public boolean isFlying(){
       return super.func_149488_d();
}
}