package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class j72 {
  private static final j72 a = new j72(0, new int[0], new Object[0], false);
  
  private int b;
  
  private int[] c;
  
  private Object[] d;
  
  private int e = -1;
  
  private boolean f;
  
  private j72() {
    this(0, new int[8], new Object[8], true);
  }
  
  private j72(int paramInt, int[] paramArrayOfint, Object[] paramArrayOfObject, boolean paramBoolean) {
    this.b = paramInt;
    this.c = paramArrayOfint;
    this.d = paramArrayOfObject;
    this.f = paramBoolean;
  }
  
  static j72 a(j72 paramj721, j72 paramj722) {
    int i = paramj721.b + paramj722.b;
    int[] arrayOfInt = Arrays.copyOf(paramj721.c, i);
    System.arraycopy(paramj722.c, 0, arrayOfInt, paramj721.b, paramj722.b);
    Object[] arrayOfObject = Arrays.copyOf(paramj721.d, i);
    System.arraycopy(paramj722.d, 0, arrayOfObject, paramj721.b, paramj722.b);
    return new j72(i, arrayOfInt, arrayOfObject, true);
  }
  
  private static void d(int paramInt, Object paramObject, w72 paramw72) {
    int i = paramInt >>> 3;
    paramInt &= 0x7;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt == 5) {
              paramw72.E(i, ((Integer)paramObject).intValue());
              return;
            } 
            throw new RuntimeException(zzelo.zzbjf());
          } 
          if (paramw72.H() == v72.a) {
            paramw72.F(i);
            ((j72)paramObject).e(paramw72);
            paramw72.p(i);
            return;
          } 
          paramw72.p(i);
          ((j72)paramObject).e(paramw72);
          paramw72.F(i);
          return;
        } 
        paramw72.z(i, (zzejr)paramObject);
        return;
      } 
      paramw72.j(i, ((Long)paramObject).longValue());
      return;
    } 
    paramw72.o(i, ((Long)paramObject).longValue());
  }
  
  public static j72 h() {
    return a;
  }
  
  static j72 i() {
    return new j72();
  }
  
  final void b(w72 paramw72) {
    if (paramw72.H() == v72.b) {
      for (int i = this.b - 1; i >= 0; i--)
        paramw72.a(this.c[i] >>> 3, this.d[i]); 
      return;
    } 
    for (byte b = 0; b < this.b; b++)
      paramw72.a(this.c[b] >>> 3, this.d[b]); 
  }
  
  final void c(StringBuilder paramStringBuilder, int paramInt) {
    for (byte b = 0; b < this.b; b++)
      v52.c(paramStringBuilder, paramInt, String.valueOf(this.c[b] >>> 3), this.d[b]); 
  }
  
  public final void e(w72 paramw72) {
    if (this.b == 0)
      return; 
    if (paramw72.H() == v72.a) {
      for (byte b = 0; b < this.b; b++)
        d(this.c[b], this.d[b], paramw72); 
      return;
    } 
    for (int i = this.b - 1; i >= 0; i--)
      d(this.c[i], this.d[i], paramw72); 
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof j72))
      return false; 
    paramObject = paramObject;
    int i = this.b;
    if (i == ((j72)paramObject).b) {
      int[] arrayOfInt1 = this.c;
      int[] arrayOfInt2 = ((j72)paramObject).c;
      byte b = 0;
      while (true) {
        if (b < i) {
          if (arrayOfInt1[b] != arrayOfInt2[b]) {
            b = 0;
            break;
          } 
          b++;
          continue;
        } 
        b = 1;
        break;
      } 
      if (b != 0) {
        Object[] arrayOfObject = this.d;
        paramObject = ((j72)paramObject).d;
        i = this.b;
        b = 0;
        while (true) {
          if (b < i) {
            if (!arrayOfObject[b].equals(paramObject[b])) {
              b = 0;
              break;
            } 
            b++;
            continue;
          } 
          b = 1;
          break;
        } 
        if (b != 0)
          return true; 
      } 
    } 
    return false;
  }
  
  public final void f() {
    this.f = false;
  }
  
  public final int g() {
    int i = this.e;
    if (i != -1)
      return i; 
    byte b = 0;
    int j = 0;
    while (b < this.b) {
      int k = this.c[b];
      i = k >>> 3;
      k &= 0x7;
      if (k != 0) {
        if (k != 1) {
          if (k != 2) {
            if (k != 3) {
              if (k == 5) {
                i = zzekl.s(i, ((Integer)this.d[b]).intValue());
              } else {
                throw new IllegalStateException(zzelo.zzbjf());
              } 
            } else {
              i = (zzekl.e0(i) << 1) + ((j72)this.d[b]).g();
            } 
          } else {
            i = zzekl.I(i, (zzejr)this.d[b]);
          } 
        } else {
          i = zzekl.B0(i, ((Long)this.d[b]).longValue());
        } 
      } else {
        i = zzekl.z0(i, ((Long)this.d[b]).longValue());
      } 
      j += i;
      b++;
    } 
    this.e = j;
    return j;
  }
  
  public final int hashCode() {
    int i = this.b;
    int[] arrayOfInt = this.c;
    byte b1 = 0;
    byte b2 = 17;
    int j = 0;
    int k = 17;
    while (j < i) {
      k = k * 31 + arrayOfInt[j];
      j++;
    } 
    Object[] arrayOfObject = this.d;
    int m = this.b;
    j = b2;
    while (b1 < m) {
      j = j * 31 + arrayOfObject[b1].hashCode();
      b1++;
    } 
    return ((i + 527) * 31 + k) * 31 + j;
  }
  
  public final int j() {
    int i = this.e;
    if (i != -1)
      return i; 
    i = 0;
    int j = 0;
    while (i < this.b) {
      j += zzekl.M(this.c[i] >>> 3, (zzejr)this.d[i]);
      i++;
    } 
    this.e = j;
    return j;
  }
  
  final void k(int paramInt, Object paramObject) {
    if (this.f) {
      int i = this.b;
      int[] arrayOfInt = this.c;
      if (i == arrayOfInt.length) {
        if (i < 4) {
          k = 8;
        } else {
          k = i >> 1;
        } 
        int k = i + k;
        this.c = Arrays.copyOf(arrayOfInt, k);
        this.d = Arrays.copyOf(this.d, k);
      } 
      arrayOfInt = this.c;
      int j = this.b;
      arrayOfInt[j] = paramInt;
      this.d[j] = paramObject;
      this.b = j + 1;
      return;
    } 
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */