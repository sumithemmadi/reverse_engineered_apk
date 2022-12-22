package com.google.android.gms.internal.ads;

import java.util.List;

final class zzdxe extends zzdxd<E> {
  private final transient int d;
  
  private final transient int e;
  
  zzdxe(zzdxd paramzzdxd, int paramInt1, int paramInt2) {
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public final E get(int paramInt) {
    xq1.h(paramInt, this.e);
    return this.zzhxr.get(paramInt + this.d);
  }
  
  public final int size() {
    return this.e;
  }
  
  final Object[] zzazh() {
    return this.zzhxr.zzazh();
  }
  
  final int zzazi() {
    return this.zzhxr.zzazi() + this.d;
  }
  
  final int zzazj() {
    return this.zzhxr.zzazi() + this.d + this.e;
  }
  
  final boolean zzazl() {
    return true;
  }
  
  public final zzdxd<E> zzv(int paramInt1, int paramInt2) {
    xq1.g(paramInt1, paramInt2, this.e);
    zzdxd zzdxd1 = this.zzhxr;
    int i = this.d;
    return (zzdxd<E>)zzdxd1.subList(paramInt1 + i, paramInt2 + i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */