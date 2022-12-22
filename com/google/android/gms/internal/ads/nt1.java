package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface nt1 extends ExecutorService {
  <T> ot1<T> a(Callable<T> paramCallable);
  
  ot1<?> e(Runnable paramRunnable);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */