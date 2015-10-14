package kcauldron;

import org.bukkit.craftbukkit.SpigotTimings;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.MinecraftException;

public class KCauldronWorldSaveThread extends Thread {
    private final MinecraftServer mServer;
    private int mLastSaveTick = -1;
    private int mNextSaveTick = -1;

    public KCauldronWorldSaveThread(MinecraftServer server) {
        super(KCauldron.sKCauldronThreadGroup, "KCauldron World Save");
        mServer = server;
        setPriority(Thread.MIN_PRIORITY);
        setDaemon(true);
    }

    @Override
    public void run() {
        KLog.get().info("Starting KCauldron World Saver thread...");
        try {
            while (!isInterrupted()) {
                if (mLastSaveTick < 0) {
                    mLastSaveTick = mServer.tickCounter;
                }
                mNextSaveTick = mLastSaveTick + mServer.autosavePeriod;
                while (mNextSaveTick > mServer.tickCounter) {
                    try {
                        sleep((mNextSaveTick - mServer.tickCounter) * 50);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
                SpigotTimings.worldSaveTimer.startTiming();
                try {
                    mServer.serverConfigManager.saveAllPlayerData();
                    mServer.saveAllWorlds(true);
                } catch (MinecraftException e) {
                    new RuntimeException("Error occurred during save world", e).printStackTrace();
                }
                SpigotTimings.worldSaveTimer.stopTiming();
                mLastSaveTick = mServer.tickCounter;
            }
        } finally {
            KLog.get().info("Stopping KCauldron World Saver thread...");
        }
    }

    public void stopServer() {
        interrupt();
        while(isAlive()) {
            Thread.yield();
        }
    }
}
