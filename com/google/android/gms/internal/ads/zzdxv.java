package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzdxv<K> extends zzdxg<K> {
  private final transient zzdxh<K, ?> d;
  
  private final transient zzdxd<K> e;
  
  zzdxv(zzdxh<K, ?> paramzzdxh, zzdxd<K> paramzzdxd) {
    this.d = paramzzdxh;
    this.e = paramzzdxd;
  }
  
  public final boolean contains(Object paramObject) {
    return (this.d.get(paramObject) != null);
  }
  
  public final int size() {
    return this.d.size();
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt) {
    return super.zzazk().zza(paramArrayOfObject, paramInt);
  }
  
  public final yr1<K> zzazg() {
    return (yr1<K>)super.zzazk().iterator();
  }
  
  public final zzdxd<K> zzazk() {
    return this.e;
  }
  
  final boolean zzazl() {
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */