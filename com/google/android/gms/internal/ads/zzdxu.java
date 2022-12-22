package com.google.android.gms.internal.ads;

final class zzdxu extends zzdxd<Object> {
  private final transient Object[] d;
  
  private final transient int e;
  
  private final transient int f;
  
  zzdxu(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    this.d = paramArrayOfObject;
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  public final Object get(int paramInt) {
    xq1.h(paramInt, this.f);
    return this.d[paramInt * 2 + this.e];
  }
  
  public final int size() {
    return this.f;
  }
  
  final boolean zzazl() {
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */