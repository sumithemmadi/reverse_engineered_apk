package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.trackselection.h;
import com.google.android.exoplayer2.trackselection.i;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.f;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class c0 extends t implements o0 {
  final i b;
  
  private final r0[] c;
  
  private final h d;
  
  private final Handler e;
  
  private final d0 f;
  
  private final Handler g;
  
  private final CopyOnWriteArrayList<t.a> h;
  
  private final y0.b i;
  
  private final ArrayDeque<Runnable> j;
  
  private v k;
  
  private boolean l;
  
  private int m;
  
  private int n;
  
  private boolean o;
  
  private int p;
  
  private boolean q;
  
  private boolean r;
  
  private int s;
  
  private l0 t;
  
  private w0 u;
  
  private k0 v;
  
  private int w;
  
  private int x;
  
  private long y;
  
  @SuppressLint({"HandlerLeak"})
  public c0(r0[] paramArrayOfr0, h paramh, g0 paramg0, f paramf, f paramf1, Looper paramLooper) {
    boolean bool;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Init ");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" [");
    stringBuilder.append("ExoPlayerLib/2.11.3");
    stringBuilder.append("] [");
    stringBuilder.append(h0.e);
    stringBuilder.append("]");
    o.e("ExoPlayerImpl", stringBuilder.toString());
    if (paramArrayOfr0.length > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.c = (r0[])e.e(paramArrayOfr0);
    this.d = (h)e.e(paramh);
    this.l = false;
    this.n = 0;
    this.o = false;
    this.h = new CopyOnWriteArrayList<t.a>();
    i i1 = new i(new u0[paramArrayOfr0.length], new com.google.android.exoplayer2.trackselection.f[paramArrayOfr0.length], null);
    this.b = i1;
    this.i = new y0.b();
    this.t = l0.a;
    this.u = w0.e;
    this.m = 0;
    a a = new a(this, paramLooper);
    this.e = a;
    this.v = k0.h(0L, i1);
    this.j = new ArrayDeque<Runnable>();
    d0 d01 = new d0(paramArrayOfr0, paramh, i1, paramg0, paramf, this.l, this.n, this.o, a, paramf1);
    this.f = d01;
    this.g = new Handler(d01.r());
  }
  
  private static void A(CopyOnWriteArrayList<t.a> paramCopyOnWriteArrayList, t.b paramb) {
    Iterator<t.a> iterator = paramCopyOnWriteArrayList.iterator();
    while (iterator.hasNext())
      ((t.a)iterator.next()).a(paramb); 
  }
  
  private void I(t.b paramb) {
    J(new m(new CopyOnWriteArrayList<t.a>(this.h), paramb));
  }
  
  private void J(Runnable paramRunnable) {
    boolean bool = this.j.isEmpty();
    this.j.addLast(paramRunnable);
    if ((bool ^ true) != 0)
      return; 
    while (!this.j.isEmpty()) {
      ((Runnable)this.j.peekFirst()).run();
      this.j.removeFirst();
    } 
  }
  
  private long K(v.a parama, long paramLong) {
    paramLong = v.b(paramLong);
    this.v.b.h(parama.a, this.i);
    return paramLong + this.i.k();
  }
  
  private boolean P() {
    return (this.v.b.q() || this.p > 0);
  }
  
  private void Q(k0 paramk0, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2) {
    boolean bool1 = isPlaying();
    k0 k01 = this.v;
    this.v = paramk0;
    boolean bool2 = isPlaying();
    CopyOnWriteArrayList<t.a> copyOnWriteArrayList = this.h;
    h h1 = this.d;
    boolean bool3 = this.l;
    if (bool1 != bool2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    J(new b(paramk0, k01, copyOnWriteArrayList, h1, paramBoolean1, paramInt1, paramInt2, paramBoolean2, bool3, bool1));
  }
  
  private k0 w(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt) {
    v.a a;
    long l2;
    y0 y0;
    ExoPlaybackException exoPlaybackException;
    TrackGroupArray trackGroupArray;
    i i1;
    long l1 = 0L;
    boolean bool = false;
    if (paramBoolean1) {
      this.w = 0;
      this.x = 0;
      this.y = 0L;
    } else {
      this.w = i0();
      this.x = v();
      this.y = getCurrentPosition();
    } 
    if (paramBoolean1 || paramBoolean2)
      bool = true; 
    if (bool) {
      a = this.v.i(this.o, this.a, this.i);
    } else {
      a = this.v.c;
    } 
    if (!bool)
      l1 = this.v.n; 
    if (bool) {
      l2 = -9223372036854775807L;
    } else {
      l2 = this.v.e;
    } 
    if (paramBoolean2) {
      y0 = y0.a;
    } else {
      y0 = this.v.b;
    } 
    if (paramBoolean3) {
      exoPlaybackException = null;
    } else {
      exoPlaybackException = this.v.g;
    } 
    if (paramBoolean2) {
      trackGroupArray = TrackGroupArray.b;
    } else {
      trackGroupArray = this.v.i;
    } 
    if (paramBoolean2) {
      i1 = this.b;
    } else {
      i1 = this.v.j;
    } 
    return new k0(y0, a, l1, l2, paramInt, exoPlaybackException, false, trackGroupArray, i1, a, l1, 0L, l1);
  }
  
  private void y(k0 paramk0, int paramInt1, boolean paramBoolean, int paramInt2) {
    paramInt1 = this.p - paramInt1;
    this.p = paramInt1;
    if (paramInt1 == 0) {
      k0 k01 = paramk0;
      if (paramk0.d == -9223372036854775807L)
        k01 = paramk0.c(paramk0.c, 0L, paramk0.e, paramk0.m); 
      if (!this.v.b.q() && k01.b.q()) {
        this.x = 0;
        this.w = 0;
        this.y = 0L;
      } 
      if (this.q) {
        paramInt1 = 0;
      } else {
        paramInt1 = 2;
      } 
      boolean bool = this.r;
      this.q = false;
      this.r = false;
      Q(k01, paramBoolean, paramInt2, paramInt1, bool);
    } 
  }
  
  private void z(l0 paraml0, boolean paramBoolean) {
    if (paramBoolean)
      this.s--; 
    if (this.s == 0 && !this.t.equals(paraml0)) {
      this.t = paraml0;
      I(new b(paraml0));
    } 
  }
  
  public void L(v paramv, boolean paramBoolean1, boolean paramBoolean2) {
    this.k = paramv;
    k0 k01 = w(paramBoolean1, paramBoolean2, true, 2);
    this.q = true;
    this.p++;
    this.f.O(paramv, paramBoolean1, paramBoolean2);
    Q(k01, false, 4, 1, false);
  }
  
  public void M() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Release ");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" [");
    stringBuilder.append("ExoPlayerLib/2.11.3");
    stringBuilder.append("] [");
    stringBuilder.append(h0.e);
    stringBuilder.append("] [");
    stringBuilder.append(e0.b());
    stringBuilder.append("]");
    o.e("ExoPlayerImpl", stringBuilder.toString());
    this.k = null;
    this.f.Q();
    this.e.removeCallbacksAndMessages(null);
    this.v = w(false, false, false, 1);
  }
  
  public void N(boolean paramBoolean, int paramInt) {
    boolean bool2;
    boolean bool3;
    boolean bool1 = isPlaying();
    if (this.l && this.m == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (paramBoolean && paramInt == 0) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (bool2 != bool3)
      this.f.l0(bool3); 
    if (this.l != paramBoolean) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (this.m != paramInt) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    this.l = paramBoolean;
    this.m = paramInt;
    boolean bool4 = isPlaying();
    if (bool1 != bool4) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool2 || bool3 || bool1)
      I(new d(bool2, paramBoolean, this.v.f, bool3, paramInt, bool1, bool4)); 
  }
  
  public void O(l0 paraml0) {
    l0 l01 = paraml0;
    if (paraml0 == null)
      l01 = l0.a; 
    if (this.t.equals(l01))
      return; 
    this.s++;
    this.t = l01;
    this.f.n0(l01);
    I(new n(l01));
  }
  
  public int V() {
    return this.v.f;
  }
  
  public l0 W() {
    return this.t;
  }
  
  public long X() {
    if (Y()) {
      long l;
      k0 k01 = this.v;
      if (k01.k.equals(k01.c)) {
        l = v.b(this.v.l);
      } else {
        l = getDuration();
      } 
      return l;
    } 
    return w0();
  }
  
  public boolean Y() {
    boolean bool;
    if (!P() && this.v.c.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public long Z() {
    return v.b(this.v.m);
  }
  
  public void a0(int paramInt, long paramLong) {
    y0 y0 = this.v.b;
    if (paramInt >= 0 && (y0.q() || paramInt < y0.p())) {
      this.r = true;
      this.p++;
      if (Y()) {
        o.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        this.e.obtainMessage(0, 1, -1, this.v).sendToTarget();
        return;
      } 
      this.w = paramInt;
      if (y0.q()) {
        long l;
        if (paramLong == -9223372036854775807L) {
          l = 0L;
        } else {
          l = paramLong;
        } 
        this.y = l;
        this.x = 0;
      } else {
        long l;
        if (paramLong == -9223372036854775807L) {
          l = y0.n(paramInt, this.a).b();
        } else {
          l = v.a(paramLong);
        } 
        Pair<Object, Long> pair = y0.j(this.a, this.i, paramInt, l);
        this.y = v.b(l);
        this.x = y0.b(pair.first);
      } 
      this.f.a0(y0, paramInt, v.a(paramLong));
      I(c.a);
      return;
    } 
    throw new IllegalSeekPositionException(y0, paramInt, paramLong);
  }
  
  public boolean b0() {
    return this.l;
  }
  
  public void c0(boolean paramBoolean) {
    if (this.o != paramBoolean) {
      this.o = paramBoolean;
      this.f.s0(paramBoolean);
      I(new l(paramBoolean));
    } 
  }
  
  public ExoPlaybackException d0() {
    return this.v.g;
  }
  
  public void f0(o0.a parama) {
    this.h.addIfAbsent(new t.a(parama));
  }
  
  public int g0() {
    byte b1;
    if (Y()) {
      b1 = this.v.c.c;
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public long getCurrentPosition() {
    if (P())
      return this.y; 
    if (this.v.c.a())
      return v.b(this.v.n); 
    k0 k01 = this.v;
    return K(k01.c, k01.n);
  }
  
  public long getDuration() {
    if (Y()) {
      k0 k01 = this.v;
      v.a a = k01.c;
      k01.b.h(a.a, this.i);
      return v.b(this.i.b(a.b, a.c));
    } 
    return q();
  }
  
  public void h0(o0.a parama) {
    for (t.a a1 : this.h) {
      if (a1.a.equals(parama)) {
        a1.b();
        this.h.remove(a1);
      } 
    } 
  }
  
  public int i0() {
    if (P())
      return this.w; 
    k0 k01 = this.v;
    return (k01.b.h(k01.c.a, this.i)).c;
  }
  
  public void j0(boolean paramBoolean) {
    N(paramBoolean, 0);
  }
  
  public o0.c k0() {
    return null;
  }
  
  public long l0() {
    if (Y()) {
      long l;
      k0 k01 = this.v;
      k01.b.h(k01.c.a, this.i);
      k01 = this.v;
      if (k01.e == -9223372036854775807L) {
        l = k01.b.n(i0(), this.a).a();
      } else {
        l = this.i.k() + v.b(this.v.e);
      } 
      return l;
    } 
    return getCurrentPosition();
  }
  
  public int n0() {
    byte b1;
    if (Y()) {
      b1 = this.v.c.b;
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public void o0(int paramInt) {
    if (this.n != paramInt) {
      this.n = paramInt;
      this.f.p0(paramInt);
      I(new o(paramInt));
    } 
  }
  
  public int q0() {
    return this.m;
  }
  
  public TrackGroupArray r0() {
    return this.v.i;
  }
  
  public int s0() {
    return this.n;
  }
  
  public y0 t0() {
    return this.v.b;
  }
  
  public p0 u(p0.b paramb) {
    return new p0(this.f, paramb, this.v.b, i0(), this.g);
  }
  
  public Looper u0() {
    return this.e.getLooper();
  }
  
  public int v() {
    if (P())
      return this.x; 
    k0 k01 = this.v;
    return k01.b.b(k01.c.a);
  }
  
  public boolean v0() {
    return this.o;
  }
  
  public long w0() {
    if (P())
      return this.y; 
    k0 k01 = this.v;
    if (k01.k.d != k01.c.d)
      return k01.b.n(i0(), this.a).c(); 
    long l = k01.l;
    if (this.v.k.a()) {
      k01 = this.v;
      y0.b b1 = k01.b.h(k01.k.a, this.i);
      l = b1.f(this.v.k.b);
      if (l == Long.MIN_VALUE)
        l = b1.d; 
    } 
    return K(this.v.k, l);
  }
  
  void x(Message paramMessage) {
    int j = paramMessage.what;
    boolean bool1 = false;
    boolean bool2 = false;
    if (j != 0) {
      if (j == 1) {
        l0 l01 = (l0)paramMessage.obj;
        if (paramMessage.arg1 != 0)
          bool2 = true; 
        z(l01, bool2);
      } else {
        throw new IllegalStateException();
      } 
    } else {
      k0 k01 = (k0)paramMessage.obj;
      j = paramMessage.arg1;
      int k = paramMessage.arg2;
      bool2 = bool1;
      if (k != -1)
        bool2 = true; 
      y(k01, j, bool2, k);
    } 
  }
  
  public g x0() {
    return this.v.j.c;
  }
  
  public int y0(int paramInt) {
    return this.c[paramInt].n();
  }
  
  public o0.b z0() {
    return null;
  }
  
  class a extends Handler {
    a(c0 this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    public void handleMessage(Message param1Message) {
      this.a.x(param1Message);
    }
  }
  
  private static final class b implements Runnable {
    private final k0 b;
    
    private final CopyOnWriteArrayList<t.a> c;
    
    private final h d;
    
    private final boolean e;
    
    private final int f;
    
    private final int g;
    
    private final boolean h;
    
    private final boolean i;
    
    private final boolean j;
    
    private final boolean k;
    
    private final boolean l;
    
    private final boolean m;
    
    private final boolean n;
    
    private final boolean o;
    
    public b(k0 param1k01, k0 param1k02, CopyOnWriteArrayList<t.a> param1CopyOnWriteArrayList, h param1h, boolean param1Boolean1, int param1Int1, int param1Int2, boolean param1Boolean2, boolean param1Boolean3, boolean param1Boolean4) {
      this.b = param1k01;
      this.c = new CopyOnWriteArrayList<t.a>(param1CopyOnWriteArrayList);
      this.d = param1h;
      this.e = param1Boolean1;
      this.f = param1Int1;
      this.g = param1Int2;
      this.h = param1Boolean2;
      this.n = param1Boolean3;
      this.o = param1Boolean4;
      param1Int2 = param1k02.f;
      param1Int1 = param1k01.f;
      param1Boolean2 = true;
      if (param1Int2 != param1Int1) {
        param1Boolean1 = true;
      } else {
        param1Boolean1 = false;
      } 
      this.i = param1Boolean1;
      ExoPlaybackException exoPlaybackException1 = param1k02.g;
      ExoPlaybackException exoPlaybackException2 = param1k01.g;
      if (exoPlaybackException1 != exoPlaybackException2 && exoPlaybackException2 != null) {
        param1Boolean1 = true;
      } else {
        param1Boolean1 = false;
      } 
      this.j = param1Boolean1;
      if (param1k02.b != param1k01.b) {
        param1Boolean1 = true;
      } else {
        param1Boolean1 = false;
      } 
      this.k = param1Boolean1;
      if (param1k02.h != param1k01.h) {
        param1Boolean1 = true;
      } else {
        param1Boolean1 = false;
      } 
      this.l = param1Boolean1;
      if (param1k02.j != param1k01.j) {
        param1Boolean1 = param1Boolean2;
      } else {
        param1Boolean1 = false;
      } 
      this.m = param1Boolean1;
    }
    
    public void run() {
      if (this.k || this.g == 0)
        c0.t(this.c, new f(this)); 
      if (this.e)
        c0.t(this.c, new h(this)); 
      if (this.j)
        c0.t(this.c, new e(this)); 
      if (this.m) {
        this.d.c(this.b.j.d);
        c0.t(this.c, new i(this));
      } 
      if (this.l)
        c0.t(this.c, new g(this)); 
      if (this.i)
        c0.t(this.c, new k(this)); 
      if (this.o)
        c0.t(this.c, new j(this)); 
      if (this.h)
        c0.t(this.c, q.a); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */