package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class p92 implements r92 {
  p92(i42 parami42, Activity paramActivity, Bundle paramBundle) {}
  
  public final void a(Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks) {
    paramActivityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */