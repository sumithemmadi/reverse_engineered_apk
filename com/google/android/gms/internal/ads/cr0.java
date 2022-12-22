package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class cr0 {
  private final Context a;
  
  private final zzazn b;
  
  private final gi1 c;
  
  private final Executor d;
  
  public cr0(Context paramContext, zzazn paramzzazn, gi1 paramgi1, Executor paramExecutor) {
    this.a = paramContext;
    this.b = paramzzazn;
    this.c = paramgi1;
    this.d = paramExecutor;
  }
  
  public final ot1<ci1> a() {
    ra ra = q.p().b(this.a, this.b);
    na<JSONObject> na = ma.b;
    ja<JSONObject, JSONObject> ja = ra.a("google.afma.response.normalize", na, na);
    zzve zzve = this.c.d.t;
    return dt1.k(dt1.k(dt1.k(dt1.h(""), new fr0(this, zzve), this.d), new er0(ja), this.d), new hr0(this), this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */