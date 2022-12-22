package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class bo {
  public final boolean a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  private final String e;
  
  public final int f;
  
  public final int g;
  
  public final int h;
  
  public final int i;
  
  public final boolean j;
  
  public final int k;
  
  public bo(String paramString) {
    JSONObject jSONObject1 = null;
    JSONObject jSONObject2 = jSONObject1;
    if (paramString != null)
      try {
        jSONObject2 = new JSONObject();
        this(paramString);
      } catch (JSONException jSONException) {
        jSONObject2 = jSONObject1;
      }  
    this.a = a(jSONObject2, "aggressive_media_codec_release", m0.B);
    this.b = c(jSONObject2, "byte_buffer_precache_limit", m0.j);
    this.c = c(jSONObject2, "exo_cache_buffer_size", m0.q);
    this.d = c(jSONObject2, "exo_connect_timeout_millis", m0.f);
    this.e = d(jSONObject2, "exo_player_version", m0.e);
    this.f = c(jSONObject2, "exo_read_timeout_millis", m0.g);
    this.g = c(jSONObject2, "load_check_interval_bytes", m0.h);
    this.h = c(jSONObject2, "player_precache_limit", m0.i);
    this.i = c(jSONObject2, "socket_receive_buffer_size", m0.k);
    this.j = a(jSONObject2, "use_cache_data_source", m0.X2);
    this.k = c(jSONObject2, "min_retry_count", m0.m);
  }
  
  private static boolean a(JSONObject paramJSONObject, String paramString, x<Boolean> paramx) {
    return b(paramJSONObject, paramString, ((Boolean)er2.e().<Boolean>c(paramx)).booleanValue());
  }
  
  private static boolean b(JSONObject paramJSONObject, String paramString, boolean paramBoolean) {
    if (paramJSONObject != null)
      try {
        return paramJSONObject.getBoolean(paramString);
      } catch (JSONException jSONException) {} 
    return paramBoolean;
  }
  
  private static int c(JSONObject paramJSONObject, String paramString, x<Integer> paramx) {
    if (paramJSONObject != null)
      try {
        return paramJSONObject.getInt(paramString);
      } catch (JSONException jSONException) {} 
    return ((Integer)er2.e().<Integer>c(paramx)).intValue();
  }
  
  private static String d(JSONObject paramJSONObject, String paramString, x<String> paramx) {
    if (paramJSONObject != null)
      try {
        return paramJSONObject.getString(paramString);
      } catch (JSONException jSONException) {} 
    return er2.e().<String>c(paramx);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */