package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.e0.d;
import com.google.android.exoplayer2.source.e0.e;
import java.util.List;

public final class c extends b {
  private final int g;
  
  private final Object h;
  
  public c(TrackGroup paramTrackGroup, int paramInt1, int paramInt2, Object paramObject) {
    super(paramTrackGroup, new int[] { paramInt1 });
    this.g = paramInt2;
    this.h = paramObject;
  }
  
  public int b() {
    return 0;
  }
  
  public void g(long paramLong1, long paramLong2, long paramLong3, List<? extends d> paramList, e[] paramArrayOfe) {}
  
  public int j() {
    return this.g;
  }
  
  public Object l() {
    return this.h;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */