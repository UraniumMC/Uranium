package net.minecraft.server.v1_7_R4;
public class PacketPlayOutNamedSoundEffect extends net.minecraft.network.play.server.S29PacketSoundEffect
{
    public PacketPlayOutNamedSoundEffect() {
    }

    public PacketPlayOutNamedSoundEffect(String p_i45200_1_, double p_i45200_2_, double p_i45200_4_, double p_i45200_6_, float p_i45200_8_, float p_i45200_9_) {
        super(p_i45200_1_, p_i45200_2_, p_i45200_4_, p_i45200_6_, p_i45200_8_, p_i45200_9_);
    }

    public void a(net.minecraft.network.play.INetHandlerPlayClient arg1){
       super.processPacket(arg1);
}
   public void handle(net.minecraft.network.INetHandler arg1){
       super.processPacket(arg1);
}
}