package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzdxx<E> extends zzdxg<E> {
  static final zzdxx<Object> d = new zzdxx(new Object[0], 0, null, 0, 0);
  
  private final transient Object[] e;
  
  private final transient Object[] f;
  
  private final transient int g;
  
  private final transient int h;
  
  private final transient int i;
  
  zzdxx(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3) {
    this.e = paramArrayOfObject1;
    this.f = paramArrayOfObject2;
    this.g = paramInt2;
    this.h = paramInt1;
    this.i = paramInt3;
  }
  
  public final boolean contains(Object paramObject) {
    Object[] arrayOfObject = this.f;
    if (paramObject == null || arrayOfObject == null)
      return false; 
    for (int i = jr1.a(paramObject.hashCode());; i++) {
      i &= this.g;
      Object object = arrayOfObject[i];
      if (object == null)
        return false; 
      if (object.equals(paramObject))
        return true; 
    } 
  }
  
  public final int hashCode() {
    return this.h;
  }
  
  public final int size() {
    return this.i;
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt) {
    System.arraycopy(this.e, 0, paramArrayOfObject, paramInt, this.i);
    return paramInt + this.i;
  }
  
  public final yr1<E> zzazg() {
    return (yr1<E>)zzazk().iterator();
  }
  
  final Object[] zzazh() {
    return this.e;
  }
  
  final int zzazi() {
    return 0;
  }
  
  final int zzazj() {
    return this.i;
  }
  
  final boolean zzazl() {
    return false;
  }
  
  final boolean zzazn() {
    return true;
  }
  
  final zzdxd<E> zzazo() {
    return zzdxd.zzb(this.e, this.i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */