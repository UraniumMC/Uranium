package net.minecraft.server.v1_7_R4;

import com.mojang.authlib.GameProfile;

public class PacketLoginInStart extends net.minecraft.network.login.client.C00PacketLoginStart implements Packet
{
    public PacketLoginInStart() {
    }

    public PacketLoginInStart(GameProfile p_i45270_1_) {
        super(p_i45270_1_);
    }
}