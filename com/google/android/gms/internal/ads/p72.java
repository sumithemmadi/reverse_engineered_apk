package com.google.android.gms.internal.ads;

final class p72 {
  private static final q72 a;
  
  static {
    boolean bool;
    s72 s72;
    if (m72.m() && m72.n()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool && !z22.a()) {
      u72 u72 = new u72();
    } else {
      s72 = new s72();
    } 
    a = s72;
  }
  
  static int a(CharSequence paramCharSequence, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return a.b(paramCharSequence, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private static int b(int paramInt1, int paramInt2) {
    return (paramInt1 > -12 || paramInt2 > -65) ? -1 : (paramInt1 ^ paramInt2 << 8);
  }
  
  public static int d(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    return a.a(paramInt1, paramArrayOfbyte, paramInt2, paramInt3);
  }
  
  static int e(CharSequence paramCharSequence) {
    int n;
    int i = paramCharSequence.length();
    int j = 0;
    int k;
    for (k = 0; k < i && paramCharSequence.charAt(k) < ''; k++);
    int m = i;
    while (true) {
      n = m;
      if (k < i) {
        n = paramCharSequence.charAt(k);
        if (n < 2048) {
          m += 127 - n >>> 31;
          k++;
          continue;
        } 
        int i1 = paramCharSequence.length();
        n = j;
        while (k < i1) {
          char c = paramCharSequence.charAt(k);
          if (c < 'ࠀ') {
            n += 127 - c >>> 31;
            j = k;
          } else {
            int i2 = n + 2;
            n = i2;
            j = k;
            if ('?' <= c) {
              n = i2;
              j = k;
              if (c <= '?')
                if (Character.codePointAt(paramCharSequence, k) >= 65536) {
                  j = k + 1;
                  n = i2;
                } else {
                  throw new zzeon(k, i1);
                }  
            } 
          } 
          k = j + 1;
        } 
        n = m + n;
      } 
      break;
    } 
    if (n >= i)
      return n; 
    long l = n;
    paramCharSequence = new StringBuilder(54);
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(paramCharSequence.toString());
    throw illegalArgumentException;
  }
  
  private static int f(int paramInt) {
    int i = paramInt;
    if (paramInt > -12)
      i = -1; 
    return i;
  }
  
  private static int h(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 > -12 || paramInt2 > -65 || paramInt3 > -65) ? -1 : (paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16);
  }
  
  public static boolean j(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return a.c(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private static int k(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte b = paramArrayOfbyte[paramInt1 - 1];
    paramInt2 -= paramInt1;
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        if (paramInt2 == 2)
          return h(b, paramArrayOfbyte[paramInt1], paramArrayOfbyte[paramInt1 + 1]); 
        throw new AssertionError();
      } 
      return b(b, paramArrayOfbyte[paramInt1]);
    } 
    return f(b);
  }
  
  static String l(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return a.d(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public static boolean n(byte[] paramArrayOfbyte) {
    return a.c(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */