package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

public final class t42<F, T> extends AbstractList<T> {
  private final List<F> b;
  
  private final s42<F, T> c;
  
  public t42(List<F> paramList, s42<F, T> params42) {
    this.b = paramList;
    this.c = params42;
  }
  
  public final T get(int paramInt) {
    return this.c.a(this.b.get(paramInt));
  }
  
  public final int size() {
    return this.b.size();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */