package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;

public final class l {
  public final int a;
  
  public final int b;
  
  public final long c;
  
  public final long d;
  
  public final long e;
  
  public final Format f;
  
  public final int g;
  
  public final long[] h;
  
  public final long[] i;
  
  public final int j;
  
  private final m[] k;
  
  public l(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, Format paramFormat, int paramInt3, m[] paramArrayOfm, int paramInt4, long[] paramArrayOflong1, long[] paramArrayOflong2) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramLong3;
    this.f = paramFormat;
    this.g = paramInt3;
    this.k = paramArrayOfm;
    this.j = paramInt4;
    this.h = paramArrayOflong1;
    this.i = paramArrayOflong2;
  }
  
  public m a(int paramInt) {
    m m1;
    m[] arrayOfM = this.k;
    if (arrayOfM == null) {
      arrayOfM = null;
    } else {
      m1 = arrayOfM[paramInt];
    } 
    return m1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */