package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

final class oh2 implements jh2, kh2 {
  public final kh2[] b;
  
  private final IdentityHashMap<uh2, Integer> c;
  
  private jh2 d;
  
  private int e;
  
  private ai2 f;
  
  private kh2[] g;
  
  private xh2 h;
  
  public oh2(kh2... paramVarArgs) {
    this.b = paramVarArgs;
    this.c = new IdentityHashMap<uh2, Integer>();
  }
  
  public final boolean a(long paramLong) {
    return this.h.a(paramLong);
  }
  
  public final long b() {
    return this.h.b();
  }
  
  public final void e(kh2 paramkh2) {
    int i = this.e - 1;
    this.e = i;
    if (i > 0)
      return; 
    kh2[] arrayOfKh21 = this.b;
    int j = arrayOfKh21.length;
    i = 0;
    int k = 0;
    while (i < j) {
      k += (arrayOfKh21[i].l()).b;
      i++;
    } 
    yh2[] arrayOfYh2 = new yh2[k];
    kh2[] arrayOfKh22 = this.b;
    int m = arrayOfKh22.length;
    i = 0;
    k = 0;
    while (i < m) {
      ai2 ai21 = arrayOfKh22[i].l();
      int n = ai21.b;
      j = 0;
      while (j < n) {
        arrayOfYh2[k] = ai21.b(j);
        j++;
        k++;
      } 
      i++;
    } 
    this.f = new ai2(arrayOfYh2);
    this.d.e(this);
  }
  
  public final void f(long paramLong) {
    kh2[] arrayOfKh2 = this.g;
    int i = arrayOfKh2.length;
    for (byte b = 0; b < i; b++)
      arrayOfKh2[b].f(paramLong); 
  }
  
  public final long h() {
    kh2[] arrayOfKh2 = this.g;
    int i = arrayOfKh2.length;
    byte b = 0;
    long l;
    for (l = Long.MAX_VALUE; b < i; l = l2) {
      long l1 = arrayOfKh2[b].h();
      long l2 = l;
      if (l1 != Long.MIN_VALUE)
        l2 = Math.min(l, l1); 
      b++;
    } 
    return (l == Long.MAX_VALUE) ? Long.MIN_VALUE : l;
  }
  
  public final long i(long paramLong) {
    paramLong = this.g[0].i(paramLong);
    byte b = 1;
    while (true) {
      kh2[] arrayOfKh2 = this.g;
      if (b < arrayOfKh2.length) {
        if (arrayOfKh2[b].i(paramLong) == paramLong) {
          b++;
          continue;
        } 
        throw new IllegalStateException("Children seeked to different positions");
      } 
      return paramLong;
    } 
  }
  
  public final void k(jh2 paramjh2, long paramLong) {
    this.d = paramjh2;
    kh2[] arrayOfKh2 = this.b;
    this.e = arrayOfKh2.length;
    int i = arrayOfKh2.length;
    for (byte b = 0; b < i; b++)
      arrayOfKh2[b].k(this, paramLong); 
  }
  
  public final ai2 l() {
    return this.f;
  }
  
  public final long n() {
    long l = this.b[0].n();
    byte b = 1;
    while (true) {
      kh2[] arrayOfKh2 = this.b;
      if (b < arrayOfKh2.length) {
        if (arrayOfKh2[b].n() == -9223372036854775807L) {
          b++;
          continue;
        } 
        throw new IllegalStateException("Child reported discontinuity");
      } 
      if (l != -9223372036854775807L) {
        arrayOfKh2 = this.g;
        int i = arrayOfKh2.length;
        b = 0;
        while (b < i) {
          kh2 kh21 = arrayOfKh2[b];
          if (kh21 == this.b[0] || kh21.i(l) == l) {
            b++;
            continue;
          } 
          throw new IllegalStateException("Children seeked to different positions");
        } 
      } 
      return l;
    } 
  }
  
  public final long p(mi2[] paramArrayOfmi2, boolean[] paramArrayOfboolean1, uh2[] paramArrayOfuh2, boolean[] paramArrayOfboolean2, long paramLong) {
    uh2[] arrayOfUh21 = paramArrayOfuh2;
    int[] arrayOfInt1 = new int[paramArrayOfmi2.length];
    int[] arrayOfInt2 = new int[paramArrayOfmi2.length];
    byte b;
    for (b = 0; b < paramArrayOfmi2.length; b++) {
      int j;
      if (arrayOfUh21[b] == null) {
        j = -1;
      } else {
        j = ((Integer)this.c.get(arrayOfUh21[b])).intValue();
      } 
      arrayOfInt1[b] = j;
      arrayOfInt2[b] = -1;
      if (paramArrayOfmi2[b] != null) {
        yh2 yh2 = paramArrayOfmi2[b].b();
        j = 0;
        while (true) {
          kh2[] arrayOfKh2 = this.b;
          if (j < arrayOfKh2.length) {
            if (arrayOfKh2[j].l().a(yh2) != -1) {
              arrayOfInt2[b] = j;
              break;
            } 
            j++;
            continue;
          } 
          break;
        } 
      } 
    } 
    this.c.clear();
    int i = paramArrayOfmi2.length;
    uh2[] arrayOfUh22 = new uh2[i];
    uh2[] arrayOfUh23 = new uh2[paramArrayOfmi2.length];
    mi2[] arrayOfMi2 = new mi2[paramArrayOfmi2.length];
    ArrayList<kh2> arrayList = new ArrayList(this.b.length);
    b = 0;
    while (true) {
      uh2[] arrayOfUh2 = paramArrayOfuh2;
      if (b < this.b.length) {
        byte b1;
        for (b1 = 0; b1 < paramArrayOfmi2.length; b1++) {
          mi2 mi21;
          int k = arrayOfInt1[b1];
          uh2 uh22 = null;
          if (k == b) {
            uh21 = arrayOfUh2[b1];
          } else {
            uh21 = null;
          } 
          arrayOfUh23[b1] = uh21;
          uh2 uh21 = uh22;
          if (arrayOfInt2[b1] == b)
            mi21 = paramArrayOfmi2[b1]; 
          arrayOfMi2[b1] = mi21;
        } 
        long l = this.b[b].p(arrayOfMi2, paramArrayOfboolean1, arrayOfUh23, paramArrayOfboolean2, paramLong);
        if (b == 0) {
          paramLong = l;
        } else if (l != paramLong) {
          throw new IllegalStateException("Children enabled at different positions");
        } 
        b1 = 0;
        int j;
        for (j = 0; b1 < paramArrayOfmi2.length; j = k) {
          int k = arrayOfInt2[b1];
          boolean bool = true;
          if (k == b) {
            if (arrayOfUh23[b1] != null) {
              bool = true;
            } else {
              bool = false;
            } 
            jj2.e(bool);
            arrayOfUh22[b1] = arrayOfUh23[b1];
            this.c.put(arrayOfUh23[b1], Integer.valueOf(b));
            k = 1;
          } else {
            k = j;
            if (arrayOfInt1[b1] == b) {
              if (arrayOfUh23[b1] != null)
                bool = false; 
              jj2.e(bool);
              k = j;
            } 
          } 
          b1++;
        } 
        if (j != 0)
          arrayList.add(this.b[b]); 
        b++;
        continue;
      } 
      System.arraycopy(arrayOfUh22, 0, arrayOfUh2, 0, i);
      kh2[] arrayOfKh2 = new kh2[arrayList.size()];
      this.g = arrayOfKh2;
      arrayList.toArray(arrayOfKh2);
      this.h = new wg2((xh2[])this.g);
      return paramLong;
    } 
  }
  
  public final void q() {
    kh2[] arrayOfKh2 = this.b;
    int i = arrayOfKh2.length;
    for (byte b = 0; b < i; b++)
      arrayOfKh2[b].q(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */