package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class b72 implements Iterator<Map.Entry<K, V>> {
  private int b = -1;
  
  private boolean c;
  
  private Iterator<Map.Entry<K, V>> d;
  
  private b72(t62 paramt62) {}
  
  private final Iterator<Map.Entry<K, V>> a() {
    if (this.d == null)
      this.d = t62.m(this.e).entrySet().iterator(); 
    return this.d;
  }
  
  public final boolean hasNext() {
    return (this.b + 1 < t62.f(this.e).size() || (!t62.m(this.e).isEmpty() && a().hasNext()));
  }
  
  public final void remove() {
    if (this.c) {
      this.c = false;
      t62.e(this.e);
      if (this.b < t62.f(this.e).size()) {
        t62 t621 = this.e;
        int i = this.b;
        this.b = i - 1;
        t62.c(t621, i);
        return;
      } 
      a().remove();
      return;
    } 
    throw new IllegalStateException("remove() was called before next()");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */