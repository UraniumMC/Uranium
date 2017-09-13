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
        loadRClassesAndMethodsNR();
    }

    @Override
    public void loadMappings(File file) throws IOException {
        super.loadMappings(file);
        loadRClassesAndMethodsNR();
    }
    private void loadRClassesAndMethodsNR(){
        for(Map.Entry<String,String> CLASS:classes.entrySet()){
            mRclasses.put(CLASS.getValue(),CLASS.getKey());
        }
        for(Map.Entry<String,String> METHOD:methods.entrySet()){
            String[] key= METHOD.getKey().split(" ");
            String newkey=key[0]+" "+key[1].substring(0,key[1].indexOf(")"+1));
            mMethodsNR.put(newkey,METHOD.getValue());
        }
    }
}
