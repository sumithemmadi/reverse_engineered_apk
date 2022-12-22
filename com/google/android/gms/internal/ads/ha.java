package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.b1;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public final class ha implements t8, fa {
  private final ga b;
  
  private final HashSet<AbstractMap.SimpleEntry<String, x6<? super ga>>> c;
  
  public ha(ga paramga) {
    this.b = paramga;
    this.c = new HashSet<AbstractMap.SimpleEntry<String, x6<? super ga>>>();
  }
  
  public final void B(String paramString, Map paramMap) {
    s8.b(this, paramString, paramMap);
  }
  
  public final void I() {
    for (AbstractMap.SimpleEntry<String, x6<? super ga>> simpleEntry : this.c) {
      String str = String.valueOf(((x6)simpleEntry.getValue()).toString());
      if (str.length() != 0) {
        str = "Unregistering eventhandler: ".concat(str);
      } else {
        str = new String("Unregistering eventhandler: ");
      } 
      b1.m(str);
      this.b.p((String)simpleEntry.getKey(), (x6<? super ga>)simpleEntry.getValue());
    } 
    this.c.clear();
  }
  
  public final void O(String paramString1, String paramString2) {
    s8.a(this, paramString1, paramString2);
  }
  
  public final void S(String paramString, JSONObject paramJSONObject) {
    s8.c(this, paramString, paramJSONObject);
  }
  
  public final void d(String paramString, x6<? super ga> paramx6) {
    this.b.d(paramString, paramx6);
    this.c.add(new AbstractMap.SimpleEntry<String, x6<? super ga>>(paramString, paramx6));
  }
  
  public final void i(String paramString, JSONObject paramJSONObject) {
    s8.d(this, paramString, paramJSONObject);
  }
  
  public final void n(String paramString) {
    this.b.n(paramString);
  }
  
  public final void p(String paramString, x6<? super ga> paramx6) {
    this.b.p(paramString, paramx6);
    this.c.remove(new AbstractMap.SimpleEntry<String, x6<? super ga>>(paramString, paramx6));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */