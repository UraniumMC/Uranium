package net.minecraft.server.v1_7_R4;
public class DamageSource extends net.minecraft.util.DamageSource
{
    public DamageSource(String p_i1566_1_) {
        super(p_i1566_1_);
    }

    public boolean a(){
       return super.isProjectile();
}
   public net.minecraft.util.DamageSource a(net.minecraft.entity.Entity arg1){
       super.causeThornsDamage(arg1);
       return this;
}
   public net.minecraft.util.DamageSource arrow(net.minecraft.entity.projectile.EntityArrow arg1,net.minecraft.entity.Entity arg2){
       super.causeArrowDamage(arg1,arg2);
       return this;
}
   public net.minecraft.util.DamageSource b(){
       super.setProjectile();
       return this;
}
   public net.minecraft.util.DamageSource b(net.minecraft.entity.Entity arg1,net.minecraft.entity.Entity arg2){
       super.causeIndirectMagicDamage(arg1,arg2);
       return this;
}
   public net.minecraft.util.DamageSource d(){
       super.setExplosion();
       return this;
}
   public net.minecraft.util.DamageSource explosion(net.minecraft.world.Explosion arg1){
       super.setExplosionSource(arg1);
       return this;
}
   public net.minecraft.util.DamageSource fireball(net.minecraft.entity.projectile.EntityFireball arg1,net.minecraft.entity.Entity arg2){
       super.causeFireballDamage(arg1,arg2);
       return this;
}
   public net.minecraft.entity.Entity getEntity(){
       return super.getEntity();
}
   public float getExhaustionCost(){
       return super.getHungerDamage();
}
   public net.minecraft.util.IChatComponent getLocalizedDeathMessage(net.minecraft.entity.EntityLivingBase arg1){
       return super.func_151519_b(arg1);
}
   public net.minecraft.entity.Entity i(){
       return super.getSourceOfDamage();
}
   public boolean ignoresArmor(){
       return super.isUnblockable();
}
   public boolean ignoresInvulnerability(){
       return super.canHarmInCreative();
}
   public boolean isMagic(){
       return super.isMagicDamage();
}
   public boolean isStarvation(){
       return super.isDamageAbsolute();
}
   public net.minecraft.util.DamageSource l(){
       super.setDamageAllowedInCreativeMode();
       return this;
}
   public net.minecraft.util.DamageSource m(){
       super.setDamageIsAbsolute();
       return this;
}
   public net.minecraft.util.DamageSource mobAttack(net.minecraft.entity.EntityLivingBase arg1){
       super.causeMobDamage(arg1);
       return this;
}
   public boolean o(){
       return super.isFireDamage();
}
   public java.lang.String p(){
       return super.getDamageType();
}
   public net.minecraft.util.DamageSource playerAttack(net.minecraft.entity.player.EntityPlayer arg1){
       super.causePlayerDamage(arg1);
       return this;
}
   public net.minecraft.util.DamageSource projectile(net.minecraft.entity.Entity arg1,net.minecraft.entity.Entity arg2){
       super.causeThrownDamage(arg1,arg2);
       return this;
}
   public net.minecraft.util.DamageSource q(){
       super.setDifficultyScaled();
       return this;
}
   public boolean r(){
       return super.isDifficultyScaled();
}
   public net.minecraft.util.DamageSource setExplosion(){
       super.setFireDamage();
       return this;
}
   public net.minecraft.util.DamageSource setIgnoreArmor(){
       super.setDamageBypassesArmor();
       return this;
}
   public net.minecraft.util.DamageSource setMagic(){
       super.setMagicDamage();
       return this;
}
}