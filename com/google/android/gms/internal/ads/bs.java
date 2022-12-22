package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class bs {
  private static final Pattern a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
  
  private static final Pattern b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
  
  public static String a() {
    x<String> x = m0.J;
    String str = er2.e().<String>c(x);
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("version", str);
      jSONObject.put("sdk", "Google Mobile Ads");
      jSONObject.put("sdkVersion", "12.4.51-000");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("<script>");
      stringBuilder.append("Object.defineProperty(window,'MRAID_ENV',{get:function(){return ");
      stringBuilder.append(jSONObject.toString());
      stringBuilder.append("}});");
      stringBuilder.append("</script>");
      return stringBuilder.toString();
    } catch (JSONException jSONException) {
      cm.d("Unable to build MRAID_ENV", (Throwable)jSONException);
      return null;
    } 
  }
  
  public static String b(String paramString, String... paramVarArgs) {
    if (paramVarArgs.length == 0)
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    Matcher matcher = a.matcher(paramString);
    boolean bool = matcher.find();
    int i = 0;
    int j = 0;
    if (bool) {
      int k = matcher.end();
      stringBuilder.append(paramString.substring(0, k));
      i = paramVarArgs.length;
      while (j < i) {
        String str = paramVarArgs[j];
        if (str != null)
          stringBuilder.append(str); 
        j++;
      } 
      stringBuilder.append(paramString.substring(k));
    } else {
      if (!b.matcher(paramString).find()) {
        int k = paramVarArgs.length;
        for (j = i; j < k; j++) {
          String str = paramVarArgs[j];
          if (str != null)
            stringBuilder.append(str); 
        } 
      } 
      stringBuilder.append(paramString);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */