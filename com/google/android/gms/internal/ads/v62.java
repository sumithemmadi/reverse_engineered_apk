package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class v62 implements Iterator<Map.Entry<K, V>> {
  private int b;
  
  private Iterator<Map.Entry<K, V>> c;
  
  private v62(t62 paramt62) {
    this.b = t62.f(paramt62).size();
  }
  
  private final Iterator<Map.Entry<K, V>> a() {
    if (this.c == null)
      this.c = t62.n(this.d).entrySet().iterator(); 
    return this.c;
  }
  
  public final boolean hasNext() {
    int i = this.b;
    return ((i > 0 && i <= t62.f(this.d).size()) || a().hasNext());
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */