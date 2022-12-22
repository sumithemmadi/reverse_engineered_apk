package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class l extends a {
  private final s e;
  
  public l(int paramInt, String paramString1, String paramString2, a parama, s params) {
    super(paramInt, paramString1, paramString2, parama);
    this.e = params;
  }
  
  public final JSONObject e() {
    JSONObject jSONObject = super.e();
    s s1 = f();
    if (s1 == null) {
      jSONObject.put("Response Info", "null");
    } else {
      jSONObject.put("Response Info", s1.d());
    } 
    return jSONObject;
  }
  
  public final s f() {
    x x = m0.S5;
    return ((Boolean)er2.e().c(x)).booleanValue() ? this.e : null;
  }
  
  public final String toString() {
    String str;
    try {
      str = super.e().toString(2);
    } catch (JSONException jSONException) {
      str = "Error forming toString output.";
    } 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */