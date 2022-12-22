package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.h0;
import org.json.JSONException;
import org.json.JSONObject;

public final class wf0 extends tf0 {
  private final JSONObject b;
  
  private final boolean c;
  
  private final boolean d;
  
  private final boolean e;
  
  private final boolean f;
  
  public wf0(nh1 paramnh1, JSONObject paramJSONObject) {
    super(paramnh1);
    boolean bool1 = false;
    this.b = h0.d(paramJSONObject, new String[] { "tracking_urls_and_actions", "active_view" });
    this.c = h0.h(false, paramJSONObject, new String[] { "allow_pub_owned_ad_view" });
    this.d = h0.h(false, paramJSONObject, new String[] { "attribution", "allow_pub_rendering" });
    this.e = h0.h(false, paramJSONObject, new String[] { "enable_omid" });
    boolean bool2 = bool1;
    if (paramJSONObject != null) {
      bool2 = bool1;
      if (paramJSONObject.optJSONObject("overlay") != null)
        bool2 = true; 
    } 
    this.f = bool2;
  }
  
  public final boolean a() {
    return this.e;
  }
  
  public final JSONObject b() {
    JSONObject jSONObject = this.b;
    if (jSONObject != null)
      return jSONObject; 
    try {
      return new JSONObject(this.a.y);
    } catch (JSONException jSONException) {
      return null;
    } 
  }
  
  public final boolean c() {
    return this.f;
  }
  
  public final boolean d() {
    return this.c;
  }
  
  public final boolean e() {
    return this.d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */