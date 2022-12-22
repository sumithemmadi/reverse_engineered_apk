package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

public final class ra1 implements s91<sa1> {
  private final wg a;
  
  private final Context b;
  
  private final String c;
  
  private final nt1 d;
  
  public ra1(wg paramwg, Context paramContext, String paramString, nt1 paramnt1) {
    this.a = paramwg;
    this.b = paramContext;
    this.c = paramString;
    this.d = paramnt1;
  }
  
  public final ot1<sa1> a() {
    return this.d.a(new ua1(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ra1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */