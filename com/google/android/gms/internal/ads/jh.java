package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

public final class jh implements tg {
  private ja<JSONObject, JSONObject> a;
  
  private ja<JSONObject, JSONObject> b;
  
  public jh(Context paramContext) {
    ra ra = q.p().a(paramContext, zzazn.o0());
    na<JSONObject> na = ma.b;
    this.a = ra.a("google.afma.request.getAdDictionary", na, na);
    this.b = q.p().a(paramContext, zzazn.o0()).a("google.afma.sdkConstants.getSdkConstants", na, na);
  }
  
  public final ja<JSONObject, JSONObject> a() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */