package net.minecraft.server.v1_7_R4;
public class MobSpawner extends net.minecraft.tileentity.TileEntityMobSpawner$1
{

   public net.minecraft.world.World a(){
       return super.getSpawnerWorld();
}
   public void a(int arg1){
       super.func_98267_a(arg1);
}
   public void a(net.minecraft.tileentity.MobSpawnerBaseLogic$WeightedRandomMinecart arg1){
       super.setRandomEntity(arg1);
}
   public int b(){
       return super.getSpawnerX();
}
   public int c(){
       return super.getSpawnerY();
}
   public int d(){
       return super.getSpawnerZ();
}
}