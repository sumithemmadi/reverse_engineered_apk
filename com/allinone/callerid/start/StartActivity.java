package com.allinone.callerid.start;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.allinone.callerid.d.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.permission.RequestPermissionActivity;
import com.allinone.callerid.service.NLService;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.m0;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.t;
import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends AppCompatActivity {
  public static boolean s;
  
  public static boolean t;
  
  public static boolean u;
  
  private static StartActivity v;
  
  private Timer A;
  
  private TimerTask B;
  
  private boolean C = true;
  
  private final String w = "StartActivity";
  
  private boolean x;
  
  private boolean y;
  
  private Handler z = new Handler();
  
  private void U() {
    if (this.y) {
      f.q(true);
      f.o(System.currentTimeMillis());
      if (Y()) {
        q.b().c("first_enter_startactivity");
        startActivity(new Intent((Context)this, GuideActivity.class));
        overridePendingTransition(2130771968, 2130771969);
      } else {
        setContentView(2131493068);
        ((FrameLayout)findViewById(2131296741)).setOnClickListener(new b(this));
      } 
    } 
  }
  
  public static StartActivity W() {
    return v;
  }
  
  private void X() {
    (j0.a()).b.execute(new a(this));
  }
  
  private boolean Y() {
    if (Build.VERSION.SDK_INT >= 21)
      try {
        getDrawable(2131231137);
      } catch (android.content.res.Resources.NotFoundException notFoundException) {
        boolean bool = false;
      }  
    return true;
  }
  
  private void Z() {
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("canEnterMain:");
      stringBuilder.append(u);
      d0.a("AppOpenManager", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("hasDisplayedAd:");
      stringBuilder.append(t);
      d0.a("AppOpenManager", stringBuilder.toString());
    } 
    if (t) {
      t = false;
      TimerTask timerTask = this.B;
      if (timerTask != null)
        timerTask.cancel(); 
      this.C = false;
    } 
    if (u) {
      u = false;
      TimerTask timerTask = this.B;
      if (timerTask != null)
        timerTask.cancel(); 
      s = true;
      if (d0.a)
        d0.a("AppOpenManager", "enterMain"); 
      V();
    } 
  }
  
  private void a0() {
    try {
      if (Y()) {
        if (com.allinone.callerid.util.k1.a.d(getApplicationContext()) && com.allinone.callerid.util.k1.a.c(getApplicationContext())) {
          Intent intent1 = new Intent();
          this((Context)this, MainActivity.class);
          Intent intent2 = getIntent();
          if (intent2 != null && "offline_notifi".equals(getIntent().getStringExtra("offline_notifi"))) {
            if (d0.a)
              d0.a("fcm", "offline_notifi"); 
            intent1.putExtra("offline_notifi", intent1.getStringExtra("offline_notifi"));
          } 
          if (getIntent() != null && "callscreen".equals(getIntent().getStringExtra("callscreen"))) {
            if (d0.a)
              d0.a("fcm", "callscreen"); 
            intent1.putExtra("is_callscreen", true);
          } 
          intent2 = intent1;
          if (getIntent() != null) {
            intent2 = intent1;
            if ("open_version_update".equals(getIntent().getStringExtra("version_update_notifi"))) {
              if (d0.a)
                d0.a("fcm", "open_version_update"); 
              try {
                intent1 = getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.vending");
                ComponentName componentName = new ComponentName();
                this("com.android.vending", "com.google.android.finsky.activities.LaunchUrlHandlerActivity");
                intent2 = intent1;
                if (intent1 != null) {
                  intent1.setComponent(componentName);
                  StringBuilder stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("market://details?id=");
                  stringBuilder.append(getApplicationContext().getPackageName());
                  intent1.setData(Uri.parse(stringBuilder.toString()));
                  intent1.setFlags(268435456);
                  Intent intent = intent1;
                } 
              } catch (Exception exception) {
                intent2 = new Intent();
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("https://play.google.com/store/apps/details?id=");
                stringBuilder.append(getApplicationContext().getPackageName());
                this("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
                intent2.setFlags(268435456);
              } 
            } 
          } 
          startActivity(intent2);
          overridePendingTransition(2130771968, 2130771969);
        } else {
          Intent intent = new Intent();
          this();
          intent.setClass((Context)this, RequestPermissionActivity.class);
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
        } 
      } else {
        setContentView(2131493068);
        FrameLayout frameLayout = (FrameLayout)findViewById(2131296741);
        e e = new e();
        this(this);
        frameLayout.setOnClickListener(e);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void b0() {
    try {
      PackageManager packageManager = getPackageManager();
      ComponentName componentName = new ComponentName();
      this((Context)this, NLService.class);
      packageManager.setComponentEnabledSetting(componentName, 2, 1);
      componentName = new ComponentName();
      this((Context)this, NLService.class);
      packageManager.setComponentEnabledSetting(componentName, 1, 1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void V() {
    if (d0.a)
      d0.a("AppOpenManager", "enterMain()"); 
    this.C = false;
    TimerTask timerTask = this.B;
    if (timerTask != null)
      timerTask.cancel(); 
    a0();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    v = this;
    if ((getIntent().getFlags() & 0x400000) != 0) {
      finish();
      return;
    } 
    requestWindowFeature(1);
    if (d0.a)
      d0.a("first_enter", "StartActivity_onCreate"); 
    if (i1.u0()) {
      q.b().c("isSpecialDevice");
      finish();
    } else {
      if (Build.VERSION.SDK_INT >= 21 && com.allinone.callerid.util.k1.a.j())
        b0(); 
      t.a();
      X();
    } 
  }
  
  protected void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
  }
  
  public void onPause() {
    super.onPause();
  }
  
  public void onResume() {
    super.onResume();
  }
  
  protected void onStart() {
    super.onStart();
    if (!i1.B(getApplicationContext())) {
      this.C = true;
      s = false;
      this.A = new Timer();
      TimerTask timerTask = this.B;
      if (timerTask != null)
        timerTask.cancel(); 
      timerTask = new c(this);
      this.B = timerTask;
      this.A.schedule(timerTask, 0L, 1000L);
      this.z.postDelayed(new d(this), 3000L);
    } 
  }
  
  class a implements Runnable {
    a(StartActivity this$0) {}
    
    public void run() {
      if (i1.C(this.b.getApplicationContext())) {
        if (!i1.e0(this.b.getApplicationContext()))
          p.d(this.b.getApplicationContext()).getCountry_code(); 
        if (!i1.e0(this.b.getApplicationContext()))
          b1.y0(); 
        f.t(true);
        f.n(true);
        f.v(true);
        q.b().c("callscreen_can_use");
      } 
      StartActivity.N(this.b, com.allinone.callerid.util.j1.a.i());
      StartActivity startActivity = this.b;
      StartActivity.O(startActivity, i1.B(startActivity.getApplicationContext()));
      this.b.runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(StartActivity.a this$0) {}
      
      public void run() {
        if (StartActivity.M(this.b.b))
          m0.b(this.b.b.getApplicationContext()); 
        StartActivity.P(this.b.b);
      }
    }
  }
  
  class a implements Runnable {
    a(StartActivity this$0) {}
    
    public void run() {
      if (StartActivity.M(this.b.b))
        m0.b(this.b.b.getApplicationContext()); 
      StartActivity.P(this.b.b);
    }
  }
  
  class b implements View.OnClickListener {
    b(StartActivity this$0) {}
    
    public void onClick(View param1View) {
      i1.C0(this.b.getApplicationContext(), i1.M(this.b.getApplicationContext()));
      this.b.finish();
    }
  }
  
  class c extends TimerTask {
    c(StartActivity this$0) {}
    
    public void run() {
      StartActivity.Q(this.b);
    }
  }
  
  class d implements Runnable {
    d(StartActivity this$0) {}
    
    public void run() {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("delayedJudge:");
        stringBuilder.append(StartActivity.R(this.b));
        d0.a("AppOpenManager", stringBuilder.toString());
      } 
      if (StartActivity.R(this.b)) {
        StartActivity.S(this.b, false);
        if (StartActivity.T(this.b) != null)
          StartActivity.T(this.b).cancel(); 
        if ((EZCallApplication.c()).h.b == null) {
          StartActivity.s = true;
          this.b.V();
        } else if (!(EZCallApplication.c()).h.g) {
          StartActivity.s = true;
          this.b.V();
        } 
      } 
    }
  }
  
  class e implements View.OnClickListener {
    e(StartActivity this$0) {}
    
    public void onClick(View param1View) {
      i1.C0(this.b.getApplicationContext(), i1.M(this.b.getApplicationContext()));
      this.b.finish();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/StartActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */