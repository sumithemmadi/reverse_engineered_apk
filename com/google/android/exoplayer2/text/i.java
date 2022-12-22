package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.b1.f;
import com.google.android.exoplayer2.util.e;
import java.util.List;

public abstract class i extends f implements e {
  private e b;
  
  private long c;
  
  public int a(long paramLong) {
    return ((e)e.e(this.b)).a(paramLong - this.c);
  }
  
  public void clear() {
    super.clear();
    this.b = null;
  }
  
  public long e(int paramInt) {
    return ((e)e.e(this.b)).e(paramInt) + this.c;
  }
  
  public List<b> f(long paramLong) {
    return ((e)e.e(this.b)).f(paramLong - this.c);
  }
  
  public int i() {
    return ((e)e.e(this.b)).i();
  }
  
  public void k(long paramLong1, e parame, long paramLong2) {
    this.timeUs = paramLong1;
    this.b = parame;
    if (paramLong2 != Long.MAX_VALUE)
      paramLong1 = paramLong2; 
    this.c = paramLong1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */