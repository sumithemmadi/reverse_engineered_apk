package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.y.a;
import java.util.concurrent.atomic.AtomicReference;

public final class xf1 extends a implements m40, r40, b50, d60, v60, ze1 {
  private final lj1 b;
  
  private final AtomicReference<a> c = new AtomicReference<a>();
  
  private final AtomicReference<ti> d = new AtomicReference<ti>();
  
  private final AtomicReference<qi> e = new AtomicReference<qi>();
  
  private final AtomicReference<uh> f = new AtomicReference<uh>();
  
  private final AtomicReference<yi> g = new AtomicReference<yi>();
  
  private final AtomicReference<ph> h = new AtomicReference<ph>();
  
  private final AtomicReference<gt2> i = new AtomicReference<gt2>();
  
  private xf1 j = null;
  
  public xf1(lj1 paramlj1) {
    this.b = paramlj1;
  }
  
  public final void B() {
    xf1 xf11 = this.j;
    if (xf11 != null) {
      xf11.B();
      return;
    } 
    se1.a(this.c, gg1.a);
  }
  
  public final void C(a parama) {
    this.c.set(parama);
  }
  
  @Deprecated
  public final void D(ph paramph) {
    this.h.set(paramph);
  }
  
  public final void E(zzvg paramzzvg) {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      int i = paramzzvg.b;
      se1.a(xf11.d, new ig1(paramzzvg));
      se1.a(xf11.d, new lg1(i));
      se1.a(xf11.f, new kg1(i));
      return;
    } 
  }
  
  public final void H(kh paramkh, String paramString1, String paramString2) {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      se1.a(xf11.e, new bg1(paramkh));
      se1.a(xf11.g, new ag1(paramkh, paramString1, paramString2));
      se1.a(xf11.f, new dg1(paramkh));
      se1.a(xf11.h, new cg1(paramkh, paramString1, paramString2));
      return;
    } 
  }
  
  public final void I() {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      se1.a(xf11.f, yf1.a);
      return;
    } 
  }
  
  @Deprecated
  public final void J(uh paramuh) {
    this.f.set(paramuh);
  }
  
  public final void K() {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      se1.a(xf11.f, fg1.a);
      return;
    } 
  }
  
  public final void L() {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      se1.a(xf11.e, ng1.a);
      se1.a(xf11.f, mg1.a);
      return;
    } 
  }
  
  public final void O() {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      se1.a(xf11.f, sg1.a);
      return;
    } 
  }
  
  public final void Y() {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      xf11.b.a();
      se1.a(xf11.e, pg1.a);
      se1.a(xf11.f, og1.a);
      return;
    } 
  }
  
  public final void g0(qi paramqi) {
    this.e.set(paramqi);
  }
  
  public final void i() {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      se1.a(xf11.d, wf1.a);
      se1.a(xf11.f, zf1.a);
      return;
    } 
  }
  
  public final void i0(ti paramti) {
    this.d.set(paramti);
  }
  
  public final void k0(yi paramyi) {
    this.g.set(paramyi);
  }
  
  public final void l0(gt2 paramgt2) {
    this.i.set(paramgt2);
  }
  
  public final void r(zzvg paramzzvg) {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      se1.a(xf11.e, new eg1(paramzzvg));
      se1.a(xf11.e, new hg1(paramzzvg));
      return;
    } 
  }
  
  public final void t(zzvu paramzzvu) {
    xf1 xf11 = this;
    while (true) {
      xf1 xf12 = xf11.j;
      if (xf12 != null) {
        xf11 = xf12;
        continue;
      } 
      se1.a(xf11.i, new jg1(paramzzvu));
      return;
    } 
  }
  
  public final void y(ze1 paramze1) {
    this.j = (xf1)paramze1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */