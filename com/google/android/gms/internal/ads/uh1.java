package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.h0;
import com.google.android.gms.ads.internal.util.m0;
import org.json.JSONObject;

public final class uh1 implements m0 {
  public final String a;
  
  public final String b;
  
  public final JSONObject c;
  
  private final JSONObject d;
  
  uh1(JsonReader paramJsonReader) {
    JSONObject jSONObject = h0.l(paramJsonReader);
    this.d = jSONObject;
    this.a = jSONObject.optString("ad_html", null);
    this.b = jSONObject.optString("ad_base_url", null);
    this.c = jSONObject.optJSONObject("ad_json");
  }
  
  public final void a(JsonWriter paramJsonWriter) {
    h0.g(paramJsonWriter, this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */