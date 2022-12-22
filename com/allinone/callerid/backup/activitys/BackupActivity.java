package com.allinone.callerid.backup.activitys;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;
import com.google.api.client.http.s;
import com.google.api.services.drive.Drive;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

public class BackupActivity extends BaseActivity implements View.OnClickListener {
  private FrameLayout A;
  
  private TextView B;
  
  private LinearLayout C;
  
  private TextView D;
  
  private TextView E;
  
  private FrameLayout F;
  
  private TextView G;
  
  private TextView H;
  
  private FrameLayout I;
  
  private TextView J;
  
  private TextView K;
  
  private FrameLayout L;
  
  private TextView M;
  
  private TextView N;
  
  private Typeface O;
  
  private Typeface P;
  
  private AlertDialog Q;
  
  private AlertDialog R;
  
  private AlertDialog S;
  
  private PopupWindow T;
  
  private AlertDialog U;
  
  private Drive V;
  
  private GoogleSignInAccount W;
  
  private boolean X;
  
  private boolean Y;
  
  private SimpleDateFormat Z;
  
  private AlertDialog a0;
  
  private final String s = "BackupActivity";
  
  private TextView t;
  
  private ImageView u;
  
  private ImageView v;
  
  private TextView w;
  
  private Switch x;
  
  private TextView y;
  
  private TextView z;
  
  private void A0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493203, null);
    TextView textView1 = (TextView)view.findViewById(2131297962);
    TextView textView2 = (TextView)view.findViewById(2131297866);
    FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296777);
    TextView textView3 = (TextView)view.findViewById(2131298071);
    FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296797);
    TextView textView4 = (TextView)view.findViewById(2131298134);
    ImageView imageView = (ImageView)view.findViewById(2131296968);
    long l = com.allinone.callerid.c.b.c.e();
    if (l != 0L) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getResources().getString(2131755430));
      stringBuilder.append(" ");
      stringBuilder.append(this.Z.format(new Date(l)));
      textView1.setText(stringBuilder.toString());
    } else {
      textView1.setVisibility(8);
      frameLayout1.setVisibility(8);
      frameLayout2.setVisibility(8);
      imageView.setVisibility(0);
      textView2.setText(getResources().getString(2131755522));
    } 
    textView1.setTypeface(this.O);
    textView2.setTypeface(this.O);
    textView3.setTypeface(this.O);
    textView4.setTypeface(this.O);
    frameLayout1.setOnClickListener(new r(this));
    frameLayout2.setOnClickListener(new a(this));
    imageView.setOnClickListener(new b(this));
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setView(view).create();
    this.U = alertDialog;
    alertDialog.show();
  }
  
  private void o0() {
    if (this.W != null) {
      Toast.makeText(getApplicationContext(), getResources().getString(2131755594), 1).show();
      com.google.api.client.googleapis.extensions.android.gms.auth.a a = com.google.api.client.googleapis.extensions.android.gms.auth.a.d((Context)this, Collections.singleton("https://www.googleapis.com/auth/drive.file"));
      a.c(this.W.U());
      this.V = (new Drive.Builder(c.c.b.a.a.a.b.a.a(), (com.google.api.client.json.c)new com.google.api.client.json.i.a(), (s)a)).setApplicationName(getResources().getString(2131755094)).build();
      (j0.a()).b.execute(new p(this));
    } 
  }
  
  private void p0(Intent paramIntent) {
    com.google.android.gms.auth.api.signin.a.d(paramIntent).e(new o(this)).c(new n(this));
  }
  
  private void q0() {
    if (com.allinone.callerid.c.b.c.a()) {
      this.x.setChecked(true);
      this.A.setClickable(true);
      this.A.setAlpha(1.0F);
      this.C.setAlpha(1.0F);
      this.F.setClickable(true);
      this.I.setClickable(true);
      this.L.setClickable(true);
    } else {
      this.x.setChecked(false);
      this.A.setClickable(false);
      this.A.setAlpha(0.3F);
      this.C.setAlpha(0.3F);
      this.F.setClickable(false);
      this.I.setClickable(false);
      this.L.setClickable(false);
    } 
    this.Z = new SimpleDateFormat("dd/MM/yy HH:mm a", i1.y());
    long l = com.allinone.callerid.c.b.c.e();
    if (l != 0L) {
      TextView textView = this.z;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getResources().getString(2131755430));
      stringBuilder.append(" ");
      stringBuilder.append(this.Z.format(new Date(l)));
      textView.setText(stringBuilder.toString());
      this.z.setVisibility(0);
    } 
    String str = com.allinone.callerid.c.b.c.b();
    if (str != null && !"".equals(str)) {
      this.H.setText(str);
    } else {
      this.H.setText(getResources().getString(2131755192));
    } 
    int i = com.allinone.callerid.c.b.c.c();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              this.K.setText(getResources().getString(2131755476)); 
          } else {
            this.K.setText(getResources().getString(2131755858));
          } 
        } else {
          this.K.setText(getResources().getString(2131755273));
        } 
      } else {
        this.K.setText(getResources().getString(2131755579));
      } 
    } else {
      this.K.setText(getResources().getString(2131755518));
    } 
    i = com.allinone.callerid.c.b.c.d();
    if (i != 0) {
      if (i == 1)
        this.M.setText(getResources().getString(2131755861)); 
    } else {
      this.M.setText(getResources().getString(2131755860));
    } 
  }
  
  private void r0() {
    try {
      View view = LayoutInflater.from((Context)this).inflate(2131493147, null);
      TextView textView = (TextView)view.findViewById(2131298113);
      textView.setText(getResources().getString(2131755108));
      FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296784);
      textView.setTypeface(this.O);
      frameLayout.setOnClickListener(this);
      PopupWindow popupWindow = new PopupWindow();
      this(view);
      this.T = popupWindow;
      int i = getWindowManager().getDefaultDisplay().getWidth();
      this.T.setWidth(i / 4);
      this.T.setHeight(-2);
      this.T.setFocusable(true);
      if (i1.f0(getApplicationContext()).booleanValue()) {
        this.T.setAnimationStyle(2131821306);
      } else {
        this.T.setAnimationStyle(2131821305);
      } 
      ColorDrawable colorDrawable = new ColorDrawable();
      this(0);
      this.T.setBackgroundDrawable((Drawable)colorDrawable);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void s0() {
    this.O = g1.b();
    this.P = g1.a();
    this.t = (TextView)findViewById(2131298189);
    this.u = (ImageView)findViewById(2131297014);
    this.v = (ImageView)findViewById(2131296950);
    this.w = (TextView)findViewById(2131297805);
    this.x = (Switch)findViewById(2131297689);
    this.y = (TextView)findViewById(2131297806);
    this.z = (TextView)findViewById(2131297962);
    this.A = (FrameLayout)findViewById(2131296713);
    this.B = (TextView)findViewById(2131297916);
    this.C = (LinearLayout)findViewById(2131297156);
    this.D = (TextView)findViewById(2131297920);
    this.E = (TextView)findViewById(2131297921);
    this.F = (FrameLayout)findViewById(2131296709);
    this.G = (TextView)findViewById(2131297779);
    this.H = (TextView)findViewById(2131297778);
    this.I = (FrameLayout)findViewById(2131296750);
    this.J = (TextView)findViewById(2131297918);
    this.K = (TextView)findViewById(2131297917);
    this.L = (FrameLayout)findViewById(2131296714);
    this.N = (TextView)findViewById(2131297991);
    this.M = (TextView)findViewById(2131297990);
    this.t.setTypeface(this.O);
    this.w.setTypeface(this.O);
    this.y.setTypeface(this.O);
    this.z.setTypeface(this.O);
    this.B.setTypeface(this.O);
    this.D.setTypeface(this.O);
    this.E.setTypeface(this.O);
    this.G.setTypeface(this.O);
    this.H.setTypeface(this.O);
    this.J.setTypeface(this.O);
    this.K.setTypeface(this.O);
    this.N.setTypeface(this.O);
    this.M.setTypeface(this.O);
    this.A.setOnClickListener(this);
    this.F.setOnClickListener(this);
    this.I.setOnClickListener(this);
    this.L.setOnClickListener(this);
    this.u.setOnClickListener(this);
    this.x.setOnCheckedChangeListener(new j(this));
  }
  
  private void t0() {
    if (com.google.android.gms.auth.api.signin.a.c(getApplicationContext()) != null) {
      this.W = com.google.android.gms.auth.api.signin.a.c(getApplicationContext());
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mGoogleAccount:");
        stringBuilder.append(this.W.p0());
        d0.a("backup", stringBuilder.toString());
      } 
      o0();
    } else {
      this.X = true;
      u0();
    } 
  }
  
  private void u0() {
    if (d0.a)
      d0.a("backup", "Requesting sign-in"); 
    com.google.android.gms.auth.api.signin.c c = com.google.android.gms.auth.api.signin.a.a((Activity)this, (new GoogleSignInOptions.a(GoogleSignInOptions.g)).b().e(new Scope("https://www.googleapis.com/auth/drive.file"), new Scope[0]).a());
    c.n();
    startActivityForResult(c.l(), 1);
  }
  
  private void v0() {
    if (this.W != null) {
      Toast.makeText(getApplicationContext(), getResources().getString(2131755609), 1).show();
      com.google.api.client.googleapis.extensions.android.gms.auth.a a = com.google.api.client.googleapis.extensions.android.gms.auth.a.d((Context)this, Collections.singleton("https://www.googleapis.com/auth/drive.file"));
      a.c(this.W.U());
      this.V = (new Drive.Builder(c.c.b.a.a.a.b.a.a(), (com.google.api.client.json.c)new com.google.api.client.json.i.a(), (s)a)).setApplicationName(getResources().getString(2131755094)).build();
      (j0.a()).b.execute(new q(this));
    } 
  }
  
  private void w0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493199, null);
    TextView textView1 = (TextView)view.findViewById(2131298187);
    TextView textView2 = (TextView)view.findViewById(2131297866);
    FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296754);
    TextView textView3 = (TextView)view.findViewById(2131297938);
    FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296802);
    TextView textView4 = (TextView)view.findViewById(2131298197);
    textView1.setTypeface(this.P);
    textView2.setTypeface(this.O);
    textView3.setTypeface(this.O);
    textView4.setTypeface(this.O);
    frameLayout1.setOnClickListener(new k(this));
    frameLayout2.setOnClickListener(new l(this));
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setView(view).create();
    this.S = alertDialog;
    alertDialog.show();
  }
  
  private void x0(String paramString) {
    View view = LayoutInflater.from((Context)this).inflate(2131493200, null);
    TextView textView1 = (TextView)view.findViewById(2131298187);
    TextView textView2 = (TextView)view.findViewById(2131297877);
    FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296726);
    TextView textView3 = (TextView)view.findViewById(2131297845);
    textView2.setText(paramString);
    textView1.setTypeface(this.P);
    textView2.setTypeface(this.O);
    textView3.setTypeface(this.O);
    frameLayout.setOnClickListener(new m(this));
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setView(view).create();
    this.a0 = alertDialog;
    alertDialog.show();
  }
  
  private void y0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493201, null);
    TextView textView1 = (TextView)view.findViewById(2131298187);
    FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296760);
    TextView textView2 = (TextView)view.findViewById(2131297992);
    FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296768);
    TextView textView3 = (TextView)view.findViewById(2131298032);
    FrameLayout frameLayout3 = (FrameLayout)view.findViewById(2131296734);
    TextView textView4 = (TextView)view.findViewById(2131297879);
    FrameLayout frameLayout4 = (FrameLayout)view.findViewById(2131296808);
    TextView textView5 = (TextView)view.findViewById(2131298213);
    FrameLayout frameLayout5 = (FrameLayout)view.findViewById(2131296755);
    TextView textView6 = (TextView)view.findViewById(2131297980);
    textView1.setTypeface(this.P);
    textView2.setTypeface(this.O);
    textView3.setTypeface(this.O);
    textView4.setTypeface(this.O);
    textView5.setTypeface(this.O);
    textView6.setTypeface(this.O);
    frameLayout1.setOnClickListener(new e(this));
    frameLayout2.setOnClickListener(new f(this));
    frameLayout3.setOnClickListener(new g(this));
    frameLayout4.setOnClickListener(new h(this));
    frameLayout5.setOnClickListener(new i(this));
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setView(view).create();
    this.R = alertDialog;
    alertDialog.show();
  }
  
  private void z0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493202, null);
    TextView textView1 = (TextView)view.findViewById(2131298187);
    FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296809);
    TextView textView2 = (TextView)view.findViewById(2131298214);
    FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296810);
    TextView textView3 = (TextView)view.findViewById(2131298215);
    textView1.setTypeface(this.P);
    textView2.setTypeface(this.O);
    textView3.setTypeface(this.O);
    frameLayout1.setOnClickListener(new c(this));
    frameLayout2.setOnClickListener(new d(this));
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setView(view).create();
    this.Q = alertDialog;
    alertDialog.show();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("requestCode:");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" resultCode:");
      stringBuilder.append(paramInt2);
      d0.a("backup", stringBuilder.toString());
    } 
    if (paramInt1 != 1) {
      if (paramInt1 == 2)
        if (paramInt2 == -1) {
          o0();
        } else {
          u0();
        }  
    } else if (paramInt2 == -1 && paramIntent != null) {
      p0(paramIntent);
    } 
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onClick(View paramView) {
    PopupWindow popupWindow;
    int i;
    switch (paramView.getId()) {
      default:
        return;
      case 2131297014:
        if (this.T == null)
          r0(); 
        if (this.T != null)
          if (i1.f0(getApplicationContext()).booleanValue()) {
            this.T.showAtLocation(paramView, 51, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
          } else {
            this.T.showAtLocation(paramView, 53, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
          }  
      case 2131296949:
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296784:
        A0();
        popupWindow = this.T;
        if (popupWindow != null)
          popupWindow.dismiss(); 
      case 2131296750:
        y0();
      case 2131296714:
        z0();
      case 2131296713:
        i = com.allinone.callerid.c.b.c.d();
        if (com.allinone.callerid.util.e.b(getApplicationContext())) {
          if (com.allinone.callerid.util.e.c(getApplicationContext())) {
            if (i == 0) {
              Toast.makeText(getApplicationContext(), getResources().getString(2131755183), 0).show();
            } else {
              t0();
            } 
          } else {
            t0();
          } 
        } else if (i == 0) {
          Toast.makeText(getApplicationContext(), getResources().getString(2131755538), 0).show();
        } else {
          Toast.makeText(getApplicationContext(), getResources().getString(2131755537), 0).show();
        } 
        com.allinone.callerid.util.q.b().c("backup_click");
      case 2131296709:
        break;
    } 
    String str = com.allinone.callerid.c.b.c.b();
    if (str != null && !"".equals(str))
      x0(str); 
    this.X = true;
    u0();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492902);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    ImageView imageView = (ImageView)findViewById(2131296949);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(this);
    s0();
    q0();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
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
  
  class a implements View.OnClickListener {
    a(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      if (BackupActivity.a0(this.b) != null)
        BackupActivity.a0(this.b).cancel(); 
    }
  }
  
  class b implements View.OnClickListener {
    b(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      if (BackupActivity.a0(this.b) != null)
        BackupActivity.a0(this.b).cancel(); 
    }
  }
  
  class c implements View.OnClickListener {
    c(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      BackupActivity.c0(this.b).setText(this.b.getResources().getString(2131755860));
      if (BackupActivity.d0(this.b) != null)
        BackupActivity.d0(this.b).cancel(); 
      com.allinone.callerid.c.b.c.i(0);
    }
  }
  
  class d implements View.OnClickListener {
    d(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      BackupActivity.c0(this.b).setText(this.b.getResources().getString(2131755861));
      if (BackupActivity.d0(this.b) != null)
        BackupActivity.d0(this.b).cancel(); 
      com.allinone.callerid.c.b.c.i(1);
    }
  }
  
  class e implements View.OnClickListener {
    e(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      BackupActivity.e0(this.b).setText(this.b.getResources().getString(2131755518));
      if (BackupActivity.f0(this.b) != null)
        BackupActivity.f0(this.b).cancel(); 
      com.allinone.callerid.c.b.c.h(0);
    }
  }
  
  class f implements View.OnClickListener {
    f(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      BackupActivity.e0(this.b).setText(this.b.getResources().getString(2131755579));
      if (BackupActivity.f0(this.b) != null)
        BackupActivity.f0(this.b).cancel(); 
      com.allinone.callerid.c.b.c.h(1);
    }
  }
  
  class g implements View.OnClickListener {
    g(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      BackupActivity.e0(this.b).setText(this.b.getResources().getString(2131755273));
      if (BackupActivity.f0(this.b) != null)
        BackupActivity.f0(this.b).cancel(); 
      com.allinone.callerid.c.b.c.h(2);
    }
  }
  
  class h implements View.OnClickListener {
    h(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      BackupActivity.e0(this.b).setText(this.b.getResources().getString(2131755858));
      if (BackupActivity.f0(this.b) != null)
        BackupActivity.f0(this.b).cancel(); 
      com.allinone.callerid.c.b.c.h(3);
    }
  }
  
  class i implements View.OnClickListener {
    i(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      BackupActivity.e0(this.b).setText(this.b.getResources().getString(2131755476));
      if (BackupActivity.f0(this.b) != null)
        BackupActivity.f0(this.b).cancel(); 
      com.allinone.callerid.c.b.c.h(4);
    }
  }
  
  class j implements CompoundButton.OnCheckedChangeListener {
    j(BackupActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.c.b.c.f(true);
        BackupActivity.O(this.a).setClickable(true);
        BackupActivity.O(this.a).setAlpha(1.0F);
        BackupActivity.P(this.a).setAlpha(1.0F);
        BackupActivity.b0(this.a).setClickable(true);
        BackupActivity.g0(this.a).setClickable(true);
        BackupActivity.h0(this.a).setClickable(true);
        String str = com.allinone.callerid.c.b.c.b();
        if (str == null || "".equals(str)) {
          BackupActivity.j0(this.a, true);
          BackupActivity.k0(this.a);
        } 
        com.allinone.callerid.util.q.b().c("backup_enable");
      } else {
        com.allinone.callerid.c.b.c.f(false);
        BackupActivity.O(this.a).setClickable(false);
        BackupActivity.O(this.a).setAlpha(0.3F);
        BackupActivity.P(this.a).setAlpha(0.3F);
        BackupActivity.b0(this.a).setClickable(false);
        BackupActivity.g0(this.a).setClickable(false);
        BackupActivity.h0(this.a).setClickable(false);
        BackupActivity.l0(this.a);
      } 
    }
  }
  
  class k implements View.OnClickListener {
    k(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      if (BackupActivity.m0(this.b) != null)
        BackupActivity.m0(this.b).cancel(); 
    }
  }
  
  class l implements View.OnClickListener {
    l(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      if (BackupActivity.m0(this.b) != null)
        BackupActivity.m0(this.b).cancel(); 
      BackupActivity.n0(this.b).setChecked(true);
      BackupActivity.O(this.b).setClickable(true);
      BackupActivity.O(this.b).setAlpha(1.0F);
      BackupActivity.P(this.b).setAlpha(1.0F);
      BackupActivity.b0(this.b).setClickable(true);
      BackupActivity.g0(this.b).setClickable(true);
      BackupActivity.h0(this.b).setClickable(true);
    }
  }
  
  class m implements View.OnClickListener {
    m(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      BackupActivity.Q(this.b).setText(this.b.getResources().getString(2131755192));
      com.allinone.callerid.c.b.c.g("");
      if (BackupActivity.R(this.b) != null)
        BackupActivity.R(this.b).cancel(); 
      BackupActivity.k0(this.b);
    }
  }
  
  class n implements com.google.android.gms.tasks.d {
    n(BackupActivity this$0) {}
    
    public void a(Exception param1Exception) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to sign in.");
        stringBuilder.append(param1Exception.getMessage());
        d0.a("backup", stringBuilder.toString());
      } 
    }
  }
  
  class o implements com.google.android.gms.tasks.e<GoogleSignInAccount> {
    o(BackupActivity this$0) {}
    
    public void a(GoogleSignInAccount param1GoogleSignInAccount) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Signed in as ");
        stringBuilder.append(param1GoogleSignInAccount.p0());
        d0.a("backup", stringBuilder.toString());
      } 
      BackupActivity.S(this.a, param1GoogleSignInAccount);
      BackupActivity.Q(this.a).setText(param1GoogleSignInAccount.p0());
      com.allinone.callerid.c.b.c.g(param1GoogleSignInAccount.p0());
      if (BackupActivity.i0(this.a)) {
        BackupActivity.T(this.a);
        BackupActivity.j0(this.a, false);
      } 
      if (BackupActivity.U(this.a)) {
        BackupActivity.W(this.a);
        BackupActivity.V(this.a, false);
      } 
    }
  }
  
  class p implements Runnable {
    p(BackupActivity this$0) {}
    
    public void run() {
      try {
        Context context = this.b.getApplicationContext();
        Drive drive = BackupActivity.X(this.b);
        a a = new a();
        this(this);
        com.allinone.callerid.c.a.a.b(context, drive, a);
      } catch (Exception exception) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Exception:");
          stringBuilder.append(exception.getMessage());
          d0.a("backup", stringBuilder.toString());
        } 
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.c.a.b {
      a(BackupActivity.p this$0) {}
      
      public void b() {
        if (d0.a)
          d0.a("backup", "onError"); 
        this.a.b.runOnUiThread(new a(this));
      }
      
      public void c() {
        if (d0.a)
          d0.a("backup", "Ok"); 
        this.a.b.runOnUiThread(new b(this));
      }
      
      public void d(UserRecoverableAuthIOException param2UserRecoverableAuthIOException) {
        if (param2UserRecoverableAuthIOException != null)
          this.a.b.startActivityForResult(param2UserRecoverableAuthIOException.getIntent(), 2); 
      }
      
      class a implements Runnable {
        a(BackupActivity.p.a this$0) {}
        
        public void run() {
          Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755106), 0).show();
        }
      }
      
      class b implements Runnable {
        b(BackupActivity.p.a this$0) {}
        
        public void run() {
          com.allinone.callerid.c.b.c.j(System.currentTimeMillis());
          TextView textView = BackupActivity.Z(this.b.a.b);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.b.a.b.getResources().getString(2131755430));
          stringBuilder.append(" ");
          stringBuilder.append(BackupActivity.Y(this.b.a.b).format(new Date(System.currentTimeMillis())));
          textView.setText(stringBuilder.toString());
          BackupActivity.Z(this.b.a.b).setVisibility(0);
          Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755104), 1).show();
          com.allinone.callerid.util.q.b().c("backup_successful");
        }
      }
    }
    
    class a implements Runnable {
      a(BackupActivity.p this$0) {}
      
      public void run() {
        Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755106), 0).show();
      }
    }
    
    class b implements Runnable {
      b(BackupActivity.p this$0) {}
      
      public void run() {
        com.allinone.callerid.c.b.c.j(System.currentTimeMillis());
        TextView textView = BackupActivity.Z(this.b.a.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.a.b.getResources().getString(2131755430));
        stringBuilder.append(" ");
        stringBuilder.append(BackupActivity.Y(this.b.a.b).format(new Date(System.currentTimeMillis())));
        textView.setText(stringBuilder.toString());
        BackupActivity.Z(this.b.a.b).setVisibility(0);
        Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755104), 1).show();
        com.allinone.callerid.util.q.b().c("backup_successful");
      }
    }
  }
  
  class a implements com.allinone.callerid.c.a.b {
    a(BackupActivity this$0) {}
    
    public void b() {
      if (d0.a)
        d0.a("backup", "onError"); 
      this.a.b.runOnUiThread(new a(this));
    }
    
    public void c() {
      if (d0.a)
        d0.a("backup", "Ok"); 
      this.a.b.runOnUiThread(new b(this));
    }
    
    public void d(UserRecoverableAuthIOException param1UserRecoverableAuthIOException) {
      if (param1UserRecoverableAuthIOException != null)
        this.a.b.startActivityForResult(param1UserRecoverableAuthIOException.getIntent(), 2); 
    }
    
    class a implements Runnable {
      a(BackupActivity.p.a this$0) {}
      
      public void run() {
        Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755106), 0).show();
      }
    }
    
    class b implements Runnable {
      b(BackupActivity.p.a this$0) {}
      
      public void run() {
        com.allinone.callerid.c.b.c.j(System.currentTimeMillis());
        TextView textView = BackupActivity.Z(this.b.a.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.a.b.getResources().getString(2131755430));
        stringBuilder.append(" ");
        stringBuilder.append(BackupActivity.Y(this.b.a.b).format(new Date(System.currentTimeMillis())));
        textView.setText(stringBuilder.toString());
        BackupActivity.Z(this.b.a.b).setVisibility(0);
        Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755104), 1).show();
        com.allinone.callerid.util.q.b().c("backup_successful");
      }
    }
  }
  
  class a implements Runnable {
    a(BackupActivity this$0) {}
    
    public void run() {
      Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755106), 0).show();
    }
  }
  
  class b implements Runnable {
    b(BackupActivity this$0) {}
    
    public void run() {
      com.allinone.callerid.c.b.c.j(System.currentTimeMillis());
      TextView textView = BackupActivity.Z(this.b.a.b);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b.a.b.getResources().getString(2131755430));
      stringBuilder.append(" ");
      stringBuilder.append(BackupActivity.Y(this.b.a.b).format(new Date(System.currentTimeMillis())));
      textView.setText(stringBuilder.toString());
      BackupActivity.Z(this.b.a.b).setVisibility(0);
      Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755104), 1).show();
      com.allinone.callerid.util.q.b().c("backup_successful");
    }
  }
  
  class q implements Runnable {
    q(BackupActivity this$0) {}
    
    public void run() {
      try {
        Drive drive = BackupActivity.X(this.b);
        a a = new a();
        this(this);
        com.allinone.callerid.c.a.a.c(drive, a);
      } catch (Exception exception) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("restoreException:");
          stringBuilder.append(exception.getMessage());
          d0.a("backup", stringBuilder.toString());
        } 
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.c.a.b {
      a(BackupActivity.q this$0) {}
      
      public void b() {}
      
      public void c() {
        this.a.b.runOnUiThread(new a(this));
      }
      
      public void d(UserRecoverableAuthIOException param2UserRecoverableAuthIOException) {}
      
      class a implements Runnable {
        a(BackupActivity.q.a this$0) {}
        
        public void run() {
          Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755667), 1).show();
          com.allinone.callerid.c.b.a.b(this.b.a.b.getApplicationContext());
        }
      }
    }
    
    class a implements Runnable {
      a(BackupActivity.q this$0) {}
      
      public void run() {
        Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755667), 1).show();
        com.allinone.callerid.c.b.a.b(this.b.a.b.getApplicationContext());
      }
    }
  }
  
  class a implements com.allinone.callerid.c.a.b {
    a(BackupActivity this$0) {}
    
    public void b() {}
    
    public void c() {
      this.a.b.runOnUiThread(new a(this));
    }
    
    public void d(UserRecoverableAuthIOException param1UserRecoverableAuthIOException) {}
    
    class a implements Runnable {
      a(BackupActivity.q.a this$0) {}
      
      public void run() {
        Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755667), 1).show();
        com.allinone.callerid.c.b.a.b(this.b.a.b.getApplicationContext());
      }
    }
  }
  
  class a implements Runnable {
    a(BackupActivity this$0) {}
    
    public void run() {
      Toast.makeText(this.b.a.b.getApplicationContext(), this.b.a.b.getResources().getString(2131755667), 1).show();
      com.allinone.callerid.c.b.a.b(this.b.a.b.getApplicationContext());
    }
  }
  
  class r implements View.OnClickListener {
    r(BackupActivity this$0) {}
    
    public void onClick(View param1View) {
      if (BackupActivity.a0(this.b) != null)
        BackupActivity.a0(this.b).cancel(); 
      if (com.google.android.gms.auth.api.signin.a.c(this.b.getApplicationContext()) != null) {
        BackupActivity backupActivity = this.b;
        BackupActivity.S(backupActivity, com.google.android.gms.auth.api.signin.a.c(backupActivity.getApplicationContext()));
        BackupActivity.W(this.b);
      } else {
        BackupActivity.V(this.b, true);
        BackupActivity.k0(this.b);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/backup/activitys/BackupActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */