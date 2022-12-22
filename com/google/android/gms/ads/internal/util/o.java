package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.bo2;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.kt2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.me2;
import com.google.android.gms.internal.ads.qp;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.zg;
import java.io.File;
import java.util.regex.Pattern;

public final class o extends zg {
  private final Context d;
  
  private o(Context paramContext, re paramre) {
    super(paramre);
    this.d = paramContext;
  }
  
  public static v3 b(Context paramContext) {
    o o1 = new o(paramContext, (re)new qp());
    v3 v3 = new v3((me2)new ai(new File(paramContext.getCacheDir(), "admob_volley"), 20971520), (bo2)o1);
    v3.a();
    return v3;
  }
  
  public final kt2 a(w<?> paramw) {
    String str;
    if (paramw.C() && paramw.e() == 0) {
      String str1 = paramw.f();
      x x = m0.e3;
      if (Pattern.matches((String)er2.e().c(x), str1)) {
        er2.a();
        if (sl.u(this.d, 13400000)) {
          kt2 kt2 = (new s7(this.d)).a(paramw);
          if (kt2 != null) {
            str = String.valueOf(paramw.f());
            if (str.length() != 0) {
              str = "Got gmscore asset response: ".concat(str);
            } else {
              str = new String("Got gmscore asset response: ");
            } 
            b1.m(str);
            return kt2;
          } 
          String str2 = String.valueOf(str.f());
          if (str2.length() != 0) {
            str2 = "Failed to get gmscore asset response: ".concat(str2);
          } else {
            str2 = new String("Failed to get gmscore asset response: ");
          } 
          b1.m(str2);
        } 
      } 
    } 
    return super.a((w)str);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */