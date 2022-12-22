package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzekl extends d32 {
  private static final Logger a = Logger.getLogger(zzekl.class.getName());
  
  private static final boolean b = m72.m();
  
  x32 c;
  
  private zzekl() {}
  
  public static int A0(int paramInt, long paramLong) {
    return g0(paramInt << 3) + T(X(paramLong));
  }
  
  public static int B0(int paramInt, long paramLong) {
    return g0(paramInt << 3) + 8;
  }
  
  public static int C0(int paramInt, long paramLong) {
    return g0(paramInt << 3) + 8;
  }
  
  public static zzekl D0(byte[] paramArrayOfbyte) {
    return new a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static int E0(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    return g0(i) + i;
  }
  
  public static int G(boolean paramBoolean) {
    return 1;
  }
  
  public static int H(int paramInt, double paramDouble) {
    return g0(paramInt << 3) + 8;
  }
  
  public static int I(int paramInt, zzejr paramzzejr) {
    paramInt = g0(paramInt << 3);
    int i = paramzzejr.size();
    return paramInt + g0(i) + i;
  }
  
  @Deprecated
  static int J(int paramInt, u52 paramu52, o62<u52> paramo62) {
    int i = g0(paramInt << 3);
    paramu52 = paramu52;
    int j = paramu52.e();
    paramInt = j;
    if (j == -1) {
      paramInt = paramo62.f(paramu52);
      paramu52.m(paramInt);
    } 
    return (i << 1) + paramInt;
  }
  
  public static int L(double paramDouble) {
    return 8;
  }
  
  public static int M(int paramInt, zzejr paramzzejr) {
    return (g0(8) << 1) + p(2, paramInt) + I(3, paramzzejr);
  }
  
  public static int S(long paramLong) {
    return T(paramLong);
  }
  
  public static int T(long paramLong) {
    if ((0xFFFFFFFFFFFFFF80L & paramLong) == 0L)
      return 1; 
    if (paramLong < 0L)
      return 10; 
    if ((0xFFFFFFF800000000L & paramLong) != 0L) {
      i = 6;
      paramLong >>>= 28L;
    } else {
      i = 2;
    } 
    int j = i;
    long l = paramLong;
    if ((0xFFFFFFFFFFE00000L & paramLong) != 0L) {
      j = i + 2;
      l = paramLong >>> 14L;
    } 
    int i = j;
    if ((l & 0xFFFFFFFFFFFFC000L) != 0L)
      i = j + 1; 
    return i;
  }
  
  public static int U(long paramLong) {
    return T(X(paramLong));
  }
  
  public static int V(long paramLong) {
    return 8;
  }
  
  public static int W(long paramLong) {
    return 8;
  }
  
  private static long X(long paramLong) {
    return paramLong >> 63L ^ paramLong << 1L;
  }
  
  public static int Y(float paramFloat) {
    return 4;
  }
  
  public static int c(int paramInt, z42 paramz42) {
    int i = g0(paramInt << 3);
    paramInt = paramz42.b();
    return i + g0(paramInt) + paramInt;
  }
  
  public static int d(z42 paramz42) {
    int i = paramz42.b();
    return g0(i) + i;
  }
  
  static int e(u52 paramu52, o62<u52> paramo62) {
    paramu52 = paramu52;
    int i = paramu52.e();
    int j = i;
    if (i == -1) {
      j = paramo62.f(paramu52);
      paramu52.m(j);
    } 
    return g0(j) + j;
  }
  
  public static int e0(int paramInt) {
    return g0(paramInt << 3);
  }
  
  public static int f0(int paramInt) {
    return (paramInt >= 0) ? g0(paramInt) : 10;
  }
  
  public static int g0(int paramInt) {
    return ((paramInt & 0xFFFFFF80) == 0) ? 1 : (((paramInt & 0xFFFFC000) == 0) ? 2 : (((0xFFE00000 & paramInt) == 0) ? 3 : (((paramInt & 0xF0000000) == 0) ? 4 : 5)));
  }
  
  public static int h0(int paramInt) {
    return g0(n0(paramInt));
  }
  
  public static int i0(int paramInt) {
    return 4;
  }
  
  public static int j0(u52 paramu52) {
    int i = paramu52.b();
    return g0(i) + i;
  }
  
  public static int l0(int paramInt) {
    return 4;
  }
  
  public static int m0(int paramInt) {
    return f0(paramInt);
  }
  
  private static int n0(int paramInt) {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public static int o(int paramInt1, int paramInt2) {
    return g0(paramInt1 << 3) + f0(paramInt2);
  }
  
  @Deprecated
  public static int o0(int paramInt) {
    return g0(paramInt);
  }
  
  public static int p(int paramInt1, int paramInt2) {
    return g0(paramInt1 << 3) + g0(paramInt2);
  }
  
  public static int q(int paramInt1, int paramInt2) {
    return g0(paramInt1 << 3) + g0(n0(paramInt2));
  }
  
  public static int q0(int paramInt, boolean paramBoolean) {
    return g0(paramInt << 3) + 1;
  }
  
  @Deprecated
  public static int r0(u52 paramu52) {
    return paramu52.b();
  }
  
  public static int s(int paramInt1, int paramInt2) {
    return g0(paramInt1 << 3) + 4;
  }
  
  public static int t(zzejr paramzzejr) {
    int i = paramzzejr.size();
    return g0(i) + i;
  }
  
  public static int u(int paramInt1, int paramInt2) {
    return g0(paramInt1 << 3) + 4;
  }
  
  public static int u0(String paramString) {
    int i;
    try {
      i = p72.e(paramString);
    } catch (zzeon zzeon) {
      i = (paramString.getBytes(m42.a)).length;
    } 
    return g0(i) + i;
  }
  
  public static int v(int paramInt1, int paramInt2) {
    return g0(paramInt1 << 3) + f0(paramInt2);
  }
  
  public static int v0(int paramInt, String paramString) {
    return g0(paramInt << 3) + u0(paramString);
  }
  
  public static int w(int paramInt, float paramFloat) {
    return g0(paramInt << 3) + 4;
  }
  
  public static int x(int paramInt, z42 paramz42) {
    return (g0(8) << 1) + p(2, paramInt) + c(3, paramz42);
  }
  
  public static int y(int paramInt, u52 paramu52) {
    return (g0(8) << 1) + p(2, paramInt) + g0(24) + j0(paramu52);
  }
  
  public static int y0(int paramInt, long paramLong) {
    return g0(paramInt << 3) + T(paramLong);
  }
  
  static int z(int paramInt, u52 paramu52, o62 paramo62) {
    return g0(paramInt << 3) + e(paramu52, paramo62);
  }
  
  public static int z0(int paramInt, long paramLong) {
    return g0(paramInt << 3) + T(paramLong);
  }
  
  public final void A(int paramInt, double paramDouble) {
    x0(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public abstract void B(int paramInt, zzejr paramzzejr);
  
  public abstract int C();
  
  public final void D() {
    if (C() == 0)
      return; 
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public final void F(boolean paramBoolean) {
    N((byte)paramBoolean);
  }
  
  public final void K(double paramDouble) {
    R(Double.doubleToRawLongBits(paramDouble));
  }
  
  public abstract void N(byte paramByte);
  
  public final void O(float paramFloat) {
    d0(Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void P(long paramLong);
  
  public final void Q(long paramLong) {
    P(X(paramLong));
  }
  
  public abstract void R(long paramLong);
  
  public abstract void Z(u52 paramu52);
  
  public abstract void a0(int paramInt);
  
  public abstract void b(int paramInt1, int paramInt2);
  
  public abstract void b0(int paramInt);
  
  public final void c0(int paramInt) {
    b0(n0(paramInt));
  }
  
  public abstract void d0(int paramInt);
  
  public final void f(int paramInt, float paramFloat) {
    n(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void g(int paramInt, zzejr paramzzejr);
  
  public abstract void h(int paramInt, u52 paramu52);
  
  abstract void i(int paramInt, u52 paramu52, o62 paramo62);
  
  final void j(String paramString, zzeon paramzzeon) {
    a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramzzeon);
    byte[] arrayOfByte = paramString.getBytes(m42.a);
    try {
      b0(arrayOfByte.length);
      a(arrayOfByte, 0, arrayOfByte.length);
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new zza(indexOutOfBoundsException);
    } catch (zza zza) {
      throw zza;
    } 
  }
  
  public abstract void k(int paramInt1, int paramInt2);
  
  public abstract void k0(int paramInt, boolean paramBoolean);
  
  public abstract void l(int paramInt1, int paramInt2);
  
  public final void m(int paramInt1, int paramInt2) {
    l(paramInt1, n0(paramInt2));
  }
  
  public abstract void n(int paramInt1, int paramInt2);
  
  public abstract void p0(String paramString);
  
  public abstract void r(zzejr paramzzejr);
  
  public abstract void s0(int paramInt, long paramLong);
  
  public abstract void t0(int paramInt, String paramString);
  
  public final void w0(int paramInt, long paramLong) {
    s0(paramInt, X(paramLong));
  }
  
  public abstract void x0(int paramInt, long paramLong);
  
  private static final class a extends zzekl {
    private final byte[] d;
    
    private final int e;
    
    private final int f;
    
    private int g;
    
    a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      super(null);
      if (param1ArrayOfbyte != null) {
        if ((param1Int2 | 0x0 | param1ArrayOfbyte.length - param1Int2) >= 0) {
          this.d = param1ArrayOfbyte;
          this.e = 0;
          this.g = 0;
          this.f = param1Int2;
          return;
        } 
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(param1ArrayOfbyte.length), Integer.valueOf(0), Integer.valueOf(param1Int2) }));
      } 
      throw new NullPointerException("buffer");
    }
    
    private final void F0(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      try {
        System.arraycopy(param1ArrayOfbyte, param1Int1, this.d, this.g, param1Int2);
        this.g += param1Int2;
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new zzekl.zza(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(param1Int2) }), indexOutOfBoundsException);
      } 
    }
    
    public final void B(int param1Int, zzejr param1zzejr) {
      super.b(1, 3);
      super.l(2, param1Int);
      super.g(3, param1zzejr);
      super.b(1, 4);
    }
    
    public final int C() {
      return this.f - this.g;
    }
    
    public final void N(byte param1Byte) {
      try {
        byte[] arrayOfByte = this.d;
        int i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)param1Byte;
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new zzekl.zza(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
      } 
    }
    
    public final void P(long param1Long) {
      long l = param1Long;
      if (zzekl.E()) {
        l = param1Long;
        if (super.C() >= 10)
          while (true) {
            if ((param1Long & 0xFFFFFFFFFFFFFF80L) == 0L) {
              byte[] arrayOfByte1 = this.d;
              int j = this.g;
              this.g = j + 1;
              m72.h(arrayOfByte1, j, (byte)(int)param1Long);
              return;
            } 
            byte[] arrayOfByte = this.d;
            int i = this.g;
            this.g = i + 1;
            m72.h(arrayOfByte, i, (byte)((int)param1Long & 0x7F | 0x80));
            param1Long >>>= 7L;
          }  
      } 
      while (true) {
        if ((l & 0xFFFFFFFFFFFFFF80L) == 0L)
          try {
            byte[] arrayOfByte1 = this.d;
            int j = this.g;
            this.g = j + 1;
            arrayOfByte1[j] = (byte)(byte)(int)l;
            return;
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            zzekl.zza zza = new zzekl.zza(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
            throw zza;
          }  
        byte[] arrayOfByte = this.d;
        int i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(byte)((int)l & 0x7F | 0x80);
        l >>>= 7L;
      } 
    }
    
    public final void R(long param1Long) {
      try {
        byte[] arrayOfByte = this.d;
        int i = this.g;
        int j = i + 1;
        this.g = j;
        arrayOfByte[i] = (byte)(byte)(int)param1Long;
        i = j + 1;
        this.g = i;
        arrayOfByte[j] = (byte)(byte)(int)(param1Long >> 8L);
        j = i + 1;
        this.g = j;
        arrayOfByte[i] = (byte)(byte)(int)(param1Long >> 16L);
        i = j + 1;
        this.g = i;
        arrayOfByte[j] = (byte)(byte)(int)(param1Long >> 24L);
        int k = i + 1;
        this.g = k;
        arrayOfByte[i] = (byte)(byte)(int)(param1Long >> 32L);
        j = k + 1;
        this.g = j;
        arrayOfByte[k] = (byte)(byte)(int)(param1Long >> 40L);
        i = j + 1;
        this.g = i;
        arrayOfByte[j] = (byte)(byte)(int)(param1Long >> 48L);
        this.g = i + 1;
        arrayOfByte[i] = (byte)(byte)(int)(param1Long >> 56L);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new zzekl.zza(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
      } 
    }
    
    public final void Z(u52 param1u52) {
      super.b0(param1u52.b());
      param1u52.i(this);
    }
    
    public final void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      F0(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public final void a0(int param1Int) {
      if (param1Int >= 0) {
        super.b0(param1Int);
        return;
      } 
      super.P(param1Int);
    }
    
    public final void b(int param1Int1, int param1Int2) {
      super.b0(param1Int1 << 3 | param1Int2);
    }
    
    public final void b0(int param1Int) {
      int i = param1Int;
      if (zzekl.E()) {
        i = param1Int;
        if (!z22.a()) {
          i = param1Int;
          if (super.C() >= 5) {
            if ((param1Int & 0xFFFFFF80) == 0) {
              byte[] arrayOfByte1 = this.d;
              i = this.g;
              this.g = i + 1;
              m72.h(arrayOfByte1, i, (byte)param1Int);
              return;
            } 
            byte[] arrayOfByte = this.d;
            i = this.g;
            this.g = i + 1;
            m72.h(arrayOfByte, i, (byte)(param1Int | 0x80));
            param1Int >>>= 7;
            if ((param1Int & 0xFFFFFF80) == 0) {
              arrayOfByte = this.d;
              i = this.g;
              this.g = i + 1;
              m72.h(arrayOfByte, i, (byte)param1Int);
              return;
            } 
            arrayOfByte = this.d;
            i = this.g;
            this.g = i + 1;
            m72.h(arrayOfByte, i, (byte)(param1Int | 0x80));
            param1Int >>>= 7;
            if ((param1Int & 0xFFFFFF80) == 0) {
              arrayOfByte = this.d;
              i = this.g;
              this.g = i + 1;
              m72.h(arrayOfByte, i, (byte)param1Int);
              return;
            } 
            arrayOfByte = this.d;
            i = this.g;
            this.g = i + 1;
            m72.h(arrayOfByte, i, (byte)(param1Int | 0x80));
            param1Int >>>= 7;
            if ((param1Int & 0xFFFFFF80) == 0) {
              arrayOfByte = this.d;
              i = this.g;
              this.g = i + 1;
              m72.h(arrayOfByte, i, (byte)param1Int);
              return;
            } 
            arrayOfByte = this.d;
            i = this.g;
            this.g = i + 1;
            m72.h(arrayOfByte, i, (byte)(param1Int | 0x80));
            arrayOfByte = this.d;
            i = this.g;
            this.g = i + 1;
            m72.h(arrayOfByte, i, (byte)(param1Int >>> 7));
            return;
          } 
        } 
      } 
      while (true) {
        if ((i & 0xFFFFFF80) == 0)
          try {
            byte[] arrayOfByte1 = this.d;
            param1Int = this.g;
            this.g = param1Int + 1;
            arrayOfByte1[param1Int] = (byte)(byte)i;
            return;
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            zzekl.zza zza = new zzekl.zza(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
            throw zza;
          }  
        byte[] arrayOfByte = this.d;
        param1Int = this.g;
        this.g = param1Int + 1;
        arrayOfByte[param1Int] = (byte)(byte)(i & 0x7F | 0x80);
        i >>>= 7;
      } 
    }
    
    public final void d0(int param1Int) {
      try {
        byte[] arrayOfByte = this.d;
        int i = this.g;
        int j = i + 1;
        this.g = j;
        arrayOfByte[i] = (byte)(byte)param1Int;
        i = j + 1;
        this.g = i;
        arrayOfByte[j] = (byte)(byte)(param1Int >> 8);
        j = i + 1;
        this.g = j;
        arrayOfByte[i] = (byte)(byte)(param1Int >> 16);
        this.g = j + 1;
        arrayOfByte[j] = (byte)(byte)(param1Int >>> 24);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new zzekl.zza(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
      } 
    }
    
    public final void g(int param1Int, zzejr param1zzejr) {
      super.b(param1Int, 2);
      super.r(param1zzejr);
    }
    
    public final void h(int param1Int, u52 param1u52) {
      super.b(1, 3);
      super.l(2, param1Int);
      super.b(3, 2);
      super.Z(param1u52);
      super.b(1, 4);
    }
    
    final void i(int param1Int, u52 param1u52, o62<w22> param1o62) {
      super.b(param1Int, 2);
      w22 w22 = (w22)param1u52;
      int i = w22.e();
      param1Int = i;
      if (i == -1) {
        param1Int = param1o62.f(w22);
        w22.m(param1Int);
      } 
      super.b0(param1Int);
      param1o62.b(param1u52, this.c);
    }
    
    public final void k(int param1Int1, int param1Int2) {
      super.b(param1Int1, 0);
      super.a0(param1Int2);
    }
    
    public final void k0(int param1Int, boolean param1Boolean) {
      super.b(param1Int, 0);
      super.N((byte)param1Boolean);
    }
    
    public final void l(int param1Int1, int param1Int2) {
      super.b(param1Int1, 0);
      super.b0(param1Int2);
    }
    
    public final void n(int param1Int1, int param1Int2) {
      super.b(param1Int1, 5);
      super.d0(param1Int2);
    }
    
    public final void p0(String param1String) {
      int i = this.g;
      try {
        int j = zzekl.g0(param1String.length() * 3);
        int k = zzekl.g0(param1String.length());
        if (k == j) {
          j = i + k;
          this.g = j;
          j = p72.a(param1String, this.d, j, super.C());
          this.g = i;
          super.b0(j - i - k);
          this.g = j;
          return;
        } 
        super.b0(p72.e(param1String));
        this.g = p72.a(param1String, this.d, this.g, super.C());
        return;
      } catch (zzeon zzeon) {
        this.g = i;
        j(param1String, zzeon);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new zzekl.zza(indexOutOfBoundsException);
      } 
    }
    
    public final void r(zzejr param1zzejr) {
      super.b0(param1zzejr.size());
      param1zzejr.zza(this);
    }
    
    public final void s0(int param1Int, long param1Long) {
      super.b(param1Int, 0);
      super.P(param1Long);
    }
    
    public final void t0(int param1Int, String param1String) {
      super.b(param1Int, 2);
      super.p0(param1String);
    }
    
    public final void x0(int param1Int, long param1Long) {
      super.b(param1Int, 1);
      super.R(param1Long);
    }
  }
  
  public static final class zza extends IOException {
    zza() {
      super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
    
    zza(String param1String, Throwable param1Throwable) {
      super(param1String, param1Throwable);
    }
    
    zza(Throwable param1Throwable) {
      super("CodedOutputStream was writing to a flat byte array and ran out of space.", param1Throwable);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzekl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */