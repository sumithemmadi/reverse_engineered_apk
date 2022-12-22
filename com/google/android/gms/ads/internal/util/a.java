package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.ot1;

public abstract class a {
  private final Runnable a = new a1(this);
  
  private volatile Thread b;
  
  private boolean c = false;
  
  public abstract void b();
  
  public final ot1<?> c() {
    return fm.b.e(this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */