package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.h0;
import com.google.android.gms.common.util.k;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class ai1 {
  public final List<nh1> a;
  
  public final sh1 b;
  
  public final List<zh1> c;
  
  private ai1(JsonReader paramJsonReader) {
    List<?> list = Collections.emptyList();
    ArrayList<zh1> arrayList = new ArrayList();
    paramJsonReader.beginObject();
    sh1 sh11 = null;
    while (paramJsonReader.hasNext()) {
      String str = paramJsonReader.nextName();
      if ("responses".equals(str)) {
        paramJsonReader.beginArray();
        paramJsonReader.beginObject();
        while (paramJsonReader.hasNext()) {
          str = paramJsonReader.nextName();
          if ("ad_configs".equals(str)) {
            list = new ArrayList();
            paramJsonReader.beginArray();
            while (paramJsonReader.hasNext())
              list.add(new nh1(paramJsonReader)); 
            paramJsonReader.endArray();
            continue;
          } 
          if (str.equals("common")) {
            sh11 = new sh1(paramJsonReader);
            continue;
          } 
          paramJsonReader.skipValue();
        } 
        paramJsonReader.endObject();
        paramJsonReader.endArray();
        continue;
      } 
      if (str.equals("actions")) {
        paramJsonReader.beginArray();
        while (paramJsonReader.hasNext()) {
          Map<String, String> map;
          paramJsonReader.beginObject();
          String str1 = null;
          str = str1;
          while (paramJsonReader.hasNext()) {
            String str2 = paramJsonReader.nextName();
            if ("name".equals(str2)) {
              str1 = paramJsonReader.nextString();
              continue;
            } 
            if ("info".equals(str2)) {
              map = h0.i(paramJsonReader);
              continue;
            } 
            paramJsonReader.skipValue();
          } 
          if (str1 != null)
            arrayList.add(new zh1(str1, map)); 
          paramJsonReader.endObject();
        } 
        paramJsonReader.endArray();
      } 
    } 
    this.c = arrayList;
    this.a = (List)list;
    if (sh11 == null)
      sh11 = new sh1(new JsonReader(new StringReader("{}"))); 
    this.b = sh11;
  }
  
  public static ai1 a(Reader paramReader) {
    try {
      JsonReader jsonReader = new JsonReader();
      this(paramReader);
      ai1 ai11 = new ai1(jsonReader);
      k.a(paramReader);
      return ai11;
    } catch (IOException null) {
    
    } catch (IllegalStateException null) {
    
    } catch (JSONException jSONException) {
    
    } catch (NumberFormatException null) {
    
    } catch (AssertionError assertionError) {
    
    } finally {}
    zzdna zzdna = new zzdna();
    this("unable to parse ServerResponse", exception);
    Exception exception;
    throw zzdna;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ai1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */