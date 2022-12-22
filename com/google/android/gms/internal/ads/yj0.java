package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Collections;
import java.util.List;

public final class yj0 extends l5 {
  private final String b;
  
  private final ff0 c;
  
  private final pf0 d;
  
  public yj0(String paramString, ff0 paramff0, pf0 parampf0) {
    this.b = paramString;
    this.c = paramff0;
    this.d = parampf0;
  }
  
  public final String B() {
    return this.d.b();
  }
  
  public final void B0() {
    this.c.M();
  }
  
  public final String C() {
    return this.d.m();
  }
  
  public final boolean D3() {
    return (!this.d.j().isEmpty() && this.d.D() != null);
  }
  
  public final List<?> D6() {
    return D3() ? this.d.j() : Collections.emptyList();
  }
  
  public final void G(Bundle paramBundle) {
    this.c.G(paramBundle);
  }
  
  public final void G0(i5 parami5) {
    this.c.n(parami5);
  }
  
  public final void R0(ys2 paramys2) {
    this.c.q(paramys2);
  }
  
  public final boolean T(Bundle paramBundle) {
    return this.c.K(paramBundle);
  }
  
  public final void U(gt2 paramgt2) {
    this.c.r(paramgt2);
  }
  
  public final String a() {
    return this.b;
  }
  
  public final void c0(Bundle paramBundle) {
    this.c.J(paramBundle);
  }
  
  public final Bundle d() {
    return this.d.f();
  }
  
  public final void destroy() {
    this.c.a();
  }
  
  public final a e() {
    return this.d.c0();
  }
  
  public final void e9() {
    this.c.i();
  }
  
  public final String f() {
    return this.d.g();
  }
  
  public final f3 g() {
    return this.d.b0();
  }
  
  public final nt2 getVideoController() {
    return this.d.n();
  }
  
  public final String h() {
    return this.d.d();
  }
  
  public final String j() {
    return this.d.c();
  }
  
  public final List<?> k() {
    return this.d.h();
  }
  
  public final i3 n0() {
    return this.c.x().b();
  }
  
  public final boolean n1() {
    return this.c.h();
  }
  
  public final void o0(us2 paramus2) {
    this.c.p(paramus2);
  }
  
  public final ht2 p() {
    x<Boolean> x = m0.p5;
    return !((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? null : this.c.d();
  }
  
  public final void r0() {
    this.c.g();
  }
  
  public final String s() {
    return this.d.k();
  }
  
  public final m3 t() {
    return this.d.a0();
  }
  
  public final a v() {
    return b.a2(this.c);
  }
  
  public final double w() {
    return this.d.l();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */