package net.minecraft.server.v1_7_R4;

import net.minecraft.nbt.NBTTagCompound;

public class PacketPlayOutTileEntityData extends net.minecraft.network.play.server.S35PacketUpdateTileEntity
{
    public PacketPlayOutTileEntityData() {
    }

    public PacketPlayOutTileEntityData(int p_i45175_1_, int p_i45175_2_, int p_i45175_3_, int p_i45175_4_, NBTTagCompound p_i45175_5_) {
        super(p_i45175_1_, p_i45175_2_, p_i45175_3_, p_i45175_4_, p_i45175_5_);
    }
}