package net.minecraft.server.v1_7_R4;

import net.minecraft.util.IChatComponent;

public class PacketLoginOutDisconnect extends net.minecraft.network.login.server.S00PacketDisconnect implements Packet
{
    public PacketLoginOutDisconnect() {
    }

    public PacketLoginOutDisconnect(IChatComponent p_i45269_1_) {
        super(p_i45269_1_);
    }
}