package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.e1;
import com.google.android.gms.ads.internal.util.h1;
import java.util.concurrent.Executor;

final class km implements Executor {
  private final Handler b = (Handler)new e1(Looper.getMainLooper());
  
  public final void execute(Runnable paramRunnable) {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
      try {
        return;
      } finally {
        q.c();
        h1.n(q.g().a(), (Throwable)paramRunnable);
      }  
    this.b.post(paramRunnable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/km.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */