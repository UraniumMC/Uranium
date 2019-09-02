package cc.uraniummc.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jline.internal.Log;

public class ReflectUtil {
    public static final Field Field_modifiers;
    
    public static final Logger log=LogManager.getLogger("Uranium");
    
    static{
        Field_modifiers=getField(Field.class, "modifiers", true);
    }
    
    public static Field getField(Class<?> pClazz,String pFieldName,boolean pDeclared){
        Class<?> tClass=pClazz;
        do{
            Field[] tFields=tClass.getDeclaredFields();
            for(Field sField : tFields){
                if(sField.getName().equals(pFieldName)){
                    return sField;
                }
            }
        }while(!pDeclared&&(tClass=tClass.getSuperclass())!=null);

        Log.warn("No field found with name \" "+pFieldName+" \" in clas \""+pClazz.getName()+"\"");
        return null;
    }
    
    public static void setFieldValue(Field pField, Object pObj, Object pValue) {
        try {
            pField.setAccessible(true);
            pField.set(pObj, pValue);
        } catch (Exception exp) {
            Log.error("Error on set field \""+pField.toString()+"\""+": "+exp.getMessage());
        }
    }

    public static void setFinalFieldValue(Field pField, Object pObj, Object pValue) {
        try {
            pField.setAccessible(true);
            boolean tIsFinal = Modifier.isFinal(pField.getModifiers());
            int tOriginModifer = pField.getModifiers();
            if (tIsFinal) {
                ReflectUtil.setFieldValue(Field_modifiers, pField, (tOriginModifer & (~Modifier.FINAL)));
            }
            pField.set(pObj, pValue);
            if (tIsFinal) {
                ReflectUtil.setFieldValue(Field_modifiers, pField, tOriginModifer);
            }
        } catch (Exception exp) {
            Log.error("Error on set final field \""+pField.toString()+"\""+": "+exp.getMessage());
        }
    }
}
