package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.zzn;
import java.util.concurrent.atomic.AtomicReference;

public final class yc1 implements p, r40, i60, ze1 {
  private final lj1 b;
  
  private final AtomicReference<tm2> c = new AtomicReference<tm2>();
  
  private final AtomicReference<um2> d = new AtomicReference<um2>();
  
  private final AtomicReference<zm2> e = new AtomicReference<zm2>();
  
  private final AtomicReference<i60> f = new AtomicReference<i60>();
  
  private final AtomicReference<p> g = new AtomicReference<p>();
  
  private yc1 h = null;
  
  public yc1(lj1 paramlj1) {
    this.b = paramlj1;
  }
  
  public static yc1 e(yc1 paramyc1) {
    yc1 yc11 = new yc1(paramyc1.b);
    yc11.y(paramyc1);
    return yc11;
  }
  
  public final void E(zzvg paramzzvg) {
    yc1 yc11 = this;
    while (true) {
      yc1 yc12 = yc11.h;
      if (yc12 != null) {
        yc11 = yc12;
        continue;
      } 
      se1.a(yc11.c, new ad1(paramzzvg));
      se1.a(yc11.c, new zc1(paramzzvg));
      return;
    } 
  }
  
  public final void M0() {
    yc1 yc11 = this;
    while (true) {
      yc1 yc12 = yc11.h;
      if (yc12 != null) {
        yc11 = yc12;
        continue;
      } 
      se1.a(yc11.g, id1.a);
      return;
    } 
  }
  
  public final void R5(zzn paramzzn) {
    yc1 yc11 = this;
    while (true) {
      yc1 yc12 = yc11.h;
      if (yc12 != null) {
        yc11 = yc12;
        continue;
      } 
      se1.a(yc11.g, new fd1(paramzzn));
      return;
    } 
  }
  
  public final void a() {
    yc1 yc11 = this;
    while (true) {
      yc1 yc12 = yc11.h;
      if (yc12 != null) {
        yc11 = yc12;
        continue;
      } 
      yc11.b.a();
      se1.a(yc11.d, cd1.a);
      se1.a(yc11.e, bd1.a);
      return;
    } 
  }
  
  public final void b(p paramp) {
    this.g.set(paramp);
  }
  
  public final void c(i60 parami60) {
    this.f.set(parami60);
  }
  
  public final void d(zm2 paramzm2) {
    this.e.set(paramzm2);
  }
  
  public final void f(om2 paramom2) {
    yc1 yc11 = this;
    while (true) {
      yc1 yc12 = yc11.h;
      if (yc12 != null) {
        yc11 = yc12;
        continue;
      } 
      se1.a(yc11.c, new xc1(paramom2));
      return;
    } 
  }
  
  public final void g(tm2 paramtm2) {
    this.c.set(paramtm2);
  }
  
  public final void h(um2 paramum2) {
    this.d.set(paramum2);
  }
  
  public final void o1() {
    yc1 yc11 = this;
    while (true) {
      yc1 yc12 = yc11.h;
      if (yc12 != null) {
        yc11 = yc12;
        continue;
      } 
      se1.a(yc11.f, ed1.a);
      return;
    } 
  }
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final void u9() {
    yc1 yc11 = this;
    while (true) {
      yc1 yc12 = yc11.h;
      if (yc12 != null) {
        yc11 = yc12;
        continue;
      } 
      se1.a(yc11.g, dd1.a);
      se1.a(yc11.e, gd1.a);
      return;
    } 
  }
  
  public final void y(ze1 paramze1) {
    this.h = (yc1)paramze1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */