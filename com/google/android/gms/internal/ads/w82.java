package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

abstract class w82<K, V, V2> implements a92<Map<K, V2>> {
  private final Map<K, m92<V>> a;
  
  w82(Map<K, m92<V>> paramMap) {
    this.a = Collections.unmodifiableMap(paramMap);
  }
  
  final Map<K, m92<V>> a() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */