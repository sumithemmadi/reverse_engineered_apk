package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class dq implements x6<eo> {
  private static Integer b(Map<String, String> paramMap, String paramString) {
    if (!paramMap.containsKey(paramString))
      return null; 
    try {
      int i = Integer.parseInt(paramMap.get(paramString));
      return Integer.valueOf(i);
    } catch (NumberFormatException numberFormatException) {
      String str = paramMap.get(paramString);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 39 + String.valueOf(str).length());
      stringBuilder.append("Precache invalid numeric parameter '");
      stringBuilder.append(paramString);
      stringBuilder.append("': ");
      stringBuilder.append(str);
      cm.i(stringBuilder.toString());
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */