package net.minecraft.server.v1_7_R4;
public class PacketPlayInChat extends net.minecraft.network.play.client.C01PacketChatMessage implements Packet
{
    public PacketPlayInChat() {
    }

    public PacketPlayInChat(String p_i45240_1_) {
        super(p_i45240_1_);
    }

    public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}