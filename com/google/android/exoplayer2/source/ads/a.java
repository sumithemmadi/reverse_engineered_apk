package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.util.e;
import java.util.Arrays;

public final class a {
  public static final a a = new a(new long[0]);
  
  public final int b;
  
  public final long[] c;
  
  public final a[] d;
  
  public final long e;
  
  public final long f;
  
  public a(long... paramVarArgs) {
    int i = paramVarArgs.length;
    this.b = i;
    this.c = Arrays.copyOf(paramVarArgs, i);
    this.d = new a[i];
    for (byte b = 0; b < i; b++)
      this.d[b] = new a(); 
    this.e = 0L;
    this.f = -9223372036854775807L;
  }
  
  private boolean c(long paramLong, int paramInt) {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramLong == Long.MIN_VALUE)
      return false; 
    long l = this.c[paramInt];
    if (l == Long.MIN_VALUE) {
      l = this.f;
      if (l == -9223372036854775807L || paramLong < l)
        bool2 = true; 
      return bool2;
    } 
    bool2 = bool1;
    if (paramLong < l)
      bool2 = true; 
    return bool2;
  }
  
  public int a(long paramLong1, long paramLong2) {
    byte b1 = -1;
    byte b2 = b1;
    if (paramLong1 != Long.MIN_VALUE)
      if (paramLong2 != -9223372036854775807L && paramLong1 >= paramLong2) {
        b2 = b1;
      } else {
        byte b = 0;
        while (true) {
          long[] arrayOfLong = this.c;
          if (b < arrayOfLong.length && arrayOfLong[b] != Long.MIN_VALUE && (paramLong1 >= arrayOfLong[b] || !this.d[b].c())) {
            b++;
            continue;
          } 
          break;
        } 
        b2 = b1;
        if (b < this.c.length)
          b2 = b; 
      }  
    return b2;
  }
  
  public int b(long paramLong) {
    int i;
    for (i = this.c.length - 1; i >= 0 && c(paramLong, i); i--);
    if (i < 0 || !this.d[i].c())
      i = -1; 
    return i;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || a.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((a)paramObject).b || this.e != ((a)paramObject).e || this.f != ((a)paramObject).f || !Arrays.equals(this.c, ((a)paramObject).c) || !Arrays.equals((Object[])this.d, (Object[])((a)paramObject).d))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (((this.b * 31 + (int)this.e) * 31 + (int)this.f) * 31 + Arrays.hashCode(this.c)) * 31 + Arrays.hashCode((Object[])this.d);
  }
  
  public static final class a {
    public final int a;
    
    public final Uri[] b;
    
    public final int[] c;
    
    public final long[] d;
    
    public a() {
      this(-1, new int[0], new Uri[0], new long[0]);
    }
    
    private a(int param1Int, int[] param1ArrayOfint, Uri[] param1ArrayOfUri, long[] param1ArrayOflong) {
      boolean bool;
      if (param1ArrayOfint.length == param1ArrayOfUri.length) {
        bool = true;
      } else {
        bool = false;
      } 
      e.a(bool);
      this.a = param1Int;
      this.c = param1ArrayOfint;
      this.b = param1ArrayOfUri;
      this.d = param1ArrayOflong;
    }
    
    public int a() {
      return b(-1);
    }
    
    public int b(int param1Int) {
      param1Int++;
      while (true) {
        int[] arrayOfInt = this.c;
        if (param1Int >= arrayOfInt.length || arrayOfInt[param1Int] == 0 || arrayOfInt[param1Int] == 1)
          break; 
        param1Int++;
      } 
      return param1Int;
    }
    
    public boolean c() {
      return (this.a == -1 || a() < this.a);
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || a.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (this.a != ((a)param1Object).a || !Arrays.equals((Object[])this.b, (Object[])((a)param1Object).b) || !Arrays.equals(this.c, ((a)param1Object).c) || !Arrays.equals(this.d, ((a)param1Object).d))
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return ((this.a * 31 + Arrays.hashCode((Object[])this.b)) * 31 + Arrays.hashCode(this.c)) * 31 + Arrays.hashCode(this.d);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/ads/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */