package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
final class nl2 implements Application.ActivityLifecycleCallbacks {
  private Activity b;
  
  private Context c;
  
  private final Object d = new Object();
  
  private boolean e = true;
  
  private boolean f = false;
  
  private final List<pl2> g = new ArrayList<pl2>();
  
  private final List<fm2> h = new ArrayList<fm2>();
  
  private Runnable i;
  
  private boolean j = false;
  
  private long k;
  
  private final void c(Activity paramActivity) {
    synchronized (this.d) {
      if (!paramActivity.getClass().getName().startsWith("com.google.android.gms.ads"))
        this.b = paramActivity; 
      return;
    } 
  }
  
  public final Activity a() {
    return this.b;
  }
  
  public final Context b() {
    return this.c;
  }
  
  public final void e(Application paramApplication, Context paramContext) {
    if (!this.j) {
      paramApplication.registerActivityLifecycleCallbacks(this);
      if (paramContext instanceof Activity)
        c((Activity)paramContext); 
      this.c = (Context)paramApplication;
      x<Long> x = m0.C0;
      this.k = ((Long)er2.e().<Long>c(x)).longValue();
      this.j = true;
    } 
  }
  
  public final void f(pl2 parampl2) {
    synchronized (this.d) {
      this.g.add(parampl2);
      return;
    } 
  }
  
  public final void h(pl2 parampl2) {
    synchronized (this.d) {
      this.g.remove(parampl2);
      return;
    } 
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {
    synchronized (this.d) {
      Activity activity = this.b;
      if (activity == null)
        return; 
      if (activity.equals(paramActivity))
        this.b = null; 
      Iterator<fm2> iterator = this.h.iterator();
      while (iterator.hasNext()) {
        fm2 fm2 = iterator.next();
        try {
          if (fm2.a(paramActivity))
            iterator.remove(); 
        } catch (Exception exception) {
          q.g().e(exception, "AppActivityTracker.ActivityListener.onActivityDestroyed");
          cm.c("", exception);
        } 
      } 
      return;
    } 
  }
  
  public final void onActivityPaused(Activity paramActivity) {
    c(paramActivity);
    synchronized (this.d) {
      for (fm2 fm2 : this.h) {
        try {
          fm2.onActivityPaused(paramActivity);
        } catch (Exception exception) {
          q.g().e(exception, "AppActivityTracker.ActivityListener.onActivityPaused");
          cm.c("", exception);
        } 
      } 
      this.f = true;
      Runnable runnable = this.i;
      if (runnable != null)
        h1.a.removeCallbacks(runnable); 
      null = h1.a;
      runnable = new ql2(this);
      this.i = runnable;
      null.postDelayed(runnable, this.k);
      return;
    } 
  }
  
  public final void onActivityResumed(Activity paramActivity) {
    c(paramActivity);
    this.f = false;
    boolean bool = this.e;
    this.e = true;
    Runnable runnable = this.i;
    if (runnable != null)
      h1.a.removeCallbacks(runnable); 
    synchronized (this.d) {
      for (fm2 fm2 : this.h) {
        try {
          fm2.onActivityResumed(paramActivity);
        } catch (Exception exception) {
          q.g().e(exception, "AppActivityTracker.ActivityListener.onActivityResumed");
          cm.c("", exception);
        } 
      } 
      if ((bool ^ true) != 0) {
        for (pl2 pl2 : this.g) {
          try {
            pl2.a(true);
          } catch (Exception exception) {
            cm.c("", exception);
          } 
        } 
      } else {
        cm.e("App is still foreground.");
      } 
      return;
    } 
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {
    c(paramActivity);
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */