package cc.uraniummc;

import net.md_5.specialsource.JarComparer;
import net.md_5.specialsource.JarMapping;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UraniumMapping extends JarMapping {
    public final Map<String, String> mRclasses = new HashMap<String, String>();
    public final Map<String, String> mMethodsNR = new HashMap<String, String>();
    public UraniumMapping() {
        super();
    }

    public UraniumMapping(JarComparer oldJar, JarComparer newJar, File logFile, boolean compact) throws IOException {
        super(oldJar, newJar, logFile, compact);
    }

    public UraniumMapping(JarComparer oldJar, JarComparer newJar, File logfile, boolean compact, boolean full) throws IOException {
        super(oldJar, newJar, logfile, compact, full);
    }

    @Override
    public void loadMappings(String filename, boolean reverse, boolean numericSrgNames, String inShadeRelocation, String outShadeRelocation) throws IOException {
        super.loadMappings(filename, reverse, numericSrgNames, inShadeRelocation, outShadeRelocation);
    }

    @Override
    public void loadMappings(File file) throws IOException {
        super.loadMappings(file);
    }
    public void loadRClasses(){
        for(Map.Entry<String,String> METHOD:classes.entrySet()){
            mRclasses.put(METHOD.getValue(),METHOD.getKey());
        }
    }
    public void loadMethodsNR(){
        for(Map.Entry<String,String> METHOD:methods.entrySet()){
            String[] key= METHOD.getKey().split(" ");
            String types=key[1].substring(0,key[1].lastIndexOf(')')+1);
            boolean obj=false;
            StringBuilder newkey=new StringBuilder(key[0]+" ");
            StringBuilder obj_name=new StringBuilder();
            for(char i:types.toCharArray()){
                if(i=='L'){
                    obj=true;
                }else if(obj){
                    if(i==';'){
                        String newclass=classes.get(obj_name.toString());
                        newkey.append(newclass==null?obj_name.toString():newclass).append(";");
                        obj_name.delete(0,obj_name.length());
                        obj=false;
                        continue;
                    }
                    obj_name.append(i);
                    continue;
                }
                newkey.append(i);
            }
            mMethodsNR.put(newkey.toString(),METHOD.getValue());
        }
    }
}
