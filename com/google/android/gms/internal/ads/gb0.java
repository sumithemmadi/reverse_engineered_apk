package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class gb0<T> {
  public T a;
  
  public Executor b;
  
  public gb0(T paramT, Executor paramExecutor) {
    this.a = paramT;
    this.b = paramExecutor;
  }
  
  public static <T> gb0<T> a(T paramT, Executor paramExecutor) {
    return new gb0<T>(paramT, paramExecutor);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */