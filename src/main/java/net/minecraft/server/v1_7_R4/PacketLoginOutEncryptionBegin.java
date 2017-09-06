package net.minecraft.server.v1_7_R4;

import java.security.PublicKey;

public class PacketLoginOutEncryptionBegin extends net.minecraft.network.login.server.S01PacketEncryptionRequest implements Packet
{
    public PacketLoginOutEncryptionBegin() {
    }

    public PacketLoginOutEncryptionBegin(String p_i45268_1_, PublicKey p_i45268_2_, byte[] p_i45268_3_) {
        super(p_i45268_1_, p_i45268_2_, p_i45268_3_);
    }
}