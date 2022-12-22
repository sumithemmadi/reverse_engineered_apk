package com.google.android.exoplayer2.text.r;

import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.e;
import java.util.Collections;
import java.util.List;

final class b implements e {
  public static final b b = new b();
  
  private final List<com.google.android.exoplayer2.text.b> c = Collections.emptyList();
  
  private b() {}
  
  public b(com.google.android.exoplayer2.text.b paramb) {}
  
  public int a(long paramLong) {
    byte b1;
    if (paramLong < 0L) {
      b1 = 0;
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public long e(int paramInt) {
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    return 0L;
  }
  
  public List<com.google.android.exoplayer2.text.b> f(long paramLong) {
    List<?> list;
    if (paramLong >= 0L) {
      list = this.c;
    } else {
      list = Collections.emptyList();
    } 
    return (List)list;
  }
  
  public int i() {
    return 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/r/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */