package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.internal.util.h1;
import java.util.ArrayList;
import java.util.List;

public final class gi1 {
  public final ls2 a;
  
  public final zzaau b;
  
  public final zzajt c;
  
  public final zzvl d;
  
  public final zzvs e;
  
  public final String f;
  
  public final ArrayList<String> g;
  
  public final ArrayList<String> h;
  
  public final zzaeh i;
  
  public final zzvx j;
  
  public final int k;
  
  public final AdManagerAdViewOptions l;
  
  public final PublisherAdViewOptions m;
  
  public final fs2 n;
  
  public final th1 o;
  
  public final boolean p;
  
  private gi1(ii1 paramii1) {
    zzaeh zzaeh1;
    boolean bool1;
    this.e = ii1.a(paramii1);
    this.f = ii1.k(paramii1);
    this.a = ii1.r(paramii1);
    int i = (ii1.J(paramii1)).b;
    long l = (ii1.J(paramii1)).c;
    Bundle bundle = (ii1.J(paramii1)).d;
    int j = (ii1.J(paramii1)).e;
    List<String> list = (ii1.J(paramii1)).f;
    boolean bool = (ii1.J(paramii1)).g;
    int k = (ii1.J(paramii1)).h;
    if ((ii1.J(paramii1)).i || ii1.K(paramii1)) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.d = new zzvl(i, l, bundle, j, list, bool, k, bool1, (ii1.J(paramii1)).j, (ii1.J(paramii1)).k, (ii1.J(paramii1)).l, (ii1.J(paramii1)).m, (ii1.J(paramii1)).n, (ii1.J(paramii1)).o, (ii1.J(paramii1)).p, (ii1.J(paramii1)).q, (ii1.J(paramii1)).r, (ii1.J(paramii1)).s, (ii1.J(paramii1)).t, (ii1.J(paramii1)).u, (ii1.J(paramii1)).v, (ii1.J(paramii1)).w, h1.Z((ii1.J(paramii1)).x));
    if (ii1.L(paramii1) != null) {
      zzaau zzaau1 = ii1.L(paramii1);
    } else if (ii1.M(paramii1) != null) {
      zzaau zzaau1 = (ii1.M(paramii1)).g;
    } else {
      bundle = null;
    } 
    this.b = (zzaau)bundle;
    this.g = ii1.u(paramii1);
    this.h = ii1.v(paramii1);
    if (ii1.u(paramii1) == null) {
      bundle = null;
    } else if (ii1.M(paramii1) == null) {
      zzaeh1 = new zzaeh((new b.a()).a());
    } else {
      zzaeh1 = ii1.M(paramii1);
    } 
    this.i = zzaeh1;
    this.j = ii1.x(paramii1);
    this.k = ii1.y(paramii1);
    this.l = ii1.B(paramii1);
    this.m = ii1.D(paramii1);
    this.n = ii1.E(paramii1);
    this.c = ii1.F(paramii1);
    this.o = new th1(ii1.H(paramii1), null);
    this.p = ii1.I(paramii1);
  }
  
  public final h5 a() {
    PublisherAdViewOptions publisherAdViewOptions = this.m;
    return (publisherAdViewOptions == null && this.l == null) ? null : ((publisherAdViewOptions != null) ? publisherAdViewOptions.p0() : this.l.p0());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */