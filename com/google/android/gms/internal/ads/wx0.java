package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class wx0 implements xx0<ff0> {
  private final ce0 a;
  
  private final nt1 b;
  
  private final ai0 c;
  
  private final wi1<dk0> d;
  
  public wx0(ce0 paramce0, nt1 paramnt1, ai0 paramai0, wi1<dk0> paramwi1) {
    this.a = paramce0;
    this.b = paramnt1;
    this.c = paramai0;
    this.d = paramwi1;
  }
  
  private final ot1<ff0> g(ci1 paramci1, nh1 paramnh1, JSONObject paramJSONObject) {
    ot1<dk0> ot1 = this.d.b();
    ot1<pf0> ot11 = this.c.a(paramci1, paramnh1, paramJSONObject);
    return dt1.i((ot1<?>[])new ot1[] { ot1, ot11 }).a(new ey0(this, ot11, ot1, paramci1, paramnh1, paramJSONObject), this.b);
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    uh1 uh1 = paramnh1.r;
    return (uh1 != null && uh1.c != null);
  }
  
  public final ot1<List<ot1<ff0>>> b(ci1 paramci1, nh1 paramnh1) {
    return dt1.k(dt1.k(this.d.b(), new ay0(this, paramnh1), this.b), new yx0(this, paramci1, paramnh1), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */