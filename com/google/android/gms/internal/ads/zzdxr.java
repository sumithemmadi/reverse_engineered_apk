package com.google.android.gms.internal.ads;

final class zzdxr<E> extends zzdxd<E> {
  static final zzdxd<Object> d = new zzdxr(new Object[0], 0);
  
  private final transient Object[] e;
  
  private final transient int f;
  
  zzdxr(Object[] paramArrayOfObject, int paramInt) {
    this.e = paramArrayOfObject;
    this.f = paramInt;
  }
  
  public final E get(int paramInt) {
    xq1.h(paramInt, this.f);
    return (E)this.e[paramInt];
  }
  
  public final int size() {
    return this.f;
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt) {
    System.arraycopy(this.e, 0, paramArrayOfObject, paramInt, this.f);
    return paramInt + this.f;
  }
  
  final Object[] zzazh() {
    return this.e;
  }
  
  final int zzazi() {
    return 0;
  }
  
  final int zzazj() {
    return this.f;
  }
  
  final boolean zzazl() {
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */