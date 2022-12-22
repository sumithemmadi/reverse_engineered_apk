package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzvg;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
  private final int a;
  
  private final String b;
  
  private final String c;
  
  private final a d;
  
  public a(int paramInt, String paramString1, String paramString2) {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = null;
  }
  
  public a(int paramInt, String paramString1, String paramString2, a parama) {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = parama;
  }
  
  public int a() {
    return this.a;
  }
  
  public String b() {
    return this.c;
  }
  
  public String c() {
    return this.b;
  }
  
  public final zzvg d() {
    zzvg zzvg;
    if (this.d == null) {
      zzvg = null;
    } else {
      a a1 = this.d;
      zzvg = new zzvg(a1.a, a1.b, a1.c, null, null);
    } 
    return new zzvg(this.a, this.b, this.c, zzvg, null);
  }
  
  public JSONObject e() {
    JSONObject jSONObject = new JSONObject();
    jSONObject.put("Code", this.a);
    jSONObject.put("Message", this.b);
    jSONObject.put("Domain", this.c);
    a a1 = this.d;
    if (a1 == null) {
      jSONObject.put("Cause", "null");
    } else {
      jSONObject.put("Cause", a1.e());
    } 
    return jSONObject;
  }
  
  public String toString() {
    String str;
    try {
      str = e().toString(2);
    } catch (JSONException jSONException) {
      str = "Error forming toString output.";
    } 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */