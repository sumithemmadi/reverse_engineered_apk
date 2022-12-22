package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class s92 implements r92 {
  s92(i42 parami42, Activity paramActivity) {}
  
  public final void a(Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks) {
    paramActivityLifecycleCallbacks.onActivityDestroyed(this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */