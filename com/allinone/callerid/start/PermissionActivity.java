package com.allinone.callerid.start;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.allinone.callerid.i.a.c;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.permission.OverlayGuideActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.recorder.f;

public class PermissionActivity extends BaseActivity implements View.OnClickListener {
  private ConstraintLayout A;
  
  private boolean B = true;
  
  private boolean C = false;
  
  private final String s = "PermissionActivity";
  
  private ConstraintLayout t;
  
  private TextView u;
  
  private TextView v;
  
  private boolean w;
  
  private ConstraintLayout x;
  
  private ConstraintLayout y;
  
  private ConstraintLayout z;
  
  private void O(Context paramContext) {
    try {
      if (Build.VERSION.SDK_INT >= 23 && !((PowerManager)paramContext.getSystemService("power")).isIgnoringBatteryOptimizations(i1.M(paramContext))) {
        q.b().c("battery_optimize_show");
        Intent intent = new Intent();
        this("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("package:");
        stringBuilder.append(i1.M(paramContext));
        intent.setData(Uri.parse(stringBuilder.toString()));
        startActivity(intent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void R() {
    if (com.allinone.callerid.util.k1.b.a(getApplicationContext())) {
      this.t.setVisibility(8);
    } else {
      if (Build.VERSION.SDK_INT >= 26) {
        this.u.setText(getApplicationContext().getResources().getString(2131755074));
        this.v.setText(getApplicationContext().getResources().getString(2131755075));
      } 
      q.b().c("top_norifi_per_show");
      this.t.setVisibility(0);
    } 
  }
  
  private void S() {
    if (this.x.getVisibility() == 8 && this.y.getVisibility() == 8 && this.z.getVisibility() == 8 && this.A.getVisibility() == 8 && this.t.getVisibility() == 8)
      V(); 
  }
  
  private void T() {
    if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getApplicationContext())) {
      this.x.setVisibility(0);
    } else {
      this.x.setVisibility(8);
    } 
    if (this.B) {
      if (b1.n2().booleanValue() && i1.i()) {
        this.y.setVisibility(0);
        q.b().c("permission_ziqi_show");
      } else {
        this.y.setVisibility(8);
      } 
      this.B = false;
    } 
    if (i1.v(getApplicationContext())) {
      this.z.setVisibility(0);
    } else {
      this.z.setVisibility(8);
    } 
    X();
    U();
    R();
    S();
  }
  
  private void U() {
    if (!com.allinone.callerid.util.recorder.b.e()) {
      if (Build.VERSION.SDK_INT >= 28) {
        this.A.setVisibility(8);
      } else {
        this.A.setVisibility(0);
      } 
    } else {
      this.A.setVisibility(8);
    } 
  }
  
  private void V() {
    finish();
    overridePendingTransition(2130771968, 2130771969);
    if (!i1.a0())
      EZCallApplication.b = true; 
  }
  
  private void W() {
    Typeface typeface = g1.b();
    ((ImageView)findViewById(2131296367)).setOnClickListener(this);
    ((TextView)findViewById(2131297756)).setTypeface(typeface);
    this.x = (ConstraintLayout)findViewById(2131297213);
    ((TextView)findViewById(2131297715)).setTypeface(typeface);
    ((TextView)findViewById(2131297714)).setTypeface(typeface);
    ((FrameLayout)findViewById(2131296799)).setOnClickListener(this);
    ((TextView)findViewById(2131297713)).setTypeface(typeface);
    this.y = (ConstraintLayout)findViewById(2131297155);
    ((TextView)findViewById(2131298290)).setTypeface(typeface);
    ((TextView)findViewById(2131298289)).setTypeface(typeface);
    ((FrameLayout)findViewById(2131296813)).setOnClickListener(this);
    ((TextView)findViewById(2131298288)).setTypeface(typeface);
    this.z = (ConstraintLayout)findViewById(2131297158);
    ((TextView)findViewById(2131296375)).setTypeface(typeface);
    ((TextView)findViewById(2131296372)).setTypeface(typeface);
    ((FrameLayout)findViewById(2131296715)).setOnClickListener(this);
    ((TextView)findViewById(2131296376)).setTypeface(typeface);
    this.A = (ConstraintLayout)findViewById(2131297196);
    ((TextView)findViewById(2131297409)).setTypeface(typeface);
    ((TextView)findViewById(2131297408)).setTypeface(typeface);
    ((FrameLayout)findViewById(2131296775)).setOnClickListener(this);
    ((TextView)findViewById(2131297407)).setTypeface(typeface);
    this.t = (ConstraintLayout)findViewById(2131297191);
    TextView textView = (TextView)findViewById(2131297321);
    this.u = textView;
    textView.setTypeface(typeface);
    textView = (TextView)findViewById(2131297320);
    this.v = textView;
    textView.setTypeface(typeface);
    ((FrameLayout)findViewById(2131296766)).setOnClickListener(this);
    ((TextView)findViewById(2131297319)).setTypeface(typeface);
  }
  
  private void X() {
    if (this.C) {
      if (Build.VERSION.SDK_INT >= 23 && b1.b()) {
        i1.A0((Context)EZCallApplication.c());
        b1.F0(false);
      } 
      this.C = false;
    } 
  }
  
  private void Y() {
    Intent intent = new Intent();
    intent.setClass(getApplicationContext(), SelfStartAcitity.class);
    startActivityForResult(intent, 110);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 110 && paramInt2 == 111 && paramIntent.getExtras() != null)
      if (paramIntent.getExtras().getBoolean("isopen")) {
        this.y.setVisibility(8);
      } else {
        this.y.setVisibility(0);
      }  
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131296813:
        q.b().c("permission_click_ziqi");
        b1.E2(Boolean.FALSE);
        Y();
      case 2131296799:
        q.b().c("permission_click_sd");
        try {
          Intent intent = new Intent();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("package:");
          stringBuilder.append(EZCallApplication.c().getPackageName());
          this("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuilder.toString()));
          intent.setFlags(268435456);
          startActivity(intent);
          Handler handler = new Handler();
          this();
          a a = new a();
          this(this);
          handler.postDelayed(a, 300L);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296775:
        q.b().c("permission_click_recoder");
        if (com.allinone.callerid.util.recorder.b.f()) {
          com.allinone.callerid.util.recorder.b.n(true);
          U();
          S();
        } else {
          f.p((Activity)this, new b(this));
        } 
      case 2131296766:
        this.w = true;
        q.b().c("top_norifi_per_click");
        com.allinone.callerid.util.k1.b.c(getApplicationContext());
      case 2131296715:
        q.b().c("permission_click_battery");
        O((Context)EZCallApplication.c());
        this.C = true;
      case 2131296367:
        break;
    } 
    V();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492936);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    W();
    q.b().c("permission_activ_show");
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4 && paramKeyEvent.getRepeatCount() == 0) {
      V();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
    T();
    if (this.w) {
      this.w = false;
      if (com.allinone.callerid.util.k1.b.a(getApplicationContext()))
        q.b().c("top_norifi_per_enalbleed"); 
    } 
  }
  
  class a implements Runnable {
    a(PermissionActivity this$0) {}
    
    public void run() {
      Intent intent = new Intent((Context)this.b, OverlayGuideActivity.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  class b implements c {
    b(PermissionActivity this$0) {}
    
    public void a() {
      PermissionActivity.P(this.a);
      PermissionActivity.Q(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/PermissionActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */