package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.e;

public final class w0 {
  public static final w0 a;
  
  public static final w0 b = new w0(Long.MAX_VALUE, Long.MAX_VALUE);
  
  public static final w0 c = new w0(Long.MAX_VALUE, 0L);
  
  public static final w0 d = new w0(0L, Long.MAX_VALUE);
  
  public static final w0 e;
  
  public final long f;
  
  public final long g;
  
  static {
    e = w01;
  }
  
  public w0(long paramLong1, long paramLong2) {
    boolean bool2;
    boolean bool1 = true;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    if (paramLong2 >= 0L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    this.f = paramLong1;
    this.g = paramLong2;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || w0.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.f != ((w0)paramObject).f || this.g != ((w0)paramObject).g)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (int)this.f * 31 + (int)this.g;
  }
  
  static {
    w0 w01 = new w0(0L, 0L);
    a = w01;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */