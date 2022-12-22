package androidx.work.impl;

import androidx.lifecycle.m;
import androidx.work.h;
import androidx.work.impl.utils.futures.a;

public class b implements h {
  private final m<h.b> c = new m();
  
  private final a<h.b.c> d = a.t();
  
  public b() {
    a((h.b)h.b);
  }
  
  public void a(h.b paramb) {
    this.c.l(paramb);
    if (paramb instanceof h.b.c) {
      this.d.p(paramb);
    } else if (paramb instanceof h.b.a) {
      h.b.a a1 = (h.b.a)paramb;
      this.d.q(a1.a());
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */