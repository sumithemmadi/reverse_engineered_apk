package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.v;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public interface w {
  void A(int paramInt, v.a parama, c paramc);
  
  void e(int paramInt, v.a parama, b paramb, c paramc);
  
  void h(int paramInt, v.a parama);
  
  void i(int paramInt, v.a parama, b paramb, c paramc);
  
  void q(int paramInt, v.a parama, b paramb, c paramc);
  
  void r(int paramInt, v.a parama, b paramb, c paramc, IOException paramIOException, boolean paramBoolean);
  
  void u(int paramInt, v.a parama);
  
  void w(int paramInt, v.a parama);
  
  public static final class a {
    public final int a;
    
    public final v.a b;
    
    private final CopyOnWriteArrayList<a> c;
    
    private final long d;
    
    public a() {
      this(new CopyOnWriteArrayList<a>(), 0, null, 0L);
    }
    
    private a(CopyOnWriteArrayList<a> param1CopyOnWriteArrayList, int param1Int, v.a param1a, long param1Long) {
      this.c = param1CopyOnWriteArrayList;
      this.a = param1Int;
      this.b = param1a;
      this.d = param1Long;
    }
    
    private void I(Handler param1Handler, Runnable param1Runnable) {
      if (param1Handler.getLooper() == Looper.myLooper()) {
        param1Runnable.run();
      } else {
        param1Handler.post(param1Runnable);
      } 
    }
    
    private long b(long param1Long) {
      long l = v.b(param1Long);
      param1Long = -9223372036854775807L;
      if (l != -9223372036854775807L)
        param1Long = this.d + l; 
      return param1Long;
    }
    
    public void A(w.b param1b, w.c param1c, IOException param1IOException, boolean param1Boolean) {
      for (a a1 : this.c) {
        w w = a1.b;
        I(a1.a, new c(this, w, param1b, param1c, param1IOException, param1Boolean));
      } 
    }
    
    public void B(l param1l, Uri param1Uri, Map<String, List<String>> param1Map, int param1Int1, int param1Int2, Format param1Format, int param1Int3, Object param1Object, long param1Long1, long param1Long2, long param1Long3, long param1Long4, long param1Long5, IOException param1IOException, boolean param1Boolean) {
      A(new w.b(param1l, param1Uri, param1Map, param1Long3, param1Long4, param1Long5), new w.c(param1Int1, param1Int2, param1Format, param1Int3, param1Object, b(param1Long1), b(param1Long2)), param1IOException, param1Boolean);
    }
    
    public void C(l param1l, Uri param1Uri, Map<String, List<String>> param1Map, int param1Int, long param1Long1, long param1Long2, long param1Long3, IOException param1IOException, boolean param1Boolean) {
      B(param1l, param1Uri, param1Map, param1Int, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, param1Long1, param1Long2, param1Long3, param1IOException, param1Boolean);
    }
    
    public void D(w.b param1b, w.c param1c) {
      for (a a1 : this.c) {
        w w = a1.b;
        I(a1.a, new b(this, w, param1b, param1c));
      } 
    }
    
    public void E(l param1l, int param1Int1, int param1Int2, Format param1Format, int param1Int3, Object param1Object, long param1Long1, long param1Long2, long param1Long3) {
      D(new w.b(param1l, param1l.a, Collections.emptyMap(), param1Long3, 0L, 0L), new w.c(param1Int1, param1Int2, param1Format, param1Int3, param1Object, b(param1Long1), b(param1Long2)));
    }
    
    public void F(l param1l, int param1Int, long param1Long) {
      E(param1l, param1Int, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, param1Long);
    }
    
    public void G() {
      v.a a1 = (v.a)e.e(this.b);
      for (a a2 : this.c) {
        w w = a2.b;
        I(a2.a, new i(this, w, a1));
      } 
    }
    
    public void H() {
      v.a a1 = (v.a)e.e(this.b);
      for (a a2 : this.c) {
        w w = a2.b;
        I(a2.a, new f(this, w, a1));
      } 
    }
    
    public void J() {
      v.a a1 = (v.a)e.e(this.b);
      for (a a2 : this.c) {
        w w = a2.b;
        I(a2.a, new h(this, w, a1));
      } 
    }
    
    public void K(w param1w) {
      for (a a1 : this.c) {
        if (a1.b == param1w)
          this.c.remove(a1); 
      } 
    }
    
    public a L(int param1Int, v.a param1a, long param1Long) {
      return new a(this.c, param1Int, param1a, param1Long);
    }
    
    public void a(Handler param1Handler, w param1w) {
      boolean bool;
      if (param1Handler != null && param1w != null) {
        bool = true;
      } else {
        bool = false;
      } 
      e.a(bool);
      this.c.add(new a(param1Handler, param1w));
    }
    
    public void c(int param1Int1, Format param1Format, int param1Int2, Object param1Object, long param1Long) {
      d(new w.c(1, param1Int1, param1Format, param1Int2, param1Object, b(param1Long), -9223372036854775807L));
    }
    
    public void d(w.c param1c) {
      for (a a1 : this.c) {
        w w = a1.b;
        I(a1.a, new d(this, w, param1c));
      } 
    }
    
    public void u(w.b param1b, w.c param1c) {
      for (a a1 : this.c) {
        w w = a1.b;
        I(a1.a, new e(this, w, param1b, param1c));
      } 
    }
    
    public void v(l param1l, Uri param1Uri, Map<String, List<String>> param1Map, int param1Int1, int param1Int2, Format param1Format, int param1Int3, Object param1Object, long param1Long1, long param1Long2, long param1Long3, long param1Long4, long param1Long5) {
      u(new w.b(param1l, param1Uri, param1Map, param1Long3, param1Long4, param1Long5), new w.c(param1Int1, param1Int2, param1Format, param1Int3, param1Object, b(param1Long1), b(param1Long2)));
    }
    
    public void w(l param1l, Uri param1Uri, Map<String, List<String>> param1Map, int param1Int, long param1Long1, long param1Long2, long param1Long3) {
      v(param1l, param1Uri, param1Map, param1Int, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, param1Long1, param1Long2, param1Long3);
    }
    
    public void x(w.b param1b, w.c param1c) {
      for (a a1 : this.c) {
        w w = a1.b;
        I(a1.a, new g(this, w, param1b, param1c));
      } 
    }
    
    public void y(l param1l, Uri param1Uri, Map<String, List<String>> param1Map, int param1Int1, int param1Int2, Format param1Format, int param1Int3, Object param1Object, long param1Long1, long param1Long2, long param1Long3, long param1Long4, long param1Long5) {
      x(new w.b(param1l, param1Uri, param1Map, param1Long3, param1Long4, param1Long5), new w.c(param1Int1, param1Int2, param1Format, param1Int3, param1Object, b(param1Long1), b(param1Long2)));
    }
    
    public void z(l param1l, Uri param1Uri, Map<String, List<String>> param1Map, int param1Int, long param1Long1, long param1Long2, long param1Long3) {
      y(param1l, param1Uri, param1Map, param1Int, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, param1Long1, param1Long2, param1Long3);
    }
    
    private static final class a {
      public final Handler a;
      
      public final w b;
      
      public a(Handler param2Handler, w param2w) {
        this.a = param2Handler;
        this.b = param2w;
      }
    }
  }
  
  private static final class a {
    public final Handler a;
    
    public final w b;
    
    public a(Handler param1Handler, w param1w) {
      this.a = param1Handler;
      this.b = param1w;
    }
  }
  
  public static final class b {
    public final l a;
    
    public final Uri b;
    
    public final Map<String, List<String>> c;
    
    public final long d;
    
    public final long e;
    
    public final long f;
    
    public b(l param1l, Uri param1Uri, Map<String, List<String>> param1Map, long param1Long1, long param1Long2, long param1Long3) {
      this.a = param1l;
      this.b = param1Uri;
      this.c = param1Map;
      this.d = param1Long1;
      this.e = param1Long2;
      this.f = param1Long3;
    }
  }
  
  public static final class c {
    public final int a;
    
    public final int b;
    
    public final Format c;
    
    public final int d;
    
    public final Object e;
    
    public final long f;
    
    public final long g;
    
    public c(int param1Int1, int param1Int2, Format param1Format, int param1Int3, Object param1Object, long param1Long1, long param1Long2) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Format;
      this.d = param1Int3;
      this.e = param1Object;
      this.f = param1Long1;
      this.g = param1Long2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */