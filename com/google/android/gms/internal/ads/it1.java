package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class it1<V> {
  private final boolean a;
  
  private final zzdxd<ot1<? extends V>> b;
  
  private it1(boolean paramBoolean, zzdxd<ot1<? extends V>> paramzzdxd) {
    this.a = paramBoolean;
    this.b = paramzzdxd;
  }
  
  public final <C> ot1<C> a(Callable<C> paramCallable, Executor paramExecutor) {
    return new us1<C>(this.b, this.a, paramExecutor, paramCallable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/it1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */