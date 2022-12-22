package com.google.android.exoplayer2.c1.e0;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.z;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class b implements h {
  public static final l a = a.a;
  
  private j b;
  
  private v c;
  
  private b d;
  
  private int e = -1;
  
  private long f = -1L;
  
  @EnsuresNonNull({"extractorOutput", "trackOutput"})
  private void b() {
    e.h(this.c);
    h0.g(this.b);
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    boolean bool;
    if (d.a(parami) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int g(i parami, s params) {
    StringBuilder stringBuilder;
    boolean bool;
    b();
    if (this.d == null) {
      c c = d.a(parami);
      if (c != null) {
        int m = c.a;
        if (m == 17) {
          this.d = new a(this.b, this.c, c);
        } else if (m == 6) {
          this.d = new c(this.b, this.c, c, "audio/g711-alaw", -1);
        } else if (m == 7) {
          this.d = new c(this.b, this.c, c, "audio/g711-mlaw", -1);
        } else {
          m = z.a(m, c.f);
          if (m != 0) {
            this.d = new c(this.b, this.c, c, "audio/raw", m);
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported WAV format type: ");
            stringBuilder.append(c.a);
            throw new ParserException(stringBuilder.toString());
          } 
        } 
      } else {
        throw new ParserException("Unsupported or unrecognized wav header.");
      } 
    } 
    int k = this.e;
    byte b1 = -1;
    if (k == -1) {
      Pair<Long, Long> pair = d.b((i)stringBuilder);
      this.e = ((Long)pair.first).intValue();
      long l3 = ((Long)pair.second).longValue();
      this.f = l3;
      this.d.b(this.e, l3);
    } else if (stringBuilder.a() == 0L) {
      stringBuilder.i(this.e);
    } 
    if (this.f != -1L) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    long l2 = this.f;
    long l1 = stringBuilder.a();
    if (!this.d.c((i)stringBuilder, l2 - l1))
      b1 = 0; 
    return b1;
  }
  
  public void h(j paramj) {
    this.b = paramj;
    this.c = paramj.g(0, 1);
    paramj.f();
  }
  
  public void i(long paramLong1, long paramLong2) {
    b b1 = this.d;
    if (b1 != null)
      b1.a(paramLong2); 
  }
  
  private static final class a implements b {
    private static final int[] a = new int[] { 
        -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, 
        -1, -1, 2, 4, 6, 8 };
    
    private static final int[] b = new int[] { 
        7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 
        19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 
        50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 
        130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 
        337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 
        876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 
        2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 
        5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 
        15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
    
    private final j c;
    
    private final v d;
    
    private final c e;
    
    private final int f;
    
    private final byte[] g;
    
    private final v h;
    
    private final int i;
    
    private final Format j;
    
    private int k;
    
    private long l;
    
    private int m;
    
    private long n;
    
    public a(j param1j, v param1v, c param1c) {
      this.c = param1j;
      this.d = param1v;
      this.e = param1c;
      int i = Math.max(1, param1c.c / 10);
      this.i = i;
      v v1 = new v(param1c.g);
      v1.r();
      int k = v1.r();
      this.f = k;
      int m = param1c.b;
      int n = (param1c.e - m * 4) * 8 / param1c.f * m + 1;
      if (k == n) {
        n = h0.i(i, k);
        this.g = new byte[param1c.e * n];
        this.h = new v(n * h(k, m));
        this.j = Format.o(null, "audio/raw", null, param1c.c * param1c.e * 8 / k, h(i, m), param1c.b, param1c.c, 2, null, null, 0, null);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Expected frames per block: ");
      stringBuilder.append(n);
      stringBuilder.append("; got: ");
      stringBuilder.append(k);
      throw new ParserException(stringBuilder.toString());
    }
    
    private void d(byte[] param1ArrayOfbyte, int param1Int, v param1v) {
      for (byte b1 = 0; b1 < param1Int; b1++) {
        for (byte b2 = 0; b2 < this.e.b; b2++)
          e(param1ArrayOfbyte, b1, b2, param1v.a); 
      } 
      param1v.I(g(this.f * param1Int));
    }
    
    private void e(byte[] param1ArrayOfbyte1, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte2) {
      c c1 = this.e;
      int i = c1.e;
      int k = c1.b;
      int m = param1Int1 * i + param1Int2 * 4;
      int n = i / k;
      short s = (short)((param1ArrayOfbyte1[m + 1] & 0xFF) << 8 | param1ArrayOfbyte1[m] & 0xFF);
      int i1 = Math.min(param1ArrayOfbyte1[m + 2] & 0xFF, 88);
      int i2 = b[i1];
      i = (param1Int1 * this.f * k + param1Int2) * 2;
      param1ArrayOfbyte2[i] = (byte)(byte)(s & 0xFF);
      param1ArrayOfbyte2[i + 1] = (byte)(byte)(s >> 8);
      param1Int1 = 0;
      param1Int2 = i1;
      while (param1Int1 < (n - 4) * 2) {
        i1 = param1ArrayOfbyte1[param1Int1 / 8 * k * 4 + k * 4 + m + param1Int1 / 2 % 4] & 0xFF;
        if (param1Int1 % 2 == 0) {
          i1 &= 0xF;
        } else {
          i1 >>= 4;
        } 
        int i4 = ((i1 & 0x7) * 2 + 1) * i2 >> 3;
        i2 = i4;
        if ((i1 & 0x8) != 0)
          i2 = -i4; 
        int i3 = h0.n(s + i2, -32768, 32767);
        i += k * 2;
        param1ArrayOfbyte2[i] = (byte)(byte)(i3 & 0xFF);
        param1ArrayOfbyte2[i + 1] = (byte)(byte)(i3 >> 8);
        i2 = a[i1];
        int[] arrayOfInt = b;
        param1Int2 = h0.n(param1Int2 + i2, 0, arrayOfInt.length - 1);
        i2 = arrayOfInt[param1Int2];
        param1Int1++;
      } 
    }
    
    private int f(int param1Int) {
      return param1Int / this.e.b * 2;
    }
    
    private int g(int param1Int) {
      return h(param1Int, this.e.b);
    }
    
    private static int h(int param1Int1, int param1Int2) {
      return param1Int1 * 2 * param1Int2;
    }
    
    private void i(int param1Int) {
      long l1 = this.l;
      long l2 = h0.l0(this.n, 1000000L, this.e.c);
      int i = g(param1Int);
      int k = this.m;
      this.d.c(l1 + l2, 1, i, k - i, null);
      this.n += param1Int;
      this.m -= i;
    }
    
    public void a(long param1Long) {
      this.k = 0;
      this.l = param1Long;
      this.m = 0;
      this.n = 0L;
    }
    
    public void b(int param1Int, long param1Long) {
      this.c.a(new e(this.e, this.f, param1Int, param1Long));
      this.d.d(this.j);
    }
    
    public boolean c(i param1i, long param1Long) {
      int k = h0.i(this.i - f(this.m), this.f) * this.e.e;
      if (param1Long != 0L) {
        boolean bool1;
        for (bool1 = false;; bool1 = true) {
          if (!bool1) {
            int m = this.k;
            if (m < k) {
              m = (int)Math.min((k - m), param1Long);
              m = param1i.read(this.g, this.k, m);
              if (m != -1) {
                this.k += m;
                continue;
              } 
            } else {
              break;
            } 
          } else {
            break;
          } 
        } 
        k = this.k / this.e.e;
        if (k > 0) {
          d(this.g, k, this.h);
          this.k -= k * this.e.e;
          k = this.h.d();
          this.d.b(this.h, k);
          k = this.m + k;
          this.m = k;
          int m = f(k);
          k = this.i;
          if (m >= k)
            i(k); 
        } 
        if (bool1) {
          k = f(this.m);
          if (k > 0)
            i(k); 
        } 
        return bool1;
      } 
      boolean bool = true;
      continue;
    }
  }
  
  private static interface b {
    void a(long param1Long);
    
    void b(int param1Int, long param1Long);
    
    boolean c(i param1i, long param1Long);
  }
  
  private static final class c implements b {
    private final j a;
    
    private final v b;
    
    private final c c;
    
    private final Format d;
    
    private final int e;
    
    private long f;
    
    private int g;
    
    private long h;
    
    public c(j param1j, v param1v, c param1c, String param1String, int param1Int) {
      this.a = param1j;
      this.b = param1v;
      this.c = param1c;
      int i = param1c.b * param1c.f / 8;
      if (param1c.e == i) {
        int k = Math.max(i, param1c.c * i / 10);
        this.e = k;
        int m = param1c.c;
        this.d = Format.o(null, param1String, null, i * m * 8, k, param1c.b, m, param1Int, null, null, 0, null);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Expected block size: ");
      stringBuilder.append(i);
      stringBuilder.append("; got: ");
      stringBuilder.append(param1c.e);
      throw new ParserException(stringBuilder.toString());
    }
    
    public void a(long param1Long) {
      this.f = param1Long;
      this.g = 0;
      this.h = 0L;
    }
    
    public void b(int param1Int, long param1Long) {
      this.a.a(new e(this.c, 1, param1Int, param1Long));
      this.b.d(this.d);
    }
    
    public boolean c(i param1i, long param1Long) {
      if (param1Long != 0L) {
        boolean bool1;
        for (bool1 = false;; bool1 = true) {
          if (!bool1) {
            int n = this.g;
            int i1 = this.e;
            if (n < i1) {
              n = (int)Math.min((i1 - n), param1Long);
              n = this.b.a(param1i, n, true);
              if (n != -1) {
                this.g += n;
                continue;
              } 
            } else {
              break;
            } 
          } else {
            break;
          } 
        } 
        c c1 = this.c;
        int m = c1.e;
        int k = this.g / m;
        if (k > 0) {
          param1Long = this.f;
          long l = h0.l0(this.h, 1000000L, c1.c);
          int n = k * m;
          m = this.g - n;
          this.b.c(param1Long + l, 1, n, m, null);
          this.h += k;
          this.g = m;
        } 
        return bool1;
      } 
      boolean bool = true;
      continue;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/e0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */