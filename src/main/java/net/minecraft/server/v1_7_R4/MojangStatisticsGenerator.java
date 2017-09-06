package net.minecraft.server.v1_7_R4;
public class MojangStatisticsGenerator extends net.minecraft.profiler.PlayerUsageSnooper
{

   public void a(){
       super.startSnooper();
}
   public void a(java.lang.String arg1,java.lang.Object arg2){
       super.func_152768_a(arg1,arg2);
}
   public net.minecraft.profiler.IPlayerUsage a(net.minecraft.profiler.PlayerUsageSnooper arg1){
       return super.access$000(arg1);
}
   public void b(){
       super.addMemoryStatsToSnooper();
}
   public void b(java.lang.String arg1,java.lang.Object arg2){
       super.func_152767_b(arg1,arg2);
}
   public java.lang.Object b(net.minecraft.profiler.PlayerUsageSnooper arg1){
       return super.access$100(arg1);
}
   public java.util.Map c(net.minecraft.profiler.PlayerUsageSnooper arg1){
       return super.access$200(arg1);
}
   public boolean d(){
       return super.isSnooperRunning();
}
   public int d(net.minecraft.profiler.PlayerUsageSnooper arg1){
       return super.access$300(arg1);
}
   public void e(){
       super.stopSnooper();
}
   public java.util.Map e(net.minecraft.profiler.PlayerUsageSnooper arg1){
       return super.access$400(arg1);
}
   public int f(net.minecraft.profiler.PlayerUsageSnooper arg1){
       return super.access$308(arg1);
}
   public long g(){
       return super.getMinecraftStartTimeMillis();
}
   public java.lang.String g(net.minecraft.profiler.PlayerUsageSnooper arg1){
       return super.access$500(arg1);
}
   public void h(){
       super.func_152766_h();
}
   public java.net.URL h(net.minecraft.profiler.PlayerUsageSnooper arg1){
       return super.access$600(arg1);
}
   public void i(){
       super.addJvmArgsToSnooper();
}
}