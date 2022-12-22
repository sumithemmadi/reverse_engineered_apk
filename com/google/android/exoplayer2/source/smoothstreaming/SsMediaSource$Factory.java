package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.s;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.util.e;

public final class SsMediaSource$Factory {
  private final b a;
  
  private final j.a b;
  
  private p c;
  
  private k<?> d;
  
  private u e;
  
  private long f;
  
  public SsMediaSource$Factory(b paramb, j.a parama) {
    this.a = (b)e.e(paramb);
    this.b = parama;
    this.d = j.d();
    this.e = (u)new s();
    this.f = 30000L;
    this.c = (p)new q();
  }
  
  public SsMediaSource$Factory(j.a parama) {
    this(new a(parama), parama);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */