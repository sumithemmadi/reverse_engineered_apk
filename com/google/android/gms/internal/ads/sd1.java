package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;

public final class sd1 implements f31<qy> {
  private final Context a;
  
  private final Executor b;
  
  private final ss c;
  
  private final z11 d;
  
  private final u21 e;
  
  private final ViewGroup f;
  
  private i1 g;
  
  private final u60 h;
  
  private final ii1 i;
  
  private ot1<qy> j;
  
  public sd1(Context paramContext, Executor paramExecutor, zzvs paramzzvs, ss paramss, z11 paramz11, u21 paramu21, ii1 paramii1) {
    this.a = paramContext;
    this.b = paramExecutor;
    this.c = paramss;
    this.d = paramz11;
    this.e = paramu21;
    this.i = paramii1;
    this.h = paramss.j();
    this.f = (ViewGroup)new FrameLayout(paramContext);
    paramii1.z(paramzzvs);
  }
  
  public final boolean a(zzvl paramzzvl, String paramString, e31 parame31, h31<? super qy> paramh31) {
    nz nz;
    if (paramString == null) {
      cm.g("Ad unit ID should not be null for banner ad.");
      this.b.execute(new vd1(this));
      return false;
    } 
    if (r())
      return false; 
    gi1 gi1 = this.i.A(paramString).C(paramzzvl).e();
    if (((Boolean)k2.c.a()).booleanValue() && (this.i.G()).l) {
      z11 z111 = this.d;
      if (z111 != null)
        z111.E(bj1.b(zzdom.h, null, null)); 
      return false;
    } 
    x<Boolean> x = m0.J5;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      nz = this.c.m().s((new w30.a()).g(this.a).c(gi1).d()).t((new k90.a()).j(this.d, this.b).a(this.d, this.b).n()).m(new b11(this.g)).c(new yd0(ag0.a, null)).r(new m00(this.h)).a(new py(this.f)).z();
    } else {
      nz = this.c.m().s((new w30.a()).g(this.a).c(gi1).d()).t((new k90.a()).j(this.d, this.b).l(this.d, this.b).l(this.e, this.b).f(this.d, this.b).c(this.d, this.b).g(this.d, this.b).d(this.d, this.b).a(this.d, this.b).i(this.d, this.b).n()).m(new b11(this.g)).c(new yd0(ag0.a, null)).r(new m00(this.h)).a(new py(this.f)).z();
    } 
    ot1<qy> ot11 = nz.c().g();
    this.j = ot11;
    dt1.g(ot11, new ud1(this, paramh31, nz), this.b);
    return true;
  }
  
  public final void d(i1 parami1) {
    this.g = parami1;
  }
  
  public final void e(y60 paramy60) {
    this.h.Z0(paramy60, this.b);
  }
  
  public final void f(ir2 paramir2) {
    this.e.i(paramir2);
  }
  
  public final ViewGroup g() {
    return this.f;
  }
  
  public final ii1 h() {
    return this.i;
  }
  
  public final boolean i() {
    ViewParent viewParent = this.f.getParent();
    if (!(viewParent instanceof View))
      return false; 
    View view = (View)viewParent;
    return q.c().q(view, view.getContext());
  }
  
  public final void j() {
    this.h.e1(60);
  }
  
  public final boolean r() {
    ot1<qy> ot11 = this.j;
    return (ot11 != null && !ot11.isDone());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */