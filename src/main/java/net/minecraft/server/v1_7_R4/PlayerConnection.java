package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetworkManager;
import net.minecraft.server.*;

public interface PlayerConnection
{
    public net.minecraft.network.NetworkManager b();
    public long d();
    public void disconnect(java.lang.String arg1);
    public void handleCommand(java.lang.String arg1);
    public void sendPacket(net.minecraft.network.Packet arg1);
}