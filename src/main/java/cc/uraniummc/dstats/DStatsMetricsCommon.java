package cc.uraniummc.dstats;

import com.google.common.base.Charsets;
import com.google.gson.Gson;
import lombok.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static cc.uraniummc.dstats.DStatsMetricsCommon.ModServerReportParseStatus.Error_ServerBoom;


@AllArgsConstructor
public class DStatsMetricsCommon {
    public static AuthMode getAuthMode(){
        try {
            val yggdrasilClass = Class.forName("com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService");
            val check = yggdrasilClass.getDeclaredField("CHECK_URL");
            check.setAccessible(true);
            val url =(String)check.get(null);
            if(url.contains("sessionserver.mojang.com")){
                return AuthMode.MOJANG;
            }else if(url.contains("auth2.nide8.com")){
                return AuthMode.NODE8;
            }
        }catch (Exception e){

        }
        return AuthMode.UNKONWN;
    }
    public enum AuthMode{
        OFFLINE,MOJANG,NODE8,BUNGEECORD,UNKONWN;
    }
    public static class ModServerReportParseStatus
    {
        public static int Success=0,Success_And_Need_Update_Guid=1,Error_Not_Registered=2,Error_Beyond_Litmited=3,Error_ServerBoom=4,Error_Data_Format=5,Special_Status=254,Error_Unkonwn=255;
    }
    private static String version="1.0";
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DstatsModel{
        private String ServerId;
        private AuthMode AuthMode;
        private String MinecraftVersion;
        private String IP;
        private int Port;
        private float Tps;
        public long TotalMemory;
        public long UseMemory ;
        private String OS;
        private String OSPlatform;
        private String OSVersion;
        private int Core;
        private String ServerSoftware;
        private String ServerVersion;
        private int OnlinePlayers;
        private String JavaVendor;
        private String JavaVersion;
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DstatsRetModel{
        public int Status;
        public String ExtraDetails ;
    }
    public static String stream2String(final InputStream in, final Charset cs) {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(in, cs));
        String response = "";
        String result = "";
        try {
            while ((response = reader.readLine()) != null) {
                result += response;
            }
            reader.close();
        } catch (final IOException e) {
        }
        return result;
    }

    public static DstatsRetModel sendToServer(String url,DstatsModel model){
        val g=new Gson();
        val send = g.toJson(model);
        val ret = post(url,send);
        val retVal = (String)ret[0];
        val code=(Integer)ret[1];
        if(code==200){
            return g.fromJson(retVal,DstatsRetModel.class);
        }else{
            return DstatsRetModel.builder().Status(Error_ServerBoom).ExtraDetails("Sever Error : "+retVal).build();
        }
    }
    public static Object[] post(String url,String param){
        PrintWriter out = null;
        String result = "";
        try {
            final URL realUrl = new URL(url);
            final HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("User-Agent", "DStatsBukkitCommon/"+version);
            conn.setReadTimeout(60000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            out = new PrintWriter(conn.getOutputStream());
            out.write(param);
            out.flush();
            if(conn.getResponseCode()!=200){
                result = stream2String(conn.getErrorStream(), Charsets.UTF_8);
            }else{
                result = stream2String(conn.getInputStream(), Charsets.UTF_8);
            }
            return new Object[]{result,conn.getResponseCode()};
        } catch (final Exception e) {
        } finally {
            if (out != null) {
                out.close();
            }
        }
        return new Object[]{result,500};
    }
}
