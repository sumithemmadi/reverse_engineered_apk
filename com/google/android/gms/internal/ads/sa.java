package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import org.json.JSONObject;

public final class sa<I, O> implements ja<I, O> {
  private final la<O> a;
  
  private final ka<I> b;
  
  private final h9 c;
  
  private final String d;
  
  sa(h9 paramh9, String paramString, ka<I> paramka, la<O> paramla) {
    this.c = paramh9;
    this.d = paramString;
    this.b = paramka;
    this.a = paramla;
  }
  
  private final void d(v9 paramv9, ga paramga, I paramI, sm<O> paramsm) {
    try {
      q.c();
      String str = h1.x0();
      f7 f7 = d6.p;
      xa xa = new xa();
      this(this, paramv9, paramsm);
      f7.c(str, xa);
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("id", str);
      jSONObject.put("args", this.b.a(paramI));
      paramga.S(this.d, jSONObject);
      return;
    } catch (Exception null) {
      try {
        paramsm.d(null);
        cm.c("Unable to invokeJavascript", null);
        return;
      } finally {
        paramv9.f();
      } 
    } 
  }
  
  public final ot1<O> a(I paramI) {
    return b(paramI);
  }
  
  public final ot1<O> b(I paramI) {
    sm<O> sm = new sm();
    v9 v9 = this.c.h(null);
    v9.d(new va(this, v9, paramI, sm), new ua(this, sm, v9));
    return sm;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */