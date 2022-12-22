package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class xp implements Runnable {
  xp(up paramup, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean) {}
  
  public final void run() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", "precacheProgress");
    hashMap.put("src", this.b);
    hashMap.put("cachedSrc", this.c);
    hashMap.put("bytesLoaded", Integer.toString(this.d));
    hashMap.put("totalBytes", Integer.toString(this.e));
    hashMap.put("cacheReady", "0");
    up.i(this.g, "onPrecacheEvent", hashMap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */