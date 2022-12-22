package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.trackselection.i;

final class k0 {
  private static final v.a a = new v.a(new Object());
  
  public final y0 b;
  
  public final v.a c;
  
  public final long d;
  
  public final long e;
  
  public final int f;
  
  public final ExoPlaybackException g;
  
  public final boolean h;
  
  public final TrackGroupArray i;
  
  public final i j;
  
  public final v.a k;
  
  public volatile long l;
  
  public volatile long m;
  
  public volatile long n;
  
  public k0(y0 paramy0, v.a parama1, long paramLong1, long paramLong2, int paramInt, ExoPlaybackException paramExoPlaybackException, boolean paramBoolean, TrackGroupArray paramTrackGroupArray, i parami, v.a parama2, long paramLong3, long paramLong4, long paramLong5) {
    this.b = paramy0;
    this.c = parama1;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramInt;
    this.g = paramExoPlaybackException;
    this.h = paramBoolean;
    this.i = paramTrackGroupArray;
    this.j = parami;
    this.k = parama2;
    this.l = paramLong3;
    this.m = paramLong4;
    this.n = paramLong5;
  }
  
  public static k0 h(long paramLong, i parami) {
    y0 y01 = y0.a;
    v.a a1 = a;
    return new k0(y01, a1, paramLong, -9223372036854775807L, 1, null, false, TrackGroupArray.b, parami, a1, paramLong, 0L, paramLong);
  }
  
  public k0 a(boolean paramBoolean) {
    return new k0(this.b, this.c, this.d, this.e, this.f, this.g, paramBoolean, this.i, this.j, this.k, this.l, this.m, this.n);
  }
  
  public k0 b(v.a parama) {
    return new k0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, parama, this.l, this.m, this.n);
  }
  
  public k0 c(v.a parama, long paramLong1, long paramLong2, long paramLong3) {
    y0 y01 = this.b;
    if (!parama.a())
      paramLong2 = -9223372036854775807L; 
    return new k0(y01, parama, paramLong1, paramLong2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, paramLong3, paramLong1);
  }
  
  public k0 d(ExoPlaybackException paramExoPlaybackException) {
    return new k0(this.b, this.c, this.d, this.e, this.f, paramExoPlaybackException, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
  }
  
  public k0 e(int paramInt) {
    return new k0(this.b, this.c, this.d, this.e, paramInt, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
  }
  
  public k0 f(y0 paramy0) {
    return new k0(paramy0, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
  }
  
  public k0 g(TrackGroupArray paramTrackGroupArray, i parami) {
    return new k0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, paramTrackGroupArray, parami, this.k, this.l, this.m, this.n);
  }
  
  public v.a i(boolean paramBoolean, y0.c paramc, y0.b paramb) {
    if (this.b.q())
      return a; 
    int j = this.b.a(paramBoolean);
    int k = (this.b.n(j, paramc)).j;
    int m = this.b.b(this.c.a);
    long l1 = -1L;
    long l2 = l1;
    if (m != -1) {
      l2 = l1;
      if (j == (this.b.f(m, paramb)).c)
        l2 = this.c.d; 
    } 
    return new v.a(this.b.m(k), l2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */