package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONException;

public final class h40 extends lt2 {
  private final String b;
  
  private final String c;
  
  private final List<zzvw> d;
  
  public h40(nh1 paramnh1, String paramString, nv0 paramnv0) {
    boolean bool;
    String str1 = null;
    if (paramnh1 == null) {
      str2 = null;
    } else {
      str2 = paramnh1.V;
    } 
    this.c = str2;
    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    String str2 = str1;
    if (bool)
      str2 = S9(paramnh1); 
    if (str2 != null)
      paramString = str2; 
    this.b = paramString;
    this.d = paramnv0.a();
  }
  
  private static String S9(nh1 paramnh1) {
    try {
      return paramnh1.u.getString("class_name");
    } catch (JSONException jSONException) {
      return null;
    } 
  }
  
  public final List<zzvw> U5() {
    x<Boolean> x = m0.S5;
    return !((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? null : this.d;
  }
  
  public final String a() {
    return this.b;
  }
  
  public final String s7() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */