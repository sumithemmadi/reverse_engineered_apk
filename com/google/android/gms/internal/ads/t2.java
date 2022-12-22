package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class t2 {
  private static final AtomicReference<u2> a = new AtomicReference<u2>();
  
  static final AtomicBoolean b = new AtomicBoolean();
  
  public static void a(u2 paramu2) {
    a.set(paramu2);
  }
  
  static u2 b() {
    return a.get();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */