package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.HashMap;

final class wp implements Runnable {
  wp(up paramup, String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, boolean paramBoolean, int paramInt1, int paramInt2) {}
  
  public final void run() {
    String str;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", "precacheProgress");
    hashMap.put("src", this.b);
    hashMap.put("cachedSrc", this.c);
    hashMap.put("bufferedDuration", Long.toString(this.d));
    hashMap.put("totalDuration", Long.toString(this.e));
    x<Boolean> x = m0.D1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      hashMap.put("qoeLoadedBytes", Long.toString(this.f));
      hashMap.put("qoeCachedBytes", Long.toString(this.g));
      hashMap.put("totalBytes", Long.toString(this.h));
      hashMap.put("reportTime", Long.toString(q.j().a()));
    } 
    if (this.i) {
      str = "1";
    } else {
      str = "0";
    } 
    hashMap.put("cacheReady", str);
    hashMap.put("playerCount", Integer.toString(this.j));
    hashMap.put("playerPreparedCount", Integer.toString(this.k));
    up.i(this.l, "onPrecacheEvent", hashMap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */