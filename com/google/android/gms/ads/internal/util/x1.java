package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.zzuq;

@TargetApi(26)
public class x1 extends b {
  public final zzuq g(Context paramContext, TelephonyManager paramTelephonyManager) {
    q.c();
    return h1.q0(paramContext, "android.permission.ACCESS_NETWORK_STATE") ? (paramTelephonyManager.isDataEnabled() ? zzuq.c : zzuq.b) : zzuq.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/x1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */