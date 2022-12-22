package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.a;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zc extends ec {
  private final w b;
  
  public zc(w paramw) {
    this.b = paramw;
  }
  
  public final String B() {
    return this.b.b();
  }
  
  public final String C() {
    return this.b.p();
  }
  
  public final void F(a parama) {
    this.b.G((View)b.o1(parama));
  }
  
  public final boolean M() {
    return this.b.m();
  }
  
  public final void N(a parama1, a parama2, a parama3) {
    HashMap hashMap1 = (HashMap)b.o1(parama2);
    HashMap hashMap2 = (HashMap)b.o1(parama3);
    this.b.F((View)b.o1(parama1), hashMap1, hashMap2);
  }
  
  public final float V2() {
    return this.b.e();
  }
  
  public final a W() {
    View view = this.b.I();
    return (view == null) ? null : b.a2(view);
  }
  
  public final a a0() {
    View view = this.b.a();
    return (view == null) ? null : b.a2(view);
  }
  
  public final void b0(a parama) {
    this.b.r((View)b.o1(parama));
  }
  
  public final float b2() {
    return this.b.k();
  }
  
  public final Bundle d() {
    return this.b.g();
  }
  
  public final boolean d0() {
    return this.b.l();
  }
  
  public final a e() {
    Object object = this.b.J();
    return (object == null) ? null : b.a2(object);
  }
  
  public final String f() {
    return this.b.h();
  }
  
  public final f3 g() {
    return null;
  }
  
  public final nt2 getVideoController() {
    return (this.b.q() != null) ? this.b.q().c() : null;
  }
  
  public final String h() {
    return this.b.d();
  }
  
  public final String j() {
    return this.b.c();
  }
  
  public final List k() {
    List list = this.b.j();
    ArrayList<a3> arrayList = new ArrayList();
    if (list != null)
      for (a.b b : list)
        arrayList.add(new a3(b.a(), b.d(), b.c(), b.e(), b.b()));  
    return arrayList;
  }
  
  public final float n3() {
    return this.b.f();
  }
  
  public final void q() {
    this.b.t();
  }
  
  public final String s() {
    return this.b.n();
  }
  
  public final m3 t() {
    a.b b = this.b.i();
    return (b != null) ? new a3(b.a(), b.d(), b.c(), b.e(), b.b()) : null;
  }
  
  public final double w() {
    return (this.b.o() != null) ? this.b.o().doubleValue() : -1.0D;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */