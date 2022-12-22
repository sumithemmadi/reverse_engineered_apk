package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class a52<K> implements Iterator<Map.Entry<K, Object>> {
  private Iterator<Map.Entry<K, Object>> b;
  
  public a52(Iterator<Map.Entry<K, Object>> paramIterator) {
    this.b = paramIterator;
  }
  
  public final boolean hasNext() {
    return this.b.hasNext();
  }
  
  public final void remove() {
    this.b.remove();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */