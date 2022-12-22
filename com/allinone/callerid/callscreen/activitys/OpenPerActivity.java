package com.allinone.callerid.callscreen.activitys;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.q;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;

public class OpenPerActivity extends BaseActivity implements View.OnClickListener {
  private ImageView A;
  
  private Typeface B;
  
  private RelativeLayout C;
  
  private RelativeLayout D;
  
  private RelativeLayout E;
  
  private RelativeLayout F;
  
  private boolean G = false;
  
  private boolean H;
  
  private boolean I;
  
  private Timer J;
  
  private TimerTask K;
  
  private HomeInfo L;
  
  private boolean M;
  
  private final String s = "OpenPerActivity";
  
  private FrameLayout t;
  
  private ImageView u;
  
  private FrameLayout v;
  
  private ImageView w;
  
  private FrameLayout x;
  
  private ImageView y;
  
  private FrameLayout z;
  
  private void T() {
    try {
      if (com.allinone.callerid.util.k1.a.a(getApplicationContext())) {
        HomeInfo homeInfo = this.L;
        if (homeInfo != null && homeInfo.isUnLock()) {
          Intent intent = new Intent();
          this((Context)this, CallScreenPdtActivity.class);
          intent.putExtra("homeinfo", (Serializable)this.L);
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
        } 
        q.b().c("callscreen_all_per_open");
        setResult(980);
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void U() {
    if (!com.allinone.callerid.util.k1.a.a(getApplicationContext())) {
      androidx.appcompat.app.a a = (new androidx.appcompat.app.a.a((Context)this)).q(getResources().getString(2131755601)).h(getResources().getString(2131755600)).n(getResources().getString(2131755382), new b(this)).j(getResources().getString(2131755432), new a(this)).a();
      a.show();
      a.g(-1).setTextColor(d1.a((Context)this, 2130968859, 2131099706));
      a.g(-2).setTextColor(getResources().getColor(2131099695));
      q.b().c("callscreen_leave_per");
    } else {
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  private void V() {
    this.L = (HomeInfo)getIntent().getSerializableExtra("homeinfo");
    this.M = getIntent().getBooleanExtra("is_diy", false);
    if (com.allinone.callerid.util.k1.a.h()) {
      this.C.setVisibility(8);
    } else {
      this.C.setVisibility(0);
    } 
    if (com.allinone.callerid.util.k1.a.e(getApplicationContext())) {
      this.D.setVisibility(8);
    } else {
      this.D.setVisibility(0);
    } 
    if (com.allinone.callerid.util.k1.a.i(getApplicationContext())) {
      this.E.setVisibility(8);
    } else {
      this.E.setVisibility(0);
    } 
    if (com.allinone.callerid.util.k1.a.f()) {
      this.F.setVisibility(8);
    } else {
      this.F.setVisibility(0);
    } 
  }
  
  private void W() {
    try {
      boolean bool = d0.a;
      if (bool)
        d0.a("callscreen", "judgeNotifiPer"); 
      if (com.allinone.callerid.util.k1.a.j()) {
        if (d0.a)
          d0.a("callscreen", "开启了"); 
        this.K.cancel();
        bool = com.allinone.callerid.util.k1.a.a(getApplicationContext());
        if (bool) {
          HomeInfo homeInfo = this.L;
          if (homeInfo != null)
            if (this.M) {
              if (homeInfo.isContacts_diy() || this.L.isDefautl_diy()) {
                Intent intent = new Intent();
                this((Context)this, ManageDiyActivity.class);
                startActivity(intent);
                overridePendingTransition(2130771968, 2130771969);
              } else {
                Intent intent = new Intent();
                this((Context)this, SelectVideoActivity.class);
                startActivity(intent);
                overridePendingTransition(2130771968, 2130771969);
              } 
            } else {
              Intent intent = new Intent();
              this((Context)this, CallScreenPdtActivity.class);
              intent.putExtra("homeinfo", (Serializable)this.L);
              startActivity(intent);
              overridePendingTransition(2130771968, 2130771969);
            }  
          q.b().c("callscreen_all_per_open");
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } else {
          Intent intent = new Intent();
          this();
          intent.setClass((Context)this, OpenPerActivity.class);
          HomeInfo homeInfo = this.L;
          if (homeInfo != null) {
            intent.putExtra("homeinfo", (Serializable)homeInfo);
            intent.putExtra("is_diy", this.M);
          } 
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void X() {
    try {
      if (com.allinone.callerid.util.k1.a.i(getApplicationContext())) {
        this.K.cancel();
        boolean bool = com.allinone.callerid.util.k1.a.a(getApplicationContext());
        if (bool) {
          HomeInfo homeInfo = this.L;
          if (homeInfo != null) {
            Intent intent;
            if (this.M) {
              if (homeInfo.isContacts_diy() || this.L.isDefautl_diy()) {
                intent = new Intent();
                this((Context)this, ManageDiyActivity.class);
                startActivity(intent);
                overridePendingTransition(2130771968, 2130771969);
              } else {
                intent = new Intent();
                this((Context)this, SelectVideoActivity.class);
                startActivity(intent);
                overridePendingTransition(2130771968, 2130771969);
              } 
            } else if (intent.isUnLock()) {
              intent = new Intent();
              this((Context)this, CallScreenPdtActivity.class);
              intent.putExtra("homeinfo", (Serializable)this.L);
              startActivity(intent);
              overridePendingTransition(2130771968, 2130771969);
            } 
          } 
          q.b().c("callscreen_all_per_open");
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } else {
          Intent intent = new Intent();
          this();
          intent.setClass((Context)this, OpenPerActivity.class);
          HomeInfo homeInfo = this.L;
          if (homeInfo != null) {
            intent.putExtra("homeinfo", (Serializable)homeInfo);
            intent.putExtra("is_diy", this.M);
          } 
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void u() {
    TextView textView1 = (TextView)findViewById(2131298040);
    TextView textView2 = (TextView)findViewById(2131298016);
    TextView textView3 = (TextView)findViewById(2131298018);
    this.t = (FrameLayout)findViewById(2131296788);
    TextView textView4 = (TextView)findViewById(2131298118);
    this.u = (ImageView)findViewById(2131297047);
    TextView textView5 = (TextView)findViewById(2131298103);
    TextView textView6 = (TextView)findViewById(2131298104);
    this.v = (FrameLayout)findViewById(2131296791);
    TextView textView7 = (TextView)findViewById(2131298121);
    this.w = (ImageView)findViewById(2131297050);
    TextView textView8 = (TextView)findViewById(2131298095);
    TextView textView9 = (TextView)findViewById(2131298096);
    this.x = (FrameLayout)findViewById(2131296790);
    TextView textView10 = (TextView)findViewById(2131298120);
    this.y = (ImageView)findViewById(2131297049);
    TextView textView11 = (TextView)findViewById(2131298035);
    TextView textView12 = (TextView)findViewById(2131298036);
    this.z = (FrameLayout)findViewById(2131296789);
    TextView textView13 = (TextView)findViewById(2131298119);
    this.A = (ImageView)findViewById(2131297048);
    ImageView imageView = (ImageView)findViewById(2131296968);
    this.C = (RelativeLayout)findViewById(2131297520);
    this.D = (RelativeLayout)findViewById(2131297534);
    this.E = (RelativeLayout)findViewById(2131297533);
    this.F = (RelativeLayout)findViewById(2131297523);
    imageView.setOnClickListener(this);
    this.t.setOnClickListener(this);
    this.v.setOnClickListener(this);
    this.x.setOnClickListener(this);
    this.z.setOnClickListener(this);
    textView1.setTypeface(this.B);
    textView2.setTypeface(this.B);
    textView3.setTypeface(this.B);
    textView4.setTypeface(this.B);
    textView5.setTypeface(this.B);
    textView6.setTypeface(this.B);
    textView7.setTypeface(this.B);
    textView8.setTypeface(this.B);
    textView9.setTypeface(this.B);
    textView10.setTypeface(this.B);
    textView11.setTypeface(this.B);
    textView12.setTypeface(this.B);
    textView13.setTypeface(this.B);
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296968) {
      switch (i) {
        default:
          return;
        case 2131296791:
          q.b().c("callscreen_sdcard_per_request");
          com.allinone.callerid.util.k1.a.p((Activity)this, new d(this));
        case 2131296790:
          try {
            q.b().c("callscreen_ringtone_per_request");
            com.allinone.callerid.util.k1.a.q(getApplicationContext());
            this.H = true;
            TimerTask timerTask = this.K;
            if (timerTask != null)
              timerTask.cancel(); 
            timerTask = new e();
            super(this);
            this.K = timerTask;
            this.J.schedule(timerTask, 0L, 500L);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        case 2131296789:
          com.allinone.callerid.util.k1.a.n(getApplicationContext());
          this.I = true;
        case 2131296788:
          break;
      } 
      try {
        q.b().c("callscreen_notifi_per_request");
        com.allinone.callerid.util.k1.b.c(getApplicationContext());
        this.G = true;
        TimerTask timerTask = this.K;
        if (timerTask != null)
          timerTask.cancel(); 
        timerTask = new c();
        super(this);
        this.K = timerTask;
        this.J.schedule(timerTask, 0L, 500L);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
    U();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492955);
    this.B = g1.b();
    u();
    V();
    q.b().c("callscreen_per_open");
    this.J = new Timer();
    if (d0.a)
      d0.a("callscreen", "onCreate"); 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      TimerTask timerTask = this.K;
      if (timerTask != null) {
        timerTask.cancel();
        this.K = null;
      } 
      Timer timer = this.J;
      if (timer != null) {
        timer.cancel();
        this.J = null;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      U();
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
      if (d0.a)
        d0.a("callscreen", "onResume"); 
      TimerTask timerTask = this.K;
      if (timerTask != null)
        timerTask.cancel(); 
      if (this.G) {
        this.G = false;
        if (com.allinone.callerid.util.k1.a.j()) {
          this.t.setVisibility(8);
          this.u.setVisibility(0);
          T();
          q.b().c("callscreen_notifi_per_open");
        } 
      } 
      if (this.H) {
        this.H = false;
        if (com.allinone.callerid.util.k1.a.i(getApplicationContext())) {
          this.x.setVisibility(8);
          this.y.setVisibility(0);
          T();
          q.b().c("callscreen_ringtone_per_open");
        } 
      } 
      if (this.I) {
        this.I = false;
        if (com.allinone.callerid.util.k1.a.f()) {
          this.z.setVisibility(8);
          this.A.setVisibility(0);
          T();
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DialogInterface.OnClickListener {
    a(OpenPerActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class b implements DialogInterface.OnClickListener {
    b(OpenPerActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class c extends TimerTask {
    c(OpenPerActivity this$0) {}
    
    public void run() {
      OpenPerActivity.O(this.b);
    }
  }
  
  class d implements com.allinone.callerid.util.k1.a.g {
    d(OpenPerActivity this$0) {}
    
    public void a() {
      OpenPerActivity.P(this.a).setVisibility(8);
      OpenPerActivity.Q(this.a).setVisibility(0);
      OpenPerActivity.R(this.a);
      q.b().c("callscreen_sdcard_per_open");
    }
  }
  
  class e extends TimerTask {
    e(OpenPerActivity this$0) {}
    
    public void run() {
      OpenPerActivity.S(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/OpenPerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */