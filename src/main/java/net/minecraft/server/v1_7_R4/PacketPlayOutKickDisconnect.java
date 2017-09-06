package net.minecraft.server.v1_7_R4;

import net.minecraft.util.IChatComponent;

public class PacketPlayOutKickDisconnect extends net.minecraft.network.play.server.S40PacketDisconnect implements Packet
{
    public PacketPlayOutKickDisconnect() {
    }

    public PacketPlayOutKickDisconnect(IChatComponent p_i45191_1_) {
        super(p_i45191_1_);
    }

    public boolean a(){
       return super.hasPriority();
}
}