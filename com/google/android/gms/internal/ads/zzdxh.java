package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class zzdxh<K, V> implements Serializable, Map<K, V> {
  private static final Map.Entry<?, ?>[] b = (Map.Entry<?, ?>[])new Map.Entry[0];
  
  private transient zzdxg<Map.Entry<K, V>> c;
  
  private transient zzdxg<K> d;
  
  private transient zzdwy<V> e;
  
  public static <K, V> zzdxh<K, V> zza(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3, K paramK4, V paramV4, K paramK5, V paramV5) {
    ir1.a(paramK1, paramV1);
    ir1.a(paramK2, paramV2);
    ir1.a(paramK3, paramV3);
    ir1.a(paramK4, paramV4);
    ir1.a(paramK5, paramV5);
    return zzdxq.zzc(5, new Object[] { paramK1, paramV1, paramK2, paramV2, paramK3, paramV3, paramK4, paramV4, paramK5, paramV5 });
  }
  
  public static <K, V> zzdxh<K, V> zzc(K paramK, V paramV) {
    ir1.a(paramK, paramV);
    return zzdxq.zzc(1, new Object[] { paramK, paramV });
  }
  
  @Deprecated
  public final void clear() {
    throw new UnsupportedOperationException();
  }
  
  public boolean containsKey(Object paramObject) {
    return (get(paramObject) != null);
  }
  
  public boolean containsValue(Object paramObject) {
    return ((zzdwy)values()).contains(paramObject);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Map) {
      paramObject = paramObject;
      return super.entrySet().equals(paramObject.entrySet());
    } 
    return false;
  }
  
  public abstract V get(Object paramObject);
  
  public final V getOrDefault(Object paramObject, V paramV) {
    paramObject = get(paramObject);
    return (V)((paramObject != null) ? paramObject : (Object)paramV);
  }
  
  public int hashCode() {
    return vr1.b(entrySet());
  }
  
  public boolean isEmpty() {
    return (size() == 0);
  }
  
  @Deprecated
  public final V put(K paramK, V paramV) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void putAll(Map<? extends K, ? extends V> paramMap) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final V remove(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public String toString() {
    int i = size();
    ir1.b(i, "size");
    StringBuilder stringBuilder = new StringBuilder((int)Math.min(i << 3L, 1073741824L));
    stringBuilder.append('{');
    Iterator<Map.Entry> iterator = super.entrySet().iterator();
    i = 1;
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      if (i == 0)
        stringBuilder.append(", "); 
      i = 0;
      stringBuilder.append(entry.getKey());
      stringBuilder.append('=');
      stringBuilder.append(entry.getValue());
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  abstract zzdxg<Map.Entry<K, V>> zzazp();
  
  abstract zzdxg<K> zzazq();
  
  abstract zzdwy<V> zzazr();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */