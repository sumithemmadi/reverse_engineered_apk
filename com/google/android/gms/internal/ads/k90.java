package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.common.util.e;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public class k90 {
  private final Set<gb0<bq2>> a;
  
  private final Set<gb0<m40>> b;
  
  private final Set<gb0<f50>> c;
  
  private final Set<gb0<i60>> d;
  
  private final Set<gb0<d60>> e;
  
  private final Set<gb0<r40>> f;
  
  private final Set<gb0<b50>> g;
  
  private final Set<gb0<com.google.android.gms.ads.y.a>> h;
  
  private final Set<gb0<com.google.android.gms.ads.doubleclick.a>> i;
  
  private final Set<gb0<v60>> j;
  
  private final Set<gb0<p>> k;
  
  private final Set<gb0<d70>> l;
  
  private final ze1 m;
  
  private p40 n;
  
  private vy0 o;
  
  private k90(a parama) {
    this.a = a.m(parama);
    this.c = a.o(parama);
    this.d = a.p(parama);
    this.b = a.q(parama);
    this.e = a.r(parama);
    this.f = a.s(parama);
    this.g = a.t(parama);
    this.h = a.u(parama);
    this.i = a.v(parama);
    this.j = a.w(parama);
    this.m = a.x(parama);
    this.k = a.y(parama);
    this.l = a.z(parama);
  }
  
  public final vy0 a(e parame, xy0 paramxy0, nv0 paramnv0) {
    if (this.o == null)
      this.o = new vy0(parame, paramxy0, paramnv0); 
    return this.o;
  }
  
  public final Set<gb0<m40>> b() {
    return this.b;
  }
  
  public final Set<gb0<d60>> c() {
    return this.e;
  }
  
  public final Set<gb0<r40>> d() {
    return this.f;
  }
  
  public final Set<gb0<b50>> e() {
    return this.g;
  }
  
  public final Set<gb0<com.google.android.gms.ads.y.a>> f() {
    return this.h;
  }
  
  public final Set<gb0<com.google.android.gms.ads.doubleclick.a>> g() {
    return this.i;
  }
  
  public final Set<gb0<bq2>> h() {
    return this.a;
  }
  
  public final Set<gb0<f50>> i() {
    return this.c;
  }
  
  public final Set<gb0<i60>> j() {
    return this.d;
  }
  
  public final Set<gb0<v60>> k() {
    return this.j;
  }
  
  public final Set<gb0<d70>> l() {
    return this.l;
  }
  
  public final Set<gb0<p>> m() {
    return this.k;
  }
  
  public final ze1 n() {
    return this.m;
  }
  
  public final p40 o(Set<gb0<r40>> paramSet) {
    if (this.n == null)
      this.n = new p40(paramSet); 
    return this.n;
  }
  
  public static final class a {
    private Set<gb0<d70>> a = new HashSet<gb0<d70>>();
    
    private Set<gb0<bq2>> b = new HashSet<gb0<bq2>>();
    
    private Set<gb0<m40>> c = new HashSet<gb0<m40>>();
    
    private Set<gb0<f50>> d = new HashSet<gb0<f50>>();
    
    private Set<gb0<i60>> e = new HashSet<gb0<i60>>();
    
    private Set<gb0<d60>> f = new HashSet<gb0<d60>>();
    
    private Set<gb0<r40>> g = new HashSet<gb0<r40>>();
    
    private Set<gb0<com.google.android.gms.ads.y.a>> h = new HashSet<gb0<com.google.android.gms.ads.y.a>>();
    
    private Set<gb0<com.google.android.gms.ads.doubleclick.a>> i = new HashSet<gb0<com.google.android.gms.ads.doubleclick.a>>();
    
    private Set<gb0<b50>> j = new HashSet<gb0<b50>>();
    
    private Set<gb0<v60>> k = new HashSet<gb0<v60>>();
    
    private Set<gb0<p>> l = new HashSet<gb0<p>>();
    
    private ze1 m;
    
    public final a a(com.google.android.gms.ads.doubleclick.a param1a, Executor param1Executor) {
      this.i.add(new gb0<com.google.android.gms.ads.doubleclick.a>(param1a, param1Executor));
      return this;
    }
    
    public final a b(p param1p, Executor param1Executor) {
      this.l.add(new gb0<p>(param1p, param1Executor));
      return this;
    }
    
    public final a c(m40 param1m40, Executor param1Executor) {
      this.c.add(new gb0<m40>(param1m40, param1Executor));
      return this;
    }
    
    public final a d(r40 param1r40, Executor param1Executor) {
      this.g.add(new gb0<r40>(param1r40, param1Executor));
      return this;
    }
    
    public final a e(b50 param1b50, Executor param1Executor) {
      this.j.add(new gb0<b50>(param1b50, param1Executor));
      return this;
    }
    
    public final a f(f50 param1f50, Executor param1Executor) {
      this.d.add(new gb0<f50>(param1f50, param1Executor));
      return this;
    }
    
    public final a g(d60 param1d60, Executor param1Executor) {
      this.f.add(new gb0<d60>(param1d60, param1Executor));
      return this;
    }
    
    public final a h(i60 param1i60, Executor param1Executor) {
      this.e.add(new gb0<i60>(param1i60, param1Executor));
      return this;
    }
    
    public final a i(v60 param1v60, Executor param1Executor) {
      this.k.add(new gb0<v60>(param1v60, param1Executor));
      return this;
    }
    
    public final a j(d70 param1d70, Executor param1Executor) {
      this.a.add(new gb0<d70>(param1d70, param1Executor));
      return this;
    }
    
    public final a k(ze1 param1ze1) {
      this.m = param1ze1;
      return this;
    }
    
    public final a l(bq2 param1bq2, Executor param1Executor) {
      this.b.add(new gb0<bq2>(param1bq2, param1Executor));
      return this;
    }
    
    public final k90 n() {
      return new k90(this, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */