package net.minecraft.server.v1_7_R4;
public class NextTickListEntry extends net.minecraft.world.NextTickListEntry
{

   public net.minecraft.block.Block a(){
       return super.func_151351_a();
}
   public void a(int arg1){
       super.setPriority(arg1);
}
   public net.minecraft.world.NextTickListEntry a(long arg1){
       super.setScheduledTime(arg1);
       return this;
}
   public int compareTo(net.minecraft.world.NextTickListEntry arg1){
       return super.compareTo(arg1);
}
}