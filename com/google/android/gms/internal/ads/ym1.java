package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.util.Map;

public final class ym1 {
  private final Context a;
  
  private final String b;
  
  private final String c;
  
  public ym1(Context paramContext, zzazn paramzzazn) {
    this.a = paramContext;
    this.b = paramContext.getPackageName();
    this.c = paramzzazn.b;
  }
  
  public final void a(Map<String, String> paramMap) {
    String str;
    paramMap.put("s", "gmob_sdk");
    paramMap.put("v", "3");
    paramMap.put("os", Build.VERSION.RELEASE);
    paramMap.put("api_v", Build.VERSION.SDK);
    q.c();
    paramMap.put("device", h1.y0());
    paramMap.put("app", this.b);
    q.c();
    if (h1.F(this.a)) {
      str = "1";
    } else {
      str = "0";
    } 
    paramMap.put("is_lite_sdk", str);
    paramMap.put("e", TextUtils.join(",", m0.e()));
    paramMap.put("sdkVersion", this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ym1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */