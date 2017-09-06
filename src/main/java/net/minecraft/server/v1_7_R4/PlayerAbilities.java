package net.minecraft.server.v1_7_R4;
public class PlayerAbilities extends net.minecraft.entity.player.PlayerCapabilities
{
    public PlayerAbilities() {
    }

    public float a(){
       return super.getFlySpeed();
}
   public void a(net.minecraft.nbt.NBTTagCompound arg1){
       super.writeCapabilitiesToNBT(arg1);
}
   public float b(){
       return super.getWalkSpeed();
}
   public void b(net.minecraft.nbt.NBTTagCompound arg1){
       super.readCapabilitiesFromNBT(arg1);
}
}