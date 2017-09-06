package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class Navigation extends net.minecraft.pathfinding.PathNavigate
{
    public Navigation(EntityLiving p_i1671_1_, World p_i1671_2_) {
        super(p_i1671_1_, p_i1671_2_);
    }

    public boolean a(){
       return super.getAvoidsWater();
}
   public void a(double arg1){
       super.setSpeed(arg1);
}
   public net.minecraft.pathfinding.PathEntity a(double arg1,double arg2,double arg3){
       return super.getPathToXYZ(arg1,arg2,arg3);
}
   public boolean a(double arg1,double arg2,double arg3,double arg4){
       return super.tryMoveToXYZ(arg1,arg2,arg3,arg4);
}

   public net.minecraft.pathfinding.PathEntity a(net.minecraft.entity.Entity arg1){
       return super.getPathToEntityLiving(arg1);
}
   public boolean a(net.minecraft.entity.Entity arg1,double arg2){
       return super.tryMoveToEntityLiving(arg1,arg2);
}
   public boolean a(net.minecraft.pathfinding.PathEntity arg1,double arg2){
       return super.setPath(arg1,arg2);
}

   public void a(boolean arg1){
       super.setAvoidsWater(arg1);
}

   public void b(boolean arg1){
       super.setBreakDoors(arg1);
}
   public boolean c(){
       return super.getCanBreakDoors();
}
   public void c(boolean arg1){
       super.setEnterDoors(arg1);
}
   public float d(){
       return super.getPathSearchRange();
}
   public void d(boolean arg1){
       super.setAvoidSun(arg1);
}
   public net.minecraft.pathfinding.PathEntity e(){
       return super.getPath();
}
   public void e(boolean arg1){
       super.setCanSwim(arg1);
}
   public void f(){
       super.onUpdateNavigation();
}
   public boolean g(){
       return super.noPath();
}
   public void h(){
       super.clearPathEntity();
}
}