package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class zp implements Runnable {
  zp(up paramup, String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, int paramInt3, int paramInt4) {}
  
  public final void run() {
    String str;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", "precacheProgress");
    hashMap.put("src", this.b);
    hashMap.put("cachedSrc", this.c);
    hashMap.put("bytesLoaded", Integer.toString(this.d));
    hashMap.put("totalBytes", Integer.toString(this.e));
    hashMap.put("bufferedDuration", Long.toString(this.f));
    hashMap.put("totalDuration", Long.toString(this.g));
    if (this.h) {
      str = "1";
    } else {
      str = "0";
    } 
    hashMap.put("cacheReady", str);
    hashMap.put("playerCount", Integer.toString(this.i));
    hashMap.put("playerPreparedCount", Integer.toString(this.j));
    up.i(this.k, "onPrecacheEvent", hashMap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */