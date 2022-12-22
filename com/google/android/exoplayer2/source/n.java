package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.y0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public abstract class n<T> extends l {
  private final HashMap<T, b> f = new HashMap<T, b>();
  
  private Handler g;
  
  private x h;
  
  protected boolean A(v.a parama) {
    return true;
  }
  
  public void h() {
    Iterator iterator = this.f.values().iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).a.h(); 
  }
  
  protected void n() {
    for (b b : this.f.values())
      b.a.f(b.b); 
  }
  
  protected void o() {
    for (b b : this.f.values())
      b.a.k(b.b); 
  }
  
  protected void q(x paramx) {
    this.h = paramx;
    this.g = new Handler();
  }
  
  protected void s() {
    for (b b : this.f.values()) {
      b.a.b(b.b);
      b.a.e(b.c);
    } 
    this.f.clear();
  }
  
  protected v.a t(T paramT, v.a parama) {
    return parama;
  }
  
  protected long u(T paramT, long paramLong) {
    return paramLong;
  }
  
  protected int v(T paramT, int paramInt) {
    return paramInt;
  }
  
  protected abstract void y(T paramT, v paramv, y0 paramy0);
  
  protected final void z(T paramT, v paramv) {
    e.a(this.f.containsKey(paramT) ^ true);
    a a = new a(this, paramT);
    a a1 = new a(this, paramT);
    this.f.put(paramT, new b(paramv, a, a1));
    paramv.d((Handler)e.e(this.g), a1);
    paramv.j(a, this.h);
    if (!p())
      paramv.f(a); 
  }
  
  private final class a implements w {
    private final T b;
    
    private w.a c;
    
    public a(n this$0, T param1T) {
      this.c = this$0.m(null);
      this.b = param1T;
    }
    
    private boolean a(int param1Int, v.a param1a) {
      if (param1a != null) {
        v.a a2 = this.d.t(this.b, param1a);
        param1a = a2;
        if (a2 == null)
          return false; 
      } else {
        param1a = null;
      } 
      param1Int = this.d.v(this.b, param1Int);
      w.a a1 = this.c;
      if (a1.a != param1Int || !h0.b(a1.b, param1a))
        this.c = this.d.l(param1Int, param1a, 0L); 
      return true;
    }
    
    private w.c b(w.c param1c) {
      long l1 = this.d.u(this.b, param1c.f);
      long l2 = this.d.u(this.b, param1c.g);
      return (l1 == param1c.f && l2 == param1c.g) ? param1c : new w.c(param1c.a, param1c.b, param1c.c, param1c.d, param1c.e, l1, l2);
    }
    
    public void A(int param1Int, v.a param1a, w.c param1c) {
      if (a(param1Int, param1a))
        this.c.d(b(param1c)); 
    }
    
    public void e(int param1Int, v.a param1a, w.b param1b, w.c param1c) {
      if (a(param1Int, param1a))
        this.c.x(param1b, b(param1c)); 
    }
    
    public void h(int param1Int, v.a param1a) {
      if (a(param1Int, param1a))
        this.c.J(); 
    }
    
    public void i(int param1Int, v.a param1a, w.b param1b, w.c param1c) {
      if (a(param1Int, param1a))
        this.c.u(param1b, b(param1c)); 
    }
    
    public void q(int param1Int, v.a param1a, w.b param1b, w.c param1c) {
      if (a(param1Int, param1a))
        this.c.D(param1b, b(param1c)); 
    }
    
    public void r(int param1Int, v.a param1a, w.b param1b, w.c param1c, IOException param1IOException, boolean param1Boolean) {
      if (a(param1Int, param1a))
        this.c.A(param1b, b(param1c), param1IOException, param1Boolean); 
    }
    
    public void u(int param1Int, v.a param1a) {
      if (a(param1Int, param1a) && this.d.A((v.a)e.e(this.c.b)))
        this.c.H(); 
    }
    
    public void w(int param1Int, v.a param1a) {
      if (a(param1Int, param1a) && this.d.A((v.a)e.e(this.c.b)))
        this.c.G(); 
    }
  }
  
  private static final class b {
    public final v a;
    
    public final v.b b;
    
    public final w c;
    
    public b(v param1v, v.b param1b, w param1w) {
      this.a = param1v;
      this.b = param1b;
      this.c = param1w;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */