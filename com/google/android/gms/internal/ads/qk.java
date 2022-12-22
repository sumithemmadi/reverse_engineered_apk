package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;

public final class qk {
  private static Uri a(String paramString1, String paramString2, String paramString3) {
    int i = paramString1.indexOf("&adurl");
    int j = i;
    if (i == -1)
      j = paramString1.indexOf("?adurl"); 
    if (j != -1) {
      StringBuilder stringBuilder = new StringBuilder(paramString1.substring(0, ++j));
      stringBuilder.append(paramString2);
      stringBuilder.append("=");
      stringBuilder.append(paramString3);
      stringBuilder.append("&");
      stringBuilder.append(paramString1.substring(j));
      return Uri.parse(stringBuilder.toString());
    } 
    return Uri.parse(paramString1).buildUpon().appendQueryParameter(paramString2, paramString3).build();
  }
  
  public static String b(Uri paramUri, Context paramContext) {
    String str1;
    if (!q.A().H(paramContext))
      return paramUri.toString(); 
    String str2 = q.A().o(paramContext);
    if (str2 == null)
      return paramUri.toString(); 
    x<Boolean> x = m0.X;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      x<String> x1 = m0.Y;
      String str4 = er2.e().<String>c(x1);
      String str3 = paramUri.toString();
      if (str3.contains(str4)) {
        q.A().v(paramContext, str2);
        return c(str3, paramContext).replace(str4, str2);
      } 
    } else if (TextUtils.isEmpty(paramUri.getQueryParameter("fbs_aeid"))) {
      str1 = a(c(paramUri.toString(), paramContext), "fbs_aeid", str2).toString();
      q.A().v(paramContext, str2);
      return str1;
    } 
    return str1.toString();
  }
  
  private static String c(String paramString, Context paramContext) {
    String str2 = q.A().m(paramContext);
    String str3 = q.A().n(paramContext);
    String str1 = paramString;
    if (!paramString.contains("gmp_app_id")) {
      str1 = paramString;
      if (!TextUtils.isEmpty(str2))
        str1 = a(paramString, "gmp_app_id", str2).toString(); 
    } 
    paramString = str1;
    if (!str1.contains("fbs_aiid")) {
      paramString = str1;
      if (!TextUtils.isEmpty(str3))
        paramString = a(str1, "fbs_aiid", str3).toString(); 
    } 
    return paramString;
  }
  
  public static String d(String paramString, Context paramContext, boolean paramBoolean) {
    x<Boolean> x = m0.f0;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && !paramBoolean)
      return paramString; 
    String str = paramString;
    if (q.A().H(paramContext))
      if (TextUtils.isEmpty(paramString)) {
        str = paramString;
      } else {
        String str1 = q.A().o(paramContext);
        if (str1 == null)
          return paramString; 
        x<Boolean> x1 = m0.X;
        if (((Boolean)er2.e().<Boolean>c(x1)).booleanValue()) {
          x<String> x2 = m0.Y;
          String str3 = er2.e().<String>c(x2);
          String str2 = paramString;
          if (paramString.contains(str3)) {
            if (q.c().c0(paramString)) {
              q.A().v(paramContext, str1);
              return c(paramString, paramContext).replace(str3, str1);
            } 
            str2 = paramString;
            if (q.c().d0(paramString)) {
              q.A().w(paramContext, str1);
              return c(paramString, paramContext).replace(str3, str1);
            } 
          } 
        } else {
          str = paramString;
          if (!paramString.contains("fbs_aeid")) {
            if (q.c().c0(paramString)) {
              q.A().v(paramContext, str1);
              return a(c(paramString, paramContext), "fbs_aeid", str1).toString();
            } 
            str = paramString;
            if (q.c().d0(paramString)) {
              q.A().w(paramContext, str1);
              str = a(c(paramString, paramContext), "fbs_aeid", str1).toString();
            } 
          } 
        } 
      }  
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */