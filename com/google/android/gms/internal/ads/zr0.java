package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public final class zr0 {
  private final nt1 a;
  
  private final pr0 b;
  
  private final t82<is0> c;
  
  public zr0(nt1 paramnt1, pr0 parampr0, t82<is0> paramt82) {
    this.a = paramnt1;
    this.b = parampr0;
    this.c = paramt82;
  }
  
  private final <RetT> ot1<RetT> a(zzatq paramzzatq, js0<InputStream> paramjs01, js0<InputStream> paramjs02, qs1<InputStream, RetT> paramqs1) {
    ot1<?> ot1;
    String str = paramzzatq.e;
    q.c();
    if (h1.e0(str)) {
      ot1 = dt1.a(new zzcoc(zzdom.b));
    } else {
      ot1 = dt1.l(ot1.a(paramzzatq), ExecutionException.class, bs0.a, this.a);
    } 
    return ys1.H(ot1).<RetT>G(paramqs1, this.a).F(zzcoc.class, new as0(this, paramjs02, paramzzatq, paramqs1), this.a);
  }
  
  public final ot1<zzatq> c(zzatq paramzzatq) {
    ds0 ds0 = new ds0(paramzzatq);
    pr0 pr01 = this.b;
    pr01.getClass();
    return a(paramzzatq, cs0.b(pr01), new fs0(this), ds0);
  }
  
  public final ot1<Void> d(zzatq paramzzatq) {
    if (ea2.f(paramzzatq.k))
      return dt1.a(new zzcmb(zzdom.c, "Pool key missing from removeUrl call.")); 
    qs1<InputStream, Void> qs1 = es0.a;
    return a(paramzzatq, new hs0(this), new gs0(this), qs1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */