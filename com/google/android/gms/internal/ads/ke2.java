package com.google.android.gms.internal.ads;

public final class ke2 implements se2 {
  private final int a;
  
  private final int[] b;
  
  private final long[] c;
  
  private final long[] d;
  
  private final long[] e;
  
  private final long f;
  
  public ke2(int[] paramArrayOfint, long[] paramArrayOflong1, long[] paramArrayOflong2, long[] paramArrayOflong3) {
    this.b = paramArrayOfint;
    this.c = paramArrayOflong1;
    this.d = paramArrayOflong2;
    this.e = paramArrayOflong3;
    int i = paramArrayOfint.length;
    this.a = i;
    if (i > 0) {
      this.f = paramArrayOflong2[i - 1] + paramArrayOflong3[i - 1];
      return;
    } 
    this.f = 0L;
  }
  
  public final boolean b() {
    return true;
  }
  
  public final long c() {
    return this.f;
  }
  
  public final long f(long paramLong) {
    return this.c[wj2.b(this.e, paramLong, true, true)];
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ke2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */