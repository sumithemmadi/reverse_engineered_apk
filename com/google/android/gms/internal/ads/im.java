package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

final class im extends ScheduledThreadPoolExecutor {
  im(int paramInt, ThreadFactory paramThreadFactory) {
    super(3, paramThreadFactory);
  }
  
  public final void execute(Runnable paramRunnable) {
    super.execute(tp1.a().a(paramRunnable));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/im.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */