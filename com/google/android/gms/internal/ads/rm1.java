package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;

public final class rm1 {
  private final HashMap<String, String> a = new HashMap<String, String>();
  
  private final um1 b = new um1(q.j());
  
  public static rm1 d(String paramString) {
    rm1 rm11 = new rm1();
    rm11.a.put("action", paramString);
    return rm11;
  }
  
  public static rm1 e(String paramString) {
    rm1 rm11 = new rm1();
    rm11.i("request_id", paramString);
    return rm11;
  }
  
  public final rm1 a(ci1 paramci1, pl parampl) {
    ai1 ai1 = paramci1.b;
    if (ai1 == null)
      return this; 
    sh1 sh1 = ai1.b;
    if (sh1 != null)
      b(sh1); 
    if (!ai1.a.isEmpty()) {
      switch (((nh1)ai1.a.get(0)).b) {
        default:
          this.a.put("ad_format", "unknown");
          return this;
        case 6:
          this.a.put("ad_format", "app_open_ad");
          if (parampl != null) {
            String str;
            HashMap<String, String> hashMap = this.a;
            if (parampl.i()) {
              str = "1";
            } else {
              str = "0";
            } 
            hashMap.put("as", str);
          } 
          return this;
        case 5:
          this.a.put("ad_format", "rewarded");
          return this;
        case 4:
          this.a.put("ad_format", "native_advanced");
          return this;
        case 3:
          this.a.put("ad_format", "native_express");
          return this;
        case 2:
          this.a.put("ad_format", "interstitial");
          return this;
        case 1:
          break;
      } 
      this.a.put("ad_format", "banner");
    } 
    return this;
  }
  
  public final rm1 b(sh1 paramsh1) {
    if (!TextUtils.isEmpty(paramsh1.b))
      this.a.put("gqi", paramsh1.b); 
    return this;
  }
  
  public final rm1 c(nh1 paramnh1) {
    this.a.put("aai", paramnh1.v);
    return this;
  }
  
  public final rm1 f(String paramString) {
    this.b.b(paramString);
    return this;
  }
  
  public final Map<String, String> g() {
    HashMap<String, String> hashMap = new HashMap<String, String>(this.a);
    for (xm1 xm1 : this.b.a())
      hashMap.put(xm1.a, xm1.b); 
    return hashMap;
  }
  
  public final rm1 h(Bundle paramBundle) {
    if (paramBundle.containsKey("cnt"))
      this.a.put("network_coarse", Integer.toString(paramBundle.getInt("cnt"))); 
    if (paramBundle.containsKey("gnt"))
      this.a.put("network_fine", Integer.toString(paramBundle.getInt("gnt"))); 
    return this;
  }
  
  public final rm1 i(String paramString1, String paramString2) {
    this.a.put(paramString1, paramString2);
    return this;
  }
  
  public final rm1 j(String paramString1, String paramString2) {
    this.b.c(paramString1, paramString2);
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */