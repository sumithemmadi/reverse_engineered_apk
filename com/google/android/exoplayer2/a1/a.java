package com.google.android.exoplayer2.a1;

import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.k;
import com.google.android.exoplayer2.audio.l;
import com.google.android.exoplayer2.b1.d;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.e;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.f;
import com.google.android.exoplayer2.video.p;
import com.google.android.exoplayer2.video.q;
import com.google.android.exoplayer2.y0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class a implements o0.a, e, l, q, w, f.a, h, p, k {
  private final CopyOnWriteArraySet<b> b;
  
  private final f c;
  
  private final y0.c d;
  
  private final b e;
  
  private o0 f;
  
  public a(f paramf) {
    this.c = (f)e.e(paramf);
    this.b = new CopyOnWriteArraySet<b>();
    this.e = new b();
    this.d = new y0.c();
  }
  
  private b.a D(a parama) {
    e.e(this.f);
    a a1 = parama;
    if (parama == null) {
      int i = this.f.i0();
      a1 = this.e.o(i);
      if (a1 == null) {
        boolean bool;
        y0 y0 = this.f.t0();
        if (i < y0.p()) {
          bool = true;
        } else {
          bool = false;
        } 
        if (!bool)
          y0 = y0.a; 
        return C(y0, i, null);
      } 
    } 
    return C(a1.b, a1.c, a1.a);
  }
  
  private b.a E() {
    return D(this.e.b());
  }
  
  private b.a F() {
    return D(this.e.c());
  }
  
  private b.a G(int paramInt, v.a parama) {
    boolean bool;
    e.e(this.f);
    if (parama != null) {
      b.a a1;
      a a2 = this.e.d(parama);
      if (a2 != null) {
        a1 = D(a2);
      } else {
        a1 = C(y0.a, paramInt, (v.a)a1);
      } 
      return a1;
    } 
    y0 y0 = this.f.t0();
    if (paramInt < y0.p()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool)
      y0 = y0.a; 
    return C(y0, paramInt, null);
  }
  
  private b.a H() {
    return D(this.e.e());
  }
  
  private b.a I() {
    return D(this.e.f());
  }
  
  public final void A(int paramInt, v.a parama, w.c paramc) {
    b.a a1 = G(paramInt, parama);
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).y(a1, paramc); 
  }
  
  public final void B() {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).J(a1); 
  }
  
  @RequiresNonNull({"player"})
  protected b.a C(y0 paramy0, int paramInt, v.a parama) {
    boolean bool2;
    if (paramy0.q())
      parama = null; 
    long l1 = this.c.b();
    y0 y01 = this.f.t0();
    boolean bool1 = true;
    if (paramy0 == y01 && paramInt == this.f.i0()) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    long l2 = 0L;
    if (parama != null && parama.a()) {
      if (bool2 && this.f.n0() == parama.b && this.f.g0() == parama.c) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      if (bool2)
        l2 = this.f.getCurrentPosition(); 
    } else if (bool2) {
      l2 = this.f.l0();
    } else if (!paramy0.q()) {
      l2 = paramy0.n(paramInt, this.d).a();
    } 
    return new b.a(l1, paramy0, paramInt, parama, l2, this.f.getCurrentPosition(), this.f.Z());
  }
  
  public final void J() {
    if (!this.e.g()) {
      b.a a1 = H();
      this.e.m();
      Iterator<b> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((b)iterator.next()).G(a1); 
    } 
  }
  
  public final void K() {
    for (a a1 : new ArrayList(b.a(this.e)))
      u(a1.c, a1.a); 
  }
  
  public void L(o0 paramo0) {
    boolean bool;
    if (this.f == null || b.a(this.e).isEmpty()) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.f = (o0)e.e(paramo0);
  }
  
  public final void a(int paramInt) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).L(a1, paramInt); 
  }
  
  public final void b(d paramd) {
    b.a a1 = E();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).I(a1, 1, paramd); 
  }
  
  public final void c(d paramd) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).q(a1, 1, paramd); 
  }
  
  public final void d(String paramString, long paramLong1, long paramLong2) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).g(a1, 2, paramString, paramLong2); 
  }
  
  public final void e(int paramInt, v.a parama, w.b paramb, w.c paramc) {
    b.a a1 = G(paramInt, parama);
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).c(a1, paramb, paramc); 
  }
  
  public final void f() {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).k(a1); 
  }
  
  public void g(float paramFloat) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).w(a1, paramFloat); 
  }
  
  public final void h(int paramInt, v.a parama) {
    this.e.k(parama);
    b.a a1 = G(paramInt, parama);
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).K(a1); 
  }
  
  public final void i(int paramInt, v.a parama, w.b paramb, w.c paramc) {
    b.a a1 = G(paramInt, parama);
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).d(a1, paramb, paramc); 
  }
  
  public final void j(Exception paramException) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).i(a1, paramException); 
  }
  
  public final void k(Surface paramSurface) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).H(a1, paramSurface); 
  }
  
  public final void l(int paramInt, long paramLong1, long paramLong2) {
    b.a a1 = F();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).a(a1, paramInt, paramLong1, paramLong2); 
  }
  
  public final void m(String paramString, long paramLong1, long paramLong2) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).g(a1, 1, paramString, paramLong2); 
  }
  
  public final void n(Metadata paramMetadata) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).r(a1, paramMetadata); 
  }
  
  public final void o() {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).v(a1); 
  }
  
  public void onIsPlayingChanged(boolean paramBoolean) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).B(a1, paramBoolean); 
  }
  
  public final void onLoadingChanged(boolean paramBoolean) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).n(a1, paramBoolean); 
  }
  
  public final void onPlaybackParametersChanged(l0 paraml0) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).m(a1, paraml0); 
  }
  
  public void onPlaybackSuppressionReasonChanged(int paramInt) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).l(a1, paramInt); 
  }
  
  public final void onPlayerError(ExoPlaybackException paramExoPlaybackException) {
    b.a a1 = E();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).M(a1, paramExoPlaybackException); 
  }
  
  public final void onPlayerStateChanged(boolean paramBoolean, int paramInt) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).t(a1, paramBoolean, paramInt); 
  }
  
  public final void onPositionDiscontinuity(int paramInt) {
    this.e.j(paramInt);
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).h(a1, paramInt); 
  }
  
  public final void onRenderedFirstFrame() {}
  
  public final void onRepeatModeChanged(int paramInt) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).s(a1, paramInt); 
  }
  
  public final void onSeekProcessed() {
    if (this.e.g()) {
      this.e.l();
      b.a a1 = H();
      Iterator<b> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((b)iterator.next()).f(a1); 
    } 
  }
  
  public final void onShuffleModeEnabledChanged(boolean paramBoolean) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).A(a1, paramBoolean); 
  }
  
  public void onSurfaceSizeChanged(int paramInt1, int paramInt2) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).z(a1, paramInt1, paramInt2); 
  }
  
  public final void onTimelineChanged(y0 paramy0, int paramInt) {
    this.e.n(paramy0);
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).E(a1, paramInt); 
  }
  
  public final void onTracksChanged(TrackGroupArray paramTrackGroupArray, g paramg) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).x(a1, paramTrackGroupArray, paramg); 
  }
  
  public final void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).b(a1, paramInt1, paramInt2, paramInt3, paramFloat); 
  }
  
  public final void p(int paramInt, long paramLong) {
    b.a a1 = E();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).C(a1, paramInt, paramLong); 
  }
  
  public final void q(int paramInt, v.a parama, w.b paramb, w.c paramc) {
    b.a a1 = G(paramInt, parama);
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).F(a1, paramb, paramc); 
  }
  
  public final void r(int paramInt, v.a parama, w.b paramb, w.c paramc, IOException paramIOException, boolean paramBoolean) {
    b.a a1 = G(paramInt, parama);
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).p(a1, paramb, paramc, paramIOException, paramBoolean); 
  }
  
  public final void s(Format paramFormat) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).e(a1, 2, paramFormat); 
  }
  
  public final void t(d paramd) {
    b.a a1 = H();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).q(a1, 2, paramd); 
  }
  
  public final void u(int paramInt, v.a parama) {
    b.a a1 = G(paramInt, parama);
    if (this.e.i(parama)) {
      Iterator<b> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((b)iterator.next()).u(a1); 
    } 
  }
  
  public final void v(Format paramFormat) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).e(a1, 1, paramFormat); 
  }
  
  public final void w(int paramInt, v.a parama) {
    this.e.h(paramInt, parama);
    b.a a1 = G(paramInt, parama);
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).D(a1); 
  }
  
  public final void x(int paramInt, long paramLong1, long paramLong2) {
    b.a a1 = I();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).o(a1, paramInt, paramLong1, paramLong2); 
  }
  
  public final void y(d paramd) {
    b.a a1 = E();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).I(a1, 2, paramd); 
  }
  
  public final void z() {
    b.a a1 = E();
    Iterator<b> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).j(a1); 
  }
  
  private static final class a {
    public final v.a a;
    
    public final y0 b;
    
    public final int c;
    
    public a(v.a param1a, y0 param1y0, int param1Int) {
      this.a = param1a;
      this.b = param1y0;
      this.c = param1Int;
    }
  }
  
  private static final class b {
    private final ArrayList<a.a> a = new ArrayList<a.a>();
    
    private final HashMap<v.a, a.a> b = new HashMap<v.a, a.a>();
    
    private final y0.b c = new y0.b();
    
    private a.a d;
    
    private a.a e;
    
    private a.a f;
    
    private y0 g = y0.a;
    
    private boolean h;
    
    private a.a p(a.a param1a, y0 param1y0) {
      int i = param1y0.b(param1a.a.a);
      if (i == -1)
        return param1a; 
      i = (param1y0.f(i, this.c)).c;
      return new a.a(param1a.a, param1y0, i);
    }
    
    public a.a b() {
      return this.e;
    }
    
    public a.a c() {
      a.a a1;
      if (this.a.isEmpty()) {
        a1 = null;
      } else {
        ArrayList<a.a> arrayList = this.a;
        a1 = arrayList.get(arrayList.size() - 1);
      } 
      return a1;
    }
    
    public a.a d(v.a param1a) {
      return this.b.get(param1a);
    }
    
    public a.a e() {
      return (this.a.isEmpty() || this.g.q() || this.h) ? null : this.a.get(0);
    }
    
    public a.a f() {
      return this.f;
    }
    
    public boolean g() {
      return this.h;
    }
    
    public void h(int param1Int, v.a param1a) {
      boolean bool;
      y0 y01;
      int i = this.g.b(param1a.a);
      if (i != -1) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        y01 = this.g;
      } else {
        y01 = y0.a;
      } 
      if (bool)
        param1Int = (this.g.f(i, this.c)).c; 
      a.a a1 = new a.a(param1a, y01, param1Int);
      this.a.add(a1);
      this.b.put(param1a, a1);
      this.d = this.a.get(0);
      if (this.a.size() == 1 && !this.g.q())
        this.e = this.d; 
    }
    
    public boolean i(v.a param1a) {
      a.a a1 = this.b.remove(param1a);
      if (a1 == null)
        return false; 
      this.a.remove(a1);
      a1 = this.f;
      if (a1 != null && param1a.equals(a1.a)) {
        a.a a2;
        if (this.a.isEmpty()) {
          param1a = null;
        } else {
          a2 = this.a.get(0);
        } 
        this.f = a2;
      } 
      if (!this.a.isEmpty())
        this.d = this.a.get(0); 
      return true;
    }
    
    public void j(int param1Int) {
      this.e = this.d;
    }
    
    public void k(v.a param1a) {
      this.f = this.b.get(param1a);
    }
    
    public void l() {
      this.h = false;
      this.e = this.d;
    }
    
    public void m() {
      this.h = true;
    }
    
    public void n(y0 param1y0) {
      for (byte b1 = 0; b1 < this.a.size(); b1++) {
        a.a a2 = p(this.a.get(b1), param1y0);
        this.a.set(b1, a2);
        this.b.put(a2.a, a2);
      } 
      a.a a1 = this.f;
      if (a1 != null)
        this.f = p(a1, param1y0); 
      this.g = param1y0;
      this.e = this.d;
    }
    
    public a.a o(int param1Int) {
      byte b1 = 0;
      a.a a1;
      for (a1 = null; b1 < this.a.size(); a1 = a3) {
        a.a a2 = this.a.get(b1);
        int i = this.g.b(a2.a.a);
        a.a a3 = a1;
        if (i != -1) {
          a3 = a1;
          if ((this.g.f(i, this.c)).c == param1Int) {
            if (a1 != null)
              return null; 
            a3 = a2;
          } 
        } 
        b1++;
      } 
      return a1;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/a1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */