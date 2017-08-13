package cc.uraniummc.capture.type;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import cc.uraniummc.Location;
import cc.uraniummc.capture.EntitySnapshot;
import cc.uraniummc.capture.ItemSnapshot;
import cc.uraniummc.capture.WorldCapture;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.BlockSnapshot;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;

public class CaptureBlock extends ACapture{

    /** 当前物品 */
    public ItemStack mUseItem=null;
    /** 当前物品所在的快捷栏位置,如果为-1表示不存在,或者不是从背包取出的物品 */
    public int mSlot=-1;
    public int mOldItemSize=0;
    public int mOldItemMeta=0;
    public NBTTagCompound mOldItemNBT=null;
    /** 捕获的数据 */
    public ArrayList<EntitySnapshot> mCapturedEntitys=new ArrayList<EntitySnapshot>();
    public ArrayList<ItemSnapshot> mCapturedItems=new ArrayList<ItemSnapshot>();
    public ArrayList<Location> mCheckedBlocks=new ArrayList<Location>();

    public CaptureBlock(WorldCapture pWorldCapture, int pId, EntityPlayer pPlayer){
        super(pWorldCapture,pId,pPlayer);
    }

    @Override
    public void markHandled(){
        super.markHandled();
        this.mWorldCapture.mBlockCaptures.remove(this);
    }

    @Override
    public void addCapturedBlock(World pWorld,int pPosX,int pPosY,int pPosZ,int pFlag){
        if(!this.mEnable||this.isChecked(pWorld,pPosX,pPosY,pPosZ,false))
            return;

        super.addCapturedBlock(pWorld,pPosX,pPosY,pPosZ,pFlag);
    }

    public void addCapturedBlock(BlockSnapshot pSnapshot){
        if(!this.mEnable||this.isChecked(pSnapshot.world,pSnapshot.x,pSnapshot.y,pSnapshot.z,false))
            return;

        this.mCapturedBlocks.add(pSnapshot);
    }

    public boolean isChecked(World pWorld,int pPosX,int pPosY,int pPosZ,boolean pSimula){
        if(!this.mCheckedBlocks.isEmpty()){
            Iterator<Location> tIt=this.mCheckedBlocks.iterator();
            while(tIt.hasNext()){
                Location tLoc=tIt.next();
                if(tLoc.mWorld==pWorld&&tLoc.mPosX==pPosX&&tLoc.mPosY==pPosY&&tLoc.mPosZ==pPosZ){
                    if(!pSimula) tIt.remove();
                    return true;
                }
            }
        }
        return false;
    }

    public void addCaptureEntity(World pWorld,Entity pEntity,SpawnReason pReason){
        if(!this.mEnable) return;

        this.mCapturedEntitys.add(new EntitySnapshot(pWorld,pEntity,pReason));
    }

    public void addCaptureItem(EntityPlayer pPlayer,ItemStack pItem){
        if(!this.mEnable) return;

        this.mCapturedItems.add(new ItemSnapshot(pPlayer,pItem));
    }

    public void addCheckedBlock(World pWorld,int pPosX,int pPosY,int pPosZ){
        this.mCheckedBlocks.add(new Location(pWorld,pPosX,pPosY,pPosZ));
    }

    public boolean endCapture(){
        if(this.mHandled) return true;
        this.markHandled();

        boolean tResult;
        PlaceEvent tPlaceEvent=null;
        if(this.mCapturedBlocks.size()>1){
            tPlaceEvent=ForgeEventFactory.onPlayerMultiBlockPlace(this.mCapturePlayer,this.mCapturedBlocks,this.mSide);
        }else if(this.mCapturedBlocks.size()==1){
            tPlaceEvent=ForgeEventFactory.onPlayerBlockPlace(this.mCapturePlayer,this.mCapturedBlocks.get(0),this.mSide);
        }

        if(tPlaceEvent!=null&&(tPlaceEvent.isCanceled())){
            if(this.mUseItem!=null){
                if(this.mSlot==-1){
                    this.mUseItem.setItemDamage(this.mOldItemMeta);
                    this.mUseItem.stackSize=this.mOldItemSize;
                    this.mUseItem.setTagCompound(this.mOldItemNBT);
                }else{
                    this.mCapturePlayer.inventory.setInventorySlotContents(this.mSlot,this.mUseItem);
                }
            }
            if(!this.mCapturedBlocks.isEmpty()){
                for(int i=this.mCapturedBlocks.size();i>0;){
                    this.mWorld.restoringBlockSnapshots=true;
                    BlockSnapshot tSnapshot=this.mCapturedBlocks.get(--i);
                    tSnapshot.restore(true,false);
                    this.mWorld.restoringBlockSnapshots=false;
                }
            }
            for(EntitySnapshot sSnapshot : this.mCapturedEntitys){
                sSnapshot.cancel();
            }
            tResult=false;
        }else{
            for(BlockSnapshot tSnapshot : this.mCapturedBlocks){
                int tBlockX=tSnapshot.x;
                int tBlockY=tSnapshot.y;
                int tBlockZ=tSnapshot.z;
                int tMetadata=this.mWorld.getBlockMetadata(tBlockX,tBlockY,tBlockZ);
                Block tOldBlock=tSnapshot.replacedBlock;
                Block tNewBlock=this.mWorld.getBlock(tBlockX,tBlockY,tBlockZ);
                if(tNewBlock!=null&&!(tNewBlock.hasTileEntity(tMetadata))){
                    tNewBlock.onBlockAdded(this.mWorld,tBlockX,tBlockY,tBlockZ);
                }
                this.mWorld.markAndNotifyBlock(tBlockX,tBlockY,tBlockZ,null,tOldBlock,tNewBlock,tSnapshot.flag);
            }
            for(EntitySnapshot sSnapshot : this.mCapturedEntitys){
                sSnapshot.apply();
            }
            if(!this.mCapturedItems.isEmpty()){
                HashSet<EntityPlayer> tNotifyPlayers=new HashSet<EntityPlayer>();
                for(ItemSnapshot sSnapshot : this.mCapturedItems){
                    if(sSnapshot.apply()){
                        tNotifyPlayers.add(sSnapshot.mPlayer);
                    }
                }
                for(EntityPlayer sPlayer : tNotifyPlayers){
                    sPlayer.openContainer.detectAndSendChanges();
                }
            }
            if(this.mUseItem!=null&&this.mCapturePlayer!=null){
                this.mCapturePlayer.addStat(StatList.objectUseStats[Item.getIdFromItem(this.mUseItem.getItem())],1);
            }
            tResult=true;
        }

        return tResult;

    }

}
