package com.google.android.exoplayer2.text.s;

import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.e;
import java.util.Collections;
import java.util.List;

final class c implements e {
  private final List<b> b;
  
  public c(List<b> paramList) {
    this.b = Collections.unmodifiableList(paramList);
  }
  
  public int a(long paramLong) {
    byte b;
    if (paramLong < 0L) {
      b = 0;
    } else {
      b = -1;
    } 
    return b;
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
  
  public List<b> f(long paramLong) {
    List<?> list;
    if (paramLong >= 0L) {
      list = this.b;
    } else {
      list = Collections.emptyList();
    } 
    return (List)list;
  }
  
  public int i() {
    return 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */