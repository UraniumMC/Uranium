package net.minecraft.server.v1_7_R4;
public class ChatMessage extends net.minecraft.util.ChatComponentTranslation implements ChatBaseComponent
{
    public ChatMessage(String p_i45160_1_, Object... p_i45160_2_) {
        super(p_i45160_1_, p_i45160_2_);
    }
    public java.util.List a(){
        return super.getSiblings();
    }
    public java.util.Iterator a(java.lang.Iterable arg1){
        return super.createDeepCopyIterator(arg1);
    }
    public net.minecraft.util.IChatComponent a(java.lang.String arg1){
        return super.appendText(arg1);
    }
    public net.minecraft.util.IChatComponent addSibling(net.minecraft.util.IChatComponent arg1){
        return super.appendSibling(arg1);
    }
    public java.lang.String c(){
        return super.getUnformattedText();
    }
    public net.minecraft.util.ChatStyle getChatModifier(){
        return super.getChatStyle();
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