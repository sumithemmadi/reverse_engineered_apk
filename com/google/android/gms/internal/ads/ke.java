package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class ke {
  private final boolean a;
  
  private final boolean b;
  
  private final boolean c;
  
  private final boolean d;
  
  private final boolean e;
  
  private ke(me paramme) {
    this.a = me.a(paramme);
    this.b = me.g(paramme);
    this.c = me.h(paramme);
    this.d = me.i(paramme);
    this.e = me.j(paramme);
  }
  
  public final JSONObject a() {
    try {
      null = new JSONObject();
      this();
      return null.put("sms", this.a).put("tel", this.b).put("calendar", this.c).put("storePicture", this.d).put("inlineVideo", this.e);
    } catch (JSONException jSONException) {
      cm.c("Error occured while obtaining the MRAID capabilities.", (Throwable)jSONException);
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */