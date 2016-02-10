package kcauldron.wrapper;

import kcauldron.ChunkManager;
import net.minecraft.util.LongHashMap;
import net.minecraft.world.chunk.Chunk;

public class VanillaChunkHashMap extends LongHashMap {
    private ChunkManager manager;

    public VanillaChunkHashMap(ChunkManager manager) {
        this.manager = manager;
    }

    @Override
    public void add(long key, Object value) {
        manager.putChunk((Chunk) value);
    }

    @Override
    public boolean containsItem(long key) {
        return getValueByKey(key) != null;
    }

    @Override
    public Object getValueByKey(long key) {
        final int x = (int) (key >>> 32);
        final int z = (int) (key);
        return manager.getChunk(x, z);
    }

    @Override
    public Object remove(long key) {
        final int x = (int) (key >>> 32);
        final int z = (int) (key);
        return manager.remove(x, z);
    }
}
