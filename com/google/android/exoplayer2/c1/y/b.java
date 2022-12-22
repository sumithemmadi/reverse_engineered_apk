package com.google.android.exoplayer2.c1.y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.d;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.h0;
import java.io.EOFException;
import java.util.Arrays;

public final class b implements h {
  public static final l a = a.a;
  
  private static final int[] b = new int[] { 
      13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 
      6, 6, 1, 1, 1, 1 };
  
  private static final int[] c;
  
  private static final byte[] d = h0.R("#!AMR\n");
  
  private static final byte[] e = h0.R("#!AMR-WB\n");
  
  private static final int f;
  
  private final byte[] g;
  
  private final int h;
  
  private boolean i;
  
  private long j;
  
  private int k;
  
  private int l;
  
  private boolean m;
  
  private long n;
  
  private int o;
  
  private int p;
  
  private long q;
  
  private j r;
  
  private v s;
  
  private t t;
  
  private boolean u;
  
  static {
    f = arrayOfInt[8];
  }
  
  public b() {
    this(0);
  }
  
  public b(int paramInt) {
    this.h = paramInt;
    this.g = new byte[1];
    this.o = -1;
  }
  
  private static int b(int paramInt, long paramLong) {
    return (int)((paramInt * 8) * 1000000L / paramLong);
  }
  
  private t c(long paramLong) {
    int i = b(this.o, 20000L);
    return (t)new d(paramLong, this.n, i, this.o);
  }
  
  private int d(int paramInt) {
    if (!j(paramInt)) {
      String str;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Illegal AMR ");
      if (this.i) {
        str = "WB";
      } else {
        str = "NB";
      } 
      stringBuilder.append(str);
      stringBuilder.append(" frame type ");
      stringBuilder.append(paramInt);
      throw new ParserException(stringBuilder.toString());
    } 
    if (this.i) {
      paramInt = c[paramInt];
    } else {
      paramInt = b[paramInt];
    } 
    return paramInt;
  }
  
  private boolean f(int paramInt) {
    boolean bool;
    if (!this.i && (paramInt < 12 || paramInt > 14)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean j(int paramInt) {
    boolean bool;
    if (paramInt >= 0 && paramInt <= 15 && (k(paramInt) || f(paramInt))) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean k(int paramInt) {
    boolean bool;
    if (this.i && (paramInt < 10 || paramInt > 13)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void m() {
    if (!this.u) {
      String str;
      char c;
      this.u = true;
      boolean bool = this.i;
      if (bool) {
        str = "audio/amr-wb";
      } else {
        str = "audio/3gpp";
      } 
      if (bool) {
        c = '㺀';
      } else {
        c = 'ὀ';
      } 
      this.s.d(Format.o(null, str, null, -1, f, 1, c, -1, null, null, 0, null));
    } 
  }
  
  private void n(long paramLong, int paramInt) {
    if (this.m)
      return; 
    if ((this.h & 0x1) != 0 && paramLong != -1L) {
      int i = this.o;
      if (i != -1 && i != this.k) {
        t.b b2 = new t.b(-9223372036854775807L);
        this.t = (t)b2;
        this.r.a((t)b2);
        this.m = true;
        return;
      } 
      if (this.p >= 20 || paramInt == -1) {
        t t1 = c(paramLong);
        this.t = t1;
        this.r.a(t1);
        this.m = true;
      } 
      return;
    } 
    t.b b1 = new t.b(-9223372036854775807L);
    this.t = (t)b1;
    this.r.a((t)b1);
    this.m = true;
  }
  
  private boolean o(i parami, byte[] paramArrayOfbyte) {
    parami.h();
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    parami.k(arrayOfByte, 0, paramArrayOfbyte.length);
    return Arrays.equals(arrayOfByte, paramArrayOfbyte);
  }
  
  private int p(i parami) {
    parami.h();
    parami.k(this.g, 0, 1);
    byte b1 = this.g[0];
    if ((b1 & 0x83) <= 0)
      return d(b1 >> 3 & 0xF); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid padding bits for frame header ");
    stringBuilder.append(b1);
    throw new ParserException(stringBuilder.toString());
  }
  
  private boolean q(i parami) {
    byte[] arrayOfByte = d;
    if (o(parami, arrayOfByte)) {
      this.i = false;
      parami.i(arrayOfByte.length);
      return true;
    } 
    arrayOfByte = e;
    if (o(parami, arrayOfByte)) {
      this.i = true;
      parami.i(arrayOfByte.length);
      return true;
    } 
    return false;
  }
  
  private int r(i parami) {
    if (this.l == 0)
      try {
        int m = p(parami);
        this.k = m;
        this.l = m;
        if (this.o == -1) {
          this.n = parami.a();
          this.o = this.k;
        } 
        if (this.o == this.k)
          this.p++; 
      } catch (EOFException eOFException) {
        return -1;
      }  
    int k = this.s.a((i)eOFException, this.l, true);
    if (k == -1)
      return -1; 
    k = this.l - k;
    this.l = k;
    if (k > 0)
      return 0; 
    this.s.c(this.q + this.j, 1, this.k, 0, null);
    this.j += 20000L;
    return 0;
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    return q(parami);
  }
  
  public int g(i parami, s params) {
    if (parami.a() != 0L || q(parami)) {
      m();
      int k = r(parami);
      n(parami.getLength(), k);
      return k;
    } 
    throw new ParserException("Could not find AMR header.");
  }
  
  public void h(j paramj) {
    this.r = paramj;
    this.s = paramj.g(0, 1);
    paramj.f();
  }
  
  public void i(long paramLong1, long paramLong2) {
    this.j = 0L;
    this.k = 0;
    this.l = 0;
    if (paramLong1 != 0L) {
      t t1 = this.t;
      if (t1 instanceof d) {
        this.q = ((d)t1).e(paramLong1);
        return;
      } 
    } 
    this.q = 0L;
  }
  
  static {
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = 18;
    arrayOfInt[1] = 24;
    arrayOfInt[2] = 33;
    arrayOfInt[3] = 37;
    arrayOfInt[4] = 41;
    arrayOfInt[5] = 47;
    arrayOfInt[6] = 51;
    arrayOfInt[7] = 59;
    arrayOfInt[8] = 61;
    arrayOfInt[9] = 6;
    arrayOfInt[10] = 1;
    arrayOfInt[11] = 1;
    arrayOfInt[12] = 1;
    arrayOfInt[13] = 1;
    arrayOfInt[14] = 1;
    arrayOfInt[15] = 1;
    c = arrayOfInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/y/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */