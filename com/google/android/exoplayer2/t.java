package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.h0;

public abstract class t implements o0 {
  protected final y0.c a = new y0.c();
  
  private int r() {
    int i = s0();
    int j = i;
    if (i == 1)
      j = 0; 
    return j;
  }
  
  public final boolean e0() {
    boolean bool;
    y0 y0 = t0();
    if (!y0.q() && (y0.n(i0(), this.a)).g) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean hasNext() {
    boolean bool;
    if (p0() != -1) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean hasPrevious() {
    boolean bool;
    if (m0() != -1) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean isPlaying() {
    boolean bool;
    if (V() == 3 && b0() && q0() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final int m0() {
    int i;
    y0 y0 = t0();
    if (y0.q()) {
      i = -1;
    } else {
      i = y0.l(i0(), r(), v0());
    } 
    return i;
  }
  
  public final int p() {
    long l1 = X();
    long l2 = getDuration();
    int i = 100;
    if (l1 == -9223372036854775807L || l2 == -9223372036854775807L)
      return 0; 
    if (l2 != 0L)
      i = h0.n((int)(l1 * 100L / l2), 0, 100); 
    return i;
  }
  
  public final int p0() {
    int i;
    y0 y0 = t0();
    if (y0.q()) {
      i = -1;
    } else {
      i = y0.e(i0(), r(), v0());
    } 
    return i;
  }
  
  public final long q() {
    long l;
    y0 y0 = t0();
    if (y0.q()) {
      l = -9223372036854775807L;
    } else {
      l = y0.n(i0(), this.a).c();
    } 
    return l;
  }
  
  public final void s(long paramLong) {
    a0(i0(), paramLong);
  }
  
  protected static final class a {
    public final o0.a a;
    
    private boolean b;
    
    public a(o0.a param1a) {
      this.a = param1a;
    }
    
    public void a(t.b param1b) {
      if (!this.b)
        param1b.a(this.a); 
    }
    
    public void b() {
      this.b = true;
    }
    
    public boolean equals(Object param1Object) {
      return (this == param1Object) ? true : ((param1Object == null || a.class != param1Object.getClass()) ? false : this.a.equals(((a)param1Object).a));
    }
    
    public int hashCode() {
      return this.a.hashCode();
    }
  }
  
  protected static interface b {
    void a(o0.a param1a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */