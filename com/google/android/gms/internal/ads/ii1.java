package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;

public final class ii1 {
  private zzvl a;
  
  private zzvs b;
  
  private ls2 c;
  
  private String d;
  
  private zzaau e;
  
  private boolean f;
  
  private ArrayList<String> g;
  
  private ArrayList<String> h;
  
  private zzaeh i;
  
  private zzvx j;
  
  private AdManagerAdViewOptions k;
  
  private PublisherAdViewOptions l;
  
  private fs2 m;
  
  private int n = 1;
  
  private zzajt o;
  
  private vh1 p = new vh1();
  
  private boolean q = false;
  
  public final ii1 A(String paramString) {
    this.d = paramString;
    return this;
  }
  
  public final ii1 C(zzvl paramzzvl) {
    this.a = paramzzvl;
    return this;
  }
  
  public final zzvs G() {
    return this.b;
  }
  
  public final zzvl b() {
    return this.a;
  }
  
  public final String c() {
    return this.d;
  }
  
  public final vh1 d() {
    return this.p;
  }
  
  public final gi1 e() {
    t.k(this.d, "ad unit must not be null");
    t.k(this.b, "ad size must not be null");
    t.k(this.a, "ad request must not be null");
    return new gi1(this, null);
  }
  
  public final boolean f() {
    return this.q;
  }
  
  public final ii1 g(AdManagerAdViewOptions paramAdManagerAdViewOptions) {
    this.k = paramAdManagerAdViewOptions;
    if (paramAdManagerAdViewOptions != null)
      this.f = paramAdManagerAdViewOptions.o0(); 
    return this;
  }
  
  public final ii1 h(PublisherAdViewOptions paramPublisherAdViewOptions) {
    this.l = paramPublisherAdViewOptions;
    if (paramPublisherAdViewOptions != null) {
      this.f = paramPublisherAdViewOptions.o0();
      this.m = paramPublisherAdViewOptions.q0();
    } 
    return this;
  }
  
  public final ii1 i(zzajt paramzzajt) {
    this.o = paramzzajt;
    this.e = new zzaau(false, true, false);
    return this;
  }
  
  public final ii1 j(zzvx paramzzvx) {
    this.j = paramzzvx;
    return this;
  }
  
  public final ii1 l(boolean paramBoolean) {
    this.q = paramBoolean;
    return this;
  }
  
  public final ii1 m(boolean paramBoolean) {
    this.f = paramBoolean;
    return this;
  }
  
  public final ii1 n(zzaau paramzzaau) {
    this.e = paramzzaau;
    return this;
  }
  
  public final ii1 o(gi1 paramgi1) {
    this.p.b(paramgi1.o);
    this.a = paramgi1.d;
    this.b = paramgi1.e;
    this.c = paramgi1.a;
    this.d = paramgi1.f;
    this.e = paramgi1.b;
    this.g = paramgi1.g;
    this.h = paramgi1.h;
    this.i = paramgi1.i;
    this.j = paramgi1.j;
    ii1 ii11 = g(paramgi1.l).h(paramgi1.m);
    ii11.q = paramgi1.p;
    return ii11;
  }
  
  public final ii1 p(ls2 paramls2) {
    this.c = paramls2;
    return this;
  }
  
  public final ii1 q(ArrayList<String> paramArrayList) {
    this.g = paramArrayList;
    return this;
  }
  
  public final ii1 s(zzaeh paramzzaeh) {
    this.i = paramzzaeh;
    return this;
  }
  
  public final ii1 t(ArrayList<String> paramArrayList) {
    this.h = paramArrayList;
    return this;
  }
  
  public final ii1 w(int paramInt) {
    this.n = paramInt;
    return this;
  }
  
  public final ii1 z(zzvs paramzzvs) {
    this.b = paramzzvs;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ii1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */