package com.google.android.exoplayer2.text.q;

import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.h0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class f implements e {
  private final b b;
  
  private final long[] c;
  
  private final Map<String, e> d;
  
  private final Map<String, c> e;
  
  private final Map<String, String> f;
  
  public f(b paramb, Map<String, e> paramMap, Map<String, c> paramMap1, Map<String, String> paramMap2) {
    this.b = paramb;
    this.e = paramMap1;
    this.f = paramMap2;
    if (paramMap != null) {
      paramMap = Collections.unmodifiableMap(paramMap);
    } else {
      paramMap = Collections.emptyMap();
    } 
    this.d = paramMap;
    this.c = paramb.j();
  }
  
  public int a(long paramLong) {
    int i = h0.d(this.c, paramLong, false, false);
    if (i >= this.c.length)
      i = -1; 
    return i;
  }
  
  public long e(int paramInt) {
    return this.c[paramInt];
  }
  
  public List<b> f(long paramLong) {
    return this.b.h(paramLong, this.d, this.e, this.f);
  }
  
  public int i() {
    return this.c.length;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/q/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */