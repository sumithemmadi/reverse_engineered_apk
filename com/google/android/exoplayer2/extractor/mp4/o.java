package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;

final class o {
  public final l a;
  
  public final int b;
  
  public final long[] c;
  
  public final int[] d;
  
  public final int e;
  
  public final long[] f;
  
  public final int[] g;
  
  public final long h;
  
  public o(l paraml, long[] paramArrayOflong1, int[] paramArrayOfint1, int paramInt, long[] paramArrayOflong2, int[] paramArrayOfint2, long paramLong) {
    int i = paramArrayOfint1.length;
    int j = paramArrayOflong2.length;
    boolean bool1 = false;
    if (i == j) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    if (paramArrayOflong1.length == paramArrayOflong2.length) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    boolean bool2 = bool1;
    if (paramArrayOfint2.length == paramArrayOflong2.length)
      bool2 = true; 
    e.a(bool2);
    this.a = paraml;
    this.c = paramArrayOflong1;
    this.d = paramArrayOfint1;
    this.e = paramInt;
    this.f = paramArrayOflong2;
    this.g = paramArrayOfint2;
    this.h = paramLong;
    this.b = paramArrayOflong1.length;
    if (paramArrayOfint2.length > 0) {
      paramInt = paramArrayOfint2.length - 1;
      paramArrayOfint2[paramInt] = paramArrayOfint2[paramInt] | 0x20000000;
    } 
  }
  
  public int a(long paramLong) {
    for (int i = h0.f(this.f, paramLong, true, false); i >= 0; i--) {
      if ((this.g[i] & 0x1) != 0)
        return i; 
    } 
    return -1;
  }
  
  public int b(long paramLong) {
    for (int i = h0.d(this.f, paramLong, true, false); i < this.f.length; i++) {
      if ((this.g[i] & 0x1) != 0)
        return i; 
    } 
    return -1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */