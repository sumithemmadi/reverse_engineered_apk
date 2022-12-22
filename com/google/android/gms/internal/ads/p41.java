package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public final class p41 {
  public final String a;
  
  public String b;
  
  public Bundle c = new Bundle();
  
  public p41(JsonReader paramJsonReader) {
    Map map = new HashMap<Object, Object>();
    paramJsonReader.beginObject();
    String str;
    for (str = ""; paramJsonReader.hasNext(); str = paramJsonReader.nextString()) {
      String str1 = paramJsonReader.nextName();
      String str2 = str1;
      if (str1 == null)
        str2 = ""; 
      if (!str2.equals("params")) {
        if (!str2.equals("signal_dictionary")) {
          paramJsonReader.skipValue();
          continue;
        } 
        map = h0.i(paramJsonReader);
        continue;
      } 
    } 
    this.a = str;
    paramJsonReader.endObject();
    for (Map.Entry entry : map.entrySet()) {
      if (entry.getKey() != null && entry.getValue() != null)
        this.c.putString((String)entry.getKey(), (String)entry.getValue()); 
    } 
  }
  
  final p41 a(Bundle paramBundle) {
    try {
      this.b = q.c().T(paramBundle).toString();
    } catch (JSONException jSONException) {
      this.b = "{}";
    } 
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */