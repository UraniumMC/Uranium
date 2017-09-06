package net.minecraft.server.v1_7_R4;
public class NibbleArray extends net.minecraft.world.chunk.NibbleArray
{
    public NibbleArray(int par1, int par2) {
        super(par1, par2);
    }

    public NibbleArray(byte[] par1ArrayOfByte, int par2) {
        super(par1ArrayOfByte, par2);
    }

    public int a(int arg1, int arg2, int arg3){
       return super.get(arg1,arg2,arg3);
}
   public void a(int arg1,int arg2,int arg3,int arg4){
       super.set(arg1,arg2,arg3,arg4);
}
}