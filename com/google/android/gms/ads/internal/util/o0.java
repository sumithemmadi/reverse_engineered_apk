package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class o0 {
  private Map<Integer, Bitmap> a = new ConcurrentHashMap<Integer, Bitmap>();
  
  private AtomicInteger b = new AtomicInteger(0);
  
  public final Bitmap a(Integer paramInteger) {
    return this.a.get(paramInteger);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */