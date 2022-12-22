package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.x0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class rp implements x6<eo> {
  private boolean a;
  
  private static int b(Context paramContext, Map<String, String> paramMap, String paramString, int paramInt) {
    String str = paramMap.get(paramString);
    int i = paramInt;
    if (str != null)
      try {
        er2.a();
        i = sl.r(paramContext, Integer.parseInt(str));
      } catch (NumberFormatException numberFormatException) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 34 + str.length());
        stringBuilder.append("Could not parse ");
        stringBuilder.append(paramString);
        stringBuilder.append(" in a video GMSG: ");
        stringBuilder.append(str);
        cm.i(stringBuilder.toString());
        i = paramInt;
      }  
    return i;
  }
  
  private static Integer c(Map<String, String> paramMap, String paramString) {
    if (!paramMap.containsKey(paramString))
      return null; 
    try {
      int i = Integer.parseInt(paramMap.get(paramString));
      return Integer.valueOf(i);
    } catch (NumberFormatException numberFormatException) {
      String str = paramMap.get(paramString);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 41 + String.valueOf(str).length());
      stringBuilder.append("Video gmsg invalid numeric parameter '");
      stringBuilder.append(paramString);
      stringBuilder.append("': ");
      stringBuilder.append(str);
      cm.i(stringBuilder.toString());
      return null;
    } 
  }
  
  private static void d(zzbax paramzzbax, Map<String, String> paramMap) {
    String str2 = paramMap.get("minBufferMs");
    String str3 = paramMap.get("maxBufferMs");
    String str4 = paramMap.get("bufferForPlaybackMs");
    String str5 = paramMap.get("bufferForPlaybackAfterRebufferMs");
    String str1 = paramMap.get("socketReceiveBufferSize");
    if (str2 != null) {
      try {
        paramzzbax.C(Integer.parseInt(str2));
        if (str3 != null)
          paramzzbax.D(Integer.parseInt(str3)); 
        if (str4 != null)
          paramzzbax.E(Integer.parseInt(str4)); 
        if (str5 != null)
          paramzzbax.F(Integer.parseInt(str5)); 
        if (str1 != null)
          paramzzbax.G(Integer.parseInt(str1)); 
      } catch (NumberFormatException numberFormatException) {
        cm.i(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[] { str2, str3 }));
      } 
      return;
    } 
    if (str3 != null)
      numberFormatException.D(Integer.parseInt(str3)); 
    if (str4 != null)
      numberFormatException.E(Integer.parseInt(str4)); 
    if (str5 != null)
      numberFormatException.F(Integer.parseInt(str5)); 
    if (str1 != null)
      numberFormatException.G(Integer.parseInt(str1)); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */