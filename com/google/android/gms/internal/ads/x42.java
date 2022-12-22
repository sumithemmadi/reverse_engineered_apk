package com.google.android.gms.internal.ads;

import java.util.Map;

final class x42<K> implements Map.Entry<K, Object> {
  private Map.Entry<K, w42> b;
  
  private x42(Map.Entry<K, w42> paramEntry) {
    this.b = paramEntry;
  }
  
  public final w42 a() {
    return this.b.getValue();
  }
  
  public final K getKey() {
    return this.b.getKey();
  }
  
  public final Object getValue() {
    return ((w42)this.b.getValue() == null) ? null : w42.e();
  }
  
  public final Object setValue(Object paramObject) {
    if (paramObject instanceof u52)
      return ((w42)this.b.getValue()).d((u52)paramObject); 
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/x42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */