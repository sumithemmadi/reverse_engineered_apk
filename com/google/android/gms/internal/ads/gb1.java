package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.b1;
import org.json.JSONException;
import org.json.JSONObject;

final class gb1 implements s91<t91<JSONObject>> {
  private final JSONObject a;
  
  gb1(Context paramContext) {
    this.a = ch.c(paramContext);
  }
  
  public final ot1<t91<JSONObject>> a() {
    return dt1.h(new fb1(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */