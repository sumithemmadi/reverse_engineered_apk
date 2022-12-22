package com.allinone.callerid.mvc.controller;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.role.RoleManager;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.bean.EZSimpleContact;
import com.allinone.callerid.callscreen.activitys.CallScreenSettingActivity;
import com.allinone.callerid.customview.AVLoadingIndicatorView;
import com.allinone.callerid.customview.DeletableEditText;
import com.allinone.callerid.g.e;
import com.allinone.callerid.inapputil.GoogleBillingUtil;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.CustomViewPager;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.main.LogActivity;
import com.allinone.callerid.mvc.controller.block.AddCustomNumActivity;
import com.allinone.callerid.mvc.controller.block.BlockManagerActivity;
import com.allinone.callerid.mvc.controller.block.MyBlockListActivity;
import com.allinone.callerid.mvc.controller.permission.OverlayGuideActivity;
import com.allinone.callerid.mvc.controller.recorder.RecorderActivity;
import com.allinone.callerid.receiver.DisturbNotifitcationReceiver;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.service.DaemonService;
import com.allinone.callerid.service.MyService;
import com.allinone.callerid.start.CommonSetting;
import com.allinone.callerid.start.DedicationActivity;
import com.allinone.callerid.start.StartActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.l0;
import com.allinone.callerid.util.r0;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends BaseActivity implements View.OnClickListener, e.s {
  private Intent A;
  
  private int A0;
  
  private com.allinone.callerid.dialog.d B;
  
  private int B0;
  
  private FrameLayout C;
  
  private int C0;
  
  private j0 D;
  
  private int D0;
  
  private FrameLayout E;
  
  private int E0;
  
  private ImageView F;
  
  private int F0;
  
  private ImageView G;
  
  private int G0;
  
  private Animation H;
  
  private LayoutInflater H0;
  
  private FrameLayout I;
  
  private long I0;
  
  private boolean J = true;
  
  private FrameLayout J0;
  
  private r0 K;
  
  private ImageView K0;
  
  private long L;
  
  private TextView L0;
  
  private int M = 0;
  
  private int M0;
  
  private boolean N = false;
  
  private int N0;
  
  private FloatingActionButton O;
  
  private Typeface O0;
  
  private boolean P;
  
  private Animation P0;
  
  private TextView Q;
  
  private com.google.android.gms.ads.d Q0;
  
  private TextView R;
  
  private boolean R0 = false;
  
  private ConstraintLayout S;
  
  private boolean S0 = true;
  
  private GoogleBillingUtil T;
  
  private float T0 = 48.0F;
  
  private String U = "$1.99";
  
  private Handler U0 = new i0((Activity)this, null);
  
  private String V = "$12.99";
  
  private ImageView W;
  
  private DisturbNotifitcationReceiver X;
  
  private boolean Y;
  
  private ImageView Z;
  
  private PopupWindow a0;
  
  private e b0;
  
  private TextView c0;
  
  private TextView d0;
  
  private TextView e0;
  
  private TextView f0;
  
  private ImageView g0;
  
  private ImageView h0;
  
  private ImageView i0;
  
  private ImageView j0;
  
  private View k0;
  
  private FloatingActionMenu l0;
  
  private PopupWindow m0;
  
  private TextView n0;
  
  private TextView o0;
  
  private ImageView p0;
  
  private Handler q0 = new Handler();
  
  private ImageView r0;
  
  private CustomViewPager s;
  
  private boolean s0;
  
  private ImageView t;
  
  private String t0;
  
  private AVLoadingIndicatorView u;
  
  private boolean u0;
  
  private View v;
  
  private AppBarLayout v0;
  
  private DrawerLayout w;
  
  private int w0;
  
  private TextView x;
  
  private int x0;
  
  private TextView y;
  
  private int y0;
  
  private TextView z;
  
  private int z0;
  
  private void O() {
    if (b1.Q())
      this.G.setVisibility(0); 
    if (!this.N) {
      this.E.setVisibility(8);
    } else {
      this.E.setVisibility(0);
    } 
    this.y.setText(i1.W((Context)this));
    this.y.setOnClickListener(this);
    this.x.setTypeface(this.O0);
    this.y.setTypeface(this.O0);
    this.z.setTypeface(this.O0);
    if (com.allinone.callerid.util.recorder.b.d()) {
      this.W.setVisibility(8);
    } else {
      this.W.setVisibility(0);
    } 
  }
  
  private void T0() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext()) && this.l0.s())
      this.l0.u(true); 
  }
  
  private void U0(String paramString) {
    try {
      if (!isFinishing()) {
        AlertDialog.Builder builder2 = new AlertDialog.Builder();
        this((Context)this);
        builder2 = builder2.setTitle(getResources().getString(2131755261));
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(getResources().getString(2131755260));
        stringBuilder.append(" ");
        stringBuilder.append(paramString);
        stringBuilder.append("?");
        builder2 = builder2.setMessage(stringBuilder.toString());
        String str = getResources().getString(2131755870);
        a a = new a();
        this(this, paramString);
        AlertDialog.Builder builder1 = builder2.setPositiveButton(str, a);
        str = getResources().getString(2131755520);
        h0 h0 = new h0();
        this(this);
        AlertDialog alertDialog = builder1.setNegativeButton(str, h0).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(this.G0);
        alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void V0() {
    (com.allinone.callerid.util.j0.a()).b.execute(new g0(this));
  }
  
  private void W0() {
    GoogleBillingUtil.s(true);
    this.T = GoogleBillingUtil.p().k((Activity)this, new k0(null)).l((Activity)this);
  }
  
  private void X0() {
    try {
      View view = this.H0.inflate(2131493147, null);
      TextView textView = (TextView)view.findViewById(2131298113);
      FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296784);
      textView.setTypeface(g1.b());
      frameLayout.setOnClickListener(this);
      PopupWindow popupWindow = new PopupWindow();
      this(view);
      this.m0 = popupWindow;
      int i = getWindowManager().getDefaultDisplay().getWidth();
      this.m0.setWidth(i / 4);
      this.m0.setHeight(-2);
      this.m0.setFocusable(true);
      this.m0.setAnimationStyle(2131821305);
      ColorDrawable colorDrawable = new ColorDrawable();
      this(0);
      this.m0.setBackgroundDrawable((Drawable)colorDrawable);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void Z0() {
    g1();
  }
  
  private void a1() {
    try {
      View view = this.H0.inflate(2131493149, null);
      TextView textView1 = (TextView)view.findViewById(2131297911);
      TextView textView2 = (TextView)view.findViewById(2131297913);
      TextView textView3 = (TextView)view.findViewById(2131297915);
      TextView textView4 = (TextView)view.findViewById(2131297914);
      TextView textView5 = (TextView)view.findViewById(2131297912);
      FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296745);
      FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296747);
      FrameLayout frameLayout3 = (FrameLayout)view.findViewById(2131296749);
      FrameLayout frameLayout4 = (FrameLayout)view.findViewById(2131296748);
      FrameLayout frameLayout5 = (FrameLayout)view.findViewById(2131296746);
      textView1.setTypeface(g1.b());
      textView2.setTypeface(g1.b());
      textView3.setTypeface(g1.b());
      textView4.setTypeface(g1.b());
      textView5.setTypeface(g1.b());
      frameLayout1.setOnClickListener(this);
      frameLayout2.setOnClickListener(this);
      frameLayout3.setOnClickListener(this);
      frameLayout4.setOnClickListener(this);
      frameLayout5.setOnClickListener(this);
      PopupWindow popupWindow = new PopupWindow();
      this(view);
      this.a0 = popupWindow;
      popupWindow.setHeight(-2);
      this.a0.setWidth(-2);
      this.a0.setFocusable(true);
      if (i1.f0(getApplicationContext()).booleanValue()) {
        this.a0.setAnimationStyle(2131821306);
      } else {
        this.a0.setAnimationStyle(2131821305);
      } 
      ColorDrawable colorDrawable = new ColorDrawable();
      this(0);
    } finally {
      Exception exception = null;
    } 
  }
  
  private void b1() {
    com.allinone.callerid.util.z z = new com.allinone.callerid.util.z();
    if (i1.r0((Context)this)) {
      z.c(new v(this));
      z.b(getApplicationContext());
    } 
  }
  
  private void c1() {
    try {
      this.H0 = LayoutInflater.from((Context)this);
      this.w0 = d1.b((Context)this, 2130969829, 2131231110);
      this.x0 = d1.b((Context)this, 2130969827, 2131231431);
      this.y0 = d1.b((Context)this, 2130969828, 2131231140);
      this.z0 = d1.b((Context)this, 2130969826, 2131231368);
      this.A0 = d1.b((Context)this, 2130969833, 2131231111);
      this.B0 = d1.b((Context)this, 2130969831, 2131231433);
      this.C0 = d1.b((Context)this, 2130969832, 2131231141);
      this.D0 = d1.b((Context)this, 2130969830, 2131231366);
      this.E0 = d1.a((Context)this, 2130968898, 2131099706);
      this.F0 = d1.a((Context)this, 2130968899, 2131099934);
      this.G0 = d1.a((Context)this, 2130968859, 2131099706);
      this.P0 = AnimationUtils.loadAnimation(getApplicationContext(), 2130772044);
      Typeface typeface = g1.a();
      this.O0 = g1.b();
      this.Z = (ImageView)findViewById(2131297626);
      this.v0 = (AppBarLayout)findViewById(2131296350);
      this.Z.setOnClickListener(this);
      this.C = (FrameLayout)findViewById(2131297506);
      this.t = (ImageView)findViewById(2131297588);
      ImageView imageView = (ImageView)findViewById(2131297038);
      this.p0 = imageView;
      imageView.setOnClickListener(this);
      this.t.setOnClickListener(this);
      this.u = (AVLoadingIndicatorView)findViewById(2131296366);
      ((ImageView)findViewById(2131296849)).setOnClickListener(this);
      this.v = findViewById(2131297241);
      this.w = (DrawerLayout)findViewById(2131296637);
      TextView textView1 = (TextView)findViewById(2131297741);
      textView1.setOnClickListener(this);
      textView1.setTypeface(typeface);
      CustomViewPager customViewPager2 = (CustomViewPager)findViewById(2131297243);
      this.s = customViewPager2;
      customViewPager2.setOffscreenPageLimit(2);
      ((FrameLayout)findViewById(2131297627)).setOnClickListener(this);
      ((FrameLayout)findViewById(2131296716)).setOnClickListener(this);
      ((FrameLayout)findViewById(2131297589)).setOnClickListener(this);
      ((FrameLayout)findViewById(2131296548)).setOnClickListener(this);
      FrameLayout frameLayout2 = (FrameLayout)findViewById(2131297430);
      int i = Build.VERSION.SDK_INT;
      if (i >= 28)
        frameLayout2.setVisibility(8); 
      this.W = (ImageView)findViewById(2131297433);
      frameLayout2.setOnClickListener(this);
      frameLayout2 = (FrameLayout)findViewById(2131296796);
      this.I = frameLayout2;
      frameLayout2.setOnClickListener(this);
      this.G = (ImageView)findViewById(2131297033);
      this.x = (TextView)findViewById(2131296460);
      this.y = (TextView)findViewById(2131296461);
      this.z = (TextView)findViewById(2131298135);
      this.F = (ImageView)findViewById(2131297017);
      LinearLayout linearLayout1 = (LinearLayout)findViewById(2131297204);
      this.E = (FrameLayout)findViewById(2131296710);
      this.S = (ConstraintLayout)findViewById(2131297181);
      LinearLayout linearLayout2 = (LinearLayout)findViewById(2131297180);
      LinearLayout linearLayout3 = (LinearLayout)findViewById(2131297160);
      linearLayout2.setOnClickListener(this);
      linearLayout3.setOnClickListener(this);
      this.Q = (TextView)findViewById(2131297932);
      this.R = (TextView)findViewById(2131297823);
      this.G = (ImageView)findViewById(2131297033);
      this.k0 = findViewById(2131298244);
      this.E.setOnClickListener(this);
      ((TextView)findViewById(2131298124)).setTypeface(typeface);
      ((TextView)findViewById(2131298122)).setTypeface(typeface);
      ((TextView)findViewById(2131298058)).setTypeface(typeface);
      ((TextView)findViewById(2131297807)).setTypeface(typeface);
      this.n0 = (TextView)findViewById(2131297780);
      this.o0 = (TextView)findViewById(2131298152);
      this.n0.setTypeface(typeface);
      this.o0.setTypeface(typeface);
      ((TextView)findViewById(2131297881)).setTypeface(typeface);
      ((TextView)findViewById(2131297931)).setTypeface(typeface);
      ((TextView)findViewById(2131297822)).setTypeface(typeface);
      this.J0 = (FrameLayout)findViewById(2131296801);
      this.K0 = (ImageView)findViewById(2131297079);
      TextView textView2 = (TextView)findViewById(2131298179);
      this.L0 = textView2;
      textView2.setTypeface(typeface);
      this.J0.setOnClickListener(this);
      if (b1.A2() == 1) {
        this.K0.setImageResource(2131231069);
        this.L0.setText(getResources().getString(2131755136));
      } else {
        this.K0.setImageResource(2131231092);
        this.L0.setText(getResources().getString(2131755274));
      } 
      if (this.P && i >= 17)
        linearLayout1.setBackgroundResource(2131231346); 
      FrameLayout frameLayout5 = (FrameLayout)findViewById(2131296723);
      this.c0 = (TextView)findViewById(2131297840);
      FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296724);
      this.d0 = (TextView)findViewById(2131297841);
      FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296730);
      this.e0 = (TextView)findViewById(2131297864);
      FrameLayout frameLayout4 = (FrameLayout)findViewById(2131296717);
      this.f0 = (TextView)findViewById(2131297810);
      this.g0 = (ImageView)findViewById(2131296902);
      this.h0 = (ImageView)findViewById(2131296903);
      this.i0 = (ImageView)findViewById(2131296905);
      this.j0 = (ImageView)findViewById(2131296898);
      this.r0 = (ImageView)findViewById(2131296995);
      this.c0.setTypeface(typeface);
      this.d0.setTypeface(typeface);
      this.e0.setTypeface(typeface);
      this.f0.setTypeface(typeface);
      frameLayout5.setOnClickListener(this);
      frameLayout1.setOnClickListener(this);
      frameLayout3.setOnClickListener(this);
      frameLayout4.setOnClickListener(this);
      FloatingActionMenu floatingActionMenu1 = (FloatingActionMenu)findViewById(2131297697);
      this.l0 = floatingActionMenu1;
      floatingActionMenu1.setContentDescription(getResources().getString(2131755077));
      this.l0.setClosedOnTouchOutside(true);
      FloatingActionButton floatingActionButton6 = (FloatingActionButton)findViewById(2131296693);
      FloatingActionButton floatingActionButton5 = (FloatingActionButton)findViewById(2131296695);
      FloatingActionButton floatingActionButton2 = (FloatingActionButton)findViewById(2131296694);
      FloatingActionButton floatingActionButton4 = (FloatingActionButton)findViewById(2131296692);
      floatingActionButton6.setOnClickListener(this);
      floatingActionButton5.setOnClickListener(this);
      floatingActionButton2.setOnClickListener(this);
      floatingActionButton4.setOnClickListener(this);
      floatingActionButton6.setLabelTextType(this.O0);
      floatingActionButton5.setLabelTextType(this.O0);
      floatingActionButton2.setLabelTextType(this.O0);
      floatingActionButton4.setLabelTextType(this.O0);
      this.l0.setMenuButtonShowAnimation(AnimationUtils.loadAnimation(getApplicationContext(), 2130772045));
      this.l0.setMenuButtonHideAnimation(AnimationUtils.loadAnimation(getApplicationContext(), 2130772033));
      FloatingActionMenu floatingActionMenu2 = this.l0;
      l l = new l();
      this(this);
      floatingActionMenu2.setOnMenuToggleListener(l);
      FloatingActionButton floatingActionButton1 = (FloatingActionButton)findViewById(2131296823);
      this.O = floatingActionButton1;
      floatingActionButton1.setShowAnimation(AnimationUtils.loadAnimation(getApplicationContext(), 2130772045));
      this.O.setHideAnimation(AnimationUtils.loadAnimation(getApplicationContext(), 2130772033));
      this.M0 = d1.b((Context)this, 2130969323, 2131231299);
      this.N0 = d1.b((Context)this, 2130969145, 2131231055);
      FloatingActionButton floatingActionButton3 = this.O;
      b0 b0 = new b0();
      this(this);
      floatingActionButton3.setOnClickListener(b0);
      CustomViewPager customViewPager1 = this.s;
      c0 c0 = new c0();
      this(this);
      customViewPager1.c(c0);
      com.allinone.callerid.b.n n = new com.allinone.callerid.b.n();
      this(s());
      e e1 = new e();
      this();
      this.b0 = e1;
      com.allinone.callerid.g.d d1 = new com.allinone.callerid.g.d();
      this();
      n.y((Fragment)this.b0, getString(2131755819));
      com.allinone.callerid.g.c c = new com.allinone.callerid.g.c();
      this();
      n.y((Fragment)c, getString(2131755735));
      if (com.allinone.callerid.d.f.f.h())
        n.y((Fragment)d1, getString(2131755167)); 
      com.allinone.callerid.g.b b = new com.allinone.callerid.g.b();
      this();
      n.y((Fragment)b, getString(2131755114));
      this.s.setAdapter((androidx.viewpager.widget.a)n);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void d1() {
    getWindow().getDecorView().post(new d0(this));
  }
  
  private void e1() {
    boolean bool1;
    boolean bool = b1.o2().booleanValue();
    long l = b1.C();
    if (l != 0L && System.currentTimeMillis() - l > 86400000L) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    l = b1.k0();
    int i = b1.w0();
    if (com.allinone.callerid.util.d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("isCanShow:");
      stringBuilder.append(bool);
      stringBuilder.append("oldtime:");
      stringBuilder.append(l);
      stringBuilder.append("counts:");
      stringBuilder.append(i);
      com.allinone.callerid.util.d0.a("tony", stringBuilder.toString());
    } 
    if (bool && bool1 && System.currentTimeMillis() > l && i >= 1) {
      t1();
      b1.Q1(System.currentTimeMillis() + 172800000L);
    } 
  }
  
  private void f1() {
    com.allinone.callerid.i.a.o.c.b(new u(this));
  }
  
  private void g1() {
    this.H = AnimationUtils.loadAnimation((Context)this, 2130772044);
    this.w.a(new e0(this));
    if (getIntent().getBooleanExtra("shortcutcontacts", false)) {
      com.allinone.callerid.util.q.b().c("shortcut_contacts");
      CustomViewPager customViewPager = this.s;
      if (customViewPager != null)
        customViewPager.setCurrentItem(1); 
      n1();
    } else {
      CustomViewPager customViewPager = this.s;
      if (customViewPager != null)
        customViewPager.setCurrentItem(0); 
      l1();
    } 
    if (getIntent().getBooleanExtra("is_callscreen", false)) {
      CustomViewPager customViewPager = this.s;
      if (customViewPager != null) {
        com.allinone.callerid.d.f.a.e = true;
        customViewPager.setCurrentItem(2);
      } 
    } 
    if (getIntent() != null && "open_offline".equals(getIntent().getStringExtra("offline_notifi"))) {
      if (com.allinone.callerid.util.d0.a)
        com.allinone.callerid.util.d0.a("fcm", "open_offline"); 
      CustomViewPager customViewPager = this.s;
      if (customViewPager != null)
        customViewPager.setCurrentItem(3); 
      com.allinone.callerid.util.q.b().c("fcm_open_notifi");
    } 
    this.D = new j0(this);
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("com.allinone.callerid.CLOSE_AD");
    intentFilter.addAction("com.allinone.callerid.SET_SHORTCUT");
    intentFilter.addAction("com.allinone.callerid.IDENTIFY_NUMBER");
    b.p.a.a.b(getApplicationContext()).c(this.D, intentFilter);
    i1();
    this.K = new r0((Context)this);
    r1();
    this.X = new DisturbNotifitcationReceiver();
    b.p.a.a.b((Context)this).c((BroadcastReceiver)this.X, new IntentFilter("com.allinone.callerid.DISTURB_NOTIFICATION_TUENOFF"));
    try {
      ClipboardManager clipboardManager = (ClipboardManager)getSystemService("clipboard");
      if (clipboardManager != null) {
        f0 f0 = new f0();
        this(this, clipboardManager);
        clipboardManager.addPrimaryClipChangedListener(f0);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    a1();
    X0();
    i1.F0((Activity)this);
    boolean bool = i1.j0((Context)this);
    this.N = bool;
    if (bool) {
      GoogleBillingUtil.I(null, new String[] { "showcaller_removeads_month", "showcaller_removeads_year" });
      W0();
    } 
    O();
    V0();
  }
  
  private void h1() {
    com.google.android.gms.ads.d.a a = new com.google.android.gms.ads.d.a(getApplicationContext(), "ca-app-pub-5825926894918682/4484122459");
    a.e(new b(this));
    com.google.android.gms.ads.u u = (new com.google.android.gms.ads.u.a()).b(true).a();
    a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
    com.google.android.gms.ads.d d1 = a.f(new c(this)).a();
    this.Q0 = d1;
    d1.b((new com.google.android.gms.ads.e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
  }
  
  private void i1() {
    if (androidx.core.content.a.a(getApplicationContext(), "android.permission.READ_CONTACTS") == 0) {
      com.allinone.callerid.e.a a = new com.allinone.callerid.e.a((Context)this, this.U0);
      getContentResolver().registerContentObserver(ContactsContract.RawContacts.CONTENT_URI, true, (ContentObserver)a);
    } 
  }
  
  private void j1(String paramString1, String paramString2, boolean paramBoolean) {
    if (paramString2 != null) {
      try {
        if (!"".equals(paramString2)) {
          z z = new z();
          this(this, paramString2, paramString1, paramBoolean);
          com.allinone.callerid.i.a.e.b.b(paramString2, z);
          return;
        } 
        Toast.makeText(getApplicationContext(), getResources().getString(2131755420), 0).show();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return;
    } 
    Toast.makeText(getApplicationContext(), getResources().getString(2131755420), 0).show();
  }
  
  private void k1() {
    this.g0.setImageResource(this.A0);
    this.h0.setImageResource(this.B0);
    this.i0.setImageResource(this.C0);
    this.j0.setImageResource(this.z0);
    this.c0.setTextColor(this.F0);
    this.d0.setTextColor(this.F0);
    this.e0.setTextColor(this.F0);
    this.f0.setTextColor(this.E0);
  }
  
  private void l1() {
    this.g0.setImageResource(this.w0);
    this.h0.setImageResource(this.B0);
    this.i0.setImageResource(this.C0);
    this.j0.setImageResource(this.D0);
    this.c0.setTextColor(this.E0);
    this.d0.setTextColor(this.F0);
    this.e0.setTextColor(this.F0);
    this.f0.setTextColor(this.F0);
  }
  
  private void m1() {
    if (com.allinone.callerid.util.d0.a)
      com.allinone.callerid.util.d0.a("callscreen", "selectCallscreen"); 
    com.allinone.callerid.util.q.b().c("callscreen_list_show");
    if (!com.allinone.callerid.util.e.b(getApplicationContext()))
      com.allinone.callerid.util.q.b().c("callscreen_list_no_network"); 
    this.g0.setImageResource(this.A0);
    this.h0.setImageResource(this.x0);
    this.i0.setImageResource(this.C0);
    this.j0.setImageResource(this.D0);
    this.c0.setTextColor(this.F0);
    this.d0.setTextColor(this.E0);
    this.e0.setTextColor(this.F0);
    this.f0.setTextColor(this.F0);
    com.allinone.callerid.d.f.f.x(false);
  }
  
  private void n1() {
    this.g0.setImageResource(this.A0);
    this.h0.setImageResource(this.B0);
    this.i0.setImageResource(this.y0);
    this.j0.setImageResource(this.D0);
    this.c0.setTextColor(this.F0);
    this.d0.setTextColor(this.F0);
    this.e0.setTextColor(this.E0);
    this.f0.setTextColor(this.F0);
  }
  
  private void o1() {
    com.allinone.callerid.dialog.m.h((Activity)this, new y(this));
  }
  
  private void p1() {
    com.allinone.callerid.dialog.m.g((Activity)this, new a0(this));
  }
  
  private void q1() {
    try {
      if (!isFinishing()) {
        View view = this.H0.inflate(2131493205, null);
        DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
        DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
        deletableEditText1.setHint(2131755120);
        deletableEditText2.setTypeface(this.O0);
        deletableEditText2.setHint(2131755123);
        AlertDialog.Builder builder2 = new AlertDialog.Builder();
        this((Context)this);
        builder2 = builder2.setMessage(getResources().getString(2131755077)).setView(view);
        String str1 = getResources().getString(2131755681);
        x x = new x();
        this(this, deletableEditText2, deletableEditText1);
        AlertDialog.Builder builder1 = builder2.setPositiveButton(str1, x);
        String str2 = getResources().getString(2131755180);
        w w = new w();
        this(this);
        AlertDialog alertDialog = builder1.setNegativeButton(str2, w).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(this.G0);
        alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void r1() {
    if (Build.VERSION.SDK_INT >= 25)
      com.allinone.callerid.i.a.s.c.b((Context)this, this.K); 
  }
  
  private void s1(boolean paramBoolean) {
    if (this.P)
      this.T0 = -48.0F; 
    if (paramBoolean) {
      if (!this.S0)
        com.allinone.callerid.customview.e.d.h(new View[] { (View)this.Z }).d().k(new float[] { this.T0, 0.0F }).a(new View[] { (View)this.C }).d().k(new float[] { this.T0, 0.0F }).a(new View[] { (View)this.p0 }).d().k(new float[] { this.T0, 0.0F }).c().j(300L).l(new p(this)).n(); 
    } else if (this.S0) {
      com.allinone.callerid.customview.e.d.h(new View[] { (View)this.Z }).d().k(new float[] { 0.0F, this.T0 }).a(new View[] { (View)this.C }).d().k(new float[] { 0.0F, this.T0 }).a(new View[] { (View)this.p0 }).d().k(new float[] { 0.0F, this.T0 }).c().j(300L).l(new q(this)).n();
    } 
  }
  
  private void t1() {
    startActivity(new Intent((Context)this, ShareActivity.class));
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void l() {
    this.C.setVisibility(0);
    this.u.setVisibility(0);
    com.allinone.callerid.i.a.d.a.a(new k(this));
    Z0();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.allinone.callerid.util.d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onActivityResult(");
      stringBuilder.append(paramInt1);
      stringBuilder.append(",");
      stringBuilder.append(paramInt2);
      stringBuilder.append(",");
      stringBuilder.append(paramIntent);
      stringBuilder.append(")");
      com.allinone.callerid.util.d0.a("inappbilling", stringBuilder.toString());
    } 
    if (paramInt1 == 666 && paramInt2 == 777 && this.N && b1.g()) {
      (new com.allinone.callerid.dialog.h((Context)this, 2131820783, (FragmentActivity)this, this.U, this.V, this.T, this.u0, this.t0, this.I0, true)).show();
      b1.K0(false);
    } 
  }
  
  public void onClick(View paramView) {
    PopupWindow popupWindow5;
    e e4;
    PopupWindow popupWindow4;
    e e3;
    PopupWindow popupWindow3;
    e e2;
    PopupWindow popupWindow2;
    e e1;
    PopupWindow popupWindow1;
    CustomViewPager customViewPager1;
    Intent intent;
    CustomViewPager customViewPager2;
    Window window;
    switch (paramView.getId()) {
      default:
        return;
      case 2131297741:
        if (com.allinone.callerid.util.d0.a)
          com.allinone.callerid.util.d0.a("tony", "main_cardview"); 
        try {
          Intent intent1 = new Intent();
          this();
          intent1.setClass((Context)this, EZSearchNumberActivity.class);
          startActivityForResult(intent1, 666);
          overridePendingTransition(2130771968, 2130771969);
        } catch (Exception null) {
          exception.printStackTrace();
        } 
      case 2131297627:
        com.allinone.callerid.util.q.b().c("share");
        try {
          this.w.d(8388611);
          com.allinone.callerid.dialog.n n = new com.allinone.callerid.dialog.n();
          this((Context)this, 2131820783, getResources().getString(2131755731), getResources().getString(2131755727), getResources().getString(2131755728), 0, null);
          n.setCanceledOnTouchOutside(false);
          n.show();
          Window window1 = n.getWindow();
          WindowManager.LayoutParams layoutParams = window1.getAttributes();
          window1.setGravity(80);
          WindowManager windowManager = (WindowManager)getApplicationContext().getApplicationContext().getSystemService("window");
          int i = windowManager.getDefaultDisplay().getWidth();
          int j = windowManager.getDefaultDisplay().getHeight();
          layoutParams.width = i;
          layoutParams.height = j / 2;
          window1.setAttributes(layoutParams);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        this.G.setVisibility(8);
      case 2131297626:
        customViewPager2 = this.s;
        if (customViewPager2 != null) {
          int i = customViewPager2.getCurrentItem();
          if (i != 0) {
            if (i == 2) {
              if (this.m0 == null)
                X0(); 
              if (this.m0 != null)
                if (i1.f0(getApplicationContext()).booleanValue()) {
                  this.m0.showAtLocation((View)exception, 8388659, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
                } else {
                  this.m0.showAtLocation((View)exception, 8388661, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
                }  
            } 
          } else {
            if (this.a0 == null)
              a1(); 
            if (this.a0 != null)
              if (i1.f0(getApplicationContext()).booleanValue()) {
                this.a0.showAtLocation((View)exception, 8388659, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
              } else {
                this.a0.showAtLocation((View)exception, 8388661, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
              }  
          } 
        } 
      case 2131297589:
        this.w.d(8388611);
        this.q0.postDelayed(new f(this), 100L);
      case 2131297588:
        com.allinone.callerid.util.q.b().c("main_liwuhe");
        if (this.B == null) {
          com.allinone.callerid.dialog.d d1 = new com.allinone.callerid.dialog.d((Context)this, 2131820783);
          this.B = d1;
          d1.setCanceledOnTouchOutside(true);
          this.B.setOnDismissListener(new m(this));
        } 
        this.B.show();
        window = this.B.getWindow();
        if (window != null) {
          WindowManager.LayoutParams layoutParams = window.getAttributes();
          window.setGravity(17);
          WindowManager windowManager = (WindowManager)getSystemService("window");
          if (windowManager != null) {
            layoutParams.width = windowManager.getDefaultDisplay().getWidth();
            window.setAttributes(layoutParams);
          } 
        } 
      case 2131297430:
        this.w.d(8388611);
        this.q0.postDelayed(new d(this), 100L);
        if (this.W.getVisibility() == 0) {
          com.allinone.callerid.util.recorder.b.m(true);
          this.W.setVisibility(8);
        } 
        com.allinone.callerid.util.q.b().c("recorder_home_sideslip_click");
      case 2131297180:
        startActivity(new Intent((Context)this, IdentifiedActivity.class));
        overridePendingTransition(2130771968, 2130771969);
        this.q0.postDelayed(new i(this), 100L);
      case 2131297160:
        startActivity(new Intent((Context)this, BlockManagerActivity.class));
        overridePendingTransition(2130771968, 2130771969);
        this.q0.postDelayed(new j(this), 100L);
      case 2131297038:
        if (com.allinone.callerid.util.d0.a)
          com.allinone.callerid.util.d0.a("tony", "main_cardview"); 
        try {
          Intent intent1 = new Intent();
          this();
          intent1.setClass((Context)this, EZSearchNumberActivity.class);
          startActivityForResult(intent1, 666);
          overridePendingTransition(2130771968, 2130771969);
        } catch (Exception exception1) {
          exception1.printStackTrace();
        } 
      case 2131296849:
        if (this.w.C(8388613))
          this.w.d(8388613); 
        if (this.w.C(8388611)) {
          this.w.d(8388611);
        } else {
          this.w.J(8388611);
        } 
      case 2131296801:
        if (b1.A2() == 0) {
          b1.T2(1);
        } else {
          b1.T2(0);
        } 
        this.J0.postDelayed(new g(this), 350L);
      case 2131296796:
        startActivity(new Intent((Context)this, LogActivity.class));
        overridePendingTransition(2130771968, 2130771969);
        this.w.d(8388611);
      case 2131296784:
        popupWindow5 = this.m0;
        if (popupWindow5 != null)
          popupWindow5.dismiss(); 
        try {
          Intent intent1 = new Intent();
          this();
          intent1.setClass((Context)this, CallScreenSettingActivity.class);
          startActivity(intent1);
          overridePendingTransition(2130771968, 2130771969);
        } catch (Exception exception1) {
          exception1.printStackTrace();
        } 
      case 2131296749:
        e4 = this.b0;
        if (e4 != null) {
          e4.y0 = 2;
          e4.X2();
        } 
        popupWindow4 = this.a0;
        if (popupWindow4 != null)
          popupWindow4.dismiss(); 
      case 2131296748:
        e3 = this.b0;
        if (e3 != null) {
          e3.y0 = 3;
          e3.X2();
        } 
        popupWindow3 = this.a0;
        if (popupWindow3 != null)
          popupWindow3.dismiss(); 
      case 2131296747:
        e2 = this.b0;
        if (e2 != null) {
          e2.y0 = 1;
          e2.X2();
        } 
        popupWindow2 = this.a0;
        if (popupWindow2 != null)
          popupWindow2.dismiss(); 
      case 2131296746:
        this.a0.dismiss();
        try {
          int i = Build.VERSION.SDK_INT;
          if (i >= 23) {
            if (com.allinone.callerid.util.k1.a.g((Context)EZCallApplication.c())) {
              e e5 = this.b0;
              if (e5 != null)
                e5.S2(); 
            } else if (i >= 29) {
              try {
                RoleManager roleManager = (RoleManager)getSystemService(RoleManager.class);
                if (roleManager != null && roleManager.isRoleAvailable("android.app.role.DIALER")) {
                  boolean bool = roleManager.isRoleHeld("android.app.role.DIALER");
                  if (bool) {
                    if (com.allinone.callerid.util.d0.a)
                      com.allinone.callerid.util.d0.a("default_dialer", "This app is the default dialer app"); 
                    this.b0.S2();
                  } else {
                    if (com.allinone.callerid.util.d0.a)
                      com.allinone.callerid.util.d0.a("default_dialer", "This app isn't the default dialer app"); 
                    startActivityForResult(roleManager.createRequestRoleIntent("android.app.role.DIALER"), 999);
                  } 
                } 
                com.allinone.callerid.util.q.b().c("delete_request_default_dialer");
              } catch (Exception exception1) {
                this.b0.S2();
                exception1.printStackTrace();
              } 
            } else {
              Intent intent1 = new Intent();
              this("android.telecom.action.CHANGE_DEFAULT_DIALER");
              intent1.putExtra("android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME", i1.M((Context)EZCallApplication.c()));
              startActivityForResult(intent1, 999);
              com.allinone.callerid.util.q.b().c("delete_request_default_dialer");
            } 
          } else {
            this.b0.S2();
          } 
        } catch (Exception exception1) {
          exception1.printStackTrace();
        } 
      case 2131296745:
        e1 = this.b0;
        if (e1 != null) {
          e1.y0 = 0;
          e1.X2();
        } 
        popupWindow1 = this.a0;
        if (popupWindow1 != null)
          popupWindow1.dismiss(); 
      case 2131296730:
        customViewPager1 = this.s;
        if (customViewPager1 != null)
          customViewPager1.setCurrentItem(1); 
      case 2131296724:
        customViewPager1 = this.s;
        if (customViewPager1 != null)
          customViewPager1.setCurrentItem(2); 
      case 2131296723:
        customViewPager1 = this.s;
        if (customViewPager1 != null)
          customViewPager1.setCurrentItem(0); 
        l1();
      case 2131296717:
        customViewPager1 = this.s;
        if (customViewPager1 != null)
          customViewPager1.setCurrentItem(3); 
      case 2131296716:
        this.w.d(8388611);
        this.q0.postDelayed(new e(this), 100L);
      case 2131296710:
        try {
          com.allinone.callerid.dialog.h h = new com.allinone.callerid.dialog.h();
          this((Context)this, 2131820783, (FragmentActivity)this, this.U, this.V, this.T, this.u0, this.t0, this.I0, false);
          h.show();
          this.w.d(8388611);
        } catch (Exception exception1) {
          exception1.printStackTrace();
        } 
      case 2131296695:
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
          p1();
          if (this.l0.s())
            this.l0.u(true); 
        } else {
          com.allinone.callerid.util.k1.a.o((Activity)this, new n(this));
        } 
      case 2131296694:
        if (com.allinone.callerid.util.k1.a.c(getApplicationContext())) {
          if (this.l0.s())
            this.l0.u(true); 
          o1();
        } else {
          com.allinone.callerid.util.k1.a.k((Activity)this, new o(this));
        } 
      case 2131296693:
        if (this.l0.s())
          this.l0.u(true); 
        q1();
      case 2131296692:
        if (this.l0.s())
          this.l0.u(true); 
        intent = new Intent();
        com.allinone.callerid.util.q.b().c(h1.q);
        intent.setClass((Context)this, AddCustomNumActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131296548:
        this.w.d(8388611);
        this.q0.postDelayed(new h(this), 100L);
      case 2131296461:
        break;
    } 
    long l1 = SystemClock.uptimeMillis();
    long l2 = this.L;
    this.L = l1;
    if (l1 - l2 < 600L) {
      int i = this.M + 1;
      this.M = i;
      if (4 == i) {
        if (this.J) {
          this.I.setVisibility(0);
          this.J = false;
        } 
        this.I.setVisibility(8);
        this.J = true;
      } 
    } 
    this.M = 0;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    if (b1.z0()) {
      int i = paramConfiguration.uiMode & 0x30;
      if (i != 16) {
        if (i == 32) {
          if (com.allinone.callerid.util.d0.a)
            com.allinone.callerid.util.d0.a("tony", "Night mode is active, we're using dark theme"); 
          b1.T2(1);
        } 
      } else {
        if (com.allinone.callerid.util.d0.a)
          com.allinone.callerid.util.d0.a("tony", "Night mode is not active, we're using the light theme"); 
        b1.T2(0);
      } 
      i1.a = true;
      finish();
      EZCallApplication.c().e();
      startActivity(new Intent((Context)this, StartActivity.class));
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      setContentView(2131492929);
      d1();
      if (com.allinone.callerid.util.d0.a)
        com.allinone.callerid.util.d0.a("fcm", "main_onCreate"); 
    } finally {
      paramBundle = null;
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      if (this.D != null)
        b.p.a.a.b(getApplicationContext()).e(this.D); 
      if (this.X != null)
        b.p.a.a.b((Context)this).e((BroadcastReceiver)this.X); 
      GoogleBillingUtil googleBillingUtil = this.T;
      if (googleBillingUtil != null)
        googleBillingUtil.x((Activity)this); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4)
      try {
        if (!this.Y && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays((Context)EZCallApplication.c())) {
          this.Y = true;
          com.allinone.callerid.dialog.g g = new com.allinone.callerid.dialog.g();
          this((Context)this, 2131820783);
          g.setCanceledOnTouchOutside(false);
          g.show();
          com.allinone.callerid.util.q.b().c("over_per_first_show");
        } else {
          this.Y = false;
          Intent intent = new Intent();
          this("android.intent.action.MAIN");
          intent.setFlags(268435456);
          intent.addCategory("android.intent.category.HOME");
          startActivity(intent);
        } 
        return true;
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    try {
      boolean bool = com.allinone.callerid.util.d0.a;
      if (bool)
        com.allinone.callerid.util.d0.a("fcm", "mian_onNewIntent"); 
      if (paramIntent != null) {
        if (paramIntent.getExtras() != null)
          for (String str : paramIntent.getExtras().keySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(str);
            stringBuilder.append("--");
            stringBuilder.append(paramIntent.getExtras().get(str));
            com.allinone.callerid.util.d0.a("fcm", stringBuilder.toString());
          }  
        if (paramIntent.getBooleanExtra("is_callscreen", false)) {
          CustomViewPager customViewPager = this.s;
          if (customViewPager != null) {
            com.allinone.callerid.d.f.a.e = true;
            customViewPager.setCurrentItem(2);
          } 
        } 
        if (paramIntent.getBooleanExtra("shortcutcontacts", false)) {
          com.allinone.callerid.util.q.b().c("shortcut_contacts");
          CustomViewPager customViewPager = this.s;
          if (customViewPager != null)
            customViewPager.setCurrentItem(1); 
        } 
        if (paramIntent.getBooleanExtra("launchapp", false)) {
          com.allinone.callerid.util.q.b().c("wakeapp_noti_click");
          b1.s1(true);
        } 
        if (paramIntent.getBooleanExtra("open_notifi_overlay", false)) {
          Intent intent = new Intent();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("package:");
          stringBuilder.append(getApplicationContext().getPackageName());
          this("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuilder.toString()));
          intent.setFlags(268435456);
          startActivity(intent);
          Handler handler1 = this.q0;
          r r = new r();
          this(this);
          handler1.postDelayed(r, 500L);
        } 
        this.A = paramIntent;
        if (com.allinone.callerid.util.d0.a)
          com.allinone.callerid.util.d0.a("shortcut", "onNewIntent"); 
        Handler handler = this.q0;
        s s1 = new s();
        this(this);
        handler.postDelayed(s1, 800L);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onRestart() {
    super.onRestart();
    i1.b = false;
    if (com.allinone.callerid.util.d0.a)
      com.allinone.callerid.util.d0.a("fcm", "main_onRestart"); 
  }
  
  public void onResume() {
    super.onResume();
    try {
      if ((com.allinone.callerid.util.gg.f.a()).b != null && System.currentTimeMillis() - b1.x() > 3000000L) {
        t t = new t();
        this(this);
        com.allinone.callerid.i.a.d.a.a(t);
      } 
      boolean bool = com.allinone.callerid.util.d0.a;
      if (bool)
        com.allinone.callerid.util.d0.a("tony", "onResume"); 
      if (com.allinone.callerid.util.d0.a)
        com.allinone.callerid.util.d0.a("fcm", "main_onResume"); 
      if (i1.b) {
        if (com.allinone.callerid.util.d0.a)
          com.allinone.callerid.util.d0.a("tony", "isShowShare"); 
        e1();
      } 
      i1.b = true;
      if (Build.VERSION.SDK_INT >= 23 && Settings.canDrawOverlays(getApplicationContext())) {
        NotificationManager notificationManager = (NotificationManager)getSystemService("notification");
        if (notificationManager != null)
          notificationManager.cancel(201922); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onStart() {
    super.onStart();
    if (com.allinone.callerid.util.d0.a)
      com.allinone.callerid.util.d0.a("fcm", "main_onStart"); 
  }
  
  public void onStop() {
    super.onStop();
    if (com.allinone.callerid.util.d0.a)
      com.allinone.callerid.util.d0.a("fcm", "main_onStop"); 
  }
  
  class a implements DialogInterface.OnClickListener {
    a(MainActivity this$0, String param1String) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      Intent intent = new Intent((Context)EZCallApplication.c(), EZSearchNumberActivity.class);
      intent.putExtra("searchnumber", this.b);
      this.c.startActivity(intent);
    }
  }
  
  class a0 implements com.allinone.callerid.i.a.f.b {
    a0(MainActivity this$0) {}
    
    public void a(CallLogBean param1CallLogBean) {
      try {
        View view = MainActivity.M0(this.a).inflate(2131493205, null);
        DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
        DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
        deletableEditText1.setHint(2131755120);
        deletableEditText2.setTypeface(MainActivity.N0(this.a));
        deletableEditText2.setHint(2131755123);
        deletableEditText1.setText(param1CallLogBean.n());
        deletableEditText2.setText(param1CallLogBean.p());
        deletableEditText2.setSelection(deletableEditText2.getText().length());
        AlertDialog.Builder builder2 = new AlertDialog.Builder();
        this((Context)this.a);
        AlertDialog.Builder builder3 = builder2.setMessage(this.a.getResources().getString(2131755077)).setView(view);
        String str2 = this.a.getResources().getString(2131755681);
        b b1 = new b();
        this(this, deletableEditText2, deletableEditText1);
        AlertDialog.Builder builder1 = builder3.setPositiveButton(str2, b1);
        String str1 = this.a.getResources().getString(2131755180);
        a a = new a();
        this(this);
        AlertDialog alertDialog = builder1.setNegativeButton(str1, a).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(MainActivity.O0(this.a));
        alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(MainActivity.a0 this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(MainActivity.a0 this$0, DeletableEditText param2DeletableEditText1, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str2 = this.b.getText().toString();
          String str1 = this.c.getText().toString();
          MainActivity.L0(this.d.a, str1, str2, true);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(MainActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(MainActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str2 = this.b.getText().toString();
        String str1 = this.c.getText().toString();
        MainActivity.L0(this.d.a, str1, str2, true);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b implements com.google.android.gms.ads.formats.g.a {
    b(MainActivity this$0) {}
    
    public void r(com.google.android.gms.ads.formats.g param1g) {
      MainActivity.p0(this.b).setVisibility(0);
      MainActivity.Q(this.b).startAnimation(MainActivity.m0(this.b));
      (com.allinone.callerid.util.gg.f.a()).b = param1g;
      b1.b1(System.currentTimeMillis());
    }
  }
  
  class b0 implements View.OnClickListener {
    b0(MainActivity this$0) {}
    
    public void onClick(View param1View) {
      if (MainActivity.K0(this.b).getCurrentItem() == 0) {
        Intent intent = new Intent();
        intent.setClass((Context)this.b, EZDialerActivity.class);
        this.b.startActivity(intent);
        this.b.overridePendingTransition(2130771970, 2130771977);
        com.allinone.callerid.util.q.b().c("dial_buttom");
      } else {
        try {
          Intent intent = new Intent();
          this("android.intent.action.INSERT");
          intent.setType("vnd.android.cursor.dir/person");
          intent.setType("vnd.android.cursor.dir/contact");
          intent.setType("vnd.android.cursor.dir/raw_contact");
          intent.putExtra("phone_type", 2);
          this.b.startActivity(intent);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        com.allinone.callerid.util.q.b().c("button_add_contact");
      } 
    }
  }
  
  class c extends com.google.android.gms.ads.b {
    c(MainActivity this$0) {}
    
    public void D(int param1Int) {
      super.D(param1Int);
      if (com.allinone.callerid.util.d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gift--onAdFailedToLoad:");
        stringBuilder.append(param1Int);
        com.allinone.callerid.util.d0.a("AdLoaded", stringBuilder.toString());
      } 
      MainActivity.Q(this.a).setVisibility(8);
      MainActivity.c0(this.a).setVisibility(8);
      MainActivity.p0(this.a).setVisibility(8);
    }
    
    public void J() {
      super.J();
      if (com.allinone.callerid.util.d0.a)
        com.allinone.callerid.util.d0.a("AdLoaded", "gift--onAdLoaded"); 
      MainActivity.c0(this.a).setVisibility(8);
      MainActivity.o0(this.a, true);
    }
    
    public void K() {
      super.K();
      if (MainActivity.q0(this.a) != null)
        MainActivity.q0(this.a).dismiss(); 
    }
  }
  
  class c0 implements ViewPager.i {
    c0(MainActivity this$0) {}
    
    public void a(int param1Int1, float param1Float, int param1Int2) {}
    
    public void c(int param1Int) {}
    
    public void d(int param1Int) {
      if (param1Int != 0) {
        if (param1Int != 1) {
          if (param1Int != 2) {
            if (param1Int == 3)
              try {
                MainActivity.P0(this.b).setVisibility(0);
                MainActivity.Q0(this.b).setVisibility(0);
                MainActivity.R0(this.b, false);
                MainActivity.R(this.b).setVisibility(8);
                MainActivity.X(this.b);
              } catch (Exception exception) {
                exception.printStackTrace();
              }  
          } else {
            try {
              MainActivity.P0(this.b).setVisibility(8);
              MainActivity.Q0(this.b).setVisibility(8);
              MainActivity.R0(this.b, true);
              MainActivity.R(this.b).setVisibility(8);
              MainActivity.V(this.b);
              MainActivity.W(this.b).setVisibility(8);
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
        } else {
          try {
            MainActivity.P0(this.b).setVisibility(0);
            MainActivity.Q0(this.b).setVisibility(8);
            MainActivity.R0(this.b, false);
            MainActivity.R(this.b).setImageResource(MainActivity.T(this.b));
            MainActivity.R(this.b).setContentDescription(this.b.getResources().getString(2131755081));
            MainActivity.R(this.b).setVisibility(0);
            MainActivity.U(this.b);
          } catch (android.content.res.Resources.NotFoundException notFoundException) {
            notFoundException.printStackTrace();
          } 
        } 
      } else {
        try {
          MainActivity.P0(this.b).setVisibility(0);
          MainActivity.Q0(this.b).setVisibility(8);
          MainActivity.R0(this.b, true);
          MainActivity.R(this.b).setImageResource(MainActivity.S0(this.b));
          MainActivity.R(this.b).setContentDescription(this.b.getResources().getString(2131755736));
          MainActivity.R(this.b).setVisibility(0);
          MainActivity.S(this.b);
        } catch (android.content.res.Resources.NotFoundException notFoundException) {
          notFoundException.printStackTrace();
        } 
      } 
    }
  }
  
  class d implements Runnable {
    d(MainActivity this$0) {}
    
    public void run() {
      Intent intent = new Intent((Context)this.b, RecorderActivity.class);
      this.b.startActivity(intent);
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class d0 implements Runnable {
    d0(MainActivity this$0) {}
    
    public void run() {
      MainActivity mainActivity = this.b;
      MainActivity.Z(mainActivity, i1.f0((Context)mainActivity).booleanValue());
      if (MainActivity.Y(this.b) && Build.VERSION.SDK_INT >= 17)
        this.b.getWindow().getDecorView().setLayoutDirection(1); 
      MainActivity.a0(this.b);
      com.google.android.gms.ads.n.a((Context)this.b, new a(this));
      int i = Build.VERSION.SDK_INT;
      if (i > 20) {
        if (i > 25) {
          Intent intent = new Intent(this.b.getApplicationContext(), MyService.class);
          this.b.getApplicationContext().bindService(intent, new b(this), 1);
          intent = new Intent("com.allinone.callerid.CHANGE_NOTIFI");
          b.p.a.a.b(this.b.getApplicationContext()).d(intent);
        } else {
          this.b.startService(new Intent(this.b.getApplicationContext(), MyService.class));
        } 
      } else {
        this.b.startService(new Intent(this.b.getApplicationContext(), DaemonService.class));
      } 
      MainActivity.b0(this.b);
      l0.g();
      (com.allinone.callerid.util.j0.a()).b.execute(new c(this));
    }
    
    class a implements com.google.android.gms.ads.initialization.b {
      a(MainActivity.d0 this$0) {}
      
      public void a(com.google.android.gms.ads.initialization.a param2a) {}
    }
    
    class b implements ServiceConnection {
      b(MainActivity.d0 this$0) {}
      
      public void onServiceConnected(ComponentName param2ComponentName, IBinder param2IBinder) {
        if (param2IBinder instanceof com.allinone.callerid.service.a) {
          MyService myService = ((com.allinone.callerid.service.a)param2IBinder).a();
          if (myService != null)
            myService.a(); 
        } 
        this.a.b.getApplicationContext().unbindService(this);
      }
      
      public void onServiceDisconnected(ComponentName param2ComponentName) {}
    }
    
    class c implements Runnable {
      c(MainActivity.d0 this$0) {}
      
      public void run() {
        b1.D1(System.currentTimeMillis());
        b1.i2("3");
        MainActivity.d0(this.b.b);
        MainActivity.f0(this.b.b, com.allinone.callerid.d.f.f.l());
        this.b.b.runOnUiThread(new a(this));
      }
      
      class a implements Runnable {
        a(MainActivity.d0.c this$0) {}
        
        public void run() {
          if (MainActivity.e0(this.b.b.b))
            MainActivity.W(this.b.b.b).setVisibility(0); 
        }
      }
    }
    
    class a implements Runnable {
      a(MainActivity.d0 this$0) {}
      
      public void run() {
        if (MainActivity.e0(this.b.b.b))
          MainActivity.W(this.b.b.b).setVisibility(0); 
      }
    }
  }
  
  class a implements com.google.android.gms.ads.initialization.b {
    a(MainActivity this$0) {}
    
    public void a(com.google.android.gms.ads.initialization.a param1a) {}
  }
  
  class b implements ServiceConnection {
    b(MainActivity this$0) {}
    
    public void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      if (param1IBinder instanceof com.allinone.callerid.service.a) {
        MyService myService = ((com.allinone.callerid.service.a)param1IBinder).a();
        if (myService != null)
          myService.a(); 
      } 
      this.a.b.getApplicationContext().unbindService(this);
    }
    
    public void onServiceDisconnected(ComponentName param1ComponentName) {}
  }
  
  class c implements Runnable {
    c(MainActivity this$0) {}
    
    public void run() {
      b1.D1(System.currentTimeMillis());
      b1.i2("3");
      MainActivity.d0(this.b.b);
      MainActivity.f0(this.b.b, com.allinone.callerid.d.f.f.l());
      this.b.b.runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(MainActivity.d0.c this$0) {}
      
      public void run() {
        if (MainActivity.e0(this.b.b.b))
          MainActivity.W(this.b.b.b).setVisibility(0); 
      }
    }
  }
  
  class a implements Runnable {
    a(MainActivity this$0) {}
    
    public void run() {
      if (MainActivity.e0(this.b.b.b))
        MainActivity.W(this.b.b.b).setVisibility(0); 
    }
  }
  
  class e implements Runnable {
    e(MainActivity this$0) {}
    
    public void run() {
      Intent intent = new Intent((Context)this.b, MyBlockListActivity.class);
      this.b.startActivity(intent);
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class e0 implements DrawerLayout.d {
    e0(MainActivity this$0) {}
    
    public void a(View param1View) {
      try {
        InputMethodManager inputMethodManager = (InputMethodManager)param1View.getContext().getSystemService("input_method");
        if (inputMethodManager != null)
          inputMethodManager.hideSoftInputFromWindow(param1View.getWindowToken(), 0); 
        MainActivity.i0(this.a).setVisibility(8);
        if (b1.Q()) {
          MainActivity.k0(this.a).startAnimation(MainActivity.j0(this.a));
          b1.v1(false);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void b(View param1View) {}
    
    public void c(int param1Int) {}
    
    public void d(View param1View, float param1Float) {
      if (param1View == MainActivity.g0(this.a))
        MainActivity.h0(this.a).C(8388611); 
    }
  }
  
  class f implements Runnable {
    f(MainActivity this$0) {}
    
    public void run() {
      Intent intent = new Intent();
      intent.setClass((Context)this.b, CommonSetting.class);
      this.b.startActivity(intent);
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class f0 implements ClipboardManager.OnPrimaryClipChangedListener {
    f0(MainActivity this$0, ClipboardManager param1ClipboardManager) {}
    
    public void onPrimaryClipChanged() {
      try {
        if (this.a.hasPrimaryClip()) {
          ClipData clipData = this.a.getPrimaryClip();
          if (clipData != null && clipData.getItemCount() > 0) {
            String str = clipData.getItemAt(0).getText().toString();
            if (!"".equals(str)) {
              str = str.replace(" ", "").replace("-", "");
              if (str.matches("[0-9]+") && b1.l0()) {
                b1.S1(true);
                com.allinone.callerid.i.a.s.b.c(str, (Context)this.b);
              } 
              if (str.startsWith("+") && str.substring(1, str.length()).matches("[0-9]+") && b1.l0()) {
                b1.S1(true);
                com.allinone.callerid.i.a.s.b.c(str, (Context)this.b);
              } 
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements Runnable {
    g(MainActivity this$0) {}
    
    public void run() {
      this.b.finish();
      EZCallApplication.c().e();
      this.b.startActivity(new Intent((Context)this.b, MainActivity.class));
    }
  }
  
  class g0 implements Runnable {
    g0(MainActivity this$0) {}
    
    public void run() {
      try {
        boolean bool = b1.m0();
        if (bool)
          try {
            ClipboardManager clipboardManager = (ClipboardManager)EZCallApplication.c().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
              ClipData clipData = clipboardManager.getPrimaryClip();
              if (clipData != null && clipData.getItemCount() > 0) {
                String str = clipData.getItemAt(0).getText().toString();
                if (!"".equals(str)) {
                  str = str.replace(" ", "").replace("-", "");
                  if (str.matches("[0-9]+") && b1.l0()) {
                    MainActivity mainActivity = this.b;
                    a a = new a();
                    this(this, str);
                    mainActivity.runOnUiThread(a);
                    b1.S1(false);
                  } 
                  if (str.startsWith("+") && str.substring(1, str.length()).matches("[0-9]+") && b1.l0()) {
                    MainActivity mainActivity = this.b;
                    b b = new b();
                    this(this, str);
                    mainActivity.runOnUiThread(b);
                    b1.S1(false);
                  } 
                } 
              } 
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          }  
        b1.T0(i1.W(this.b.getApplicationContext()));
        com.allinone.callerid.i.a.s.b.a(this.b.getApplicationContext());
        com.allinone.callerid.l.a.f.k(this.b.getApplicationContext());
        if (b1.s()) {
          Context context = this.b.getApplicationContext();
          c c = new c();
          this(this);
          com.allinone.callerid.i.a.h.d.a(context, c);
        } 
        if (b1.f()) {
          long l1 = b1.C();
          long l2 = System.currentTimeMillis();
          Date date2 = new Date();
          this(l1);
          Date date1 = new Date();
          this(l2);
          if (com.allinone.callerid.util.i.s(date2, date1, "GMT-8:00"))
            i1.E0(this.b.getApplicationContext(), i1.X(l1)); 
        } 
        if (b1.t()) {
          Context context = this.b.getApplicationContext();
          d d = new d();
          this(this);
          com.allinone.callerid.i.a.h.d.a(context, d);
        } 
        if (!"".equals(com.allinone.callerid.util.recorder.b.b())) {
          AtomicBoolean atomicBoolean = new AtomicBoolean();
          this();
          if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            try {
              String str = com.allinone.callerid.util.recorder.b.b();
              if (str != null && !"".equals(str)) {
                double d1 = Double.parseDouble(str);
                long l = System.currentTimeMillis();
                double d2 = l;
                Double.isNaN(d2);
                l = (long)(d2 - d1 * 24.0D * 60.0D * 60.0D * 1000.0D);
                if (com.allinone.callerid.util.d0.a) {
                  StringBuilder stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("lodtime: ");
                  stringBuilder.append(l);
                  com.allinone.callerid.util.d0.a("recorder", stringBuilder.toString());
                } 
                com.allinone.callerid.f.k.b.d().b(l);
              } 
              atomicBoolean.set(false);
            } catch (Exception exception) {
              exception.printStackTrace();
              atomicBoolean.set(false);
            } finally {
              Exception exception;
            } 
          } 
        } 
        if (com.allinone.callerid.c.b.c.a()) {
          int i = com.allinone.callerid.c.b.c.c();
          if (i == 2) {
            if (System.currentTimeMillis() - com.allinone.callerid.c.b.c.e() > 86400000L)
              com.allinone.callerid.c.a.a.a(this.b.getApplicationContext()); 
          } else if (i == 3) {
            if (System.currentTimeMillis() - com.allinone.callerid.c.b.c.e() > 604800000L)
              com.allinone.callerid.c.a.a.a(this.b.getApplicationContext()); 
          } else if (i == 4 && System.currentTimeMillis() - com.allinone.callerid.c.b.c.e() > -1702967296L) {
            com.allinone.callerid.c.a.a.a(this.b.getApplicationContext());
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements Runnable {
      a(MainActivity.g0 this$0, String param2String) {}
      
      public void run() {
        MainActivity.l0(this.c.b, this.b);
      }
    }
    
    class b implements Runnable {
      b(MainActivity.g0 this$0, String param2String) {}
      
      public void run() {
        MainActivity.l0(this.c.b, this.b);
      }
    }
    
    class c implements com.allinone.callerid.i.a.h.e {
      c(MainActivity.g0 this$0) {}
      
      public void a(long param2Long) {
        if (param2Long != 0L) {
          long l = b1.U();
          if (com.allinone.callerid.util.d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("最新通话记录时间:");
            stringBuilder.append(com.allinone.callerid.util.i.d(param2Long));
            com.allinone.callerid.util.d0.a("tony", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("保存的最新通话记录时间:");
            stringBuilder.append(com.allinone.callerid.util.i.d(l));
            com.allinone.callerid.util.d0.a("tony", stringBuilder.toString());
          } 
          if (l != 0L && l != param2Long) {
            b1.W0(false);
            b1.J0(false);
            com.allinone.callerid.util.q.b().c("not_alive");
            com.allinone.callerid.util.q.b().h();
            com.allinone.callerid.util.r.a();
            if (b1.C() != 0L) {
              if (com.allinone.callerid.util.i.r(new Date(System.currentTimeMillis()), new Date(b1.C()))) {
                com.allinone.callerid.util.q.b().c("not_alive_current_day_date");
                com.allinone.callerid.util.q.b().i();
                com.allinone.callerid.util.r.b();
              } 
              param2Long = System.currentTimeMillis() - b1.C();
              if (param2Long < 86400000L) {
                com.allinone.callerid.util.q.b().c("not_alive_current_day_time");
                com.allinone.callerid.util.q.b().j();
                com.allinone.callerid.util.r.c();
              } else if (param2Long > 86400000L && param2Long < 172800000L) {
                com.allinone.callerid.util.q.b().c("not_alive_next_day_time");
                com.allinone.callerid.util.q.b().l();
                com.allinone.callerid.util.r.e();
              } else {
                com.allinone.callerid.util.q.b().c("not_alive_more_day_time");
                com.allinone.callerid.util.q.b().k();
                com.allinone.callerid.util.r.d();
              } 
            } 
          } 
        } 
      }
    }
    
    class d implements com.allinone.callerid.i.a.h.e {
      d(MainActivity.g0 this$0) {}
      
      public void a(long param2Long) {
        if (param2Long != 0L) {
          long l = b1.U();
          if (com.allinone.callerid.util.d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("最新通话记录时间:");
            stringBuilder.append(com.allinone.callerid.util.i.d(param2Long));
            com.allinone.callerid.util.d0.a("yaohao", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("保存的最新通话记录时间:");
            stringBuilder.append(com.allinone.callerid.util.i.d(l));
            com.allinone.callerid.util.d0.a("yaohao", stringBuilder.toString());
          } 
          if (l != 0L && l != param2Long && b1.C() != 0L)
            if (com.allinone.callerid.util.i.s(new Date(System.currentTimeMillis()), new Date(b1.C()), "GMT+8:00")) {
              if (com.allinone.callerid.util.d0.a)
                com.allinone.callerid.util.d0.a("yaohao", "时间为安装当日"); 
            } else if (com.allinone.callerid.util.i.a(b1.C(), "GMT+8:00")) {
              if (com.allinone.callerid.util.d0.a)
                com.allinone.callerid.util.d0.a("yaohao", "时间为安装后次日"); 
              b1.X0(false);
              com.allinone.callerid.util.q.b().c("stay_not_alived");
            } else {
              if (com.allinone.callerid.util.d0.a)
                com.allinone.callerid.util.d0.a("yaohao", "时间为安装2日以后"); 
              b1.X0(false);
            }  
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(MainActivity this$0, String param1String) {}
    
    public void run() {
      MainActivity.l0(this.c.b, this.b);
    }
  }
  
  class b implements Runnable {
    b(MainActivity this$0, String param1String) {}
    
    public void run() {
      MainActivity.l0(this.c.b, this.b);
    }
  }
  
  class c implements com.allinone.callerid.i.a.h.e {
    c(MainActivity this$0) {}
    
    public void a(long param1Long) {
      if (param1Long != 0L) {
        long l = b1.U();
        if (com.allinone.callerid.util.d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("最新通话记录时间:");
          stringBuilder.append(com.allinone.callerid.util.i.d(param1Long));
          com.allinone.callerid.util.d0.a("tony", stringBuilder.toString());
          stringBuilder = new StringBuilder();
          stringBuilder.append("保存的最新通话记录时间:");
          stringBuilder.append(com.allinone.callerid.util.i.d(l));
          com.allinone.callerid.util.d0.a("tony", stringBuilder.toString());
        } 
        if (l != 0L && l != param1Long) {
          b1.W0(false);
          b1.J0(false);
          com.allinone.callerid.util.q.b().c("not_alive");
          com.allinone.callerid.util.q.b().h();
          com.allinone.callerid.util.r.a();
          if (b1.C() != 0L) {
            if (com.allinone.callerid.util.i.r(new Date(System.currentTimeMillis()), new Date(b1.C()))) {
              com.allinone.callerid.util.q.b().c("not_alive_current_day_date");
              com.allinone.callerid.util.q.b().i();
              com.allinone.callerid.util.r.b();
            } 
            param1Long = System.currentTimeMillis() - b1.C();
            if (param1Long < 86400000L) {
              com.allinone.callerid.util.q.b().c("not_alive_current_day_time");
              com.allinone.callerid.util.q.b().j();
              com.allinone.callerid.util.r.c();
            } else if (param1Long > 86400000L && param1Long < 172800000L) {
              com.allinone.callerid.util.q.b().c("not_alive_next_day_time");
              com.allinone.callerid.util.q.b().l();
              com.allinone.callerid.util.r.e();
            } else {
              com.allinone.callerid.util.q.b().c("not_alive_more_day_time");
              com.allinone.callerid.util.q.b().k();
              com.allinone.callerid.util.r.d();
            } 
          } 
        } 
      } 
    }
  }
  
  class d implements com.allinone.callerid.i.a.h.e {
    d(MainActivity this$0) {}
    
    public void a(long param1Long) {
      if (param1Long != 0L) {
        long l = b1.U();
        if (com.allinone.callerid.util.d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("最新通话记录时间:");
          stringBuilder.append(com.allinone.callerid.util.i.d(param1Long));
          com.allinone.callerid.util.d0.a("yaohao", stringBuilder.toString());
          stringBuilder = new StringBuilder();
          stringBuilder.append("保存的最新通话记录时间:");
          stringBuilder.append(com.allinone.callerid.util.i.d(l));
          com.allinone.callerid.util.d0.a("yaohao", stringBuilder.toString());
        } 
        if (l != 0L && l != param1Long && b1.C() != 0L)
          if (com.allinone.callerid.util.i.s(new Date(System.currentTimeMillis()), new Date(b1.C()), "GMT+8:00")) {
            if (com.allinone.callerid.util.d0.a)
              com.allinone.callerid.util.d0.a("yaohao", "时间为安装当日"); 
          } else if (com.allinone.callerid.util.i.a(b1.C(), "GMT+8:00")) {
            if (com.allinone.callerid.util.d0.a)
              com.allinone.callerid.util.d0.a("yaohao", "时间为安装后次日"); 
            b1.X0(false);
            com.allinone.callerid.util.q.b().c("stay_not_alived");
          } else {
            if (com.allinone.callerid.util.d0.a)
              com.allinone.callerid.util.d0.a("yaohao", "时间为安装2日以后"); 
            b1.X0(false);
          }  
      } 
    }
  }
  
  class h implements Runnable {
    h(MainActivity this$0) {}
    
    public void run() {
      Intent intent = new Intent();
      intent.setClass((Context)this.b, DedicationActivity.class);
      this.b.startActivity(intent);
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class h0 implements DialogInterface.OnClickListener {
    h0(MainActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class i implements Runnable {
    i(MainActivity this$0) {}
    
    public void run() {
      MainActivity.h0(this.b).d(8388611);
    }
  }
  
  private static class i0 extends Handler {
    private final WeakReference<Activity> a;
    
    private i0(Activity param1Activity) {
      this.a = new WeakReference<Activity>(param1Activity);
    }
    
    public void handleMessage(Message param1Message) {
      Activity activity = this.a.get();
      if (activity != null && param1Message.what == 911) {
        i1.I0((Context)activity);
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.STARRED_DATA");
        b.p.a.a.b((Context)activity).d(intent);
        com.allinone.callerid.i.a.q.a.l((Context)activity, new a(this));
      } 
      super.handleMessage(param1Message);
    }
    
    class a implements com.allinone.callerid.i.a.q.g {
      a(MainActivity.i0 this$0) {}
      
      public void a(ArrayList<CallLogBean> param2ArrayList) {
        if (com.allinone.callerid.util.d0.a)
          com.allinone.callerid.util.d0.a("tony", "loadContact_ok"); 
      }
      
      public void b() {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.q.g {
    a(MainActivity this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      if (com.allinone.callerid.util.d0.a)
        com.allinone.callerid.util.d0.a("tony", "loadContact_ok"); 
    }
    
    public void b() {}
  }
  
  class j implements Runnable {
    j(MainActivity this$0) {}
    
    public void run() {
      MainActivity.h0(this.b).d(8388611);
    }
  }
  
  class j0 extends BroadcastReceiver {
    j0(MainActivity this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      try {
        if (param1Intent.getAction() != null) {
          String str = param1Intent.getAction();
          byte b = -1;
          int i = str.hashCode();
          if (i != 106761066) {
            if (i != 660609717) {
              if (i == 1877915441 && str.equals("com.allinone.callerid.CLOSE_AD"))
                b = 0; 
            } else if (str.equals("com.allinone.callerid.IDENTIFY_NUMBER")) {
              b = 2;
            } 
          } else if (str.equals("com.allinone.callerid.SET_SHORTCUT")) {
            b = 1;
          } 
          if (b != 0) {
            if (b != 1) {
              if (b == 2)
                MainActivity.d0(this.a); 
            } else {
              MainActivity.J0(this.a);
            } 
          } else {
            MainActivity.Q(this.a).setVisibility(8);
            MainActivity.c0(this.a).setVisibility(8);
            MainActivity.p0(this.a).setVisibility(8);
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class k implements com.allinone.callerid.i.a.d.b {
    k(MainActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        try {
          MainActivity.P(this.a);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        MainActivity.Q(this.a).setVisibility(8);
        MainActivity.c0(this.a).setVisibility(8);
        MainActivity.p0(this.a).setVisibility(8);
      } 
    }
  }
  
  private class k0 extends com.allinone.callerid.inapputil.c {
    private k0(MainActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      super.a(param1Boolean);
      if (com.allinone.callerid.util.d0.a)
        com.allinone.callerid.util.d0.a("inappbilling", "onAcknowledgePurchaseSuccess"); 
    }
    
    public void d(GoogleBillingUtil.GoogleBillingListenerTag param1GoogleBillingListenerTag, boolean param1Boolean) {
      super.d(param1GoogleBillingListenerTag, param1Boolean);
      i1.f = "";
      Toast.makeText(this.b.getApplicationContext(), this.b.getResources().getString(2131755869), 0).show();
    }
    
    public void e(GoogleBillingUtil.GoogleBillingListenerTag param1GoogleBillingListenerTag, int param1Int, boolean param1Boolean) {
      super.e(param1GoogleBillingListenerTag, param1Int, param1Boolean);
      if (com.allinone.callerid.util.d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tag:");
        stringBuilder.append(param1GoogleBillingListenerTag.tag);
        com.allinone.callerid.util.d0.a("inappbilling", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("responseCode:");
        stringBuilder.append(param1Int);
        com.allinone.callerid.util.d0.a("inappbilling", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("isSelf:");
        stringBuilder.append(param1Boolean);
        com.allinone.callerid.util.d0.a("inappbilling", stringBuilder.toString());
      } 
      if (GoogleBillingUtil.GoogleBillingListenerTag.c.tag.equals(param1GoogleBillingListenerTag.tag)) {
        com.allinone.callerid.i.a.s.b.b(param1Int, this.b.getApplicationContext());
        com.allinone.callerid.util.q.b().c("buy_ad_fail");
        if ("showcaller_removeads_year".equals(i1.f)) {
          com.allinone.callerid.util.q.b().c("subscribe_year_failed");
          if (com.allinone.callerid.util.d0.a)
            com.allinone.callerid.util.d0.a("inappbilling", "year_failed"); 
        } else if ("showcaller_removeads_month".equals(i1.f)) {
          com.allinone.callerid.util.q.b().c("subscribe_month_failed");
          if (com.allinone.callerid.util.d0.a)
            com.allinone.callerid.util.d0.a("inappbilling", "month_failed"); 
        } 
        i1.f = "";
      } 
    }
    
    public boolean f(Purchase param1Purchase, boolean param1Boolean) {
      try {
        if ("showcaller_removeads_month".equals(param1Purchase.f()) || "showcaller_removeads_year".equals(param1Purchase.f()) || "showcaller_removeads_month_specialoffers".equals(param1Purchase.f()) || "showcaller_removeads_year_specialoffers".equals(param1Purchase.f())) {
          if (com.allinone.callerid.util.d0.a) {
            com.allinone.callerid.util.d0.a("inappbilling", "Infinite gas subscription purchased.");
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("purchase:");
            stringBuilder.append(param1Purchase.toString());
            com.allinone.callerid.util.d0.a("inappbilling", stringBuilder.toString());
          } 
          Toast.makeText(this.b.getApplicationContext(), this.b.getResources().getString(2131755766), 1).show();
          b b = new b();
          this(this);
          com.allinone.callerid.i.a.d.a.b(b);
          MainActivity.w0(this.b, param1Purchase.f());
          if ("showcaller_removeads_month".equals(param1Purchase.f())) {
            MainActivity.A0(this.b).setText(this.b.getResources().getString(2131755476));
            com.allinone.callerid.util.q.b().c("buy_ad_success_month");
          } else {
            MainActivity.A0(this.b).setText(this.b.getResources().getString(2131755763));
            com.allinone.callerid.util.q.b().c("buy_ad_success");
          } 
          MainActivity.y0(this.b, param1Purchase.c());
          MainActivity.B0(this.b).setText(this.b.getResources().getString(2131755608));
          MainActivity.A0(this.b).setVisibility(0);
          i1.f = "";
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return super.f(param1Purchase, param1Boolean);
    }
    
    public void g(String param1String, List<SkuDetails> param1List, boolean param1Boolean) {
      super.g(param1String, param1List, param1Boolean);
      try {
        if ("subs".equals(param1String))
          for (SkuDetails skuDetails : param1List) {
            if (com.allinone.callerid.util.d0.a)
              com.allinone.callerid.util.d0.a("inappbilling", skuDetails.toString()); 
            if ("showcaller_removeads_month".equals(skuDetails.c()))
              MainActivity.C0(this.b, skuDetails.b()); 
            if ("showcaller_removeads_year".equals(skuDetails.c()))
              MainActivity.D0(this.b, skuDetails.b()); 
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void i(boolean param1Boolean) {
      super.i(param1Boolean);
      try {
        param1Boolean = com.allinone.callerid.util.d0.a;
        if (param1Boolean)
          com.allinone.callerid.util.d0.a("inappbilling", "内购服务初始化完成"); 
        List<Purchase> list = MainActivity.v0(this.b).F((Activity)this.b);
        if (list != null && list.size() > 0) {
          if (com.allinone.callerid.util.d0.a) {
            com.allinone.callerid.util.d0.a("inappbilling", "has subscription");
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("purchaseList:");
            stringBuilder.append(list.toString());
            com.allinone.callerid.util.d0.a("inappbilling", stringBuilder.toString());
          } 
          Purchase purchase = list.get(0);
          if (purchase != null && !purchase.h()) {
            MainActivity.w0(this.b, purchase.f());
            MainActivity.x0(this.b, true);
          } 
          if (purchase != null) {
            MainActivity.w0(this.b, purchase.f());
            MainActivity.y0(this.b, purchase.c());
            if ("showcaller_removeads_month".equals(purchase.f())) {
              MainActivity.A0(this.b).setText(this.b.getResources().getString(2131755476));
            } else {
              MainActivity.A0(this.b).setText(this.b.getResources().getString(2131755763));
            } 
          } 
          MainActivity.B0(this.b).setText(this.b.getResources().getString(2131755608));
          MainActivity.A0(this.b).setVisibility(0);
          a a = new a();
          this(this);
          com.allinone.callerid.i.a.d.a.b(a);
        } else {
          if (com.allinone.callerid.util.d0.a)
            com.allinone.callerid.util.d0.a("inappbilling", "no subscription"); 
          MainActivity.A0(this.b).setVisibility(8);
          com.allinone.callerid.i.a.d.a.c();
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.d.c {
      a(MainActivity.k0 this$0) {}
      
      public void close() {
        b.p.a.a.b(this.a.b.getApplicationContext()).d(new Intent("com.allinone.callerid.CLOSE_AD"));
        (com.allinone.callerid.util.gg.a.a()).b = null;
      }
    }
    
    class b implements com.allinone.callerid.i.a.d.c {
      b(MainActivity.k0 this$0) {}
      
      public void close() {
        b.p.a.a.b(this.a.b.getApplicationContext()).d(new Intent("com.allinone.callerid.CLOSE_AD"));
        (com.allinone.callerid.util.gg.a.a()).b = null;
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.d.c {
    a(MainActivity this$0) {}
    
    public void close() {
      b.p.a.a.b(this.a.b.getApplicationContext()).d(new Intent("com.allinone.callerid.CLOSE_AD"));
      (com.allinone.callerid.util.gg.a.a()).b = null;
    }
  }
  
  class b implements com.allinone.callerid.i.a.d.c {
    b(MainActivity this$0) {}
    
    public void close() {
      b.p.a.a.b(this.a.b.getApplicationContext()).d(new Intent("com.allinone.callerid.CLOSE_AD"));
      (com.allinone.callerid.util.gg.a.a()).b = null;
    }
  }
  
  class l implements FloatingActionMenu.h {
    l(MainActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean)
        try {
          com.allinone.callerid.util.q.b().c("addBlockButton");
          if (!b1.y2().booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(this.a.getApplicationContext())) {
              com.allinone.callerid.dialog.f f = new com.allinone.callerid.dialog.f();
              this(this.a.getApplicationContext(), 2131820783);
              f.setCanceledOnTouchOutside(false);
              a a = new a();
              this(this);
              f.setOnDismissListener(a);
              f.show();
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
    
    class a implements DialogInterface.OnDismissListener {
      a(MainActivity.l this$0) {}
      
      public void onDismiss(DialogInterface param2DialogInterface) {
        MainActivity.z0(this.b.a);
      }
    }
  }
  
  class a implements DialogInterface.OnDismissListener {
    a(MainActivity this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      MainActivity.z0(this.b.a);
    }
  }
  
  class m implements DialogInterface.OnDismissListener {
    m(MainActivity this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      if (MainActivity.n0(this.b) && MainActivity.r0(this.b) != null) {
        MainActivity.r0(this.b).b((new com.google.android.gms.ads.e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
        MainActivity.o0(this.b, false);
      } 
    }
  }
  
  class n implements com.allinone.callerid.util.k1.a.g {
    n(MainActivity this$0) {}
    
    public void a() {
      MainActivity.s0(this.a);
      if (MainActivity.Q0(this.a).s())
        MainActivity.Q0(this.a).u(true); 
    }
  }
  
  class o implements com.allinone.callerid.util.k1.a.g {
    o(MainActivity this$0) {}
    
    public void a() {
      if (MainActivity.Q0(this.a).s())
        MainActivity.Q0(this.a).u(true); 
      MainActivity.t0(this.a);
    }
  }
  
  class p implements com.allinone.callerid.customview.e.c {
    p(MainActivity this$0) {}
    
    public void X() {
      MainActivity.u0(this.a, true);
    }
  }
  
  class q implements com.allinone.callerid.customview.e.c {
    q(MainActivity this$0) {}
    
    public void X() {
      MainActivity.u0(this.a, false);
    }
  }
  
  class r implements Runnable {
    r(MainActivity this$0) {}
    
    public void run() {
      Intent intent = new Intent((Context)this.b, OverlayGuideActivity.class);
      intent.putExtra("open_notifi_overlay", true);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  class s implements Runnable {
    s(MainActivity this$0) {}
    
    public void run() {
      if (MainActivity.E0(this.b) != null) {
        if (MainActivity.E0(this.b).getBooleanExtra("missedcall", false) && MainActivity.K0(this.b) != null)
          MainActivity.K0(this.b).setCurrentItem(0); 
        MainActivity.E0(this.b).getBooleanExtra("blockedcall", false);
        MainActivity.F0(this.b, null);
      } 
    }
  }
  
  class t implements com.allinone.callerid.i.a.d.b {
    t(MainActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        try {
          MainActivity.P(this.a);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        MainActivity.Q(this.a).setVisibility(8);
        MainActivity.c0(this.a).setVisibility(8);
        MainActivity.p0(this.a).setVisibility(8);
      } 
    }
  }
  
  class u implements com.allinone.callerid.i.a.o.b {
    u(MainActivity this$0) {}
    
    public void a(String param1String, int param1Int) {
      if ((param1String != null && !"0".equals(param1String)) || param1Int != 0) {
        MainActivity.G0(this.a).setVisibility(0);
        MainActivity.H0(this.a).setText(param1String);
        MainActivity.I0(this.a).setText(String.valueOf(param1Int));
      } 
    }
  }
  
  class v implements com.allinone.callerid.util.z.b {
    v(MainActivity this$0) {}
    
    public void a(com.allinone.callerid.model.a param1a) {
      this.a.runOnUiThread(new a(this, param1a));
    }
    
    class a implements Runnable {
      a(MainActivity.v this$0, com.allinone.callerid.model.a param2a) {}
      
      public void run() {
        com.allinone.callerid.i.a.s.d.c(this.b, this.c.a);
      }
    }
  }
  
  class a implements Runnable {
    a(MainActivity this$0, com.allinone.callerid.model.a param1a) {}
    
    public void run() {
      com.allinone.callerid.i.a.s.d.c(this.b, this.c.a);
    }
  }
  
  class w implements DialogInterface.OnClickListener {
    w(MainActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class x implements DialogInterface.OnClickListener {
    x(MainActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        MainActivity.L0(this.d, str2, str1, true);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class y implements com.allinone.callerid.i.a.f.f {
    y(MainActivity this$0) {}
    
    public void a(EZSimpleContact param1EZSimpleContact) {
      try {
        View view = MainActivity.M0(this.a).inflate(2131493205, null);
        DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
        DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
        deletableEditText1.setText(param1EZSimpleContact.getName());
        deletableEditText2.setTypeface(MainActivity.N0(this.a));
        deletableEditText2.setText(param1EZSimpleContact.getNumber());
        deletableEditText2.setSelection(deletableEditText2.getText().length());
        AlertDialog.Builder builder = new AlertDialog.Builder();
        this((Context)this.a);
        builder = builder.setMessage(this.a.getResources().getString(2131755077)).setView(view);
        String str1 = this.a.getResources().getString(2131755681);
        b b = new b();
        this(this, deletableEditText2, deletableEditText1);
        builder = builder.setPositiveButton(str1, b);
        String str2 = this.a.getResources().getString(2131755180);
        a a = new a();
        this(this);
        AlertDialog alertDialog = builder.setNegativeButton(str2, a).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(MainActivity.O0(this.a));
        alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(MainActivity.y this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(MainActivity.y this$0, DeletableEditText param2DeletableEditText1, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str1 = this.b.getText().toString();
          String str2 = this.c.getText().toString();
          MainActivity.L0(this.d.a, str2, str1, false);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(MainActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(MainActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        MainActivity.L0(this.d.a, str2, str1, false);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class z implements com.allinone.callerid.i.a.e.a {
    z(MainActivity this$0, String param1String1, String param1String2, boolean param1Boolean) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        try {
          Toast.makeText(this.d.getApplicationContext(), this.d.getResources().getString(2131755131), 0).show();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        EZBlackList eZBlackList = new EZBlackList();
        this();
        eZBlackList.setNumber(this.a.replace("-", ""));
        eZBlackList.setName(this.b);
        eZBlackList.setIs_myblock("true");
        a a1 = new a();
        this(this);
        com.allinone.callerid.i.a.e.b.a(eZBlackList, a1);
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MainActivity.z this$0) {}
      
      public void a() {
        com.allinone.callerid.util.q.b().c("add_blacklist");
        Toast.makeText(this.a.d.getApplicationContext(), this.a.d.getResources().getString(2131755131), 0).show();
        if (this.a.c) {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(MainActivity this$0) {}
    
    public void a() {
      com.allinone.callerid.util.q.b().c("add_blacklist");
      Toast.makeText(this.a.d.getApplicationContext(), this.a.d.getResources().getString(2131755131), 0).show();
      if (this.a.c) {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */