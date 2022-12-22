package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.TimeUnit;

public final class kq0 implements a92<ot1<String>> {
  private final m92<am1> a;
  
  private final m92<Context> b;
  
  private kq0(m92<am1> paramm92, m92<Context> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static kq0 a(m92<am1> paramm92, m92<Context> paramm921) {
    return new kq0(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */