package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

final class aq implements Runnable {
  aq(up paramup, String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public final void run() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", "precacheCanceled");
    hashMap.put("src", this.b);
    if (!TextUtils.isEmpty(this.c))
      hashMap.put("cachedSrc", this.c); 
    hashMap.put("type", up.h(this.f, this.d));
    hashMap.put("reason", this.d);
    if (!TextUtils.isEmpty(this.e))
      hashMap.put("message", this.e); 
    up.i(this.f, "onPrecacheEvent", hashMap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */