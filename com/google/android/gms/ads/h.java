package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzvg;
import com.google.android.gms.internal.ads.zzvw;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {
  private final zzvw a;
  
  private final a b;
  
  private h(zzvw paramzzvw) {
    a a1;
    this.a = paramzzvw;
    zzvg zzvg = paramzzvw.d;
    if (zzvg == null) {
      zzvg = null;
    } else {
      a1 = zzvg.o0();
    } 
    this.b = a1;
  }
  
  public static h a(zzvw paramzzvw) {
    return (paramzzvw != null) ? new h(paramzzvw) : null;
  }
  
  public final JSONObject b() {
    JSONObject jSONObject1 = new JSONObject();
    jSONObject1.put("Adapter", this.a.b);
    jSONObject1.put("Latency", this.a.c);
    JSONObject jSONObject2 = new JSONObject();
    for (String str : this.a.e.keySet())
      jSONObject2.put(str, this.a.e.get(str)); 
    jSONObject1.put("Credentials", jSONObject2);
    a a1 = this.b;
    if (a1 == null) {
      jSONObject1.put("Ad Error", "null");
    } else {
      jSONObject1.put("Ad Error", a1.e());
    } 
    return jSONObject1;
  }
  
  public final String toString() {
    String str;
    try {
      str = b().toString(2);
    } catch (JSONException jSONException) {
      str = "Error forming toString output.";
    } 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */