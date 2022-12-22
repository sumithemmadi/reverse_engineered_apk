package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.h;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c implements HlsPlaylistTracker, Loader.b<v<g>> {
  public static final HlsPlaylistTracker.a b = a.a;
  
  private final h c;
  
  private final i d;
  
  private final u e;
  
  private final HashMap<Uri, a> f;
  
  private final List<HlsPlaylistTracker.b> g;
  
  private final double h;
  
  private v.a<g> i;
  
  private w.a j;
  
  private Loader k;
  
  private Handler l;
  
  private HlsPlaylistTracker.c m;
  
  private e n;
  
  private Uri o;
  
  private f p;
  
  private boolean q;
  
  private long r;
  
  public c(h paramh, u paramu, i parami) {
    this(paramh, paramu, parami, 3.5D);
  }
  
  public c(h paramh, u paramu, i parami, double paramDouble) {
    this.c = paramh;
    this.d = parami;
    this.e = paramu;
    this.h = paramDouble;
    this.g = new ArrayList<HlsPlaylistTracker.b>();
    this.f = new HashMap<Uri, a>();
    this.r = -9223372036854775807L;
  }
  
  private static f.a A(f paramf1, f paramf2) {
    int j = (int)(paramf2.i - paramf1.i);
    List<f.a> list = paramf1.o;
    if (j < list.size()) {
      f.a a1 = list.get(j);
    } else {
      list = null;
    } 
    return (f.a)list;
  }
  
  private f B(f paramf1, f paramf2) {
    if (!paramf2.f(paramf1)) {
      f f1 = paramf1;
      if (paramf2.l)
        f1 = paramf1.d(); 
      return f1;
    } 
    return paramf2.c(D(paramf1, paramf2), C(paramf1, paramf2));
  }
  
  private int C(f paramf1, f paramf2) {
    boolean bool;
    if (paramf2.g)
      return paramf2.h; 
    f f1 = this.p;
    if (f1 != null) {
      bool = f1.h;
    } else {
      bool = false;
    } 
    if (paramf1 == null)
      return bool; 
    f.a a1 = A(paramf1, paramf2);
    return (a1 != null) ? (paramf1.h + a1.f - ((f.a)paramf2.o.get(0)).f) : bool;
  }
  
  private long D(f paramf1, f paramf2) {
    long l;
    if (paramf2.m)
      return paramf2.f; 
    f f1 = this.p;
    if (f1 != null) {
      l = f1.f;
    } else {
      l = 0L;
    } 
    if (paramf1 == null)
      return l; 
    int j = paramf1.o.size();
    f.a a1 = A(paramf1, paramf2);
    return (a1 != null) ? (paramf1.f + a1.g) : ((j == paramf2.i - paramf1.i) ? paramf1.e() : l);
  }
  
  private boolean E(Uri paramUri) {
    List<e.b> list = this.n.f;
    for (byte b1 = 0; b1 < list.size(); b1++) {
      if (paramUri.equals(((e.b)list.get(b1)).a))
        return true; 
    } 
    return false;
  }
  
  private boolean F() {
    List<e.b> list = this.n.f;
    int j = list.size();
    long l = SystemClock.elapsedRealtime();
    for (byte b1 = 0; b1 < j; b1++) {
      a a1 = this.f.get(((e.b)list.get(b1)).a);
      if (l > a.b(a1)) {
        this.o = a.d(a1);
        a1.i();
        return true;
      } 
    } 
    return false;
  }
  
  private void G(Uri paramUri) {
    if (!paramUri.equals(this.o) && E(paramUri)) {
      f f1 = this.p;
      if (f1 == null || !f1.l) {
        this.o = paramUri;
        ((a)this.f.get(paramUri)).i();
      } 
    } 
  }
  
  private boolean H(Uri paramUri, long paramLong) {
    int j = this.g.size();
    byte b1 = 0;
    int k = 0;
    while (b1 < j) {
      k |= ((HlsPlaylistTracker.b)this.g.get(b1)).c(paramUri, paramLong) ^ true;
      b1++;
    } 
    return k;
  }
  
  private void L(Uri paramUri, f paramf) {
    if (paramUri.equals(this.o)) {
      if (this.p == null) {
        this.q = paramf.l ^ true;
        this.r = paramf.f;
      } 
      this.p = paramf;
      this.m.c(paramf);
    } 
    int j = this.g.size();
    for (byte b1 = 0; b1 < j; b1++)
      ((HlsPlaylistTracker.b)this.g.get(b1)).b(); 
  }
  
  private void z(List<Uri> paramList) {
    int j = paramList.size();
    for (byte b1 = 0; b1 < j; b1++) {
      Uri uri = paramList.get(b1);
      a a1 = new a(this, uri);
      this.f.put(uri, a1);
    } 
  }
  
  public void I(v<g> paramv, long paramLong1, long paramLong2, boolean paramBoolean) {
    this.j.w(paramv.a, paramv.f(), paramv.d(), 4, paramLong1, paramLong2, paramv.c());
  }
  
  public void J(v<g> paramv, long paramLong1, long paramLong2) {
    e e1;
    g g = (g)paramv.e();
    boolean bool = g instanceof f;
    if (bool) {
      e1 = e.e(g.a);
    } else {
      e1 = (e)g;
    } 
    this.n = e1;
    this.i = this.d.a(e1);
    this.o = ((e.b)e1.f.get(0)).a;
    z(e1.e);
    a a1 = this.f.get(this.o);
    if (bool) {
      a.a(a1, (f)g, paramLong2);
    } else {
      a1.i();
    } 
    this.j.z(paramv.a, paramv.f(), paramv.d(), 4, paramLong1, paramLong2, paramv.c());
  }
  
  public Loader.c K(v<g> paramv, long paramLong1, long paramLong2, IOException paramIOException, int paramInt) {
    Loader.c c1;
    boolean bool;
    long l = this.e.a(paramv.b, paramLong2, paramIOException, paramInt);
    if (l == -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    } 
    this.j.C(paramv.a, paramv.f(), paramv.d(), 4, paramLong1, paramLong2, paramv.c(), paramIOException, bool);
    if (bool) {
      c1 = Loader.d;
    } else {
      c1 = Loader.g(false, l);
    } 
    return c1;
  }
  
  public boolean a(Uri paramUri) {
    return ((a)this.f.get(paramUri)).h();
  }
  
  public void b(HlsPlaylistTracker.b paramb) {
    this.g.remove(paramb);
  }
  
  public void d(Uri paramUri) {
    ((a)this.f.get(paramUri)).k();
  }
  
  public long f() {
    return this.r;
  }
  
  public boolean g() {
    return this.q;
  }
  
  public e h() {
    return this.n;
  }
  
  public void i(Uri paramUri, w.a parama, HlsPlaylistTracker.c paramc) {
    boolean bool;
    this.l = new Handler();
    this.j = parama;
    this.m = paramc;
    v v = new v(this.c.a(4), paramUri, 4, this.d.b());
    if (this.k == null) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
    this.k = loader;
    long l = loader.n((Loader.e)v, this, this.e.c(v.b));
    parama.F(v.a, v.b, l);
  }
  
  public void j() {
    Loader loader = this.k;
    if (loader != null)
      loader.j(); 
    Uri uri = this.o;
    if (uri != null)
      d(uri); 
  }
  
  public void k(Uri paramUri) {
    ((a)this.f.get(paramUri)).i();
  }
  
  public void l(HlsPlaylistTracker.b paramb) {
    this.g.add(paramb);
  }
  
  public f m(Uri paramUri, boolean paramBoolean) {
    f f1 = ((a)this.f.get(paramUri)).g();
    if (f1 != null && paramBoolean)
      G(paramUri); 
    return f1;
  }
  
  public void stop() {
    this.o = null;
    this.p = null;
    this.n = null;
    this.r = -9223372036854775807L;
    this.k.l();
    this.k = null;
    Iterator<a> iterator = this.f.values().iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).q(); 
    this.l.removeCallbacksAndMessages(null);
    this.l = null;
    this.f.clear();
  }
  
  private final class a implements Loader.b<v<g>>, Runnable {
    private final Uri b;
    
    private final Loader c;
    
    private final v<g> d;
    
    private f e;
    
    private long f;
    
    private long g;
    
    private long h;
    
    private long i;
    
    private boolean j;
    
    private IOException k;
    
    public a(c this$0, Uri param1Uri) {
      this.b = param1Uri;
      this.c = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
      this.d = new v(c.s(this$0).a(4), param1Uri, 4, c.t(this$0));
    }
    
    private boolean f(long param1Long) {
      boolean bool;
      this.i = SystemClock.elapsedRealtime() + param1Long;
      if (this.b.equals(c.q(this.l)) && !c.r(this.l)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    private void j() {
      long l = this.c.n((Loader.e)this.d, this, c.w(this.l).c(this.d.b));
      w.a a1 = c.v(this.l);
      v<g> v1 = this.d;
      a1.F(v1.a, v1.b, l);
    }
    
    private void p(f param1f, long param1Long) {
      f f1 = this.e;
      long l = SystemClock.elapsedRealtime();
      this.f = l;
      f f2 = c.y(this.l, f1, param1f);
      this.e = f2;
      if (f2 != f1) {
        this.k = null;
        this.g = l;
        c.o(this.l, this.b, f2);
      } else if (!f2.l) {
        long l1 = param1f.i;
        long l2 = param1f.o.size();
        param1f = this.e;
        if (l1 + l2 < param1f.i) {
          this.k = new HlsPlaylistTracker.PlaylistResetException(this.b);
          c.x(this.l, this.b, -9223372036854775807L);
        } else {
          double d1 = (l - this.g);
          double d2 = v.b(param1f.k);
          double d3 = c.p(this.l);
          Double.isNaN(d2);
          if (d1 > d2 * d3) {
            this.k = new HlsPlaylistTracker.PlaylistStuckException(this.b);
            param1Long = c.w(this.l).b(4, param1Long, this.k, 1);
            c.x(this.l, this.b, param1Long);
            if (param1Long != -9223372036854775807L)
              f(param1Long); 
          } 
        } 
      } 
      param1f = this.e;
      if (param1f != f1) {
        param1Long = param1f.k;
      } else {
        param1Long = param1f.k / 2L;
      } 
      this.h = l + v.b(param1Long);
      if (this.b.equals(c.q(this.l)) && !this.e.l)
        i(); 
    }
    
    public f g() {
      return this.e;
    }
    
    public boolean h() {
      f f1 = this.e;
      null = false;
      if (f1 == null)
        return false; 
      long l1 = SystemClock.elapsedRealtime();
      long l2 = Math.max(30000L, v.b(this.e.p));
      f1 = this.e;
      if (!f1.l) {
        int i = f1.d;
        return (i == 2 || i == 1 || this.f + l2 > l1) ? true : null;
      } 
      return true;
    }
    
    public void i() {
      this.i = 0L;
      if (!this.j && !this.c.i() && !this.c.h()) {
        long l = SystemClock.elapsedRealtime();
        if (l < this.h) {
          this.j = true;
          c.u(this.l).postDelayed(this, this.h - l);
        } else {
          j();
        } 
      } 
    }
    
    public void k() {
      this.c.j();
      IOException iOException = this.k;
      if (iOException == null)
        return; 
      throw iOException;
    }
    
    public void l(v<g> param1v, long param1Long1, long param1Long2, boolean param1Boolean) {
      c.v(this.l).w(param1v.a, param1v.f(), param1v.d(), 4, param1Long1, param1Long2, param1v.c());
    }
    
    public void m(v<g> param1v, long param1Long1, long param1Long2) {
      g g = (g)param1v.e();
      if (g instanceof f) {
        p((f)g, param1Long2);
        c.v(this.l).z(param1v.a, param1v.f(), param1v.d(), 4, param1Long1, param1Long2, param1v.c());
      } else {
        this.k = (IOException)new ParserException("Loaded playlist has unexpected type.");
      } 
    }
    
    public Loader.c o(v<g> param1v, long param1Long1, long param1Long2, IOException param1IOException, int param1Int) {
      boolean bool;
      boolean bool1;
      Loader.c c1;
      long l = c.w(this.l).b(param1v.b, param1Long2, param1IOException, param1Int);
      if (l != -9223372036854775807L) {
        bool = true;
      } else {
        bool = false;
      } 
      if (c.x(this.l, this.b, l) || !bool) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      boolean bool2 = bool1;
      if (bool)
        bool2 = bool1 | f(l); 
      if (bool2) {
        l = c.w(this.l).a(param1v.b, param1Long2, param1IOException, param1Int);
        if (l != -9223372036854775807L) {
          c1 = Loader.g(false, l);
        } else {
          c1 = Loader.d;
        } 
      } else {
        c1 = Loader.c;
      } 
      c.v(this.l).C(param1v.a, param1v.f(), param1v.d(), 4, param1Long1, param1Long2, param1v.c(), param1IOException, c1.c() ^ true);
      return c1;
    }
    
    public void q() {
      this.c.l();
    }
    
    public void run() {
      this.j = false;
      j();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/playlist/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */