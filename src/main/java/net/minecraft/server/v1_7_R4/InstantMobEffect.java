package net.minecraft.server.v1_7_R4;
public class InstantMobEffect extends net.minecraft.potion.PotionHealth
{
    public InstantMobEffect(int p_i1572_1_, boolean p_i1572_2_, int p_i1572_3_) {
        super(p_i1572_1_, p_i1572_2_, p_i1572_3_);
    }

    public boolean a(int arg1, int arg2){
       return super.isReady(arg1,arg2);
}
}