package com.google.android.gms.internal.ads;

final class c32 {
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, b32 paramb32) {
    if (paramInt1 >>> 3 != 0) {
      int i = paramInt1 & 0x7;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i == 5)
                return paramInt2 + 4; 
              throw zzelo.zzbjd();
            } 
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            paramInt1 = 0;
            while (true) {
              i = paramInt2;
              if (paramInt2 < paramInt3) {
                int k = h(paramArrayOfbyte, paramInt2, paramb32);
                paramInt2 = paramb32.a;
                paramInt1 = paramInt2;
                i = k;
                if (paramInt2 != j) {
                  i = a(paramInt2, paramArrayOfbyte, k, paramInt3, paramb32);
                  paramInt1 = paramInt2;
                  paramInt2 = i;
                  continue;
                } 
              } 
              break;
            } 
            if (i <= paramInt3 && paramInt1 == j)
              return i; 
            throw zzelo.zzbjh();
          } 
          return h(paramArrayOfbyte, paramInt2, paramb32) + paramb32.a;
        } 
        return paramInt2 + 8;
      } 
      return j(paramArrayOfbyte, paramInt2, paramb32);
    } 
    zzelo zzelo = zzelo.zzbjd();
    throw zzelo;
  }
  
  static int b(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, u42<?> paramu42, b32 paramb32) {
    paramu42 = paramu42;
    paramInt2 = h(paramArrayOfbyte, paramInt2, paramb32);
    paramu42.M(paramb32.a);
    while (paramInt2 < paramInt3) {
      int i = h(paramArrayOfbyte, paramInt2, paramb32);
      if (paramInt1 == paramb32.a) {
        paramInt2 = h(paramArrayOfbyte, i, paramb32);
        paramu42.M(paramb32.a);
      } 
    } 
    return paramInt2;
  }
  
  static int c(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, j72 paramj72, b32 paramb32) {
    if (paramInt1 >>> 3 != 0) {
      int i = paramInt1 & 0x7;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            int k;
            if (i != 3) {
              if (i == 5) {
                paramj72.k(paramInt1, Integer.valueOf(n(paramArrayOfbyte, paramInt2)));
                return paramInt2 + 4;
              } 
              throw zzelo.zzbjd();
            } 
            j72 j721 = j72.i();
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            i = 0;
            while (true) {
              k = i;
              i = paramInt2;
              if (paramInt2 < paramInt3) {
                k = h(paramArrayOfbyte, paramInt2, paramb32);
                i = paramb32.a;
                paramInt2 = i;
                if (i != j) {
                  paramInt2 = c(paramInt2, paramArrayOfbyte, k, paramInt3, j721, paramb32);
                  continue;
                } 
                i = k;
                k = paramInt2;
              } 
              break;
            } 
            if (i <= paramInt3 && k == j) {
              paramj72.k(paramInt1, j721);
              return i;
            } 
            throw zzelo.zzbjh();
          } 
          paramInt2 = h(paramArrayOfbyte, paramInt2, paramb32);
          paramInt3 = paramb32.a;
          if (paramInt3 >= 0) {
            if (paramInt3 <= paramArrayOfbyte.length - paramInt2) {
              if (paramInt3 == 0) {
                paramj72.k(paramInt1, zzejr.b);
              } else {
                paramj72.k(paramInt1, zzejr.zzi(paramArrayOfbyte, paramInt2, paramInt3));
              } 
              return paramInt2 + paramInt3;
            } 
            throw zzelo.zzbja();
          } 
          throw zzelo.zzbjb();
        } 
        paramj72.k(paramInt1, Long.valueOf(o(paramArrayOfbyte, paramInt2)));
        return paramInt2 + 8;
      } 
      paramInt2 = j(paramArrayOfbyte, paramInt2, paramb32);
      paramj72.k(paramInt1, Long.valueOf(paramb32.b));
      return paramInt2;
    } 
    zzelo zzelo = zzelo.zzbjd();
    throw zzelo;
  }
  
  static int d(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, b32 paramb32) {
    paramInt1 &= 0x7F;
    int i = paramInt2 + 1;
    paramInt2 = paramArrayOfbyte[paramInt2];
    if (paramInt2 >= 0) {
      paramb32.a = paramInt1 | paramInt2 << 7;
      return i;
    } 
    paramInt2 = paramInt1 | (paramInt2 & 0x7F) << 7;
    paramInt1 = i + 1;
    i = paramArrayOfbyte[i];
    if (i >= 0) {
      paramb32.a = paramInt2 | i << 14;
      return paramInt1;
    } 
    i = paramInt2 | (i & 0x7F) << 14;
    paramInt2 = paramInt1 + 1;
    paramInt1 = paramArrayOfbyte[paramInt1];
    if (paramInt1 >= 0) {
      paramb32.a = i | paramInt1 << 21;
      return paramInt2;
    } 
    i |= (paramInt1 & 0x7F) << 21;
    paramInt1 = paramInt2 + 1;
    byte b = paramArrayOfbyte[paramInt2];
    if (b >= 0) {
      paramb32.a = i | b << 28;
      return paramInt1;
    } 
    while (true) {
      paramInt2 = paramInt1 + 1;
      if (paramArrayOfbyte[paramInt1] >= 0) {
        paramb32.a = i | (b & Byte.MAX_VALUE) << 28;
        return paramInt2;
      } 
      paramInt1 = paramInt2;
    } 
  }
  
  static int e(o62<?> paramo62, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, u42<?> paramu42, b32 paramb32) {
    paramInt2 = g(paramo62, paramArrayOfbyte, paramInt2, paramInt3, paramb32);
    paramu42.add(paramb32.c);
    while (paramInt2 < paramInt3) {
      int i = h(paramArrayOfbyte, paramInt2, paramb32);
      if (paramInt1 == paramb32.a) {
        paramInt2 = g(paramo62, paramArrayOfbyte, i, paramInt3, paramb32);
        paramu42.add(paramb32.c);
      } 
    } 
    return paramInt2;
  }
  
  static int f(o62<Object> paramo62, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, b32 paramb32) {
    paramo62 = paramo62;
    Object object = paramo62.i();
    paramInt1 = paramo62.o(object, paramArrayOfbyte, paramInt1, paramInt2, paramInt3, paramb32);
    paramo62.e(object);
    paramb32.c = object;
    return paramInt1;
  }
  
  static int g(o62<Object> paramo62, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, b32 paramb32) {
    int i = paramInt1 + 1;
    byte b = paramArrayOfbyte[paramInt1];
    paramInt1 = i;
    int j = b;
    if (b < 0) {
      paramInt1 = d(b, paramArrayOfbyte, i, paramb32);
      j = paramb32.a;
    } 
    if (j >= 0 && j <= paramInt2 - paramInt1) {
      Object object = paramo62.i();
      paramInt2 = j + paramInt1;
      paramo62.h(object, paramArrayOfbyte, paramInt1, paramInt2, paramb32);
      paramo62.e(object);
      paramb32.c = object;
      return paramInt2;
    } 
    throw zzelo.zzbja();
  }
  
  static int h(byte[] paramArrayOfbyte, int paramInt, b32 paramb32) {
    int i = paramInt + 1;
    paramInt = paramArrayOfbyte[paramInt];
    if (paramInt >= 0) {
      paramb32.a = paramInt;
      return i;
    } 
    return d(paramInt, paramArrayOfbyte, i, paramb32);
  }
  
  static int i(byte[] paramArrayOfbyte, int paramInt, u42<?> paramu42, b32 paramb32) {
    paramu42 = paramu42;
    paramInt = h(paramArrayOfbyte, paramInt, paramb32);
    int i = paramb32.a + paramInt;
    while (paramInt < i) {
      paramInt = h(paramArrayOfbyte, paramInt, paramb32);
      paramu42.M(paramb32.a);
    } 
    if (paramInt == i)
      return paramInt; 
    zzelo zzelo = zzelo.zzbja();
    throw zzelo;
  }
  
  static int j(byte[] paramArrayOfbyte, int paramInt, b32 paramb32) {
    int i = paramInt + 1;
    long l = paramArrayOfbyte[paramInt];
    if (l >= 0L) {
      paramb32.b = l;
      return i;
    } 
    paramInt = i + 1;
    byte b = paramArrayOfbyte[i];
    l = l & 0x7FL | (b & Byte.MAX_VALUE) << 7L;
    i = 7;
    while (b < 0) {
      b = paramArrayOfbyte[paramInt];
      i += 7;
      l |= (b & Byte.MAX_VALUE) << i;
      paramInt++;
    } 
    paramb32.b = l;
    return paramInt;
  }
  
  static int k(byte[] paramArrayOfbyte, int paramInt, b32 paramb32) {
    paramInt = h(paramArrayOfbyte, paramInt, paramb32);
    int i = paramb32.a;
    if (i >= 0) {
      if (i == 0) {
        paramb32.c = "";
        return paramInt;
      } 
      paramb32.c = new String(paramArrayOfbyte, paramInt, i, m42.a);
      return paramInt + i;
    } 
    throw zzelo.zzbjb();
  }
  
  static int l(byte[] paramArrayOfbyte, int paramInt, b32 paramb32) {
    paramInt = h(paramArrayOfbyte, paramInt, paramb32);
    int i = paramb32.a;
    if (i >= 0) {
      if (i == 0) {
        paramb32.c = "";
        return paramInt;
      } 
      paramb32.c = p72.l(paramArrayOfbyte, paramInt, i);
      return paramInt + i;
    } 
    throw zzelo.zzbjb();
  }
  
  static int m(byte[] paramArrayOfbyte, int paramInt, b32 paramb32) {
    int i = h(paramArrayOfbyte, paramInt, paramb32);
    paramInt = paramb32.a;
    if (paramInt >= 0) {
      if (paramInt <= paramArrayOfbyte.length - i) {
        if (paramInt == 0) {
          paramb32.c = zzejr.b;
          return i;
        } 
        paramb32.c = zzejr.zzi(paramArrayOfbyte, i, paramInt);
        return i + paramInt;
      } 
      throw zzelo.zzbja();
    } 
    throw zzelo.zzbjb();
  }
  
  static int n(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = paramArrayOfbyte[paramInt];
    byte b2 = paramArrayOfbyte[paramInt + 1];
    byte b3 = paramArrayOfbyte[paramInt + 2];
    return (paramArrayOfbyte[paramInt + 3] & 0xFF) << 24 | b1 & 0xFF | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16;
  }
  
  static long o(byte[] paramArrayOfbyte, int paramInt) {
    long l1 = paramArrayOfbyte[paramInt];
    long l2 = paramArrayOfbyte[paramInt + 1];
    long l3 = paramArrayOfbyte[paramInt + 2];
    long l4 = paramArrayOfbyte[paramInt + 3];
    long l5 = paramArrayOfbyte[paramInt + 4];
    long l6 = paramArrayOfbyte[paramInt + 5];
    long l7 = paramArrayOfbyte[paramInt + 6];
    return (paramArrayOfbyte[paramInt + 7] & 0xFFL) << 56L | l1 & 0xFFL | (l2 & 0xFFL) << 8L | (l3 & 0xFFL) << 16L | (l4 & 0xFFL) << 24L | (l5 & 0xFFL) << 32L | (l6 & 0xFFL) << 40L | (l7 & 0xFFL) << 48L;
  }
  
  static double p(byte[] paramArrayOfbyte, int paramInt) {
    return Double.longBitsToDouble(o(paramArrayOfbyte, paramInt));
  }
  
  static float q(byte[] paramArrayOfbyte, int paramInt) {
    return Float.intBitsToFloat(n(paramArrayOfbyte, paramInt));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */