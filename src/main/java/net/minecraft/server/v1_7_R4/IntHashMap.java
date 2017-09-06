package net.minecraft.server.v1_7_R4;
public class IntHashMap extends net.minecraft.util.IntHashMap
{
    public IntHashMap() {
    }

    public void a(int arg1, java.lang.Object arg2){
       super.addKey(arg1,arg2);
}
   public boolean b(int arg1){
       return super.containsItem(arg1);
}
   public void c(){
       super.clearMap();
}
   public java.lang.Object d(int arg1){
       return super.removeObject(arg1);
}
   public java.lang.Object get(int arg1){
       return super.lookup(arg1);
}
}