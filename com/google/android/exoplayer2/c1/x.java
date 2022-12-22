package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;
import java.util.Arrays;

public final class x {
  public static int a(int paramInt) {
    byte b = 0;
    while (paramInt > 0) {
      b++;
      paramInt >>>= 1;
    } 
    return b;
  }
  
  private static long b(long paramLong1, long paramLong2) {
    double d1 = paramLong1;
    double d2 = paramLong2;
    Double.isNaN(d2);
    return (long)Math.floor(Math.pow(d1, 1.0D / d2));
  }
  
  private static a c(w paramw) {
    StringBuilder stringBuilder1;
    if (paramw.d(24) == 5653314) {
      int i = paramw.d(16);
      int j = paramw.d(24);
      long[] arrayOfLong = new long[j];
      boolean bool = paramw.c();
      long l = 0L;
      int k = 0;
      if (!bool) {
        boolean bool1 = paramw.c();
        while (k < j) {
          if (bool1) {
            if (paramw.c()) {
              arrayOfLong[k] = (paramw.d(5) + 1);
            } else {
              arrayOfLong[k] = 0L;
            } 
          } else {
            arrayOfLong[k] = (paramw.d(5) + 1);
          } 
          k++;
        } 
      } else {
        k = paramw.d(5) + 1;
        byte b = 0;
        while (b < j) {
          int n = paramw.d(a(j - b));
          for (byte b1 = 0; b1 < n && b < j; b1++) {
            arrayOfLong[b] = k;
            b++;
          } 
          k++;
        } 
      } 
      int m = paramw.d(4);
      if (m <= 2) {
        if (m == 1 || m == 2) {
          paramw.e(32);
          paramw.e(32);
          k = paramw.d(4);
          paramw.e(1);
          if (m == 1) {
            if (i != 0)
              l = b(j, i); 
          } else {
            l = j * i;
          } 
          paramw.e((int)(l * (k + 1)));
        } 
        return new a(i, j, arrayOfLong, m, bool);
      } 
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("lookup type greater than 2 not decodable: ");
      stringBuilder1.append(m);
      throw new ParserException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
    stringBuilder2.append(stringBuilder1.b());
    ParserException parserException = new ParserException(stringBuilder2.toString());
    throw parserException;
  }
  
  private static void d(w paramw) {
    int i = paramw.d(6);
    for (byte b = 0; b < i + 1; b++) {
      StringBuilder stringBuilder;
      int j = paramw.d(16);
      if (j != 0) {
        if (j == 1) {
          int k = paramw.d(5);
          int m = -1;
          int[] arrayOfInt1 = new int[k];
          j = 0;
          while (j < k) {
            arrayOfInt1[j] = paramw.d(4);
            int i1 = m;
            if (arrayOfInt1[j] > m)
              i1 = arrayOfInt1[j]; 
            j++;
            m = i1;
          } 
          int[] arrayOfInt2 = new int[++m];
          for (j = 0; j < m; j++) {
            arrayOfInt2[j] = paramw.d(3) + 1;
            int i1 = paramw.d(2);
            if (i1 > 0)
              paramw.e(8); 
            for (byte b2 = 0; b2 < 1 << i1; b2++)
              paramw.e(8); 
          } 
          paramw.e(2);
          int n = paramw.d(4);
          j = 0;
          m = 0;
          byte b1 = 0;
          while (j < k) {
            m += arrayOfInt2[arrayOfInt1[j]];
            while (b1 < m) {
              paramw.e(n);
              b1++;
            } 
            j++;
          } 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("floor type greater than 1 not decodable: ");
          stringBuilder.append(j);
          throw new ParserException(stringBuilder.toString());
        } 
      } else {
        stringBuilder.e(8);
        stringBuilder.e(16);
        stringBuilder.e(16);
        stringBuilder.e(6);
        stringBuilder.e(8);
        int k = stringBuilder.d(4);
        for (j = 0; j < k + 1; j++)
          stringBuilder.e(8); 
      } 
    } 
  }
  
  private static void e(int paramInt, w paramw) {
    int i = paramw.d(6);
    for (byte b = 0; b < i + 1; b++) {
      int j = paramw.d(16);
      if (j != 0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mapping type other than 0 not supported: ");
        stringBuilder.append(j);
        o.c("VorbisUtil", stringBuilder.toString());
      } else {
        if (paramw.c()) {
          j = paramw.d(4) + 1;
        } else {
          j = 1;
        } 
        if (paramw.c()) {
          int k = paramw.d(8);
          for (byte b1 = 0; b1 < k + 1; b1++) {
            int m = paramInt - 1;
            paramw.e(a(m));
            paramw.e(a(m));
          } 
        } 
        if (paramw.d(2) == 0) {
          if (j > 1)
            for (byte b2 = 0; b2 < paramInt; b2++)
              paramw.e(4);  
          for (byte b1 = 0; b1 < j; b1++) {
            paramw.e(8);
            paramw.e(8);
            paramw.e(8);
          } 
        } else {
          throw new ParserException("to reserved bits must be zero after mapping coupling steps");
        } 
      } 
    } 
  }
  
  private static c[] f(w paramw) {
    int i = paramw.d(6) + 1;
    c[] arrayOfC = new c[i];
    for (byte b = 0; b < i; b++)
      arrayOfC[b] = new c(paramw.c(), paramw.d(16), paramw.d(16), paramw.d(8)); 
    return arrayOfC;
  }
  
  private static void g(w paramw) {
    int i = paramw.d(6);
    byte b = 0;
    while (b < i + 1) {
      if (paramw.d(16) <= 2) {
        paramw.e(24);
        paramw.e(24);
        paramw.e(24);
        int j = paramw.d(6) + 1;
        paramw.e(8);
        int[] arrayOfInt = new int[j];
        byte b1;
        for (b1 = 0; b1 < j; b1++) {
          byte b2;
          int k = paramw.d(3);
          if (paramw.c()) {
            b2 = paramw.d(5);
          } else {
            b2 = 0;
          } 
          arrayOfInt[b1] = b2 * 8 + k;
        } 
        for (b1 = 0; b1 < j; b1++) {
          for (byte b2 = 0; b2 < 8; b2++) {
            if ((arrayOfInt[b1] & 1 << b2) != 0)
              paramw.e(8); 
          } 
        } 
        b++;
        continue;
      } 
      throw new ParserException("residueType greater than 2 is not decodable");
    } 
  }
  
  public static b h(v paramv) {
    return i(paramv, true, true);
  }
  
  public static b i(v paramv, boolean paramBoolean1, boolean paramBoolean2) {
    byte b = 0;
    if (paramBoolean1)
      l(3, paramv, false); 
    String str = paramv.w((int)paramv.p());
    int i = str.length();
    long l = paramv.p();
    String[] arrayOfString = new String[(int)l];
    i = 11 + i + 4;
    while (b < l) {
      arrayOfString[b] = paramv.w((int)paramv.p());
      i = i + 4 + arrayOfString[b].length();
      b++;
    } 
    if (!paramBoolean2 || (paramv.z() & 0x1) != 0)
      return new b(str, arrayOfString, i + 1); 
    throw new ParserException("framing bit expected to be set");
  }
  
  public static d j(v paramv) {
    boolean bool;
    l(1, paramv, false);
    long l1 = paramv.p();
    int i = paramv.z();
    long l2 = paramv.p();
    int j = paramv.n();
    int k = paramv.n();
    int m = paramv.n();
    int n = paramv.z();
    int i1 = (int)Math.pow(2.0D, (n & 0xF));
    n = (int)Math.pow(2.0D, ((n & 0xF0) >> 4));
    if ((paramv.z() & 0x1) > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return new d(l1, i, l2, j, k, m, i1, n, bool, Arrays.copyOf(paramv.a, paramv.d()));
  }
  
  public static c[] k(v paramv, int paramInt) {
    boolean bool = false;
    l(5, paramv, false);
    int i = paramv.z();
    w w = new w(paramv.a);
    w.e(paramv.c() * 8);
    byte b;
    for (b = 0; b < i + 1; b++)
      c(w); 
    i = w.d(6);
    b = bool;
    while (b < i + 1) {
      if (w.d(16) == 0) {
        b++;
        continue;
      } 
      throw new ParserException("placeholder of time domain transforms not zeroed out");
    } 
    d(w);
    g(w);
    e(paramInt, w);
    c[] arrayOfC = f(w);
    if (w.c())
      return arrayOfC; 
    ParserException parserException = new ParserException("framing bit after modes not set as expected");
    throw parserException;
  }
  
  public static boolean l(int paramInt, v paramv, boolean paramBoolean) {
    StringBuilder stringBuilder;
    if (paramv.a() < 7) {
      if (paramBoolean)
        return false; 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("too short header: ");
      stringBuilder1.append(paramv.a());
      throw new ParserException(stringBuilder1.toString());
    } 
    if (paramv.z() != paramInt) {
      if (paramBoolean)
        return false; 
      stringBuilder = new StringBuilder();
      stringBuilder.append("expected header type ");
      stringBuilder.append(Integer.toHexString(paramInt));
      throw new ParserException(stringBuilder.toString());
    } 
    if (stringBuilder.z() != 118 || stringBuilder.z() != 111 || stringBuilder.z() != 114 || stringBuilder.z() != 98 || stringBuilder.z() != 105 || stringBuilder.z() != 115) {
      if (paramBoolean)
        return false; 
      throw new ParserException("expected characters 'vorbis'");
    } 
    return true;
  }
  
  private static final class a {
    public final int a;
    
    public final int b;
    
    public final long[] c;
    
    public final int d;
    
    public final boolean e;
    
    public a(int param1Int1, int param1Int2, long[] param1ArrayOflong, int param1Int3, boolean param1Boolean) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1ArrayOflong;
      this.d = param1Int3;
      this.e = param1Boolean;
    }
  }
  
  public static final class b {
    public final String a;
    
    public final String[] b;
    
    public final int c;
    
    public b(String param1String, String[] param1ArrayOfString, int param1Int) {
      this.a = param1String;
      this.b = param1ArrayOfString;
      this.c = param1Int;
    }
  }
  
  public static final class c {
    public final boolean a;
    
    public final int b;
    
    public final int c;
    
    public final int d;
    
    public c(boolean param1Boolean, int param1Int1, int param1Int2, int param1Int3) {
      this.a = param1Boolean;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
    }
  }
  
  public static final class d {
    public final long a;
    
    public final int b;
    
    public final long c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    public final int g;
    
    public final int h;
    
    public final boolean i;
    
    public final byte[] j;
    
    public d(long param1Long1, int param1Int1, long param1Long2, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, boolean param1Boolean, byte[] param1ArrayOfbyte) {
      this.a = param1Long1;
      this.b = param1Int1;
      this.c = param1Long2;
      this.d = param1Int2;
      this.e = param1Int3;
      this.f = param1Int4;
      this.g = param1Int5;
      this.h = param1Int6;
      this.i = param1Boolean;
      this.j = param1ArrayOfbyte;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */