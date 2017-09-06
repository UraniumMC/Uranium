package net.minecraft.server.v1_7_R4;
public class PacketPlayOutTransaction extends net.minecraft.network.play.server.S32PacketConfirmTransaction
{
    public PacketPlayOutTransaction() {
    }

    public PacketPlayOutTransaction(int p_i45182_1_, short p_i45182_2_, boolean p_i45182_3_) {
        super(p_i45182_1_, p_i45182_2_, p_i45182_3_);
    }

    public java.lang.String b(){
       return super.serialize();
}
}