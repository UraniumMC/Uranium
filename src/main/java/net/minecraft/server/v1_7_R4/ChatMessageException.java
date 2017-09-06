package net.minecraft.server.v1_7_R4;

import net.minecraft.util.ChatComponentTranslation;

public class ChatMessageException extends net.minecraft.util.ChatComponentTranslationFormatException
{
    public ChatMessageException(ChatComponentTranslation p_i45161_1_, String p_i45161_2_) {
        super(p_i45161_1_, p_i45161_2_);
    }

    public ChatMessageException(ChatComponentTranslation p_i45162_1_, int p_i45162_2_) {
        super(p_i45162_1_, p_i45162_2_);
    }

    public ChatMessageException(ChatComponentTranslation p_i45163_1_, Throwable p_i45163_2_) {
        super(p_i45163_1_, p_i45163_2_);
    }
}