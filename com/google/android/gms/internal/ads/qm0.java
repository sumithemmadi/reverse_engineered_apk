package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class qm0 {
  public static String a(JSONObject paramJSONObject, String paramString1, String paramString2) {
    x<Boolean> x = m0.s1;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return ""; 
    if (paramJSONObject == null)
      return ""; 
    JSONArray jSONArray = paramJSONObject.optJSONArray(paramString2);
    if (jSONArray == null)
      return ""; 
    for (byte b = 0; b < jSONArray.length(); b++) {
      JSONObject jSONObject = jSONArray.optJSONObject(b);
      if (jSONObject != null) {
        JSONArray jSONArray1 = jSONObject.optJSONArray("including");
        JSONArray jSONArray2 = jSONObject.optJSONArray("excluding");
        if (b(jSONArray1, paramString1) && !b(jSONArray2, paramString1))
          return jSONObject.optString("effective_ad_unit_id", ""); 
      } 
    } 
    return "";
  }
  
  private static boolean b(JSONArray paramJSONArray, String paramString) {
    if (paramJSONArray != null && paramString != null)
      for (byte b = 0; b < paramJSONArray.length(); b++) {
        String str = paramJSONArray.optString(b);
        try {
          boolean bool = Pattern.compile(str).matcher(paramString).lookingAt();
          if (bool)
            return true; 
        } catch (PatternSyntaxException patternSyntaxException) {
          q.g().e(patternSyntaxException, "RtbAdapterMap.hasAtleastOneRegexMatch");
        } 
      }  
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */