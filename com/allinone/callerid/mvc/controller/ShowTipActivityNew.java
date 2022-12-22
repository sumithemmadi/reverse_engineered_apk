package com.allinone.callerid.mvc.controller;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.permission.OverlayGuideActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class ShowTipActivityNew extends BaseActivity implements View.OnClickListener {
  private TextView A;
  
  private RelativeLayout B;
  
  private RelativeLayout C;
  
  private RelativeLayout D;
  
  private int E = 1;
  
  private Animation F;
  
  private Animation G;
  
  private Animation H;
  
  private RelativeLayout I;
  
  private CheckBox J;
  
  private ImageView K;
  
  private Animation L;
  
  private Animation M;
  
  private Animation N;
  
  private Animation O;
  
  private Animation P;
  
  private Animation Q;
  
  private Animation R;
  
  private Animation S;
  
  private Animation T;
  
  private Animation U;
  
  private Animation V;
  
  private Animation W;
  
  private RelativeLayout X;
  
  private RelativeLayout Y;
  
  private Handler Z = new Handler();
  
  private final String s = "ShowTipActivityNew";
  
  private ImageView t;
  
  private ImageView u;
  
  private TextView v;
  
  private ImageView w;
  
  private FrameLayout x;
  
  private LinearLayout y;
  
  private Animation z;
  
  private void s0() {
    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), 2130772044);
    this.Y.setAnimation(animation);
  }
  
  private void t0() {
    try {
      Handler handler = this.Z;
      l l = new l();
      this(this);
      handler.postDelayed(l, 300L);
      com.allinone.callerid.util.q.b().c("fake_call_per_tip");
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void u() {
    this.t = (ImageView)findViewById(2131296962);
    this.u = (ImageView)findViewById(2131296960);
    this.K = (ImageView)findViewById(2131296996);
    this.Y = (RelativeLayout)findViewById(2131297526);
    s0();
    this.B = (RelativeLayout)findViewById(2131297548);
    this.C = (RelativeLayout)findViewById(2131297549);
    this.D = (RelativeLayout)findViewById(2131297550);
    this.X = (RelativeLayout)findViewById(2131296827);
    this.w = (ImageView)findViewById(2131297016);
    this.x = (FrameLayout)findViewById(2131296761);
    this.y = (LinearLayout)findViewById(2131296822);
    TextView textView = (TextView)findViewById(2131298199);
    this.v = (TextView)findViewById(2131297993);
    this.A = (TextView)findViewById(2131297934);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("1234 ");
    stringBuilder.append(getResources().getString(2131755656));
    textView.setText(stringBuilder.toString());
    textView.setTypeface(g1.b());
    this.v.setTypeface(g1.b());
    this.A.setTypeface(g1.b());
    ((TextView)findViewById(2131298023)).setTypeface(g1.b());
    ((TextView)findViewById(2131298022)).setTypeface(g1.b());
    this.I = (RelativeLayout)findViewById(2131296742);
    CheckBox checkBox = (CheckBox)findViewById(2131296459);
    this.J = checkBox;
    checkBox.setTypeface(g1.b());
    this.J.setOnCheckedChangeListener(new m(this));
    this.x.setOnClickListener(this);
    Animation animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771989);
    animation2.setAnimationListener(new n(this));
    Animation animation1 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771996);
    this.z = animation1;
    animation1.setAnimationListener(new o(this));
    animation1 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771981);
    this.P = animation1;
    animation1.setAnimationListener(new p(this));
    animation1 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771981);
    this.S = animation1;
    animation1.setAnimationListener(new q(this));
    animation1 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771981);
    this.W = animation1;
    animation1.setAnimationListener(new r(this));
    animation1 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771981);
    this.Q = animation1;
    animation1.setAnimationListener(new s(this));
    animation1 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771980);
    this.R = animation1;
    animation1.setAnimationListener(new t(this));
    animation1 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130772000);
    this.V = animation1;
    animation1.setAnimationListener(new a(this));
    animation1 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771997);
    this.F = animation1;
    animation1.setAnimationListener(new b(this));
    this.t.startAnimation(animation2);
    animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771998);
    this.G = animation2;
    animation2.setAnimationListener(new c(this));
    animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771985);
    this.T = animation2;
    animation2.setAnimationListener(new d(this));
    animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771986);
    this.U = animation2;
    animation2.setAnimationListener(new e(this));
    animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771997);
    this.H = animation2;
    animation2.setAnimationListener(new f(this));
    animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130772003);
    this.L = animation2;
    animation2.setAnimationListener(new g(this));
    animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771982);
    this.M = animation2;
    animation2.setAnimationListener(new h(this));
    animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130772004);
    this.N = animation2;
    animation2.setAnimationListener(new i(this));
    animation2 = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771983);
    this.O = animation2;
    animation2.setAnimationListener(new j(this));
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131296761) {
      int i = this.E;
      if (i == 1) {
        com.allinone.callerid.util.q.b().c("fake_call_next1");
        this.x.startAnimation(this.F);
      } else if (i == 2) {
        com.allinone.callerid.util.q.b().c("fake_call_next2");
        this.x.startAnimation(this.H);
      } else if (i == 3) {
        com.allinone.callerid.util.q.b().c("fake_call_got_it");
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays((Context)EZCallApplication.c()) && this.J.isChecked())
          try {
            com.allinone.callerid.util.q.b().c("checkPermission_click");
            Intent intent = new Intent();
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("package:");
            stringBuilder.append(EZCallApplication.c().getPackageName());
            this("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuilder.toString()));
            intent.setFlags(268435456);
            startActivity(intent);
            t0();
          } catch (Exception exception) {
            exception.printStackTrace();
          }  
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492961);
    getWindow().getDecorView().post(new k(this));
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      if (this.E != 3)
        com.allinone.callerid.util.q.b().c("fake_call_close"); 
      finish();
      overridePendingTransition(2130771968, 2130771969);
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements Animation.AnimationListener {
    a(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.m0(this.a).setVisibility(4);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class b implements Animation.AnimationListener {
    b(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.p0(this.a).setVisibility(4);
      ShowTipActivityNew.q0(this.a).setVisibility(0);
      ShowTipActivityNew.q0(this.a).startAnimation(i1.p());
      ShowTipActivityNew.o0(this.a).startAnimation(ShowTipActivityNew.U(this.a));
      ShowTipActivityNew.P(this.a).startAnimation(ShowTipActivityNew.U(this.a));
      ShowTipActivityNew.m0(this.a).startAnimation(ShowTipActivityNew.V(this.a));
      ShowTipActivityNew.Q(this.a).startAnimation(ShowTipActivityNew.W(this.a));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class c implements Animation.AnimationListener {
    c(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.n0(this.a).postDelayed(new a(this), 1000L);
      ShowTipActivityNew.n0(this.a).postDelayed(new b(this), 2500L);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
    
    class a implements Runnable {
      a(ShowTipActivityNew.c this$0) {}
      
      public void run() {
        ShowTipActivityNew.m0(this.b.a).setVisibility(0);
        ShowTipActivityNew.m0(this.b.a).setText(this.b.a.getResources().getString(2131755737));
        ShowTipActivityNew.m0(this.b.a).setAnimation(i1.t());
      }
    }
    
    class b implements Runnable {
      b(ShowTipActivityNew.c this$0) {}
      
      public void run() {
        ShowTipActivityNew.o0(this.b.a).setVisibility(0);
        ShowTipActivityNew.o0(this.b.a).startAnimation(i1.p());
        ShowTipActivityNew.p0(this.b.a).setVisibility(0);
        ShowTipActivityNew.p0(this.b.a).setAnimation(i1.r());
        ShowTipActivityNew.X(this.b.a, 2);
      }
    }
  }
  
  class a implements Runnable {
    a(ShowTipActivityNew this$0) {}
    
    public void run() {
      ShowTipActivityNew.m0(this.b.a).setVisibility(0);
      ShowTipActivityNew.m0(this.b.a).setText(this.b.a.getResources().getString(2131755737));
      ShowTipActivityNew.m0(this.b.a).setAnimation(i1.t());
    }
  }
  
  class b implements Runnable {
    b(ShowTipActivityNew this$0) {}
    
    public void run() {
      ShowTipActivityNew.o0(this.b.a).setVisibility(0);
      ShowTipActivityNew.o0(this.b.a).startAnimation(i1.p());
      ShowTipActivityNew.p0(this.b.a).setVisibility(0);
      ShowTipActivityNew.p0(this.b.a).setAnimation(i1.r());
      ShowTipActivityNew.X(this.b.a, 2);
    }
  }
  
  class d implements Animation.AnimationListener {
    d(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.a0(this.a).startAnimation(ShowTipActivityNew.Y(this.a));
      ShowTipActivityNew.Z(this.a).startAnimation(ShowTipActivityNew.Y(this.a));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class e implements Animation.AnimationListener {
    e(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.Z(this.a).setVisibility(8);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class f implements Animation.AnimationListener {
    f(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.p0(this.a).setVisibility(4);
      ShowTipActivityNew.m0(this.a).startAnimation(ShowTipActivityNew.V(this.a));
      ShowTipActivityNew.P(this.a).setVisibility(0);
      ShowTipActivityNew.P(this.a).startAnimation(i1.p());
      ShowTipActivityNew.q0(this.a).startAnimation(ShowTipActivityNew.b0(this.a));
      ShowTipActivityNew.o0(this.a).startAnimation(ShowTipActivityNew.b0(this.a));
      ShowTipActivityNew.r0(this.a).startAnimation(ShowTipActivityNew.b0(this.a));
      ShowTipActivityNew.Q(this.a).startAnimation(ShowTipActivityNew.c0(this.a));
      ShowTipActivityNew.n0(this.a).postDelayed(new a(this), 1000L);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
    
    class a implements Runnable {
      a(ShowTipActivityNew.f this$0) {}
      
      public void run() {
        ShowTipActivityNew.Z(this.b.a).setVisibility(0);
        ShowTipActivityNew.Z(this.b.a).startAnimation(ShowTipActivityNew.d0(this.b.a));
      }
    }
  }
  
  class a implements Runnable {
    a(ShowTipActivityNew this$0) {}
    
    public void run() {
      ShowTipActivityNew.Z(this.b.a).setVisibility(0);
      ShowTipActivityNew.Z(this.b.a).startAnimation(ShowTipActivityNew.d0(this.b.a));
    }
  }
  
  class g implements Animation.AnimationListener {
    g(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.a0(this.a).startAnimation(ShowTipActivityNew.e0(this.a));
      ShowTipActivityNew.Z(this.a).startAnimation(ShowTipActivityNew.e0(this.a));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class h implements Animation.AnimationListener {
    h(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.a0(this.a).startAnimation(ShowTipActivityNew.f0(this.a));
      ShowTipActivityNew.Z(this.a).startAnimation(ShowTipActivityNew.f0(this.a));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class i implements Animation.AnimationListener {
    i(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.a0(this.a).startAnimation(ShowTipActivityNew.g0(this.a));
      ShowTipActivityNew.Z(this.a).startAnimation(ShowTipActivityNew.g0(this.a));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class j implements Animation.AnimationListener {
    j(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.X(this.a, 3);
      ShowTipActivityNew.Z(this.a).startAnimation(ShowTipActivityNew.h0(this.a));
      ShowTipActivityNew.o0(this.a).setVisibility(0);
      ShowTipActivityNew.o0(this.a).startAnimation(i1.p());
      ShowTipActivityNew.i0(this.a).setImageResource(2131231106);
      ShowTipActivityNew.j0(this.a).setText(this.a.getResources().getString(2131755797));
      ShowTipActivityNew.p0(this.a).setVisibility(0);
      ShowTipActivityNew.p0(this.a).setAnimation(i1.r());
      if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays((Context)EZCallApplication.c())) {
        com.allinone.callerid.util.q.b().c("fake_call_per_show");
        ShowTipActivityNew.k0(this.a).setVisibility(0);
        ShowTipActivityNew.k0(this.a).setAnimation(i1.t());
      } 
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class k implements Runnable {
    k(ShowTipActivityNew this$0) {}
    
    public void run() {
      ShowTipActivityNew.O(this.b);
    }
  }
  
  class l implements Runnable {
    l(ShowTipActivityNew this$0) {}
    
    public void run() {
      Intent intent = new Intent((Context)this.b, OverlayGuideActivity.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class m implements CompoundButton.OnCheckedChangeListener {
    m(ShowTipActivityNew this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (!param1Boolean)
        com.allinone.callerid.util.q.b().c("fake_call_per_close"); 
    }
  }
  
  class n implements Animation.AnimationListener {
    n(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.P(this.a).setVisibility(0);
      ShowTipActivityNew.P(this.a).startAnimation(i1.p());
      ShowTipActivityNew.a0(this.a).setVisibility(0);
      ShowTipActivityNew.a0(this.a).setAnimation(ShowTipActivityNew.l0(this.a));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class o implements Animation.AnimationListener {
    o(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.n0(this.a).postDelayed(new a(this), 1000L);
      ShowTipActivityNew.n0(this.a).postDelayed(new b(this), 2500L);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
    
    class a implements Runnable {
      a(ShowTipActivityNew.o this$0) {}
      
      public void run() {
        ShowTipActivityNew.m0(this.b.a).setVisibility(0);
        ShowTipActivityNew.m0(this.b.a).setAnimation(i1.t());
      }
    }
    
    class b implements Runnable {
      b(ShowTipActivityNew.o this$0) {}
      
      public void run() {
        ShowTipActivityNew.o0(this.b.a).setVisibility(0);
        ShowTipActivityNew.o0(this.b.a).startAnimation(i1.p());
        ShowTipActivityNew.p0(this.b.a).setVisibility(0);
        ShowTipActivityNew.p0(this.b.a).setAnimation(i1.r());
      }
    }
  }
  
  class a implements Runnable {
    a(ShowTipActivityNew this$0) {}
    
    public void run() {
      ShowTipActivityNew.m0(this.b.a).setVisibility(0);
      ShowTipActivityNew.m0(this.b.a).setAnimation(i1.t());
    }
  }
  
  class b implements Runnable {
    b(ShowTipActivityNew this$0) {}
    
    public void run() {
      ShowTipActivityNew.o0(this.b.a).setVisibility(0);
      ShowTipActivityNew.o0(this.b.a).startAnimation(i1.p());
      ShowTipActivityNew.p0(this.b.a).setVisibility(0);
      ShowTipActivityNew.p0(this.b.a).setAnimation(i1.r());
    }
  }
  
  class p implements Animation.AnimationListener {
    p(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.o0(this.a).setVisibility(8);
      ShowTipActivityNew.P(this.a).setVisibility(8);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class q implements Animation.AnimationListener {
    q(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.q0(this.a).setVisibility(8);
      ShowTipActivityNew.o0(this.a).setVisibility(8);
      ShowTipActivityNew.r0(this.a).setVisibility(8);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class r implements Animation.AnimationListener {
    r(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.Q(this.a).setImageResource(2131231207);
      ShowTipActivityNew.Q(this.a).startAnimation(i1.p());
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class s implements Animation.AnimationListener {
    s(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.Q(this.a).setImageResource(2131231070);
      ShowTipActivityNew.Q(this.a).startAnimation(ShowTipActivityNew.R(this.a));
      ShowTipActivityNew.r0(this.a).setVisibility(0);
      ShowTipActivityNew.r0(this.a).startAnimation(i1.p());
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class t implements Animation.AnimationListener {
    t(ShowTipActivityNew this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      ShowTipActivityNew.T(this.a).startAnimation(ShowTipActivityNew.S(this.a));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/ShowTipActivityNew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */