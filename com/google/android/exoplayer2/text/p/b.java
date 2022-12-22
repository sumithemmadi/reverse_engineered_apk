package com.google.android.exoplayer2.text.p;

import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.util.Collections;
import java.util.List;

final class b implements e {
  private final com.google.android.exoplayer2.text.b[] b;
  
  private final long[] c;
  
  public b(com.google.android.exoplayer2.text.b[] paramArrayOfb, long[] paramArrayOflong) {
    this.b = paramArrayOfb;
    this.c = paramArrayOflong;
  }
  
  public int a(long paramLong) {
    int i = h0.d(this.c, paramLong, false, false);
    if (i >= this.c.length)
      i = -1; 
    return i;
  }
  
  public long e(int paramInt) {
    boolean bool2;
    boolean bool1 = true;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    if (paramInt < this.c.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    return this.c[paramInt];
  }
  
  public List<com.google.android.exoplayer2.text.b> f(long paramLong) {
    int i = h0.f(this.c, paramLong, true, false);
    if (i != -1) {
      com.google.android.exoplayer2.text.b[] arrayOfB = this.b;
      if (arrayOfB[i] != com.google.android.exoplayer2.text.b.b)
        return Collections.singletonList(arrayOfB[i]); 
    } 
    return Collections.emptyList();
  }
  
  public int i() {
    return this.c.length;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/p/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */