package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.h0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a6 implements x6<Object> {
  private final z5 a;
  
  public a6(z5 paramz5) {
    this.a = paramz5;
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    if (this.a == null)
      return; 
    String str1 = paramMap.get("name");
    paramObject = str1;
    if (str1 == null) {
      cm.h("Ad metadata with no name parameter.");
      paramObject = "";
    } 
    boolean bool = paramMap.containsKey("info");
    String str2 = null;
    str1 = str2;
    if (bool)
      try {
        JSONObject jSONObject = new JSONObject();
        this(paramMap.get("info"));
        Bundle bundle = h0.n(jSONObject);
      } catch (JSONException jSONException) {
        cm.c("Failed to convert ad metadata to JSON.", (Throwable)jSONException);
        str1 = str2;
      }  
    if (str1 == null) {
      cm.g("Failed to convert ad metadata to Bundle.");
      return;
    } 
    this.a.l0((String)paramObject, (Bundle)str1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */