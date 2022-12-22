package com.bumptech.glide.load.j.g;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.h;
import com.bumptech.glide.i;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.h;
import com.bumptech.glide.p.j;
import com.bumptech.glide.p.k;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.h.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class g {
  private final com.bumptech.glide.l.a a;
  
  private final Handler b;
  
  private final List<b> c = new ArrayList<b>();
  
  final i d;
  
  private final e e;
  
  private boolean f;
  
  private boolean g;
  
  private boolean h;
  
  private h<Bitmap> i;
  
  private a j;
  
  private boolean k;
  
  private a l;
  
  private Bitmap m;
  
  private h<Bitmap> n;
  
  private a o;
  
  private d p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  g(com.bumptech.glide.c paramc, com.bumptech.glide.l.a parama, int paramInt1, int paramInt2, h<Bitmap> paramh, Bitmap paramBitmap) {
    this(paramc.f(), com.bumptech.glide.c.u(paramc.h()), parama, null, i(com.bumptech.glide.c.u(paramc.h()), paramInt1, paramInt2), paramh, paramBitmap);
  }
  
  g(e parame, i parami, com.bumptech.glide.l.a parama, Handler paramHandler, h<Bitmap> paramh, h<Bitmap> paramh1, Bitmap paramBitmap) {
    this.d = parami;
    Handler handler = paramHandler;
    if (paramHandler == null)
      handler = new Handler(Looper.getMainLooper(), new c(this)); 
    this.e = parame;
    this.b = handler;
    this.i = paramh;
    this.a = parama;
    o(paramh1, paramBitmap);
  }
  
  private static com.bumptech.glide.load.c g() {
    return (com.bumptech.glide.load.c)new com.bumptech.glide.o.d(Double.valueOf(Math.random()));
  }
  
  private static h<Bitmap> i(i parami, int paramInt1, int paramInt2) {
    return parami.j().r0(((e)((e)e.r0(h.b).p0(true)).k0(true)).a0(paramInt1, paramInt2));
  }
  
  private void l() {
    if (this.f && !this.g) {
      if (this.h) {
        boolean bool;
        if (this.o == null) {
          bool = true;
        } else {
          bool = false;
        } 
        j.a(bool, "Pending target must be null when starting from the first frame");
        this.a.g();
        this.h = false;
      } 
      a a1 = this.o;
      if (a1 != null) {
        this.o = null;
        m(a1);
        return;
      } 
      this.g = true;
      int j = this.a.d();
      long l1 = SystemClock.uptimeMillis();
      long l2 = j;
      this.a.b();
      this.l = new a(this.b, this.a.h(), l1 + l2);
      this.i.r0((com.bumptech.glide.request.a)e.s0(g())).G0(this.a).z0((h)this.l);
    } 
  }
  
  private void n() {
    Bitmap bitmap = this.m;
    if (bitmap != null) {
      this.e.c(bitmap);
      this.m = null;
    } 
  }
  
  private void p() {
    if (this.f)
      return; 
    this.f = true;
    this.k = false;
    l();
  }
  
  private void q() {
    this.f = false;
  }
  
  void a() {
    this.c.clear();
    n();
    q();
    a a1 = this.j;
    if (a1 != null) {
      this.d.l((h)a1);
      this.j = null;
    } 
    a1 = this.l;
    if (a1 != null) {
      this.d.l((h)a1);
      this.l = null;
    } 
    a1 = this.o;
    if (a1 != null) {
      this.d.l((h)a1);
      this.o = null;
    } 
    this.a.clear();
    this.k = true;
  }
  
  ByteBuffer b() {
    return this.a.f().asReadOnlyBuffer();
  }
  
  Bitmap c() {
    Bitmap bitmap;
    a a1 = this.j;
    if (a1 != null) {
      bitmap = a1.i();
    } else {
      bitmap = this.m;
    } 
    return bitmap;
  }
  
  int d() {
    byte b;
    a a1 = this.j;
    if (a1 != null) {
      b = a1.f;
    } else {
      b = -1;
    } 
    return b;
  }
  
  Bitmap e() {
    return this.m;
  }
  
  int f() {
    return this.a.c();
  }
  
  int h() {
    return this.s;
  }
  
  int j() {
    return this.a.i() + this.q;
  }
  
  int k() {
    return this.r;
  }
  
  void m(a parama) {
    d d1 = this.p;
    if (d1 != null)
      d1.a(); 
    this.g = false;
    if (this.k) {
      this.b.obtainMessage(2, parama).sendToTarget();
      return;
    } 
    if (!this.f) {
      if (this.h) {
        this.b.obtainMessage(2, parama).sendToTarget();
      } else {
        this.o = parama;
      } 
      return;
    } 
    if (parama.i() != null) {
      n();
      a a1 = this.j;
      this.j = parama;
      for (int j = this.c.size() - 1; j >= 0; j--)
        ((b)this.c.get(j)).a(); 
      if (a1 != null)
        this.b.obtainMessage(2, a1).sendToTarget(); 
    } 
    l();
  }
  
  void o(h<Bitmap> paramh, Bitmap paramBitmap) {
    this.n = (h<Bitmap>)j.d(paramh);
    this.m = (Bitmap)j.d(paramBitmap);
    this.i = this.i.r0((new e()).l0(paramh));
    this.q = k.g(paramBitmap);
    this.r = paramBitmap.getWidth();
    this.s = paramBitmap.getHeight();
  }
  
  void r(b paramb) {
    if (!this.k) {
      if (!this.c.contains(paramb)) {
        boolean bool = this.c.isEmpty();
        this.c.add(paramb);
        if (bool)
          p(); 
        return;
      } 
      throw new IllegalStateException("Cannot subscribe twice in a row");
    } 
    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
  }
  
  void s(b paramb) {
    this.c.remove(paramb);
    if (this.c.isEmpty())
      q(); 
  }
  
  static class a extends com.bumptech.glide.request.h.c<Bitmap> {
    private final Handler e;
    
    final int f;
    
    private final long g;
    
    private Bitmap h;
    
    a(Handler param1Handler, int param1Int, long param1Long) {
      this.e = param1Handler;
      this.f = param1Int;
      this.g = param1Long;
    }
    
    public void g(Drawable param1Drawable) {
      this.h = null;
    }
    
    Bitmap i() {
      return this.h;
    }
    
    public void j(Bitmap param1Bitmap, com.bumptech.glide.request.i.b<? super Bitmap> param1b) {
      this.h = param1Bitmap;
      Message message = this.e.obtainMessage(1, this);
      this.e.sendMessageAtTime(message, this.g);
    }
  }
  
  public static interface b {
    void a();
  }
  
  private class c implements Handler.Callback {
    c(g this$0) {}
    
    public boolean handleMessage(Message param1Message) {
      g.a a;
      int i = param1Message.what;
      if (i == 1) {
        a = (g.a)param1Message.obj;
        this.b.m(a);
        return true;
      } 
      if (i == 2) {
        a = (g.a)((Message)a).obj;
        this.b.d.l((h)a);
      } 
      return false;
    }
  }
  
  static interface d {
    void a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */