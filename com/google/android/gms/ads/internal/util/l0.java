package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.xp1;

public final class l0 {
  private HandlerThread a = null;
  
  private Handler b = null;
  
  private int c = 0;
  
  private final Object d = new Object();
  
  public final Handler a() {
    return this.b;
  }
  
  public final Looper b() {
    synchronized (this.d) {
      if (this.c == 0) {
        if (this.a == null) {
          b1.m("Starting the looper thread.");
          HandlerThread handlerThread = new HandlerThread();
          this("LooperProvider");
          this.a = handlerThread;
          handlerThread.start();
          xp1 xp1 = new xp1();
          this(this.a.getLooper());
          this.b = (Handler)xp1;
          b1.m("Looper thread started.");
        } else {
          b1.m("Resuming the looper thread");
          this.d.notifyAll();
        } 
      } else {
        t.k(this.a, "Invalid state: mHandlerThread should already been initialized.");
      } 
      this.c++;
      return this.a.getLooper();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */