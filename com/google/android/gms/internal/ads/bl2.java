package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class bl2 implements Application.ActivityLifecycleCallbacks {
  private final Application b;
  
  private final WeakReference<Application.ActivityLifecycleCallbacks> c;
  
  private boolean d = false;
  
  public bl2(Application paramApplication, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks) {
    this.c = new WeakReference<Application.ActivityLifecycleCallbacks>(paramActivityLifecycleCallbacks);
    this.b = paramApplication;
  }
  
  private final void a(kl2 paramkl2) {
    try {
      Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.c.get();
      if (activityLifecycleCallbacks != null) {
        paramkl2.a(activityLifecycleCallbacks);
        return;
      } 
      if (!this.d) {
        this.b.unregisterActivityLifecycleCallbacks(this);
        this.d = true;
      } 
      return;
    } catch (Exception exception) {
      cm.c("Error while dispatching lifecycle callback.", exception);
      return;
    } 
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    a(new al2(this, paramActivity, paramBundle));
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {
    a(new hl2(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity) {
    a(new gl2(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity) {
    a(new dl2(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {
    a(new il2(this, paramActivity, paramBundle));
  }
  
  public final void onActivityStarted(Activity paramActivity) {
    a(new el2(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity) {
    a(new fl2(this, paramActivity));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */