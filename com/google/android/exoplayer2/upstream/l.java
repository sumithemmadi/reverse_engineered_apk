package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class l {
  public final Uri a;
  
  public final int b;
  
  public final byte[] c;
  
  public final Map<String, String> d;
  
  public final long e;
  
  public final long f;
  
  public final long g;
  
  public final String h;
  
  public final int i;
  
  public l(Uri paramUri, int paramInt) {
    this(paramUri, 0L, -1L, null, paramInt);
  }
  
  public l(Uri paramUri, int paramInt1, byte[] paramArrayOfbyte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt2) {
    this(paramUri, paramInt1, paramArrayOfbyte, paramLong1, paramLong2, paramLong3, paramString, paramInt2, Collections.emptyMap());
  }
  
  public l(Uri paramUri, int paramInt1, byte[] paramArrayOfbyte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt2, Map<String, String> paramMap) {
    boolean bool1 = true;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    boolean bool2 = bool1;
    if (paramLong3 <= 0L)
      if (paramLong3 == -1L) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    e.a(bool2);
    this.a = paramUri;
    this.b = paramInt1;
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      paramArrayOfbyte = null; 
    this.c = paramArrayOfbyte;
    this.e = paramLong1;
    this.f = paramLong2;
    this.g = paramLong3;
    this.h = paramString;
    this.i = paramInt2;
    this.d = Collections.unmodifiableMap(new HashMap<String, String>(paramMap));
  }
  
  public l(Uri paramUri, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt) {
    this(paramUri, null, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }
  
  public l(Uri paramUri, long paramLong1, long paramLong2, String paramString) {
    this(paramUri, paramLong1, paramLong1, paramLong2, paramString, 0);
  }
  
  public l(Uri paramUri, long paramLong1, long paramLong2, String paramString, int paramInt) {
    this(paramUri, paramLong1, paramLong1, paramLong2, paramString, paramInt);
  }
  
  public l(Uri paramUri, long paramLong1, long paramLong2, String paramString, int paramInt, Map<String, String> paramMap) {
    this(paramUri, c(null), null, paramLong1, paramLong1, paramLong2, paramString, paramInt, paramMap);
  }
  
  public l(Uri paramUri, byte[] paramArrayOfbyte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt) {
    this(paramUri, c(paramArrayOfbyte), paramArrayOfbyte, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }
  
  public static String b(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt == 3)
          return "HEAD"; 
        throw new AssertionError(paramInt);
      } 
      return "POST";
    } 
    return "GET";
  }
  
  private static int c(byte[] paramArrayOfbyte) {
    boolean bool;
    if (paramArrayOfbyte != null) {
      bool = true;
    } else {
      bool = true;
    } 
    return bool;
  }
  
  public final String a() {
    return b(this.b);
  }
  
  public boolean d(int paramInt) {
    boolean bool;
    if ((this.i & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public l e(long paramLong) {
    long l1 = this.g;
    long l2 = -1L;
    if (l1 != -1L)
      l2 = l1 - paramLong; 
    return f(paramLong, l2);
  }
  
  public l f(long paramLong1, long paramLong2) {
    return (paramLong1 == 0L && this.g == paramLong2) ? this : new l(this.a, this.b, this.c, this.e + paramLong1, this.f + paramLong1, paramLong2, this.h, this.i, this.d);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DataSpec[");
    stringBuilder.append(a());
    stringBuilder.append(" ");
    stringBuilder.append(this.a);
    stringBuilder.append(", ");
    stringBuilder.append(Arrays.toString(this.c));
    stringBuilder.append(", ");
    stringBuilder.append(this.e);
    stringBuilder.append(", ");
    stringBuilder.append(this.f);
    stringBuilder.append(", ");
    stringBuilder.append(this.g);
    stringBuilder.append(", ");
    stringBuilder.append(this.h);
    stringBuilder.append(", ");
    stringBuilder.append(this.i);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */