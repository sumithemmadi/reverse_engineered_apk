package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.common.util.o;
import java.util.concurrent.Executor;

public final class uw0 implements hv0<ec0> {
  private final Context a;
  
  private final fd0 b;
  
  private final Executor c;
  
  private final lh1 d;
  
  public uw0(Context paramContext, Executor paramExecutor, fd0 paramfd0, lh1 paramlh1) {
    this.a = paramContext;
    this.b = paramfd0;
    this.c = paramExecutor;
    this.d = paramlh1;
  }
  
  private static String d(nh1 paramnh1) {
    try {
      return paramnh1.u.getString("tab_url");
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    return (this.a instanceof android.app.Activity && o.b() && m1.f(this.a) && !TextUtils.isEmpty(d(paramnh1)));
  }
  
  public final ot1<ec0> b(ci1 paramci1, nh1 paramnh1) {
    String str = d(paramnh1);
    if (str != null) {
      Uri uri = Uri.parse(str);
    } else {
      str = null;
    } 
    return dt1.k(dt1.h(null), new tw0(this, (Uri)str, paramci1, paramnh1), this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */