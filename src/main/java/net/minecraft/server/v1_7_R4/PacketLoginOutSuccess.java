package net.minecraft.server.v1_7_R4;

import com.mojang.authlib.GameProfile;

public class PacketLoginOutSuccess extends net.minecraft.network.login.server.S02PacketLoginSuccess implements Packet
{
    public PacketLoginOutSuccess() {
    }

    public PacketLoginOutSuccess(GameProfile p_i45267_1_) {
        super(p_i45267_1_);
    }

}