package cc.uraniummc.eventexecutor;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

import org.bukkit.event.Event;
import org.bukkit.event.Listener;

/**
 * @author paper
 */
public class StaticMethodEventExecutor extends EventExecutorImp{

    private final Class<? extends Event> mEventClass;
    private final MethodHandle mHandle;

    public StaticMethodEventExecutor(Class<? extends Event> pEventClass,Method pMethod){
        this.mEventClass=pEventClass;
        try{
            pMethod.setAccessible(true);
            this.mHandle=MethodHandles.lookup().unreflect(pMethod);
        }catch(IllegalAccessException e){
            throw new AssertionError("Unable to set accessible",e);
        }
    }

    @Override
    public void invoke(Listener pListener,Event pEvent) throws Throwable{
        this.mHandle.invoke(pEvent);
    }
}
