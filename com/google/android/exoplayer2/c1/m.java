package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.l;
import com.google.android.exoplayer2.util.v;

public final class m {
  private static boolean a(v paramv, l paraml, int paramInt) {
    boolean bool;
    paramInt = j(paramv, paramInt);
    if (paramInt != -1 && paramInt <= paraml.b) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean b(v paramv, int paramInt) {
    int i = paramv.z();
    int j = paramv.c();
    byte[] arrayOfByte = paramv.a;
    boolean bool = true;
    if (i != h0.r(arrayOfByte, paramInt, j - 1, 0))
      bool = false; 
    return bool;
  }
  
  private static boolean c(v paramv, l paraml, boolean paramBoolean, a parama) {
    try {
      long l1 = paramv.G();
      if (!paramBoolean)
        l1 *= paraml.b; 
      parama.a = l1;
      return true;
    } catch (NumberFormatException numberFormatException) {
      return false;
    } 
  }
  
  public static boolean d(v paramv, l paraml, int paramInt, a parama) {
    boolean bool2;
    int i = paramv.c();
    long l1 = paramv.B();
    long l2 = l1 >>> 16L;
    long l3 = paramInt;
    boolean bool1 = false;
    if (l2 != l3)
      return false; 
    if ((l2 & 0x1L) == 1L) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    int j = (int)(l1 >> 12L & 0xFL);
    int k = (int)(l1 >> 8L & 0xFL);
    int n = (int)(0xFL & l1 >> 4L);
    int i1 = (int)(l1 >> 1L & 0x7L);
    if ((l1 & 0x1L) == 1L) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    boolean bool3 = bool1;
    if (g(n, paraml)) {
      bool3 = bool1;
      if (f(i1, paraml)) {
        bool3 = bool1;
        if (paramInt == 0) {
          bool3 = bool1;
          if (c(paramv, paraml, bool2, parama)) {
            bool3 = bool1;
            if (a(paramv, paraml, j)) {
              bool3 = bool1;
              if (e(paramv, paraml, k)) {
                bool3 = bool1;
                if (b(paramv, i))
                  bool3 = true; 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool3;
  }
  
  private static boolean e(v paramv, l paraml, int paramInt) {
    int i = paraml.e;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    if (paramInt == 0)
      return true; 
    if (paramInt <= 11) {
      if (paramInt != paraml.f)
        bool3 = false; 
      return bool3;
    } 
    if (paramInt == 12) {
      if (paramv.z() * 1000 == i) {
        bool3 = bool1;
      } else {
        bool3 = false;
      } 
      return bool3;
    } 
    if (paramInt <= 14) {
      int j = paramv.F();
      int k = j;
      if (paramInt == 14)
        k = j * 10; 
      if (k == i) {
        bool3 = bool2;
      } else {
        bool3 = false;
      } 
      return bool3;
    } 
    return false;
  }
  
  private static boolean f(int paramInt, l paraml) {
    boolean bool = true;
    if (paramInt == 0)
      return true; 
    if (paramInt != paraml.i)
      bool = false; 
    return bool;
  }
  
  private static boolean g(int paramInt, l paraml) {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramInt <= 7) {
      if (paramInt == paraml.g - 1)
        bool2 = true; 
      return bool2;
    } 
    bool2 = bool1;
    if (paramInt <= 10) {
      bool2 = bool1;
      if (paraml.g == 2)
        bool2 = true; 
    } 
    return bool2;
  }
  
  public static boolean h(i parami, l paraml, int paramInt, a parama) {
    long l1 = parami.d();
    byte[] arrayOfByte = new byte[2];
    parami.k(arrayOfByte, 0, 2);
    if (((arrayOfByte[0] & 0xFF) << 8 | arrayOfByte[1] & 0xFF) != paramInt) {
      parami.h();
      parami.e((int)(l1 - parami.a()));
      return false;
    } 
    v v = new v(16);
    System.arraycopy(arrayOfByte, 0, v.a, 0, 2);
    v.L(k.a(parami, v.a, 2, 14));
    parami.h();
    parami.e((int)(l1 - parami.a()));
    return d(v, paraml, paramInt, parama);
  }
  
  public static long i(i parami, l paraml) {
    byte b;
    parami.h();
    boolean bool = true;
    parami.e(1);
    byte[] arrayOfByte = new byte[1];
    parami.k(arrayOfByte, 0, 1);
    if ((arrayOfByte[0] & 0x1) != 1)
      bool = false; 
    parami.e(2);
    if (bool) {
      b = 7;
    } else {
      b = 6;
    } 
    v v = new v(b);
    v.L(k.a(parami, v.a, 0, b));
    parami.h();
    a a = new a();
    if (c(v, paraml, bool, a))
      return a.a; 
    throw new ParserException();
  }
  
  public static int j(v paramv, int paramInt) {
    switch (paramInt) {
      default:
        return -1;
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
        return 256 << paramInt - 8;
      case 7:
        return paramv.F() + 1;
      case 6:
        return paramv.z() + 1;
      case 2:
      case 3:
      case 4:
      case 5:
        return 576 << paramInt - 2;
      case 1:
        break;
    } 
    return 192;
  }
  
  public static final class a {
    public long a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */