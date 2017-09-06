package net.minecraft.server.v1_7_R4;
public class Navigation extends net.minecraft.pathfinding.PathNavigate
{

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
   public boolean a(int arg1,int arg2,int arg3,int arg4,int arg5,int arg6,net.minecraft.util.Vec3 arg7,double arg8,double arg9){
       return super.isSafeToStandAt(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
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
   public boolean a(net.minecraft.util.Vec3 arg1,net.minecraft.util.Vec3 arg2,int arg3,int arg4,int arg5){
       return super.isDirectPathBetweenPoints(arg1,arg2,arg3,arg4,arg5);
}
   public void a(boolean arg1){
       super.setAvoidsWater(arg1);
}
   public boolean b(int arg1,int arg2,int arg3,int arg4,int arg5,int arg6,net.minecraft.util.Vec3 arg7,double arg8,double arg9){
       return super.isPositionClear(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
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
   public void i(){
       super.pathFollow();
}
   public net.minecraft.util.Vec3 j(){
       return super.getEntityPosition();
}
   public int k(){
       return super.getPathableYPos();
}
   public boolean l(){
       return super.canNavigate();
}
   public boolean m(){
       return super.isInLiquid();
}
   public void n(){
       super.removeSunnyPath();
}
}