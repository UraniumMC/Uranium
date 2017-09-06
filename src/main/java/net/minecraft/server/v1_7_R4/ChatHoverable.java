package net.minecraft.server.v1_7_R4;

import net.minecraft.util.IChatComponent;

public class ChatHoverable extends net.minecraft.event.HoverEvent
{
    public ChatHoverable(Action p_i45158_1_, IChatComponent p_i45158_2_) {
        super(p_i45158_1_, p_i45158_2_);
    }

    public Action a(){
       return super.getAction();
}
   public net.minecraft.util.IChatComponent b(){
       return super.getValue();
}
}