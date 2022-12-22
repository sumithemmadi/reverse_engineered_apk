package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
  private static final c b = new c();
  
  private final AtomicBoolean c = new AtomicBoolean();
  
  private final AtomicBoolean d = new AtomicBoolean();
  
  private final ArrayList<a> e = new ArrayList<a>();
  
  private boolean f = false;
  
  public static c b() {
    return b;
  }
  
  public static void c(Application paramApplication) {
    synchronized (b) {
      if (!null.f) {
        paramApplication.registerActivityLifecycleCallbacks(null);
        paramApplication.registerComponentCallbacks((ComponentCallbacks)null);
        null.f = true;
      } 
      return;
    } 
  }
  
  private final void f(boolean paramBoolean) {
    synchronized (b) {
      ArrayList<a> arrayList = this.e;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        a a = (a)arrayList.get(b);
        b++;
        ((a)a).a(paramBoolean);
      } 
      return;
    } 
  }
  
  public final void a(a parama) {
    synchronized (b) {
      this.e.add(parama);
      return;
    } 
  }
  
  public final boolean d() {
    return this.c.get();
  }
  
  @TargetApi(16)
  public final boolean e(boolean paramBoolean) {
    if (!this.d.get())
      if (o.c()) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (!this.d.getAndSet(true) && runningAppProcessInfo.importance > 100)
          this.c.set(true); 
      } else {
        return paramBoolean;
      }  
    return d();
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    boolean bool = this.c.compareAndSet(true, false);
    this.d.set(true);
    if (bool)
      f(false); 
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {
    boolean bool = this.c.compareAndSet(true, false);
    this.d.set(true);
    if (bool)
      f(false); 
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt) {
    if (paramInt == 20 && this.c.compareAndSet(false, true)) {
      this.d.set(true);
      f(true);
    } 
  }
  
  public static interface a {
    void a(boolean param1Boolean);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */