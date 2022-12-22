package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public final class ai0 {
  private final nt1 a;
  
  private final ei0 b;
  
  private final ti0 c;
  
  public ai0(nt1 paramnt1, ei0 paramei0, ti0 paramti0) {
    this.a = paramnt1;
    this.b = paramei0;
    this.c = paramti0;
  }
  
  public final ot1<pf0> a(ci1 paramci1, nh1 paramnh1, JSONObject paramJSONObject) {
    ot1<?> ot11;
    ot1<?> ot12 = this.a.a(new di0(this, paramci1, paramnh1, paramJSONObject));
    ot1<List<a3>> ot13 = this.b.h(paramJSONObject, "images");
    ot1<a3> ot14 = this.b.g(paramJSONObject, "secondary_image");
    ot1<a3> ot15 = this.b.g(paramJSONObject, "app_icon");
    ot1<v2> ot16 = this.b.i(paramJSONObject, "attribution");
    ot1<tq> ot1 = this.b.n(paramJSONObject);
    ei0 ei01 = this.b;
    if (!paramJSONObject.optBoolean("enable_omid")) {
      ot11 = dt1.h(null);
    } else {
      JSONObject jSONObject = paramJSONObject.optJSONObject("omid_settings");
      if (jSONObject == null) {
        ot11 = dt1.h(null);
      } else {
        String str = jSONObject.optString("omid_html");
        if (TextUtils.isEmpty(str)) {
          ot11 = dt1.h(null);
        } else {
          ot11 = dt1.k(dt1.h(null), new ii0((ei0)ot11, str), fm.e);
        } 
      } 
    } 
    ot1<List<yi0>> ot17 = this.c.a(paramJSONObject, "custom_assets");
    return dt1.b((ot1<?>[])new ot1[] { ot12, ot13, ot14, ot15, ot16, ot1, ot11, ot17 }).a(new ci0(this, ot12, ot13, ot15, ot14, ot16, paramJSONObject, ot1, ot11, ot17), this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ai0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */