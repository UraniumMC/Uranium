package net.minecraft.server.v1_7_R4;
public class ChatClickable extends net.minecraft.event.ClickEvent
{
    public ChatClickable(Action p_i45156_1_, String p_i45156_2_) {
        super(p_i45156_1_, p_i45156_2_);
    }

    public Action a(){
       return super.getAction();
}
   public java.lang.String b(){
       return super.getValue();
}
}