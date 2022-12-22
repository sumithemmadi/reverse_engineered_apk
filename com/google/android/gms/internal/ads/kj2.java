package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class kj2 {
  private int a;
  
  private long[] b = new long[32];
  
  public kj2() {
    this(32);
  }
  
  private kj2(int paramInt) {}
  
  public final void a(long paramLong) {
    int i = this.a;
    long[] arrayOfLong = this.b;
    if (i == arrayOfLong.length)
      this.b = Arrays.copyOf(arrayOfLong, i << 1); 
    arrayOfLong = this.b;
    i = this.a;
    this.a = i + 1;
    arrayOfLong[i] = paramLong;
  }
  
  public final long b(int paramInt) {
    if (paramInt >= 0 && paramInt < this.a)
      return this.b[paramInt]; 
    int i = this.a;
    StringBuilder stringBuilder = new StringBuilder(46);
    stringBuilder.append("Invalid index ");
    stringBuilder.append(paramInt);
    stringBuilder.append(", size is ");
    stringBuilder.append(i);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public final int c() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */