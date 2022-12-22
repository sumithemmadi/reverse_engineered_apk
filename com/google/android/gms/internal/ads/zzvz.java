package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.q;

public final class zzvz {
  private final f[] a;
  
  private final String b;
  
  public zzvz(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, q.AdsAttrs);
    String str1 = typedArray.getString(q.AdsAttrs_adSize);
    String str2 = typedArray.getString(q.AdsAttrs_adSizes);
    int i = TextUtils.isEmpty(str1) ^ true;
    int j = TextUtils.isEmpty(str2) ^ true;
    if (i != 0 && j == 0) {
      this.a = b(str1);
    } else if (i == 0 && j != 0) {
      this.a = b(str2);
    } else {
      if (i != 0)
        throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both."); 
      throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
    } 
    str1 = typedArray.getString(q.AdsAttrs_adUnitId);
    this.b = str1;
    if (!TextUtils.isEmpty(str1))
      return; 
    throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
  }
  
  private static f[] b(String paramString) {
    String[] arrayOfString = paramString.split("\\s*,\\s*");
    int i = arrayOfString.length;
    f[] arrayOfF = new f[i];
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str = arrayOfString[b].trim();
      if (str.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
        String[] arrayOfString1 = str.split("[xX]");
        arrayOfString1[0] = arrayOfString1[0].trim();
        arrayOfString1[1] = arrayOfString1[1].trim();
        try {
          int j;
          int k;
          if ("FULL_WIDTH".equals(arrayOfString1[0])) {
            j = -1;
          } else {
            j = Integer.parseInt(arrayOfString1[0]);
          } 
          if ("AUTO_HEIGHT".equals(arrayOfString1[1])) {
            k = -2;
          } else {
            k = Integer.parseInt(arrayOfString1[1]);
          } 
          arrayOfF[b] = new f(j, k);
        } catch (NumberFormatException numberFormatException) {
          String str1;
          if (str.length() != 0) {
            str1 = "Could not parse XML attribute \"adSize\": ".concat(str);
          } else {
            str1 = new String("Could not parse XML attribute \"adSize\": ");
          } 
          throw new IllegalArgumentException(str1);
        } 
      } else if ("BANNER".equals(str)) {
        arrayOfF[b] = f.a;
      } else if ("LARGE_BANNER".equals(str)) {
        arrayOfF[b] = f.c;
      } else if ("FULL_BANNER".equals(str)) {
        arrayOfF[b] = f.b;
      } else if ("LEADERBOARD".equals(str)) {
        arrayOfF[b] = f.d;
      } else if ("MEDIUM_RECTANGLE".equals(str)) {
        arrayOfF[b] = f.e;
      } else if ("SMART_BANNER".equals(str)) {
        arrayOfF[b] = f.g;
      } else if ("WIDE_SKYSCRAPER".equals(str)) {
        arrayOfF[b] = f.f;
      } else if ("FLUID".equals(str)) {
        arrayOfF[b] = f.h;
      } else if ("ICON".equals(str)) {
        arrayOfF[b] = f.j;
      } else {
        if (str.length() != 0) {
          paramString = "Could not parse XML attribute \"adSize\": ".concat(str);
        } else {
          paramString = new String("Could not parse XML attribute \"adSize\": ");
        } 
        throw new IllegalArgumentException(paramString);
      } 
    } 
    if (i == 0) {
      if (paramString.length() != 0) {
        paramString = "Could not parse XML attribute \"adSize\": ".concat(paramString);
      } else {
        paramString = new String("Could not parse XML attribute \"adSize\": ");
      } 
      throw new IllegalArgumentException(paramString);
    } 
    return arrayOfF;
  }
  
  public final String a() {
    return this.b;
  }
  
  public final f[] c(boolean paramBoolean) {
    if (paramBoolean || this.a.length == 1)
      return this.a; 
    throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzvz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */