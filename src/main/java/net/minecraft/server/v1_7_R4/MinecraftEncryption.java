package net.minecraft.server.v1_7_R4;
public class MinecraftEncryption extends net.minecraft.util.CryptManager
{

   public javax.crypto.Cipher a(int arg1,java.security.Key arg2){
       return super.func_151229_a(arg1,arg2);
}
   public byte[] a(java.lang.String arg1,java.security.PublicKey arg2,javax.crypto.SecretKey arg3){
       return super.getServerIdHash(arg1,arg2,arg3);
}
   public javax.crypto.SecretKey a(java.security.PrivateKey arg1,byte[] arg2){
       return super.decryptSharedKey(arg1,arg2);
}
   public java.security.PublicKey a(byte[] arg1){
       return super.decodePublicKey(arg1);
}
   public java.security.KeyPair b(){
       return super.createNewKeyPair();
}
   public byte[] b(java.security.Key arg1,byte[] arg2){
       return super.decryptData(arg1,arg2);
}
}