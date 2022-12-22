package com.google.ads.mediation;

import com.google.android.gms.internal.ads.cm;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class MediationServerParameters {
  public void a(Map<String, String> paramMap) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (Field field : getClass().getFields()) {
      a a = field.<a>getAnnotation(a.class);
      if (a != null)
        hashMap.put(a.name(), field); 
    } 
    if (hashMap.isEmpty())
      cm.i("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method."); 
    for (Map.Entry<String, String> entry : paramMap.entrySet()) {
      Field field = (Field)hashMap.remove(entry.getKey());
      if (field != null) {
        StringBuilder stringBuilder2;
        try {
          field.set(this, entry.getValue());
        } catch (IllegalAccessException illegalAccessException) {
          String str = (String)entry.getKey();
          stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 49);
          stringBuilder2.append("Server option \"");
          stringBuilder2.append(str);
          stringBuilder2.append("\" could not be set: Illegal Access");
          cm.i(stringBuilder2.toString());
        } catch (IllegalArgumentException illegalArgumentException) {
          str1 = (String)stringBuilder2.getKey();
          StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str1).length() + 43);
          stringBuilder3.append("Server option \"");
          stringBuilder3.append(str1);
          stringBuilder3.append("\" could not be set: Bad Type");
          cm.i(stringBuilder3.toString());
        } 
        continue;
      } 
      String str2 = (String)str1.getKey();
      String str1 = (String)str1.getValue();
      StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str2).length() + 31 + String.valueOf(str1).length());
      stringBuilder1.append("Unexpected server option: ");
      stringBuilder1.append(str2);
      stringBuilder1.append(" = \"");
      stringBuilder1.append(str1);
      stringBuilder1.append("\"");
      cm.e(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    for (Field field : hashMap.values()) {
      if (((a)field.<a>getAnnotation(a.class)).required()) {
        String str = String.valueOf(((a)field.<a>getAnnotation(a.class)).name());
        if (str.length() != 0) {
          str = "Required server option missing: ".concat(str);
        } else {
          str = new String("Required server option missing: ");
        } 
        cm.i(str);
        if (stringBuilder.length() > 0)
          stringBuilder.append(", "); 
        stringBuilder.append(((a)field.<a>getAnnotation(a.class)).name());
      } 
    } 
    if (stringBuilder.length() > 0) {
      String str = String.valueOf(stringBuilder.toString());
      if (str.length() != 0) {
        str = "Required server option(s) missing: ".concat(str);
      } else {
        str = new String("Required server option(s) missing: ");
      } 
      throw new MappingException(str);
    } 
  }
  
  public static final class MappingException extends Exception {
    public MappingException(String param1String) {
      super(param1String);
    }
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.FIELD})
  protected static @interface a {
    String name();
    
    boolean required() default true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/MediationServerParameters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */