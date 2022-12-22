package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class aq0 {
  private final nt1 a;
  
  private final nt1 b;
  
  private final gr0 c;
  
  private final t82<is0> d;
  
  public aq0(nt1 paramnt11, nt1 paramnt12, gr0 paramgr0, t82<is0> paramt82) {
    this.a = paramnt11;
    this.b = paramnt12;
    this.c = paramgr0;
    this.d = paramt82;
  }
  
  public final ot1<InputStream> b(zzatq paramzzatq) {
    ot1<?> ot1;
    String str = paramzzatq.e;
    q.c();
    if (h1.e0(str)) {
      ot1 = dt1.a(new zzcoc(zzdom.b));
    } else {
      ot1 = dt1.l(this.a.a(new zp0(this, paramzzatq)), ExecutionException.class, cq0.a, this.b);
    } 
    return (ot1)dt1.l(ot1, zzcoc.class, new bq0(this, paramzzatq, Binder.getCallingUid()), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/aq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */