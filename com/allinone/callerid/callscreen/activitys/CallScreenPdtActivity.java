package com.allinone.callerid.callscreen.activitys;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;
import com.allinone.callerid.callscreen.CustomMedia.JZMediaExo;
import com.allinone.callerid.callscreen.bean.DownloadInfo;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.callscreen.view.MyJzvdStd;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q0;
import java.io.File;
import java.util.ArrayList;

public class CallScreenPdtActivity extends BaseActivity implements View.OnClickListener {
  private TextView A;
  
  private FrameLayout B;
  
  private ImageView C;
  
  private TextView D;
  
  private HomeInfo E;
  
  private boolean F;
  
  private PopupWindow G;
  
  private RelativeLayout H;
  
  private boolean I;
  
  private RadioButton J;
  
  private RadioButton K;
  
  private RadioButton L;
  
  private RadioButton M;
  
  private Dialog N;
  
  private LinearLayout O;
  
  private androidx.appcompat.app.a P;
  
  private androidx.appcompat.app.a Q;
  
  private boolean R = true;
  
  private boolean S = true;
  
  ArrayList<PersonaliseContact> T = new ArrayList<PersonaliseContact>();
  
  private LinearLayout U;
  
  private ConstraintLayout V;
  
  private FrameLayout W;
  
  private LinearLayout X;
  
  private boolean Y;
  
  private ProgressBar Z;
  
  private TextView a0;
  
  private FrameLayout b0;
  
  private FrameLayout c0;
  
  private boolean d0;
  
  private w e0;
  
  private boolean f0;
  
  private boolean g0;
  
  private String h0;
  
  private long i0;
  
  private long j0;
  
  private ImageView k0;
  
  private int l0;
  
  private boolean m0;
  
  private c.d.a.i n0 = new h(this);
  
  private c.d.a.i o0 = new j(this);
  
  private final String s = "CallScreenPdtActivity";
  
  private Typeface t;
  
  private Typeface u;
  
  private Boolean v;
  
  private MyJzvdStd w;
  
  private ImageView x;
  
  private ImageView y;
  
  private TextView z;
  
  private void A0() {
    if (this.E != null) {
      com.allinone.callerid.util.q.b().c("callscreen_set_ringtone");
      if (!this.E.isIsdiy())
        if (this.S) {
          if (com.allinone.callerid.util.k1.a.i((Context)EZCallApplication.c()))
            com.allinone.callerid.d.e.g.b.b(this.E.getAudio_path(), this.E.getName(), new m(this)); 
        } else if (com.allinone.callerid.util.k1.a.i((Context)EZCallApplication.c())) {
          com.allinone.callerid.d.e.g.b.a(this.E.getAudio_path(), this.E.getName(), this.T, new n(this));
        }  
    } 
  }
  
  private void B0(Context paramContext) {
    try {
      androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a();
      this(paramContext);
      a2 = a2.q(paramContext.getResources().getString(2131755246)).h(paramContext.getResources().getString(2131755875));
      String str = paramContext.getResources().getString(2131755836);
      f f = new f();
      this(this);
      androidx.appcompat.app.a a1 = a2.n(str, f).d(true).s();
      this.Q = a1;
      a1.g(-1).setTextColor(this.l0);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void C0(Context paramContext) {
    try {
      View view = LayoutInflater.from(paramContext).inflate(2131493010, null);
      TextView textView1 = (TextView)view.findViewById(2131298187);
      TextView textView2 = (TextView)view.findViewById(2131297800);
      TextView textView3 = (TextView)view.findViewById(2131297843);
      TextView textView4 = (TextView)view.findViewById(2131297799);
      textView1.setTypeface(this.t);
      textView2.setTypeface(this.t);
      textView3.setTypeface(this.t);
      textView4.setTypeface(this.t);
      c c = new c();
      this(this);
      textView3.setOnClickListener(c);
      d d = new d();
      this(this);
      textView2.setOnClickListener(d);
      e e = new e();
      this(this);
      textView4.setOnClickListener(e);
      androidx.appcompat.app.a.a a1 = new androidx.appcompat.app.a.a();
      this(paramContext);
      this.P = a1.r(view).d(true).s();
      com.allinone.callerid.util.q.b().c("callscreen_mobile_net_show");
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void D0(boolean paramBoolean) {
    try {
      Dialog dialog = new Dialog();
      this((Context)this, 2131820777);
      this.N = dialog;
      View view = LayoutInflater.from((Context)this).inflate(2131493019, null);
      ImageView imageView = (ImageView)view.findViewById(2131297122);
      this.J = (RadioButton)view.findViewById(2131297401);
      this.K = (RadioButton)view.findViewById(2131297400);
      this.L = (RadioButton)view.findViewById(2131297403);
      this.M = (RadioButton)view.findViewById(2131297402);
      FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296784);
      this.O = (LinearLayout)view.findViewById(2131297178);
      RadioButton radioButton1 = this.J;
      u u = new u();
      this(this);
      radioButton1.setOnCheckedChangeListener(u);
      radioButton1 = this.K;
      v v = new v();
      this(this);
      radioButton1.setOnCheckedChangeListener(v);
      radioButton1 = this.L;
      a a1 = new a();
      this(this);
      radioButton1.setOnCheckedChangeListener(a1);
      RadioButton radioButton2 = this.M;
      b b = new b();
      this(this);
      radioButton2.setOnCheckedChangeListener(b);
      this.O.setOnClickListener(this);
      imageView.setOnClickListener(this);
      frameLayout.setOnClickListener(this);
      this.J.setTypeface(this.t);
      this.K.setTypeface(this.t);
      this.L.setTypeface(this.t);
      this.M.setTypeface(this.t);
      this.J.setTypeface(this.t);
      ((TextView)view.findViewById(2131297842)).setTypeface(this.t);
      ((TextView)view.findViewById(2131298097)).setTypeface(this.t);
      ((TextView)view.findViewById(2131298114)).setTypeface(this.t);
      ((TextView)view.findViewById(2131298117)).setTypeface(this.t);
      this.N.setContentView(view);
      ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
      layoutParams.width = (getResources().getDisplayMetrics()).widthPixels;
      view.setLayoutParams(layoutParams);
      if (this.N.getWindow() != null) {
        this.N.getWindow().setGravity(80);
        this.N.getWindow().setWindowAnimations(2131820778);
      } 
      this.N.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void E0(String paramString) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(this.E.getName());
      stringBuilder.append("_");
      stringBuilder.append(this.E.getData_id());
      stringBuilder.append(".aac");
      String str2 = com.allinone.callerid.d.f.a.b(stringBuilder.toString());
      stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(com.allinone.callerid.d.f.a.b);
      stringBuilder.append(str2);
      String str1 = stringBuilder.toString();
      if (d0.a) {
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append("audio_filePath: ");
        stringBuilder1.append(str1);
        d0.a("callscreen", stringBuilder1.toString());
        stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append("audio_url: ");
        stringBuilder1.append(paramString);
        d0.a("callscreen", stringBuilder1.toString());
      } 
      c.d.a.q.d().c(paramString).h(str1).g(0, this.E).P(this.o0).F(8).N(1000).I(1000).start();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void F0(String paramString) {
    try {
      Dialog dialog = this.N;
      if (dialog != null)
        dialog.dismiss(); 
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      stringBuilder1.append(this.E.getName());
      stringBuilder1.append("_");
      stringBuilder1.append(this.E.getData_id());
      stringBuilder1.append(".mp4");
      String str = com.allinone.callerid.d.f.a.b(stringBuilder1.toString());
      StringBuilder stringBuilder2 = new StringBuilder();
      this();
      stringBuilder2.append(com.allinone.callerid.d.f.a.a);
      stringBuilder2.append(str);
      str = stringBuilder2.toString();
      if (d0.a) {
        stringBuilder2 = new StringBuilder();
        this();
        stringBuilder2.append("filePath: ");
        stringBuilder2.append(str);
        d0.a("callscreen", stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        this();
        stringBuilder2.append("url: ");
        stringBuilder2.append(paramString);
        d0.a("callscreen", stringBuilder2.toString());
      } 
      this.i0 = System.currentTimeMillis();
      com.allinone.callerid.util.q.b().c("callscreen_download");
      c.d.a.q.d().c(paramString).h(str).g(0, this.E).P(this.n0).F(8).N(1000).I(1000).start();
      str = this.E.getData_id();
      g g = new g();
      this(this);
      com.allinone.callerid.d.e.a.a(str, "download", g);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void o0() {
    try {
      if (this.v.booleanValue())
        this.x.setImageResource(2131231059); 
      HomeInfo homeInfo = (HomeInfo)getIntent().getSerializableExtra("homeinfo");
      this.E = homeInfo;
      if (homeInfo != null) {
        if (d0.a) {
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("homeInfo:");
          stringBuilder1.append(this.E.toString());
          d0.a("callscreen", stringBuilder1.toString());
        } 
        TextView textView = this.z;
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(getResources().getString(2131755160));
        stringBuilder.append(" ");
        stringBuilder.append(this.E.getAuthor());
        textView.setText(stringBuilder.toString());
        this.A.setText(this.E.getName());
        this.D.setText(String.valueOf(this.E.getLike_count()));
        if (this.E.isIslike()) {
          this.C.setImageResource(2131231371);
        } else {
          this.C.setImageResource(2131231372);
        } 
        if (this.E.getPath() != null && !"".equals(this.E.getPath())) {
          File file = new File();
          this(this.E.getPath());
          if (file.exists()) {
            this.d0 = true;
          } else {
            this.d0 = false;
          } 
        } 
        if (this.E.isDownloaded() && this.d0 && com.allinone.callerid.util.k1.a.e(getApplicationContext())) {
          y0(this.E);
        } else {
          com.bumptech.glide.i i1 = com.bumptech.glide.c.v((FragmentActivity)this);
          com.bumptech.glide.request.e e = new com.bumptech.glide.request.e();
          this();
          i1.w((com.bumptech.glide.request.e)e.f()).r(this.E.getJpgimg_url()).C0(((JzvdStd)this.w).h0);
          s0();
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void p0() {
    try {
      o o = new o();
      this(this);
      com.allinone.callerid.i.a.d.a.a(o);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void q0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493144, null);
    TextView textView = (TextView)view.findViewById(2131297854);
    FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296721);
    textView.setTypeface(this.t);
    frameLayout.setOnClickListener(this);
    this.G = new PopupWindow(view);
    int j = getWindowManager().getDefaultDisplay().getWidth();
    this.G.setWidth(j / 4);
    this.G.setHeight(-2);
    this.G.setFocusable(true);
    if (i1.f0(getApplicationContext()).booleanValue()) {
      this.G.setAnimationStyle(2131821306);
    } else {
      this.G.setAnimationStyle(2131821305);
    } 
    ColorDrawable colorDrawable = new ColorDrawable(0);
    this.G.setBackgroundDrawable((Drawable)colorDrawable);
  }
  
  private void r0() {
    this.l0 = d1.a((Context)this, 2130968859, 2131099706);
    this.w = (MyJzvdStd)findViewById(2131297097);
    this.x = (ImageView)findViewById(2131296949);
    if (i1.f0(getApplicationContext()).booleanValue())
      this.x.setImageResource(2131231059); 
    this.y = (ImageView)findViewById(2131297053);
    this.k0 = (ImageView)findViewById(2131297026);
    this.z = (TextView)findViewById(2131297803);
    this.A = (TextView)findViewById(2131297984);
    this.B = (FrameLayout)findViewById(2131296785);
    this.C = (ImageView)findViewById(2131297008);
    ImageView imageView1 = (ImageView)findViewById(2131297051);
    ImageView imageView2 = (ImageView)findViewById(2131297014);
    this.D = (TextView)findViewById(2131297964);
    TextView textView1 = (TextView)findViewById(2131298114);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296786);
    TextView textView2 = (TextView)findViewById(2131298115);
    RelativeLayout relativeLayout1 = (RelativeLayout)findViewById(2131297503);
    this.H = relativeLayout1;
    if (this.I) {
      relativeLayout1.setVisibility(0);
      com.allinone.callerid.d.f.f.w(false);
    } 
    this.U = (LinearLayout)findViewById(2131297152);
    this.V = (ConstraintLayout)findViewById(2131297163);
    this.W = (FrameLayout)findViewById(2131296787);
    TextView textView4 = (TextView)findViewById(2131298116);
    this.X = (LinearLayout)findViewById(2131297194);
    TextView textView3 = (TextView)findViewById(2131298023);
    if ("1".equals(com.allinone.callerid.util.p.d(getApplicationContext()).getCountry_code()))
      textView3.setText("Emily"); 
    TextView textView5 = (TextView)findViewById(2131298022);
    RelativeLayout relativeLayout2 = (RelativeLayout)findViewById(2131297472);
    this.Z = (ProgressBar)findViewById(2131297375);
    this.a0 = (TextView)findViewById(2131298048);
    this.b0 = (FrameLayout)findViewById(2131296794);
    this.c0 = (FrameLayout)findViewById(2131296793);
    this.Z.setMax(100);
    this.x.setOnClickListener(this);
    this.y.setOnClickListener(this);
    this.k0.setOnClickListener(this);
    this.B.setOnClickListener(this);
    this.C.setOnClickListener(this);
    imageView1.setOnClickListener(this);
    imageView2.setOnClickListener(this);
    frameLayout.setOnClickListener(this);
    this.W.setOnClickListener(this);
    relativeLayout2.setOnClickListener(this);
    this.A.setTypeface(this.u);
    textView5.setTypeface(this.u);
    textView3.setTypeface(this.u);
    this.z.setTypeface(this.t);
    this.D.setTypeface(this.t);
    textView1.setTypeface(this.u);
    textView4.setTypeface(this.u);
    textView2.setTypeface(this.u);
    textView2.setTypeface(this.t);
  }
  
  private void s0() {
    try {
      if (com.allinone.callerid.util.e.b(getApplicationContext())) {
        if (com.allinone.callerid.util.e.c(getApplicationContext())) {
          if (com.allinone.callerid.d.f.f.f()) {
            C0((Context)this);
          } else {
            x0(this.E);
            Toast toast = Toast.makeText((Context)this, getResources().getString(2131755475), 0);
            toast.setGravity(17, 0, 0);
            toast.show();
            com.allinone.callerid.util.q.b().c("callscreen_mobile_net_toast");
          } 
        } else {
          x0(this.E);
        } 
      } else {
        B0((Context)this);
        w w1 = new w();
        this(this, null);
        this.e0 = w1;
        IntentFilter intentFilter = new IntentFilter();
        this();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.e0, intentFilter);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void w0(Activity paramActivity) {
    int j = Build.VERSION.SDK_INT;
    if (j < 19)
      return; 
    Window window = paramActivity.getWindow();
    if (j >= 21) {
      window.clearFlags(67108864);
      window.addFlags(-2147483648);
      j = window.getDecorView().getSystemUiVisibility();
      window.getDecorView().setSystemUiVisibility(j | 0x100 | 0x400);
      window.setStatusBarColor(0);
    } else {
      window.addFlags(67108864);
    } 
  }
  
  private void x0(HomeInfo paramHomeInfo) {
    try {
      Jzvd.D();
      if (q0.d(getApplicationContext()) >= 720) {
        str = paramHomeInfo.getHdvideo_url();
      } else {
        str = str.getSdvideo_url();
      } 
      this.h0 = str;
      String str = EZCallApplication.d((Context)this).j(this.h0);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("proxyUrl:");
        stringBuilder.append(str);
        d0.a("callscreen", stringBuilder.toString());
      } 
      cn.jzvd.t t = new cn.jzvd.t();
      this(str);
      t.e = true;
      this.w.setUp(t, 1, JZMediaExo.class);
      this.w.L();
      this.f0 = true;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void y0(HomeInfo paramHomeInfo) {
    try {
      com.bumptech.glide.c.v((FragmentActivity)this).r(paramHomeInfo.getJpgimg_url()).C0(((JzvdStd)this.w).h0);
      Jzvd.D();
      cn.jzvd.t t = new cn.jzvd.t();
      this(Uri.parse(paramHomeInfo.getPath()));
      t.e = true;
      this.w.setUp(t, 1, JZMediaExo.class);
      this.w.L();
      this.f0 = true;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void z0() {
    Dialog dialog = this.N;
    if (dialog != null)
      dialog.dismiss(); 
    HomeInfo homeInfo = this.E;
    if (homeInfo != null) {
      if (this.R && homeInfo.isIsdiy())
        this.E.setUseVideoAudioRing(true); 
      com.allinone.callerid.util.q.b().c("callscreen_set");
      if (this.S) {
        com.allinone.callerid.d.e.e.d.a(this.E, new k(this));
      } else {
        com.allinone.callerid.d.e.e.a.b(this.E, this.T, new l(this));
      } 
    } 
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 8989 && paramInt2 == 9898) {
      if (paramIntent != null) {
        Bundle bundle = paramIntent.getExtras();
        if (bundle != null)
          this.T = bundle.getParcelableArrayList("selected_contacts"); 
      } 
      ArrayList<PersonaliseContact> arrayList = this.T;
      if (arrayList == null || arrayList.size() <= 0) {
        RadioButton radioButton = this.J;
        if (radioButton != null)
          radioButton.setChecked(true); 
      } 
    } else if (paramInt1 == 970 && paramInt2 == 980) {
      HomeInfo homeInfo = this.E;
      if (homeInfo != null)
        if (homeInfo.isDownloaded()) {
          z0();
          if (this.R) {
            A0();
          } else {
            com.allinone.callerid.util.q.b().c("callscreen_set_default_ringtone");
          } 
        } else {
          F0(this.h0);
        }  
    } 
  }
  
  public void onBackPressed() {
    try {
      boolean bool = Jzvd.b();
      if (bool)
        return; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    super.onBackPressed();
  }
  
  public void onClick(View paramView) {
    Dialog dialog;
    LinearLayout linearLayout;
    switch (paramView.getId()) {
      default:
        return;
      case 2131297472:
        if (!this.I)
          if (!this.Y) {
            this.Y = true;
            this.V.setVisibility(0);
            this.W.setVisibility(0);
            this.X.setVisibility(0);
            this.U.setVisibility(8);
            this.B.setVisibility(8);
            this.b0.setVisibility(8);
            this.c0.setVisibility(8);
            this.k0.setImageResource(2131230818);
            com.allinone.callerid.util.q.b().c("callscreen_preview");
          } else {
            this.Y = false;
            this.V.setVisibility(8);
            this.W.setVisibility(8);
            this.X.setVisibility(8);
            this.U.setVisibility(0);
            this.B.setVisibility(0);
            this.b0.setVisibility(0);
            this.c0.setVisibility(0);
            this.k0.setImageResource(2131231375);
          }  
      case 2131297122:
        dialog = this.N;
        if (dialog != null)
          dialog.dismiss(); 
      case 2131297053:
        if (this.f0)
          if (this.F) {
            this.w.d();
            this.F = false;
            this.y.setImageResource(2131231377);
          } else {
            this.w.k();
            this.F = true;
            this.y.setImageResource(2131231374);
            com.allinone.callerid.util.q.b().c("callscreen_silent");
          }  
      case 2131297051:
        try {
          Intent intent = new Intent();
          this("android.intent.action.SEND");
          intent.setType("text/plain");
          intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131755727));
          intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131755169));
          intent.setFlags(268435456);
          startActivity(Intent.createChooser(intent, getResources().getString(2131755725)));
          overridePendingTransition(2130771968, 2130771969);
          com.allinone.callerid.util.q.b().c("callscreen_share");
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131297026:
        if (!this.Y) {
          this.Y = true;
          this.V.setVisibility(0);
          this.W.setVisibility(0);
          this.X.setVisibility(0);
          this.U.setVisibility(8);
          this.B.setVisibility(8);
          this.b0.setVisibility(8);
          this.c0.setVisibility(8);
          com.allinone.callerid.util.q.b().c("callscreen_preview");
          this.k0.setImageResource(2131230818);
        } else {
          this.Y = false;
          this.V.setVisibility(8);
          this.W.setVisibility(8);
          this.X.setVisibility(8);
          this.U.setVisibility(0);
          this.B.setVisibility(0);
          this.b0.setVisibility(0);
          this.c0.setVisibility(0);
          this.k0.setImageResource(2131231375);
        } 
      case 2131297014:
        if (this.G == null)
          q0(); 
        if (this.G != null) {
          int[] arrayOfInt = new int[2];
          exception.getLocationOnScreen(arrayOfInt);
          PopupWindow popupWindow1 = this.G;
          popupWindow1.showAtLocation((View)exception, 0, arrayOfInt[0], arrayOfInt[1] - popupWindow1.getHeight());
        } 
      case 2131297008:
        if (this.E.isIslike()) {
          this.E.setIslike(false);
          HomeInfo homeInfo1 = this.E;
          homeInfo1.setLike_count(homeInfo1.getLike_count() - 1);
          this.D.setText(String.valueOf(this.E.getLike_count()));
          this.C.setImageResource(2131231372);
          com.allinone.callerid.d.e.a.b(this.E.getData_id(), this.E.getLike_count(), false, new p(this));
        } else {
          HomeInfo homeInfo1 = this.E;
          homeInfo1.setLike_count(homeInfo1.getLike_count() + 1);
          this.D.setText(String.valueOf(this.E.getLike_count()));
          this.E.setIslike(true);
          this.C.setImageResource(2131231371);
          com.allinone.callerid.d.e.a.a(this.E.getData_id(), "like", new q(this));
          com.allinone.callerid.d.e.a.b(this.E.getData_id(), this.E.getLike_count(), true, new r(this));
          com.allinone.callerid.util.q.b().c("callscreen_like");
        } 
      case 2131296949:
        finish();
        overridePendingTransition(2130771968, 2130771969);
        if (this.m0)
          com.allinone.callerid.util.gg.e.d().f(); 
      case 2131296787:
        D0(com.allinone.callerid.d.f.f.k());
        com.allinone.callerid.util.q.b().c("callscreen_click_set");
      case 2131296786:
        this.H.setVisibility(8);
        this.I = false;
        D0(com.allinone.callerid.d.f.f.k());
        com.allinone.callerid.util.q.b().c("callscreen_click_set");
      case 2131296785:
        D0(com.allinone.callerid.d.f.f.k());
        com.allinone.callerid.util.q.b().c("callscreen_click_set");
      case 2131296784:
        linearLayout = this.O;
        if (linearLayout != null)
          linearLayout.setVisibility(8); 
        if (com.allinone.callerid.util.k1.a.a(getApplicationContext())) {
          HomeInfo homeInfo1 = this.E;
          if (homeInfo1 != null)
            if (homeInfo1.isDownloaded()) {
              z0();
              if (this.R) {
                A0();
              } else {
                com.allinone.callerid.util.q.b().c("callscreen_set_default_ringtone");
              } 
            } else {
              F0(this.h0);
            }  
        } else {
          Intent intent = new Intent();
          intent.setClass((Context)this, OpenPerActivity.class);
          startActivityForResult(intent, 970);
          overridePendingTransition(2130771968, 2130771969);
        } 
      case 2131296721:
        break;
    } 
    PopupWindow popupWindow = this.G;
    if (popupWindow != null)
      popupWindow.dismiss(); 
    HomeInfo homeInfo = this.E;
    if (homeInfo != null && !homeInfo.isIsreport()) {
      AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
      builder.setTitle(getResources().getString(2131755651));
      builder.setMessage(getResources().getString(2131755649));
      builder.setPositiveButton(getResources().getString(2131755647), new a(this));
      builder.setNegativeButton(getResources().getString(2131755834), b.b);
      builder.create().show();
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    w0((Activity)this);
    setContentView(2131492908);
    Boolean bool = i1.f0((Context)this);
    this.v = bool;
    if (bool.booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.t = g1.b();
    this.u = g1.a();
    getWindow().getDecorView().post(new i(this));
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      Jzvd.D();
      w w1 = this.e0;
      if (w1 != null)
        unregisterReceiver(w1); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      if (this.I) {
        this.I = false;
        this.H.setVisibility(8);
      } else {
        if (this.g0)
          return true; 
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
    try {
      Jzvd.l();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onResume() {
    super.onResume();
    try {
      Jzvd.m();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements CompoundButton.OnCheckedChangeListener {
    a(CallScreenPdtActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        CallScreenPdtActivity.m0(this.a, true);
        CallScreenPdtActivity.n0(this.a).setChecked(false);
      } else {
        CallScreenPdtActivity.m0(this.a, false);
      } 
    }
  }
  
  class b implements CompoundButton.OnCheckedChangeListener {
    b(CallScreenPdtActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean)
        CallScreenPdtActivity.Q(this.a).setChecked(false); 
    }
  }
  
  class c implements View.OnClickListener {
    c(CallScreenPdtActivity this$0) {}
    
    public void onClick(View param1View) {
      if (CallScreenPdtActivity.R(this.b) != null)
        CallScreenPdtActivity.R(this.b).dismiss(); 
      com.allinone.callerid.util.q.b().c("callscreen_mobile_net_cancel");
    }
  }
  
  class d implements View.OnClickListener {
    d(CallScreenPdtActivity this$0) {}
    
    public void onClick(View param1View) {
      if (CallScreenPdtActivity.R(this.b) != null)
        CallScreenPdtActivity.R(this.b).dismiss(); 
      com.allinone.callerid.d.f.f.r(false);
      if (CallScreenPdtActivity.S(this.b) != null) {
        CallScreenPdtActivity callScreenPdtActivity = this.b;
        CallScreenPdtActivity.T(callScreenPdtActivity, CallScreenPdtActivity.S(callScreenPdtActivity));
      } 
      com.allinone.callerid.util.q.b().c("callscreen_mobile_net_always");
    }
  }
  
  class e implements View.OnClickListener {
    e(CallScreenPdtActivity this$0) {}
    
    public void onClick(View param1View) {
      if (CallScreenPdtActivity.R(this.b) != null)
        CallScreenPdtActivity.R(this.b).dismiss(); 
      if (CallScreenPdtActivity.S(this.b) != null) {
        CallScreenPdtActivity callScreenPdtActivity = this.b;
        CallScreenPdtActivity.T(callScreenPdtActivity, CallScreenPdtActivity.S(callScreenPdtActivity));
      } 
      com.allinone.callerid.util.q.b().c("callscreen_mobile_net_allow");
    }
  }
  
  class f implements DialogInterface.OnClickListener {
    f(CallScreenPdtActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (CallScreenPdtActivity.U(this.b) != null)
        CallScreenPdtActivity.U(this.b).dismiss(); 
    }
  }
  
  class g implements com.allinone.callerid.d.e.a.b {
    g(CallScreenPdtActivity this$0) {}
    
    public void a() {}
  }
  
  class h extends c.d.a.i {
    h(CallScreenPdtActivity this$0) {}
    
    protected void b(c.d.a.a param1a) {
      CallScreenPdtActivity.b0(this.a, System.currentTimeMillis());
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("耗时：");
        stringBuilder.append(CallScreenPdtActivity.a0(this.a) - CallScreenPdtActivity.c0(this.a));
        d0.a("callscreen", stringBuilder.toString());
      } 
      com.allinone.callerid.util.q.b().c("callscreen_download_success");
      if (CallScreenPdtActivity.S(this.a) != null)
        try {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("下载成功： ");
            stringBuilder.append(param1a.getPath());
            d0.a("callscreen", stringBuilder.toString());
          } 
          CallScreenPdtActivity.Z(this.a, false);
          DownloadInfo downloadInfo = com.allinone.callerid.d.b.b.b().c(CallScreenPdtActivity.S(this.a));
          downloadInfo.setPath(param1a.getPath());
          a a1 = new a();
          this(this, param1a);
          com.allinone.callerid.d.e.f.b.a(downloadInfo, a1);
          if (CallScreenPdtActivity.V(this.a) != null && CallScreenPdtActivity.X(this.a) != null) {
            CallScreenPdtActivity.V(this.a).setVisibility(8);
            CallScreenPdtActivity.X(this.a).setVisibility(8);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
    
    protected void d(c.d.a.a param1a, Throwable param1Throwable) {
      if (CallScreenPdtActivity.V(this.a) != null && CallScreenPdtActivity.X(this.a) != null) {
        CallScreenPdtActivity.V(this.a).setVisibility(8);
        CallScreenPdtActivity.X(this.a).setVisibility(8);
      } 
      CallScreenPdtActivity callScreenPdtActivity = this.a;
      Toast toast = Toast.makeText((Context)callScreenPdtActivity, callScreenPdtActivity.getResources().getString(2131755301), 1);
      toast.setGravity(17, 0, 0);
      toast.show();
      if (param1Throwable != null && param1Throwable.getMessage() != null) {
        g0.a(param1Throwable.getMessage());
        com.allinone.callerid.util.q.b().f(param1Throwable.getMessage());
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Throwable: ");
          stringBuilder.append(param1Throwable.getMessage());
          d0.a("callscreen", stringBuilder.toString());
        } 
      } 
    }
    
    protected void f(c.d.a.a param1a, int param1Int1, int param1Int2) {}
    
    protected void g(c.d.a.a param1a, int param1Int1, int param1Int2) {}
    
    protected void h(c.d.a.a param1a, int param1Int1, int param1Int2) {
      float f = param1a.v() / param1a.f();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("progress: ");
        stringBuilder.append((int)(f * 100.0F));
        stringBuilder.append("%");
        d0.a("callscreen", stringBuilder.toString());
      } 
      if (CallScreenPdtActivity.V(this.a) != null) {
        ProgressBar progressBar = CallScreenPdtActivity.V(this.a);
        param1Int1 = (int)(f * 100.0F);
        progressBar.setProgress(param1Int1);
        TextView textView = CallScreenPdtActivity.X(this.a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1Int1);
        stringBuilder.append("%");
        textView.setText(stringBuilder.toString());
        if (CallScreenPdtActivity.V(this.a).getVisibility() == 8)
          CallScreenPdtActivity.V(this.a).setVisibility(0); 
        if (CallScreenPdtActivity.X(this.a).getVisibility() == 8)
          CallScreenPdtActivity.X(this.a).setVisibility(0); 
        if (!CallScreenPdtActivity.Y(this.a))
          CallScreenPdtActivity.Z(this.a, true); 
      } 
    }
    
    protected void k(c.d.a.a param1a) {}
    
    class a implements com.allinone.callerid.d.e.f.a {
      a(CallScreenPdtActivity.h this$0, c.d.a.a param2a) {}
      
      public void a(boolean param2Boolean, DownloadInfo param2DownloadInfo) {
        if (d0.a)
          d0.a("callscreen", "发送广播更新数据"); 
        b.p.a.a.b((Context)this.b.a).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
        CallScreenPdtActivity.S(this.b.a).setPath(this.a.getPath());
        CallScreenPdtActivity.d0(this.b.a);
        CallScreenPdtActivity callScreenPdtActivity = this.b.a;
        CallScreenPdtActivity.e0(callScreenPdtActivity, CallScreenPdtActivity.S(callScreenPdtActivity).getAudio_url());
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.f.a {
    a(CallScreenPdtActivity this$0, c.d.a.a param1a) {}
    
    public void a(boolean param1Boolean, DownloadInfo param1DownloadInfo) {
      if (d0.a)
        d0.a("callscreen", "发送广播更新数据"); 
      b.p.a.a.b((Context)this.b.a).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
      CallScreenPdtActivity.S(this.b.a).setPath(this.a.getPath());
      CallScreenPdtActivity.d0(this.b.a);
      CallScreenPdtActivity callScreenPdtActivity = this.b.a;
      CallScreenPdtActivity.e0(callScreenPdtActivity, CallScreenPdtActivity.S(callScreenPdtActivity).getAudio_url());
    }
  }
  
  class i implements Runnable {
    i(CallScreenPdtActivity this$0) {}
    
    public void run() {
      CallScreenPdtActivity.O(this.b);
      CallScreenPdtActivity.P(this.b);
      CallScreenPdtActivity.W(this.b);
      com.allinone.callerid.util.q.b().c("callscreen_pdt_show");
    }
  }
  
  class j extends c.d.a.i {
    j(CallScreenPdtActivity this$0) {}
    
    protected void b(c.d.a.a param1a) {
      if (CallScreenPdtActivity.S(this.a) != null)
        try {
          DownloadInfo downloadInfo = com.allinone.callerid.d.b.b.b().c(CallScreenPdtActivity.S(this.a));
          downloadInfo.setAudio_path(param1a.getPath());
          a a1 = new a();
          this(this);
          com.allinone.callerid.d.e.f.b.a(downloadInfo, a1);
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("音频下载成功： ");
            stringBuilder.append(param1a.getPath());
            d0.a("callscreen", stringBuilder.toString());
          } 
          CallScreenPdtActivity.S(this.a).setAudio_path(param1a.getPath());
          if (CallScreenPdtActivity.l0(this.a)) {
            CallScreenPdtActivity.f0(this.a);
          } else {
            com.allinone.callerid.util.q.b().c("callscreen_set_default_ringtone");
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
    
    protected void d(c.d.a.a param1a, Throwable param1Throwable) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Throwable: ");
        stringBuilder.append(param1Throwable.getMessage());
        d0.a("callscreen", stringBuilder.toString());
      } 
    }
    
    protected void f(c.d.a.a param1a, int param1Int1, int param1Int2) {}
    
    protected void g(c.d.a.a param1a, int param1Int1, int param1Int2) {}
    
    protected void h(c.d.a.a param1a, int param1Int1, int param1Int2) {
      float f = param1a.v() / param1a.f();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("audio_progress: ");
        stringBuilder.append((int)(f * 100.0F));
        stringBuilder.append("%");
        d0.a("callscreen", stringBuilder.toString());
      } 
    }
    
    protected void k(c.d.a.a param1a) {}
    
    class a implements com.allinone.callerid.d.e.f.a {
      a(CallScreenPdtActivity.j this$0) {}
      
      public void a(boolean param2Boolean, DownloadInfo param2DownloadInfo) {
        if (d0.a)
          d0.a("callscreen", "音频数据库添加成功"); 
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.f.a {
    a(CallScreenPdtActivity this$0) {}
    
    public void a(boolean param1Boolean, DownloadInfo param1DownloadInfo) {
      if (d0.a)
        d0.a("callscreen", "音频数据库添加成功"); 
    }
  }
  
  class k implements com.allinone.callerid.d.e.e.c {
    k(CallScreenPdtActivity this$0) {}
    
    public void a(boolean param1Boolean, HomeInfo param1HomeInfo) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("设置默认来电秀");
        stringBuilder.append(param1Boolean);
        d0.a("callscreen", stringBuilder.toString());
      } 
      b.p.a.a.b((Context)this.a).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
      Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755712), 1).show();
    }
  }
  
  class l implements com.allinone.callerid.d.e.e.a.a {
    l(CallScreenPdtActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("单独设置联系人来电秀");
        stringBuilder.append(param1Boolean);
        d0.a("callscreen", stringBuilder.toString());
      } 
      b.p.a.a.b((Context)this.a).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
      Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755712), 1).show();
    }
  }
  
  class m implements com.allinone.callerid.d.e.g.a {
    m(CallScreenPdtActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("设置默认铃声:");
        stringBuilder.append(param1Boolean);
        d0.a("callscreen", stringBuilder.toString());
      } 
    }
  }
  
  class n implements com.allinone.callerid.d.e.g.a {
    n(CallScreenPdtActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("设置联系人铃声:");
        stringBuilder.append(param1Boolean);
        d0.a("callscreen", stringBuilder.toString());
      } 
    }
  }
  
  class o implements com.allinone.callerid.i.a.d.b {
    o(CallScreenPdtActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        CallScreenPdtActivity.h0(this.a, true);
        com.allinone.callerid.util.gg.e.d().e(false);
      } 
    }
  }
  
  class p implements com.allinone.callerid.d.e.a.b {
    p(CallScreenPdtActivity this$0) {}
    
    public void a() {
      b.p.a.a.b((Context)EZCallApplication.c()).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
    }
  }
  
  class q implements com.allinone.callerid.d.e.a.b {
    q(CallScreenPdtActivity this$0) {}
    
    public void a() {}
  }
  
  class r implements com.allinone.callerid.d.e.a.b {
    r(CallScreenPdtActivity this$0) {}
    
    public void a() {
      b.p.a.a.b((Context)EZCallApplication.c()).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
    }
  }
  
  class s implements com.allinone.callerid.d.e.a.b {
    s(CallScreenPdtActivity this$0) {}
    
    public void a() {}
  }
  
  class t implements com.allinone.callerid.d.e.a.b {
    t(CallScreenPdtActivity this$0) {}
    
    public void a() {
      b.p.a.a.b((Context)EZCallApplication.c()).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
    }
  }
  
  class u implements CompoundButton.OnCheckedChangeListener {
    u(CallScreenPdtActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        CallScreenPdtActivity.i0(this.a, true);
        CallScreenPdtActivity.j0(this.a).setChecked(false);
      } else {
        CallScreenPdtActivity.i0(this.a, false);
      } 
    }
  }
  
  class v implements CompoundButton.OnCheckedChangeListener {
    v(CallScreenPdtActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        CallScreenPdtActivity.k0(this.a).setChecked(false);
        Intent intent = new Intent((Context)this.a, CallScreenSelectActivity.class);
        this.a.startActivityForResult(intent, 8989);
        this.a.overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  private class w extends BroadcastReceiver {
    private w(CallScreenPdtActivity this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if ("android.net.conn.CONNECTIVITY_CHANGE".equals(param1Intent.getAction()) && com.allinone.callerid.util.e.b(this.a.getApplicationContext()))
        CallScreenPdtActivity.g0(this.a); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/CallScreenPdtActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */