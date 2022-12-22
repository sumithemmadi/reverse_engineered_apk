package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.a1.a;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.audio.k;
import com.google.android.exoplayer2.audio.l;
import com.google.android.exoplayer2.b1.d;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.o;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.e;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.j;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.trackselection.h;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.f;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.video.k;
import com.google.android.exoplayer2.video.m;
import com.google.android.exoplayer2.video.p;
import com.google.android.exoplayer2.video.q;
import com.google.android.exoplayer2.video.r.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class x0 extends t implements o0, o0.c, o0.b {
  private d A;
  
  private d B;
  
  private int C;
  
  private i D;
  
  private float E;
  
  private v F;
  
  private List<b> G;
  
  private m H;
  
  private a I;
  
  private boolean J;
  
  private PriorityTaskManager K;
  
  private boolean L;
  
  private boolean M;
  
  protected final r0[] b;
  
  private final c0 c;
  
  private final Handler d;
  
  private final b e;
  
  private final CopyOnWriteArraySet<p> f;
  
  private final CopyOnWriteArraySet<k> g;
  
  private final CopyOnWriteArraySet<j> h;
  
  private final CopyOnWriteArraySet<e> i;
  
  private final CopyOnWriteArraySet<q> j;
  
  private final CopyOnWriteArraySet<l> k;
  
  private final f l;
  
  private final a m;
  
  private final r n;
  
  private final s o;
  
  private final z0 p;
  
  private Format q;
  
  private Format r;
  
  private k s;
  
  private Surface t;
  
  private boolean u;
  
  private int v;
  
  private SurfaceHolder w;
  
  private TextureView x;
  
  private int y;
  
  private int z;
  
  @Deprecated
  protected x0(Context paramContext, v0 paramv0, h paramh, g0 paramg0, k<o> paramk, f paramf, a parama, f paramf1, Looper paramLooper) {
    this.l = paramf;
    this.m = parama;
    b b1 = new b(null);
    this.e = b1;
    CopyOnWriteArraySet<p> copyOnWriteArraySet = new CopyOnWriteArraySet();
    this.f = copyOnWriteArraySet;
    CopyOnWriteArraySet<k> copyOnWriteArraySet1 = new CopyOnWriteArraySet();
    this.g = copyOnWriteArraySet1;
    this.h = new CopyOnWriteArraySet<j>();
    this.i = new CopyOnWriteArraySet<e>();
    CopyOnWriteArraySet<q> copyOnWriteArraySet2 = new CopyOnWriteArraySet();
    this.j = copyOnWriteArraySet2;
    CopyOnWriteArraySet<l> copyOnWriteArraySet3 = new CopyOnWriteArraySet();
    this.k = copyOnWriteArraySet3;
    Handler handler = new Handler(paramLooper);
    this.d = handler;
    r0[] arrayOfR0 = paramv0.a(handler, b1, b1, b1, b1, paramk);
    this.b = arrayOfR0;
    this.E = 1.0F;
    this.C = 0;
    this.D = i.a;
    this.v = 1;
    this.G = Collections.emptyList();
    c0 c01 = new c0(arrayOfR0, paramh, paramg0, paramf, paramf1, paramLooper);
    this.c = c01;
    parama.L(c01);
    f0((o0.a)parama);
    f0(b1);
    copyOnWriteArraySet2.add(parama);
    copyOnWriteArraySet.add(parama);
    copyOnWriteArraySet3.add(parama);
    copyOnWriteArraySet1.add(parama);
    P((e)parama);
    paramf.g(handler, (f.a)parama);
    if (paramk instanceof DefaultDrmSessionManager)
      ((DefaultDrmSessionManager)paramk).h(handler, (h)parama); 
    this.n = new r(paramContext, handler, b1);
    this.o = new s(paramContext, handler, b1);
    this.p = new z0(paramContext);
  }
  
  private void C0() {
    TextureView textureView = this.x;
    if (textureView != null) {
      if (textureView.getSurfaceTextureListener() != this.e) {
        o.f("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
      } else {
        this.x.setSurfaceTextureListener(null);
      } 
      this.x = null;
    } 
    SurfaceHolder surfaceHolder = this.w;
    if (surfaceHolder != null) {
      surfaceHolder.removeCallback(this.e);
      this.w = null;
    } 
  }
  
  private void D0() {
    float f1 = this.E;
    float f2 = this.o.f();
    for (r0 r01 : this.b) {
      if (r01.n() == 1)
        this.c.u(r01).n(2).m(Float.valueOf(f1 * f2)).l(); 
    } 
  }
  
  private void F0(k paramk) {
    for (r0 r01 : this.b) {
      if (r01.n() == 2)
        this.c.u(r01).n(8).m(paramk).l(); 
    } 
    this.s = paramk;
  }
  
  private void H0(Surface paramSurface, boolean paramBoolean) {
    ArrayList<p0> arrayList = new ArrayList();
    for (r0 r01 : this.b) {
      if (r01.n() == 2)
        arrayList.add(this.c.u(r01).n(1).m(paramSurface).l()); 
    } 
    Surface surface = this.t;
    if (surface != null && surface != paramSurface) {
      try {
        Iterator<p0> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((p0)iterator.next()).a(); 
      } catch (InterruptedException interruptedException) {
        Thread.currentThread().interrupt();
      } 
      if (this.u)
        this.t.release(); 
    } 
    this.t = paramSurface;
    this.u = paramBoolean;
  }
  
  private void J0(boolean paramBoolean, int paramInt) {
    boolean bool1 = false;
    if (paramBoolean && paramInt != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    boolean bool2 = bool1;
    if (paramBoolean) {
      bool2 = bool1;
      if (paramInt != 1)
        bool2 = true; 
    } 
    this.c.N(paramBoolean, bool2);
  }
  
  private void K0() {
    if (Looper.myLooper() != u0()) {
      IllegalStateException illegalStateException;
      if (this.J) {
        illegalStateException = null;
      } else {
        illegalStateException = new IllegalStateException();
      } 
      o.g("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", illegalStateException);
      this.J = true;
    } 
  }
  
  private void T(int paramInt1, int paramInt2) {
    if (paramInt1 != this.y || paramInt2 != this.z) {
      this.y = paramInt1;
      this.z = paramInt2;
      Iterator<p> iterator = this.f.iterator();
      while (iterator.hasNext())
        ((p)iterator.next()).onSurfaceSizeChanged(paramInt1, paramInt2); 
    } 
  }
  
  public void A0(v paramv, boolean paramBoolean1, boolean paramBoolean2) {
    K0();
    v v1 = this.F;
    if (v1 != null) {
      v1.e((w)this.m);
      this.m.K();
    } 
    this.F = paramv;
    paramv.d(this.d, (w)this.m);
    int j = this.o.i(b0());
    J0(b0(), j);
    this.c.L(paramv, paramBoolean1, paramBoolean2);
  }
  
  public void B0() {
    K0();
    this.n.b(false);
    this.o.k();
    this.p.a(false);
    this.c.M();
    C0();
    Surface surface = this.t;
    if (surface != null) {
      if (this.u)
        surface.release(); 
      this.t = null;
    } 
    v v1 = this.F;
    if (v1 != null) {
      v1.e((w)this.m);
      this.F = null;
    } 
    if (this.L) {
      ((PriorityTaskManager)e.e(this.K)).b(0);
      this.L = false;
    } 
    this.l.d((f.a)this.m);
    this.G = Collections.emptyList();
    this.M = true;
  }
  
  public void E0(l0 paraml0) {
    K0();
    this.c.O(paraml0);
  }
  
  public void G0(SurfaceHolder paramSurfaceHolder) {
    K0();
    C0();
    if (paramSurfaceHolder != null)
      Q(); 
    this.w = paramSurfaceHolder;
    if (paramSurfaceHolder == null) {
      H0(null, false);
      T(0, 0);
    } else {
      paramSurfaceHolder.addCallback(this.e);
      Surface surface = paramSurfaceHolder.getSurface();
      if (surface != null && surface.isValid()) {
        H0(surface, false);
        Rect rect = paramSurfaceHolder.getSurfaceFrame();
        T(rect.width(), rect.height());
      } else {
        H0(null, false);
        T(0, 0);
      } 
    } 
  }
  
  public void I0(float paramFloat) {
    K0();
    paramFloat = h0.m(paramFloat, 0.0F, 1.0F);
    if (this.E == paramFloat)
      return; 
    this.E = paramFloat;
    D0();
    Iterator<k> iterator = this.g.iterator();
    while (iterator.hasNext())
      ((k)iterator.next()).g(paramFloat); 
  }
  
  public void P(e parame) {
    this.i.add(parame);
  }
  
  public void Q() {
    K0();
    F0(null);
  }
  
  public void R() {
    K0();
    C0();
    H0(null, false);
    T(0, 0);
  }
  
  public void S(SurfaceHolder paramSurfaceHolder) {
    K0();
    if (paramSurfaceHolder != null && paramSurfaceHolder == this.w)
      G0(null); 
  }
  
  public void U(v paramv) {
    A0(paramv, true, true);
  }
  
  public int V() {
    K0();
    return this.c.V();
  }
  
  public l0 W() {
    K0();
    return this.c.W();
  }
  
  public long X() {
    K0();
    return this.c.X();
  }
  
  public boolean Y() {
    K0();
    return this.c.Y();
  }
  
  public long Z() {
    K0();
    return this.c.Z();
  }
  
  public void a(Surface paramSurface) {
    K0();
    C0();
    if (paramSurface != null)
      Q(); 
    byte b1 = 0;
    H0(paramSurface, false);
    if (paramSurface != null)
      b1 = -1; 
    T(b1, b1);
  }
  
  public void a0(int paramInt, long paramLong) {
    K0();
    this.m.J();
    this.c.a0(paramInt, paramLong);
  }
  
  public void b(a parama) {
    K0();
    this.I = parama;
    for (r0 r01 : this.b) {
      if (r01.n() == 5)
        this.c.u(r01).n(7).m(parama).l(); 
    } 
  }
  
  public boolean b0() {
    K0();
    return this.c.b0();
  }
  
  public void c(m paramm) {
    K0();
    this.H = paramm;
    for (r0 r01 : this.b) {
      if (r01.n() == 2)
        this.c.u(r01).n(6).m(paramm).l(); 
    } 
  }
  
  public void c0(boolean paramBoolean) {
    K0();
    this.c.c0(paramBoolean);
  }
  
  public void d(Surface paramSurface) {
    K0();
    if (paramSurface != null && paramSurface == this.t)
      R(); 
  }
  
  public ExoPlaybackException d0() {
    K0();
    return this.c.d0();
  }
  
  public void e(a parama) {
    K0();
    if (this.I != parama)
      return; 
    for (r0 r01 : this.b) {
      if (r01.n() == 5)
        this.c.u(r01).n(7).m(null).l(); 
    } 
  }
  
  public void f(TextureView paramTextureView) {
    K0();
    if (paramTextureView != null && paramTextureView == this.x)
      n(null); 
  }
  
  public void f0(o0.a parama) {
    K0();
    this.c.f0(parama);
  }
  
  public void g(k paramk) {
    K0();
    if (paramk != null)
      R(); 
    F0(paramk);
  }
  
  public int g0() {
    K0();
    return this.c.g0();
  }
  
  public long getCurrentPosition() {
    K0();
    return this.c.getCurrentPosition();
  }
  
  public long getDuration() {
    K0();
    return this.c.getDuration();
  }
  
  public void h(SurfaceView paramSurfaceView) {
    SurfaceHolder surfaceHolder;
    if (paramSurfaceView == null) {
      paramSurfaceView = null;
    } else {
      surfaceHolder = paramSurfaceView.getHolder();
    } 
    G0(surfaceHolder);
  }
  
  public void h0(o0.a parama) {
    K0();
    this.c.h0(parama);
  }
  
  public void i(j paramj) {
    this.h.remove(paramj);
  }
  
  public int i0() {
    K0();
    return this.c.i0();
  }
  
  public void j(p paramp) {
    this.f.add(paramp);
  }
  
  public void j0(boolean paramBoolean) {
    K0();
    J0(paramBoolean, this.o.j(paramBoolean, V()));
  }
  
  public void k(m paramm) {
    K0();
    if (this.H != paramm)
      return; 
    for (r0 r01 : this.b) {
      if (r01.n() == 2)
        this.c.u(r01).n(6).m(null).l(); 
    } 
  }
  
  public o0.c k0() {
    return this;
  }
  
  public void l(SurfaceView paramSurfaceView) {
    SurfaceHolder surfaceHolder;
    if (paramSurfaceView == null) {
      paramSurfaceView = null;
    } else {
      surfaceHolder = paramSurfaceView.getHolder();
    } 
    S(surfaceHolder);
  }
  
  public long l0() {
    K0();
    return this.c.l0();
  }
  
  public void m(j paramj) {
    if (!this.G.isEmpty())
      paramj.h(this.G); 
    this.h.add(paramj);
  }
  
  public void n(TextureView paramTextureView) {
    K0();
    C0();
    if (paramTextureView != null)
      Q(); 
    this.x = paramTextureView;
    if (paramTextureView == null) {
      H0(null, true);
      T(0, 0);
    } else {
      SurfaceTexture surfaceTexture;
      if (paramTextureView.getSurfaceTextureListener() != null)
        o.f("SimpleExoPlayer", "Replacing existing SurfaceTextureListener."); 
      paramTextureView.setSurfaceTextureListener(this.e);
      if (paramTextureView.isAvailable()) {
        surfaceTexture = paramTextureView.getSurfaceTexture();
      } else {
        surfaceTexture = null;
      } 
      if (surfaceTexture == null) {
        H0(null, true);
        T(0, 0);
      } else {
        H0(new Surface(surfaceTexture), true);
        T(paramTextureView.getWidth(), paramTextureView.getHeight());
      } 
    } 
  }
  
  public int n0() {
    K0();
    return this.c.n0();
  }
  
  public void o(p paramp) {
    this.f.remove(paramp);
  }
  
  public void o0(int paramInt) {
    K0();
    this.c.o0(paramInt);
  }
  
  public int q0() {
    K0();
    return this.c.q0();
  }
  
  public TrackGroupArray r0() {
    K0();
    return this.c.r0();
  }
  
  public int s0() {
    K0();
    return this.c.s0();
  }
  
  public y0 t0() {
    K0();
    return this.c.t0();
  }
  
  public Looper u0() {
    return this.c.u0();
  }
  
  public boolean v0() {
    K0();
    return this.c.v0();
  }
  
  public long w0() {
    K0();
    return this.c.w0();
  }
  
  public g x0() {
    K0();
    return this.c.x0();
  }
  
  public int y0(int paramInt) {
    K0();
    return this.c.y0(paramInt);
  }
  
  public o0.b z0() {
    return this;
  }
  
  private final class b implements q, l, j, e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, s.b, r.b, o0.a {
    private b(x0 this$0) {}
    
    public void a(int param1Int) {
      if (x0.M(this.b) == param1Int)
        return; 
      x0.N(this.b, param1Int);
      for (k k : x0.O(this.b)) {
        if (!x0.L(this.b).contains(k))
          k.a(param1Int); 
      } 
      Iterator<l> iterator = x0.L(this.b).iterator();
      while (iterator.hasNext())
        ((l)iterator.next()).a(param1Int); 
    }
    
    public void b(d param1d) {
      Iterator<l> iterator = x0.L(this.b).iterator();
      while (iterator.hasNext())
        ((l)iterator.next()).b(param1d); 
      x0.t(this.b, null);
      x0.K(this.b, null);
      x0.N(this.b, 0);
    }
    
    public void c(d param1d) {
      x0.K(this.b, param1d);
      Iterator<l> iterator = x0.L(this.b).iterator();
      while (iterator.hasNext())
        ((l)iterator.next()).c(param1d); 
    }
    
    public void d(String param1String, long param1Long1, long param1Long2) {
      Iterator<q> iterator = x0.F(this.b).iterator();
      while (iterator.hasNext())
        ((q)iterator.next()).d(param1String, param1Long1, param1Long2); 
    }
    
    public void e() {
      this.b.j0(false);
    }
    
    public void f(float param1Float) {
      x0.A(this.b);
    }
    
    public void g(int param1Int) {
      x0 x01 = this.b;
      x0.B(x01, x01.b0(), param1Int);
    }
    
    public void h(List<b> param1List) {
      x0.v(this.b, param1List);
      Iterator<j> iterator = x0.w(this.b).iterator();
      while (iterator.hasNext())
        ((j)iterator.next()).h(param1List); 
    }
    
    public void k(Surface param1Surface) {
      if (x0.J(this.b) == param1Surface) {
        Iterator<p> iterator1 = x0.I(this.b).iterator();
        while (iterator1.hasNext())
          ((p)iterator1.next()).onRenderedFirstFrame(); 
      } 
      Iterator<q> iterator = x0.F(this.b).iterator();
      while (iterator.hasNext())
        ((q)iterator.next()).k(param1Surface); 
    }
    
    public void m(String param1String, long param1Long1, long param1Long2) {
      Iterator<l> iterator = x0.L(this.b).iterator();
      while (iterator.hasNext())
        ((l)iterator.next()).m(param1String, param1Long1, param1Long2); 
    }
    
    public void n(Metadata param1Metadata) {
      Iterator<e> iterator = x0.x(this.b).iterator();
      while (iterator.hasNext())
        ((e)iterator.next()).n(param1Metadata); 
    }
    
    public void onLoadingChanged(boolean param1Boolean) {
      if (x0.C(this.b) != null)
        if (param1Boolean && !x0.D(this.b)) {
          x0.C(this.b).a(0);
          x0.E(this.b, true);
        } else if (!param1Boolean && x0.D(this.b)) {
          x0.C(this.b).b(0);
          x0.E(this.b, false);
        }  
    }
    
    public void onPlayerStateChanged(boolean param1Boolean, int param1Int) {
      if (param1Int != 1)
        if (param1Int != 2 && param1Int != 3) {
          if (param1Int != 4)
            return; 
        } else {
          x0.G(this.b).a(param1Boolean);
          return;
        }  
      x0.G(this.b).a(false);
    }
    
    public void onSurfaceTextureAvailable(SurfaceTexture param1SurfaceTexture, int param1Int1, int param1Int2) {
      x0.y(this.b, new Surface(param1SurfaceTexture), true);
      x0.z(this.b, param1Int1, param1Int2);
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture param1SurfaceTexture) {
      x0.y(this.b, null, true);
      x0.z(this.b, 0, 0);
      return true;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture param1SurfaceTexture, int param1Int1, int param1Int2) {
      x0.z(this.b, param1Int1, param1Int2);
    }
    
    public void onSurfaceTextureUpdated(SurfaceTexture param1SurfaceTexture) {}
    
    public void onVideoSizeChanged(int param1Int1, int param1Int2, int param1Int3, float param1Float) {
      for (p p : x0.I(this.b)) {
        if (!x0.F(this.b).contains(p))
          p.onVideoSizeChanged(param1Int1, param1Int2, param1Int3, param1Float); 
      } 
      Iterator<q> iterator = x0.F(this.b).iterator();
      while (iterator.hasNext())
        ((q)iterator.next()).onVideoSizeChanged(param1Int1, param1Int2, param1Int3, param1Float); 
    }
    
    public void p(int param1Int, long param1Long) {
      Iterator<q> iterator = x0.F(this.b).iterator();
      while (iterator.hasNext())
        ((q)iterator.next()).p(param1Int, param1Long); 
    }
    
    public void s(Format param1Format) {
      x0.H(this.b, param1Format);
      Iterator<q> iterator = x0.F(this.b).iterator();
      while (iterator.hasNext())
        ((q)iterator.next()).s(param1Format); 
    }
    
    public void surfaceChanged(SurfaceHolder param1SurfaceHolder, int param1Int1, int param1Int2, int param1Int3) {
      x0.z(this.b, param1Int2, param1Int3);
    }
    
    public void surfaceCreated(SurfaceHolder param1SurfaceHolder) {
      x0.y(this.b, param1SurfaceHolder.getSurface(), false);
    }
    
    public void surfaceDestroyed(SurfaceHolder param1SurfaceHolder) {
      x0.y(this.b, null, false);
      x0.z(this.b, 0, 0);
    }
    
    public void t(d param1d) {
      x0.u(this.b, param1d);
      Iterator<q> iterator = x0.F(this.b).iterator();
      while (iterator.hasNext())
        ((q)iterator.next()).t(param1d); 
    }
    
    public void v(Format param1Format) {
      x0.t(this.b, param1Format);
      Iterator<l> iterator = x0.L(this.b).iterator();
      while (iterator.hasNext())
        ((l)iterator.next()).v(param1Format); 
    }
    
    public void x(int param1Int, long param1Long1, long param1Long2) {
      Iterator<l> iterator = x0.L(this.b).iterator();
      while (iterator.hasNext())
        ((l)iterator.next()).x(param1Int, param1Long1, param1Long2); 
    }
    
    public void y(d param1d) {
      Iterator<q> iterator = x0.F(this.b).iterator();
      while (iterator.hasNext())
        ((q)iterator.next()).y(param1d); 
      x0.H(this.b, null);
      x0.u(this.b, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */