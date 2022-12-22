package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class hl2 implements kl2 {
  hl2(bl2 parambl2, Activity paramActivity) {}
  
  public final void a(Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks) {
    paramActivityLifecycleCallbacks.onActivityDestroyed(this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */