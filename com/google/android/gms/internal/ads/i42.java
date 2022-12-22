package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class i42 implements Application.ActivityLifecycleCallbacks {
  private final Application b;
  
  private final WeakReference<Application.ActivityLifecycleCallbacks> c;
  
  private boolean d = false;
  
  public i42(Application paramApplication, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks) {
    this.c = new WeakReference<Application.ActivityLifecycleCallbacks>(paramActivityLifecycleCallbacks);
    this.b = paramApplication;
  }
  
  private final void a(r92 paramr92) {
    try {
      Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.c.get();
      if (activityLifecycleCallbacks != null) {
        paramr92.a(activityLifecycleCallbacks);
        return;
      } 
      if (!this.d) {
        this.b.unregisterActivityLifecycleCallbacks(this);
        this.d = true;
      } 
    } catch (Exception exception) {}
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    a(new f72(this, paramActivity, paramBundle));
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {
    a(new s92(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity) {
    a(new y72(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity) {
    a(new y82(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {
    a(new p92(this, paramActivity, paramBundle));
  }
  
  public final void onActivityStarted(Activity paramActivity) {
    a(new f62(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity) {
    a(new q92(this, paramActivity));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */