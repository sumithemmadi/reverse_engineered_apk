package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

public final class k92<T> {
  private final List<m92<T>> a;
  
  private final List<m92<Collection<T>>> b;
  
  private k92(int paramInt1, int paramInt2) {
    this.a = z82.a(paramInt1);
    this.b = z82.a(paramInt2);
  }
  
  public final k92<T> a(m92<? extends T> paramm92) {
    this.a.add(paramm92);
    return this;
  }
  
  public final k92<T> b(m92<? extends Collection<? extends T>> paramm92) {
    this.b.add(paramm92);
    return this;
  }
  
  public final i92<T> c() {
    return new i92<T>(this.a, this.b, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */