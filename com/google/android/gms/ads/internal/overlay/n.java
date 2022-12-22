package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.ads.bq2;

public final class n {
  public static void a(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean) {
    Activity activity;
    if (paramAdOverlayInfoParcel.l == 4 && paramAdOverlayInfoParcel.d == null) {
      bq2 bq2 = paramAdOverlayInfoParcel.c;
      if (bq2 != null)
        bq2.x(); 
      q.a();
      if (paramAdOverlayInfoParcel.b.k)
        activity = paramAdOverlayInfoParcel.e.a(); 
      zzd zzd = paramAdOverlayInfoParcel.b;
      e.c((Context)activity, zzd, paramAdOverlayInfoParcel.j, zzd.j);
      return;
    } 
    Intent intent = new Intent();
    intent.setClassName((Context)activity, "com.google.android.gms.ads.AdActivity");
    intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", paramAdOverlayInfoParcel.n.e);
    intent.putExtra("shouldCallOnOverlayOpened", paramBoolean);
    AdOverlayInfoParcel.o0(intent, paramAdOverlayInfoParcel);
    if (!o.h())
      intent.addFlags(524288); 
    if (!(activity instanceof Activity))
      intent.addFlags(268435456); 
    q.c();
    h1.k((Context)activity, intent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */