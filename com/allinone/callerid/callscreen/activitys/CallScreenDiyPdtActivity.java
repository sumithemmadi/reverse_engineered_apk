package com.allinone.callerid.callscreen.activitys;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
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
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;
import cn.jzvd.t;
import com.allinone.callerid.callscreen.CustomMedia.JZMediaExo;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.callscreen.view.MyJzvdStd;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.u;
import java.io.File;
import java.util.ArrayList;

public class CallScreenDiyPdtActivity extends BaseActivity implements View.OnClickListener {
  private HomeInfo A;
  
  private boolean B;
  
  private RelativeLayout C;
  
  private boolean D;
  
  private RadioButton E;
  
  private RadioButton F;
  
  private RadioButton G;
  
  private RadioButton H;
  
  private Dialog I;
  
  private LinearLayout J;
  
  private boolean K = true;
  
  private boolean L = true;
  
  private androidx.appcompat.app.a M;
  
  ArrayList<PersonaliseContact> N = new ArrayList<PersonaliseContact>();
  
  private ConstraintLayout O;
  
  private FrameLayout P;
  
  private LinearLayout Q;
  
  private boolean R;
  
  private FrameLayout S;
  
  private FrameLayout T;
  
  private boolean U;
  
  private boolean V;
  
  private FrameLayout W;
  
  private com.google.android.gms.ads.formats.g X;
  
  private com.google.android.gms.ads.d Y;
  
  private ImageView Z;
  
  private boolean a0;
  
  private final String s = "CallScreenDiyPdtActivity";
  
  private Typeface t;
  
  private Typeface u;
  
  private Boolean v;
  
  private MyJzvdStd w;
  
  private ImageView x;
  
  private ImageView y;
  
  private FrameLayout z;
  
  private void e0() {
    try {
      if (this.v.booleanValue())
        this.x.setImageResource(2131231059); 
      HomeInfo homeInfo = (HomeInfo)getIntent().getSerializableExtra("homeinfo");
      this.A = homeInfo;
      if (homeInfo != null) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("homeInfo:");
          stringBuilder.append(this.A.toString());
          d0.a("callscreen", stringBuilder.toString());
        } 
        if (this.A.getPath() != null && !"".equals(this.A.getPath())) {
          File file = new File();
          this(this.A.getPath());
          if (file.exists()) {
            this.U = true;
          } else {
            this.U = false;
          } 
        } 
        if (this.A.isDownloaded() && this.U && com.allinone.callerid.util.k1.a.e(getApplicationContext()))
          i0(this.A); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void f0() {
    this.w = (MyJzvdStd)findViewById(2131297097);
    this.x = (ImageView)findViewById(2131296949);
    if (i1.f0(getApplicationContext()).booleanValue())
      this.x.setImageResource(2131231059); 
    this.y = (ImageView)findViewById(2131297053);
    this.Z = (ImageView)findViewById(2131297026);
    this.z = (FrameLayout)findViewById(2131296785);
    TextView textView1 = (TextView)findViewById(2131298114);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296786);
    TextView textView2 = (TextView)findViewById(2131298115);
    RelativeLayout relativeLayout1 = (RelativeLayout)findViewById(2131297503);
    this.C = relativeLayout1;
    if (this.D) {
      relativeLayout1.setVisibility(0);
      com.allinone.callerid.d.f.f.w(false);
    } 
    this.O = (ConstraintLayout)findViewById(2131297163);
    this.P = (FrameLayout)findViewById(2131296787);
    TextView textView3 = (TextView)findViewById(2131298116);
    this.Q = (LinearLayout)findViewById(2131297194);
    TextView textView4 = (TextView)findViewById(2131298023);
    if ("1".equals(p.d(getApplicationContext()).getCountry_code()))
      textView4.setText("Emily"); 
    TextView textView5 = (TextView)findViewById(2131298022);
    RelativeLayout relativeLayout2 = (RelativeLayout)findViewById(2131297472);
    this.S = (FrameLayout)findViewById(2131296794);
    this.T = (FrameLayout)findViewById(2131296793);
    this.x.setOnClickListener(this);
    this.y.setOnClickListener(this);
    this.Z.setOnClickListener(this);
    this.z.setOnClickListener(this);
    frameLayout.setOnClickListener(this);
    this.P.setOnClickListener(this);
    relativeLayout2.setOnClickListener(this);
    textView5.setTypeface(this.u);
    textView4.setTypeface(this.u);
    textView1.setTypeface(this.u);
    textView3.setTypeface(this.u);
    textView2.setTypeface(this.u);
    textView2.setTypeface(this.t);
  }
  
  private void g0() {
    try {
      i i = new i();
      this(this);
      com.allinone.callerid.i.a.d.a.a(i);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void h0(Activity paramActivity) {
    int i = Build.VERSION.SDK_INT;
    if (i < 19)
      return; 
    Window window = paramActivity.getWindow();
    if (i >= 21) {
      window.clearFlags(67108864);
      window.addFlags(-2147483648);
      i = window.getDecorView().getSystemUiVisibility();
      window.getDecorView().setSystemUiVisibility(i | 0x100 | 0x400);
      window.setStatusBarColor(0);
    } else {
      window.addFlags(67108864);
    } 
  }
  
  private void i0(HomeInfo paramHomeInfo) {
    try {
      com.bumptech.glide.c.v((FragmentActivity)this).r(paramHomeInfo.getPath()).C0(((JzvdStd)this.w).h0);
      Jzvd.D();
      t t = new t();
      this(Uri.parse(paramHomeInfo.getPath()));
      t.e = true;
      this.w.setUp(t, 1, JZMediaExo.class);
      this.w.L();
      this.V = true;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void j0() {
    Dialog dialog = this.I;
    if (dialog != null)
      dialog.dismiss(); 
    if (this.A != null) {
      g0();
      q.b().c("callscreen_diy_set");
      this.A.setIsdiy(true);
      if (this.K && this.A.isIsdiy())
        this.A.setUseVideoAudioRing(true); 
      if (this.L) {
        com.allinone.callerid.d.e.e.d.a(this.A, new j(this));
      } else {
        com.allinone.callerid.d.e.e.a.b(this.A, this.N, new k(this));
      } 
    } 
  }
  
  private void k0() {
    HomeInfo homeInfo = this.A;
    if (homeInfo != null && !homeInfo.isIsdiy())
      if (this.L) {
        (j0.a()).b.execute(new a(this));
      } else {
        (j0.a()).b.execute(new b(this));
      }  
  }
  
  private void l0(boolean paramBoolean) {
    try {
      Dialog dialog = new Dialog();
      this((Context)this, 2131820777);
      this.I = dialog;
      View view = LayoutInflater.from((Context)this).inflate(2131493019, null);
      ImageView imageView = (ImageView)view.findViewById(2131297122);
      this.E = (RadioButton)view.findViewById(2131297401);
      this.F = (RadioButton)view.findViewById(2131297400);
      this.G = (RadioButton)view.findViewById(2131297403);
      this.H = (RadioButton)view.findViewById(2131297402);
      FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296784);
      this.J = (LinearLayout)view.findViewById(2131297178);
      TextView textView = (TextView)view.findViewById(2131297875);
      if (!this.A.isIsdefault() && this.A.getContacts_diy_counts() != 0) {
        textView.setText(String.valueOf(this.A.getContacts_diy_counts()));
        textView.setVisibility(0);
      } 
      RadioButton radioButton2 = this.E;
      d d1 = new d();
      this(this);
      radioButton2.setOnCheckedChangeListener(d1);
      RadioButton radioButton3 = this.F;
      e e = new e();
      this(this);
      radioButton3.setOnCheckedChangeListener(e);
      radioButton3 = this.G;
      f f = new f();
      this(this);
      radioButton3.setOnCheckedChangeListener(f);
      RadioButton radioButton1 = this.H;
      g g1 = new g();
      this(this);
      radioButton1.setOnCheckedChangeListener(g1);
      this.J.setOnClickListener(this);
      imageView.setOnClickListener(this);
      frameLayout.setOnClickListener(this);
      this.E.setTypeface(this.t);
      this.F.setTypeface(this.t);
      this.G.setTypeface(this.t);
      this.H.setTypeface(this.t);
      this.E.setTypeface(this.t);
      ((TextView)view.findViewById(2131297842)).setTypeface(this.t);
      ((TextView)view.findViewById(2131298097)).setTypeface(this.t);
      ((TextView)view.findViewById(2131298114)).setTypeface(this.t);
      ((TextView)view.findViewById(2131298117)).setTypeface(this.t);
      this.I.setContentView(view);
      ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
      layoutParams.width = (getResources().getDisplayMetrics()).widthPixels;
      view.setLayoutParams(layoutParams);
      if (this.I.getWindow() != null) {
        this.I.getWindow().setGravity(80);
        this.I.getWindow().setWindowAnimations(2131820778);
      } 
      this.I.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void m0(Context paramContext) {
    try {
      View view = LayoutInflater.from(paramContext).inflate(2131493020, null);
      TextView textView1 = (TextView)view.findViewById(2131298187);
      TextView textView2 = (TextView)view.findViewById(2131297866);
      ImageView imageView = (ImageView)view.findViewById(2131297122);
      this.W = (FrameLayout)view.findViewById(2131296753);
      textView1.setTypeface(this.t);
      textView2.setTypeface(this.t);
      h h = new h();
      this(this);
      imageView.setOnClickListener(h);
      androidx.appcompat.app.a.a a1 = new androidx.appcompat.app.a.a();
      this(paramContext);
      this.M = a1.r(view).d(true).s();
      if (this.X != null) {
        UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)getLayoutInflater().inflate(2131492867, null);
        com.allinone.callerid.util.gg.d.a(this.X, unifiedNativeAdView);
        if (this.W != null) {
          if (d0.a)
            d0.a("tony", "ad has,show ad"); 
          this.W.removeAllViews();
          this.W.addView((View)unifiedNativeAdView);
          this.W.setVisibility(0);
          this.W = null;
        } 
        this.X = null;
      } else {
        com.google.android.gms.ads.d d1 = this.Y;
        if (d1 != null && !d1.a())
          g0(); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 8989 && paramInt2 == 9898) {
      if (paramIntent != null) {
        Bundle bundle = paramIntent.getExtras();
        if (bundle != null)
          this.N = bundle.getParcelableArrayList("selected_contacts"); 
      } 
      ArrayList<PersonaliseContact> arrayList = this.N;
      if (arrayList == null || arrayList.size() <= 0) {
        RadioButton radioButton = this.E;
        if (radioButton != null)
          radioButton.setChecked(true); 
      } 
    } else if (paramInt1 == 970 && paramInt2 == 980) {
      HomeInfo homeInfo = this.A;
      if (homeInfo != null && homeInfo.isDownloaded()) {
        j0();
        if (this.K)
          k0(); 
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
    switch (paramView.getId()) {
      default:
        return;
      case 2131297472:
        if (!this.D)
          if (!this.R) {
            this.R = true;
            this.O.setVisibility(0);
            this.P.setVisibility(0);
            this.Q.setVisibility(0);
            this.z.setVisibility(8);
            this.S.setVisibility(8);
            this.T.setVisibility(8);
            this.Z.setImageResource(2131230818);
          } else {
            this.R = false;
            this.O.setVisibility(8);
            this.P.setVisibility(8);
            this.Q.setVisibility(8);
            this.z.setVisibility(0);
            this.S.setVisibility(0);
            this.T.setVisibility(0);
            this.Z.setImageResource(2131231375);
          }  
      case 2131297122:
        dialog = this.I;
        if (dialog != null)
          dialog.dismiss(); 
      case 2131297053:
        if (this.V)
          if (this.B) {
            this.w.d();
            this.B = false;
            this.y.setImageResource(2131231377);
          } else {
            this.w.k();
            this.B = true;
            this.y.setImageResource(2131231374);
          }  
      case 2131297026:
        if (!this.R) {
          this.R = true;
          this.O.setVisibility(0);
          this.P.setVisibility(0);
          this.Q.setVisibility(0);
          this.z.setVisibility(8);
          this.S.setVisibility(8);
          this.T.setVisibility(8);
          this.Z.setImageResource(2131230818);
        } else {
          this.R = false;
          this.O.setVisibility(8);
          this.P.setVisibility(8);
          this.Q.setVisibility(8);
          this.z.setVisibility(0);
          this.S.setVisibility(0);
          this.T.setVisibility(0);
          this.Z.setImageResource(2131231375);
        } 
      case 2131296949:
        if (this.a0) {
          setResult(888);
        } else {
          setResult(777);
        } 
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296787:
        l0(com.allinone.callerid.d.f.f.k());
      case 2131296786:
        this.C.setVisibility(8);
        this.D = false;
        l0(com.allinone.callerid.d.f.f.k());
      case 2131296785:
        l0(com.allinone.callerid.d.f.f.k());
      case 2131296784:
        break;
    } 
    LinearLayout linearLayout = this.J;
    if (linearLayout != null)
      linearLayout.setVisibility(8); 
    if (com.allinone.callerid.util.k1.a.a(getApplicationContext())) {
      HomeInfo homeInfo = this.A;
      if (homeInfo != null && homeInfo.isDownloaded()) {
        j0();
        if (this.K)
          k0(); 
      } 
    } 
    Intent intent = new Intent();
    intent.setClass((Context)this, OpenPerActivity.class);
    startActivityForResult(intent, 970);
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    h0((Activity)this);
    setContentView(2131492909);
    Boolean bool = i1.f0((Context)this);
    this.v = bool;
    if (bool.booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.t = g1.b();
    this.u = g1.a();
    getWindow().getDecorView().post(new c(this));
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      Jzvd.D();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      if (this.D) {
        this.D = false;
        this.C.setVisibility(8);
      } else if (this.a0) {
        setResult(888);
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } else {
        setResult(777);
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
  
  class a implements Runnable {
    a(CallScreenDiyPdtActivity this$0) {}
    
    public void run() {
      com.allinone.callerid.d.f.c.b(CallScreenDiyPdtActivity.Z(this.b).getPath(), com.allinone.callerid.d.f.a.c);
      this.b.runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(CallScreenDiyPdtActivity.a this$0) {}
      
      public void run() {
        if (com.allinone.callerid.util.k1.a.i((Context)EZCallApplication.c()))
          com.allinone.callerid.d.e.g.b.b(com.allinone.callerid.d.f.a.c, CallScreenDiyPdtActivity.Z(this.b.b).getName(), new a(this)); 
      }
      
      class a implements com.allinone.callerid.d.e.g.a {
        a(CallScreenDiyPdtActivity.a.a this$0) {}
        
        public void a(boolean param3Boolean) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("设置默认铃声:");
            stringBuilder.append(param3Boolean);
            d0.a("callscreen", stringBuilder.toString());
          } 
        }
      }
    }
    
    class a implements com.allinone.callerid.d.e.g.a {
      a(CallScreenDiyPdtActivity.a this$0) {}
      
      public void a(boolean param2Boolean) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("设置默认铃声:");
          stringBuilder.append(param2Boolean);
          d0.a("callscreen", stringBuilder.toString());
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(CallScreenDiyPdtActivity this$0) {}
    
    public void run() {
      if (com.allinone.callerid.util.k1.a.i((Context)EZCallApplication.c()))
        com.allinone.callerid.d.e.g.b.b(com.allinone.callerid.d.f.a.c, CallScreenDiyPdtActivity.Z(this.b.b).getName(), new a(this)); 
    }
    
    class a implements com.allinone.callerid.d.e.g.a {
      a(CallScreenDiyPdtActivity.a.a this$0) {}
      
      public void a(boolean param3Boolean) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("设置默认铃声:");
          stringBuilder.append(param3Boolean);
          d0.a("callscreen", stringBuilder.toString());
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.g.a {
    a(CallScreenDiyPdtActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("设置默认铃声:");
        stringBuilder.append(param1Boolean);
        d0.a("callscreen", stringBuilder.toString());
      } 
    }
  }
  
  class b implements Runnable {
    b(CallScreenDiyPdtActivity this$0) {}
    
    public void run() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(com.allinone.callerid.d.f.a.b);
      stringBuilder.append(CallScreenDiyPdtActivity.Z(this.b).getName());
      stringBuilder.append(".aac");
      String str = stringBuilder.toString();
      com.allinone.callerid.d.f.c.b(CallScreenDiyPdtActivity.Z(this.b).getPath(), str);
      this.b.runOnUiThread(new a(this, str));
    }
    
    class a implements Runnable {
      a(CallScreenDiyPdtActivity.b this$0, String param2String) {}
      
      public void run() {
        if (com.allinone.callerid.util.k1.a.i((Context)EZCallApplication.c()))
          com.allinone.callerid.d.e.g.b.a(this.b, CallScreenDiyPdtActivity.Z(this.c.b).getName(), this.c.b.N, new a(this)); 
      }
      
      class a implements com.allinone.callerid.d.e.g.a {
        a(CallScreenDiyPdtActivity.b.a this$0) {}
        
        public void a(boolean param3Boolean) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("设置联系人铃声:");
            stringBuilder.append(param3Boolean);
            d0.a("callscreen", stringBuilder.toString());
          } 
        }
      }
    }
    
    class a implements com.allinone.callerid.d.e.g.a {
      a(CallScreenDiyPdtActivity.b this$0) {}
      
      public void a(boolean param2Boolean) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("设置联系人铃声:");
          stringBuilder.append(param2Boolean);
          d0.a("callscreen", stringBuilder.toString());
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(CallScreenDiyPdtActivity this$0, String param1String) {}
    
    public void run() {
      if (com.allinone.callerid.util.k1.a.i((Context)EZCallApplication.c()))
        com.allinone.callerid.d.e.g.b.a(this.b, CallScreenDiyPdtActivity.Z(this.c.b).getName(), this.c.b.N, new a(this)); 
    }
    
    class a implements com.allinone.callerid.d.e.g.a {
      a(CallScreenDiyPdtActivity.b.a this$0) {}
      
      public void a(boolean param3Boolean) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("设置联系人铃声:");
          stringBuilder.append(param3Boolean);
          d0.a("callscreen", stringBuilder.toString());
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.g.a {
    a(CallScreenDiyPdtActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("设置联系人铃声:");
        stringBuilder.append(param1Boolean);
        d0.a("callscreen", stringBuilder.toString());
      } 
    }
  }
  
  class c implements Runnable {
    c(CallScreenDiyPdtActivity this$0) {}
    
    public void run() {
      CallScreenDiyPdtActivity.O(this.b);
      CallScreenDiyPdtActivity.P(this.b);
      q.b().c("callscreen_diy_pdt_show");
    }
  }
  
  class d implements CompoundButton.OnCheckedChangeListener {
    d(CallScreenDiyPdtActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        CallScreenDiyPdtActivity.W(this.a, true);
        CallScreenDiyPdtActivity.X(this.a).setChecked(false);
      } else {
        CallScreenDiyPdtActivity.W(this.a, false);
      } 
    }
  }
  
  class e implements CompoundButton.OnCheckedChangeListener {
    e(CallScreenDiyPdtActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        CallScreenDiyPdtActivity.Y(this.a).setChecked(false);
        Intent intent = new Intent((Context)this.a, CallScreenSelectActivity.class);
        intent.putExtra("theme_name", CallScreenDiyPdtActivity.Z(this.a).getName());
        intent.putExtra("is_default", CallScreenDiyPdtActivity.Z(this.a).isIsdefault());
        this.a.startActivityForResult(intent, 8989);
        this.a.overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  class f implements CompoundButton.OnCheckedChangeListener {
    f(CallScreenDiyPdtActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        CallScreenDiyPdtActivity.a0(this.a, true);
        CallScreenDiyPdtActivity.b0(this.a).setChecked(false);
      } else {
        CallScreenDiyPdtActivity.a0(this.a, false);
      } 
    }
  }
  
  class g implements CompoundButton.OnCheckedChangeListener {
    g(CallScreenDiyPdtActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean)
        CallScreenDiyPdtActivity.c0(this.a).setChecked(false); 
    }
  }
  
  class h implements View.OnClickListener {
    h(CallScreenDiyPdtActivity this$0) {}
    
    public void onClick(View param1View) {
      if (CallScreenDiyPdtActivity.d0(this.b) != null)
        CallScreenDiyPdtActivity.d0(this.b).dismiss(); 
    }
  }
  
  class i implements com.allinone.callerid.i.a.d.b {
    i(CallScreenDiyPdtActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        com.google.android.gms.ads.d.a a = new com.google.android.gms.ads.d.a(this.a.getApplicationContext(), "ca-app-pub-5825926894918682/1530656055");
        a.e(new a(this));
        u u = (new u.a()).b(true).a();
        a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
        CallScreenDiyPdtActivity.T(this.a, a.f(new b(this)).a());
        CallScreenDiyPdtActivity.S(this.a).b((new com.google.android.gms.ads.e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
      } 
    }
    
    class a implements com.google.android.gms.ads.formats.g.a {
      a(CallScreenDiyPdtActivity.i this$0) {}
      
      public void r(com.google.android.gms.ads.formats.g param2g) {
        if (d0.a)
          d0.a("tony", "onUnifiedNativeAdLoaded"); 
        try {
          CallScreenDiyPdtActivity.Q(this.b.a, param2g);
          UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)this.b.a.getLayoutInflater().inflate(2131492867, null);
          com.allinone.callerid.util.gg.d.a(param2g, unifiedNativeAdView);
          if (CallScreenDiyPdtActivity.R(this.b.a) != null) {
            if (d0.a)
              d0.a("tony", "fl_junk"); 
            CallScreenDiyPdtActivity.R(this.b.a).removeAllViews();
            CallScreenDiyPdtActivity.R(this.b.a).addView((View)unifiedNativeAdView);
            CallScreenDiyPdtActivity.R(this.b.a).setVisibility(0);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
    
    class b extends com.google.android.gms.ads.b {
      b(CallScreenDiyPdtActivity.i this$0) {}
      
      public void D(int param2Int) {
        super.D(param2Int);
      }
      
      public void K() {
        super.K();
        if (CallScreenDiyPdtActivity.d0(this.a.a) != null)
          CallScreenDiyPdtActivity.d0(this.a.a).dismiss(); 
      }
    }
  }
  
  class a implements com.google.android.gms.ads.formats.g.a {
    a(CallScreenDiyPdtActivity this$0) {}
    
    public void r(com.google.android.gms.ads.formats.g param1g) {
      if (d0.a)
        d0.a("tony", "onUnifiedNativeAdLoaded"); 
      try {
        CallScreenDiyPdtActivity.Q(this.b.a, param1g);
        UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)this.b.a.getLayoutInflater().inflate(2131492867, null);
        com.allinone.callerid.util.gg.d.a(param1g, unifiedNativeAdView);
        if (CallScreenDiyPdtActivity.R(this.b.a) != null) {
          if (d0.a)
            d0.a("tony", "fl_junk"); 
          CallScreenDiyPdtActivity.R(this.b.a).removeAllViews();
          CallScreenDiyPdtActivity.R(this.b.a).addView((View)unifiedNativeAdView);
          CallScreenDiyPdtActivity.R(this.b.a).setVisibility(0);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b extends com.google.android.gms.ads.b {
    b(CallScreenDiyPdtActivity this$0) {}
    
    public void D(int param1Int) {
      super.D(param1Int);
    }
    
    public void K() {
      super.K();
      if (CallScreenDiyPdtActivity.d0(this.a.a) != null)
        CallScreenDiyPdtActivity.d0(this.a.a).dismiss(); 
    }
  }
  
  class j implements com.allinone.callerid.d.e.e.c {
    j(CallScreenDiyPdtActivity this$0) {}
    
    public void a(boolean param1Boolean, HomeInfo param1HomeInfo) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("设置默认来电秀");
        stringBuilder.append(param1Boolean);
        d0.a("callscreen", stringBuilder.toString());
      } 
      b.p.a.a.b((Context)this.a).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
      CallScreenDiyPdtActivity.U(this.a, true);
      CallScreenDiyPdtActivity callScreenDiyPdtActivity = this.a;
      CallScreenDiyPdtActivity.V(callScreenDiyPdtActivity, (Context)callScreenDiyPdtActivity);
    }
  }
  
  class k implements com.allinone.callerid.d.e.e.a.a {
    k(CallScreenDiyPdtActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("单独设置联系人来电秀");
        stringBuilder.append(param1Boolean);
        d0.a("callscreen", stringBuilder.toString());
      } 
      b.p.a.a.b((Context)this.a).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
      CallScreenDiyPdtActivity.U(this.a, true);
      CallScreenDiyPdtActivity callScreenDiyPdtActivity = this.a;
      CallScreenDiyPdtActivity.V(callScreenDiyPdtActivity, (Context)callScreenDiyPdtActivity);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/CallScreenDiyPdtActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */