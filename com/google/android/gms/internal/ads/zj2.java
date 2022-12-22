package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class zj2 implements ThreadFactory {
  zj2(String paramString) {}
  
  public final Thread newThread(Runnable paramRunnable) {
    return new Thread(paramRunnable, this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */