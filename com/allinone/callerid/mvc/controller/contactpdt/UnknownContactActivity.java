package com.allinone.callerid.mvc.controller.contactpdt;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.customview.AppBarStateChangeListener;
import com.allinone.callerid.customview.DeletableEditText;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.comment.WriteCommentActivity;
import com.allinone.callerid.mvc.controller.report.ReportContactActivity;
import com.allinone.callerid.mvc.view.recorder.LTabIndicator;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.t0;
import com.allinone.callerid.util.w0;
import com.github.clans.fab.FloatingActionButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class UnknownContactActivity extends BaseActivity implements View.OnClickListener {
  private LinearLayout A;
  
  private ConstraintLayout B;
  
  private o0 C;
  
  private boolean D;
  
  private FrameLayout E;
  
  private ImageView F;
  
  private com.allinone.callerid.dialog.i G;
  
  private AppBarLayout H;
  
  private AppBarStateChangeListener I;
  
  private LinearLayout J;
  
  private Toolbar K;
  
  private LinearLayout L;
  
  private TextView M;
  
  private ImageView N;
  
  private ImageView O;
  
  private ConstraintLayout P;
  
  private ImageView Q;
  
  private ImageView R;
  
  private TextView S;
  
  private FrameLayout T;
  
  private ProgressBar U;
  
  private int V;
  
  private CallLogBean W;
  
  private String X;
  
  private String Y = null;
  
  private String Z;
  
  private boolean a0;
  
  private ConstraintLayout b0;
  
  private FrameLayout c0;
  
  private ImageView d0;
  
  private boolean e0;
  
  private Handler f0 = new Handler();
  
  private androidx.appcompat.app.a g0;
  
  private int h0;
  
  private int i0;
  
  private int j0;
  
  private int k0;
  
  private int l0;
  
  private View m0;
  
  private ImageView n0;
  
  private ImageView o0;
  
  @SuppressLint({"NewApi", "SetJavaScriptEnabled", "SetTextI18n"})
  private Typeface p0;
  
  private TextView q0;
  
  private com.allinone.callerid.g.i r0;
  
  private final String s = "UnknownContactActivity";
  
  private m0 s0;
  
  private ImageView t;
  
  private ImageView u;
  
  private TextView v;
  
  private PopupWindow w;
  
  private TextView x;
  
  private TextView y;
  
  private TextView z;
  
  private void O0(String paramString1, String paramString2) {
    (com.allinone.callerid.util.j0.a()).b.execute(new y(this, paramString1, paramString2));
  }
  
  private void P0() {
    try {
      CallLogBean callLogBean = this.W;
      if (callLogBean != null && callLogBean.p() != null && !"".equals(this.W.p())) {
        String str = this.W.p();
        v v = new v();
        this(this);
        com.allinone.callerid.i.a.e.b.b(str, v);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void Q0() {
    try {
      if (c1.h((Context)this)) {
        if (b1.H()) {
          c1.d((Context)this, b1.q(), this.W.p());
        } else if (Build.VERSION.SDK_INT >= 22) {
          c1.m((Context)this, this.W.p());
        } else {
          q0.a(getApplicationContext(), this.W.p());
        } 
      } else {
        q0.a(getApplicationContext(), this.W.p());
      } 
    } catch (Exception exception) {
      Toast.makeText((Context)this, getResources().getString(2131755541), 1).show();
    } 
  }
  
  private void R0() {
    com.allinone.callerid.util.q.b().c("btn_favorite");
    try {
      CallLogBean callLogBean = this.W;
      if (callLogBean != null && callLogBean.E() != null && !"".equals(this.W.E()))
        if (this.W.E().equals("1")) {
          Toast.makeText(getApplicationContext(), getResources().getString(2131755642), 0).show();
          try {
            int j = this.W.v();
            f f = new f();
            this(this);
            com.allinone.callerid.i.a.j.a.b(j, f);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } else {
          Toast.makeText(getApplicationContext(), getResources().getString(2131755083), 0).show();
          try {
            int j = this.W.v();
            g g = new g();
            this(this);
            com.allinone.callerid.i.a.j.a.a(j, g);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        }  
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void S0() {
    try {
      if (!isFinishing()) {
        androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a();
        this((Context)this);
        a2 = a2.h(getResources().getString(2131755286));
        String str1 = getResources().getString(2131755287);
        e e = new e();
        this(this);
        a2 = a2.n(str1, e);
        String str2 = getResources().getString(2131755180);
        d d = new d();
        this(this);
        androidx.appcompat.app.a a1 = a2.j(str2, d).a();
        a1.show();
        a1.g(-1).setTextColor(this.h0);
        a1.g(-2).setTextColor(getResources().getColor(2131099695));
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void T0() {
    (com.allinone.callerid.util.j0.a()).b.execute(new c(this));
  }
  
  private void V0() {
    getWindow().getDecorView().post(new a(this));
  }
  
  private void W0() {
    try {
      View view = LayoutInflater.from((Context)this).inflate(2131493148, null);
      this.c0 = (FrameLayout)view.findViewById(2131296740);
      FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296735);
      this.T = frameLayout1;
      frameLayout1.setVisibility(8);
      FrameLayout frameLayout3 = (FrameLayout)view.findViewById(2131296732);
      frameLayout3.setVisibility(0);
      frameLayout1 = (FrameLayout)view.findViewById(2131296782);
      frameLayout1.setVisibility(0);
      this.E = (FrameLayout)view.findViewById(2131296812);
      if (this.W.y() != null && !"".equals(this.W.y())) {
        this.E.setVisibility(0);
      } else {
        this.E.setVisibility(8);
      } 
      FrameLayout frameLayout4 = (FrameLayout)view.findViewById(2131296717);
      this.x = (TextView)view.findViewById(2131297810);
      ((TextView)view.findViewById(2131298106)).setTypeface(this.p0);
      this.x.setTypeface(this.p0);
      ((TextView)view.findViewById(2131297869)).setTypeface(this.p0);
      frameLayout3.setOnClickListener(this);
      TextView textView = (TextView)view.findViewById(2131298220);
      ((TextView)view.findViewById(2131297897)).setTypeface(this.p0);
      textView.setTypeface(this.p0);
      FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296795);
      ((TextView)view.findViewById(2131298123)).setTypeface(this.p0);
      frameLayout2.setVisibility(0);
      frameLayout2.setOnClickListener(this);
      this.E.setOnClickListener(this);
      this.c0.setOnClickListener(this);
      this.T.setOnClickListener(this);
      frameLayout4.setOnClickListener(this);
      frameLayout1.setOnClickListener(this);
      PopupWindow popupWindow = new PopupWindow();
      this(view);
      this.w = popupWindow;
      int j = getWindowManager().getDefaultDisplay().getWidth();
      this.w.setWidth(j / 2);
      this.w.setHeight(-2);
      this.w.setFocusable(true);
      if (i1.f0(getApplicationContext()).booleanValue()) {
        this.w.setAnimationStyle(2131821306);
      } else {
        this.w.setAnimationStyle(2131821305);
      } 
      ColorDrawable colorDrawable = new ColorDrawable();
      this(0);
      this.w.setBackgroundDrawable((Drawable)colorDrawable);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void X0() {
    this.p0 = g1.b();
    this.h0 = d1.a((Context)this, 2130968859, 2131099706);
    this.i0 = d1.a((Context)this, 2130968883, 2131099706);
    this.j0 = d1.a((Context)this, 2130968884, 2131099922);
    this.k0 = d1.a((Context)this, 2130968846, 2131099707);
    this.l0 = d1.a((Context)this, 2130968885, 2131099925);
    this.P = (ConstraintLayout)findViewById(2131297168);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296743);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296722);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296756);
    FrameLayout frameLayout4 = (FrameLayout)findViewById(2131296711);
    this.Q = (ImageView)findViewById(2131296908);
    this.R = (ImageView)findViewById(2131296954);
    this.S = (TextView)findViewById(2131297811);
    this.U = (ProgressBar)findViewById(2131297380);
    this.n0 = (ImageView)findViewById(2131296963);
    this.o0 = (ImageView)findViewById(2131296952);
    ViewPager viewPager = (ViewPager)findViewById(2131298260);
    LTabIndicator lTabIndicator = (LTabIndicator)findViewById(2131296921);
    this.b0 = (ConstraintLayout)findViewById(2131297166);
    this.m0 = findViewById(2131298253);
    com.allinone.callerid.b.n n = new com.allinone.callerid.b.n(s());
    com.allinone.callerid.g.i i1 = new com.allinone.callerid.g.i();
    this.r0 = i1;
    n.y((Fragment)i1, getString(2131755295));
    n.y((Fragment)new com.allinone.callerid.g.a(), getString(2131755226));
    viewPager.setAdapter((androidx.viewpager.widget.a)n);
    lTabIndicator.z = 16;
    lTabIndicator.q = 0;
    lTabIndicator.p = d1.a((Context)this, 2130968900, 2131099725);
    lTabIndicator.o = d1.a((Context)this, 2130968855, 2131099719);
    lTabIndicator.setIndicatorColor(d1.a((Context)this, 2130968897, 2131099725));
    lTabIndicator.setViewPager(viewPager);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    frameLayout4.setOnClickListener(this);
    this.n0.setOnClickListener(this);
    ((FloatingActionButton)findViewById(2131296825)).setOnClickListener(this);
    if (this.a0)
      viewPager.setCurrentItem(1); 
    this.A = (LinearLayout)findViewById(2131297472);
    this.H = (AppBarLayout)findViewById(2131296353);
    this.K = (Toolbar)findViewById(2131297760);
    this.L = (LinearLayout)findViewById(2131297544);
    this.B = (ConstraintLayout)findViewById(2131297169);
    ImageView imageView2 = (ImageView)findViewById(2131297118);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView2.setImageResource(2131231059); 
    this.t = (ImageView)findViewById(2131297119);
    this.M = (TextView)findViewById(2131298192);
    this.u = (ImageView)findViewById(2131296885);
    this.F = (ImageView)findViewById(2131296895);
    FrameLayout frameLayout7 = (FrameLayout)findViewById(2131296403);
    frameLayout1 = (FrameLayout)findViewById(2131296407);
    FrameLayout frameLayout5 = (FrameLayout)findViewById(2131296439);
    FrameLayout frameLayout6 = (FrameLayout)findViewById(2131296408);
    this.J = (LinearLayout)findViewById(2131297185);
    this.N = (ImageView)findViewById(2131297054);
    this.O = (ImageView)findViewById(2131297055);
    this.N.setVisibility(8);
    this.O.setVisibility(8);
    imageView2.setOnClickListener(this);
    this.t.setOnClickListener(this);
    frameLayout7.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    frameLayout5.setOnClickListener(this);
    frameLayout6.setOnClickListener(this);
    this.v = (TextView)findViewById(2131297989);
    ImageView imageView1 = (ImageView)findViewById(2131297075);
    this.d0 = imageView1;
    imageView1.setOnClickListener(this);
    TextView textView3 = (TextView)findViewById(2131297788);
    this.y = (TextView)findViewById(2131297790);
    this.z = (TextView)findViewById(2131297795);
    TextView textView2 = (TextView)findViewById(2131297794);
    TextView textView1 = (TextView)findViewById(2131296471);
    this.q0 = textView1;
    textView1.setTypeface(this.p0);
    this.v.setTypeface(this.p0);
    textView3.setTypeface(this.p0);
    this.y.setTypeface(this.p0);
    this.z.setTypeface(this.p0);
    textView2.setTypeface(this.p0);
    this.M.setTypeface(this.p0);
    String str = this.Y;
    if (str != null) {
      if (!"".equals(str)) {
        this.q0.setOnClickListener(this);
        this.q0.setVisibility(0);
        this.q0.setText(this.Y);
      } 
      str = this.Y;
      if (str != null && !"".equals(str))
        this.z.setText(getResources().getString(2131755118)); 
    } 
    viewPager.c(new f0(this));
  }
  
  private void Z0(Context paramContext, String paramString) {
    if (i1.a(paramContext)) {
      String str2 = i1.W((Context)EZCallApplication.c());
      String str3 = com.allinone.callerid.util.p.d((Context)EZCallApplication.c()).getCountry_code();
      String str4 = com.allinone.callerid.util.p.d((Context)EZCallApplication.c()).getIso_code();
      String str1 = com.allinone.callerid.util.p.e(paramContext);
      String str5 = i1.Q((Context)EZCallApplication.c(), str1);
      paramString = com.allinone.callerid.util.w.c(paramString);
      if (str4 != null && !"".equals(str4) && str2 != null && !"".equals(str2) && str3 != null && !"".equals(str3) && str5 != null && !"".equals(str5) && paramString != null && !"".equals(paramString))
        (new t0("android", str2, str3, str1, str5, str4.split("/")[0].toLowerCase(), paramString)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]); 
    } 
  }
  
  private void a1(Context paramContext, String paramString) {
    try {
      if (this.W != null && i1.a(paramContext)) {
        Toast.makeText(paramContext, getResources().getString(2131755802), 0).show();
        j1(this.W.p());
        String str2 = i1.W((Context)EZCallApplication.c());
        String str3 = com.allinone.callerid.util.p.d((Context)EZCallApplication.c()).getCountry_code();
        String str4 = com.allinone.callerid.util.p.d((Context)EZCallApplication.c()).getIso_code();
        String str1 = com.allinone.callerid.util.p.e(paramContext);
        String str5 = i1.Q((Context)EZCallApplication.c(), str1);
        paramString = com.allinone.callerid.util.w.c(paramString);
        if (str4 != null && !"".equals(str4) && str2 != null && !"".equals(str2) && str3 != null && !"".equals(str3) && str5 != null && !"".equals(str5) && paramString != null && !"".equals(paramString)) {
          w0 w0 = new w0();
          this("android", str2, str3, str1, str5, str4.split("/")[0].toLowerCase(), paramString);
          w0.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        } 
      } else {
        Toast.makeText(getApplicationContext(), 2131755688, 0).show();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void b1() {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW");
      intent.setType("vnd.android-dir/mms-sms");
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("smsto:");
      stringBuilder.append(this.W.p());
      intent.setData(Uri.parse(stringBuilder.toString()));
      intent.addFlags(268468224);
      startActivity(intent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    com.allinone.callerid.util.q.b().c("btn_contact_sms");
  }
  
  private void c1() {
    try {
      if (!b1.y2().booleanValue()) {
        int j = Build.VERSION.SDK_INT;
        if (j >= 26 && j < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
          com.allinone.callerid.dialog.f f = new com.allinone.callerid.dialog.f();
          this((Context)this, 2131820783);
          f.setCanceledOnTouchOutside(false);
          f.show();
          return;
        } 
      } 
      String str = this.W.p();
      c0 c0 = new c0();
      this(this);
      com.allinone.callerid.i.a.e.b.b(str, c0);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void e1() {
    CallLogBean callLogBean = this.W;
    if (callLogBean != null && callLogBean.p() != null && !"".equals(this.W.p()))
      com.allinone.callerid.i.a.p.a.a(this.W.p(), new b0(this)); 
  }
  
  private void f1() {
    com.allinone.callerid.i.a.p.a.b(this.W.p(), new a0(this));
  }
  
  private void g1() {
    try {
      CallLogBean callLogBean = this.W;
      if (callLogBean != null) {
        i1.v0(callLogBean.p());
        String str = this.W.N();
        if (str == null || "".equals(this.W.N()) || this.W.x() == null || this.W.x().equals("0")) {
          this.q0.setBackgroundResource(2131231424);
          this.q0.setTextColor(getResources().getColor(2131099706));
        } 
        if ((this.W.e() == null || "".equals(this.W.e())) && b1.t2().booleanValue()) {
          this.b0.setVisibility(0);
          b1.L2(Boolean.FALSE);
        } 
        str = this.W.k();
        this.Z = str;
        if (str != null && !"".equals(str) && this.q0.getVisibility() == 8) {
          this.q0.setVisibility(0);
          this.q0.setText(this.Z);
        } 
        boolean bool = c1.h((Context)this);
        if (bool) {
          try {
            if (this.W.C().equals("0")) {
              this.N.setVisibility(0);
            } else if (this.W.C().equals("1")) {
              this.O.setVisibility(0);
            } else {
              this.N.setVisibility(8);
              this.O.setVisibility(8);
            } 
          } catch (Exception exception) {}
        } else {
          this.N.setVisibility(8);
          this.O.setVisibility(8);
        } 
        int j = 2131231148;
        CallLogBean callLogBean1 = this.W;
        int k = j;
        if (callLogBean1 != null) {
          k = j;
          if (callLogBean1.N() != null) {
            k = j;
            if (!"".equals(this.W.N())) {
              k = j;
              if (this.W.x() != null) {
                k = j;
                if (!this.W.x().equals("0")) {
                  this.A.setBackgroundColor(this.j0);
                  this.m0.setVisibility(8);
                  this.u.setImageResource(2131231149);
                  k = 2131231149;
                } 
              } 
            } 
          } 
        } 
        if (this.W.a() != null && !"".equals(this.W.a()))
          com.allinone.callerid.util.u.a((Activity)this, this.W.a(), k, this.u); 
        if (this.W.n() != null && !"".equals(this.W.n())) {
          this.v.setText(this.W.n());
          this.M.setText(this.W.n());
        } else if (this.W.y() != null && !"".equals(this.W.y())) {
          this.v.setText(this.W.y());
          this.M.setText(this.W.y());
        } else if (i1.v0(this.W.p())) {
          this.M.setText(getResources().getString(2131755829));
          this.v.setText(getResources().getString(2131755829));
        } else {
          this.d0.setVisibility(0);
          if (this.W.d() != null && !"".equals(this.W.d())) {
            this.M.setText(this.W.d());
            this.v.setText(this.W.d());
          } else if (this.W.i() != null && !"".equals(this.W.i())) {
            this.M.setText(this.W.i());
            this.v.setText(this.W.i());
          } else {
            this.M.setText(this.W.p());
            this.v.setText(this.W.p());
          } 
          com.allinone.callerid.util.q.b().c("unknown_name_show");
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void h1(String paramString) {
    (com.allinone.callerid.util.j0.a()).b.execute(new h0(this, paramString));
  }
  
  private void i1(String paramString1, String paramString2, String paramString3, String paramString4) {
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("tel_number", paramString1);
      jSONObject.put("name", paramString2);
      jSONObject.put("type", paramString3);
      jSONObject.put("t_p", paramString4);
      paramString1 = jSONObject.toString();
      if (com.allinone.callerid.util.d0.a)
        com.allinone.callerid.util.d0.a("reportName", paramString1); 
      Z0(getApplicationContext(), paramString1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void j1(String paramString) {
    (com.allinone.callerid.util.j0.a()).b.execute(new g0(this, paramString));
  }
  
  private void k1(String paramString1, String paramString2, String paramString3) {
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("tel_number", paramString1);
      jSONObject.put("wrong_type", paramString2);
      jSONObject.put("t_p", i1.f(paramString3));
      paramString1 = jSONObject.toString();
      if (com.allinone.callerid.util.d0.a)
        com.allinone.callerid.util.d0.a("reportWrongInfo", paramString1); 
      a1(getApplicationContext(), paramString1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void l1(String paramString) {
    try {
      com.allinone.callerid.dialog.n n = new com.allinone.callerid.dialog.n();
      this((Context)this, 2131820783, getResources().getString(2131755730), getResources().getString(2131755727), getResources().getString(2131755564), 1, paramString);
      n.setCanceledOnTouchOutside(false);
      n.show();
      Window window = n.getWindow();
      WindowManager.LayoutParams layoutParams = window.getAttributes();
      window.setGravity(80);
      WindowManager windowManager = (WindowManager)getApplicationContext().getApplicationContext().getSystemService("window");
      int j = windowManager.getDefaultDisplay().getWidth();
      int k = windowManager.getDefaultDisplay().getHeight();
      layoutParams.width = j;
      layoutParams.height = k / 2;
      window.setAttributes(layoutParams);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void m1(String paramString1, String paramString2) {
    try {
      com.allinone.callerid.dialog.i i1 = new com.allinone.callerid.dialog.i();
      d0 d0 = new d0();
      this(this);
      this((Context)this, 2131820783, d0, paramString1, paramString2);
      this.G = i1;
      com.allinone.callerid.util.q.b().c("number_dialog_show");
      this.G.setCanceledOnTouchOutside(false);
      this.G.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void n1(String paramString) {
    try {
      ArrayList<String> arrayList = new ArrayList();
      this();
      try {
        String str = this.W.o();
        if (str != null && !"".equals(str)) {
          JSONArray jSONArray = new JSONArray();
          this(str);
          for (byte b = 0; b < jSONArray.length(); b++)
            arrayList.add(jSONArray.getString(b)); 
        } 
      } catch (Exception exception1) {
        exception1.printStackTrace();
      } 
      View view = LayoutInflater.from((Context)this).inflate(2131493207, null);
      TextView textView3 = (TextView)view.findViewById(2131298157);
      textView3.setTypeface(g1.b());
      DeletableEditText deletableEditText = (DeletableEditText)view.findViewById(2131296645);
      FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296757);
      FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296758);
      FrameLayout frameLayout3 = (FrameLayout)view.findViewById(2131296759);
      RadioButton radioButton1 = (RadioButton)view.findViewById(2131297393);
      RadioButton radioButton2 = (RadioButton)view.findViewById(2131297394);
      RadioButton radioButton3 = (RadioButton)view.findViewById(2131297395);
      TextView textView2 = (TextView)view.findViewById(2131297985);
      TextView textView1 = (TextView)view.findViewById(2131297986);
      TextView textView4 = (TextView)view.findViewById(2131297987);
      TextView textView5 = (TextView)view.findViewById(2131297830);
      textView2.setTypeface(g1.b());
      textView1.setTypeface(g1.b());
      textView4.setTypeface(g1.b());
      textView5.setTypeface(g1.b());
      l l = new l();
      this(this, deletableEditText, radioButton1, radioButton2, radioButton3, textView2, textView1, textView4);
      deletableEditText.addTextChangedListener(l);
      deletableEditText.setTypeface(g1.b());
      Handler handler = this.f0;
      m m = new m();
      this(this, deletableEditText);
      handler.postDelayed(m, 1000L);
      if (arrayList.size() > 0) {
        if (arrayList.size() == 1) {
          textView2.setText(arrayList.get(0));
          frameLayout1.setVisibility(0);
        } 
        textView3 = textView2;
        if (arrayList.size() == 2) {
          textView3.setText(arrayList.get(0));
          frameLayout1.setVisibility(0);
          textView1.setText(arrayList.get(1));
          frameLayout2.setVisibility(0);
        } 
        if (arrayList.size() == 3) {
          textView3.setText(arrayList.get(0));
          frameLayout1.setVisibility(0);
          textView1.setText(arrayList.get(1));
          frameLayout2.setVisibility(0);
          textView4.setText(arrayList.get(2));
          frameLayout3.setVisibility(0);
        } 
      } else {
        textView3.setText(getResources().getString(2131755769));
      } 
      n n = new n();
      try {
        this(this, radioButton1, textView2, deletableEditText, radioButton2, radioButton3, textView1, textView4);
        frameLayout1.setOnClickListener(n);
        o o = new o();
        this(this, radioButton2, textView1, deletableEditText, radioButton1, radioButton3, textView2, textView4);
        frameLayout2.setOnClickListener(o);
        p p = new p();
        this(this, radioButton3, textView2, deletableEditText, radioButton2, radioButton1, textView4, textView1);
        frameLayout3.setOnClickListener(p);
        q q = new q();
        this(this, radioButton2, radioButton3, deletableEditText, textView2, textView4, textView1);
        radioButton1.setOnCheckedChangeListener(q);
        r r = new r();
        this(this, radioButton1, radioButton3, deletableEditText, textView1, textView4, textView2);
        radioButton2.setOnCheckedChangeListener(r);
        s s = new s();
        this(this, radioButton2, radioButton1, deletableEditText, textView4, textView2, textView1);
        radioButton3.setOnCheckedChangeListener(s);
        RadioButton radioButton5 = (RadioButton)view.findViewById(2131297390);
        RadioButton radioButton4 = (RadioButton)view.findViewById(2131297399);
        radioButton5.setTypeface(g1.b());
        radioButton4.setTypeface(g1.b());
        t t = new t();
        try {
          this(this, radioButton4);
          radioButton5.setOnCheckedChangeListener(t);
          u u = new u();
          this(this, radioButton5);
          radioButton4.setOnCheckedChangeListener(u);
          ImageView imageView = (ImageView)view.findViewById(2131297117);
          FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296438);
          w w = new w();
          this(this, deletableEditText, radioButton5, radioButton4, paramString);
          frameLayout.setOnClickListener(w);
          x x = new x();
          this(this);
          imageView.setOnClickListener(x);
          if (!isFinishing()) {
            androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a();
            this((Context)this);
            androidx.appcompat.app.a a1 = a2.r(view).a();
            this.g0 = a1;
            a1.show();
          } 
        } catch (Exception null) {}
      } catch (Exception null) {}
    } catch (Exception exception) {}
    exception.printStackTrace();
  }
  
  private void o1(String paramString) {
    try {
      View view = LayoutInflater.from((Context)this).inflate(2131493209, null);
      RadioButton radioButton1 = (RadioButton)view.findViewById(2131297392);
      RadioButton radioButton2 = (RadioButton)view.findViewById(2131297397);
      RadioButton radioButton3 = (RadioButton)view.findViewById(2131297398);
      radioButton1.setTypeface(this.p0);
      radioButton2.setTypeface(this.p0);
      radioButton3.setTypeface(this.p0);
      if (!this.D)
        radioButton2.setVisibility(8); 
      h h = new h();
      this(this, radioButton2, radioButton3);
      radioButton1.setOnCheckedChangeListener(h);
      i i1 = new i();
      this(this, radioButton1, radioButton3);
      radioButton2.setOnCheckedChangeListener(i1);
      j j = new j();
      this(this, radioButton1, radioButton2);
      radioButton3.setOnCheckedChangeListener(j);
      if (!isFinishing()) {
        androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a();
        this((Context)this);
        androidx.appcompat.app.a.a a3 = a2.q(getResources().getString(2131755866)).r(view);
        String str = getResources().getString(2131755647);
        k k = new k();
        this(this, radioButton1, radioButton2, radioButton3, paramString);
        androidx.appcompat.app.a a1 = a3.n(str, k).a();
        a1.show();
        a1.g(-1).setTextColor(this.h0);
        a1.g(-2).setTextColor(getResources().getColor(2131099695));
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void U0() {
    if (this.e0) {
      Intent intent = new Intent((Context)this, MainActivity.class);
      intent.putExtra("missedcall", true);
      startActivity(intent);
    } 
    finish();
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void d1(m0 paramm0) {
    this.s0 = paramm0;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 != 110) {
      if (paramInt1 != 200) {
        if (paramInt1 != 300) {
          if (paramInt1 == 369 && paramInt2 == 963 && paramIntent != null)
            try {
              String str = paramIntent.getStringExtra("typelabel");
              if (str != null && !"".equals(str)) {
                this.W.d1(i1.D(getApplicationContext(), str));
                try {
                  if (Build.VERSION.SDK_INT >= 21) {
                    Window window = getWindow();
                    window.addFlags(-2147483648);
                    window.setStatusBarColor(this.l0);
                  } 
                } catch (Exception exception) {
                  exception.printStackTrace();
                } 
                this.u.setImageResource(2131231149);
                this.A.setBackgroundColor(this.j0);
                this.m0.setVisibility(8);
                m0 m01 = this.s0;
                if (m01 != null)
                  m01.b(true, this.W.N()); 
              } 
            } catch (Exception exception) {
              exception.printStackTrace();
            }  
        } else if (paramIntent != null) {
          try {
            String str = paramIntent.getStringExtra("typelabel");
            if (str != null && !"".equals(str)) {
              this.W.d1(i1.D(getApplicationContext(), this.X));
              try {
                if (Build.VERSION.SDK_INT >= 21) {
                  Window window = getWindow();
                  window.addFlags(-2147483648);
                  window.setStatusBarColor(getResources().getColor(2131099925));
                } 
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
              this.A.setBackgroundColor(this.j0);
              this.m0.setVisibility(8);
              this.u.setImageResource(2131231149);
              m0 m01 = this.s0;
              if (m01 != null)
                m01.b(true, this.W.N()); 
            } else {
              this.W.d1("");
              try {
                if (Build.VERSION.SDK_INT >= 21) {
                  Window window = getWindow();
                  window.addFlags(-2147483648);
                  window.setStatusBarColor(getResources().getColor(2131099706));
                } 
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
              this.A.setBackgroundColor(this.i0);
              this.u.setImageResource(2131231148);
              m0 m01 = this.s0;
              if (m01 != null)
                m01.b(false, this.W.N()); 
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } 
      } else {
        try {
          Handler handler = this.f0;
          z z = new z();
          this(this);
          handler.postDelayed(z, 500L);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
    } else if (paramInt2 == 119) {
      if (paramIntent != null)
        try {
          if (paramIntent.getBooleanExtra("isrefush", false)) {
            Toast.makeText((Context)EZCallApplication.c(), "The type deleted successfully!", 0).show();
            try {
              if (Build.VERSION.SDK_INT >= 21) {
                Window window = getWindow();
                window.addFlags(-2147483648);
                window.setStatusBarColor(this.k0);
              } 
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
            this.A.setBackgroundColor(this.i0);
            this.u.setImageResource(2131231148);
            this.q0.setVisibility(8);
            this.Y = "";
            this.W.X0("");
            this.z.setText(getResources().getString(2131755647));
            m0 m01 = this.s0;
            if (m01 != null)
              m01.b(false, this.W.N()); 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    } else if (paramInt2 == 120 && paramIntent != null) {
      String str = paramIntent.getStringExtra("edittype");
      if (str != null && !"".equals(str)) {
        this.Y = str;
        this.q0.setText(str);
        this.q0.setBackgroundResource(2131231426);
        this.q0.setTextColor(getResources().getColor(2131099922));
        this.q0.setOnClickListener(this);
        this.W.X0(this.Y);
        try {
          if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(-2147483648);
            window.setStatusBarColor(this.l0);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        this.A.setBackgroundColor(this.j0);
        this.m0.setVisibility(8);
        this.q0.setVisibility(0);
        this.z.setText(getResources().getString(2131755118));
        this.u.setImageResource(2131231149);
        CallLogBean callLogBean = this.W;
        if (callLogBean != null && callLogBean.N() != null && !"".equals(this.W.N()) && this.W.x() != null && !this.W.x().equals("0")) {
          m0 m01 = this.s0;
          if (m01 != null)
            m01.b(true, this.W.N()); 
          CallLogBean callLogBean1 = this.W;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(Integer.parseInt(this.W.x()) + 1);
          stringBuilder.append("");
          callLogBean1.K0(stringBuilder.toString());
        } 
      } 
    } 
    com.allinone.callerid.g.i i1 = this.r0;
    if (i1 != null)
      i1.n0(paramInt1, paramInt2, paramIntent); 
  }
  
  public void onClick(View paramView) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getId : ()I
    //   4: lookupswitch default -> 208, 2131296403 -> 2027, 2131296404 -> 1963, 2131296407 -> 1692, 2131296408 -> 1471, 2131296421 -> 1345, 2131296439 -> 1263, 2131296471 -> 1150, 2131296711 -> 1086, 2131296717 -> 1024, 2131296722 -> 1017, 2131296732 -> 923, 2131296735 -> 909, 2131296740 -> 895, 2131296743 -> 888, 2131296756 -> 881, 2131296782 -> 778, 2131296795 -> 603, 2131296812 -> 561, 2131296825 -> 519, 2131296963 -> 459, 2131297075 -> 377, 2131297118 -> 370, 2131297119 -> 297, 2131297581 -> 211
    //   208: goto -> 2088
    //   211: aload_0
    //   212: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   215: astore_1
    //   216: aload_1
    //   217: ifnull -> 285
    //   220: aload_1
    //   221: invokevirtual p : ()Ljava/lang/String;
    //   224: ifnull -> 285
    //   227: ldc_w ''
    //   230: aload_0
    //   231: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   234: invokevirtual p : ()Ljava/lang/String;
    //   237: invokevirtual equals : (Ljava/lang/Object;)Z
    //   240: ifne -> 285
    //   243: new android/content/Intent
    //   246: dup
    //   247: aload_0
    //   248: ldc_w com/allinone/callerid/mvc/controller/CallLogActivity
    //   251: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   254: astore_1
    //   255: aload_1
    //   256: ldc_w 'call_log_number'
    //   259: aload_0
    //   260: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   263: invokevirtual p : ()Ljava/lang/String;
    //   266: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   269: pop
    //   270: aload_0
    //   271: aload_1
    //   272: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   275: aload_0
    //   276: ldc_w 2130771968
    //   279: ldc_w 2130771969
    //   282: invokevirtual overridePendingTransition : (II)V
    //   285: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   288: ldc_w 'see_history'
    //   291: invokevirtual c : (Ljava/lang/String;)V
    //   294: goto -> 2088
    //   297: aload_0
    //   298: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   301: invokestatic f0 : (Landroid/content/Context;)Ljava/lang/Boolean;
    //   304: invokevirtual booleanValue : ()Z
    //   307: ifeq -> 340
    //   310: aload_0
    //   311: getfield w : Landroid/widget/PopupWindow;
    //   314: aload_0
    //   315: getfield t : Landroid/widget/ImageView;
    //   318: bipush #51
    //   320: iconst_5
    //   321: aload_0
    //   322: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   325: ldc_w 14.0
    //   328: invokestatic a : (Landroid/content/Context;F)I
    //   331: bipush #25
    //   333: iadd
    //   334: invokevirtual showAtLocation : (Landroid/view/View;III)V
    //   337: goto -> 2088
    //   340: aload_0
    //   341: getfield w : Landroid/widget/PopupWindow;
    //   344: aload_0
    //   345: getfield t : Landroid/widget/ImageView;
    //   348: bipush #53
    //   350: iconst_5
    //   351: aload_0
    //   352: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   355: ldc_w 14.0
    //   358: invokestatic a : (Landroid/content/Context;F)I
    //   361: bipush #25
    //   363: iadd
    //   364: invokevirtual showAtLocation : (Landroid/view/View;III)V
    //   367: goto -> 2088
    //   370: aload_0
    //   371: invokevirtual U0 : ()V
    //   374: goto -> 2088
    //   377: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   380: ldc_w 'unknown_name_click'
    //   383: invokevirtual c : (Ljava/lang/String;)V
    //   386: aload_0
    //   387: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   390: astore_1
    //   391: aload_1
    //   392: ifnull -> 430
    //   395: aload_1
    //   396: invokevirtual p : ()Ljava/lang/String;
    //   399: invokestatic v0 : (Ljava/lang/String;)Z
    //   402: ifne -> 430
    //   405: aload_0
    //   406: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   409: invokevirtual p : ()Ljava/lang/String;
    //   412: astore_1
    //   413: new com/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity$k0
    //   416: astore_2
    //   417: aload_2
    //   418: aload_0
    //   419: invokespecial <init> : (Lcom/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity;)V
    //   422: aload_1
    //   423: aload_2
    //   424: invokestatic d : (Ljava/lang/String;Lcom/allinone/callerid/i/a/l/a;)V
    //   427: goto -> 2088
    //   430: aload_0
    //   431: aload_0
    //   432: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   435: ldc_w 2131755829
    //   438: invokevirtual getString : (I)Ljava/lang/String;
    //   441: iconst_0
    //   442: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   445: invokevirtual show : ()V
    //   448: goto -> 2088
    //   451: astore_1
    //   452: aload_1
    //   453: invokevirtual printStackTrace : ()V
    //   456: goto -> 2088
    //   459: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   462: ldc_w 'number_pdt_callscreen_click'
    //   465: invokevirtual c : (Ljava/lang/String;)V
    //   468: new android/content/Intent
    //   471: astore_1
    //   472: aload_1
    //   473: aload_0
    //   474: ldc_w com/allinone/callerid/mvc/controller/MainActivity
    //   477: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   480: aload_1
    //   481: ldc_w 'is_callscreen'
    //   484: iconst_1
    //   485: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   488: pop
    //   489: aload_0
    //   490: aload_1
    //   491: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   494: aload_0
    //   495: ldc_w 2130771968
    //   498: ldc_w 2130771969
    //   501: invokevirtual overridePendingTransition : (II)V
    //   504: aload_0
    //   505: invokevirtual finish : ()V
    //   508: goto -> 2088
    //   511: astore_1
    //   512: aload_1
    //   513: invokevirtual printStackTrace : ()V
    //   516: goto -> 2088
    //   519: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   522: ldc_w 'write_comment_button_click'
    //   525: invokevirtual c : (Ljava/lang/String;)V
    //   528: aload_0
    //   529: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   532: invokevirtual p : ()Ljava/lang/String;
    //   535: astore_2
    //   536: new com/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity$b
    //   539: astore_1
    //   540: aload_1
    //   541: aload_0
    //   542: invokespecial <init> : (Lcom/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity;)V
    //   545: aload_2
    //   546: aload_1
    //   547: invokestatic c : (Ljava/lang/String;Lcom/allinone/callerid/i/a/l/a;)V
    //   550: goto -> 2088
    //   553: astore_1
    //   554: aload_1
    //   555: invokevirtual printStackTrace : ()V
    //   558: goto -> 2088
    //   561: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   564: ldc_w 'wrong_info_click'
    //   567: invokevirtual c : (Ljava/lang/String;)V
    //   570: aload_0
    //   571: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   574: invokevirtual p : ()Ljava/lang/String;
    //   577: astore_1
    //   578: new com/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity$i0
    //   581: astore_2
    //   582: aload_2
    //   583: aload_0
    //   584: invokespecial <init> : (Lcom/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity;)V
    //   587: aload_1
    //   588: aload_2
    //   589: invokestatic e : (Ljava/lang/String;Lcom/allinone/callerid/i/a/l/a;)V
    //   592: goto -> 2088
    //   595: astore_1
    //   596: aload_1
    //   597: invokevirtual printStackTrace : ()V
    //   600: goto -> 2088
    //   603: aload_0
    //   604: getfield w : Landroid/widget/PopupWindow;
    //   607: invokevirtual dismiss : ()V
    //   610: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   613: ldc_w 'number_content_share_click'
    //   616: invokevirtual c : (Ljava/lang/String;)V
    //   619: aload_0
    //   620: getfield M : Landroid/widget/TextView;
    //   623: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   626: invokeinterface toString : ()Ljava/lang/String;
    //   631: aload_0
    //   632: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   635: invokevirtual p : ()Ljava/lang/String;
    //   638: aload_0
    //   639: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   642: invokevirtual c : ()Ljava/lang/String;
    //   645: invokestatic L : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   648: astore_1
    //   649: new com/allinone/callerid/dialog/n
    //   652: astore_2
    //   653: aload_2
    //   654: aload_0
    //   655: ldc_w 2131820783
    //   658: aload_0
    //   659: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   662: ldc_w 2131755732
    //   665: invokevirtual getString : (I)Ljava/lang/String;
    //   668: aload_0
    //   669: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   672: ldc_w 2131755727
    //   675: invokevirtual getString : (I)Ljava/lang/String;
    //   678: aload_1
    //   679: iconst_0
    //   680: aconst_null
    //   681: invokespecial <init> : (Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    //   684: aload_2
    //   685: iconst_0
    //   686: invokevirtual setCanceledOnTouchOutside : (Z)V
    //   689: aload_2
    //   690: invokevirtual show : ()V
    //   693: aload_2
    //   694: invokevirtual getWindow : ()Landroid/view/Window;
    //   697: astore_2
    //   698: aload_2
    //   699: invokevirtual getAttributes : ()Landroid/view/WindowManager$LayoutParams;
    //   702: astore_1
    //   703: aload_2
    //   704: bipush #80
    //   706: invokevirtual setGravity : (I)V
    //   709: aload_0
    //   710: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   713: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   716: ldc_w 'window'
    //   719: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   722: checkcast android/view/WindowManager
    //   725: astore_3
    //   726: aload_3
    //   727: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
    //   732: invokevirtual getWidth : ()I
    //   735: istore #4
    //   737: aload_3
    //   738: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
    //   743: invokevirtual getHeight : ()I
    //   746: istore #5
    //   748: aload_1
    //   749: iload #4
    //   751: putfield width : I
    //   754: aload_1
    //   755: iload #5
    //   757: iconst_2
    //   758: idiv
    //   759: putfield height : I
    //   762: aload_2
    //   763: aload_1
    //   764: invokevirtual setAttributes : (Landroid/view/WindowManager$LayoutParams;)V
    //   767: goto -> 2088
    //   770: astore_1
    //   771: aload_1
    //   772: invokevirtual printStackTrace : ()V
    //   775: goto -> 2088
    //   778: aload_0
    //   779: getfield w : Landroid/widget/PopupWindow;
    //   782: invokevirtual dismiss : ()V
    //   785: new android/content/Intent
    //   788: astore_1
    //   789: aload_1
    //   790: ldc_w 'android.intent.action.VIEW'
    //   793: invokespecial <init> : (Ljava/lang/String;)V
    //   796: new java/lang/StringBuilder
    //   799: astore_2
    //   800: aload_2
    //   801: invokespecial <init> : ()V
    //   804: aload_2
    //   805: ldc_w 'https://www.google.com/search?q='
    //   808: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   811: pop
    //   812: aload_2
    //   813: aload_0
    //   814: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   817: invokevirtual p : ()Ljava/lang/String;
    //   820: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   823: pop
    //   824: aload_1
    //   825: aload_2
    //   826: invokevirtual toString : ()Ljava/lang/String;
    //   829: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   832: invokevirtual setData : (Landroid/net/Uri;)Landroid/content/Intent;
    //   835: pop
    //   836: aload_1
    //   837: ldc_w 'android.intent.category.BROWSABLE'
    //   840: invokevirtual addCategory : (Ljava/lang/String;)Landroid/content/Intent;
    //   843: pop
    //   844: aload_1
    //   845: aload_0
    //   846: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   849: invokevirtual resolveActivity : (Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
    //   852: ifnull -> 2088
    //   855: aload_0
    //   856: aload_1
    //   857: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   860: aload_0
    //   861: ldc_w 2130771968
    //   864: ldc_w 2130771969
    //   867: invokevirtual overridePendingTransition : (II)V
    //   870: goto -> 2088
    //   873: astore_1
    //   874: aload_1
    //   875: invokevirtual printStackTrace : ()V
    //   878: goto -> 2088
    //   881: aload_0
    //   882: invokespecial b1 : ()V
    //   885: goto -> 2088
    //   888: aload_0
    //   889: invokespecial R0 : ()V
    //   892: goto -> 2088
    //   895: aload_0
    //   896: getfield w : Landroid/widget/PopupWindow;
    //   899: invokevirtual dismiss : ()V
    //   902: aload_0
    //   903: invokespecial T0 : ()V
    //   906: goto -> 2088
    //   909: aload_0
    //   910: getfield w : Landroid/widget/PopupWindow;
    //   913: invokevirtual dismiss : ()V
    //   916: aload_0
    //   917: invokespecial S0 : ()V
    //   920: goto -> 2088
    //   923: aload_0
    //   924: getfield w : Landroid/widget/PopupWindow;
    //   927: invokevirtual dismiss : ()V
    //   930: aload_0
    //   931: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   934: invokevirtual p : ()Ljava/lang/String;
    //   937: invokestatic v0 : (Ljava/lang/String;)Z
    //   940: ifne -> 988
    //   943: aload_0
    //   944: ldc_w 'clipboard'
    //   947: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   950: checkcast android/content/ClipboardManager
    //   953: aconst_null
    //   954: aload_0
    //   955: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   958: invokevirtual p : ()Ljava/lang/String;
    //   961: invokestatic newPlainText : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;
    //   964: invokevirtual setPrimaryClip : (Landroid/content/ClipData;)V
    //   967: aload_0
    //   968: aload_0
    //   969: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   972: ldc_w 2131755263
    //   975: invokevirtual getString : (I)Ljava/lang/String;
    //   978: iconst_1
    //   979: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   982: invokevirtual show : ()V
    //   985: goto -> 2088
    //   988: aload_0
    //   989: aload_0
    //   990: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   993: ldc_w 2131755829
    //   996: invokevirtual getString : (I)Ljava/lang/String;
    //   999: iconst_0
    //   1000: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1003: invokevirtual show : ()V
    //   1006: goto -> 2088
    //   1009: astore_1
    //   1010: aload_1
    //   1011: invokevirtual printStackTrace : ()V
    //   1014: goto -> 2088
    //   1017: aload_0
    //   1018: invokespecial Q0 : ()V
    //   1021: goto -> 2088
    //   1024: aload_0
    //   1025: getfield w : Landroid/widget/PopupWindow;
    //   1028: invokevirtual dismiss : ()V
    //   1031: aload_0
    //   1032: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1035: astore_1
    //   1036: aload_1
    //   1037: ifnull -> 1057
    //   1040: aload_1
    //   1041: invokevirtual p : ()Ljava/lang/String;
    //   1044: invokestatic v0 : (Ljava/lang/String;)Z
    //   1047: ifne -> 1057
    //   1050: aload_0
    //   1051: invokespecial c1 : ()V
    //   1054: goto -> 2088
    //   1057: aload_0
    //   1058: aload_0
    //   1059: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1062: ldc_w 2131755829
    //   1065: invokevirtual getString : (I)Ljava/lang/String;
    //   1068: iconst_0
    //   1069: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1072: invokevirtual show : ()V
    //   1075: goto -> 2088
    //   1078: astore_1
    //   1079: aload_1
    //   1080: invokevirtual printStackTrace : ()V
    //   1083: goto -> 2088
    //   1086: aload_0
    //   1087: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1090: astore_1
    //   1091: aload_1
    //   1092: ifnull -> 1121
    //   1095: aload_1
    //   1096: invokevirtual p : ()Ljava/lang/String;
    //   1099: invokestatic v0 : (Ljava/lang/String;)Z
    //   1102: ifne -> 1121
    //   1105: aload_0
    //   1106: invokespecial c1 : ()V
    //   1109: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   1112: ldc_w 'btn_add_block'
    //   1115: invokevirtual c : (Ljava/lang/String;)V
    //   1118: goto -> 2088
    //   1121: aload_0
    //   1122: aload_0
    //   1123: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1126: ldc_w 2131755829
    //   1129: invokevirtual getString : (I)Ljava/lang/String;
    //   1132: iconst_0
    //   1133: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1136: invokevirtual show : ()V
    //   1139: goto -> 2088
    //   1142: astore_1
    //   1143: aload_1
    //   1144: invokevirtual printStackTrace : ()V
    //   1147: goto -> 2088
    //   1150: aload_0
    //   1151: getfield Y : Ljava/lang/String;
    //   1154: ifnull -> 2088
    //   1157: aload_0
    //   1158: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1161: astore_1
    //   1162: aload_1
    //   1163: ifnull -> 1200
    //   1166: aload_1
    //   1167: invokevirtual p : ()Ljava/lang/String;
    //   1170: invokestatic k : (Ljava/lang/String;)Z
    //   1173: ifeq -> 1200
    //   1176: aload_0
    //   1177: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1180: aload_0
    //   1181: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1184: ldc_w 2131755653
    //   1187: invokevirtual getString : (I)Ljava/lang/String;
    //   1190: iconst_0
    //   1191: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1194: invokevirtual show : ()V
    //   1197: goto -> 2088
    //   1200: new android/content/Intent
    //   1203: astore_2
    //   1204: aload_2
    //   1205: aload_0
    //   1206: ldc_w com/allinone/callerid/mvc/controller/report/ReportSubtypeActivity
    //   1209: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1212: new android/os/Bundle
    //   1215: astore_1
    //   1216: aload_1
    //   1217: invokespecial <init> : ()V
    //   1220: aload_1
    //   1221: ldc_w 'contact_subtype_activity'
    //   1224: aload_0
    //   1225: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1228: invokevirtual putParcelable : (Ljava/lang/String;Landroid/os/Parcelable;)V
    //   1231: aload_2
    //   1232: aload_1
    //   1233: invokevirtual putExtras : (Landroid/os/Bundle;)Landroid/content/Intent;
    //   1236: pop
    //   1237: aload_0
    //   1238: aload_2
    //   1239: bipush #110
    //   1241: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   1244: aload_0
    //   1245: ldc_w 2130772034
    //   1248: iconst_0
    //   1249: invokevirtual overridePendingTransition : (II)V
    //   1252: goto -> 2088
    //   1255: astore_1
    //   1256: aload_1
    //   1257: invokevirtual printStackTrace : ()V
    //   1260: goto -> 2088
    //   1263: aload_0
    //   1264: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1267: astore_1
    //   1268: aload_1
    //   1269: ifnull -> 1307
    //   1272: aload_1
    //   1273: invokevirtual p : ()Ljava/lang/String;
    //   1276: invokestatic v0 : (Ljava/lang/String;)Z
    //   1279: ifne -> 1307
    //   1282: aload_0
    //   1283: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1286: invokevirtual p : ()Ljava/lang/String;
    //   1289: astore_2
    //   1290: new com/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity$j0
    //   1293: astore_1
    //   1294: aload_1
    //   1295: aload_0
    //   1296: invokespecial <init> : (Lcom/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity;)V
    //   1299: aload_2
    //   1300: aload_1
    //   1301: invokestatic d : (Ljava/lang/String;Lcom/allinone/callerid/i/a/l/a;)V
    //   1304: goto -> 1333
    //   1307: aload_0
    //   1308: aload_0
    //   1309: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1312: ldc_w 2131755829
    //   1315: invokevirtual getString : (I)Ljava/lang/String;
    //   1318: iconst_0
    //   1319: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1322: invokevirtual show : ()V
    //   1325: goto -> 1333
    //   1328: astore_1
    //   1329: aload_1
    //   1330: invokevirtual printStackTrace : ()V
    //   1333: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   1336: ldc_w 'btn_suggest'
    //   1339: invokevirtual c : (Ljava/lang/String;)V
    //   1342: goto -> 2088
    //   1345: aload_0
    //   1346: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1349: invokevirtual p : ()Ljava/lang/String;
    //   1352: invokestatic v0 : (Ljava/lang/String;)Z
    //   1355: ifne -> 1433
    //   1358: new android/content/Intent
    //   1361: astore_1
    //   1362: aload_1
    //   1363: ldc_w 'android.intent.action.VIEW'
    //   1366: invokespecial <init> : (Ljava/lang/String;)V
    //   1369: aload_1
    //   1370: ldc_w 'vnd.android-dir/mms-sms'
    //   1373: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   1376: pop
    //   1377: new java/lang/StringBuilder
    //   1380: astore_2
    //   1381: aload_2
    //   1382: invokespecial <init> : ()V
    //   1385: aload_2
    //   1386: ldc_w 'smsto:'
    //   1389: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1392: pop
    //   1393: aload_2
    //   1394: aload_0
    //   1395: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1398: invokevirtual p : ()Ljava/lang/String;
    //   1401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1404: pop
    //   1405: aload_1
    //   1406: aload_2
    //   1407: invokevirtual toString : ()Ljava/lang/String;
    //   1410: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1413: invokevirtual setData : (Landroid/net/Uri;)Landroid/content/Intent;
    //   1416: pop
    //   1417: aload_1
    //   1418: ldc_w 268468224
    //   1421: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   1424: pop
    //   1425: aload_0
    //   1426: aload_1
    //   1427: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   1430: goto -> 1459
    //   1433: aload_0
    //   1434: aload_0
    //   1435: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1438: ldc_w 2131755829
    //   1441: invokevirtual getString : (I)Ljava/lang/String;
    //   1444: iconst_0
    //   1445: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1448: invokevirtual show : ()V
    //   1451: goto -> 1459
    //   1454: astore_1
    //   1455: aload_1
    //   1456: invokevirtual printStackTrace : ()V
    //   1459: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   1462: ldc_w 'btn_contact_sms'
    //   1465: invokevirtual c : (Ljava/lang/String;)V
    //   1468: goto -> 2088
    //   1471: aload_0
    //   1472: getfield Y : Ljava/lang/String;
    //   1475: ifnull -> 1576
    //   1478: aload_0
    //   1479: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1482: astore_1
    //   1483: aload_1
    //   1484: ifnull -> 1521
    //   1487: aload_1
    //   1488: invokevirtual p : ()Ljava/lang/String;
    //   1491: invokestatic k : (Ljava/lang/String;)Z
    //   1494: ifeq -> 1521
    //   1497: aload_0
    //   1498: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1501: aload_0
    //   1502: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1505: ldc_w 2131755653
    //   1508: invokevirtual getString : (I)Ljava/lang/String;
    //   1511: iconst_0
    //   1512: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1515: invokevirtual show : ()V
    //   1518: goto -> 2088
    //   1521: new android/content/Intent
    //   1524: astore_1
    //   1525: aload_1
    //   1526: aload_0
    //   1527: ldc_w com/allinone/callerid/mvc/controller/report/ReportSubtypeActivity
    //   1530: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1533: new android/os/Bundle
    //   1536: astore_2
    //   1537: aload_2
    //   1538: invokespecial <init> : ()V
    //   1541: aload_2
    //   1542: ldc_w 'contact_subtype_activity'
    //   1545: aload_0
    //   1546: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1549: invokevirtual putParcelable : (Ljava/lang/String;Landroid/os/Parcelable;)V
    //   1552: aload_1
    //   1553: aload_2
    //   1554: invokevirtual putExtras : (Landroid/os/Bundle;)Landroid/content/Intent;
    //   1557: pop
    //   1558: aload_0
    //   1559: aload_1
    //   1560: bipush #110
    //   1562: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   1565: aload_0
    //   1566: ldc_w 2130772034
    //   1569: iconst_0
    //   1570: invokevirtual overridePendingTransition : (II)V
    //   1573: goto -> 2088
    //   1576: aload_0
    //   1577: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1580: astore_1
    //   1581: aload_1
    //   1582: ifnull -> 1646
    //   1585: aload_1
    //   1586: invokevirtual p : ()Ljava/lang/String;
    //   1589: ifnull -> 1646
    //   1592: ldc_w ''
    //   1595: aload_0
    //   1596: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1599: invokevirtual p : ()Ljava/lang/String;
    //   1602: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1605: ifne -> 1646
    //   1608: aload_0
    //   1609: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1612: invokevirtual p : ()Ljava/lang/String;
    //   1615: invokestatic v0 : (Ljava/lang/String;)Z
    //   1618: ifne -> 1646
    //   1621: aload_0
    //   1622: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1625: invokevirtual p : ()Ljava/lang/String;
    //   1628: astore_2
    //   1629: new com/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity$l0
    //   1632: astore_1
    //   1633: aload_1
    //   1634: aload_0
    //   1635: invokespecial <init> : (Lcom/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity;)V
    //   1638: aload_2
    //   1639: aload_1
    //   1640: invokestatic a : (Ljava/lang/String;Lcom/allinone/callerid/i/a/l/a;)V
    //   1643: goto -> 1672
    //   1646: aload_0
    //   1647: aload_0
    //   1648: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1651: ldc_w 2131755829
    //   1654: invokevirtual getString : (I)Ljava/lang/String;
    //   1657: iconst_0
    //   1658: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1661: invokevirtual show : ()V
    //   1664: goto -> 1672
    //   1667: astore_1
    //   1668: aload_1
    //   1669: invokevirtual printStackTrace : ()V
    //   1672: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   1675: ldc_w 'btn_add_report'
    //   1678: invokevirtual c : (Ljava/lang/String;)V
    //   1681: goto -> 2088
    //   1684: astore_1
    //   1685: aload_1
    //   1686: invokevirtual printStackTrace : ()V
    //   1689: goto -> 2088
    //   1692: aload_0
    //   1693: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1696: astore_1
    //   1697: aload_1
    //   1698: ifnull -> 1925
    //   1701: aload_1
    //   1702: invokevirtual p : ()Ljava/lang/String;
    //   1705: invokestatic v0 : (Ljava/lang/String;)Z
    //   1708: istore #6
    //   1710: iload #6
    //   1712: ifne -> 1925
    //   1715: new android/content/Intent
    //   1718: astore_1
    //   1719: aload_1
    //   1720: ldc_w 'android.intent.action.INSERT_OR_EDIT'
    //   1723: invokespecial <init> : (Ljava/lang/String;)V
    //   1726: aload_1
    //   1727: ldc_w 'vnd.android.cursor.item/contact'
    //   1730: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   1733: pop
    //   1734: aload_1
    //   1735: ldc_w 'phone'
    //   1738: aload_0
    //   1739: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1742: invokevirtual p : ()Ljava/lang/String;
    //   1745: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1748: pop
    //   1749: aload_0
    //   1750: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1753: invokevirtual y : ()Ljava/lang/String;
    //   1756: ifnull -> 1790
    //   1759: ldc_w ''
    //   1762: aload_0
    //   1763: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1766: invokevirtual y : ()Ljava/lang/String;
    //   1769: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1772: ifne -> 1790
    //   1775: aload_1
    //   1776: ldc_w 'name'
    //   1779: aload_0
    //   1780: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1783: invokevirtual y : ()Ljava/lang/String;
    //   1786: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1789: pop
    //   1790: aload_0
    //   1791: aload_1
    //   1792: sipush #200
    //   1795: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   1798: goto -> 1951
    //   1801: astore_1
    //   1802: aload_1
    //   1803: invokevirtual printStackTrace : ()V
    //   1806: new android/content/Intent
    //   1809: astore_1
    //   1810: aload_1
    //   1811: ldc_w 'android.intent.action.INSERT'
    //   1814: invokespecial <init> : (Ljava/lang/String;)V
    //   1817: aload_1
    //   1818: ldc_w 'vnd.android.cursor.dir/person'
    //   1821: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   1824: pop
    //   1825: aload_1
    //   1826: ldc_w 'vnd.android.cursor.dir/contact'
    //   1829: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   1832: pop
    //   1833: aload_1
    //   1834: ldc_w 'vnd.android.cursor.dir/raw_contact'
    //   1837: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   1840: pop
    //   1841: aload_1
    //   1842: ldc_w 'phone_type'
    //   1845: iconst_2
    //   1846: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   1849: pop
    //   1850: aload_1
    //   1851: ldc_w 'phone'
    //   1854: aload_0
    //   1855: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1858: invokevirtual p : ()Ljava/lang/String;
    //   1861: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1864: pop
    //   1865: aload_0
    //   1866: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1869: invokevirtual y : ()Ljava/lang/String;
    //   1872: ifnull -> 1906
    //   1875: ldc_w ''
    //   1878: aload_0
    //   1879: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1882: invokevirtual y : ()Ljava/lang/String;
    //   1885: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1888: ifne -> 1906
    //   1891: aload_1
    //   1892: ldc_w 'name'
    //   1895: aload_0
    //   1896: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1899: invokevirtual y : ()Ljava/lang/String;
    //   1902: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1905: pop
    //   1906: aload_0
    //   1907: aload_1
    //   1908: sipush #200
    //   1911: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   1914: goto -> 1951
    //   1917: astore_1
    //   1918: aload_1
    //   1919: invokevirtual printStackTrace : ()V
    //   1922: goto -> 1951
    //   1925: aload_0
    //   1926: aload_0
    //   1927: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1930: ldc_w 2131755829
    //   1933: invokevirtual getString : (I)Ljava/lang/String;
    //   1936: iconst_0
    //   1937: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1940: invokevirtual show : ()V
    //   1943: goto -> 1951
    //   1946: astore_1
    //   1947: aload_1
    //   1948: invokevirtual printStackTrace : ()V
    //   1951: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   1954: ldc_w 'btn_add_contact'
    //   1957: invokevirtual c : (Ljava/lang/String;)V
    //   1960: goto -> 2088
    //   1963: aload_0
    //   1964: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   1967: astore_1
    //   1968: aload_1
    //   1969: ifnull -> 1998
    //   1972: aload_1
    //   1973: invokevirtual p : ()Ljava/lang/String;
    //   1976: invokestatic v0 : (Ljava/lang/String;)Z
    //   1979: ifne -> 1998
    //   1982: aload_0
    //   1983: invokespecial c1 : ()V
    //   1986: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   1989: ldc_w 'btn_add_block'
    //   1992: invokevirtual c : (Ljava/lang/String;)V
    //   1995: goto -> 2088
    //   1998: aload_0
    //   1999: aload_0
    //   2000: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2003: ldc_w 2131755829
    //   2006: invokevirtual getString : (I)Ljava/lang/String;
    //   2009: iconst_0
    //   2010: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   2013: invokevirtual show : ()V
    //   2016: goto -> 2088
    //   2019: astore_1
    //   2020: aload_1
    //   2021: invokevirtual printStackTrace : ()V
    //   2024: goto -> 2088
    //   2027: aload_0
    //   2028: getfield W : Lcom/allinone/callerid/search/CallLogBean;
    //   2031: astore_1
    //   2032: aload_1
    //   2033: ifnull -> 2062
    //   2036: aload_1
    //   2037: invokevirtual p : ()Ljava/lang/String;
    //   2040: invokestatic v0 : (Ljava/lang/String;)Z
    //   2043: ifne -> 2062
    //   2046: aload_0
    //   2047: invokespecial c1 : ()V
    //   2050: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   2053: ldc_w 'btn_add_block'
    //   2056: invokevirtual c : (Ljava/lang/String;)V
    //   2059: goto -> 2088
    //   2062: aload_0
    //   2063: aload_0
    //   2064: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2067: ldc_w 2131755829
    //   2070: invokevirtual getString : (I)Ljava/lang/String;
    //   2073: iconst_0
    //   2074: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   2077: invokevirtual show : ()V
    //   2080: goto -> 2088
    //   2083: astore_1
    //   2084: aload_1
    //   2085: invokevirtual printStackTrace : ()V
    //   2088: return
    // Exception table:
    //   from	to	target	type
    //   386	391	451	java/lang/Exception
    //   395	427	451	java/lang/Exception
    //   430	448	451	java/lang/Exception
    //   459	508	511	java/lang/Exception
    //   519	550	553	java/lang/Exception
    //   561	592	595	java/lang/Exception
    //   603	767	770	java/lang/Exception
    //   785	870	873	java/lang/Exception
    //   930	985	1009	java/lang/Exception
    //   988	1006	1009	java/lang/Exception
    //   1031	1036	1078	java/lang/Exception
    //   1040	1054	1078	java/lang/Exception
    //   1057	1075	1078	java/lang/Exception
    //   1086	1091	1142	java/lang/Exception
    //   1095	1118	1142	java/lang/Exception
    //   1121	1139	1142	java/lang/Exception
    //   1150	1162	1255	java/lang/Exception
    //   1166	1197	1255	java/lang/Exception
    //   1200	1252	1255	java/lang/Exception
    //   1263	1268	1328	java/lang/Exception
    //   1272	1304	1328	java/lang/Exception
    //   1307	1325	1328	java/lang/Exception
    //   1345	1430	1454	java/lang/Exception
    //   1433	1451	1454	java/lang/Exception
    //   1471	1483	1684	java/lang/Exception
    //   1487	1518	1684	java/lang/Exception
    //   1521	1573	1684	java/lang/Exception
    //   1576	1581	1667	java/lang/Exception
    //   1585	1643	1667	java/lang/Exception
    //   1646	1664	1667	java/lang/Exception
    //   1668	1672	1684	java/lang/Exception
    //   1672	1681	1684	java/lang/Exception
    //   1692	1697	1946	java/lang/Exception
    //   1701	1710	1946	java/lang/Exception
    //   1715	1790	1801	java/lang/Exception
    //   1790	1798	1801	java/lang/Exception
    //   1802	1806	1946	java/lang/Exception
    //   1806	1906	1917	java/lang/Exception
    //   1906	1914	1917	java/lang/Exception
    //   1918	1922	1946	java/lang/Exception
    //   1925	1943	1946	java/lang/Exception
    //   1963	1968	2019	java/lang/Exception
    //   1972	1995	2019	java/lang/Exception
    //   1998	2016	2019	java/lang/Exception
    //   2027	2032	2083	android/content/res/Resources$NotFoundException
    //   2036	2059	2083	android/content/res/Resources$NotFoundException
    //   2062	2080	2083	android/content/res/Resources$NotFoundException
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.C = new o0(this);
    b.p.a.a.b(getApplicationContext()).c(this.C, new IntentFilter("com.allinone.callerid.REPORT_BLOCK"));
    Intent intent = getIntent();
    if (intent != null) {
      this.W = (CallLogBean)intent.getParcelableExtra("contact_tony");
      this.a0 = intent.getBooleanExtra("is_to_comment", false);
      this.e0 = intent.getBooleanExtra("is_missed", false);
      CallLogBean callLogBean1 = this.W;
      if (callLogBean1 != null && callLogBean1.N() != null && !"".equals(this.W.N()) && this.W.x() != null && !this.W.x().equals("0")) {
        setTheme(2131820557);
        this.D = true;
        com.allinone.callerid.util.g0.v(getApplicationContext());
        this.X = this.W.N();
        this.Y = this.W.H();
      } 
    } 
    String str = this.Y;
    if (str == null || "".equals(str)) {
      str = com.allinone.callerid.util.p.d(getApplicationContext()).getIso_code();
      if (this.W != null && str != null && str.equals("US/USA")) {
        this.W.X0("");
        this.Y = "";
      } 
    } 
    CallLogBean callLogBean = this.W;
    if (callLogBean != null && callLogBean.e() != null && !"".equals(this.W.e()))
      com.allinone.callerid.util.q.b().c("unknow_content_has_comment"); 
    setContentView(2131492964);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    com.allinone.callerid.util.q.b().c("number_content_show");
    V0();
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      b.p.a.a.b(getApplicationContext()).e(this.C);
      AppBarLayout appBarLayout = this.H;
      if (appBarLayout != null) {
        AppBarStateChangeListener appBarStateChangeListener = this.I;
        if (appBarStateChangeListener != null)
          appBarLayout.p((AppBarLayout.d)appBarStateChangeListener); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      U0();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
    this.f0.postDelayed(new e0(this), 800L);
    if (com.allinone.callerid.util.k1.b.a) {
      if (com.allinone.callerid.util.k1.b.b(getApplicationContext()))
        com.allinone.callerid.util.q.b().c("dialog_notifi_per_tip_enalbleed"); 
      com.allinone.callerid.util.k1.b.a = false;
      c1();
    } 
  }
  
  class a implements Runnable {
    a(UnknownContactActivity this$0) {}
    
    public void run() {
      UnknownContactActivity.O(this.b);
      UnknownContactActivity.R(this.b, new a(this));
      if (UnknownContactActivity.Q(this.b) != null && UnknownContactActivity.P(this.b) != null)
        UnknownContactActivity.Q(this.b).b((AppBarLayout.d)UnknownContactActivity.P(this.b)); 
      UnknownContactActivity.S(this.b);
      UnknownContactActivity.T(this.b);
      UnknownContactActivity.U(this.b);
    }
    
    class a extends AppBarStateChangeListener {
      a(UnknownContactActivity.a this$0) {}
      
      public void b(AppBarLayout param2AppBarLayout, AppBarStateChangeListener.State param2State) {
        try {
          if (com.allinone.callerid.util.d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("state:");
            stringBuilder.append(param2State);
            com.allinone.callerid.util.d0.a("tony", stringBuilder.toString());
          } 
          AppBarStateChangeListener.State state = AppBarStateChangeListener.State.b;
          if (param2State == state) {
            if (UnknownContactActivity.b0(this.b.b).T()) {
              UnknownContactActivity.n0(this.b.b).setVisibility(0);
            } else {
              UnknownContactActivity.y0(this.b.b).setVisibility(0);
            } 
            UnknownContactActivity.J0(this.b.b).setVisibility(8);
            UnknownContactActivity.K0(this.b.b).setVisibility(0);
            if ((UnknownContactActivity.L0(this.b.b) != null && !"".equals(UnknownContactActivity.L0(this.b.b))) || (UnknownContactActivity.M0(this.b.b) != null && !"".equals(UnknownContactActivity.M0(this.b.b))))
              UnknownContactActivity.N0(this.b.b).setVisibility(0); 
          } else if (param2State == AppBarStateChangeListener.State.c) {
            if (UnknownContactActivity.b0(this.b.b).T()) {
              UnknownContactActivity.n0(this.b.b).setVisibility(4);
            } else {
              UnknownContactActivity.y0(this.b.b).setVisibility(4);
            } 
            if ((UnknownContactActivity.L0(this.b.b) != null && !"".equals(UnknownContactActivity.L0(this.b.b))) || (UnknownContactActivity.M0(this.b.b) != null && !"".equals(UnknownContactActivity.M0(this.b.b))))
              UnknownContactActivity.N0(this.b.b).setVisibility(4); 
            UnknownContactActivity.J0(this.b.b).setVisibility(0);
            UnknownContactActivity.K0(this.b.b).setVisibility(4);
          } else {
            if (UnknownContactActivity.b0(this.b.b).T()) {
              UnknownContactActivity.n0(this.b.b).setVisibility(0);
            } else {
              UnknownContactActivity.y0(this.b.b).setVisibility(0);
            } 
            UnknownContactActivity.J0(this.b.b).setVisibility(8);
            UnknownContactActivity.K0(this.b.b).setVisibility(0);
            if ((UnknownContactActivity.L0(this.b.b) != null && !"".equals(UnknownContactActivity.L0(this.b.b))) || (UnknownContactActivity.M0(this.b.b) != null && !"".equals(UnknownContactActivity.M0(this.b.b))))
              UnknownContactActivity.N0(this.b.b).setVisibility(0); 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a extends AppBarStateChangeListener {
    a(UnknownContactActivity this$0) {}
    
    public void b(AppBarLayout param1AppBarLayout, AppBarStateChangeListener.State param1State) {
      try {
        if (com.allinone.callerid.util.d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("state:");
          stringBuilder.append(param1State);
          com.allinone.callerid.util.d0.a("tony", stringBuilder.toString());
        } 
        AppBarStateChangeListener.State state = AppBarStateChangeListener.State.b;
        if (param1State == state) {
          if (UnknownContactActivity.b0(this.b.b).T()) {
            UnknownContactActivity.n0(this.b.b).setVisibility(0);
          } else {
            UnknownContactActivity.y0(this.b.b).setVisibility(0);
          } 
          UnknownContactActivity.J0(this.b.b).setVisibility(8);
          UnknownContactActivity.K0(this.b.b).setVisibility(0);
          if ((UnknownContactActivity.L0(this.b.b) != null && !"".equals(UnknownContactActivity.L0(this.b.b))) || (UnknownContactActivity.M0(this.b.b) != null && !"".equals(UnknownContactActivity.M0(this.b.b))))
            UnknownContactActivity.N0(this.b.b).setVisibility(0); 
        } else if (param1State == AppBarStateChangeListener.State.c) {
          if (UnknownContactActivity.b0(this.b.b).T()) {
            UnknownContactActivity.n0(this.b.b).setVisibility(4);
          } else {
            UnknownContactActivity.y0(this.b.b).setVisibility(4);
          } 
          if ((UnknownContactActivity.L0(this.b.b) != null && !"".equals(UnknownContactActivity.L0(this.b.b))) || (UnknownContactActivity.M0(this.b.b) != null && !"".equals(UnknownContactActivity.M0(this.b.b))))
            UnknownContactActivity.N0(this.b.b).setVisibility(4); 
          UnknownContactActivity.J0(this.b.b).setVisibility(0);
          UnknownContactActivity.K0(this.b.b).setVisibility(4);
        } else {
          if (UnknownContactActivity.b0(this.b.b).T()) {
            UnknownContactActivity.n0(this.b.b).setVisibility(0);
          } else {
            UnknownContactActivity.y0(this.b.b).setVisibility(0);
          } 
          UnknownContactActivity.J0(this.b.b).setVisibility(8);
          UnknownContactActivity.K0(this.b.b).setVisibility(0);
          if ((UnknownContactActivity.L0(this.b.b) != null && !"".equals(UnknownContactActivity.L0(this.b.b))) || (UnknownContactActivity.M0(this.b.b) != null && !"".equals(UnknownContactActivity.M0(this.b.b))))
            UnknownContactActivity.N0(this.b.b).setVisibility(0); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class a0 implements com.allinone.callerid.i.a.p.e {
    a0(UnknownContactActivity this$0) {}
    
    public void a(String param1String) {
      if (param1String != null) {
        try {
          UnknownContactActivity.K0(this.a).setText(param1String);
          UnknownContactActivity.y0(this.a).setVisibility(8);
          UnknownContactActivity.b0(this.a).B0(param1String);
          UnknownContactActivity.b0(this.a).U0("0");
          UnknownContactActivity.b0(this.a).o0(true);
          UnknownContactActivity.J0(this.a).setText(param1String);
          UnknownContactActivity.n0(this.a).setVisibility(0);
          UnknownContactActivity.u0(this.a).setVisibility(0);
          UnknownContactActivity.v0(this.a).setVisibility(8);
          UnknownContactActivity.w0(this.a).setVisibility(0);
          try {
            if (Build.VERSION.SDK_INT >= 21) {
              Window window = this.a.getWindow();
              window.addFlags(-2147483648);
              window.setStatusBarColor(UnknownContactActivity.x0(this.a));
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          UnknownContactActivity.A0(this.a).setBackgroundColor(UnknownContactActivity.z0(this.a));
          UnknownContactActivity.B0(this.a).setImageResource(2131231148);
          if (UnknownContactActivity.a0(this.a) != null)
            UnknownContactActivity.a0(this.a).b(false, ""); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else if (UnknownContactActivity.b0(this.a).n() != null && !"".equals(UnknownContactActivity.b0(this.a).n())) {
        UnknownContactActivity.K0(this.a).setText(UnknownContactActivity.b0(this.a).n());
      } else if (UnknownContactActivity.b0(this.a).y() != null && !"".equals(UnknownContactActivity.b0(this.a).y())) {
        UnknownContactActivity.K0(this.a).setText(UnknownContactActivity.b0(this.a).y());
      } else if (i1.v0(UnknownContactActivity.b0(this.a).p())) {
        UnknownContactActivity.J0(this.a).setText(this.a.getResources().getString(2131755829));
        UnknownContactActivity.K0(this.a).setText(this.a.getResources().getString(2131755829));
      } else {
        UnknownContactActivity.C0(this.a).setVisibility(0);
        if (UnknownContactActivity.b0(this.a).d() != null && !"".equals(UnknownContactActivity.b0(this.a).d())) {
          UnknownContactActivity.K0(this.a).setText(UnknownContactActivity.b0(this.a).d());
        } else if (UnknownContactActivity.b0(this.a).i() != null && !"".equals(UnknownContactActivity.b0(this.a).i())) {
          UnknownContactActivity.K0(this.a).setText(UnknownContactActivity.b0(this.a).i());
        } else {
          UnknownContactActivity.K0(this.a).setText(UnknownContactActivity.b0(this.a).p());
        } 
      } 
    }
  }
  
  class b implements com.allinone.callerid.i.a.l.a {
    b(UnknownContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("number_content", (Parcelable)UnknownContactActivity.b0(this.a));
        intent.putExtras(bundle);
        intent.setClass((Context)this.a, WriteCommentActivity.class);
        this.a.startActivityForResult(intent, 300);
        this.a.overridePendingTransition(2130771968, 2130771969);
      } else {
        Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755223), 0).show();
      } 
    }
  }
  
  class b0 implements com.allinone.callerid.i.a.p.c {
    b0(UnknownContactActivity this$0) {}
    
    public void a(long param1Long) {
      if (param1Long != 0L) {
        com.allinone.callerid.util.u.c((Activity)this.a, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, param1Long), "", 2131231148, UnknownContactActivity.B0(this.a));
      } else if (UnknownContactActivity.b0(this.a).a() != null && !"".equals(UnknownContactActivity.b0(this.a).a())) {
        UnknownContactActivity unknownContactActivity = this.a;
        com.allinone.callerid.util.u.a((Activity)unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).a(), 2131231148, UnknownContactActivity.B0(this.a));
      } else {
        UnknownContactActivity.B0(this.a).setImageResource(2131231148);
      } 
    }
  }
  
  class c implements Runnable {
    c(UnknownContactActivity this$0) {}
    
    public void run() {
      ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("content://com.android.contacts/data/phones/filter/");
      stringBuilder.append(UnknownContactActivity.b0(this.b).p());
      Cursor cursor = contentResolver.query(Uri.parse(stringBuilder.toString()), null, null, null, null);
      if (cursor != null && cursor.getCount() > 0) {
        cursor.moveToFirst();
        UnknownContactActivity.h0(this.b, cursor.getInt(cursor.getColumnIndex("contact_id")));
      } 
      if (cursor != null)
        cursor.close(); 
      this.b.runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(UnknownContactActivity.c this$0) {}
      
      public void run() {
        try {
          Intent intent = new Intent();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("content://com.android.contacts/contacts/");
          stringBuilder.append(UnknownContactActivity.g0(this.b.b));
          this("android.intent.action.EDIT", Uri.parse(stringBuilder.toString()));
          this.b.b.startActivityForResult(intent, 200);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(UnknownContactActivity this$0) {}
    
    public void run() {
      try {
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("content://com.android.contacts/contacts/");
        stringBuilder.append(UnknownContactActivity.g0(this.b.b));
        this("android.intent.action.EDIT", Uri.parse(stringBuilder.toString()));
        this.b.b.startActivityForResult(intent, 200);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class c0 implements com.allinone.callerid.i.a.e.a {
    c0(UnknownContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      try {
        boolean bool = this.a.isFinishing();
        if (!bool) {
          String str2;
          if (param1Boolean) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.a.getResources().getString(2131755825));
            stringBuilder.append(" ");
            stringBuilder.append(UnknownContactActivity.b0(this.a).p());
            str2 = stringBuilder.toString();
            str1 = this.a.getResources().getString(2131755826);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.a.getResources().getString(2131755114));
            stringBuilder.append(" ");
            stringBuilder.append(UnknownContactActivity.b0(this.a).p());
            stringBuilder.append(" ?");
            str2 = stringBuilder.toString();
            str1 = this.a.getResources().getString(2131755116);
          } 
          androidx.appcompat.app.a.a a3 = new androidx.appcompat.app.a.a();
          this((Context)this.a);
          a3 = a3.h(str2);
          b b = new b();
          this(this);
          a3 = a3.n(str1, b);
          String str1 = this.a.getResources().getString(2131755180);
          a a2 = new a();
          this(this);
          androidx.appcompat.app.a a1 = a3.j(str1, a2).a();
          a1.show();
          a1.g(-1).setTextColor(UnknownContactActivity.m0(this.a));
          a1.g(-2).setTextColor(this.a.getResources().getColor(2131099695));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(UnknownContactActivity.c0 this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(UnknownContactActivity.c0 this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str = UnknownContactActivity.b0(this.b.a).p().replace("-", "");
          if (str != null && !"".equals(str)) {
            a a = new a();
            this(this, str);
            com.allinone.callerid.i.a.e.b.b(str, a);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
      
      class a implements com.allinone.callerid.i.a.e.a {
        a(UnknownContactActivity.c0.b this$0, String param3String) {}
        
        public void a(boolean param3Boolean) {
          if (param3Boolean) {
            com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
          } else {
            com.allinone.callerid.util.q.b().c("block_dialog_click");
            EZBlackList eZBlackList = new EZBlackList();
            if (UnknownContactActivity.b0(this.b.b.a).n() != null && !"".equals(UnknownContactActivity.b0(this.b.b.a).n())) {
              eZBlackList.setName(UnknownContactActivity.b0(this.b.b.a).n());
            } else if (UnknownContactActivity.b0(this.b.b.a).y() != null && !"".equals(UnknownContactActivity.b0(this.b.b.a).y())) {
              eZBlackList.setName(UnknownContactActivity.b0(this.b.b.a).y());
            } else {
              eZBlackList.setName("");
            } 
            eZBlackList.setIs_myblock("true");
            eZBlackList.setNumber(this.a);
            com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this, eZBlackList));
          } 
        }
        
        class a implements com.allinone.callerid.i.a.a {
          a(UnknownContactActivity.c0.b.a this$0) {}
          
          public void a() {
            UnknownContactActivity.U(this.a.b.b.a);
            Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
          }
        }
        
        class b implements com.allinone.callerid.i.a.a {
          b(UnknownContactActivity.c0.b.a this$0, EZBlackList param4EZBlackList) {}
          
          public void a() {
            try {
              UnknownContactActivity.U(this.b.b.b.a);
              Toast.makeText(this.b.b.b.a.getApplicationContext(), this.b.b.b.a.getResources().getString(2131755131), 0).show();
              UnknownContactActivity.D0(this.b.b.b.a, this.a.getName(), UnknownContactActivity.b0(this.b.b.b.a).p());
              CollectInfo collectInfo = new CollectInfo();
              this();
              collectInfo.setNumber(UnknownContactActivity.b0(this.b.b.b.a).p());
              collectInfo.setUser_blocked("1");
              collectInfo.setUser_commented("0");
              collectInfo.setUser_reported("0");
              collectInfo.setUser_upload_recording("0");
              com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          }
        }
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(UnknownContactActivity.c0.b this$0) {}
        
        public void a() {
          UnknownContactActivity.U(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
        }
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(UnknownContactActivity.c0.b this$0, EZBlackList param3EZBlackList) {}
        
        public void a() {
          try {
            UnknownContactActivity.U(this.b.b.b.a);
            Toast.makeText(this.b.b.b.a.getApplicationContext(), this.b.b.b.a.getResources().getString(2131755131), 0).show();
            UnknownContactActivity.D0(this.b.b.b.a, this.a.getName(), UnknownContactActivity.b0(this.b.b.b.a).p());
            CollectInfo collectInfo = new CollectInfo();
            this();
            collectInfo.setNumber(UnknownContactActivity.b0(this.b.b.b.a).p());
            collectInfo.setUser_blocked("1");
            collectInfo.setUser_commented("0");
            collectInfo.setUser_reported("0");
            collectInfo.setUser_upload_recording("0");
            com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(UnknownContactActivity.c0 this$0, String param2String) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          com.allinone.callerid.util.q.b().c("block_dialog_click");
          EZBlackList eZBlackList = new EZBlackList();
          if (UnknownContactActivity.b0(this.b.b.a).n() != null && !"".equals(UnknownContactActivity.b0(this.b.b.a).n())) {
            eZBlackList.setName(UnknownContactActivity.b0(this.b.b.a).n());
          } else if (UnknownContactActivity.b0(this.b.b.a).y() != null && !"".equals(UnknownContactActivity.b0(this.b.b.a).y())) {
            eZBlackList.setName(UnknownContactActivity.b0(this.b.b.a).y());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setIs_myblock("true");
          eZBlackList.setNumber(this.a);
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this, eZBlackList));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(UnknownContactActivity.c0.b.a this$0) {}
        
        public void a() {
          UnknownContactActivity.U(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
        }
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(UnknownContactActivity.c0.b.a this$0, EZBlackList param4EZBlackList) {}
        
        public void a() {
          try {
            UnknownContactActivity.U(this.b.b.b.a);
            Toast.makeText(this.b.b.b.a.getApplicationContext(), this.b.b.b.a.getResources().getString(2131755131), 0).show();
            UnknownContactActivity.D0(this.b.b.b.a, this.a.getName(), UnknownContactActivity.b0(this.b.b.b.a).p());
            CollectInfo collectInfo = new CollectInfo();
            this();
            collectInfo.setNumber(UnknownContactActivity.b0(this.b.b.b.a).p());
            collectInfo.setUser_blocked("1");
            collectInfo.setUser_commented("0");
            collectInfo.setUser_reported("0");
            collectInfo.setUser_upload_recording("0");
            com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(UnknownContactActivity.c0 this$0) {}
      
      public void a() {
        UnknownContactActivity.U(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
      }
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(UnknownContactActivity.c0 this$0, EZBlackList param2EZBlackList) {}
      
      public void a() {
        try {
          UnknownContactActivity.U(this.b.b.b.a);
          Toast.makeText(this.b.b.b.a.getApplicationContext(), this.b.b.b.a.getResources().getString(2131755131), 0).show();
          UnknownContactActivity.D0(this.b.b.b.a, this.a.getName(), UnknownContactActivity.b0(this.b.b.b.a).p());
          CollectInfo collectInfo = new CollectInfo();
          this();
          collectInfo.setNumber(UnknownContactActivity.b0(this.b.b.b.a).p());
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(UnknownContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(UnknownContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str = UnknownContactActivity.b0(this.b.a).p().replace("-", "");
        if (str != null && !"".equals(str)) {
          a a = new a();
          this(this, str);
          com.allinone.callerid.i.a.e.b.b(str, a);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(UnknownContactActivity.c0.b this$0, String param3String) {}
      
      public void a(boolean param3Boolean) {
        if (param3Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          com.allinone.callerid.util.q.b().c("block_dialog_click");
          EZBlackList eZBlackList = new EZBlackList();
          if (UnknownContactActivity.b0(this.b.b.a).n() != null && !"".equals(UnknownContactActivity.b0(this.b.b.a).n())) {
            eZBlackList.setName(UnknownContactActivity.b0(this.b.b.a).n());
          } else if (UnknownContactActivity.b0(this.b.b.a).y() != null && !"".equals(UnknownContactActivity.b0(this.b.b.a).y())) {
            eZBlackList.setName(UnknownContactActivity.b0(this.b.b.a).y());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setIs_myblock("true");
          eZBlackList.setNumber(this.a);
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this, eZBlackList));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(UnknownContactActivity.c0.b.a this$0) {}
        
        public void a() {
          UnknownContactActivity.U(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
        }
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(UnknownContactActivity.c0.b.a this$0, EZBlackList param4EZBlackList) {}
        
        public void a() {
          try {
            UnknownContactActivity.U(this.b.b.b.a);
            Toast.makeText(this.b.b.b.a.getApplicationContext(), this.b.b.b.a.getResources().getString(2131755131), 0).show();
            UnknownContactActivity.D0(this.b.b.b.a, this.a.getName(), UnknownContactActivity.b0(this.b.b.b.a).p());
            CollectInfo collectInfo = new CollectInfo();
            this();
            collectInfo.setNumber(UnknownContactActivity.b0(this.b.b.b.a).p());
            collectInfo.setUser_blocked("1");
            collectInfo.setUser_commented("0");
            collectInfo.setUser_reported("0");
            collectInfo.setUser_upload_recording("0");
            com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(UnknownContactActivity.c0.b this$0) {}
      
      public void a() {
        UnknownContactActivity.U(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
      }
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(UnknownContactActivity.c0.b this$0, EZBlackList param3EZBlackList) {}
      
      public void a() {
        try {
          UnknownContactActivity.U(this.b.b.b.a);
          Toast.makeText(this.b.b.b.a.getApplicationContext(), this.b.b.b.a.getResources().getString(2131755131), 0).show();
          UnknownContactActivity.D0(this.b.b.b.a, this.a.getName(), UnknownContactActivity.b0(this.b.b.b.a).p());
          CollectInfo collectInfo = new CollectInfo();
          this();
          collectInfo.setNumber(UnknownContactActivity.b0(this.b.b.b.a).p());
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.e.a {
    a(UnknownContactActivity this$0, String param1String) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
      } else {
        com.allinone.callerid.util.q.b().c("block_dialog_click");
        EZBlackList eZBlackList = new EZBlackList();
        if (UnknownContactActivity.b0(this.b.b.a).n() != null && !"".equals(UnknownContactActivity.b0(this.b.b.a).n())) {
          eZBlackList.setName(UnknownContactActivity.b0(this.b.b.a).n());
        } else if (UnknownContactActivity.b0(this.b.b.a).y() != null && !"".equals(UnknownContactActivity.b0(this.b.b.a).y())) {
          eZBlackList.setName(UnknownContactActivity.b0(this.b.b.a).y());
        } else {
          eZBlackList.setName("");
        } 
        eZBlackList.setIs_myblock("true");
        eZBlackList.setNumber(this.a);
        com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this, eZBlackList));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(UnknownContactActivity.c0.b.a this$0) {}
      
      public void a() {
        UnknownContactActivity.U(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
      }
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(UnknownContactActivity.c0.b.a this$0, EZBlackList param4EZBlackList) {}
      
      public void a() {
        try {
          UnknownContactActivity.U(this.b.b.b.a);
          Toast.makeText(this.b.b.b.a.getApplicationContext(), this.b.b.b.a.getResources().getString(2131755131), 0).show();
          UnknownContactActivity.D0(this.b.b.b.a, this.a.getName(), UnknownContactActivity.b0(this.b.b.b.a).p());
          CollectInfo collectInfo = new CollectInfo();
          this();
          collectInfo.setNumber(UnknownContactActivity.b0(this.b.b.b.a).p());
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(UnknownContactActivity this$0) {}
    
    public void a() {
      UnknownContactActivity.U(this.a.b.b.a);
      Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
    }
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(UnknownContactActivity this$0, EZBlackList param1EZBlackList) {}
    
    public void a() {
      try {
        UnknownContactActivity.U(this.b.b.b.a);
        Toast.makeText(this.b.b.b.a.getApplicationContext(), this.b.b.b.a.getResources().getString(2131755131), 0).show();
        UnknownContactActivity.D0(this.b.b.b.a, this.a.getName(), UnknownContactActivity.b0(this.b.b.b.a).p());
        CollectInfo collectInfo = new CollectInfo();
        this();
        collectInfo.setNumber(UnknownContactActivity.b0(this.b.b.b.a).p());
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class d implements DialogInterface.OnClickListener {
    d(UnknownContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class d0 implements View.OnClickListener {
    d0(UnknownContactActivity this$0) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131296741) {
        if (i == 2131296968) {
          com.allinone.callerid.util.q.b().c("number_dialog_ingore");
          UnknownContactActivity.E0(this.b).dismiss();
        } 
      } else {
        com.allinone.callerid.util.q.b().c("number_dialog_share");
        File file = this.b.getExternalFilesDir("");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file);
        stringBuilder.append("/share.png");
        String str = stringBuilder.toString();
        if (com.allinone.callerid.util.d0.a) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("imageFilePath:");
          stringBuilder1.append(str);
          com.allinone.callerid.util.d0.a("shareimage", stringBuilder1.toString());
        } 
        UnknownContactActivity.F0(this.b, str);
        UnknownContactActivity.E0(this.b).dismiss();
      } 
    }
  }
  
  class e implements DialogInterface.OnClickListener {
    e(UnknownContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      UnknownContactActivity.i0(this.b).setVisibility(0);
      (new UnknownContactActivity.n0(this.b)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    }
  }
  
  class e0 implements Runnable {
    e0(UnknownContactActivity this$0) {}
    
    public void run() {
      try {
        int i = UnknownContactActivity.G0(this.b).getHeight();
        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams)UnknownContactActivity.H0(this.b).getLayoutParams();
        Toolbar.LayoutParams layoutParams1 = (Toolbar.LayoutParams)UnknownContactActivity.I0(this.b).getLayoutParams();
        String str = UnknownContactActivity.L0(this.b);
        if ((str != null && !"".equals(UnknownContactActivity.L0(this.b))) || (UnknownContactActivity.M0(this.b) != null && !"".equals(UnknownContactActivity.M0(this.b)))) {
          ((FrameLayout.LayoutParams)layoutParams).height = com.allinone.callerid.util.j.a(this.b.getApplicationContext(), 12.0F) + i - com.allinone.callerid.util.j.a(this.b.getApplicationContext(), 40.0F);
          ((ViewGroup.MarginLayoutParams)layoutParams1).height = i + com.allinone.callerid.util.j.a(this.b.getApplicationContext(), 12.0F) - com.allinone.callerid.util.j.a(this.b.getApplicationContext(), 40.0F);
        } else {
          ((FrameLayout.LayoutParams)layoutParams).height = com.allinone.callerid.util.j.a(this.b.getApplicationContext(), 12.0F) + i;
          ((ViewGroup.MarginLayoutParams)layoutParams1).height = i + com.allinone.callerid.util.j.a(this.b.getApplicationContext(), 12.0F);
        } 
        UnknownContactActivity.H0(this.b).setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        UnknownContactActivity.I0(this.b).setLayoutParams((ViewGroup.LayoutParams)layoutParams1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class f implements com.allinone.callerid.i.a.a {
    f(UnknownContactActivity this$0) {}
    
    public void a() {
      UnknownContactActivity.k0(this.a).setImageResource(2131231101);
      UnknownContactActivity.b0(this.a).U0("0");
    }
  }
  
  class f0 implements ViewPager.i {
    f0(UnknownContactActivity this$0) {}
    
    public void a(int param1Int1, float param1Float, int param1Int2) {}
    
    public void c(int param1Int) {}
    
    public void d(int param1Int) {
      if (UnknownContactActivity.b0(this.b) != null && (UnknownContactActivity.b0(this.b).e() == null || "".equals(UnknownContactActivity.b0(this.b).e())) && param1Int == 1)
        com.allinone.callerid.util.q.b().c("no_comment_tab_show"); 
      if (param1Int == 1 && UnknownContactActivity.c0(this.b).getVisibility() == 0)
        UnknownContactActivity.c0(this.b).setVisibility(8); 
    }
  }
  
  class g implements com.allinone.callerid.i.a.a {
    g(UnknownContactActivity this$0) {}
    
    public void a() {
      UnknownContactActivity.k0(this.a).setImageResource(2131231100);
      UnknownContactActivity.b0(this.a).U0("1");
    }
  }
  
  class g0 implements Runnable {
    g0(UnknownContactActivity this$0, String param1String) {}
    
    public void run() {
      com.allinone.callerid.f.e.d().i(this.b);
    }
  }
  
  class h implements CompoundButton.OnCheckedChangeListener {
    h(UnknownContactActivity this$0, RadioButton param1RadioButton1, RadioButton param1RadioButton2) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        this.a.setChecked(false);
        this.b.setChecked(false);
      } 
    }
  }
  
  class h0 implements Runnable {
    h0(UnknownContactActivity this$0, String param1String) {}
    
    public void run() {
      com.allinone.callerid.f.e.d().f(this.b);
    }
  }
  
  class i implements CompoundButton.OnCheckedChangeListener {
    i(UnknownContactActivity this$0, RadioButton param1RadioButton1, RadioButton param1RadioButton2) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        this.a.setChecked(false);
        this.b.setChecked(false);
      } 
    }
  }
  
  class i0 implements com.allinone.callerid.i.a.l.a {
    i0(UnknownContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        UnknownContactActivity.d0(this.a).dismiss();
        if (UnknownContactActivity.b0(this.a).J() != null && !"".equals(UnknownContactActivity.b0(this.a).J())) {
          UnknownContactActivity unknownContactActivity = this.a;
          UnknownContactActivity.e0(unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).J());
        } else {
          UnknownContactActivity unknownContactActivity = this.a;
          UnknownContactActivity.e0(unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).s());
        } 
      } else {
        Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755223), 0).show();
      } 
    }
  }
  
  class j implements CompoundButton.OnCheckedChangeListener {
    j(UnknownContactActivity this$0, RadioButton param1RadioButton1, RadioButton param1RadioButton2) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        this.a.setChecked(false);
        this.b.setChecked(false);
      } 
    }
  }
  
  class j0 implements com.allinone.callerid.i.a.l.a {
    j0(UnknownContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        if (UnknownContactActivity.b0(this.a).J() != null && !"".equals(UnknownContactActivity.b0(this.a).J())) {
          UnknownContactActivity unknownContactActivity = this.a;
          UnknownContactActivity.f0(unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).J());
        } else {
          UnknownContactActivity unknownContactActivity = this.a;
          UnknownContactActivity.f0(unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).s());
        } 
      } else {
        Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755653), 0).show();
      } 
    }
  }
  
  class k implements DialogInterface.OnClickListener {
    k(UnknownContactActivity this$0, RadioButton param1RadioButton1, RadioButton param1RadioButton2, RadioButton param1RadioButton3, String param1String) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str;
        boolean bool = this.b.isChecked();
        if (bool) {
          str = "name";
          com.allinone.callerid.util.q.b().c("wrong_info_name");
        } else {
          str = "";
        } 
        if (this.c.isChecked()) {
          str = "spam";
          com.allinone.callerid.util.q.b().c("wrong_info_spam");
        } 
        if (this.d.isChecked()) {
          str = "other";
          com.allinone.callerid.util.q.b().c("wrong_info_location");
        } 
        if (!"".equals(str) && UnknownContactActivity.b0(this.f).I() != null) {
          UnknownContactActivity unknownContactActivity = this.f;
          UnknownContactActivity.l0(unknownContactActivity, this.e, str, UnknownContactActivity.b0(unknownContactActivity).I());
        } else {
          Toast.makeText(this.f.getApplicationContext(), this.f.getResources().getString(2131755225), 0).show();
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class k0 implements com.allinone.callerid.i.a.l.a {
    k0(UnknownContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        if (UnknownContactActivity.b0(this.a).J() != null && !"".equals(UnknownContactActivity.b0(this.a).J())) {
          UnknownContactActivity unknownContactActivity = this.a;
          UnknownContactActivity.f0(unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).J());
        } else {
          UnknownContactActivity unknownContactActivity = this.a;
          UnknownContactActivity.f0(unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).s());
        } 
      } else {
        Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755653), 0).show();
      } 
    }
  }
  
  class l implements TextWatcher {
    l(UnknownContactActivity this$0, DeletableEditText param1DeletableEditText, RadioButton param1RadioButton1, RadioButton param1RadioButton2, RadioButton param1RadioButton3, TextView param1TextView1, TextView param1TextView2, TextView param1TextView3) {}
    
    public void afterTextChanged(Editable param1Editable) {
      if ("".equals(this.b.getText().toString())) {
        this.c.setChecked(false);
        this.d.setChecked(false);
        this.e.setChecked(false);
        this.f.setTextColor(this.i.getResources().getColor(2131099938));
        this.g.setTextColor(this.i.getResources().getColor(2131099938));
        this.h.setTextColor(this.i.getResources().getColor(2131099938));
      } 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  class l0 implements com.allinone.callerid.i.a.l.a {
    l0(UnknownContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        Intent intent = new Intent((Context)this.a, ReportContactActivity.class);
        intent.putExtra("report_number", UnknownContactActivity.b0(this.a).p());
        this.a.startActivityForResult(intent, 369);
        this.a.overridePendingTransition(2130772034, 0);
      } else {
        Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755653), 0).show();
      } 
    }
  }
  
  class m implements Runnable {
    m(UnknownContactActivity this$0, DeletableEditText param1DeletableEditText) {}
    
    public void run() {
      this.b.setFocusableInTouchMode(true);
    }
  }
  
  public static interface m0 {
    void a(boolean param1Boolean);
    
    void b(boolean param1Boolean, String param1String);
  }
  
  class n implements View.OnClickListener {
    n(UnknownContactActivity this$0, RadioButton param1RadioButton1, TextView param1TextView1, DeletableEditText param1DeletableEditText, RadioButton param1RadioButton2, RadioButton param1RadioButton3, TextView param1TextView2, TextView param1TextView3) {}
    
    public void onClick(View param1View) {
      if (this.b.isChecked()) {
        this.b.setChecked(false);
        this.c.setTextColor(this.i.getResources().getColor(2131099938));
        this.d.setText("");
      } else {
        this.b.setChecked(true);
        this.e.setChecked(false);
        this.f.setChecked(false);
        this.d.setText(this.c.getText());
        this.c.setTextColor(UnknownContactActivity.m0(this.i));
        this.g.setTextColor(this.i.getResources().getColor(2131099938));
        this.h.setTextColor(this.i.getResources().getColor(2131099938));
      } 
    }
  }
  
  private static class n0 extends AsyncTask<Void, Void, Void> {
    private WeakReference<UnknownContactActivity> a;
    
    n0(UnknownContactActivity param1UnknownContactActivity) {
      this.a = new WeakReference<UnknownContactActivity>(param1UnknownContactActivity);
    }
    
    protected Void a(Void... param1VarArgs) {
      UnknownContactActivity unknownContactActivity = this.a.get();
      if (unknownContactActivity != null && !unknownContactActivity.isFinishing())
        try {
          ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("content://com.android.contacts/data/phones/filter/");
          stringBuilder.append(UnknownContactActivity.b0(unknownContactActivity).p());
          Cursor cursor = contentResolver.query(Uri.parse(stringBuilder.toString()), null, null, null, null);
          if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            UnknownContactActivity.h0(unknownContactActivity, cursor.getInt(cursor.getColumnIndex("contact_id")));
          } 
          if (cursor != null)
            cursor.close(); 
          Uri uri = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, UnknownContactActivity.g0(unknownContactActivity));
          if (ContactsContract.Contacts.getLookupUri(unknownContactActivity.getContentResolver(), uri) != Uri.EMPTY) {
            int i = unknownContactActivity.getContentResolver().delete(uri, null, null);
            if (com.allinone.callerid.util.d0.a) {
              StringBuilder stringBuilder1 = new StringBuilder();
              this();
              stringBuilder1.append("");
              stringBuilder1.append(i);
              com.allinone.callerid.util.d0.a("deleteContact", stringBuilder1.toString());
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      UnknownContactActivity unknownContactActivity = this.a.get();
      if (unknownContactActivity != null && !unknownContactActivity.isFinishing()) {
        UnknownContactActivity.i0(unknownContactActivity).setVisibility(8);
        UnknownContactActivity.j0(unknownContactActivity).postDelayed(new a(this, unknownContactActivity), 300L);
      } 
    }
    
    class a implements Runnable {
      a(UnknownContactActivity.n0 this$0, UnknownContactActivity param2UnknownContactActivity) {}
      
      public void run() {
        UnknownContactActivity unknownContactActivity = this.b;
        Toast.makeText((Context)unknownContactActivity, unknownContactActivity.getResources().getString(2131755292), 0).show();
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.RELOAD_DATA");
        b.p.a.a.b((Context)this.b).d(intent);
        this.b.finish();
        this.b.overridePendingTransition(2130771968, 2130771969);
      }
    }
  }
  
  class a implements Runnable {
    a(UnknownContactActivity this$0, UnknownContactActivity param1UnknownContactActivity) {}
    
    public void run() {
      UnknownContactActivity unknownContactActivity = this.b;
      Toast.makeText((Context)unknownContactActivity, unknownContactActivity.getResources().getString(2131755292), 0).show();
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.RELOAD_DATA");
      b.p.a.a.b((Context)this.b).d(intent);
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class o implements View.OnClickListener {
    o(UnknownContactActivity this$0, RadioButton param1RadioButton1, TextView param1TextView1, DeletableEditText param1DeletableEditText, RadioButton param1RadioButton2, RadioButton param1RadioButton3, TextView param1TextView2, TextView param1TextView3) {}
    
    public void onClick(View param1View) {
      if (this.b.isChecked()) {
        this.b.setChecked(false);
        this.c.setTextColor(this.i.getResources().getColor(2131099938));
        this.d.setText("");
      } else {
        this.b.setChecked(true);
        this.e.setChecked(false);
        this.f.setChecked(false);
        this.d.setText(this.c.getText());
        this.c.setTextColor(UnknownContactActivity.m0(this.i));
        this.g.setTextColor(this.i.getResources().getColor(2131099938));
        this.h.setTextColor(this.i.getResources().getColor(2131099938));
      } 
    }
  }
  
  class o0 extends BroadcastReceiver {
    o0(UnknownContactActivity this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      UnknownContactActivity.U(this.a);
    }
  }
  
  class p implements View.OnClickListener {
    p(UnknownContactActivity this$0, RadioButton param1RadioButton1, TextView param1TextView1, DeletableEditText param1DeletableEditText, RadioButton param1RadioButton2, RadioButton param1RadioButton3, TextView param1TextView2, TextView param1TextView3) {}
    
    public void onClick(View param1View) {
      if (this.b.isChecked()) {
        this.b.setChecked(false);
        this.c.setTextColor(this.i.getResources().getColor(2131099938));
        this.d.setText("");
      } else {
        this.b.setChecked(true);
        this.e.setChecked(false);
        this.f.setChecked(false);
        this.d.setText(this.g.getText());
        this.g.setTextColor(UnknownContactActivity.m0(this.i));
        this.c.setTextColor(this.i.getResources().getColor(2131099938));
        this.h.setTextColor(this.i.getResources().getColor(2131099938));
      } 
    }
  }
  
  class q implements CompoundButton.OnCheckedChangeListener {
    q(UnknownContactActivity this$0, RadioButton param1RadioButton1, RadioButton param1RadioButton2, DeletableEditText param1DeletableEditText, TextView param1TextView1, TextView param1TextView2, TextView param1TextView3) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        this.a.setChecked(false);
        this.b.setChecked(false);
        this.c.setText(this.d.getText());
        this.d.setTextColor(UnknownContactActivity.m0(this.g));
        this.e.setTextColor(this.g.getResources().getColor(2131099938));
        this.f.setTextColor(this.g.getResources().getColor(2131099938));
      } else {
        this.d.setTextColor(this.g.getResources().getColor(2131099938));
        this.c.setText("");
      } 
    }
  }
  
  class r implements CompoundButton.OnCheckedChangeListener {
    r(UnknownContactActivity this$0, RadioButton param1RadioButton1, RadioButton param1RadioButton2, DeletableEditText param1DeletableEditText, TextView param1TextView1, TextView param1TextView2, TextView param1TextView3) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        this.a.setChecked(false);
        this.b.setChecked(false);
        this.c.setText(this.d.getText());
        this.d.setTextColor(UnknownContactActivity.m0(this.g));
        this.e.setTextColor(this.g.getResources().getColor(2131099938));
        this.f.setTextColor(this.g.getResources().getColor(2131099938));
      } else {
        this.d.setTextColor(this.g.getResources().getColor(2131099938));
        this.c.setText("");
      } 
    }
  }
  
  class s implements CompoundButton.OnCheckedChangeListener {
    s(UnknownContactActivity this$0, RadioButton param1RadioButton1, RadioButton param1RadioButton2, DeletableEditText param1DeletableEditText, TextView param1TextView1, TextView param1TextView2, TextView param1TextView3) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        this.a.setChecked(false);
        this.b.setChecked(false);
        this.c.setText(this.d.getText());
        this.d.setTextColor(UnknownContactActivity.m0(this.g));
        this.e.setTextColor(this.g.getResources().getColor(2131099938));
        this.f.setTextColor(this.g.getResources().getColor(2131099938));
      } else {
        this.d.setTextColor(this.g.getResources().getColor(2131099938));
        this.c.setText("");
      } 
    }
  }
  
  class t implements CompoundButton.OnCheckedChangeListener {
    t(UnknownContactActivity this$0, RadioButton param1RadioButton) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean)
        this.a.setChecked(false); 
    }
  }
  
  class u implements CompoundButton.OnCheckedChangeListener {
    u(UnknownContactActivity this$0, RadioButton param1RadioButton) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean)
        this.a.setChecked(false); 
    }
  }
  
  class v implements com.allinone.callerid.i.a.e.a {
    v(UnknownContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        try {
          UnknownContactActivity.V(this.a).setText(this.a.getResources().getString(2131755825));
          UnknownContactActivity.W(this.a).setImageResource(2131231068);
          UnknownContactActivity.X(this.a).setText(this.a.getResources().getString(2131755825));
          UnknownContactActivity.Y(this.a).setImageResource(2131231068);
          UnknownContactActivity.Z(this.a).setText(this.a.getResources().getString(2131755825));
          if (UnknownContactActivity.a0(this.a) != null)
            UnknownContactActivity.a0(this.a).a(true); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        UnknownContactActivity.V(this.a).setText(this.a.getResources().getString(2131755114));
        UnknownContactActivity.W(this.a).setImageResource(2131231067);
        UnknownContactActivity.X(this.a).setText(this.a.getResources().getString(2131755114));
        UnknownContactActivity.Y(this.a).setImageResource(2131231067);
        UnknownContactActivity.Z(this.a).setText(this.a.getResources().getString(2131755114));
        if (UnknownContactActivity.a0(this.a) != null)
          UnknownContactActivity.a0(this.a).a(false); 
      } 
    }
  }
  
  class w implements View.OnClickListener {
    w(UnknownContactActivity this$0, DeletableEditText param1DeletableEditText, RadioButton param1RadioButton1, RadioButton param1RadioButton2, String param1String) {}
    
    public void onClick(View param1View) {
      try {
        String str = this.b.getText().toString();
        if (str != null && !"".equals(str)) {
          if (str.length() <= 100) {
            String str1;
            boolean bool = this.c.isChecked();
            String str2 = "name";
            if (bool) {
              str1 = "company";
            } else {
              str1 = "name";
            } 
            if (this.d.isChecked())
              str1 = str2; 
            str2 = UnknownContactActivity.b0(this.f).I();
            if (str2 != null && !"".equals(i1.b(str)))
              UnknownContactActivity.o0(this.f, this.e, i1.b(str), str1, str2); 
            UnknownContactActivity.K0(this.f).setText(str);
            UnknownContactActivity unknownContactActivity = this.f;
            UnknownContactActivity.p0(unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).s(), str);
            unknownContactActivity = this.f;
            UnknownContactActivity.q0(unknownContactActivity, UnknownContactActivity.b0(unknownContactActivity).p());
            Toast.makeText(this.f.getApplicationContext(), this.f.getResources().getString(2131755802), 0).show();
            if (UnknownContactActivity.r0(this.f) != null)
              UnknownContactActivity.r0(this.f).dismiss(); 
          } else {
            Toast.makeText(this.f.getApplicationContext(), this.f.getResources().getString(2131755224), 0).show();
          } 
        } else {
          Toast.makeText(this.f.getApplicationContext(), this.f.getResources().getString(2131755516), 0).show();
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class x implements View.OnClickListener {
    x(UnknownContactActivity this$0) {}
    
    public void onClick(View param1View) {
      if (UnknownContactActivity.r0(this.b) != null)
        UnknownContactActivity.r0(this.b).dismiss(); 
    }
  }
  
  class y implements Runnable {
    y(UnknownContactActivity this$0, String param1String1, String param1String2) {}
    
    public void run() {
      try {
        EZSearchContacts eZSearchContacts = com.allinone.callerid.f.f.b().d(this.b);
        if (eZSearchContacts != null) {
          eZSearchContacts.setName(this.c);
          com.allinone.callerid.f.f.b().e(eZSearchContacts, new String[] { "name" });
        } 
        UnknownContactActivity unknownContactActivity = this.d;
        a a = new a();
        this(this);
        unknownContactActivity.runOnUiThread(a);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements Runnable {
      a(UnknownContactActivity.y this$0) {}
      
      public void run() {
        i1.I0(this.b.d.getApplicationContext());
      }
    }
  }
  
  class a implements Runnable {
    a(UnknownContactActivity this$0) {}
    
    public void run() {
      i1.I0(this.b.d.getApplicationContext());
    }
  }
  
  class z implements Runnable {
    z(UnknownContactActivity this$0) {}
    
    public void run() {
      try {
        UnknownContactActivity.s0(this.b);
        UnknownContactActivity.t0(this.b);
        i1.I0(this.b.getApplicationContext());
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/contactpdt/UnknownContactActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */