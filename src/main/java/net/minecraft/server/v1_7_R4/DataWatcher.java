package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.*;

public class DataWatcher extends net.minecraft.entity.DataWatcher
{
    public DataWatcher(net.minecraft.entity.Entity p_i45313_1_) {
        super(p_i45313_1_);
    }

    public boolean a(){
       return super.hasChanges();
}
   public void a(int arg1,java.lang.Object arg2){
       super.addObject(arg1,arg2);
}
   public void add(int arg1,int arg2){
       super.addObjectByDataType(arg1,arg2);
}
   public java.util.List b(){
       return super.getChanged();
}
   public java.util.List c(){
       return super.getAllWatched();
}
   public boolean d(){
       return super.getIsBlank();
}
   public void e(){
       super.func_111144_e();
}
   public byte getByte(int arg1){
       return super.getWatchableObjectByte(arg1);
}
   public float getFloat(int arg1){
       return super.getWatchableObjectFloat(arg1);
}
   public int getInt(int arg1){
       return super.getWatchableObjectInt(arg1);
}
   public net.minecraft.item.ItemStack getItemStack(int arg1){
       return super.getWatchableObjectItemStack(arg1);
}
   public short getShort(int arg1){
       return super.getWatchableObjectShort(arg1);
}
   public java.lang.String getString(int arg1){
       return super.getWatchableObjectString(arg1);
}
   public void update(int arg1){
       super.setObjectWatched(arg1);
}
   public void watch(int arg1,java.lang.Object arg2){
       super.updateObject(arg1,arg2);
}
}