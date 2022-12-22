package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.b;
import com.google.android.exoplayer2.util.l;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class n {
  public static boolean a(i parami) {
    v v = new v(4);
    byte[] arrayOfByte = v.a;
    boolean bool = false;
    parami.k(arrayOfByte, 0, 4);
    if (v.B() == 1716281667L)
      bool = true; 
    return bool;
  }
  
  public static int b(i parami) {
    parami.h();
    v v = new v(2);
    parami.k(v.a, 0, 2);
    int j = v.F();
    if (j >> 2 == 16382) {
      parami.h();
      return j;
    } 
    parami.h();
    throw new ParserException("First frame does not start with sync code.");
  }
  
  public static Metadata c(i parami, boolean paramBoolean) {
    Metadata metadata1;
    b.a a;
    i i1 = null;
    if (paramBoolean) {
      a = null;
    } else {
      a = b.a;
    } 
    Metadata metadata2 = (new q()).a(parami, a);
    parami = i1;
    if (metadata2 != null)
      if (metadata2.d() == 0) {
        parami = i1;
      } else {
        metadata1 = metadata2;
      }  
    return metadata1;
  }
  
  public static Metadata d(i parami, boolean paramBoolean) {
    parami.h();
    long l = parami.d();
    Metadata metadata = c(parami, paramBoolean);
    parami.i((int)(parami.d() - l));
    return metadata;
  }
  
  public static boolean e(i parami, a parama) {
    parami.h();
    u u = new u(new byte[4]);
    parami.k(u.a, 0, 4);
    boolean bool = u.g();
    int j = u.h(7);
    int k = u.h(24) + 4;
    if (j == 0) {
      parama.a = i(parami);
    } else {
      l l = parama.a;
      if (l != null) {
        if (j == 3) {
          parama.a = l.c(g(parami, k));
        } else if (j == 4) {
          parama.a = l.d(k(parami, k));
        } else if (j == 6) {
          parama.a = l.b(Collections.singletonList(f(parami, k)));
        } else {
          parami.i(k);
        } 
        return bool;
      } 
      throw new IllegalArgumentException();
    } 
    return bool;
  }
  
  private static PictureFrame f(i parami, int paramInt) {
    v v = new v(paramInt);
    parami.readFully(v.a, 0, paramInt);
    v.N(4);
    int j = v.k();
    String str1 = v.x(v.k(), Charset.forName("US-ASCII"));
    String str2 = v.w(v.k());
    int k = v.k();
    int m = v.k();
    paramInt = v.k();
    int i1 = v.k();
    int i2 = v.k();
    byte[] arrayOfByte = new byte[i2];
    v.h(arrayOfByte, 0, i2);
    return new PictureFrame(j, str1, str2, k, m, paramInt, i1, arrayOfByte);
  }
  
  private static l.a g(i parami, int paramInt) {
    v v = new v(paramInt);
    parami.readFully(v.a, 0, paramInt);
    return h(v);
  }
  
  public static l.a h(v paramv) {
    long[] arrayOfLong3;
    long[] arrayOfLong4;
    paramv.N(1);
    int i = paramv.C();
    long l = (paramv.c() + i);
    int j = i / 18;
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    i = 0;
    while (true) {
      arrayOfLong3 = arrayOfLong1;
      arrayOfLong4 = arrayOfLong2;
      if (i < j) {
        long l1 = paramv.s();
        if (l1 == -1L) {
          arrayOfLong3 = Arrays.copyOf(arrayOfLong1, i);
          arrayOfLong4 = Arrays.copyOf(arrayOfLong2, i);
          break;
        } 
        arrayOfLong1[i] = l1;
        arrayOfLong2[i] = paramv.s();
        paramv.N(2);
        i++;
        continue;
      } 
      break;
    } 
    paramv.N((int)(l - paramv.c()));
    return new l.a(arrayOfLong3, arrayOfLong4);
  }
  
  private static l i(i parami) {
    byte[] arrayOfByte = new byte[38];
    parami.readFully(arrayOfByte, 0, 38);
    return new l(arrayOfByte, 4);
  }
  
  public static void j(i parami) {
    v v = new v(4);
    parami.readFully(v.a, 0, 4);
    if (v.B() == 1716281667L)
      return; 
    throw new ParserException("Failed to read FLAC stream marker.");
  }
  
  private static List<String> k(i parami, int paramInt) {
    v v = new v(paramInt);
    parami.readFully(v.a, 0, paramInt);
    v.N(4);
    return Arrays.asList((x.i(v, false, false)).b);
  }
  
  public static final class a {
    public l a;
    
    public a(l param1l) {
      this.a = param1l;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */