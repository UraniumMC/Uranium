package cc.uraniummc.events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
@RequiredArgsConstructor
@Getter
public class UraniumForgeEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    @Setter
    private boolean cancelled;
    private final cpw.mods.fml.common.eventhandler.Event forgeEvent;

    @Override
    public HandlerList getHandlers(){
        return handlers;
    }
}
