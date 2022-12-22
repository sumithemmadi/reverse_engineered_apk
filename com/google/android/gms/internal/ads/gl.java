package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class gl {
  private final long a;
  
  private final List<String> b = new ArrayList<String>();
  
  private final List<String> c = new ArrayList<String>();
  
  private final Map<String, lb> d = new HashMap<String, lb>();
  
  private String e;
  
  private String f;
  
  private JSONObject g;
  
  private boolean h;
  
  public gl(String paramString, long paramLong) {
    byte b = 0;
    this.h = false;
    this.f = paramString;
    this.a = paramLong;
    if (!TextUtils.isEmpty(paramString))
      try {
        JSONObject jSONObject = new JSONObject();
        this(paramString);
        this.g = jSONObject;
        if (jSONObject.optInt("status", -1) != 1) {
          this.h = false;
          cm.i("App settings could not be fetched successfully.");
          return;
        } 
        this.h = true;
        this.e = this.g.optString("app_id");
        JSONArray jSONArray1 = this.g.optJSONArray("ad_unit_id_settings");
        if (jSONArray1 != null)
          for (byte b1 = 0; b1 < jSONArray1.length(); b1++) {
            JSONObject jSONObject1 = jSONArray1.getJSONObject(b1);
            String str2 = jSONObject1.optString("format");
            String str1 = jSONObject1.optString("ad_unit_id");
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str1))
              if ("interstitial".equalsIgnoreCase(str2)) {
                this.c.add(str1);
              } else if ("rewarded".equalsIgnoreCase(str2) || "rewarded_interstitial".equals(str2)) {
                jSONObject1 = jSONObject1.optJSONObject("mediation_config");
                if (jSONObject1 != null) {
                  lb lb = new lb();
                  this(jSONObject1);
                  this.d.put(str1, lb);
                } 
              }  
          }  
        JSONArray jSONArray2 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
        if (jSONArray2 != null)
          for (byte b1 = b; b1 < jSONArray2.length(); b1++) {
            String str = jSONArray2.optString(b1);
            this.b.add(str);
          }  
        return;
      } catch (JSONException jSONException) {
        cm.d("Exception occurred while processing app setting json", (Throwable)jSONException);
        q.g().e((Throwable)jSONException, "AppSettings.parseAppSettingsJson");
      }  
  }
  
  public final long a() {
    return this.a;
  }
  
  public final boolean b() {
    return this.h;
  }
  
  public final String c() {
    return this.f;
  }
  
  public final String d() {
    return this.e;
  }
  
  public final Map<String, lb> e() {
    return this.d;
  }
  
  public final JSONObject f() {
    return this.g;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */