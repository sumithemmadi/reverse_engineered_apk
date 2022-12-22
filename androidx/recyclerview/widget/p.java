package androidx.recyclerview.widget;

import b.e.d;
import b.e.g;
import b.h.j.f;
import b.h.j.g;

class p {
  final g<RecyclerView.b0, a> a = new g();
  
  final d<RecyclerView.b0> b = new d();
  
  private RecyclerView.l.c l(RecyclerView.b0 paramb0, int paramInt) {
    int i = this.a.f(paramb0);
    if (i < 0)
      return null; 
    a a = (a)this.a.m(i);
    if (a != null) {
      int j = a.b;
      if ((j & paramInt) != 0) {
        RecyclerView.l.c c;
        j = (paramInt ^ 0xFFFFFFFF) & j;
        a.b = j;
        if (paramInt == 4) {
          c = a.c;
        } else if (paramInt == 8) {
          c = a.d;
        } else {
          throw new IllegalArgumentException("Must provide flag PRE or POST");
        } 
        if ((j & 0xC) == 0) {
          this.a.k(i);
          a.c(a);
        } 
        return c;
      } 
    } 
    return null;
  }
  
  void a(RecyclerView.b0 paramb0, RecyclerView.l.c paramc) {
    a a1 = (a)this.a.get(paramb0);
    a a2 = a1;
    if (a1 == null) {
      a2 = a.b();
      this.a.put(paramb0, a2);
    } 
    a2.b |= 0x2;
    a2.c = paramc;
  }
  
  void b(RecyclerView.b0 paramb0) {
    a a1 = (a)this.a.get(paramb0);
    a a2 = a1;
    if (a1 == null) {
      a2 = a.b();
      this.a.put(paramb0, a2);
    } 
    a2.b |= 0x1;
  }
  
  void c(long paramLong, RecyclerView.b0 paramb0) {
    this.b.n(paramLong, paramb0);
  }
  
  void d(RecyclerView.b0 paramb0, RecyclerView.l.c paramc) {
    a a1 = (a)this.a.get(paramb0);
    a a2 = a1;
    if (a1 == null) {
      a2 = a.b();
      this.a.put(paramb0, a2);
    } 
    a2.d = paramc;
    a2.b |= 0x8;
  }
  
  void e(RecyclerView.b0 paramb0, RecyclerView.l.c paramc) {
    a a1 = (a)this.a.get(paramb0);
    a a2 = a1;
    if (a1 == null) {
      a2 = a.b();
      this.a.put(paramb0, a2);
    } 
    a2.c = paramc;
    a2.b |= 0x4;
  }
  
  void f() {
    this.a.clear();
    this.b.b();
  }
  
  RecyclerView.b0 g(long paramLong) {
    return (RecyclerView.b0)this.b.i(paramLong);
  }
  
  boolean h(RecyclerView.b0 paramb0) {
    a a = (a)this.a.get(paramb0);
    boolean bool = true;
    if (a == null || (a.b & 0x1) == 0)
      bool = false; 
    return bool;
  }
  
  boolean i(RecyclerView.b0 paramb0) {
    boolean bool;
    a a = (a)this.a.get(paramb0);
    if (a != null && (a.b & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void j() {
    a.a();
  }
  
  public void k(RecyclerView.b0 paramb0) {
    p(paramb0);
  }
  
  RecyclerView.l.c m(RecyclerView.b0 paramb0) {
    return l(paramb0, 8);
  }
  
  RecyclerView.l.c n(RecyclerView.b0 paramb0) {
    return l(paramb0, 4);
  }
  
  void o(b paramb) {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      RecyclerView.b0 b0 = (RecyclerView.b0)this.a.i(i);
      a a = (a)this.a.k(i);
      int j = a.b;
      if ((j & 0x3) == 3) {
        paramb.a(b0);
      } else if ((j & 0x1) != 0) {
        RecyclerView.l.c c = a.c;
        if (c == null) {
          paramb.a(b0);
        } else {
          paramb.c(b0, c, a.d);
        } 
      } else if ((j & 0xE) == 14) {
        paramb.b(b0, a.c, a.d);
      } else if ((j & 0xC) == 12) {
        paramb.d(b0, a.c, a.d);
      } else if ((j & 0x4) != 0) {
        paramb.c(b0, a.c, null);
      } else if ((j & 0x8) != 0) {
        paramb.b(b0, a.c, a.d);
      } 
      a.c(a);
    } 
  }
  
  void p(RecyclerView.b0 paramb0) {
    a a = (a)this.a.get(paramb0);
    if (a == null)
      return; 
    a.b &= 0xFFFFFFFE;
  }
  
  void q(RecyclerView.b0 paramb0) {
    for (int i = this.b.s() - 1; i >= 0; i--) {
      if (paramb0 == this.b.t(i)) {
        this.b.r(i);
        break;
      } 
    } 
    a a = (a)this.a.remove(paramb0);
    if (a != null)
      a.c(a); 
  }
  
  static class a {
    static f<a> a = (f<a>)new g(20);
    
    int b;
    
    RecyclerView.l.c c;
    
    RecyclerView.l.c d;
    
    static void a() {
      while (a.b() != null);
    }
    
    static a b() {
      a a1 = (a)a.b();
      a a2 = a1;
      if (a1 == null)
        a2 = new a(); 
      return a2;
    }
    
    static void c(a param1a) {
      param1a.b = 0;
      param1a.c = null;
      param1a.d = null;
      a.c(param1a);
    }
  }
  
  static interface b {
    void a(RecyclerView.b0 param1b0);
    
    void b(RecyclerView.b0 param1b0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2);
    
    void c(RecyclerView.b0 param1b0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2);
    
    void d(RecyclerView.b0 param1b0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */