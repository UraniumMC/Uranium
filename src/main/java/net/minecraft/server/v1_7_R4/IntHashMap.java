package net.minecraft.server.v1_7_R4;
public class IntHashMap extends net.minecraft.util.IntHashMap
{

   public int a(int arg1,int arg2){
       return super.getSlotIndex(arg1,arg2);
}
   public void a(int arg1,int arg2,java.lang.Object arg3,int arg4){
       super.insert(arg1,arg2,arg3,arg4);
}
   public void a(int arg1,java.lang.Object arg2){
       super.addKey(arg1,arg2);
}
   public void a(net.minecraft.server.v1_7_R4.IntHashMapEntry[] arg1){
       super.copyTo(arg1);
}
   public boolean b(int arg1){
       return super.containsItem(arg1);
}
   public void c(){
       super.clearMap();
}
   public net.minecraft.util.IntHashMap$Entry c(int arg1){
       return super.lookupEntry(arg1);
}
   public java.lang.Object d(int arg1){
       return super.removeObject(arg1);
}
   public net.minecraft.util.IntHashMap$Entry e(int arg1){
       return super.removeEntry(arg1);
}
   public int f(int arg1){
       return super.access$000(arg1);
}
   public int g(int arg1){
       return super.computeHash(arg1);
}
   public java.lang.Object get(int arg1){
       return super.lookup(arg1);
}
   public void h(int arg1){
       super.grow(arg1);
}
}