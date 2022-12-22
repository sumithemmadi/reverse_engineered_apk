package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class w91<T> implements a92<v91<T>> {
  private final m92<Executor> a;
  
  private final m92<Set<s91<? extends t91<T>>>> b;
  
  private w91(m92<Executor> paramm92, m92<Set<s91<? extends t91<T>>>> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static <T> v91<T> a(Executor paramExecutor, Set<s91<? extends t91<T>>> paramSet) {
    return new v91<T>(paramExecutor, paramSet);
  }
  
  public static <T> w91<T> b(m92<Executor> paramm92, m92<Set<s91<? extends t91<T>>>> paramm921) {
    return new w91<T>(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */