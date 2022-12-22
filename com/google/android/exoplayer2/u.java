package com.google.android.exoplayer2;

import android.os.Looper;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.q;

public abstract class u implements r0, t0 {
  private final int b;
  
  private final f0 c;
  
  private u0 d;
  
  private int e;
  
  private int f;
  
  private b0 g;
  
  private Format[] h;
  
  private long i;
  
  private long j;
  
  private boolean k;
  
  private boolean l;
  
  public u(int paramInt) {
    this.b = paramInt;
    this.c = new f0();
    this.j = Long.MIN_VALUE;
  }
  
  protected static boolean N(k<?> paramk, DrmInitData paramDrmInitData) {
    return (paramDrmInitData == null) ? true : ((paramk == null) ? false : paramk.f(paramDrmInitData));
  }
  
  public final void A(long paramLong) {
    this.k = false;
    this.j = paramLong;
    G(paramLong, false);
  }
  
  public final boolean B() {
    return this.k;
  }
  
  public q C() {
    return null;
  }
  
  public final void D(Format[] paramArrayOfFormat, b0 paramb0, long paramLong) {
    e.f(this.k ^ true);
    this.g = paramb0;
    this.j = paramLong;
    this.h = paramArrayOfFormat;
    this.i = paramLong;
    K(paramArrayOfFormat, paramLong);
  }
  
  protected abstract void E();
  
  protected void F(boolean paramBoolean) {}
  
  protected abstract void G(long paramLong, boolean paramBoolean);
  
  protected void H() {}
  
  protected void I() {}
  
  protected void J() {}
  
  protected void K(Format[] paramArrayOfFormat, long paramLong) {}
  
  protected final int L(f0 paramf0, e parame, boolean paramBoolean) {
    int i = this.g.a(paramf0, parame, paramBoolean);
    byte b = -4;
    if (i == -4) {
      if (parame.isEndOfStream()) {
        this.j = Long.MIN_VALUE;
        if (!this.k)
          b = -3; 
        return b;
      } 
      long l = parame.d + this.i;
      parame.d = l;
      this.j = Math.max(this.j, l);
    } else if (i == -5) {
      Format format = paramf0.c;
      long l = format.n;
      if (l != Long.MAX_VALUE)
        paramf0.c = format.k(l + this.i); 
    } 
    return i;
  }
  
  protected int M(long paramLong) {
    return this.g.c(paramLong - this.i);
  }
  
  public final void a() {
    boolean bool;
    if (this.f == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.c.a();
    H();
  }
  
  public int d() {
    return 0;
  }
  
  public void e(int paramInt, Object paramObject) {}
  
  protected final ExoPlaybackException f(Exception paramException, Format paramFormat) {
    if (paramFormat != null && !this.l) {
      byte b1;
      this.l = true;
      try {
        b1 = s0.d(b(paramFormat));
      } catch (ExoPlaybackException exoPlaybackException) {
        this.l = false;
      } finally {
        this.l = false;
      } 
      return ExoPlaybackException.createForRenderer(paramException, i(), paramFormat, b1);
    } 
    byte b = 4;
  }
  
  protected final u0 g() {
    return this.d;
  }
  
  public final int getState() {
    return this.f;
  }
  
  protected final f0 h() {
    this.c.a();
    return this.c;
  }
  
  protected final int i() {
    return this.e;
  }
  
  protected final Format[] j() {
    return this.h;
  }
  
  protected final <T extends com.google.android.exoplayer2.drm.m> DrmSession<T> k(Format paramFormat1, Format paramFormat2, k<T> paramk, DrmSession<T> paramDrmSession) {
    DrmSession<T> drmSession;
    DrmInitData drmInitData2 = paramFormat2.m;
    DrmInitData drmInitData3 = null;
    if (paramFormat1 == null) {
      paramFormat1 = null;
    } else {
      drmInitData1 = paramFormat1.m;
    } 
    if ((h0.b(drmInitData2, drmInitData1) ^ true) == 0)
      return paramDrmSession; 
    DrmInitData drmInitData1 = drmInitData3;
    if (paramFormat2.m != null)
      if (paramk != null) {
        drmSession = paramk.e((Looper)e.e(Looper.myLooper()), paramFormat2.m);
      } else {
        throw f(new IllegalStateException("Media requires a DrmSessionManager"), paramFormat2);
      }  
    if (paramDrmSession != null)
      paramDrmSession.a(); 
    return drmSession;
  }
  
  protected final boolean l() {
    boolean bool;
    if (s()) {
      bool = this.k;
    } else {
      bool = this.g.m();
    } 
    return bool;
  }
  
  public final int n() {
    return this.b;
  }
  
  public final void p() {
    int i = this.f;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    e.f(bool);
    this.c.a();
    this.f = 0;
    this.g = null;
    this.h = null;
    this.k = false;
    E();
  }
  
  public final void q(int paramInt) {
    this.e = paramInt;
  }
  
  public final b0 r() {
    return this.g;
  }
  
  public final boolean s() {
    boolean bool;
    if (this.j == Long.MIN_VALUE) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void start() {
    int i = this.f;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    e.f(bool);
    this.f = 2;
    I();
  }
  
  public final void stop() {
    boolean bool;
    if (this.f == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.f = 1;
    J();
  }
  
  public final void t(u0 paramu0, Format[] paramArrayOfFormat, b0 paramb0, long paramLong1, boolean paramBoolean, long paramLong2) {
    boolean bool;
    if (this.f == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.d = paramu0;
    this.f = 1;
    F(paramBoolean);
    D(paramArrayOfFormat, paramb0, paramLong2);
    G(paramLong1, paramBoolean);
  }
  
  public final void u() {
    this.k = true;
  }
  
  public final t0 v() {
    return this;
  }
  
  public final void y() {
    this.g.b();
  }
  
  public final long z() {
    return this.j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */