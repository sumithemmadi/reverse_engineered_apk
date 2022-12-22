package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.mm;
import com.google.android.gms.internal.ads.ot1;
import com.google.android.gms.internal.ads.wl;

public final class z {
  public static void a(Context paramContext) {
    if (!wl.p(paramContext))
      return; 
    if (!wl.l()) {
      ot1<?> ot1 = (new c1(paramContext)).c();
      cm.h("Updating ad debug logging enablement.");
      mm.a(ot1, "AdDebugLogUpdater.updateEnablement");
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */