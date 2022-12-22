package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class yp implements Runnable {
  yp(up paramup, String paramString1, String paramString2, int paramInt) {}
  
  public final void run() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", "precacheComplete");
    hashMap.put("src", this.b);
    hashMap.put("cachedSrc", this.c);
    hashMap.put("totalBytes", Integer.toString(this.d));
    up.i(this.e, "onPrecacheEvent", hashMap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */