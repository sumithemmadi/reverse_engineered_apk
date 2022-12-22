package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class q0 {
  private String a;
  
  private Map<String, String> b;
  
  private Context c;
  
  private String d;
  
  public q0(Context paramContext, String paramString) {
    String str1;
    String str2;
    this.c = null;
    this.d = null;
    this.c = paramContext;
    this.d = paramString;
    this.a = c2.b.a();
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    this.b = (Map)linkedHashMap;
    linkedHashMap.put("s", "gmob_sdk");
    this.b.put("v", "3");
    this.b.put("os", Build.VERSION.RELEASE);
    this.b.put("api_v", Build.VERSION.SDK);
    Map<String, String> map2 = this.b;
    q.c();
    map2.put("device", h1.y0());
    Map<String, String> map3 = this.b;
    if (paramContext.getApplicationContext() != null) {
      str2 = paramContext.getApplicationContext().getPackageName();
    } else {
      str2 = paramContext.getPackageName();
    } 
    map3.put("app", str2);
    Map<String, String> map1 = this.b;
    q.c();
    if (h1.F(paramContext)) {
      str1 = "1";
    } else {
      str1 = "0";
    } 
    map1.put("is_lite_sdk", str1);
    Future<yg> future = q.n().b(this.c);
    try {
      this.b.put("network_coarse", Integer.toString(((yg)future.get()).o));
      this.b.put("network_fine", Integer.toString(((yg)future.get()).p));
      return;
    } catch (Exception exception) {
      q.g().e(exception, "CsiConfiguration.CsiConfiguration");
      return;
    } 
  }
  
  final Context a() {
    return this.c;
  }
  
  final String b() {
    return this.d;
  }
  
  final String c() {
    return this.a;
  }
  
  final Map<String, String> d() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */