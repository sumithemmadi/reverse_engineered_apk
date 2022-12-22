package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class vg {
  private final List<String> a;
  
  private final String b;
  
  private final String c;
  
  private final String d;
  
  private final boolean e;
  
  private final boolean f;
  
  private final String g;
  
  private final String h;
  
  private String i;
  
  private final int j;
  
  private final boolean k;
  
  private final JSONObject l;
  
  private final String m;
  
  private final boolean n;
  
  private final String o;
  
  public vg(JSONObject paramJSONObject) {
    List<String> list;
    this.i = paramJSONObject.optString("url");
    this.b = paramJSONObject.optString("base_uri");
    this.c = paramJSONObject.optString("post_parameters");
    this.e = c(paramJSONObject.optString("drt_include"));
    this.f = c(paramJSONObject.optString("cookies_include", "true"));
    this.g = paramJSONObject.optString("request_id");
    this.d = paramJSONObject.optString("type");
    String str = paramJSONObject.optString("errors");
    if (str == null) {
      str = null;
    } else {
      list = Arrays.asList(str.split(","));
    } 
    this.a = list;
    int i = paramJSONObject.optInt("valid", 0);
    byte b = 1;
    if (i == 1)
      b = -2; 
    this.j = b;
    this.h = paramJSONObject.optString("fetched_ad");
    this.k = paramJSONObject.optBoolean("render_test_ad_label");
    JSONObject jSONObject = paramJSONObject.optJSONObject("preprocessor_flags");
    if (jSONObject == null)
      jSONObject = new JSONObject(); 
    this.l = jSONObject;
    this.m = paramJSONObject.optString("analytics_query_ad_event_id");
    this.n = paramJSONObject.optBoolean("is_analytics_logging_enabled");
    this.o = paramJSONObject.optString("pool_key");
  }
  
  private static boolean c(String paramString) {
    return (paramString != null && (paramString.equals("1") || paramString.equals("true")));
  }
  
  public final int a() {
    return this.j;
  }
  
  public final String b() {
    return this.i;
  }
  
  public final List<String> d() {
    return this.a;
  }
  
  public final String e() {
    return this.b;
  }
  
  public final String f() {
    return this.c;
  }
  
  public final boolean g() {
    return this.e;
  }
  
  public final boolean h() {
    return this.f;
  }
  
  public final JSONObject i() {
    return this.l;
  }
  
  public final String j() {
    return this.o;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */