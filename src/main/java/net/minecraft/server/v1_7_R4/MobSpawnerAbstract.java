package net.minecraft.server.v1_7_R4;
public class MobSpawnerAbstract extends net.minecraft.tileentity.MobSpawnerBaseLogic
{

   public net.minecraft.world.World a(){
       return super.getSpawnerWorld();
}
   public void a(int arg1){
       super.func_98267_a(arg1);
}
   public net.minecraft.entity.Entity a(net.minecraft.entity.Entity arg1){
       return super.func_98265_a(arg1);
}
   public void a(net.minecraft.nbt.NBTTagCompound arg1){
       super.readFromNBT(arg1);
}
   public void a(net.minecraft.tileentity.MobSpawnerBaseLogic$WeightedRandomMinecart arg1){
       super.setRandomEntity(arg1);
}
   public int b(){
       return super.getSpawnerX();
}
   public boolean b(int arg1){
       return super.setDelayToMin(arg1);
}
   public void b(net.minecraft.nbt.NBTTagCompound arg1){
       super.writeToNBT(arg1);
}
   public int c(){
       return super.getSpawnerY();
}
   public int d(){
       return super.getSpawnerZ();
}
   public boolean f(){
       return super.isActivated();
}
   public void g(){
       super.updateSpawner();
}
   public java.lang.String getMobName(){
       return super.getEntityNameToSpawn();
}
   public net.minecraft.tileentity.MobSpawnerBaseLogic$WeightedRandomMinecart i(){
       return super.getRandomEntity();
}
   public void j(){
       super.resetTimer();
}
   public void setMobName(java.lang.String arg1){
       super.setEntityName(arg1);
}
}