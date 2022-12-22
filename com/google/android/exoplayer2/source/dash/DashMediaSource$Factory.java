package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.s;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.util.e;

public final class DashMediaSource$Factory {
  private final a a;
  
  private final j.a b;
  
  private k<?> c;
  
  private p d;
  
  private u e;
  
  private long f;
  
  public DashMediaSource$Factory(a parama, j.a parama1) {
    this.a = (a)e.e(parama);
    this.b = parama1;
    this.c = j.d();
    this.e = (u)new s();
    this.f = 30000L;
    this.d = (p)new q();
  }
  
  public DashMediaSource$Factory(j.a parama) {
    this(new b(parama), parama);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/dash/DashMediaSource$Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */