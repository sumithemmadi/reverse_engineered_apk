package com.allinone.callerid.mvc.controller.contactpdt;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.customview.AppBarStateChangeListener;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.CallLogActivity;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.recorder.RecordListActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.l0;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.u;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.ArrayList;

public class ContactActivity extends BaseActivity implements View.OnClickListener {
  private PopupWindow A;
  
  private TextView B;
  
  private TextView C;
  
  private TextView D;
  
  private ProgressBar E;
  
  private TextView F;
  
  private ImageView G;
  
  private LinearLayout H;
  
  private FrameLayout I;
  
  private LinearLayout J;
  
  private TextView K;
  
  private ImageView L;
  
  private ConstraintLayout M;
  
  private AppBarStateChangeListener N;
  
  private AppBarLayout O;
  
  private Toolbar P;
  
  private RelativeLayout Q;
  
  private ConstraintLayout R;
  
  private LinearLayout S;
  
  private ImageView T;
  
  private ImageView U;
  
  private TextView V;
  
  private FrameLayout W;
  
  private View X;
  
  private TextView Y;
  
  private ImageView Z;
  
  private ImageView a0;
  
  private ImageView b0;
  
  private ImageView c0;
  
  private boolean d0;
  
  private View e0;
  
  private Animation f0;
  
  private TextView g0;
  
  private TextView h0;
  
  private ImageView i0;
  
  private ImageView j0;
  
  private boolean k0;
  
  private int l0;
  
  private ImageView m0;
  
  private ImageView n0;
  
  @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
  private Typeface o0;
  
  private final String s = "ContactActivity";
  
  private ImageView t;
  
  private ImageView u;
  
  private TextView v;
  
  private TextView w;
  
  private TextView x;
  
  private TextView y;
  
  private CallLogBean z;
  
  private void A0() {
    try {
      CallLogBean callLogBean = this.z;
      if (callLogBean != null && callLogBean.p() != null && !"".equals(this.z.p())) {
        String str = this.z.p().replace("-", "");
        k k = new k();
        this(this);
        com.allinone.callerid.i.a.e.b.b(str, k);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void B0() {
    com.allinone.callerid.i.a.p.a.e(getApplicationContext(), this.z.v(), this.z.p(), new m(this));
  }
  
  private void D0() {
    getWindow().getDecorView().post(new a(this));
  }
  
  private void E0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493148, null);
    FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296732);
    frameLayout1.setVisibility(0);
    FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296717);
    frameLayout2.setVisibility(0);
    FrameLayout frameLayout3 = (FrameLayout)view.findViewById(2131296735);
    frameLayout3.setVisibility(0);
    FrameLayout frameLayout4 = (FrameLayout)view.findViewById(2131296740);
    frameLayout4.setVisibility(0);
    this.D = (TextView)view.findViewById(2131297810);
    TextView textView1 = (TextView)view.findViewById(2131297885);
    TextView textView2 = (TextView)view.findViewById(2131297869);
    TextView textView3 = (TextView)view.findViewById(2131297897);
    textView2.setTypeface(this.o0);
    textView3.setTypeface(this.o0);
    FrameLayout frameLayout5 = (FrameLayout)view.findViewById(2131296795);
    ((TextView)view.findViewById(2131298123)).setTypeface(this.o0);
    frameLayout5.setVisibility(0);
    frameLayout5.setOnClickListener(this);
    this.D.setTypeface(this.o0);
    textView1.setTypeface(this.o0);
    frameLayout3.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    frameLayout4.setOnClickListener(this);
    this.A = new PopupWindow(view);
    int i = getWindowManager().getDefaultDisplay().getWidth();
    this.A.setWidth(i / 2);
    this.A.setHeight(-2);
    this.A.setFocusable(true);
    if (i1.f0(getApplicationContext()).booleanValue()) {
      this.A.setAnimationStyle(2131821306);
    } else {
      this.A.setAnimationStyle(2131821305);
    } 
    ColorDrawable colorDrawable = new ColorDrawable(0);
    this.A.setBackgroundDrawable((Drawable)colorDrawable);
  }
  
  private void F0() {
    this.l0 = d1.a((Context)this, 2130968859, 2131099706);
    ImageView imageView1 = (ImageView)findViewById(2131297118);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView1.setImageResource(2131231059); 
    this.m0 = (ImageView)findViewById(2131296963);
    this.n0 = (ImageView)findViewById(2131296952);
    this.Y = (TextView)findViewById(2131298192);
    this.O = (AppBarLayout)findViewById(2131296353);
    this.P = (Toolbar)findViewById(2131297760);
    this.Q = (RelativeLayout)findViewById(2131297492);
    this.M = (ConstraintLayout)findViewById(2131297170);
    this.R = (ConstraintLayout)findViewById(2131297169);
    this.t = (ImageView)findViewById(2131297119);
    this.G = (ImageView)findViewById(2131296908);
    this.L = (ImageView)findViewById(2131296895);
    this.T = (ImageView)findViewById(2131296909);
    this.U = (ImageView)findViewById(2131296896);
    this.u = (ImageView)findViewById(2131296885);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296411);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131297581);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296403);
    FrameLayout frameLayout4 = (FrameLayout)findViewById(2131296423);
    FrameLayout frameLayout5 = (FrameLayout)findViewById(2131296425);
    FrameLayout frameLayout6 = (FrameLayout)findViewById(2131296405);
    FrameLayout frameLayout7 = (FrameLayout)findViewById(2131296404);
    FrameLayout frameLayout8 = (FrameLayout)findViewById(2131296424);
    FrameLayout frameLayout9 = (FrameLayout)findViewById(2131296426);
    FrameLayout frameLayout10 = (FrameLayout)findViewById(2131296406);
    ImageView imageView3 = (ImageView)findViewById(2131296420);
    this.j0 = imageView3;
    imageView3.setOnClickListener(this);
    this.J = (LinearLayout)findViewById(2131297193);
    this.W = (FrameLayout)findViewById(2131297507);
    this.X = findViewById(2131297139);
    ImageView imageView4 = (ImageView)findViewById(2131296421);
    TextView textView7 = (TextView)findViewById(2131296432);
    this.E = (ProgressBar)findViewById(2131297380);
    this.S = (LinearLayout)findViewById(2131297185);
    this.Z = (ImageView)findViewById(2131297054);
    this.a0 = (ImageView)findViewById(2131297055);
    this.b0 = (ImageView)findViewById(2131296433);
    this.c0 = (ImageView)findViewById(2131296434);
    this.Z.setVisibility(8);
    this.a0.setVisibility(8);
    imageView1.setOnClickListener(this);
    this.t.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    imageView4.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    frameLayout4.setOnClickListener(this);
    frameLayout5.setOnClickListener(this);
    frameLayout6.setOnClickListener(this);
    frameLayout7.setOnClickListener(this);
    frameLayout8.setOnClickListener(this);
    frameLayout9.setOnClickListener(this);
    frameLayout10.setOnClickListener(this);
    this.b0.setOnClickListener(this);
    this.c0.setOnClickListener(this);
    this.m0.setOnClickListener(this);
    this.W.setOnClickListener(this);
    this.v = (TextView)findViewById(2131297989);
    this.B = (TextView)findViewById(2131297892);
    this.C = (TextView)findViewById(2131297936);
    this.w = (TextView)findViewById(2131297860);
    this.x = (TextView)findViewById(2131297861);
    this.y = (TextView)findViewById(2131297863);
    this.K = (TextView)findViewById(2131298033);
    TextView textView3 = (TextView)findViewById(2131297906);
    this.F = (TextView)findViewById(2131297790);
    TextView textView4 = (TextView)findViewById(2131297907);
    this.V = (TextView)findViewById(2131297791);
    TextView textView1 = (TextView)findViewById(2131297786);
    TextView textView6 = (TextView)findViewById(2131297792);
    TextView textView2 = (TextView)findViewById(2131297787);
    TextView textView5 = (TextView)findViewById(2131297793);
    Typeface typeface = g1.b();
    this.o0 = typeface;
    this.C.setTypeface(typeface);
    this.v.setTypeface(this.o0);
    this.w.setTypeface(this.o0);
    this.x.setTypeface(this.o0);
    this.y.setTypeface(this.o0);
    this.K.setTypeface(this.o0);
    textView7.setTypeface(this.o0);
    textView3.setTypeface(this.o0);
    this.F.setTypeface(this.o0);
    textView4.setTypeface(this.o0);
    this.V.setTypeface(this.o0);
    textView1.setTypeface(this.o0);
    textView6.setTypeface(this.o0);
    textView2.setTypeface(this.o0);
    textView5.setTypeface(this.o0);
    this.Y.setTypeface(this.o0);
    this.e0 = findViewById(2131297527);
    FrameLayout frameLayout11 = (FrameLayout)findViewById(2131296428);
    this.g0 = (TextView)findViewById(2131298187);
    this.h0 = (TextView)findViewById(2131297866);
    this.i0 = (ImageView)findViewById(2131296887);
    ImageView imageView2 = (ImageView)findViewById(2131296968);
    this.g0.setTypeface(this.o0);
    this.h0.setTypeface(this.o0);
    ((TextView)findViewById(2131297780)).setTypeface(this.o0);
    frameLayout11.setOnClickListener(this);
    imageView2.setOnClickListener(this);
    com.allinone.callerid.i.a.d.a.a(new q(this));
  }
  
  private void G0() {
    this.I = (FrameLayout)findViewById(2131296753);
    this.H = (LinearLayout)findViewById(2131296925);
    com.allinone.callerid.util.gg.c.c().d((Context)EZCallApplication.c(), "ca-app-pub-5825926894918682/5960855653", new j(this));
  }
  
  private void H0() {
    try {
      if (!b1.y2().booleanValue()) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
          com.allinone.callerid.dialog.f f = new com.allinone.callerid.dialog.f();
          this((Context)this, 2131820783);
          f.setCanceledOnTouchOutside(false);
          f.show();
          return;
        } 
      } 
      String str = this.z.p();
      h h = new h();
      this(this);
      com.allinone.callerid.i.a.e.b.b(str, h);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void I0() {
    CallLogBean callLogBean = this.z;
    if (callLogBean != null && callLogBean.v() != 0) {
      u.c((Activity)this, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.z.v()), "", 2131231148, this.u);
    } else {
      callLogBean = this.z;
      if (callLogBean != null && callLogBean.p() != null && !"".equals(this.z.p()))
        com.allinone.callerid.i.a.p.a.a(this.z.p(), new p(this)); 
    } 
  }
  
  private void J0() {
    com.allinone.callerid.i.a.p.a.b(this.z.p(), new o(this));
  }
  
  private void K0() {
    com.allinone.callerid.i.a.p.a.c(this.z.v(), this.z.p(), new n(this));
  }
  
  private void L0() {
    if (this.z != null) {
      K0();
      I0();
      if (this.d0) {
        this.b0.setVisibility(0);
        this.c0.setVisibility(0);
        try {
          if (this.z.C().equals("0")) {
            this.Z.setVisibility(0);
          } else if (this.z.C().equals("1")) {
            this.a0.setVisibility(0);
          } else {
            this.Z.setVisibility(8);
            this.a0.setVisibility(8);
          } 
        } catch (Exception exception) {}
      } else {
        this.b0.setImageResource(2131231178);
        this.Z.setVisibility(8);
        this.a0.setVisibility(8);
      } 
      if (this.z.E() != null)
        if (this.z.E().equals("1")) {
          this.z.U0("1");
          this.G.setImageResource(2131231100);
          this.T.setImageResource(2131231100);
        } else {
          this.z.U0("0");
          this.G.setImageResource(2131231101);
          this.T.setImageResource(2131231101);
        }  
      if (this.z.n() != null && !"".equals(this.z.n())) {
        this.v.setText(this.z.n());
        this.Y.setText(this.z.n());
      } else {
        this.v.setText(this.z.p());
        this.Y.setText(this.z.p());
      } 
      if (this.z.c() != null && !"".equals(this.z.c())) {
        this.w.setText(this.z.c());
        this.W.setVisibility(0);
        this.X.setVisibility(0);
      } else {
        this.W.setVisibility(8);
        this.X.setVisibility(8);
      } 
      String str = this.z.d();
      if (this.z.i() != null && !"".equals(this.z.i())) {
        this.x.setText(this.z.i());
      } else if (str != null && !"".equals(str)) {
        this.x.setText(str);
      } else {
        this.x.setText(this.z.p());
      } 
      if (this.z.m() != null && !"".equals(this.z.m())) {
        String[] arrayOfString = this.z.m().split(":");
        if (arrayOfString != null && arrayOfString.length > 1)
          B0(); 
      } 
      if (this.z.r() != null && !"".equals(this.z.r())) {
        this.y.setText(this.z.r());
        this.y.setVisibility(0);
        if (this.z.t() != null && !"".equals(this.z.t())) {
          TextView textView = this.K;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(" • ");
          stringBuilder.append(this.z.t());
          textView.setText(stringBuilder.toString());
          this.K.setVisibility(0);
        } 
      } else if (this.z.B() != null && !"".equals(this.z.B())) {
        this.y.setText(this.z.B());
        this.y.setVisibility(0);
        if (this.z.t() != null && !"".equals(this.z.t())) {
          TextView textView = this.K;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(" • ");
          stringBuilder.append(this.z.t());
          textView.setText(stringBuilder.toString());
          this.K.setVisibility(0);
        } 
      } else {
        this.y.setText(getResources().getString(2131755474));
        this.y.setVisibility(0);
        if (this.z.t() != null && !"".equals(this.z.t())) {
          TextView textView = this.K;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(" • ");
          stringBuilder.append(this.z.t());
          textView.setText(stringBuilder.toString());
          this.K.setVisibility(0);
        } 
      } 
      if (this.z.p() != null)
        (new Thread(new l(this))).start(); 
    } 
  }
  
  public void C0() {
    if (this.k0) {
      Intent intent = new Intent((Context)this, MainActivity.class);
      intent.putExtra("missedcall", true);
      startActivity(intent);
    } 
    finish();
    overridePendingTransition(2130771968, 2130771969);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 200) {
      I0();
      J0();
    } 
  }
  
  public void onClick(View paramView) {
    AlertDialog alertDialog;
    switch (paramView.getId()) {
      default:
        return;
      case 2131297581:
        try {
          Intent intent = new Intent();
          this((Context)this, CallLogActivity.class);
          intent.putExtra("call_log_number", this.z.p().replace(" ", ""));
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
          com.allinone.callerid.util.q.b().c("see_history");
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131297507:
        if (this.z.c() != null && !"".equals(this.z.c()))
          i1.x0(getApplicationContext(), this.z.c()); 
      case 2131297119:
        if (i1.f0(getApplicationContext()).booleanValue()) {
          this.A.showAtLocation((View)this.t, 51, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
        } else {
          this.A.showAtLocation((View)this.t, 53, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
        } 
      case 2131297118:
        C0();
      case 2131296968:
        this.e0.setVisibility(8);
        b1.U1(false);
      case 2131296963:
        try {
          com.allinone.callerid.util.q.b().c("number_pdt_callscreen_click");
          Intent intent = new Intent();
          this((Context)this, MainActivity.class);
          intent.putExtra("is_callscreen", true);
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
          finish();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296795:
        try {
          this.A.dismiss();
          com.allinone.callerid.util.q.b().c("number_content_share_click");
          String str = i1.L(this.z.n(), this.z.p(), this.z.c());
          com.allinone.callerid.dialog.n n = new com.allinone.callerid.dialog.n();
          this((Context)this, 2131820783, getResources().getString(2131755732), getResources().getString(2131755727), str, 0, null);
          n.setCanceledOnTouchOutside(false);
          n.show();
          Window window = n.getWindow();
          WindowManager.LayoutParams layoutParams = window.getAttributes();
          window.setGravity(80);
          WindowManager windowManager = (WindowManager)getApplicationContext().getApplicationContext().getSystemService("window");
          int i = windowManager.getDefaultDisplay().getWidth();
          int j = windowManager.getDefaultDisplay().getHeight();
          layoutParams.width = i;
          layoutParams.height = j / 2;
          window.setAttributes(layoutParams);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296740:
        this.A.dismiss();
        try {
          Intent intent = new Intent();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("content://com.android.contacts/contacts/");
          stringBuilder.append(this.z.v());
          this("android.intent.action.EDIT", Uri.parse(stringBuilder.toString()));
          startActivityForResult(intent, 200);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        com.allinone.callerid.util.q.b().c("btn_add_edit");
      case 2131296735:
        this.A.dismiss();
        alertDialog = (new AlertDialog.Builder((Context)this)).setMessage(getResources().getString(2131755286)).setPositiveButton(getResources().getString(2131755287), new g(this)).setNegativeButton(getResources().getString(2131755180), new f(this)).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(this.l0);
        alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
      case 2131296732:
        this.A.dismiss();
        try {
          ((ClipboardManager)getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, this.z.p()));
          Toast.makeText((Context)this, getResources().getString(2131755263), 1).show();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296717:
        this.A.dismiss();
        H0();
      case 2131296434:
        if (this.z != null)
          c1.b(Boolean.valueOf(this.d0), this.z, (Context)this); 
      case 2131296433:
        if (this.z != null)
          c1.a(Boolean.valueOf(this.d0), this.z, (Context)this); 
      case 2131296428:
        com.allinone.callerid.util.q.b().c("pdt_recommend_click");
        i1.J0(getApplicationContext(), l0.a(), "showcaller");
        this.e0.setVisibility(8);
      case 2131296426:
        try {
          Intent intent = new Intent();
          this("android.intent.action.VIEW");
          intent.setType("vnd.android-dir/mms-sms");
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("smsto:");
          stringBuilder.append(this.z.p());
          intent.setData(Uri.parse(stringBuilder.toString()));
          intent.addFlags(268468224);
          startActivity(intent);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296425:
        try {
          Intent intent = new Intent();
          this("android.intent.action.VIEW");
          intent.setType("vnd.android-dir/mms-sms");
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("smsto:");
          stringBuilder.append(this.z.p());
          intent.setData(Uri.parse(stringBuilder.toString()));
          intent.addFlags(268468224);
          startActivity(intent);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296424:
        com.allinone.callerid.util.q.b().c("btn_favorite");
        try {
          if (this.z.E() != null && !"".equals(this.z.E()))
            if (this.z.E().equals("1")) {
              Toast.makeText(getApplicationContext(), getResources().getString(2131755642), 0).show();
              try {
                int i = this.z.v();
                d d = new d();
                this(this);
                com.allinone.callerid.i.a.j.a.b(i, d);
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            } else {
              Toast.makeText(getApplicationContext(), getResources().getString(2131755083), 0).show();
              try {
                int i = this.z.v();
                e e = new e();
                this(this);
                com.allinone.callerid.i.a.j.a.a(i, e);
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            }  
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296423:
        com.allinone.callerid.util.q.b().c("btn_favorite");
        try {
          if (this.z.E() != null && !"".equals(this.z.E()))
            if (this.z.E().equals("1")) {
              Toast.makeText(getApplicationContext(), getResources().getString(2131755642), 0).show();
              try {
                int i = this.z.v();
                b b = new b();
                this(this);
                com.allinone.callerid.i.a.j.a.b(i, b);
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            } else {
              Toast.makeText(getApplicationContext(), getResources().getString(2131755083), 0).show();
              try {
                int i = this.z.v();
                c c = new c();
                this(this);
                com.allinone.callerid.i.a.j.a.a(i, c);
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            }  
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296421:
        try {
          Intent intent = new Intent();
          this("android.intent.action.VIEW");
          intent.setType("vnd.android-dir/mms-sms");
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("smsto:");
          stringBuilder.append(this.z.p());
          intent.setData(Uri.parse(stringBuilder.toString()));
          intent.addFlags(268468224);
          startActivity(intent);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        com.allinone.callerid.util.q.b().c("btn_contact_sms");
      case 2131296420:
        try {
          Intent intent = new Intent();
          this((Context)this, RecordListActivity.class);
          intent.putExtra("recordnumber", this.z.p());
          intent.putExtra("recordname", this.z.n());
          intent.addFlags(268435456);
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296406:
        try {
          q0.a(getApplicationContext(), this.z.p());
        } catch (Exception exception) {
          Toast.makeText((Context)this, getResources().getString(2131755541), 1).show();
        } 
      case 2131296405:
        try {
          if (c1.h((Context)this)) {
            if (b1.H()) {
              c1.d((Context)this, b1.q(), this.z.p());
            } else if (Build.VERSION.SDK_INT >= 22) {
              c1.m((Context)this, this.z.p());
            } else {
              q0.a(getApplicationContext(), this.z.p());
            } 
          } else {
            q0.a(getApplicationContext(), this.z.p());
          } 
        } catch (Exception exception) {
          Toast.makeText((Context)this, getResources().getString(2131755541), 1).show();
        } 
      case 2131296404:
        com.allinone.callerid.util.q.b().c("btn_add_block");
        H0();
      case 2131296403:
        break;
    } 
    com.allinone.callerid.util.q.b().c("btn_add_block");
    H0();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    Intent intent = getIntent();
    if (intent != null) {
      this.z = (CallLogBean)intent.getParcelableExtra("contact_tony");
      this.k0 = intent.getBooleanExtra("is_missed", false);
    } 
    setContentView(2131492917);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    if (c1.h((Context)this)) {
      this.d0 = true;
    } else {
      this.d0 = false;
    } 
    com.allinone.callerid.util.q.b().c("contact_content_show");
    D0();
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      AppBarLayout appBarLayout = this.O;
      if (appBarLayout != null) {
        AppBarStateChangeListener appBarStateChangeListener = this.N;
        if (appBarStateChangeListener != null)
          appBarLayout.p((AppBarLayout.d)appBarStateChangeListener); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      C0();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
    (new Handler()).postDelayed(new i(this), 800L);
    if (com.allinone.callerid.util.k1.b.a) {
      if (com.allinone.callerid.util.k1.b.b(getApplicationContext()))
        com.allinone.callerid.util.q.b().c("dialog_notifi_per_tip_enalbleed"); 
      com.allinone.callerid.util.k1.b.a = false;
      H0();
    } 
  }
  
  class a implements Runnable {
    a(ContactActivity this$0) {}
    
    public void run() {
      ContactActivity.O(this.b);
      ContactActivity.P(this.b);
      ContactActivity.c0(this.b, new a(this));
      if (ContactActivity.w0(this.b) != null && ContactActivity.a0(this.b) != null)
        ContactActivity.w0(this.b).b((AppBarLayout.d)ContactActivity.a0(this.b)); 
      ContactActivity.x0(this.b);
      com.allinone.callerid.i.a.d.a.a(new b(this));
      ContactActivity.z0(this.b);
    }
    
    class a extends AppBarStateChangeListener {
      a(ContactActivity.a this$0) {}
      
      public void b(AppBarLayout param2AppBarLayout, AppBarStateChangeListener.State param2State) {
        if (param2State == AppBarStateChangeListener.State.b) {
          ContactActivity.n0(this.b.b).setVisibility(8);
          ContactActivity.u0(this.b.b).setVisibility(8);
          ContactActivity.v0(this.b.b).setVisibility(0);
        } else if (param2State == AppBarStateChangeListener.State.c) {
          ContactActivity.n0(this.b.b).setVisibility(0);
          ContactActivity.u0(this.b.b).setVisibility(0);
          ContactActivity.v0(this.b.b).setVisibility(4);
        } else {
          ContactActivity.n0(this.b.b).setVisibility(8);
          ContactActivity.u0(this.b.b).setVisibility(8);
          ContactActivity.v0(this.b.b).setVisibility(0);
        } 
      }
    }
    
    class b implements com.allinone.callerid.i.a.d.b {
      b(ContactActivity.a this$0) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean)
          ContactActivity.y0(this.a.b); 
      }
    }
  }
  
  class a extends AppBarStateChangeListener {
    a(ContactActivity this$0) {}
    
    public void b(AppBarLayout param1AppBarLayout, AppBarStateChangeListener.State param1State) {
      if (param1State == AppBarStateChangeListener.State.b) {
        ContactActivity.n0(this.b.b).setVisibility(8);
        ContactActivity.u0(this.b.b).setVisibility(8);
        ContactActivity.v0(this.b.b).setVisibility(0);
      } else if (param1State == AppBarStateChangeListener.State.c) {
        ContactActivity.n0(this.b.b).setVisibility(0);
        ContactActivity.u0(this.b.b).setVisibility(0);
        ContactActivity.v0(this.b.b).setVisibility(4);
      } else {
        ContactActivity.n0(this.b.b).setVisibility(8);
        ContactActivity.u0(this.b.b).setVisibility(8);
        ContactActivity.v0(this.b.b).setVisibility(0);
      } 
    }
  }
  
  class b implements com.allinone.callerid.i.a.d.b {
    b(ContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean)
        ContactActivity.y0(this.a.b); 
    }
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(ContactActivity this$0) {}
    
    public void a() {
      ContactActivity.e0(this.a).setImageResource(2131231101);
      ContactActivity.f0(this.a).setImageResource(2131231101);
      ContactActivity.Z(this.a).U0("0");
    }
  }
  
  class c implements com.allinone.callerid.i.a.a {
    c(ContactActivity this$0) {}
    
    public void a() {
      ContactActivity.e0(this.a).setImageResource(2131231100);
      ContactActivity.f0(this.a).setImageResource(2131231100);
      ContactActivity.Z(this.a).U0("1");
    }
  }
  
  class d implements com.allinone.callerid.i.a.a {
    d(ContactActivity this$0) {}
    
    public void a() {
      ContactActivity.e0(this.a).setImageResource(2131231101);
      ContactActivity.f0(this.a).setImageResource(2131231101);
      ContactActivity.Z(this.a).U0("0");
    }
  }
  
  class e implements com.allinone.callerid.i.a.a {
    e(ContactActivity this$0) {}
    
    public void a() {
      ContactActivity.e0(this.a).setImageResource(2131231100);
      ContactActivity.f0(this.a).setImageResource(2131231100);
      ContactActivity.Z(this.a).U0("1");
    }
  }
  
  class f implements DialogInterface.OnClickListener {
    f(ContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class g implements DialogInterface.OnClickListener {
    g(ContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      ContactActivity.o0(this.b).setVisibility(0);
      ContactActivity contactActivity = this.b;
      com.allinone.callerid.i.a.p.a.d((Context)contactActivity, ContactActivity.Z(contactActivity).v(), new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.p.d {
      a(ContactActivity.g this$0) {}
      
      public void a() {
        ContactActivity.o0(this.a.b).setVisibility(8);
        (new Handler()).postDelayed(new a(this), 300L);
      }
      
      class a implements Runnable {
        a(ContactActivity.g.a this$0) {}
        
        public void run() {
          ContactActivity contactActivity = this.b.a.b;
          Toast.makeText((Context)contactActivity, contactActivity.getResources().getString(2131755292), 0).show();
          Intent intent = new Intent();
          intent.setAction("com.allinone.callerid.RELOAD_DATA");
          b.p.a.a.b(this.b.a.b.getApplicationContext()).d(intent);
          this.b.a.b.finish();
          this.b.a.b.overridePendingTransition(2130771968, 2130771969);
        }
      }
    }
    
    class a implements Runnable {
      a(ContactActivity.g this$0) {}
      
      public void run() {
        ContactActivity contactActivity = this.b.a.b;
        Toast.makeText((Context)contactActivity, contactActivity.getResources().getString(2131755292), 0).show();
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.RELOAD_DATA");
        b.p.a.a.b(this.b.a.b.getApplicationContext()).d(intent);
        this.b.a.b.finish();
        this.b.a.b.overridePendingTransition(2130771968, 2130771969);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.p.d {
    a(ContactActivity this$0) {}
    
    public void a() {
      ContactActivity.o0(this.a.b).setVisibility(8);
      (new Handler()).postDelayed(new a(this), 300L);
    }
    
    class a implements Runnable {
      a(ContactActivity.g.a this$0) {}
      
      public void run() {
        ContactActivity contactActivity = this.b.a.b;
        Toast.makeText((Context)contactActivity, contactActivity.getResources().getString(2131755292), 0).show();
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.RELOAD_DATA");
        b.p.a.a.b(this.b.a.b.getApplicationContext()).d(intent);
        this.b.a.b.finish();
        this.b.a.b.overridePendingTransition(2130771968, 2130771969);
      }
    }
  }
  
  class a implements Runnable {
    a(ContactActivity this$0) {}
    
    public void run() {
      ContactActivity contactActivity = this.b.a.b;
      Toast.makeText((Context)contactActivity, contactActivity.getResources().getString(2131755292), 0).show();
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.RELOAD_DATA");
      b.p.a.a.b(this.b.a.b.getApplicationContext()).d(intent);
      this.b.a.b.finish();
      this.b.a.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class h implements com.allinone.callerid.i.a.e.a {
    h(ContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      try {
        boolean bool = this.a.isFinishing();
        if (!bool) {
          String str1;
          String str3;
          if (param1Boolean) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.a.getResources().getString(2131755825));
            stringBuilder.append(" ");
            stringBuilder.append(ContactActivity.Z(this.a).p());
            str3 = stringBuilder.toString();
            str1 = this.a.getResources().getString(2131755826);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.a.getResources().getString(2131755114));
            stringBuilder.append(" ");
            stringBuilder.append(ContactActivity.Z(this.a).p());
            stringBuilder.append(" ?");
            str3 = stringBuilder.toString();
            str1 = this.a.getResources().getString(2131755116);
          } 
          AlertDialog.Builder builder = new AlertDialog.Builder();
          this((Context)this.a);
          builder = builder.setMessage(str3);
          b b = new b();
          this(this);
          builder = builder.setPositiveButton(str1, b);
          String str2 = this.a.getResources().getString(2131755180);
          a a1 = new a();
          this(this);
          AlertDialog alertDialog = builder.setNegativeButton(str2, a1).create();
          alertDialog.show();
          alertDialog.getButton(-1).setTextColor(ContactActivity.p0(this.a));
          alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(ContactActivity.h this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(ContactActivity.h this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str = ContactActivity.Z(this.b.a).p().replace("-", "");
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
        a(ContactActivity.h.b this$0, String param3String) {}
        
        public void a(boolean param3Boolean) {
          if (param3Boolean) {
            com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
          } else {
            EZBlackList eZBlackList = new EZBlackList();
            if (ContactActivity.Z(this.b.b.a).n() != null && !"".equals(ContactActivity.Z(this.b.b.a).n())) {
              eZBlackList.setName(ContactActivity.Z(this.b.b.a).n());
            } else if (ContactActivity.Z(this.b.b.a).y() != null && !"".equals(ContactActivity.Z(this.b.b.a).y())) {
              eZBlackList.setName(ContactActivity.Z(this.b.b.a).y());
            } else {
              eZBlackList.setName("");
            } 
            eZBlackList.setIs_myblock("true");
            eZBlackList.setNumber(this.a);
            com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
          } 
        }
        
        class a implements com.allinone.callerid.i.a.a {
          a(ContactActivity.h.b.a this$0) {}
          
          public void a() {
            ContactActivity.x0(this.a.b.b.a);
            Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
          }
        }
        
        class b implements com.allinone.callerid.i.a.a {
          b(ContactActivity.h.b.a this$0) {}
          
          public void a() {
            ContactActivity.x0(this.a.b.b.a);
            Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755131), 0).show();
            CollectInfo collectInfo = new CollectInfo();
            collectInfo.setNumber(ContactActivity.Z(this.a.b.b.a).p());
            collectInfo.setUser_blocked("1");
            collectInfo.setUser_commented("0");
            collectInfo.setUser_reported("0");
            collectInfo.setUser_upload_recording("0");
            com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          }
        }
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(ContactActivity.h.b this$0) {}
        
        public void a() {
          ContactActivity.x0(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
        }
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(ContactActivity.h.b this$0) {}
        
        public void a() {
          ContactActivity.x0(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755131), 0).show();
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(ContactActivity.Z(this.a.b.b.a).p());
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(ContactActivity.h this$0, String param2String) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          if (ContactActivity.Z(this.b.b.a).n() != null && !"".equals(ContactActivity.Z(this.b.b.a).n())) {
            eZBlackList.setName(ContactActivity.Z(this.b.b.a).n());
          } else if (ContactActivity.Z(this.b.b.a).y() != null && !"".equals(ContactActivity.Z(this.b.b.a).y())) {
            eZBlackList.setName(ContactActivity.Z(this.b.b.a).y());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setIs_myblock("true");
          eZBlackList.setNumber(this.a);
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(ContactActivity.h.b.a this$0) {}
        
        public void a() {
          ContactActivity.x0(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
        }
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(ContactActivity.h.b.a this$0) {}
        
        public void a() {
          ContactActivity.x0(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755131), 0).show();
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(ContactActivity.Z(this.a.b.b.a).p());
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(ContactActivity.h this$0) {}
      
      public void a() {
        ContactActivity.x0(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
      }
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(ContactActivity.h this$0) {}
      
      public void a() {
        ContactActivity.x0(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755131), 0).show();
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(ContactActivity.Z(this.a.b.b.a).p());
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(ContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(ContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str = ContactActivity.Z(this.b.a).p().replace("-", "");
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
      a(ContactActivity.h.b this$0, String param3String) {}
      
      public void a(boolean param3Boolean) {
        if (param3Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          if (ContactActivity.Z(this.b.b.a).n() != null && !"".equals(ContactActivity.Z(this.b.b.a).n())) {
            eZBlackList.setName(ContactActivity.Z(this.b.b.a).n());
          } else if (ContactActivity.Z(this.b.b.a).y() != null && !"".equals(ContactActivity.Z(this.b.b.a).y())) {
            eZBlackList.setName(ContactActivity.Z(this.b.b.a).y());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setIs_myblock("true");
          eZBlackList.setNumber(this.a);
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(ContactActivity.h.b.a this$0) {}
        
        public void a() {
          ContactActivity.x0(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
        }
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(ContactActivity.h.b.a this$0) {}
        
        public void a() {
          ContactActivity.x0(this.a.b.b.a);
          Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755131), 0).show();
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(ContactActivity.Z(this.a.b.b.a).p());
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(ContactActivity.h.b this$0) {}
      
      public void a() {
        ContactActivity.x0(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
      }
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(ContactActivity.h.b this$0) {}
      
      public void a() {
        ContactActivity.x0(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755131), 0).show();
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(ContactActivity.Z(this.a.b.b.a).p());
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.e.a {
    a(ContactActivity this$0, String param1String) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
      } else {
        EZBlackList eZBlackList = new EZBlackList();
        if (ContactActivity.Z(this.b.b.a).n() != null && !"".equals(ContactActivity.Z(this.b.b.a).n())) {
          eZBlackList.setName(ContactActivity.Z(this.b.b.a).n());
        } else if (ContactActivity.Z(this.b.b.a).y() != null && !"".equals(ContactActivity.Z(this.b.b.a).y())) {
          eZBlackList.setName(ContactActivity.Z(this.b.b.a).y());
        } else {
          eZBlackList.setName("");
        } 
        eZBlackList.setIs_myblock("true");
        eZBlackList.setNumber(this.a);
        com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(ContactActivity.h.b.a this$0) {}
      
      public void a() {
        ContactActivity.x0(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
      }
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(ContactActivity.h.b.a this$0) {}
      
      public void a() {
        ContactActivity.x0(this.a.b.b.a);
        Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755131), 0).show();
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(ContactActivity.Z(this.a.b.b.a).p());
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(ContactActivity this$0) {}
    
    public void a() {
      ContactActivity.x0(this.a.b.b.a);
      Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755566), 0).show();
    }
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(ContactActivity this$0) {}
    
    public void a() {
      ContactActivity.x0(this.a.b.b.a);
      Toast.makeText(this.a.b.b.a.getApplicationContext(), this.a.b.b.a.getResources().getString(2131755131), 0).show();
      CollectInfo collectInfo = new CollectInfo();
      collectInfo.setNumber(ContactActivity.Z(this.a.b.b.a).p());
      collectInfo.setUser_blocked("1");
      collectInfo.setUser_commented("0");
      collectInfo.setUser_reported("0");
      collectInfo.setUser_upload_recording("0");
      com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
    }
  }
  
  class i implements Runnable {
    i(ContactActivity this$0) {}
    
    public void run() {
      try {
        int j = ContactActivity.q0(this.b).getHeight();
        int k = ContactActivity.r0(this.b).getHeight();
        CollapsingToolbarLayout.LayoutParams layoutParams1 = (CollapsingToolbarLayout.LayoutParams)ContactActivity.s0(this.b).getLayoutParams();
        k = j + k;
        ((FrameLayout.LayoutParams)layoutParams1).height = com.allinone.callerid.util.j.a(this.b.getApplicationContext(), 12.0F) + k;
        ContactActivity.s0(this.b).setLayoutParams((ViewGroup.LayoutParams)layoutParams1);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams)ContactActivity.t0(this.b).getLayoutParams();
        ((ViewGroup.MarginLayoutParams)layoutParams).height = k + com.allinone.callerid.util.j.a(this.b.getApplicationContext(), 12.0F);
        ContactActivity.t0(this.b).setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class j implements com.allinone.callerid.util.gg.c.c {
    j(ContactActivity this$0) {}
    
    public void a() {
      com.allinone.callerid.util.gg.c.c().b();
      ContactActivity.y0(this.a);
    }
    
    public void b(com.google.android.gms.ads.formats.g param1g) {
      UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)this.a.getLayoutInflater().inflate(2131492868, null);
      com.allinone.callerid.util.gg.d.a(param1g, unifiedNativeAdView);
      ContactActivity.Q(this.a).removeAllViews();
      ContactActivity.Q(this.a).addView((View)unifiedNativeAdView);
      ContactActivity.R(this.a).setVisibility(0);
    }
  }
  
  class k implements com.allinone.callerid.i.a.e.a {
    k(ContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        try {
          ContactActivity.S(this.a).setVisibility(0);
          ContactActivity.T(this.a).setVisibility(0);
          ContactActivity.U(this.a).setText(this.a.getResources().getString(2131755825));
          ContactActivity.V(this.a).setImageResource(2131231068);
          ContactActivity.W(this.a).setText(this.a.getResources().getString(2131755825));
          ContactActivity.X(this.a).setImageResource(2131231068);
          ContactActivity.Y(this.a).setText(this.a.getResources().getString(2131755825));
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        ContactActivity.S(this.a).setVisibility(8);
        ContactActivity.T(this.a).setVisibility(8);
        ContactActivity.U(this.a).setText(this.a.getResources().getString(2131755114));
        ContactActivity.V(this.a).setImageResource(2131231067);
        ContactActivity.W(this.a).setText(this.a.getResources().getString(2131755114));
        ContactActivity.X(this.a).setImageResource(2131231067);
        ContactActivity.Y(this.a).setText(this.a.getResources().getString(2131755114));
      } 
    }
  }
  
  class l implements Runnable {
    l(ContactActivity this$0) {}
    
    public void run() {
      int i = com.allinone.callerid.f.k.b.d().e(ContactActivity.Z(this.b).p());
      this.b.runOnUiThread(new a(this, i));
    }
    
    class a implements Runnable {
      a(ContactActivity.l this$0, int param2Int) {}
      
      public void run() {
        try {
          if (this.b > 0)
            ContactActivity.b0(this.c.b).setVisibility(0); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(ContactActivity this$0, int param1Int) {}
    
    public void run() {
      try {
        if (this.b > 0)
          ContactActivity.b0(this.c.b).setVisibility(0); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class m implements com.allinone.callerid.i.a.q.d {
    m(ContactActivity this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      if (param1ArrayList != null)
        try {
          if (param1ArrayList.size() > 0)
            for (byte b = 0; b < param1ArrayList.size(); b++) {
              CallLogBean callLogBean = param1ArrayList.get(b);
              RelativeLayout relativeLayout = (RelativeLayout)LayoutInflater.from((Context)this.a).inflate(2131493219, null);
              ImageView imageView1 = (ImageView)relativeLayout.findViewById(2131296412);
              LinearLayout linearLayout = (LinearLayout)relativeLayout.findViewById(2131297220);
              TextView textView1 = (TextView)relativeLayout.findViewById(2131297861);
              TextView textView2 = (TextView)relativeLayout.findViewById(2131297863);
              ImageView imageView2 = (ImageView)relativeLayout.findViewById(2131296421);
              String str = callLogBean.B();
              if (str != null && !"".equals(callLogBean.B())) {
                str = i1.J(this.a.getApplicationContext(), callLogBean.B());
                if (str != null && !"".equals(str)) {
                  textView2.setText(str);
                  textView2.setVisibility(0);
                  linearLayout.setVisibility(0);
                } 
              } else if (ContactActivity.Z(this.a).r() != null && !"".equals(ContactActivity.Z(this.a).r())) {
                textView2.setText(ContactActivity.Z(this.a).r());
                textView2.setVisibility(0);
                linearLayout.setVisibility(0);
              } else if (ContactActivity.Z(this.a).B() != null && !"".equals(ContactActivity.Z(this.a).B())) {
                str = i1.J(this.a.getApplicationContext(), ContactActivity.Z(this.a).B());
                if (str != null && !"".equals(str)) {
                  textView2.setText(str);
                  textView2.setVisibility(0);
                  linearLayout.setVisibility(0);
                } 
              } 
              textView1.setText(q0.b(callLogBean.p()));
              a a = new a();
              this(this, callLogBean);
              imageView1.setOnClickListener(a);
              b b1 = new b();
              this(this, callLogBean);
              imageView2.setOnClickListener(b1);
              ContactActivity.d0(this.a).addView((View)relativeLayout);
            }  
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
    
    class a implements View.OnClickListener {
      a(ContactActivity.m this$0, CallLogBean param2CallLogBean) {}
      
      public void onClick(View param2View) {
        try {
          q0.a(this.c.a.getApplicationContext(), this.b.p());
        } catch (Exception exception) {
          ContactActivity contactActivity = this.c.a;
          Toast.makeText((Context)contactActivity, contactActivity.getResources().getString(2131755541), 1).show();
        } 
      }
    }
    
    class b implements View.OnClickListener {
      b(ContactActivity.m this$0, CallLogBean param2CallLogBean) {}
      
      public void onClick(View param2View) {
        try {
          Intent intent = new Intent();
          this("android.intent.action.VIEW");
          intent.setType("vnd.android-dir/mms-sms");
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("smsto:");
          stringBuilder.append(this.b.p());
          intent.setData(Uri.parse(stringBuilder.toString()));
          intent.addFlags(268468224);
          this.c.a.startActivity(intent);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(ContactActivity this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      try {
        q0.a(this.c.a.getApplicationContext(), this.b.p());
      } catch (Exception exception) {
        ContactActivity contactActivity = this.c.a;
        Toast.makeText((Context)contactActivity, contactActivity.getResources().getString(2131755541), 1).show();
      } 
    }
  }
  
  class b implements View.OnClickListener {
    b(ContactActivity this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      try {
        Intent intent = new Intent();
        this("android.intent.action.VIEW");
        intent.setType("vnd.android-dir/mms-sms");
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("smsto:");
        stringBuilder.append(this.b.p());
        intent.setData(Uri.parse(stringBuilder.toString()));
        intent.addFlags(268468224);
        this.c.a.startActivity(intent);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class n implements com.allinone.callerid.i.a.p.b {
    n(ContactActivity this$0) {}
    
    public void a(int param1Int, String param1String) {
      if (param1Int != -999)
        ContactActivity.Z(this.a).I0(param1Int); 
      if (param1String != null && !"".equals(param1String)) {
        if (param1String.equals("1")) {
          ContactActivity.Z(this.a).U0("1");
          ContactActivity.e0(this.a).setImageResource(2131231100);
          ContactActivity.f0(this.a).setImageResource(2131231100);
        } else {
          ContactActivity.Z(this.a).U0("0");
          ContactActivity.e0(this.a).setImageResource(2131231101);
          ContactActivity.f0(this.a).setImageResource(2131231101);
        } 
      } else {
        ContactActivity.Z(this.a).U0("0");
        ContactActivity.e0(this.a).setImageResource(2131231101);
        ContactActivity.f0(this.a).setImageResource(2131231101);
      } 
    }
  }
  
  class o implements com.allinone.callerid.i.a.p.e {
    o(ContactActivity this$0) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String)) {
        ContactActivity.v0(this.a).setText(param1String);
        ContactActivity.Z(this.a).B0(param1String);
      } else if (ContactActivity.Z(this.a).n() != null && !"".equals(ContactActivity.Z(this.a).n())) {
        ContactActivity.v0(this.a).setText(ContactActivity.Z(this.a).n());
      } else {
        ContactActivity.v0(this.a).setText(ContactActivity.Z(this.a).p());
      } 
    }
  }
  
  class p implements com.allinone.callerid.i.a.p.c {
    p(ContactActivity this$0) {}
    
    public void a(long param1Long) {
      if (param1Long != 0L) {
        u.c((Activity)this.a, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, param1Long), "", 2131231148, ContactActivity.g0(this.a));
      } else if (ContactActivity.Z(this.a).a() != null && !"".equals(ContactActivity.Z(this.a).a())) {
        ContactActivity contactActivity = this.a;
        u.a((Activity)contactActivity, ContactActivity.Z(contactActivity).a(), 2131231148, ContactActivity.g0(this.a));
      } else {
        ContactActivity.g0(this.a).setImageResource(2131231148);
      } 
    }
  }
  
  class q implements com.allinone.callerid.i.a.d.b {
    q(ContactActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean && l0.u() && b1.o0() && i1.j0(this.a.getApplicationContext()) && i1.r0(this.a.getApplicationContext()) && !i1.o0(this.a.getApplicationContext(), l0.a())) {
        ContactActivity contactActivity;
        if (l0.e() != null && !"".equals(l0.e()))
          u.a((Activity)this.a, l0.e(), 2131231148, ContactActivity.h0(this.a)); 
        if (l0.c() != null && !"".equals(l0.c()))
          ContactActivity.i0(this.a).setText(l0.c()); 
        if (l0.b() != null && !"".equals(l0.b()))
          ContactActivity.j0(this.a).setText(l0.b()); 
        ContactActivity.k0(this.a).setVisibility(0);
        com.allinone.callerid.util.q.b().c("pdt_recommend_show");
        ImageView imageView = (ImageView)this.a.findViewById(2131297059);
        imageView.setVisibility(8);
        if (b1.t0()) {
          contactActivity = this.a;
          ContactActivity.m0(contactActivity, AnimationUtils.loadAnimation(contactActivity.getApplicationContext(), 2130772035));
          ContactActivity.l0(this.a).setInterpolator((Interpolator)new LinearInterpolator());
          ContactActivity.h0(this.a).startAnimation(ContactActivity.l0(this.a));
          b1.a2(false);
        } else {
          contactActivity.setVisibility(0);
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/contactpdt/ContactActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */