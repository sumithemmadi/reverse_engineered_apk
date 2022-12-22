package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzdxz<E> extends zzdxg<E> {
  private final transient E d;
  
  private transient int e;
  
  zzdxz(E paramE) {
    this.d = xq1.b(paramE);
  }
  
  zzdxz(E paramE, int paramInt) {
    this.d = paramE;
    this.e = paramInt;
  }
  
  public final boolean contains(Object paramObject) {
    return this.d.equals(paramObject);
  }
  
  public final int hashCode() {
    int i = this.e;
    int j = i;
    if (i == 0) {
      j = this.d.hashCode();
      this.e = j;
    } 
    return j;
  }
  
  public final int size() {
    return 1;
  }
  
  public final String toString() {
    String str = this.d.toString();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 2);
    stringBuilder.append('[');
    stringBuilder.append(str);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt) {
    paramArrayOfObject[paramInt] = this.d;
    return paramInt + 1;
  }
  
  public final yr1<E> zzazg() {
    return new pr1(this.d);
  }
  
  final boolean zzazl() {
    return false;
  }
  
  final boolean zzazn() {
    return (this.e != 0);
  }
  
  final zzdxd<E> zzazo() {
    return zzdxd.zzac(this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */