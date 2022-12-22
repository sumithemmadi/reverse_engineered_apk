package com.google.android.exoplayer2.source.e0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.util.e;

public abstract class d extends b {
  public final long i;
  
  public d(j paramj, l paraml, Format paramFormat, int paramInt, Object paramObject, long paramLong1, long paramLong2, long paramLong3) {
    super(paramj, paraml, 1, paramFormat, paramInt, paramObject, paramLong1, paramLong2);
    e.e(paramFormat);
    this.i = paramLong3;
  }
  
  public long g() {
    long l1 = this.i;
    long l2 = -1L;
    if (l1 != -1L)
      l2 = 1L + l1; 
    return l2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/e0/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */