package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.e0;

public final class o {
  private final SparseArray<e0> a = new SparseArray();
  
  public e0 a(int paramInt) {
    e0 e01 = (e0)this.a.get(paramInt);
    e0 e02 = e01;
    if (e01 == null) {
      e02 = new e0(Long.MAX_VALUE);
      this.a.put(paramInt, e02);
    } 
    return e02;
  }
  
  public void b() {
    this.a.clear();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */