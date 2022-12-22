package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class q32 extends o32 {
  private final byte[] f;
  
  private final boolean g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m = Integer.MAX_VALUE;
  
  private q32(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(null);
    this.f = paramArrayOfbyte;
    this.h = paramInt2 + paramInt1;
    this.j = paramInt1;
    this.k = paramInt1;
    this.g = paramBoolean;
  }
  
  private final int C() {
    int i = this.j;
    int j = this.h;
    if (j != i) {
      byte[] arrayOfByte = this.f;
      int k = i + 1;
      i = arrayOfByte[i];
      if (i >= 0) {
        this.j = k;
        return i;
      } 
      if (j - k >= 9) {
        j = k + 1;
        i ^= arrayOfByte[k] << 7;
        if (i < 0) {
          k = i ^ 0xFFFFFF80;
        } else {
          k = j + 1;
          i ^= arrayOfByte[j] << 14;
          if (i >= 0) {
            i ^= 0x3F80;
            j = k;
            k = i;
          } else {
            j = k + 1;
            k = i ^ arrayOfByte[k] << 21;
            if (k < 0) {
              k ^= 0xFFE03F80;
            } else {
              int m = j + 1;
              byte b = arrayOfByte[j];
              i = k ^ b << 28 ^ 0xFE03F80;
              k = i;
              j = m;
              if (b < 0) {
                int n = m + 1;
                k = i;
                j = n;
                if (arrayOfByte[m] < 0) {
                  m = n + 1;
                  k = i;
                  j = m;
                  if (arrayOfByte[n] < 0) {
                    n = m + 1;
                    k = i;
                    j = n;
                    if (arrayOfByte[m] < 0) {
                      m = n + 1;
                      k = i;
                      j = m;
                      if (arrayOfByte[n] < 0) {
                        j = m + 1;
                        if (arrayOfByte[m] >= 0) {
                          k = i;
                          this.j = j;
                          return k;
                        } 
                      } else {
                        this.j = j;
                        return k;
                      } 
                    } else {
                      this.j = j;
                      return k;
                    } 
                  } else {
                    this.j = j;
                    return k;
                  } 
                } else {
                  this.j = j;
                  return k;
                } 
              } else {
                this.j = j;
                return k;
              } 
              return (int)super.t();
            } 
          } 
        } 
        this.j = j;
        return k;
      } 
    } 
    return (int)super.t();
  }
  
  private final long D() {
    int k;
    int i = this.j;
    int j = this.h;
    if (j != i) {
      byte[] arrayOfByte = this.f;
      k = i + 1;
      i = arrayOfByte[i];
      if (i >= 0) {
        this.j = k;
        return i;
      } 
      if (j - k >= 9) {
        j = k + 1;
        i ^= arrayOfByte[k] << 7;
        if (i < 0) {
          k = i ^ 0xFFFFFF80;
        } else {
          long l1;
          k = j + 1;
          i ^= arrayOfByte[j] << 14;
          if (i >= 0) {
            l1 = (i ^ 0x3F80);
            j = k;
          } else {
            j = k + 1;
            k = i ^ arrayOfByte[k] << 21;
            if (k < 0) {
              k ^= 0xFFE03F80;
            } else {
              long l3;
              long l2 = k;
              k = j + 1;
              l2 ^= arrayOfByte[j] << 28L;
              if (l2 >= 0L) {
                l3 = 266354560L;
                j = k;
              } else {
                j = k + 1;
                l3 = l2 ^ arrayOfByte[k] << 35L;
                if (l3 < 0L) {
                  l2 = -34093383808L;
                } else {
                  k = j + 1;
                  l2 = l3 ^ arrayOfByte[j] << 42L;
                  if (l2 >= 0L) {
                    l3 = 4363953127296L;
                    j = k;
                  } else {
                    j = k + 1;
                    l3 = l2 ^ arrayOfByte[k] << 49L;
                    if (l3 < 0L) {
                      l2 = -558586000294016L;
                    } else {
                      k = j + 1;
                      l2 = l3 ^ arrayOfByte[j] << 56L ^ 0xFE03F80FE03F80L;
                      if (l2 < 0L) {
                        j = k + 1;
                        if (arrayOfByte[k] >= 0L) {
                          this.j = j;
                          return l2;
                        } 
                      } else {
                        j = k;
                        this.j = j;
                        return l2;
                      } 
                      return super.t();
                    } 
                    l2 = l3 ^ l2;
                  } 
                  l2 = l3 ^ l2;
                } 
                l2 = l3 ^ l2;
              } 
              l2 = l3 ^ l2;
            } 
            l1 = k;
          } 
          this.j = j;
          return l1;
        } 
      } else {
        return super.t();
      } 
    } else {
      return super.t();
    } 
    long l = k;
  }
  
  private final int E() {
    int i = this.j;
    if (this.h - i >= 4) {
      byte[] arrayOfByte = this.f;
      this.j = i + 4;
      byte b1 = arrayOfByte[i];
      byte b2 = arrayOfByte[i + 1];
      byte b3 = arrayOfByte[i + 2];
      return (arrayOfByte[i + 3] & 0xFF) << 24 | b1 & 0xFF | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16;
    } 
    throw zzelo.zzbja();
  }
  
  private final long F() {
    int i = this.j;
    if (this.h - i >= 8) {
      byte[] arrayOfByte = this.f;
      this.j = i + 8;
      long l1 = arrayOfByte[i];
      long l2 = arrayOfByte[i + 1];
      long l3 = arrayOfByte[i + 2];
      long l4 = arrayOfByte[i + 3];
      long l5 = arrayOfByte[i + 4];
      long l6 = arrayOfByte[i + 5];
      long l7 = arrayOfByte[i + 6];
      return (arrayOfByte[i + 7] & 0xFFL) << 56L | l1 & 0xFFL | (l2 & 0xFFL) << 8L | (l3 & 0xFFL) << 16L | (l4 & 0xFFL) << 24L | (l5 & 0xFFL) << 32L | (l6 & 0xFFL) << 40L | (l7 & 0xFFL) << 48L;
    } 
    throw zzelo.zzbja();
  }
  
  private final void G() {
    int i = this.h + this.i;
    this.h = i;
    int j = i - this.k;
    int k = this.m;
    if (j > k) {
      j -= k;
      this.i = j;
      this.h = i - j;
      return;
    } 
    this.i = 0;
  }
  
  private final byte H() {
    int i = this.j;
    if (i != this.h) {
      byte[] arrayOfByte = this.f;
      this.j = i + 1;
      return arrayOfByte[i];
    } 
    throw zzelo.zzbja();
  }
  
  private final void I(int paramInt) {
    if (paramInt >= 0) {
      int i = this.h;
      int j = this.j;
      if (paramInt <= i - j) {
        this.j = j + paramInt;
        return;
      } 
    } 
    if (paramInt < 0)
      throw zzelo.zzbjb(); 
    throw zzelo.zzbja();
  }
  
  public final void A(int paramInt) {
    this.m = paramInt;
    G();
  }
  
  public final double a() {
    return Double.longBitsToDouble(F());
  }
  
  public final float b() {
    return Float.intBitsToFloat(E());
  }
  
  public final String c() {
    int i = C();
    if (i > 0 && i <= this.h - this.j) {
      String str = new String(this.f, this.j, i, m42.a);
      this.j += i;
      return str;
    } 
    if (i == 0)
      return ""; 
    if (i < 0)
      throw zzelo.zzbjb(); 
    throw zzelo.zzbja();
  }
  
  public final int e() {
    if (super.u()) {
      this.l = 0;
      return 0;
    } 
    int i = C();
    this.l = i;
    if (i >>> 3 != 0)
      return i; 
    throw zzelo.zzbjd();
  }
  
  public final long f() {
    return D();
  }
  
  public final long g() {
    return D();
  }
  
  public final int h() {
    return C();
  }
  
  public final long i() {
    return F();
  }
  
  public final int j() {
    return E();
  }
  
  public final boolean k() {
    return (D() != 0L);
  }
  
  public final String l() {
    int i = C();
    if (i > 0) {
      int j = this.h;
      int k = this.j;
      if (i <= j - k) {
        String str = p72.l(this.f, k, i);
        this.j += i;
        return str;
      } 
    } 
    if (i == 0)
      return ""; 
    if (i <= 0)
      throw zzelo.zzbjb(); 
    throw zzelo.zzbja();
  }
  
  public final zzejr m() {
    int i = C();
    if (i > 0) {
      int j = this.h;
      int k = this.j;
      if (i <= j - k) {
        zzejr zzejr = zzejr.zzi(this.f, k, i);
        this.j += i;
        return zzejr;
      } 
    } 
    if (i == 0)
      return zzejr.b; 
    if (i > 0) {
      int k = this.h;
      int j = this.j;
      if (i <= k - j) {
        i += j;
        this.j = i;
        byte[] arrayOfByte = Arrays.copyOfRange(this.f, j, i);
        return zzejr.zzu(arrayOfByte);
      } 
    } 
    if (i <= 0) {
      if (i == 0) {
        byte[] arrayOfByte = m42.c;
        return zzejr.zzu(arrayOfByte);
      } 
      throw zzelo.zzbjb();
    } 
    throw zzelo.zzbja();
  }
  
  public final int n() {
    return C();
  }
  
  public final int o() {
    return C();
  }
  
  public final int p() {
    return E();
  }
  
  public final long q() {
    return F();
  }
  
  public final int r() {
    return o32.B(C());
  }
  
  public final long s() {
    return o32.w(D());
  }
  
  final long t() {
    long l = 0L;
    for (byte b = 0; b < 64; b += 7) {
      byte b1 = H();
      l |= (b1 & Byte.MAX_VALUE) << b;
      if ((b1 & 0x80) == 0)
        return l; 
    } 
    zzelo zzelo = zzelo.zzbjc();
    throw zzelo;
  }
  
  public final boolean u() {
    return (this.j == this.h);
  }
  
  public final int v() {
    return this.j - this.k;
  }
  
  public final void x(int paramInt) {
    if (this.l == paramInt)
      return; 
    throw zzelo.zzbje();
  }
  
  public final boolean y(int paramInt) {
    int i = paramInt & 0x7;
    boolean bool = false;
    int j = 0;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5) {
                I(4);
                return true;
              } 
              throw zzelo.zzbjf();
            } 
            return false;
          } 
          do {
            j = super.e();
          } while (j != 0 && super.y(j));
          super.x(paramInt >>> 3 << 3 | 0x4);
          return true;
        } 
        I(C());
        return true;
      } 
      I(8);
      return true;
    } 
    paramInt = bool;
    if (this.h - this.j >= 10) {
      paramInt = j;
      while (paramInt < 10) {
        byte[] arrayOfByte = this.f;
        j = this.j;
        this.j = j + 1;
        if (arrayOfByte[j] < 0) {
          paramInt++;
          continue;
        } 
        return true;
      } 
      throw zzelo.zzbjc();
    } 
    while (paramInt < 10) {
      if (H() < 0) {
        paramInt++;
        continue;
      } 
      return true;
    } 
    zzelo zzelo = zzelo.zzbjc();
    throw zzelo;
  }
  
  public final int z(int paramInt) {
    if (paramInt >= 0) {
      paramInt += super.v();
      int i = this.m;
      if (paramInt <= i) {
        this.m = paramInt;
        G();
        return i;
      } 
      throw zzelo.zzbja();
    } 
    throw zzelo.zzbjb();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */