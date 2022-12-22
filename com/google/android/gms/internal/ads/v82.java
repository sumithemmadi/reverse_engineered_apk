package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

public class v82<K, V, V2> {
  final LinkedHashMap<K, m92<V>> a;
  
  v82(int paramInt) {
    this.a = z82.c(paramInt);
  }
  
  v82<K, V, V2> a(K paramK, m92<V> paramm92) {
    this.a.put(g92.b(paramK, "key"), g92.b(paramm92, "provider"));
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */