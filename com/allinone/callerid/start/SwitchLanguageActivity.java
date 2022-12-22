package com.allinone.callerid.start;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class SwitchLanguageActivity extends BaseActivity implements View.OnClickListener {
  private ImageView A;
  
  private ImageView B;
  
  private ImageView C;
  
  private ImageView D;
  
  private ImageView E;
  
  private ImageView F;
  
  private ImageView G;
  
  private ImageView H;
  
  private ImageView I;
  
  private ImageView J;
  
  private ImageView K;
  
  private ImageView L;
  
  private ImageView M;
  
  private ImageView N;
  
  private ImageView O;
  
  private ImageView P;
  
  private ImageView Q;
  
  private final String s = "SwitchLanguageActivity";
  
  private ImageView t;
  
  private ImageView u;
  
  private ImageView v;
  
  private ImageView w;
  
  private ImageView x;
  
  private ImageView y;
  
  private ImageView z;
  
  private void O() {
    String str = (EZCallApplication.c()).f;
    if (str.equals("en")) {
      this.v.setVisibility(0);
    } else if (str.equals("en_GB")) {
      this.v.setVisibility(0);
    } else if (str.equals("en_CA")) {
      this.v.setVisibility(0);
    } else if (str.equals("hi")) {
      this.z.setVisibility(0);
    } else if (str.equals("bn")) {
      this.A.setVisibility(0);
    } else if (str.equals("fa")) {
      this.B.setVisibility(0);
    } else if (str.equals("ru")) {
      this.x.setVisibility(0);
    } else if (str.equals("tr")) {
      this.y.setVisibility(0);
    } else if (str.equals("in")) {
      this.w.setVisibility(0);
    } else if (str.equals("ms")) {
      this.C.setVisibility(0);
    } else if (str.equals("zh")) {
      this.D.setVisibility(0);
    } else if (str.equals("ar")) {
      this.E.setVisibility(0);
    } else if (str.equals("pt")) {
      this.G.setVisibility(0);
    } else if (str.equals("th")) {
      this.H.setVisibility(0);
    } else if (str.equals("es")) {
      this.F.setVisibility(0);
    } else if (str.equals("iw")) {
      this.I.setVisibility(0);
    } else if (str.equals("de")) {
      this.J.setVisibility(0);
    } else if (str.equals("zh-TW")) {
      this.K.setVisibility(0);
    } else if (str.equals("fr")) {
      this.u.setVisibility(0);
    } else if (str.equals("ko")) {
      this.t.setVisibility(0);
    } else if (str.equals("vi")) {
      this.L.setVisibility(0);
    } else if (str.equals("kk")) {
      this.M.setVisibility(0);
    } else if (str.equals("it")) {
      this.N.setVisibility(0);
    } else if (str.equals("el")) {
      this.O.setVisibility(0);
    } else if (str.equals("te")) {
      this.P.setVisibility(0);
    } else if (str.equals("ur")) {
      this.Q.setVisibility(0);
    } 
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131296884:
        i1.a = true;
        N("vi");
        (EZCallApplication.c()).f = "vi";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296883:
        i1.a = true;
        N("in");
        (EZCallApplication.c()).f = "in";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296882:
        i1.a = true;
        N("hi");
        (EZCallApplication.c()).f = "hi";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296881:
        i1.a = true;
        N("it");
        (EZCallApplication.c()).f = "it";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296880:
        i1.a = true;
        N("el");
        (EZCallApplication.c()).f = "el";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296879:
        i1.a = true;
        N("iw");
        (EZCallApplication.c()).f = "iw";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296878:
        i1.a = true;
        N("es");
        (EZCallApplication.c()).f = "es";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296877:
        i1.a = true;
        N("ur");
        (EZCallApplication.c()).f = "ur";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296876:
        i1.a = true;
        N("tr");
        (EZCallApplication.c()).f = "tr";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296875:
        i1.a = true;
        N("te");
        (EZCallApplication.c()).f = "te";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296874:
        i1.a = true;
        N("th");
        (EZCallApplication.c()).f = "th";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296871:
        i1.a = true;
        N("pt");
        (EZCallApplication.c()).f = "pt";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296869:
        i1.a = true;
        N("bn");
        (EZCallApplication.c()).f = "bn";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296868:
        i1.a = true;
        N("ms");
        (EZCallApplication.c()).f = "ms";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296867:
        i1.a = true;
        N("zh");
        (EZCallApplication.c()).f = "zh";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296866:
        i1.a = true;
        N("kk");
        (EZCallApplication.c()).f = "kk";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296865:
        i1.a = true;
        N("ko");
        (EZCallApplication.c()).f = "ko";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296863:
        i1.a = true;
        N("fr");
        (EZCallApplication.c()).f = "fr";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296862:
        i1.a = true;
        N("zh-TW");
        (EZCallApplication.c()).f = "zh-TW";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296861:
        i1.a = true;
        N("en");
        (EZCallApplication.c()).f = "en";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296860:
        i1.a = true;
        N("ru");
        (EZCallApplication.c()).f = "ru";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296859:
        i1.a = true;
        N("de");
        (EZCallApplication.c()).f = "de";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296858:
        i1.a = true;
        N("fa");
        (EZCallApplication.c()).f = "fa";
        startActivity(new Intent(getApplicationContext(), CommonSetting.class));
        finish();
      case 2131296857:
        break;
    } 
    i1.a = true;
    N("ar");
    (EZCallApplication.c()).f = "ar";
    startActivity(new Intent(getApplicationContext(), CommonSetting.class));
    finish();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492959);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    Typeface typeface = g1.b();
    ((TextView)findViewById(2131298191)).setTypeface(typeface);
    ((TextView)findViewById(2131297900)).setTypeface(typeface);
    ((TextView)findViewById(2131297969)).setTypeface(typeface);
    ((TextView)findViewById(2131297967)).setTypeface(typeface);
    ((TextView)findViewById(2131298230)).setTypeface(typeface);
    ((TextView)findViewById(2131298229)).setTypeface(typeface);
    ((TextView)findViewById(2131297937)).setTypeface(typeface);
    ((TextView)findViewById(2131297902)).setTypeface(typeface);
    ((TextView)findViewById(2131297797)).setTypeface(typeface);
    ((TextView)findViewById(2131298222)).setTypeface(typeface);
    ((TextView)findViewById(2131298052)).setTypeface(typeface);
    ((TextView)findViewById(2131298166)).setTypeface(typeface);
    ((TextView)findViewById(2131298223)).setTypeface(typeface);
    ((TextView)findViewById(2131297891)).setTypeface(typeface);
    ((TextView)findViewById(2131297826)).setTypeface(typeface);
    ((TextView)findViewById(2131297899)).setTypeface(typeface);
    ((TextView)findViewById(2131297908)).setTypeface(typeface);
    ((TextView)findViewById(2131297928)).setTypeface(typeface);
    ((TextView)findViewById(2131298198)).setTypeface(typeface);
    ((TextView)findViewById(2131298233)).setTypeface(typeface);
    ((TextView)findViewById(2131297929)).setTypeface(typeface);
    ((TextView)findViewById(2131298227)).setTypeface(typeface);
    ((TextView)findViewById(2131298224)).setTypeface(typeface);
    ((TextView)findViewById(2131298167)).setTypeface(typeface);
    ImageView imageView = (ImageView)findViewById(2131296850);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new a(this));
    this.v = (ImageView)findViewById(2131296987);
    this.w = (ImageView)findViewById(2131297091);
    this.x = (ImageView)findViewById(2131296984);
    this.y = (ImageView)findViewById(2131297081);
    this.z = (ImageView)findViewById(2131297090);
    this.A = (ImageView)findViewById(2131297012);
    this.B = (ImageView)findViewById(2131296958);
    this.C = (ImageView)findViewById(2131297011);
    this.D = (ImageView)findViewById(2131297006);
    this.K = (ImageView)findViewById(2131296988);
    this.E = (ImageView)findViewById(2131296945);
    this.F = (ImageView)findViewById(2131297086);
    this.G = (ImageView)findViewById(2131297030);
    this.H = (ImageView)findViewById(2131297076);
    this.I = (ImageView)findViewById(2131297087);
    this.J = (ImageView)findViewById(2131296981);
    this.u = (ImageView)findViewById(2131296990);
    this.t = (ImageView)findViewById(2131296998);
    this.L = (ImageView)findViewById(2131297092);
    this.M = (ImageView)findViewById(2131296999);
    this.N = (ImageView)findViewById(2131297089);
    this.O = (ImageView)findViewById(2131297088);
    this.P = (ImageView)findViewById(2131297077);
    ((FrameLayout)findViewById(2131296861)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296883)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296860)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296876)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296882)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296869)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296858)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296868)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296867)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296862)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296857)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296878)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296871)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296874)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296879)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296859)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296863)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296865)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296884)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296866)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296881)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296880)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296875)).setOnClickListener(this);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296877);
    TextView textView = (TextView)findViewById(2131298221);
    this.Q = (ImageView)findViewById(2131297085);
    frameLayout.setOnClickListener(this);
    textView.setTypeface(typeface);
    O();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      startActivity(new Intent(getApplicationContext(), CommonSetting.class));
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
    a(SwitchLanguageActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.startActivity(new Intent(this.b.getApplicationContext(), CommonSetting.class));
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/SwitchLanguageActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */