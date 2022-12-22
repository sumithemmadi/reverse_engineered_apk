package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;

final class y {
  private final e0 a = new e0(0L);
  
  private final v b = new v();
  
  private boolean c;
  
  private boolean d;
  
  private boolean e;
  
  private long f = -9223372036854775807L;
  
  private long g = -9223372036854775807L;
  
  private long h = -9223372036854775807L;
  
  private static boolean a(byte[] paramArrayOfbyte) {
    boolean bool = false;
    if ((paramArrayOfbyte[0] & 0xC4) != 68)
      return false; 
    if ((paramArrayOfbyte[2] & 0x4) != 4)
      return false; 
    if ((paramArrayOfbyte[4] & 0x4) != 4)
      return false; 
    if ((paramArrayOfbyte[5] & 0x1) != 1)
      return false; 
    if ((paramArrayOfbyte[8] & 0x3) == 3)
      bool = true; 
    return bool;
  }
  
  private int b(i parami) {
    this.b.J(h0.f);
    this.c = true;
    parami.h();
    return 0;
  }
  
  private int f(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = paramArrayOfbyte[paramInt];
    byte b2 = paramArrayOfbyte[paramInt + 1];
    byte b3 = paramArrayOfbyte[paramInt + 2];
    return paramArrayOfbyte[paramInt + 3] & 0xFF | (b1 & 0xFF) << 24 | (b2 & 0xFF) << 16 | (b3 & 0xFF) << 8;
  }
  
  private int h(i parami, s params) {
    int j = (int)Math.min(20000L, parami.getLength());
    long l1 = parami.a();
    long l2 = 0L;
    if (l1 != l2) {
      params.a = l2;
      return 1;
    } 
    this.b.I(j);
    parami.h();
    parami.k(this.b.a, 0, j);
    this.f = i(this.b);
    this.d = true;
    return 0;
  }
  
  private long i(v paramv) {
    int i = paramv.c();
    int j = paramv.d();
    while (i < j - 3) {
      if (f(paramv.a, i) == 442) {
        paramv.M(i + 4);
        long l = l(paramv);
        if (l != -9223372036854775807L)
          return l; 
      } 
      i++;
    } 
    return -9223372036854775807L;
  }
  
  private int j(i parami, s params) {
    long l = parami.getLength();
    int j = (int)Math.min(20000L, l);
    l -= j;
    if (parami.a() != l) {
      params.a = l;
      return 1;
    } 
    this.b.I(j);
    parami.h();
    parami.k(this.b.a, 0, j);
    this.g = k(this.b);
    this.e = true;
    return 0;
  }
  
  private long k(v paramv) {
    int i = paramv.c();
    for (int j = paramv.d() - 4; j >= i; j--) {
      if (f(paramv.a, j) == 442) {
        paramv.M(j + 4);
        long l = l(paramv);
        if (l != -9223372036854775807L)
          return l; 
      } 
    } 
    return -9223372036854775807L;
  }
  
  public static long l(v paramv) {
    int i = paramv.c();
    if (paramv.a() < 9)
      return -9223372036854775807L; 
    byte[] arrayOfByte = new byte[9];
    paramv.h(arrayOfByte, 0, 9);
    paramv.M(i);
    return !a(arrayOfByte) ? -9223372036854775807L : m(arrayOfByte);
  }
  
  private static long m(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte[0] & 0x38L) >> 3L << 30L | (paramArrayOfbyte[0] & 0x3L) << 28L | (paramArrayOfbyte[1] & 0xFFL) << 20L | (paramArrayOfbyte[2] & 0xF8L) >> 3L << 15L | (paramArrayOfbyte[2] & 0x3L) << 13L | (paramArrayOfbyte[3] & 0xFFL) << 5L | (paramArrayOfbyte[4] & 0xF8L) >> 3L;
  }
  
  public long c() {
    return this.h;
  }
  
  public e0 d() {
    return this.a;
  }
  
  public boolean e() {
    return this.c;
  }
  
  public int g(i parami, s params) {
    if (!this.e)
      return j(parami, params); 
    if (this.g == -9223372036854775807L)
      return b(parami); 
    if (!this.d)
      return h(parami, params); 
    long l = this.f;
    if (l == -9223372036854775807L)
      return b(parami); 
    l = this.a.b(l);
    this.h = this.a.b(this.g) - l;
    return b(parami);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */