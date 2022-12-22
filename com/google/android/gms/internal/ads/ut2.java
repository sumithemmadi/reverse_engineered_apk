package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.r;
import com.google.android.gms.ads.search.a;
import com.google.android.gms.ads.x.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ut2 {
  private final Date a;
  
  private final String b;
  
  private final List<String> c;
  
  private final int d;
  
  private final Set<String> e;
  
  private final Location f;
  
  private final boolean g;
  
  private final Bundle h;
  
  private final Map<Class<?>, ?> i;
  
  private final String j;
  
  private final String k;
  
  private final a l;
  
  private final int m;
  
  private final Set<String> n;
  
  private final Bundle o;
  
  private final Set<String> p;
  
  private final boolean q;
  
  private final a r;
  
  private final int s;
  
  private final String t;
  
  private final int u;
  
  public ut2(tt2 paramtt2) {
    this(paramtt2, null);
  }
  
  public ut2(tt2 paramtt2, a parama) {
    this.a = tt2.a(paramtt2);
    this.b = tt2.f(paramtt2);
    this.c = tt2.g(paramtt2);
    this.d = tt2.l(paramtt2);
    this.e = Collections.unmodifiableSet(tt2.m(paramtt2));
    this.f = tt2.n(paramtt2);
    this.g = tt2.o(paramtt2);
    this.h = tt2.p(paramtt2);
    this.i = Collections.unmodifiableMap(tt2.q(paramtt2));
    this.j = tt2.r(paramtt2);
    this.k = tt2.s(paramtt2);
    this.m = tt2.t(paramtt2);
    this.n = Collections.unmodifiableSet(tt2.u(paramtt2));
    this.o = tt2.v(paramtt2);
    this.p = Collections.unmodifiableSet(tt2.w(paramtt2));
    this.q = tt2.x(paramtt2);
    tt2.y(paramtt2);
    this.s = tt2.z(paramtt2);
    this.t = tt2.A(paramtt2);
    this.u = tt2.B(paramtt2);
  }
  
  @Deprecated
  public final Date a() {
    return this.a;
  }
  
  public final String b() {
    return this.b;
  }
  
  public final Bundle c() {
    return this.o;
  }
  
  @Deprecated
  public final int d() {
    return this.d;
  }
  
  public final Set<String> e() {
    return this.e;
  }
  
  public final Location f() {
    return this.f;
  }
  
  public final boolean g() {
    return this.g;
  }
  
  public final String h() {
    return this.t;
  }
  
  public final Bundle i(Class<?> paramClass) {
    return this.h.getBundle(paramClass.getName());
  }
  
  public final String j() {
    return this.j;
  }
  
  @Deprecated
  public final boolean k() {
    return this.q;
  }
  
  public final boolean l(Context paramContext) {
    r r = xt2.n().b();
    er2.a();
    String str = sl.j(paramContext);
    return (this.n.contains(str) || r.d().contains(str));
  }
  
  public final List<String> m() {
    return new ArrayList<String>(this.c);
  }
  
  public final String n() {
    return this.k;
  }
  
  public final a o() {
    return this.l;
  }
  
  public final Map<Class<?>, ?> p() {
    return this.i;
  }
  
  public final Bundle q() {
    return this.h;
  }
  
  public final int r() {
    return this.m;
  }
  
  public final Set<String> s() {
    return this.p;
  }
  
  public final a t() {
    return this.r;
  }
  
  public final int u() {
    return this.s;
  }
  
  public final int v() {
    return this.u;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ut2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */