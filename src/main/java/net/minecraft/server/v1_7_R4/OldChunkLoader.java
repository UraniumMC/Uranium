package net.minecraft.server.v1_7_R4;
public class OldChunkLoader extends net.minecraft.world.chunk.storage.ChunkLoader
{
    public OldChunkLoader() {
    }

    public net.minecraft.world.chunk.storage.ChunkLoader.AnvilConverterData a(net.minecraft.nbt.NBTTagCompound arg1){
       return super.load(arg1);
}
   public void a(net.minecraft.world.chunk.storage.ChunkLoader.AnvilConverterData arg1,net.minecraft.nbt.NBTTagCompound arg2,net.minecraft.world.biome.WorldChunkManager arg3){
       super.convertToAnvilFormat(arg1,arg2,arg3);
}
}