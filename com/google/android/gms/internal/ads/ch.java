package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import org.json.JSONException;
import org.json.JSONObject;

public final class ch extends eh {
  private final Object a = new Object();
  
  private final Context b;
  
  private SharedPreferences c;
  
  private final ja<JSONObject, JSONObject> d;
  
  public ch(Context paramContext, ja<JSONObject, JSONObject> paramja) {
    this.b = paramContext.getApplicationContext();
    this.d = paramja;
  }
  
  public static JSONObject c(Context paramContext) {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("js", (zzazn.o0()).b);
      jSONObject.put("mf", f2.a.a());
      jSONObject.put("cl", "350251165");
      jSONObject.put("rapid_rc", "dev");
      jSONObject.put("rapid_rollup", "HEAD");
      jSONObject.put("admob_module_version", 12451000);
      jSONObject.put("dynamite_local_version", 204204100);
      jSONObject.put("dynamite_version", DynamiteModule.c(paramContext, "com.google.android.gms.ads.dynamite"));
      jSONObject.put("container_version", 12451000);
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final ot1<Void> a() {
    synchronized (this.a) {
      if (this.c != null) {
      
      } else {
        this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
      } 
      long l = this.c.getLong("js_last_update", 0L);
      if (q.j().a() - l < ((Long)f2.b.a()).longValue())
        return dt1.h(null); 
      null = c(this.b);
      return dt1.j(this.d.b(null), new fh(this), fm.f);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */