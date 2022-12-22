package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class fb implements h7 {
  private final sm<O> a;
  
  public fb(db paramdb, sm<O> paramsm) {
    this.a = paramsm;
  }
  
  public final void Q(String paramString) {
    if (paramString == null) {
      try {
        sm<O> sm1 = this.a;
        zzaly zzaly = new zzaly();
        this();
        sm1.d(zzaly);
        return;
      } catch (IllegalStateException illegalStateException) {}
    } else {
      sm<O> sm1 = this.a;
      zzaly zzaly = new zzaly();
      this((String)illegalStateException);
      sm1.d(zzaly);
    } 
  }
  
  public final void a(JSONObject paramJSONObject) {
    try {
      this.a.c(db.c(this.b).b(paramJSONObject));
      return;
    } catch (IllegalStateException illegalStateException) {
    
    } catch (JSONException jSONException) {
      this.a.d((Throwable)jSONException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */