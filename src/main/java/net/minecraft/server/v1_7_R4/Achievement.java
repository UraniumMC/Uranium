package net.minecraft.server.v1_7_R4;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.item.ItemStack;

public class Achievement extends net.minecraft.stats.Achievement
{
    public Achievement(String p_i45300_1_, String p_i45300_2_, int p_i45300_3_, int p_i45300_4_, net.minecraft.item.Item p_i45300_5_, net.minecraft.stats.Achievement p_i45300_6_) {
        super(p_i45300_1_, p_i45300_2_, p_i45300_3_, p_i45300_4_, p_i45300_5_, p_i45300_6_);
    }

    public Achievement(String p_i45301_1_, String p_i45301_2_, int p_i45301_3_, int p_i45301_4_, net.minecraft.block.Block p_i45301_5_, net.minecraft.stats.Achievement p_i45301_6_) {
        super(p_i45301_1_, p_i45301_2_, p_i45301_3_, p_i45301_4_, p_i45301_5_, p_i45301_6_);
    }

    public Achievement(String p_i45302_1_, String p_i45302_2_, int p_i45302_3_, int p_i45302_4_, ItemStack p_i45302_5_, net.minecraft.stats.Achievement p_i45302_6_) {
        super(p_i45302_1_, p_i45302_2_, p_i45302_3_, p_i45302_4_, p_i45302_5_, p_i45302_6_);
    }

    public net.minecraft.stats.Achievement a(){
       super.initIndependentStat();
       return this;
}
   public net.minecraft.stats.Achievement a(java.lang.Class arg1){
       super.func_150953_b(arg1);
       return this;
}
   public net.minecraft.stats.Achievement b(){
       super.setSpecial();
       return this;
}
   public net.minecraft.stats.StatBase b(java.lang.Class arg1){
       return super.func_150953_b(arg1);
}
   public net.minecraft.stats.Achievement c(){
       super.registerStat();
       return this;
}
   public boolean d(){
       return super.isAchievement();
}
   public net.minecraft.util.IChatComponent e(){
       return super.func_150951_e();
}
   public boolean g(){
       return super.getSpecial();
}
   public net.minecraft.stats.StatBase h(){
       return super.registerStat();
}
   public net.minecraft.stats.StatBase i(){
       return super.initIndependentStat();
}
}