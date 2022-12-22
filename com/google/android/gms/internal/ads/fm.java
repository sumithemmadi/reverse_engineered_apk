package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class fm {
  public static final nt1 a;
  
  public static final nt1 b;
  
  public static final nt1 c;
  
  public static final ScheduledExecutorService d = new im(3, b("Schedule"));
  
  public static final nt1 e = a(new km());
  
  public static final nt1 f = a(qt1.c());
  
  private static nt1 a(Executor paramExecutor) {
    return new jm(paramExecutor, null);
  }
  
  private static ThreadFactory b(String paramString) {
    return new hm(paramString);
  }
  
  static {
    ExecutorService executorService;
    if (d.a()) {
      executorService = pp1.a().c(b("Default"), yp1.b);
    } else {
      executorService = new ThreadPoolExecutor(2, 2147483647, 10L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), b("Default"));
    } 
    a = a(executorService);
    if (d.a()) {
      executorService = pp1.a().a(5, b("Loader"), yp1.a);
    } else {
      executorService = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), b("Loader"));
      executorService.allowCoreThreadTimeOut(true);
    } 
    b = a(executorService);
    if (d.a()) {
      executorService = pp1.a().b(b("Activeview"), yp1.a);
    } else {
      executorService = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), b("Activeview"));
      executorService.allowCoreThreadTimeOut(true);
    } 
    c = a(executorService);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */