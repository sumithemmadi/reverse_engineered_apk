package b.a.o;

import android.view.View;
import android.view.animation.Interpolator;
import b.h.k.a0;
import b.h.k.b0;
import b.h.k.c0;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
  final ArrayList<a0> a = new ArrayList<a0>();
  
  private long b = -1L;
  
  private Interpolator c;
  
  b0 d;
  
  private boolean e;
  
  private final c0 f = new a(this);
  
  public void a() {
    if (!this.e)
      return; 
    Iterator<a0> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((a0)iterator.next()).b(); 
    this.e = false;
  }
  
  void b() {
    this.e = false;
  }
  
  public h c(a0 parama0) {
    if (!this.e)
      this.a.add(parama0); 
    return this;
  }
  
  public h d(a0 parama01, a0 parama02) {
    this.a.add(parama01);
    parama02.h(parama01.c());
    this.a.add(parama02);
    return this;
  }
  
  public h e(long paramLong) {
    if (!this.e)
      this.b = paramLong; 
    return this;
  }
  
  public h f(Interpolator paramInterpolator) {
    if (!this.e)
      this.c = paramInterpolator; 
    return this;
  }
  
  public h g(b0 paramb0) {
    if (!this.e)
      this.d = paramb0; 
    return this;
  }
  
  public void h() {
    if (this.e)
      return; 
    for (a0 a0 : this.a) {
      long l = this.b;
      if (l >= 0L)
        a0.d(l); 
      Interpolator interpolator = this.c;
      if (interpolator != null)
        a0.e(interpolator); 
      if (this.d != null)
        a0.f((b0)this.f); 
      a0.j();
    } 
    this.e = true;
  }
  
  class a extends c0 {
    private boolean a = false;
    
    private int b = 0;
    
    a(h this$0) {}
    
    public void b(View param1View) {
      int i = this.b + 1;
      this.b = i;
      if (i == this.c.a.size()) {
        b0 b0 = this.c.d;
        if (b0 != null)
          b0.b(null); 
        d();
      } 
    }
    
    public void c(View param1View) {
      if (this.a)
        return; 
      this.a = true;
      b0 b0 = this.c.d;
      if (b0 != null)
        b0.c(null); 
    }
    
    void d() {
      this.b = 0;
      this.a = false;
      this.c.b();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/o/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */