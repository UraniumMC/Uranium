package org.fusesource.hawtjni.runtime;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Library{

    static final String SLASH=System.getProperty("file.separator");
    private final String name;
    private final String version;
    private final ClassLoader classLoader;
    private boolean loaded;

    public Library(String name){
        this(name,null,null);
    }

    public Library(String name,Class<?> clazz){
        this(name,version(clazz),clazz.getClassLoader());
    }

    public Library(String name,String version){
        this(name,version,null);
    }

    public Library(String name,String version,ClassLoader classLoader){
        if(name==null){
            throw new IllegalArgumentException("name cannot be null");
        }
        this.name=name;
        this.version=version;
        this.classLoader=classLoader;
    }

    private static String version(Class<?> clazz){
        try{
            return clazz.getPackage().getImplementationVersion();
        }catch(Throwable e){
        }
        return null;
    }

    public static String getOperatingSystem(){
        String name=System.getProperty("os.name").toLowerCase().trim();
        if(name.startsWith("linux")){
            return "linux";
        }
        if(name.startsWith("mac os x")){
            return "osx";
        }
        if(name.startsWith("win")){
            return "windows";
        }
        return name.replaceAll("\\W+","_");
    }

    public static String getPlatform(){
        return getOperatingSystem()+getBitModel();
    }

    public static int getBitModel(){
        String prop=System.getProperty("sun.arch.data.model");
        if(prop==null){
            prop=System.getProperty("com.ibm.vm.bitmode");
        }
        if(prop!=null){
            return Integer.parseInt(prop);
        }
        return -1;
    }

    public synchronized void load(){
        if(this.loaded){
            return;
        }
        doLoad();
        this.loaded=true;
    }

    private void doLoad(){
        String version=System.getProperty("library."+this.name+".version");
        if(version==null){
            version=this.version;
        }
        ArrayList<String> errors=new ArrayList();

        String customPath=System.getProperty("library."+this.name+".path");
        if(customPath!=null){
            if(version!=null){
                if(load(errors,file(new String[]{customPath,map(this.name+"-"+version)}))){
                    return;
                }
            }
            if(load(errors,file(new String[]{customPath,map(this.name)}))){
                return;
            }
        }
        if((version!=null)&&(load(errors,this.name+getBitModel()+"-"+version))){
            return;
        }
        if((version!=null)&&(load(errors,this.name+"-"+version))){
            return;
        }
        if(load(errors,this.name)){
            return;
        }
        if(this.classLoader!=null){
            if(exractAndLoad(errors,version,customPath,getPlatformSpecifcResourcePath())){
                return;
            }
            if(exractAndLoad(errors,version,customPath,getOperatingSystemSpecifcResourcePath())){
                return;
            }
            if(exractAndLoad(errors,version,customPath,getResorucePath())){
                return;
            }
        }
        throw new UnsatisfiedLinkError("Could not load library. Reasons: "+errors.toString());
    }

    public final String getOperatingSystemSpecifcResourcePath(){
        return getPlatformSpecifcResourcePath(getOperatingSystem());
    }

    public final String getPlatformSpecifcResourcePath(){
        return getPlatformSpecifcResourcePath(getPlatform());
    }

    public final String getPlatformSpecifcResourcePath(String platform){
        return "META-INF/native/"+platform+"/"+map(this.name);
    }

    public final String getResorucePath(){
        return "META-INF/native/"+map(this.name);
    }

    public final String getLibraryFileName(){
        return map(this.name);
    }

    private boolean exractAndLoad(ArrayList<String> errors,String version,String customPath,String resourcePath){
        URL resource=this.classLoader.getResource(resourcePath);
        if(resource!=null){
            String libName=this.name+"-"+getBitModel();
            if(version!=null){
                libName=libName+"-"+version;
            }
            String[] libNameParts=map(libName).split("\\.");
            String prefix=libNameParts[0]+"-";
            String suffix="."+libNameParts[1];
            if(customPath!=null){
                File target=extract(errors,resource,prefix,suffix,file(new String[]{customPath}));
                if((target!=null)&&
                        (load(errors,target))){
                    return true;
                }
            }
            customPath=System.getProperty("java.io.tmpdir");
            File target=extract(errors,resource,prefix,suffix,file(new String[]{customPath}));
            if((target!=null)&&
                    (load(errors,target))){
                return true;
            }
        }
        return false;
    }

    private File extract(ArrayList<String> errors,URL source,String prefix,String suffix,File directory){
        File target=null;
        try{
            FileOutputStream os=null;
            InputStream is=null;
            try{
                target=File.createTempFile(prefix,suffix,directory);
                is=source.openStream();
                byte[] buffer;
                if(is!=null){
                    buffer=new byte[64];
                    os=new FileOutputStream(target);
                    int read;
                    while((read=is.read(buffer))!=-1){
                        os.write(buffer,0,read);
                    }
                    chmod("755",target);
                }
                target.deleteOnExit();
            }finally{
                close(os,is);
            }
        }catch(Throwable e){
            if(target!=null){
                target.delete();
            }
            errors.add(e.getMessage());
        }
        return target;
    }

    private static void close(Closeable...pStreams){
        for(Closeable sStream : pStreams){
            if(sStream!=null){
                try{
                    sStream.close();
                }catch(Exception ignore){
                }
            }
        }
    }

    private File file(String...paths){
        File rc=null;
        for(String path : paths){
            if(rc==null){
                rc=new File(path);
            }else{
                rc=new File(rc,path);
            }
        }
        return rc;
    }

    private String map(String libName){
        libName=System.mapLibraryName(libName);
        String ext=".dylib";
        if(libName.endsWith(ext)){
            libName=libName.substring(0,libName.length()-ext.length())+".jnilib";
        }
        return libName;
    }

    private boolean isStale(URL source,File target){
        if(source.getProtocol().equals("jar")){
            try{
                String[] parts=source.getFile().split(Pattern.quote("!"));
                source=new URL(parts[0]);
            }catch(MalformedURLException e){
                return false;
            }
        }
        File sourceFile=null;
        if(source.getProtocol().equals("file")){
            sourceFile=new File(source.getFile());
        }
        if((sourceFile!=null)&&(sourceFile.exists())&&
                (sourceFile.lastModified()>target.lastModified())){
            return true;
        }
        return false;
    }

    private void chmod(String permision,File path){
        if(getPlatform().startsWith("windows")){
            return;
        }
        try{
            Runtime.getRuntime().exec(new String[]{"chmod",permision,path.getCanonicalPath()}).waitFor();
        }catch(Throwable e){
        }
    }

    private boolean load(ArrayList<String> errors,File lib){
        try{
            System.load(lib.getPath());
            return true;
        }catch(UnsatisfiedLinkError e){
            errors.add(e.getMessage());
        }
        return false;
    }

    private boolean load(ArrayList<String> errors,String lib){
        try{
            System.loadLibrary(lib);
            return true;
        }catch(UnsatisfiedLinkError e){
            errors.add(e.getMessage());
        }
        return false;
    }
}
