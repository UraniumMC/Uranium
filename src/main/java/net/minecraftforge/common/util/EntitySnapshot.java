package net.minecraftforge.common.util;

import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class EntitySnapshot{

    public final World mWorld;
    public final Entity mEntity;
    public final SpawnReason mReason;

    public EntitySnapshot(World pWorld,Entity pEntity,SpawnReason pReason){
        this.mWorld=pWorld;
        this.mEntity=pEntity;
        this.mReason=pReason==null?SpawnReason.CUSTOM:pReason;
    }

    public boolean apply(){
        return this.mWorld.addEntity(this.mEntity,this.mReason);
    }

    public void cancel(){
        this.mEntity.setDead();
        this.mWorld.removeEntity(this.mEntity);
    }
}
