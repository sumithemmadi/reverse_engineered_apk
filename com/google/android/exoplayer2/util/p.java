package com.google.android.exoplayer2.util;

import java.util.Arrays;

public final class p {
  private int a;
  
  private long[] b;
  
  public p() {
    this(32);
  }
  
  public p(int paramInt) {
    this.b = new long[paramInt];
  }
  
  public void a(long paramLong) {
    int i = this.a;
    long[] arrayOfLong = this.b;
    if (i == arrayOfLong.length)
      this.b = Arrays.copyOf(arrayOfLong, i * 2); 
    arrayOfLong = this.b;
    i = this.a;
    this.a = i + 1;
    arrayOfLong[i] = paramLong;
  }
  
  public long b(int paramInt) {
    if (paramInt >= 0 && paramInt < this.a)
      return this.b[paramInt]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid index ");
    stringBuilder.append(paramInt);
    stringBuilder.append(", size is ");
    stringBuilder.append(this.a);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public int c() {
    return this.a;
  }
  
  public long[] d() {
    return Arrays.copyOf(this.b, this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */