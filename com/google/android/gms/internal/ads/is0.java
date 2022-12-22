package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class is0 extends ig {
  private final Context b;
  
  private final Executor c;
  
  private final hh d;
  
  private final eh e;
  
  private final wv f;
  
  private final HashMap<String, ys0> g;
  
  public is0(Context paramContext, Executor paramExecutor, hh paramhh, wv paramwv, eh parameh, HashMap<String, ys0> paramHashMap) {
    m0.a(paramContext);
    this.b = paramContext;
    this.c = paramExecutor;
    this.d = paramhh;
    this.e = parameh;
    this.f = paramwv;
    this.g = paramHashMap;
  }
  
  private static ot1<JSONObject> S9(zzatq paramzzatq, am1 paramam1, la1 paramla1) {
    ms0 ms0 = new ms0(paramla1);
    kl1 kl1 = ps0.a;
    return paramam1.b(zzdrk.f, dt1.h(paramzzatq.b)).b(ms0).g(kl1).f();
  }
  
  private static ot1<vg> T9(ot1<JSONObject> paramot1, am1 paramam1, ra paramra) {
    ja<JSONObject, ?> ja = paramra.a("AFMA_getAdDictionary", ma.b, os0.a);
    return paramam1.<JSONObject>b(zzdrk.h, paramot1).b(ja).f();
  }
  
  private final void V9(ot1<InputStream> paramot1, mg parammg) {
    dt1.g(dt1.k(paramot1, new ss0(this), fm.a), new us0(this, parammg), fm.f);
  }
  
  public final void D4(String paramString, mg parammg) {
    V9(aa(paramString), parammg);
  }
  
  public final void E4(zzatb paramzzatb, kg paramkg) {}
  
  public final zzatd R3(zzatb paramzzatb) {
    return null;
  }
  
  public final void V4(zzatq paramzzatq, mg parammg) {
    V9(Z9(paramzzatq, Binder.getCallingUid()), parammg);
  }
  
  public final ot1<InputStream> X9(zzatq paramzzatq, int paramInt) {
    ys0 ys02;
    ra ra = q.p().a(this.b, zzazn.o0());
    la1 la1 = this.f.a(paramzzatq, paramInt);
    ja<ws0, InputStream> ja = ra.a("google.afma.response.normalize", ws0.a, ma.c);
    ct0 ct0 = new ct0(this.b, paramzzatq.c.b, this.d, paramzzatq.h, paramInt);
    am1 am1 = la1.c();
    boolean bool = ((Boolean)j2.a.a()).booleanValue();
    ys0 ys01 = null;
    if (!bool) {
      String str = paramzzatq.k;
      ys02 = ys01;
      if (str != null) {
        ys02 = ys01;
        if (!str.isEmpty()) {
          b1.m("Request contained a PoolKey but split request is disabled.");
          ys02 = ys01;
        } 
      } 
    } else {
      String str = paramzzatq.k;
      ys02 = ys01;
      if (str != null) {
        ys02 = ys01;
        if (!str.isEmpty()) {
          ys01 = this.g.remove(paramzzatq.k);
          ys02 = ys01;
          if (ys01 == null) {
            b1.m("Request contained a PoolKey but no matching parameters were found.");
            ys02 = ys01;
          } 
        } 
      } 
    } 
    if (ys02 == null) {
      ot1<JSONObject> ot11 = S9(paramzzatq, am1, la1);
      ot1 = T9(ot11, am1, ra);
      ml1 ml11 = am1.a(zzdrk.i, (ot1<?>[])new ot1[] { ot1, ot11 }).a(new ls0(ot11, ot1)).g(ct0).f();
      return am1.a(zzdrk.j, (ot1<?>[])new ot1[] { ot11, ot1, ml11 }).<ws0>a(new ks0(ml11, ot11, ot1)).<InputStream>b(ja).f();
    } 
    bt0 bt0 = new bt0(((ys0)ot1).b, ((ys0)ot1).a);
    ml1 ml1 = am1.b(zzdrk.i, dt1.h(bt0)).g(ct0).f();
    ot1<vg> ot1 = (ot1)dt1.h(ot1);
    return am1.a(zzdrk.j, (ot1<?>[])new ot1[] { ml1, ot1 }).<ws0>a(new ns0(ml1, ot1)).<InputStream>b(ja).f();
  }
  
  public final ot1<InputStream> Y9(zzatq paramzzatq, int paramInt) {
    if (!((Boolean)j2.a.a()).booleanValue())
      return dt1.a(new Exception("Split request is disabled.")); 
    zzdpf zzdpf = paramzzatq.j;
    if (zzdpf == null)
      return dt1.a(new Exception("Pool configuration missing from request.")); 
    if (zzdpf.h == 0 || zzdpf.i == 0)
      return dt1.a(new Exception("Caching is disabled.")); 
    ra ra = q.p().a(this.b, zzazn.o0());
    la1 la1 = this.f.a(paramzzatq, paramInt);
    am1 am1 = la1.c();
    ot1<JSONObject> ot1 = S9(paramzzatq, am1, la1);
    ot1<vg> ot11 = T9(ot1, am1, ra);
    return am1.a(zzdrk.x, (ot1<?>[])new ot1[] { ot1, ot11 }).<InputStream>a(new qs0(this, ot11, ot1)).f();
  }
  
  public final ot1<InputStream> Z9(zzatq paramzzatq, int paramInt) {
    ra ra = q.p().a(this.b, zzazn.o0());
    if (!((Boolean)p2.a.a()).booleanValue())
      return dt1.a(new Exception("Signal collection disabled.")); 
    la1 la1 = this.f.a(paramzzatq, paramInt);
    v91<JSONObject> v91 = la1.b();
    ja<JSONObject, InputStream> ja = ra.a("google.afma.request.getSignals", ma.b, ma.c);
    return la1.c().b(zzdrk.k, dt1.h(paramzzatq.b)).b(new ts0(v91)).j(zzdrk.l).<InputStream>b(ja).f();
  }
  
  public final ot1<InputStream> aa(String paramString) {
    if (!((Boolean)j2.a.a()).booleanValue())
      return dt1.a(new Exception("Split request is disabled.")); 
    vs0 vs0 = new vs0(this);
    if ((ys0)this.g.remove(paramString) == null) {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "URL to be removed not found for cache key: ".concat(paramString);
      } else {
        paramString = new String("URL to be removed not found for cache key: ");
      } 
      return dt1.a(new Exception(paramString));
    } 
    return dt1.h(vs0);
  }
  
  public final void m6(zzatq paramzzatq, mg parammg) {
    V9(Y9(paramzzatq, Binder.getCallingUid()), parammg);
  }
  
  public final void o4(zzatq paramzzatq, mg parammg) {
    ot1<InputStream> ot1 = X9(paramzzatq, Binder.getCallingUid());
    V9(ot1, parammg);
    ot1.a(new rs0(this), this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/is0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */