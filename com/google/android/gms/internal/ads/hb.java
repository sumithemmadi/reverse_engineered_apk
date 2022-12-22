package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public final class hb {
  private static hb a;
  
  private AtomicBoolean b = new AtomicBoolean(false);
  
  public static hb b() {
    if (a == null)
      a = new hb(); 
    return a;
  }
  
  public final Thread a(Context paramContext, String paramString) {
    if (!this.b.compareAndSet(false, true))
      return null; 
    Thread thread = new Thread(new gb(this, paramContext, paramString));
    thread.start();
    return thread;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */