package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class zs1<V> extends hr1 implements Future<V> {
  public boolean cancel(boolean paramBoolean) {
    return f().cancel(paramBoolean);
  }
  
  protected abstract Future<? extends V> f();
  
  public V get() {
    return f().get();
  }
  
  public V get(long paramLong, TimeUnit paramTimeUnit) {
    return f().get(paramLong, paramTimeUnit);
  }
  
  public boolean isCancelled() {
    return f().isCancelled();
  }
  
  public boolean isDone() {
    return f().isDone();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */