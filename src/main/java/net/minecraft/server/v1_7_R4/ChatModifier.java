package net.minecraft.server.v1_7_R4;
public class ChatModifier extends net.minecraft.util.ChatStyle
{

   public net.minecraft.util.EnumChatFormatting a(){
       return super.getColor();
}
   public net.minecraft.util.ChatStyle a(net.minecraft.event.HoverEvent arg1){
       super.setChatHoverEvent(arg1);
       return this;
}
   public net.minecraft.util.ChatStyle a(net.minecraft.util.ChatStyle arg1){
       super.setParentStyle(arg1);
       return this;
}
   public boolean b(){
       return super.getBold();
}
   public boolean c(){
       return super.getItalic();
}
   public net.minecraft.util.ChatStyle clone(){
       super.createShallowCopy();
       return this;
}
   public boolean d(){
       return super.getStrikethrough();
}
   public boolean e(){
       return super.getUnderlined();
}
   public boolean f(){
       return super.getObfuscated();
}
   public boolean g(){
       return super.isEmpty();
}
   public net.minecraft.event.ClickEvent h(){
       return super.getChatClickEvent();
}
   public net.minecraft.event.HoverEvent i(){
       return super.getChatHoverEvent();
}
   public net.minecraft.util.ChatStyle m(){
       super.createDeepCopy();
       return this;
}
   public net.minecraft.util.ChatStyle setBold(java.lang.Boolean arg1){
       super.setBold(arg1);
       return this;
}
   public net.minecraft.util.ChatStyle setChatClickable(net.minecraft.event.ClickEvent arg1){
       super.setChatClickEvent(arg1);
       return this;
}
   public net.minecraft.util.ChatStyle setColor(net.minecraft.util.EnumChatFormatting arg1){
       super.setColor(arg1);
       return this;
}
   public net.minecraft.util.ChatStyle setItalic(java.lang.Boolean arg1){
       super.setItalic(arg1);
       return this;
}
   public net.minecraft.util.ChatStyle setRandom(java.lang.Boolean arg1){
       super.setObfuscated(arg1);
       return this;
}
   public net.minecraft.util.ChatStyle setStrikethrough(java.lang.Boolean arg1){
       super.setStrikethrough(arg1);
       return this;
}
   public net.minecraft.util.ChatStyle setUnderline(java.lang.Boolean arg1){
       super.setUnderlined(arg1);
       return this;
}
}