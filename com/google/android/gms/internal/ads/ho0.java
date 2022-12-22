package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class ho0 {
  private ConcurrentHashMap<String, String> a;
  
  private final pl b;
  
  public ho0(so0 paramso0, pl parampl) {
    this.a = new ConcurrentHashMap<String, String>(paramso0.b);
    this.b = parampl;
  }
  
  public final void a(ci1 paramci1) {
    if (paramci1.b.a.size() > 0) {
      ConcurrentHashMap<String, String> concurrentHashMap;
      String str;
      switch (((nh1)paramci1.b.a.get(0)).b) {
        default:
          this.a.put("ad_format", "unknown");
          break;
        case 6:
          this.a.put("ad_format", "app_open_ad");
          concurrentHashMap = this.a;
          if (this.b.i()) {
            str = "1";
          } else {
            str = "0";
          } 
          concurrentHashMap.put("as", str);
          break;
        case 5:
          this.a.put("ad_format", "rewarded");
          break;
        case 4:
          this.a.put("ad_format", "native_advanced");
          break;
        case 3:
          this.a.put("ad_format", "native_express");
          break;
        case 2:
          this.a.put("ad_format", "interstitial");
          break;
        case 1:
          this.a.put("ad_format", "banner");
          break;
      } 
    } 
    if (!TextUtils.isEmpty(paramci1.b.b.b))
      this.a.put("gqi", paramci1.b.b.b); 
  }
  
  public final void b(Bundle paramBundle) {
    if (paramBundle.containsKey("cnt"))
      this.a.put("network_coarse", Integer.toString(paramBundle.getInt("cnt"))); 
    if (paramBundle.containsKey("gnt"))
      this.a.put("network_fine", Integer.toString(paramBundle.getInt("gnt"))); 
  }
  
  public final Map<String, String> c() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ho0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */