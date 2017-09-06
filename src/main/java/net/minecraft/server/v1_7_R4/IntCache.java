package net.minecraft.server.v1_7_R4;
public class IntCache extends net.minecraft.world.gen.layer.IntCache
{

   public void a(){
       super.resetIntCache();
}
   public int[] a(int arg1){
       return super.getIntCache(arg1);
}
   public java.lang.String b(){
       return super.getCacheSizes();
}
}