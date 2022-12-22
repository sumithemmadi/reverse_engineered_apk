package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.b;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.hls.playlist.e;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.playlist.i;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.s;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.y0;
import java.util.List;

public final class HlsMediaSource extends l implements HlsPlaylistTracker.c {
  private final i f;
  
  private final Uri g;
  
  private final h h;
  
  private final p i;
  
  private final k<?> j;
  
  private final u k;
  
  private final boolean l;
  
  private final int m;
  
  private final boolean n;
  
  private final HlsPlaylistTracker o;
  
  private final Object p;
  
  private x q;
  
  static {
    e0.a("goog.exo.hls");
  }
  
  private HlsMediaSource(Uri paramUri, h paramh, i parami, p paramp, k<?> paramk, u paramu, HlsPlaylistTracker paramHlsPlaylistTracker, boolean paramBoolean1, int paramInt, boolean paramBoolean2, Object paramObject) {
    this.g = paramUri;
    this.h = paramh;
    this.f = parami;
    this.i = paramp;
    this.j = paramk;
    this.k = paramu;
    this.o = paramHlsPlaylistTracker;
    this.l = paramBoolean1;
    this.m = paramInt;
    this.n = paramBoolean2;
    this.p = paramObject;
  }
  
  public u a(v.a parama, e parame, long paramLong) {
    w.a a1 = m(parama);
    return new l(this.f, this.o, this.h, this.q, this.j, this.k, a1, parame, this.i, this.l, this.m, this.n);
  }
  
  public void c(f paramf) {
    d0 d0;
    long l1;
    long l2;
    if (paramf.m) {
      l1 = v.b(paramf.f);
    } else {
      l1 = -9223372036854775807L;
    } 
    int j = paramf.d;
    if (j == 2 || j == 1) {
      l2 = l1;
    } else {
      l2 = -9223372036854775807L;
    } 
    long l3 = paramf.e;
    j j1 = new j((e)e.e(this.o.h()), paramf);
    if (this.o.g()) {
      long l5;
      long l4 = paramf.f - this.o.f();
      if (paramf.l) {
        l5 = l4 + paramf.p;
      } else {
        l5 = -9223372036854775807L;
      } 
      List list = paramf.o;
      if (l3 == -9223372036854775807L)
        if (!list.isEmpty()) {
          j = Math.max(0, list.size() - 3);
          l3 = paramf.p;
          long l6 = paramf.k;
          while (j > 0 && ((f.a)list.get(j)).g > l3 - l6 * 2L)
            j--; 
          l3 = ((f.a)list.get(j)).g;
        } else {
          l3 = 0L;
        }  
      d0 = new d0(l2, l1, l5, paramf.p, l4, l3, true, paramf.l ^ true, true, j1, this.p);
    } else {
      if (l3 == -9223372036854775807L)
        l3 = 0L; 
      long l4 = ((f)d0).p;
      d0 = new d0(l2, l1, l4, l4, 0L, l3, true, false, false, j1, this.p);
    } 
    r((y0)d0);
  }
  
  public void h() {
    this.o.j();
  }
  
  public void i(u paramu) {
    ((l)paramu).o();
  }
  
  protected void q(x paramx) {
    this.q = paramx;
    this.j.c();
    w.a a = m(null);
    this.o.i(this.g, a, this);
  }
  
  protected void s() {
    this.o.stop();
    this.j.a();
  }
  
  public static final class Factory {
    private final h a;
    
    private i b;
    
    private i c;
    
    private List<StreamKey> d;
    
    private HlsPlaylistTracker.a e;
    
    private p f;
    
    private k<?> g;
    
    private u h;
    
    private boolean i;
    
    private int j;
    
    private boolean k;
    
    private boolean l;
    
    private Object m;
    
    public Factory(h param1h) {
      this.a = (h)e.e(param1h);
      this.c = (i)new b();
      this.e = c.b;
      this.b = i.a;
      this.g = j.d();
      this.h = (u)new s();
      this.f = (p)new q();
      this.j = 1;
    }
    
    public Factory(j.a param1a) {
      this(new e(param1a));
    }
    
    public HlsMediaSource a(Uri param1Uri) {
      this.l = true;
      List<StreamKey> list = this.d;
      if (list != null)
        this.c = (i)new d(this.c, list); 
      h h1 = this.a;
      i i1 = this.b;
      p p1 = this.f;
      k<?> k1 = this.g;
      u u1 = this.h;
      return new HlsMediaSource(param1Uri, h1, i1, p1, k1, u1, this.e.a(h1, u1, this.c), this.i, this.j, this.k, this.m, null);
    }
    
    @Deprecated
    public HlsMediaSource b(Uri param1Uri, Handler param1Handler, w param1w) {
      HlsMediaSource hlsMediaSource = a(param1Uri);
      if (param1Handler != null && param1w != null)
        hlsMediaSource.d(param1Handler, param1w); 
      return hlsMediaSource;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/HlsMediaSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */