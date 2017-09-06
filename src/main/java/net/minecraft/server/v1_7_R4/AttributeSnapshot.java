package net.minecraft.server.v1_7_R4;

import java.util.Collection;

public class AttributeSnapshot extends net.minecraft.network.play.server.S20PacketEntityProperties.Snapshot
{
    public AttributeSnapshot(String p_i45235_2_, double p_i45235_3_, Collection p_i45235_5_) {
        super(p_i45235_2_, p_i45235_3_, p_i45235_5_);
    }

    public java.lang.String a(){
       return super.func_151409_a();
}
   public double b(){
       return super.func_151410_b();
}
   public java.util.Collection c(){
       return super.func_151408_c();
}
}