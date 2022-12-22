package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class xa implements h7 {
  private final v9 a;
  
  private final sm<O> b;
  
  public xa(sa paramsa, v9 paramv9, sm<O> paramsm) {
    this.a = paramv9;
    this.b = paramsm;
  }
  
  public final void Q(String paramString) {
    if (paramString == null)
      try {
        sm<O> sm2 = this.b;
        zzaly zzaly1 = new zzaly();
        this();
        sm2.d(zzaly1);
        return;
      } catch (IllegalStateException illegalStateException) {
        return;
      } finally {
        this.a.f();
      }  
    sm<O> sm1 = this.b;
    zzaly zzaly = new zzaly();
    this(paramString);
    sm1.d(zzaly);
    this.a.f();
  }
  
  public final void a(JSONObject paramJSONObject) {
    try {
      this.b.c(sa.c(this.c).b(paramJSONObject));
      return;
    } catch (IllegalStateException illegalStateException) {
      return;
    } catch (JSONException jSONException) {
      this.b.d((Throwable)jSONException);
      return;
    } finally {
      this.a.f();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */