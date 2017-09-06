package net.minecraft.server.v1_7_R4;

import net.minecraft.stats.IStatType;
import net.minecraft.util.IChatComponent;

public class CounterStatistic extends net.minecraft.stats.StatBasic
{
    public CounterStatistic(String p_i45303_1_, IChatComponent p_i45303_2_, IStatType p_i45303_3_) {
        super(p_i45303_1_, p_i45303_2_, p_i45303_3_);
    }

    public CounterStatistic(String p_i45304_1_, IChatComponent p_i45304_2_) {
        super(p_i45304_1_, p_i45304_2_);
    }

    public net.minecraft.stats.StatBase h(){
       return super.registerStat();
}
}