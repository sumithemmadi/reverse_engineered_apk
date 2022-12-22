package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class p12 {
  private static final String[] a = new String[] { "/aclk", "/pcs/click", "/dbm/clk" };
  
  private String b = "googleads.g.doubleclick.net";
  
  private String c = "/pagead/ads";
  
  private String d = "ad.doubleclick.net";
  
  private String[] e = new String[] { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  
  private xr1 f;
  
  public p12(xr1 paramxr1) {
    this.f = paramxr1;
  }
  
  private final Uri c(Uri paramUri, String paramString) {
    try {
      zzeh zzeh;
      String str1;
      StringBuilder stringBuilder;
      boolean bool = e(paramUri);
      if (bool) {
        if (paramUri.toString().contains("dc_ms=")) {
          zzeh = new zzeh();
          this("Parameter already exists: dc_ms");
          throw zzeh;
        } 
      } else {
        String str = zzeh.getQueryParameter("ms");
        if (str != null) {
          zzeh = new zzeh();
          this("Query parameter already exists: ms");
          throw zzeh;
        } 
      } 
      if (bool) {
        String str = zzeh.toString();
        int k = str.indexOf(";adurl");
        if (k != -1) {
          stringBuilder = new StringBuilder();
          this(str.substring(0, ++k));
          stringBuilder.append("dc_ms");
          stringBuilder.append("=");
          stringBuilder.append(paramString);
          stringBuilder.append(";");
          stringBuilder.append(str.substring(k));
          return Uri.parse(stringBuilder.toString());
        } 
        str1 = stringBuilder.getEncodedPath();
        k = str.indexOf(str1);
        StringBuilder stringBuilder1 = new StringBuilder();
        this(str.substring(0, str1.length() + k));
        stringBuilder1.append(";");
        stringBuilder1.append("dc_ms");
        stringBuilder1.append("=");
        stringBuilder1.append(paramString);
        stringBuilder1.append(";");
        stringBuilder1.append(str.substring(k + str1.length()));
        return Uri.parse(stringBuilder1.toString());
      } 
      String str2 = str1.toString();
      int j = str2.indexOf("&adurl");
      int i = j;
      if (j == -1)
        i = str2.indexOf("?adurl"); 
      if (i != -1) {
        stringBuilder = new StringBuilder();
        this(str2.substring(0, ++i));
        stringBuilder.append("ms");
        stringBuilder.append("=");
        stringBuilder.append(paramString);
        stringBuilder.append("&");
        stringBuilder.append(str2.substring(i));
        return Uri.parse(stringBuilder.toString());
      } 
      return stringBuilder.buildUpon().appendQueryParameter("ms", paramString).build();
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw new zzeh("Provided Uri is not in a valid state");
    } 
  }
  
  private final boolean e(Uri paramUri) {
    paramUri.getClass();
    try {
      return paramUri.getHost().equals(this.d);
    } catch (NullPointerException nullPointerException) {
      return false;
    } 
  }
  
  public final Uri a(Uri paramUri, Context paramContext) {
    return c(paramUri, this.f.d(paramContext));
  }
  
  public final Uri b(Uri paramUri, Context paramContext, View paramView, Activity paramActivity) {
    try {
      return c(paramUri, this.f.g(paramContext, paramUri.getQueryParameter("ai"), paramView, paramActivity));
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw new zzeh("Provided Uri is not in a valid state");
    } 
  }
  
  public final void d(MotionEvent paramMotionEvent) {
    this.f.f(paramMotionEvent);
  }
  
  public final boolean f(Uri paramUri) {
    paramUri.getClass();
    try {
      String str = paramUri.getHost();
      String[] arrayOfString = this.e;
      int i = arrayOfString.length;
      for (byte b = 0; b < i; b++) {
        boolean bool = str.endsWith(arrayOfString[b]);
        if (bool)
          return true; 
      } 
    } catch (NullPointerException nullPointerException) {}
    return false;
  }
  
  public final boolean g(Uri paramUri) {
    if (f(paramUri))
      for (String str : a) {
        if (paramUri.getPath().endsWith(str))
          return true; 
      }  
    return false;
  }
  
  public final xr1 h() {
    return this.f;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */