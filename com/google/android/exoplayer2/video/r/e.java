package com.google.android.exoplayer2.video.r;

import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.zip.Inflater;

public final class e {
  public static d a(byte[] paramArrayOfbyte, int paramInt) {
    v v = new v(paramArrayOfbyte);
    try {
      ArrayList<d.a> arrayList;
      if (c(v)) {
        arrayList = f(v);
      } else {
        arrayList = e((v)arrayList);
      } 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      arrayIndexOutOfBoundsException = null;
    } 
    if (arrayIndexOutOfBoundsException == null)
      return null; 
    int i = arrayIndexOutOfBoundsException.size();
    return (i != 1) ? ((i != 2) ? null : new d(arrayIndexOutOfBoundsException.get(0), arrayIndexOutOfBoundsException.get(1), paramInt)) : new d(arrayIndexOutOfBoundsException.get(0), paramInt);
  }
  
  private static int b(int paramInt) {
    return -(paramInt & 0x1) ^ paramInt >> 1;
  }
  
  private static boolean c(v paramv) {
    paramv.N(4);
    int i = paramv.k();
    boolean bool = false;
    paramv.M(0);
    if (i == 1886547818)
      bool = true; 
    return bool;
  }
  
  private static d.a d(v paramv) {
    int i = paramv.k();
    if (i > 10000)
      return null; 
    float[] arrayOfFloat2 = new float[i];
    byte b1;
    for (b1 = 0; b1 < i; b1++)
      arrayOfFloat2[b1] = paramv.j(); 
    int j = paramv.k();
    if (j > 32000)
      return null; 
    double d1 = Math.log(2.0D);
    double d2 = i;
    Double.isNaN(d2);
    int k = (int)Math.ceil(Math.log(d2 * 2.0D) / d1);
    u u = new u(paramv.a);
    u.o(paramv.c() * 8);
    float[] arrayOfFloat1 = new float[j * 5];
    int[] arrayOfInt = new int[5];
    b1 = 0;
    byte b2 = 0;
    while (b1 < j) {
      byte b = 0;
      while (b < 5) {
        int m = arrayOfInt[b] + b(u.h(k));
        if (m >= i || m < 0)
          return null; 
        arrayOfFloat1[b2] = arrayOfFloat2[m];
        arrayOfInt[b] = m;
        b++;
        b2++;
      } 
      b1++;
    } 
    u.o(u.e() + 7 & 0xFFFFFFF8);
    i = u.h(32);
    d.b[] arrayOfB = new d.b[i];
    for (b1 = 0; b1 < i; b1++) {
      int i1 = u.h(8);
      int i2 = u.h(8);
      int n = u.h(32);
      if (n > 128000)
        return null; 
      d2 = j;
      Double.isNaN(d2);
      k = (int)Math.ceil(Math.log(d2 * 2.0D) / d1);
      float[] arrayOfFloat = new float[n * 3];
      arrayOfFloat2 = new float[n * 2];
      b2 = 0;
      int m = 0;
      while (b2 < n) {
        m += b(u.h(k));
        if (m < 0 || m >= j)
          return null; 
        int i3 = b2 * 3;
        int i4 = m * 5;
        arrayOfFloat[i3] = arrayOfFloat1[i4];
        arrayOfFloat[i3 + 1] = arrayOfFloat1[i4 + 1];
        arrayOfFloat[i3 + 2] = arrayOfFloat1[i4 + 2];
        i3 = b2 * 2;
        arrayOfFloat2[i3] = arrayOfFloat1[i4 + 3];
        arrayOfFloat2[i3 + 1] = arrayOfFloat1[i4 + 4];
        b2++;
      } 
      arrayOfB[b1] = new d.b(i1, arrayOfFloat, arrayOfFloat2, i2);
    } 
    return new d.a(arrayOfB);
  }
  
  private static ArrayList<d.a> e(v paramv) {
    if (paramv.z() != 0)
      return null; 
    paramv.N(7);
    int i = paramv.k();
    if (i == 1684433976) {
      v v1 = new v();
      Inflater inflater = new Inflater(true);
      try {
        boolean bool = h0.S(paramv, v1, inflater);
        if (!bool)
          return null; 
        inflater.end();
      } finally {
        inflater.end();
      } 
    } else if (i != 1918990112) {
      return null;
    } 
    return g(paramv);
  }
  
  private static ArrayList<d.a> f(v paramv) {
    paramv.N(8);
    int i = paramv.c();
    int j = paramv.d();
    while (i < j) {
      int k = paramv.k() + i;
      if (k <= i || k > j)
        break; 
      i = paramv.k();
      if (i == 2037673328 || i == 1836279920) {
        paramv.L(k);
        return e(paramv);
      } 
      paramv.M(k);
      i = k;
    } 
    return null;
  }
  
  private static ArrayList<d.a> g(v paramv) {
    ArrayList<d.a> arrayList = new ArrayList();
    int i = paramv.c();
    int j = paramv.d();
    while (i < j) {
      int k = paramv.k() + i;
      if (k <= i || k > j)
        return null; 
      if (paramv.k() == 1835365224) {
        d.a a = d(paramv);
        if (a == null)
          return null; 
        arrayList.add(a);
      } 
      paramv.M(k);
      i = k;
    } 
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/r/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */