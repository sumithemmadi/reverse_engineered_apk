package com.allinone.callerid.mvc.controller.permission;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.allinone.callerid.main.BaseThemeActivity;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.util.Timer;
import java.util.TimerTask;

public class OverlayPerTipsActivity extends BaseThemeActivity implements View.OnClickListener {
  private final String s = "OverlayPerTipsActivity";
  
  private boolean t;
  
  private boolean u;
  
  private Handler v = new Handler();
  
  private Timer w;
  
  private TimerTask x;
  
  private void O() {
    Intent intent = new Intent();
    intent.setClass((Context)this, MainActivity.class);
    startActivity(intent);
    overridePendingTransition(2130771968, 2130771969);
    finish();
  }
  
  private void P() {
    try {
      boolean bool = com.allinone.callerid.util.k1.a.f();
      if (bool) {
        this.x.cancel();
        this.w.cancel();
        O();
        if (d0.a)
          d0.a("tony", "开启了"); 
        q.b().d("overlay_per_open");
      } else if (d0.a) {
        d0.a("tony", "未开启");
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void Q() {
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
      if (i == 2131296815)
        try {
          if (Build.VERSION.SDK_INT >= 23) {
            this.u = true;
            Q();
            Intent intent = new Intent();
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("package:");
            stringBuilder.append(getApplicationContext().getPackageName());
            this("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuilder.toString()));
            intent.setFlags(268435456);
            startActivity(intent);
            q.b().c("overlay_per_click");
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
    } else {
      try {
        O();
        q.b().d("overlay_per_not_now");
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492935);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    Typeface typeface = g1.b();
    ((TextView)findViewById(2131298070)).setTypeface(typeface);
    ((TextView)findViewById(2131297830)).setTypeface(typeface);
    ((TextView)findViewById(2131298014)).setTypeface(typeface);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296815);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296764);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    this.t = true;
    this.w = new Timer();
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      O();
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
    a(OverlayPerTipsActivity this$0) {}
    
    public void run() {
      OverlayPerTipsActivity.N(this.b);
    }
  }
  
  class b extends TimerTask {
    b(OverlayPerTipsActivity this$0) {}
    
    public void run() {
      OverlayPerTipsActivity.N(this.b);
    }
  }
  
  class c implements Runnable {
    c(OverlayPerTipsActivity this$0) {}
    
    public void run() {
      Intent intent = new Intent((Context)this.b, OverlayGuideActivity.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/permission/OverlayPerTipsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */