package net.minecraft.server.v1_7_R4;

import cc.uraniummc.packet.S45PacketTitle;
import net.minecraft.util.IChatComponent;

/**
 * Created by xjboss on 2017/9/7.
 */
public class PacketPlayOutTitle extends S45PacketTitle {
    public PacketPlayOutTitle() {
    }

    public PacketPlayOutTitle(Type type, IChatComponent message) {
        super(type, message);
    }

    public PacketPlayOutTitle(int fadeInTime, int displayTime, int fadeOutTime) {
        super(fadeInTime, displayTime, fadeOutTime);
    }

    public PacketPlayOutTitle(Type type, IChatComponent message, int fadeInTime, int displayTime, int fadeOutTime) {
        super(type, message, fadeInTime, displayTime, fadeOutTime);
    }
    public static enum EnumTitleAction {
        TITLE,
        SUBTITLE,
        TIMES,
        ACTIONBAR,
        CLEAR,
        RESET;
    }
}
