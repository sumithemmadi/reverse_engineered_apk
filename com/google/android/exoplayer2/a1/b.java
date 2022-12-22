package com.google.android.exoplayer2.a1;

import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.d;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.y0;
import java.io.IOException;

public interface b {
  void A(a parama, boolean paramBoolean);
  
  void B(a parama, boolean paramBoolean);
  
  void C(a parama, int paramInt, long paramLong);
  
  void D(a parama);
  
  void E(a parama, int paramInt);
  
  void F(a parama, w.b paramb, w.c paramc);
  
  void G(a parama);
  
  void H(a parama, Surface paramSurface);
  
  void I(a parama, int paramInt, d paramd);
  
  void J(a parama);
  
  void K(a parama);
  
  void L(a parama, int paramInt);
  
  void M(a parama, ExoPlaybackException paramExoPlaybackException);
  
  void a(a parama, int paramInt, long paramLong1, long paramLong2);
  
  void b(a parama, int paramInt1, int paramInt2, int paramInt3, float paramFloat);
  
  void c(a parama, w.b paramb, w.c paramc);
  
  void d(a parama, w.b paramb, w.c paramc);
  
  void e(a parama, int paramInt, Format paramFormat);
  
  void f(a parama);
  
  void g(a parama, int paramInt, String paramString, long paramLong);
  
  void h(a parama, int paramInt);
  
  void i(a parama, Exception paramException);
  
  void j(a parama);
  
  void k(a parama);
  
  void l(a parama, int paramInt);
  
  void m(a parama, l0 paraml0);
  
  void n(a parama, boolean paramBoolean);
  
  void o(a parama, int paramInt, long paramLong1, long paramLong2);
  
  void p(a parama, w.b paramb, w.c paramc, IOException paramIOException, boolean paramBoolean);
  
  void q(a parama, int paramInt, d paramd);
  
  void r(a parama, Metadata paramMetadata);
  
  void s(a parama, int paramInt);
  
  void t(a parama, boolean paramBoolean, int paramInt);
  
  void u(a parama);
  
  void v(a parama);
  
  void w(a parama, float paramFloat);
  
  void x(a parama, TrackGroupArray paramTrackGroupArray, g paramg);
  
  void y(a parama, w.c paramc);
  
  void z(a parama, int paramInt1, int paramInt2);
  
  public static final class a {
    public final long a;
    
    public final y0 b;
    
    public final int c;
    
    public final v.a d;
    
    public final long e;
    
    public final long f;
    
    public final long g;
    
    public a(long param1Long1, y0 param1y0, int param1Int, v.a param1a, long param1Long2, long param1Long3, long param1Long4) {
      this.a = param1Long1;
      this.b = param1y0;
      this.c = param1Int;
      this.d = param1a;
      this.e = param1Long2;
      this.f = param1Long3;
      this.g = param1Long4;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/a1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */