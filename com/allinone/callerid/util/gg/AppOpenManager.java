package com.allinone.callerid.util.gg;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.start.StartActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.l;
import java.util.Date;

public class AppOpenManager implements g, Application.ActivityLifecycleCallbacks {
  public com.google.android.gms.ads.appopen.a b = null;
  
  private com.google.android.gms.ads.appopen.a.a c;
  
  private final EZCallApplication d;
  
  private Activity e;
  
  private long f = 0L;
  
  public boolean g = false;
  
  public AppOpenManager(EZCallApplication paramEZCallApplication) {
    this.d = paramEZCallApplication;
    paramEZCallApplication.registerActivityLifecycleCallbacks(this);
    p.k().a().a(this);
  }
  
  private e j() {
    return (new e.a()).d();
  }
  
  private boolean m(long paramLong) {
    boolean bool;
    if ((new Date()).getTime() - this.f < paramLong * 3600000L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void i() {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("isAdAvailable():");
      stringBuilder.append(k());
      Log.e("AppOpenManager", stringBuilder.toString());
      if (k()) {
        com.google.android.gms.ads.appopen.a a1 = this.b;
        Activity activity = this.e;
        b b = new b();
        this(this);
        a1.b(activity, b);
        return;
      } 
      c c = new c();
      this(this);
      this.c = c;
      e e = j();
      com.google.android.gms.ads.appopen.a.a((Context)this.d, "ca-app-pub-5825926894918682/8693450802", e, 1, this.c);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean k() {
    boolean bool = m(4L);
    boolean bool1 = true;
    if (!bool)
      (EZCallApplication.c()).j = true; 
    if (this.b == null || !m(4L))
      bool1 = false; 
    return bool1;
  }
  
  public void l() {
    try {
      boolean bool = this.g;
      if (!bool && k()) {
        Log.e("AppOpenManager", "Will show ad.");
        if (!i1.B((Context)EZCallApplication.c())) {
          bool = d0.a;
          if (bool) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("hasEntered:");
            stringBuilder.append(StartActivity.s);
            d0.a("AppOpenManager", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("currentActivity:");
            stringBuilder.append(this.e.getClass().getSimpleName());
            d0.a("AppOpenManager", stringBuilder.toString());
          } 
          if (!StartActivity.s && "StartActivity".equals(this.e.getClass().getSimpleName())) {
            d d = new d();
            this(this);
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("currentActivity:");
            stringBuilder.append(this.e);
            Log.e("AppOpenManager", stringBuilder.toString());
            this.b.b(this.e, d);
          } 
        } else {
          Log.e("AppOpenManager", "first install not show ad");
        } 
      } else {
        Log.e("AppOpenManager", "Can not show ad.");
        i();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {
    this.e = null;
  }
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity) {
    this.e = paramActivity;
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {
    this.e = paramActivity;
  }
  
  public void onActivityStopped(Activity paramActivity) {}
  
  @o(Lifecycle.Event.ON_CREATE)
  public void onCreate() {
    Log.e("AppOpenManager", "onCreate");
  }
  
  @o(Lifecycle.Event.ON_DESTROY)
  public void onDestroy() {
    Log.e("AppOpenManager", "onDestroy");
  }
  
  @o(Lifecycle.Event.ON_PAUSE)
  public void onPause() {
    Log.e("AppOpenManager", "onPause");
  }
  
  @o(Lifecycle.Event.ON_RESUME)
  public void onResume() {
    Log.e("AppOpenManager", "onResume");
  }
  
  @o(Lifecycle.Event.ON_START)
  public void onStart() {
    if ((EZCallApplication.c()).i)
      com.allinone.callerid.i.a.d.a.a(new a(this)); 
    Log.e("AppOpenManager", "onStart");
  }
  
  @o(Lifecycle.Event.ON_STOP)
  public void onStop() {
    Log.e("AppOpenManager", "onStop");
  }
  
  class a implements com.allinone.callerid.i.a.d.b {
    a(AppOpenManager this$0) {}
    
    public void a(boolean param1Boolean) {
      AppOpenManager appOpenManager = this.a;
      if (appOpenManager.g)
        appOpenManager.l(); 
    }
  }
  
  class b extends j {
    b(AppOpenManager this$0) {}
    
    public void a() {
      Log.e("AppOpenManager", "onAdDismissedFullScreenContent");
      AppOpenManager appOpenManager = this.a;
      appOpenManager.b = null;
      appOpenManager.g = false;
      appOpenManager.i();
    }
    
    public void b(com.google.android.gms.ads.a param1a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onAdFailedToShowFullScreenContent:");
      stringBuilder.append(param1a.c());
      Log.e("AppOpenManager", stringBuilder.toString());
    }
    
    public void c() {
      Log.e("AppOpenManager", "onAdShowedFullScreenContent");
      this.a.g = true;
    }
  }
  
  class c extends com.google.android.gms.ads.appopen.a.a {
    c(AppOpenManager this$0) {}
    
    public void d(l param1l) {
      if ((EZCallApplication.c()).j) {
        (EZCallApplication.c()).j = false;
        StartActivity.u = true;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ColdStarts--onAppOpenAdFailedToLoad:");
      stringBuilder.append(param1l.c());
      Log.e("AppOpenManager", stringBuilder.toString());
    }
    
    public void e(com.google.android.gms.ads.appopen.a param1a) {
      try {
        Log.e("AppOpenManager", "onAppOpenAdLoaded");
        AppOpenManager appOpenManager = this.a;
        appOpenManager.b = param1a;
        Date date = new Date();
        this();
        AppOpenManager.h(appOpenManager, date.getTime());
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class d extends j {
    d(AppOpenManager this$0) {}
    
    public void a() {
      try {
        Log.e("AppOpenManager", "onAdDismissedFullScreenContent");
        AppOpenManager appOpenManager = this.a;
        appOpenManager.b = null;
        appOpenManager.g = false;
        StartActivity.W().V();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void b(com.google.android.gms.ads.a param1a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onAdFailedToShowFullScreenContent:");
      stringBuilder.append(param1a.c());
      Log.e("AppOpenManager", stringBuilder.toString());
      StartActivity.u = true;
    }
    
    public void c() {
      Log.e("AppOpenManager", "onAdShowedFullScreenContent");
      StartActivity.t = true;
      this.a.g = true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/gg/AppOpenManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */