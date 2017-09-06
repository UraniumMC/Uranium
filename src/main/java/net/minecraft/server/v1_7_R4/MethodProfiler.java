package net.minecraft.server.v1_7_R4;
public class MethodProfiler extends net.minecraft.profiler.Profiler
{

   public void a(){
       super.clearProfiling();
}
   public void a(java.lang.String arg1){
       super.startSection(arg1);
}
   public void b(){
       super.endSection();
}
   public java.util.List b(java.lang.String arg1){
       return super.getProfilingData(arg1);
}
   public java.lang.String c(){
       return super.getNameOfLastSection();
}
   public void c(java.lang.String arg1){
       super.endStartSection(arg1);
}
}