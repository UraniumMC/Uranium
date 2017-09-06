package net.minecraft.server.v1_7_R4;
public class LocaleI18n extends net.minecraft.util.StatCollector
{

   public long a(){
       return super.getLastTranslationUpdateTimeInMilliseconds();
}
   public java.lang.String b(java.lang.String arg1){
       return super.translateToFallback(arg1);
}
   public boolean c(java.lang.String arg1){
       return super.canTranslate(arg1);
}
   public java.lang.String get(java.lang.String arg1){
       return super.translateToLocal(arg1);
}
   public java.lang.String get(java.lang.String arg1,java.lang.Object[] arg2){
       return super.translateToLocalFormatted(arg1,arg2);
}
}