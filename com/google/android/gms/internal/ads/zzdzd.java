package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

enum zzdzd implements Executor {
  b;
  
  static {
    zzdzd zzdzd1 = new zzdzd("INSTANCE", 0);
    b = zzdzd1;
    c = new zzdzd[] { zzdzd1 };
  }
  
  public final void execute(Runnable paramRunnable) {
    paramRunnable.run();
  }
  
  public final String toString() {
    return "MoreExecutors.directExecutor()";
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */