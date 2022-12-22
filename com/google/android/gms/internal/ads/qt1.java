package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class qt1 {
  public static nt1 a(ExecutorService paramExecutorService) {
    return (paramExecutorService instanceof nt1) ? (nt1)paramExecutorService : ((paramExecutorService instanceof ScheduledExecutorService) ? new rt1((ScheduledExecutorService)paramExecutorService) : new ut1(paramExecutorService));
  }
  
  static Executor b(Executor paramExecutor, zzdyk<?> paramzzdyk) {
    xq1.b(paramExecutor);
    xq1.b(paramzzdyk);
    return (paramExecutor == zzdzd.b) ? paramExecutor : new pt1(paramExecutor, paramzzdyk);
  }
  
  public static Executor c() {
    return zzdzd.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */