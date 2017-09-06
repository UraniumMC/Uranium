package net.minecraft.server.v1_7_R4;
public class MinecraftServer extends net.minecraft.server.MinecraftServer
{

   public java.lang.String A(){
       return super.getMotd();
}
   public int C(){
       return super.getCurrentPlayerCount();
}
   public int D(){
       return super.getMaxPlayers();
}
   public net.minecraft.util.com.mojang.authlib.GameProfile[] F(){
       return super.func_152357_F();
}
   public java.security.KeyPair K(){
       return super.getKeyPair();
}
   public int L(){
       return super.getServerPort();
}
   public java.lang.String M(){
       return super.getServerOwner();
}
   public boolean N(){
       return super.isSinglePlayer();
}
   public java.lang.String O(){
       return super.getFolderName();
}
   public boolean R(){
       return super.isDemo();
}
   public void U(){
       super.deleteWorldAndStopServer();
}
   public boolean X(){
       return super.isDedicatedServer();
}
   public boolean a(int arg1,java.lang.String arg2){
       return super.canCommandSenderUseCommand(arg1,arg2);
}
   public void a(java.lang.String arg1){
       super.convertMapIfNeeded(arg1);
}
   public void a(java.lang.String arg1,java.lang.String arg2,long arg3,net.minecraft.world.WorldType arg4,java.lang.String arg5){
       super.loadAllWorlds(arg1,arg2,arg3,arg4,arg5);
}
   public void a(java.security.KeyPair arg1){
       super.setKeyPair(arg1);
}
   public void a(net.minecraft.crash.CrashReport arg1){
       super.finalTick(arg1);
}
   public void a(net.minecraft.world.EnumDifficulty arg1){
       super.func_147139_a(arg1);
}
   public void a(net.minecraft.world.WorldSettings$GameType arg1){
       super.setGameType(arg1);
}
   public java.lang.String a(net.minecraft.world.WorldSettings$GameType arg1,boolean arg2){
       return super.shareToLAN(arg1,arg2);
}
   public java.util.List a(net.minecraft.command.ICommandSender arg1,java.lang.String arg2){
       return super.getPossibleCompletions(arg1,arg2);
}
   public void a(net.minecraft.server.gui.IUpdatePlayerListBox arg1){
       super.func_82010_a(arg1);
}
   public net.minecraft.server.management.ServerConfigurationManager a(net.minecraft.server.MinecraftServer arg1){
       return super.access$100(arg1);
}
   public void a(net.minecraft.profiler.PlayerUsageSnooper arg1){
       super.addServerStatsToSnooper(arg1);
}
   public void a(net.minecraft.server.management.ServerConfigurationManager arg1){
       super.func_152361_a(arg1);
}
   public void a(net.minecraft.network.ServerStatusResponse arg1){
       super.func_147138_a(arg1);
}
   public boolean a(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,net.minecraft.entity.player.EntityPlayer arg5){
       return super.isBlockProtected(arg1,arg2,arg3,arg4,arg5);
}
   public void a_(java.lang.String arg1,int arg2){
       super.outputPercentRemaining(arg1,arg2);
}
   public net.minecraft.network.NetworkSystem ai(){
       return super.func_147137_ag();
}
   public boolean ak(){
       return super.getGuiEnabled();
}
   public int al(){
       return super.getTickCounter();
}
   public void am(){
       super.enableProfiling();
}
   public java.net.Proxy aq(){
       return super.getServerProxy();
}
   public long ar(){
       return super.getSystemTimeMillis();
}
   public boolean at(){
       return super.func_147136_ar();
}
   public net.minecraft.util.com.mojang.authlib.minecraft.MinecraftSessionService av(){
       return super.func_147130_as();
}
   public net.minecraft.network.ServerStatusResponse ay(){
       return super.func_147134_at();
}
   public void az(){
       super.func_147132_au();
}
   public void b(java.lang.String arg1){
       super.setUserMessage(arg1);
}
   public net.minecraft.crash.CrashReport b(net.minecraft.crash.CrashReport arg1){
       return super.addServerInfoToCrashReport(arg1);
}
   public void b(net.minecraft.profiler.PlayerUsageSnooper arg1){
       super.addServerTypeToSnooper(arg1);
}
   public void b(boolean arg1){
       super.setDemo(arg1);
}
   public void c(int arg1){
       super.setBuildLimit(arg1);
}
   public void c(java.lang.String arg1){
       super.setHostname(arg1);
}
   public void c(boolean arg1){
       super.canCreateBonusChest(arg1);
}
   public java.io.File d(java.lang.String arg1){
       return super.getFile(arg1);
}
   public void g(){
       super.initialWorldChunkLoad();
}
   public java.lang.String g(java.lang.String arg1){
       return super.handleRConCommand(arg1);
}
   public boolean getAllowFlight(){
       return super.isFlightAllowed();
}
   public net.minecraft.util.ChunkCoordinates getChunkCoordinates(){
       return super.getPlayerCoordinates();
}
   public net.minecraft.command.ICommandManager getCommandHandler(){
       return super.getCommandManager();
}
   public net.minecraft.world.storage.ISaveFormat getConvertable(){
       return super.getActiveAnvilConverter();
}
   public net.minecraft.world.EnumDifficulty getDifficulty(){
       return super.func_147135_j();
}
   public boolean getEnableCommandBlock(){
       return super.isCommandBlockEnabled();
}
   public net.minecraft.util.com.mojang.authlib.GameProfileRepository getGameProfileRepository(){
       return super.func_152359_aw();
}
   public net.minecraft.world.WorldSettings$GameType getGamemode(){
       return super.getGameType();
}
   public boolean getGenerateStructures(){
       return super.canStructuresSpawn();
}
   public int getIdleTimeout(){
       return super.func_143007_ar();
}
   public org.apache.logging.log4j.Logger getLogger(){
       return super.access$000();
}
   public int getMaxBuildHeight(){
       return super.getBuildLimit();
}
   public java.lang.String getMotd(){
       return super.getMOTD();
}
   public java.lang.String getName(){
       return super.getCommandSenderName();
}
   public boolean getOnlineMode(){
       return super.isServerInOnlineMode();
}
   public net.minecraft.server.management.ServerConfigurationManager getPlayerList(){
       return super.getConfigurationManager();
}
   public java.lang.String[] getPlayers(){
       return super.getAllUsernames();
}
   public boolean getPvP(){
       return super.isPVPEnabled();
}
   public java.lang.String getResourcePack(){
       return super.getTexturePack();
}
   public net.minecraft.util.IChatComponent getScoreboardDisplayName(){
       return super.func_145748_c_();
}
   public java.lang.String getServerIp(){
       return super.getServerHostname();
}
   public boolean getSnooperEnabled(){
       return super.isSnooperEnabled();
}
   public boolean getSpawnAnimals(){
       return super.getCanSpawnAnimals();
}
   public boolean getSpawnMonsters(){
       return super.allowSpawnMonsters();
}
   public boolean getSpawnNPCs(){
       return super.getCanSpawnNPCs();
}
   public int getSpawnProtection(){
       return super.getSpawnProtectionSize();
}
   public net.minecraft.server.management.PlayerProfileCache getUserCache(){
       return super.func_152358_ax();
}
   public java.lang.String getVersion(){
       return super.getMinecraftVersion();
}
   public net.minecraft.world.World getWorld(){
       return super.getEntityWorld();
}
   public net.minecraft.world.WorldServer getWorldServer(int arg1){
       return super.worldServerForDimension(arg1);
}
   public void h(java.lang.String arg1){
       super.logSevere(arg1);
}
   public void i(java.lang.String arg1){
       super.logDebug(arg1);
}
   public void info(java.lang.String arg1){
       super.logInfo(arg1);
}
   public boolean init(){
       return super.startServer();
}
   public boolean isDebugging(){
       return super.isDebuggingEnabled();
}
   public boolean isRunning(){
       return super.isServerRunning();
}
   public boolean isStopped(){
       return super.isServerStopped();
}
   public void j(java.lang.String arg1){
       super.setServerOwner(arg1);
}
   public void k(java.lang.String arg1){
       super.setFolderName(arg1);
}
   public int l(){
       return super.getOpPermissionLevel();
}
   public boolean m(){
       return super.func_152363_m();
}
   public void n(){
       super.clearCurrentTask();
}
   public java.io.File s(){
       return super.getDataDirectory();
}
   public void safeShutdown(){
       super.initiateShutdown();
}
   public void saveChunks(boolean arg1){
       super.saveAllWorlds(arg1);
}
   public void sendMessage(net.minecraft.util.IChatComponent arg1){
       super.addChatMessage(arg1);
}
   public void setIdleTimeout(int arg1){
       super.func_143006_e(arg1);
}
   public void setMotd(java.lang.String arg1){
       super.setMOTD(arg1);
}
   public void setPort(int arg1){
       super.setServerPort(arg1);
}
   public void setPvP(boolean arg1){
       super.setAllowPvp(arg1);
}
   public void setSpawnAnimals(boolean arg1){
       super.setCanSpawnAnimals(arg1);
}
   public void setSpawnNPCs(boolean arg1){
       super.setCanSpawnNPCs(arg1);
}
   public void setTexturePack(java.lang.String arg1){
       super.func_155759_m(arg1);
}
   public void stop(){
       super.stopServer();
}
   public void t(){
       super.systemExitNow();
}
   public void u(){
       super.tick();
}
   public void v(){
       super.updateTimeLightAndEntities();
}
   public void warning(java.lang.String arg1){
       super.logWarning(arg1);
}
   public void x(){
       super.startServerThread();
}
   public java.lang.String y(){
       return super.getHostname();
}
   public int z(){
       return super.getPort();
}
}