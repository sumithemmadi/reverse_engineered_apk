package com.allinone.callerid.mvc.controller.permission;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.i;
import com.allinone.callerid.main.BaseThemeActivity;
import com.allinone.callerid.start.PrivacyActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.t;

public class RequestPermissionActivity extends BaseThemeActivity implements View.OnClickListener {
  private final String s = "RequestPermissionActivity";
  
  private boolean t;
  
  private boolean u;
  
  private boolean v;
  
  private boolean w;
  
  private long x = 0L;
  
  private void P() {
    t.a();
    Intent intent = new Intent();
    intent.setClass((Context)this, PrivacyActivity.class);
    q.b().d("request_permission_granted");
    startActivity(intent);
    overridePendingTransition(2130771968, 2130771969);
    finish();
  }
  
  private void Q() {
    com.allinone.callerid.util.k1.a.m((Activity)this, new a(this));
  }
  
  private void R(Context paramContext) {
    try {
      if (!i1.q0()) {
        NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
        Intent intent = new Intent();
        this(paramContext, RequestPermissionActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("per_enable_notifi", true);
        PendingIntent pendingIntent = PendingIntent.getActivity(paramContext, 1, intent, 134217728);
        i.e e = new i.e();
        this(paramContext, "Showcaller");
        e.j(paramContext.getResources().getString(2131755591)).k(paramContext.getResources().getString(2131755592)).i(pendingIntent).B(System.currentTimeMillis()).s(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
          NotificationChannel notificationChannel = new NotificationChannel();
          this("com.allinone.callerid_notfication_N", "Showcaller", 3);
          if (notificationManager != null) {
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
            e.g("com.allinone.callerid_notfication_N");
          } 
        } 
        if (i >= 21) {
          try {
            paramContext.getDrawable(2131231332);
            e.v(2131231332);
            e.h(paramContext.getResources().getColor(2131099706));
          } catch (Exception exception) {
            return;
          } 
        } else {
          e.v(2131231118);
          e.o(BitmapFactory.decodeResource(exception.getResources(), 2131558400));
        } 
        notificationManager.notify(2019, e.b());
      } 
    } finally {
      paramContext = null;
    } 
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 999)
      if (com.allinone.callerid.util.k1.a.g(getApplicationContext())) {
        Q();
        q.b().d("first_request_default_dialer_enabled");
        if (d0.a)
          d0.a("default_dialer", "isEnable"); 
      } else {
        Q();
        if (d0.a)
          d0.a("default_dialer", "notEnable"); 
      }  
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131296815) {
      q.b().d("request_permission_guide_click");
      if (this.w) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
          if (com.allinone.callerid.util.k1.a.g(getApplicationContext())) {
            Q();
          } else if (i >= 29) {
            try {
              RoleManager roleManager = (RoleManager)getSystemService(RoleManager.class);
              if (roleManager != null && roleManager.isRoleAvailable("android.app.role.DIALER")) {
                boolean bool = roleManager.isRoleHeld("android.app.role.DIALER");
                if (bool) {
                  if (d0.a)
                    d0.a("default_dialer", "This app is the default dialer app"); 
                  Q();
                } else {
                  if (d0.a)
                    d0.a("default_dialer", "This app isn't the default dialer app"); 
                  startActivityForResult(roleManager.createRequestRoleIntent("android.app.role.DIALER"), 999);
                } 
              } 
              q.b().d("first_request_default_dialer");
            } catch (Exception exception) {
              Q();
              exception.printStackTrace();
            } 
          } else {
            Intent intent = new Intent();
            this("android.telecom.action.CHANGE_DEFAULT_DIALER");
            intent.putExtra("android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME", getPackageName());
            startActivityForResult(intent, 999);
            q.b().d("first_request_default_dialer");
          } 
        } else {
          Q();
        } 
      } else {
        Q();
      } 
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      setContentView(2131492954);
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      Typeface typeface = g1.b();
      ((TextView)findViewById(2131298068)).setTypeface(typeface);
      ((TextView)findViewById(2131298070)).setTypeface(typeface);
      ((TextView)findViewById(2131298069)).setTypeface(typeface);
      ((TextView)findViewById(2131297830)).setTypeface(typeface);
      ((FrameLayout)findViewById(2131296815)).setOnClickListener(this);
      this.t = true;
      if (getIntent() != null && getIntent().getBooleanExtra("per_enable_notifi", false)) {
        this.w = true;
        ((NotificationManager)getSystemService("notification")).cancel(2019);
        q.b().d("request_permission_notifi_click");
      } 
      if (getIntent() != null && getIntent().getBooleanExtra("isShowDefault", false))
        this.w = true; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      if (System.currentTimeMillis() - this.x > 2000L) {
        Toast.makeText(getApplicationContext(), getResources().getString(2131755610), 0).show();
        this.x = System.currentTimeMillis();
      } else {
        q.b().d("request_permission_close");
        R(getApplicationContext());
        moveTaskToBack(true);
      } 
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onRestart() {
    super.onRestart();
    if (this.u) {
      this.u = false;
      this.v = true;
    } 
  }
  
  protected void onResume() {
    super.onResume();
    if (this.t) {
      q.b().d("request_permission_guide_show");
      this.t = false;
    } 
    if (this.v) {
      this.v = false;
      P();
    } 
  }
  
  class a implements com.allinone.callerid.util.k1.a.g {
    a(RequestPermissionActivity this$0) {}
    
    public void a() {
      if (d0.a)
        d0.a("wbb", "开启了权限"); 
      if (b1.n2().booleanValue() && i1.j()) {
        RequestPermissionActivity.N(this.a, true);
        q.b().d("permission_request_ziqi_show");
        (new h0()).b((Context)this.a);
      } else {
        RequestPermissionActivity.O(this.a);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/permission/RequestPermissionActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */