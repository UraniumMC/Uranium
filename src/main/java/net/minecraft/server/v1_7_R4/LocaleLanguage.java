package net.minecraft.server.v1_7_R4;
public class LocaleLanguage extends net.minecraft.util.StringTranslate
{

   public net.minecraft.util.StringTranslate a(){
       return this;
}
   public java.lang.String a(java.lang.String arg1){
       return super.translateKey(arg1);
}
   public java.lang.String a(java.lang.String arg1,java.lang.Object[] arg2){
       return super.translateKeyFormat(arg1,arg2);
}
   public boolean b(java.lang.String arg1){
       return super.containsTranslateKey(arg1);
}
   public long c(){
       return super.getLastUpdateTimeInMilliseconds();
}
}