package com.allinone.callerid.mvc.controller.permission;

import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.app.i;
import com.allinone.callerid.main.BaseThemeActivity;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.util.Timer;
import java.util.TimerTask;

public class OverlayPerActivity extends BaseThemeActivity implements View.OnClickListener {
  private final String s = "OverlayPerActivity";
  
  private boolean t;
  
  private boolean u;
  
  private Handler v = new Handler();
  
  private Timer w;
  
  private TimerTask x;
  
  private void N() {
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setMessage(getResources().getString(2131755096)).setTitle(getResources().getString(2131755307)).setPositiveButton(getResources().getString(2131755180), new e(this)).setNegativeButton(getResources().getString(2131755745), new d(this)).create();
    alertDialog.show();
    alertDialog.getButton(-1).setTextColor(getResources().getColor(2131099706));
    alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
  }
  
  private void R() {
    Intent intent = new Intent();
    intent.setClass((Context)this, MainActivity.class);
    startActivity(intent);
    overridePendingTransition(2130771968, 2130771969);
    finish();
  }
  
  private void S() {
    try {
      boolean bool = com.allinone.callerid.util.k1.a.f();
      if (bool) {
        this.x.cancel();
        this.w.cancel();
        if (d0.a)
          d0.a("tony", "开启了"); 
        Intent intent = new Intent();
        this();
        intent.setClass((Context)this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
        if (!i1.w0()) {
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } 
        q.b().d("overlay_per_open");
      } else if (d0.a) {
        d0.a("tony", "未开启");
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void T(Context paramContext) {
    try {
      if (!i1.q0()) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
          NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
          Intent intent = new Intent();
          this(paramContext, MainActivity.class);
          intent.putExtra("open_notifi_overlay", true);
          intent.addFlags(268435456);
          PendingIntent pendingIntent = PendingIntent.getActivity(paramContext, 1, intent, 134217728);
          i.e e = new i.e();
          this(paramContext, "Showcaller");
          e.j(paramContext.getResources().getString(2131755200)).k(paramContext.getResources().getString(2131755172)).i(pendingIntent).B(System.currentTimeMillis()).f(false).s(true);
          if (i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel();
            this("com.allinone.callerid_notfication_N", "Showcaller", 3);
            if (notificationManager != null) {
              notificationChannel.setShowBadge(false);
              notificationManager.createNotificationChannel(notificationChannel);
              e.g("com.allinone.callerid_notfication_N");
            } 
          } 
          try {
            paramContext.getDrawable(2131231332);
            e.v(2131231332);
            e.h(paramContext.getResources().getColor(2131099706));
            notificationManager.notify(201922, e.b());
          } catch (Exception exception) {
            return;
          } 
        } 
      } 
    } finally {
      paramContext = null;
    } 
  }
  
  private void U() {
    try {
      Handler handler = new Handler();
      this();
      c c = new c();
      this(this);
      handler.postDelayed(c, 500L);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296764) {
      if (i != 2131296815) {
        if (i == 2131298070) {
          startActivity(new Intent((Context)this, OverlayPerTipsActivity.class));
          overridePendingTransition(2130771968, 2130771969);
        } 
      } else {
        try {
          if (Build.VERSION.SDK_INT >= 23) {
            this.u = true;
            U();
            Intent intent = new Intent();
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("package:");
            stringBuilder.append(getApplicationContext().getPackageName());
            this("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuilder.toString()));
            intent.setFlags(268435456);
            startActivity(intent);
            q.b().d("overlay_per_click");
            TimerTask timerTask = this.x;
            if (timerTask != null)
              timerTask.cancel(); 
            timerTask = new b();
            super(this);
            this.x = timerTask;
            this.w.schedule(timerTask, 0L, 500L);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
    } else {
      N();
      q.b().d("overlay_per_not_now");
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492934);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    Typeface typeface = g1.b();
    ((TextView)findViewById(2131298068)).setTypeface(typeface);
    ((TextView)findViewById(2131297830)).setTypeface(typeface);
    ((TextView)findViewById(2131298014)).setTypeface(typeface);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296815);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296764);
    TextView textView = (TextView)findViewById(2131298070);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getResources().getString(2131755662));
    stringBuilder.append(" <font color=\"#0084FF\"><u>");
    stringBuilder.append(getResources().getString(2131755859));
    stringBuilder.append("</u></font>");
    textView.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
    textView.setTypeface(typeface);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    textView.setOnClickListener(this);
    this.t = true;
    this.w = new Timer();
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      T(getApplicationContext());
      R();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
    try {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("onResume_isRequest:");
        stringBuilder.append(this.u);
        d0.a("tony", stringBuilder.toString());
      } 
      if (this.t) {
        this.t = false;
        q.b().d("overlay_per_show");
      } 
      if (this.u) {
        this.u = false;
        Handler handler = this.v;
        a a = new a();
        this(this);
        handler.postDelayed(a, 500L);
        TimerTask timerTask = this.x;
        if (timerTask != null)
          timerTask.cancel(); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements Runnable {
    a(OverlayPerActivity this$0) {}
    
    public void run() {
      OverlayPerActivity.O(this.b);
    }
  }
  
  class b extends TimerTask {
    b(OverlayPerActivity this$0) {}
    
    public void run() {
      OverlayPerActivity.O(this.b);
    }
  }
  
  class c implements Runnable {
    c(OverlayPerActivity this$0) {}
    
    public void run() {
      Intent intent = new Intent((Context)this.b, OverlayGuideActivity.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  class d implements DialogInterface.OnClickListener {
    d(OverlayPerActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        OverlayPerActivity overlayPerActivity = this.b;
        OverlayPerActivity.P(overlayPerActivity, overlayPerActivity.getApplicationContext());
        OverlayPerActivity.Q(this.b);
        q.b().d("over_per_dialig_skip");
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class e implements DialogInterface.OnClickListener {
    e(OverlayPerActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      q.b().d("over_per_dialig_cancel");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/permission/OverlayPerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */