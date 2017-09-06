package net.minecraft.server.v1_7_R4;
public class OldNibbleArray extends net.minecraft.world.chunk.storage.NibbleArrayReader
{
    public OldNibbleArray(byte[] p_i1998_1_, int p_i1998_2_) {
        super(p_i1998_1_, p_i1998_2_);
    }

    public int a(int arg1, int arg2, int arg3){
       return super.get(arg1,arg2,arg3);
}
}