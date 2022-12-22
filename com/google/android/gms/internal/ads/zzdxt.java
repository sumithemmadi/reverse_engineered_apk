package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class zzdxt<K, V> extends zzdxg<Map.Entry<K, V>> {
  private final transient zzdxh<K, V> d;
  
  private final transient Object[] e;
  
  private final transient int f;
  
  private final transient int g;
  
  zzdxt(zzdxh<K, V> paramzzdxh, Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    this.d = paramzzdxh;
    this.e = paramArrayOfObject;
    this.f = 0;
    this.g = paramInt2;
  }
  
  public final boolean contains(Object paramObject) {
    if (paramObject instanceof Map.Entry) {
      Map.Entry entry = (Map.Entry)paramObject;
      paramObject = entry.getKey();
      entry = (Map.Entry)entry.getValue();
      if (entry != null && entry.equals(this.d.get(paramObject)))
        return true; 
    } 
    return false;
  }
  
  public final int size() {
    return this.g;
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt) {
    return zzazk().zza(paramArrayOfObject, paramInt);
  }
  
  public final yr1<Map.Entry<K, V>> zzazg() {
    return (yr1<Map.Entry<K, V>>)zzazk().iterator();
  }
  
  final boolean zzazl() {
    return true;
  }
  
  final zzdxd<Map.Entry<K, V>> zzazo() {
    return new zzdxs(this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */