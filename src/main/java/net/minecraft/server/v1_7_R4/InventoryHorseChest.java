package net.minecraft.server.v1_7_R4;

import net.minecraft.entity.passive.EntityHorse;

public class InventoryHorseChest extends net.minecraft.inventory.AnimalChest
{
    public InventoryHorseChest(String p_i1796_1_, int p_i1796_2_) {
        super(p_i1796_1_, p_i1796_2_);
    }

    public InventoryHorseChest(String s, int i, EntityHorse horse) {
        super(s, i, horse);
    }

    public InventoryHorseChest(String p_i1797_1_, boolean p_i1797_2_, int p_i1797_3_) {
        super(p_i1797_1_, p_i1797_2_, p_i1797_3_);
    }
}