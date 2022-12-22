package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.y0;

public abstract class h {
  private a a;
  
  private f b;
  
  protected final f a() {
    return (f)e.e(this.b);
  }
  
  public final void b(a parama, f paramf) {
    this.a = parama;
    this.b = paramf;
  }
  
  public abstract void c(Object paramObject);
  
  public abstract i d(t0[] paramArrayOft0, TrackGroupArray paramTrackGroupArray, v.a parama, y0 paramy0);
  
  public static interface a {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */