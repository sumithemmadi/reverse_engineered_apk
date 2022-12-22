package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.a;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class qc extends yb {
  private final r b;
  
  public qc(r paramr) {
    this.b = paramr;
  }
  
  public final String C() {
    return this.b.w();
  }
  
  public final void F(a parama) {
    this.b.m((View)b.o1(parama));
  }
  
  public final boolean M() {
    return this.b.d();
  }
  
  public final void N(a parama1, a parama2, a parama3) {
    HashMap hashMap1 = (HashMap)b.o1(parama2);
    HashMap hashMap2 = (HashMap)b.o1(parama3);
    this.b.l((View)b.o1(parama1), hashMap1, hashMap2);
  }
  
  public final a W() {
    View view = this.b.o();
    return (view == null) ? null : b.a2(view);
  }
  
  public final a a0() {
    View view = this.b.a();
    return (view == null) ? null : b.a2(view);
  }
  
  public final void b0(a parama) {
    this.b.f((View)b.o1(parama));
  }
  
  public final Bundle d() {
    return this.b.b();
  }
  
  public final boolean d0() {
    return this.b.c();
  }
  
  public final a e() {
    return null;
  }
  
  public final String f() {
    return this.b.r();
  }
  
  public final f3 g() {
    return null;
  }
  
  public final nt2 getVideoController() {
    return (this.b.e() != null) ? this.b.e().c() : null;
  }
  
  public final String h() {
    return this.b.q();
  }
  
  public final String j() {
    return this.b.p();
  }
  
  public final List k() {
    List list = this.b.t();
    if (list != null) {
      ArrayList<a3> arrayList = new ArrayList();
      for (a.b b : list)
        arrayList.add(new a3(b.a(), b.d(), b.c(), b.e(), b.b())); 
      return arrayList;
    } 
    return null;
  }
  
  public final void q() {
    this.b.h();
  }
  
  public final String s() {
    return this.b.u();
  }
  
  public final m3 t() {
    a.b b = this.b.s();
    return (b != null) ? new a3(b.a(), b.d(), b.c(), b.e(), b.b()) : null;
  }
  
  public final double w() {
    return this.b.v();
  }
  
  public final void x0(a parama) {
    this.b.k((View)b.o1(parama));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */