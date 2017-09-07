package net.minecraft.server.v1_7_R4;
public class ChatComponentText extends net.minecraft.util.ChatComponentText implements ChatBaseComponent
{
    public ChatComponentText(String p_i45159_1_) {
        super(p_i45159_1_);
    }

    public java.lang.String e(){
       return super.getUnformattedTextForChat();
}
   public net.minecraft.util.IChatComponent f(){
       return super.createCopy();
}
   public java.lang.String g(){
       return super.getChatComponentText_TextValue();
}
   public net.minecraft.util.ChatComponentText h(){
       super.createCopy();
       return this;
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
    public net.minecraft.util.IChatComponent setChatModifier(net.minecraft.util.ChatStyle arg1){
        return super.setChatStyle(arg1);
    }
}