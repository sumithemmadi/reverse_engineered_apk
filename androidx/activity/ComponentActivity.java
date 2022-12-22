package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.d.a;
import androidx.activity.d.b;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.c;
import androidx.activity.result.d;
import androidx.activity.result.e.a;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import androidx.savedstate.d;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends ComponentActivity implements h, u, c, c, d {
  final a d = new a();
  
  private final i e = new i(this);
  
  final androidx.savedstate.b f = androidx.savedstate.b.a(this);
  
  private t g;
  
  private final OnBackPressedDispatcher h = new OnBackPressedDispatcher(new a(this));
  
  private int i;
  
  private final AtomicInteger j = new AtomicInteger();
  
  private final c k = new b(this);
  
  public ComponentActivity() {
    if (a() != null) {
      int j = Build.VERSION.SDK_INT;
      if (j >= 19)
        a().a((g)new f(this) {
              public void c(h param1h, Lifecycle.Event param1Event) {
                if (param1Event == Lifecycle.Event.ON_STOP) {
                  Window window = this.b.getWindow();
                  if (window != null) {
                    View view = window.peekDecorView();
                  } else {
                    window = null;
                  } 
                  if (window != null)
                    window.cancelPendingInputEvents(); 
                } 
              }
            }); 
      a().a((g)new f(this) {
            public void c(h param1h, Lifecycle.Event param1Event) {
              if (param1Event == Lifecycle.Event.ON_DESTROY) {
                this.b.d.b();
                if (!this.b.isChangingConfigurations())
                  this.b.h().a(); 
              } 
            }
          });
      a().a((g)new f(this) {
            public void c(h param1h, Lifecycle.Event param1Event) {
              this.b.o();
              this.b.a().c((g)this);
            }
          });
      if (19 <= j && j <= 23)
        a().a((g)new ImmLeaksCleaner((Activity)this)); 
      return;
    } 
    throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
  }
  
  private void p() {
    v.a(getWindow().getDecorView(), this);
    w.a(getWindow().getDecorView(), this);
    d.a(getWindow().getDecorView(), this);
  }
  
  public Lifecycle a() {
    return (Lifecycle)this.e;
  }
  
  public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams paramLayoutParams) {
    p();
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public final OnBackPressedDispatcher c() {
    return this.h;
  }
  
  public final c f() {
    return this.k;
  }
  
  public t h() {
    if (getApplication() != null) {
      o();
      return this.g;
    } 
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public final SavedStateRegistry j() {
    return this.f.b();
  }
  
  public final void n(b paramb) {
    this.d.a(paramb);
  }
  
  void o() {
    if (this.g == null) {
      c c1 = (c)getLastNonConfigurationInstance();
      if (c1 != null)
        this.g = c1.b; 
      if (this.g == null)
        this.g = new t(); 
    } 
  }
  
  @Deprecated
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (!this.k.b(paramInt1, paramInt2, paramIntent))
      super.onActivityResult(paramInt1, paramInt2, paramIntent); 
  }
  
  public void onBackPressed() {
    this.h.c();
  }
  
  protected void onCreate(Bundle paramBundle) {
    this.f.c(paramBundle);
    this.d.c((Context)this);
    super.onCreate(paramBundle);
    this.k.g(paramBundle);
    ReportFragment.g((Activity)this);
    int j = this.i;
    if (j != 0)
      setContentView(j); 
  }
  
  @Deprecated
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    if (!this.k.b(paramInt, -1, (new Intent()).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", paramArrayOfint)) && Build.VERSION.SDK_INT >= 23)
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint); 
  }
  
  public final Object onRetainNonConfigurationInstance() {
    Object object = q();
    t t1 = this.g;
    t t2 = t1;
    if (t1 == null) {
      c c2 = (c)getLastNonConfigurationInstance();
      t2 = t1;
      if (c2 != null)
        t2 = c2.b; 
    } 
    if (t2 == null && object == null)
      return null; 
    c c1 = new c();
    c1.a = object;
    c1.b = t2;
    return c1;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    Lifecycle lifecycle = a();
    if (lifecycle instanceof i)
      ((i)lifecycle).o(Lifecycle.State.d); 
    super.onSaveInstanceState(paramBundle);
    this.f.d(paramBundle);
    this.k.h(paramBundle);
  }
  
  @Deprecated
  public Object q() {
    return null;
  }
  
  public void reportFullyDrawn() {
    try {
      if (b.s.a.d()) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("reportFullyDrawn() for ");
        stringBuilder.append(getComponentName());
        b.s.a.a(stringBuilder.toString());
      } 
      int j = Build.VERSION.SDK_INT;
      if (j > 19) {
        super.reportFullyDrawn();
      } else if (j == 19 && androidx.core.content.a.a((Context)this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
        super.reportFullyDrawn();
      } 
      return;
    } finally {
      b.s.a.b();
    } 
  }
  
  public void setContentView(int paramInt) {
    p();
    super.setContentView(paramInt);
  }
  
  public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView) {
    p();
    super.setContentView(paramView);
  }
  
  public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams paramLayoutParams) {
    p();
    super.setContentView(paramView, paramLayoutParams);
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt) {
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  @Deprecated
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4) {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  @Deprecated
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle) {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  class a implements Runnable {
    a(ComponentActivity this$0) {}
    
    public void run() {
      try {
        ComponentActivity.m(this.b);
      } catch (IllegalStateException illegalStateException) {
        if (!TextUtils.equals(illegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState"))
          throw illegalStateException; 
      } 
    }
  }
  
  class b extends c {
    b(ComponentActivity this$0) {}
    
    public <I, O> void f(int param1Int, a<I, O> param1a, I param1I, androidx.core.app.c param1c) {
      String[] arrayOfString1;
      String[] arrayOfString2;
      ComponentActivity componentActivity = this.i;
      a.a a1 = param1a.b((Context)componentActivity, param1I);
      if (a1 != null) {
        (new Handler(Looper.getMainLooper())).post(new a(this, param1Int, a1));
        return;
      } 
      Intent intent = param1a.a((Context)componentActivity, param1I);
      if (intent.getExtras() != null && intent.getExtras().getClassLoader() == null)
        intent.setExtrasClassLoader(componentActivity.getClassLoader()); 
      if (intent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
        Bundle bundle = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      } else if (param1c == null) {
        param1a = null;
      } else {
        throw null;
      } 
      if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
        arrayOfString2 = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        arrayOfString1 = arrayOfString2;
        if (arrayOfString2 == null)
          arrayOfString1 = new String[0]; 
        androidx.core.app.a.o((Activity)componentActivity, arrayOfString1, param1Int);
      } else {
        IntentSenderRequest intentSenderRequest;
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(arrayOfString2.getAction())) {
          intentSenderRequest = (IntentSenderRequest)arrayOfString2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
          try {
            androidx.core.app.a.q((Activity)componentActivity, intentSenderRequest.d(), param1Int, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, (Bundle)arrayOfString1);
          } catch (android.content.IntentSender.SendIntentException sendIntentException) {
            (new Handler(Looper.getMainLooper())).post(new b(this, param1Int, sendIntentException));
          } 
        } else {
          androidx.core.app.a.p((Activity)componentActivity, (Intent)intentSenderRequest, param1Int, (Bundle)sendIntentException);
        } 
      } 
    }
    
    class a implements Runnable {
      a(ComponentActivity.b this$0, int param2Int, a.a param2a) {}
      
      public void run() {
        this.d.c(this.b, this.c.a());
      }
    }
    
    class b implements Runnable {
      b(ComponentActivity.b this$0, int param2Int, IntentSender.SendIntentException param2SendIntentException) {}
      
      public void run() {
        this.d.b(this.b, 0, (new Intent()).setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)this.c));
      }
    }
  }
  
  class a implements Runnable {
    a(ComponentActivity this$0, int param1Int, a.a param1a) {}
    
    public void run() {
      this.d.c(this.b, this.c.a());
    }
  }
  
  class b implements Runnable {
    b(ComponentActivity this$0, int param1Int, IntentSender.SendIntentException param1SendIntentException) {}
    
    public void run() {
      this.d.b(this.b, 0, (new Intent()).setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)this.c));
    }
  }
  
  static final class c {
    Object a;
    
    t b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/ComponentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */