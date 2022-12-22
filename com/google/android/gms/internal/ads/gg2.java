package com.google.android.gms.internal.ads;

final class gg2 {
  public final int a;
  
  public final long[] b;
  
  public final int[] c;
  
  public final int d;
  
  public final long[] e;
  
  public final int[] f;
  
  public gg2(long[] paramArrayOflong1, int[] paramArrayOfint1, int paramInt, long[] paramArrayOflong2, int[] paramArrayOfint2) {
    boolean bool2;
    int i = paramArrayOfint1.length;
    int j = paramArrayOflong2.length;
    boolean bool1 = true;
    if (i == j) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    jj2.a(bool2);
    if (paramArrayOflong1.length == paramArrayOflong2.length) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    jj2.a(bool2);
    if (paramArrayOfint2.length == paramArrayOflong2.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    jj2.a(bool2);
    this.b = paramArrayOflong1;
    this.c = paramArrayOfint1;
    this.d = paramInt;
    this.e = paramArrayOflong2;
    this.f = paramArrayOfint2;
    this.a = paramArrayOflong1.length;
  }
  
  public final int a(long paramLong) {
    for (int i = wj2.b(this.e, paramLong, true, false); i >= 0; i--) {
      if ((this.f[i] & 0x1) != 0)
        return i; 
    } 
    return -1;
  }
  
  public final int b(long paramLong) {
    for (int i = wj2.h(this.e, paramLong, true, false); i < this.e.length; i++) {
      if ((this.f[i] & 0x1) != 0)
        return i; 
    } 
    return -1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */