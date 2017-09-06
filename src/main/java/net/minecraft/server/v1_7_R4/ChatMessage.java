package net.minecraft.server.v1_7_R4;
public class ChatMessage extends net.minecraft.util.ChatComponentTranslation
{
    public ChatMessage(String p_i45160_1_, Object... p_i45160_2_) {
        super(p_i45160_1_, p_i45160_2_);
    }

    public void b(java.lang.String arg1){
       super.initializeFromFormat(arg1);
}
   public java.lang.String e(){
       return super.getUnformattedTextForChat();
}
   public net.minecraft.util.IChatComponent f(){
       return super.createCopy();
}
   public net.minecraft.util.ChatComponentTranslation h(){
       super.createCopy();
       return this;
}
   public java.lang.String i(){
       return super.getKey();
}
   public java.lang.Object[] j(){
       return super.getFormatArgs();
}
   public net.minecraft.util.IChatComponent setChatModifier(net.minecraft.util.ChatStyle arg1){
       return super.setChatStyle(arg1);
}
}