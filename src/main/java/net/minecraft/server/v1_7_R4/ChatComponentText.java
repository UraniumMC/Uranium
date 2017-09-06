package net.minecraft.server.v1_7_R4;
public class ChatComponentText extends net.minecraft.util.ChatComponentText
{

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
}