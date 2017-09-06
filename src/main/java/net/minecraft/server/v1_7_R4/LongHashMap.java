package net.minecraft.server.v1_7_R4;
public class LongHashMap extends net.minecraft.util.LongHashMap
{

   public boolean contains(long arg1){
       return super.containsItem(arg1);
}
   public int count(){
       return super.getNumHashElements();
}
   public java.lang.Object getEntry(long arg1){
       return super.getValueByKey(arg1);
}
   public void put(long arg1,java.lang.Object arg2){
       super.add(arg1,arg2);
}
}