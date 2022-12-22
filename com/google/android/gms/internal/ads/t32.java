package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class t32 extends o32 {
  private final InputStream f;
  
  private final byte[] g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m = Integer.MAX_VALUE;
  
  private s32 n = null;
  
  private t32(InputStream paramInputStream, int paramInt) {
    super(null);
    m42.d(paramInputStream, "input");
    this.f = paramInputStream;
    this.g = new byte[4096];
    this.h = 0;
    this.j = 0;
    this.l = 0;
  }
  
  private final int C() {
    int i = this.j;
    int j = this.h;
    if (j != i) {
      byte[] arrayOfByte = this.g;
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
                  int i1 = n + 1;
                  k = i;
                  j = i1;
                  if (arrayOfByte[n] < 0) {
                    m = i1 + 1;
                    k = i;
                    j = m;
                    if (arrayOfByte[i1] < 0) {
                      n = m + 1;
                      k = i;
                      j = n;
                      if (arrayOfByte[m] < 0) {
                        j = n + 1;
                        if (arrayOfByte[n] >= 0) {
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
      byte[] arrayOfByte = this.g;
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
              long l2 = k;
              k = j + 1;
              long l3 = l2 ^ arrayOfByte[j] << 28L;
              if (l3 >= 0L) {
                l2 = 266354560L;
                j = k;
              } else {
                j = k + 1;
                l2 = l3 ^ arrayOfByte[k] << 35L;
                if (l2 < 0L) {
                  l3 = -34093383808L;
                } else {
                  i = j + 1;
                  l3 = l2 ^ arrayOfByte[j] << 42L;
                  if (l3 >= 0L) {
                    l2 = 4363953127296L;
                    j = i;
                  } else {
                    k = i + 1;
                    l2 = l3 ^ arrayOfByte[i] << 49L;
                    if (l2 < 0L) {
                      l3 = -558586000294016L;
                      j = k;
                    } else {
                      j = k + 1;
                      l2 = l2 ^ arrayOfByte[k] << 56L ^ 0xFE03F80FE03F80L;
                      if (l2 < 0L) {
                        k = j + 1;
                        if (arrayOfByte[j] >= 0L) {
                          j = k;
                          this.j = j;
                          return l2;
                        } 
                      } else {
                        this.j = j;
                        return l2;
                      } 
                      return super.t();
                    } 
                    l2 ^= l3;
                  } 
                  l2 ^= l3;
                } 
                l2 ^= l3;
              } 
              l2 ^= l3;
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
    int j = i;
    if (this.h - i < 4) {
      K(4);
      j = this.j;
    } 
    byte[] arrayOfByte = this.g;
    this.j = j + 4;
    byte b1 = arrayOfByte[j];
    i = arrayOfByte[j + 1];
    byte b2 = arrayOfByte[j + 2];
    return (arrayOfByte[j + 3] & 0xFF) << 24 | b1 & 0xFF | (i & 0xFF) << 8 | (b2 & 0xFF) << 16;
  }
  
  private final long F() {
    int i = this.j;
    int j = i;
    if (this.h - i < 8) {
      K(8);
      j = this.j;
    } 
    byte[] arrayOfByte = this.g;
    this.j = j + 8;
    long l1 = arrayOfByte[j];
    long l2 = arrayOfByte[j + 1];
    long l3 = arrayOfByte[j + 2];
    long l4 = arrayOfByte[j + 3];
    long l5 = arrayOfByte[j + 4];
    long l6 = arrayOfByte[j + 5];
    long l7 = arrayOfByte[j + 6];
    return (arrayOfByte[j + 7] & 0xFFL) << 56L | l1 & 0xFFL | (l2 & 0xFFL) << 8L | (l3 & 0xFFL) << 16L | (l4 & 0xFFL) << 24L | (l5 & 0xFFL) << 32L | (l6 & 0xFFL) << 40L | (l7 & 0xFFL) << 48L;
  }
  
  private final void G() {
    int i = this.h + this.i;
    this.h = i;
    int j = this.l + i;
    int k = this.m;
    if (j > k) {
      k = j - k;
      this.i = k;
      this.h = i - k;
      return;
    } 
    this.i = 0;
  }
  
  private final byte H() {
    if (this.j == this.h)
      K(1); 
    byte[] arrayOfByte = this.g;
    int i = this.j;
    this.j = i + 1;
    return arrayOfByte[i];
  }
  
  private final byte[] I(int paramInt, boolean paramBoolean) {
    byte[] arrayOfByte = M(paramInt);
    if (arrayOfByte != null)
      return arrayOfByte; 
    int i = this.j;
    int j = this.h;
    int k = j - i;
    this.l += j;
    this.j = 0;
    this.h = 0;
    List<byte[]> list = N(paramInt - k);
    arrayOfByte = new byte[paramInt];
    System.arraycopy(this.g, i, arrayOfByte, 0, k);
    Iterator<byte> iterator = list.iterator();
    for (paramInt = k; iterator.hasNext(); paramInt += arrayOfByte1.length) {
      byte[] arrayOfByte1 = (byte[])iterator.next();
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, paramInt, arrayOfByte1.length);
    } 
    return arrayOfByte;
  }
  
  private final void J(int paramInt) {
    int i = this.h;
    int j = this.j;
    if (paramInt <= i - j && paramInt >= 0) {
      this.j = j + paramInt;
      return;
    } 
    if (paramInt >= 0) {
      int k = this.l;
      int m = this.m;
      if (k + j + paramInt <= m) {
        this.l = k + j;
        j = i - j;
        this.h = 0;
        this.j = 0;
        while (j < paramInt) {
          try {
            InputStream inputStream = this.f;
            long l1 = (paramInt - j);
            long l2 = inputStream.skip(l1);
            if (l2 >= 0L && l2 <= l1) {
              if (l2 != 0L) {
                j += (int)l2;
                continue;
              } 
              break;
            } 
            IllegalStateException illegalStateException = new IllegalStateException();
            String str = String.valueOf(this.f.getClass());
            paramInt = str.length();
            StringBuilder stringBuilder = new StringBuilder();
            this(paramInt + 92);
            stringBuilder.append(str);
            stringBuilder.append("#skip returned invalid result: ");
            stringBuilder.append(l2);
            stringBuilder.append("\nThe InputStream implementation is buggy.");
            this(stringBuilder.toString());
            throw illegalStateException;
          } finally {
            this.l += j;
            G();
          } 
        } 
        this.l += j;
        G();
        if (j < paramInt) {
          k = this.h;
          j = k - this.j;
          this.j = k;
          K(1);
          while (true) {
            m = paramInt - j;
            k = this.h;
            if (m > k) {
              j += k;
              this.j = k;
              K(1);
              continue;
            } 
            this.j = m;
            break;
          } 
        } 
        return;
      } 
      J(m - k - j);
      throw zzelo.zzbja();
    } 
    zzelo zzelo = zzelo.zzbjb();
    throw zzelo;
  }
  
  private final void K(int paramInt) {
    if (!L(paramInt)) {
      if (paramInt > this.c - this.l - this.j)
        throw zzelo.zzbjg(); 
      throw zzelo.zzbja();
    } 
  }
  
  private final boolean L(int paramInt) {
    while (true) {
      int i = this.j;
      int j = this.h;
      if (i + paramInt > j) {
        int k = this.c;
        int m = this.l;
        if (paramInt > k - m - i)
          return false; 
        if (m + i + paramInt > this.m)
          return false; 
        if (i > 0) {
          if (j > i) {
            byte[] arrayOfByte1 = this.g;
            System.arraycopy(arrayOfByte1, i, arrayOfByte1, 0, j - i);
          } 
          this.l += i;
          this.h -= i;
          this.j = 0;
        } 
        InputStream inputStream = this.f;
        byte[] arrayOfByte = this.g;
        k = this.h;
        k = inputStream.read(arrayOfByte, k, Math.min(arrayOfByte.length - k, this.c - this.l - k));
        if (k != 0) {
          if (k >= -1) {
            if (k <= this.g.length) {
              if (k > 0) {
                this.h += k;
                G();
                if (this.h >= paramInt)
                  return true; 
                continue;
              } 
              return false;
            } 
            continue;
          } 
          continue;
        } 
        String str = String.valueOf(this.f.getClass());
        StringBuilder stringBuilder1 = new StringBuilder(str.length() + 91);
        stringBuilder1.append(str);
        stringBuilder1.append("#read(byte[]) returned invalid result: ");
        stringBuilder1.append(k);
        stringBuilder1.append("\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder(77);
      stringBuilder.append("refillBuffer() called when ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" bytes were already available in buffer");
      IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
      throw illegalStateException;
    } 
  }
  
  private final byte[] M(int paramInt) {
    if (paramInt == 0)
      return m42.c; 
    if (paramInt >= 0) {
      int i = this.l;
      int j = this.j;
      int k = i + j + paramInt;
      if (k - this.c <= 0) {
        int m = this.m;
        if (k <= m) {
          k = this.h - j;
          j = paramInt - k;
          if (j < 4096 || j <= this.f.available()) {
            byte[] arrayOfByte = new byte[paramInt];
            System.arraycopy(this.g, this.j, arrayOfByte, 0, k);
            this.l += this.h;
            this.j = 0;
            this.h = 0;
            while (k < paramInt) {
              j = this.f.read(arrayOfByte, k, paramInt - k);
              if (j != -1) {
                this.l += j;
                k += j;
                continue;
              } 
              throw zzelo.zzbja();
            } 
            return arrayOfByte;
          } 
          return null;
        } 
        J(m - i - j);
        throw zzelo.zzbja();
      } 
      throw zzelo.zzbjg();
    } 
    zzelo zzelo = zzelo.zzbjb();
    throw zzelo;
  }
  
  private final List<byte[]> N(int paramInt) {
    ArrayList<byte[]> arrayList = new ArrayList();
    while (paramInt > 0) {
      int i = Math.min(paramInt, 4096);
      byte[] arrayOfByte = new byte[i];
      int j = 0;
      while (j < i) {
        int k = this.f.read(arrayOfByte, j, i - j);
        if (k != -1) {
          this.l += k;
          j += k;
          continue;
        } 
        throw zzelo.zzbja();
      } 
      paramInt -= i;
      arrayList.add(arrayOfByte);
    } 
    return (List<byte[]>)arrayList;
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
      String str = new String(this.g, this.j, i, m42.a);
      this.j += i;
      return str;
    } 
    if (i == 0)
      return ""; 
    if (i <= this.h) {
      K(i);
      String str = new String(this.g, this.j, i, m42.a);
      this.j += i;
      return str;
    } 
    return new String(I(i, false), m42.a);
  }
  
  public final int e() {
    if (super.u()) {
      this.k = 0;
      return 0;
    } 
    int i = C();
    this.k = i;
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
    byte[] arrayOfByte;
    int i = C();
    int j = this.j;
    int k = this.h;
    if (i <= k - j && i > 0) {
      arrayOfByte = this.g;
      this.j = j + i;
    } else {
      if (i == 0)
        return ""; 
      if (i <= k) {
        K(i);
        arrayOfByte = this.g;
        this.j = i;
      } else {
        arrayOfByte = I(i, false);
      } 
      j = 0;
    } 
    return p72.l(arrayOfByte, j, i);
  }
  
  public final zzejr m() {
    int i = C();
    int j = this.h;
    int k = this.j;
    if (i <= j - k && i > 0) {
      zzejr zzejr = zzejr.zzi(this.g, k, i);
      this.j += i;
      return zzejr;
    } 
    if (i == 0)
      return zzejr.b; 
    byte[] arrayOfByte = M(i);
    if (arrayOfByte != null)
      return zzejr.zzt(arrayOfByte); 
    int m = this.j;
    j = this.h;
    k = j - m;
    this.l += j;
    this.j = 0;
    this.h = 0;
    List<byte[]> list = N(i - k);
    arrayOfByte = new byte[i];
    System.arraycopy(this.g, m, arrayOfByte, 0, k);
    for (byte[] arrayOfByte1 : list) {
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, k, arrayOfByte1.length);
      k += arrayOfByte1.length;
    } 
    return zzejr.zzu(arrayOfByte);
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
    return (this.j == this.h && !L(1));
  }
  
  public final int v() {
    return this.l + this.j;
  }
  
  public final void x(int paramInt) {
    if (this.k == paramInt)
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
                J(4);
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
        J(C());
        return true;
      } 
      J(8);
      return true;
    } 
    paramInt = bool;
    if (this.h - this.j >= 10) {
      paramInt = j;
      while (paramInt < 10) {
        byte[] arrayOfByte = this.g;
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
      paramInt += this.l + this.j;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */