package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

final class wt extends la1 {
  private final vb1 a;
  
  private m92<Integer> b;
  
  private m92<ga1> c;
  
  private m92<String> d;
  
  private m92<ra1> e;
  
  private m92<va1> f;
  
  private m92<bb1> g;
  
  private m92<kb1> h;
  
  private m92<qb1> i;
  
  private m92<cc1> j;
  
  private m92<String> k;
  
  private m92<un0> l;
  
  private m92<un0> m;
  
  private m92<un0> n;
  
  private m92<un0> o;
  
  private m92<Map<zzdrk, un0>> p;
  
  private m92<Set<gb0<fm1>>> q;
  
  private m92<Set<gb0<fm1>>> r;
  
  private m92 s;
  
  private m92<am1> t;
  
  private wt(pt parampt, vb1 paramvb1) {
    this.a = paramvb1;
    this.b = new xb1(paramvb1);
    this.c = new ma1(uv.a(), pt.X(parampt), pt.B(parampt), zk1.a(), this.b);
    this.d = new ub1(paramvb1);
    this.e = new ta1(gt.a(), pt.X(parampt), this.d, zk1.a());
    this.f = new za1(uv.a(), this.b, pt.X(parampt), pt.V(parampt), pt.B(parampt), zk1.a());
    this.g = new db1(nv.a(), zk1.a(), pt.X(parampt));
    this.h = new nb1(pv.a(), zk1.a(), this.d);
    this.i = new sb1(rv.a(), pt.B(parampt), pt.X(parampt));
    this.j = new ec1(zk1.a());
    this.k = new wb1(paramvb1);
    this.l = b92.a(nn0.a());
    this.m = b92.a(ln0.a());
    this.n = b92.a(pn0.a());
    this.o = b92.a(rn0.a());
    this.p = ((e92<zzdrk, un0>)((e92)((e92)((e92)c92.b(4).a(zzdrk.f, this.l)).a(zzdrk.h, this.m)).a(zzdrk.i, this.n)).a(zzdrk.j, this.o)).b();
    this.q = b92.a(new tn0(this.k, pt.X(parampt), zk1.a(), this.p));
    i92<Set<gb0<fm1>>> i92 = i92.<gb0<fm1>>a(0, 1).b((m92)this.q).c();
    this.r = (m92<Set<gb0<fm1>>>)i92;
    this.s = hm1.a((m92<Set<gb0<fm1>>>)i92);
    this.t = b92.a(im1.a(zk1.a(), pt.B(parampt), this.s));
  }
  
  private final pb1 d() {
    return new pb1(g92.<u>b(new u(), "Cannot return null from a non-@Nullable @Provides method"), zk1.b(), g92.<List<String>>b(this.a.d(), "Cannot return null from a non-@Nullable @Provides method"));
  }
  
  private final na1 e() {
    return new na1(vv.a(), zk1.b(), g92.<String>b(this.a.b(), "Cannot return null from a non-@Nullable @Provides method"), this.a.c(), this.a.f());
  }
  
  public final v91<JSONObject> a() {
    nt1 nt1 = zk1.b();
    s91<? extends t91<JSONObject>> s91 = g92.<s91>b(new g81<t91<?>>(new kb1(qv.a(), zk1.b(), ub1.a(this.a)), 0L, pt.B(this.u).get()), "Cannot return null from a non-@Nullable @Provides method");
    qb1 qb1 = new qb1(tv.a(), pt.B(this.u).get(), us.a(pt.U(this.u)));
    ScheduledExecutorService scheduledExecutorService = pt.B(this.u).get();
    x<Long> x = m0.O2;
    return w91.a(nt1, zzdxg.zza(s91, g92.<s91<? extends t91<JSONObject>>>b(new g81<t91<JSONObject>>(qb1, ((Long)er2.e().<Long>c(x)).longValue(), scheduledExecutorService), "Cannot return null from a non-@Nullable @Provides method"), g92.<s91<? extends t91<JSONObject>>>b(new g81<t91<JSONObject>>(new ga1(vv.a(), us.a(pt.U(this.u)), pt.B(this.u).get(), zk1.b(), this.a.f()), 0L, pt.B(this.u).get()), "Cannot return null from a non-@Nullable @Provides method"), g92.<s91<? extends t91<JSONObject>>>b(new g81<t91<JSONObject>>(new cc1(zk1.b()), 0L, pt.B(this.u).get()), "Cannot return null from a non-@Nullable @Provides method"), g92.<s91<? extends t91<JSONObject>>>b(zb1.a(), "Cannot return null from a non-@Nullable @Provides method"), new ra1(null, us.a(pt.U(this.u)), ub1.a(this.a), zk1.b()), (s91<? extends t91<JSONObject>>[])new s91[] { new bb1(ov.a(), zk1.b(), us.a(pt.U(this.u))), d(), e(), new va1(vv.a(), this.a.f(), us.a(pt.U(this.u)), pt.V(this.u).get(), pt.B(this.u).get(), zk1.b()), pt.W(this.u).get() }));
  }
  
  public final v91<JSONObject> b() {
    return ac1.a(qv.a(), pt.W(this.u).get(), e(), d(), b92.b(this.c), b92.b(this.e), b92.b(this.f), b92.b(this.g), b92.b(this.h), b92.b(this.i), b92.b(this.j), zk1.b(), pt.B(this.u).get());
  }
  
  public final am1 c() {
    return this.t.get();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */