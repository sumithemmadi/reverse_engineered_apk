package com.google.android.exoplayer2.text.o;

import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.util.Collections;
import java.util.List;

final class d implements e {
  private final List<List<b>> b;
  
  private final List<Long> c;
  
  public d(List<List<b>> paramList, List<Long> paramList1) {
    this.b = paramList;
    this.c = paramList1;
  }
  
  public int a(long paramLong) {
    int i = h0.c(this.c, Long.valueOf(paramLong), false, false);
    if (i >= this.c.size())
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
    if (paramInt < this.c.size()) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    return ((Long)this.c.get(paramInt)).longValue();
  }
  
  public List<b> f(long paramLong) {
    int i = h0.e(this.c, Long.valueOf(paramLong), true, false);
    return (i == -1) ? Collections.emptyList() : this.b.get(i);
  }
  
  public int i() {
    return this.c.size();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */