package com.allinone.callerid.start;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.backup.activitys.BackupActivity;
import com.allinone.callerid.dialog.m;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZCountryCode;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.ShowTipActivityNew;
import com.allinone.callerid.mvc.controller.block.BlockSettingActivity;
import com.allinone.callerid.mvc.controller.nodisturb.NoDisturbActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.z;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public class CommonSetting extends BaseActivity implements View.OnClickListener {
  private final String s = "CommonSetting";
  
  private String t = "";
  
  private ProgressBar u;
  
  private int v;
  
  private TextView w;
  
  private List<EZCountryCode> x;
  
  private TextView y;
  
  private void U(Context paramContext, com.allinone.callerid.model.a parama) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("info==");
    stringBuilder.append(parama.toString());
    d0.a("testupdate", stringBuilder.toString());
    this.t = parama.b();
    String str1 = parama.a();
    String str2 = this.t;
    if (str2 != null && !str2.equals("")) {
      if (d0.a) {
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("minVersion:");
        stringBuilder2.append(str1);
        d0.a("tony", stringBuilder2.toString());
      } 
      this.u.setVisibility(8);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Utils.getTestRest==");
      stringBuilder1.append(i1.S(str1));
      d0.a("testupdate", stringBuilder1.toString());
      if (i1.S(str1)) {
        S();
      } else {
        try {
          i1.C0((Context)this, getPackageName());
        } catch (Exception exception) {
          exception.getMessage();
        } 
      } 
    } else {
      this.u.setVisibility(8);
      Toast.makeText((Context)this, getResources().getString(2131755269), 0).show();
    } 
  }
  
  private void V() {
    Typeface typeface = g1.b();
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296751);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296719);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296713);
    FrameLayout frameLayout4 = (FrameLayout)findViewById(2131296762);
    FrameLayout frameLayout5 = (FrameLayout)findViewById(2131296729);
    FrameLayout frameLayout6 = (FrameLayout)findViewById(2131296744);
    FrameLayout frameLayout7 = (FrameLayout)findViewById(2131296727);
    this.u = (ProgressBar)findViewById(2131297380);
    FrameLayout frameLayout8 = (FrameLayout)findViewById(2131297633);
    ((FrameLayout)findViewById(2131296872)).setOnClickListener(this);
    TextView textView2 = (TextView)findViewById(2131297961);
    this.w = (TextView)findViewById(2131297883);
    textView2.setTypeface(typeface);
    this.w.setTypeface(typeface);
    ((FrameLayout)findViewById(2131297590)).setOnClickListener(new b(this));
    this.y = (TextView)findViewById(2131297874);
    String str = p.d((Context)this).getCountry_name();
    if (str != null && !"".equals(str)) {
      this.y.setText(p.d((Context)this).getCountry_name());
    } else {
      this.y.setText(getResources().getString(2131755830));
    } 
    this.y.setTypeface(typeface);
    ((TextView)findViewById(2131297873)).setTypeface(typeface);
    TextView textView1 = (TextView)findViewById(2131297838);
    ((TextView)findViewById(2131297839)).setTypeface(typeface);
    textView1.setTypeface(typeface);
    ((FrameLayout)findViewById(2131296455)).setOnClickListener(this);
    frameLayout8.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout4.setOnClickListener(this);
    frameLayout5.setOnClickListener(this);
    frameLayout6.setOnClickListener(this);
    frameLayout7.setOnClickListener(this);
    ImageView imageView = (ImageView)findViewById(2131297125);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new c(this));
    ((TextView)findViewById(2131297919)).setTypeface(typeface);
    ((TextView)findViewById(2131297821)).setTypeface(typeface);
    ((TextView)findViewById(2131297805)).setTypeface(typeface);
    ((TextView)findViewById(2131298010)).setTypeface(typeface);
    ((TextView)findViewById(2131297858)).setTypeface(typeface);
    ((TextView)findViewById(2131297909)).setTypeface(typeface);
    ((TextView)findViewById(2131297846)).setTypeface(typeface);
    ((TextView)findViewById(2131298128)).setTypeface(typeface);
  }
  
  private void W() {
    String str = (EZCallApplication.c()).f;
    if (str.equals("en")) {
      this.w.setText("English");
    } else if (str.equals("hi")) {
      this.w.setText("हिन्दी");
    } else if (str.equals("bn")) {
      this.w.setText("বাংলা ভাষা");
    } else if (str.equals("fa")) {
      this.w.setText("فارسی");
    } else if (str.equals("ru")) {
      this.w.setText("русский");
    } else if (str.equals("tr")) {
      this.w.setText("Türk");
    } else if (str.equals("in")) {
      this.w.setText("Indonesia");
    } else if (str.equals("ms")) {
      this.w.setText("Melayu");
    } else if (str.equals("zh")) {
      this.w.setText("简体中文");
    } else if (str.equals("ar")) {
      this.w.setText("العربية");
    } else if (str.equals("es")) {
      this.w.setText("Espanol");
    } else if (str.equals("pt")) {
      this.w.setText("Português");
    } else if (str.equals("th")) {
      this.w.setText("ภาษาไทย");
    } else if (str.equals("iw")) {
      this.w.setText("עִבְרִית");
    } else if (str.equals("de")) {
      this.w.setText("Deutsch");
    } else if (str.equals("zh-TW")) {
      this.w.setText("繁体中文");
    } else if (str.equals("fr")) {
      this.w.setText("Français");
    } else if (str.equals("ko")) {
      this.w.setText("한국어");
    } else if (str.equals("vi")) {
      this.w.setText("Tiếng Việt");
    } else if (str.equals("kk")) {
      this.w.setText("қазақ тілі");
    } else if (str.equals("it")) {
      this.w.setText("Italiano");
    } else if (str.equals("el")) {
      this.w.setText("Ελληνικά");
    } else if (str.equals("te")) {
      this.w.setText("বతెలుగు");
    } else if (str.equals("ur")) {
      this.w.setText("اردو");
    } 
  }
  
  public void S() {
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setTitle(getResources().getString(2131755837)).setMessage(getResources().getString(2131755464)).setPositiveButton(getResources().getString(2131755836), new g(this)).setNegativeButton(getResources().getString(2131755180), new f(this)).create();
    alertDialog.show();
    alertDialog.getButton(-1).setTextColor(this.v);
    alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
  }
  
  public List<EZCountryCode> T() {
    try {
      return p.a((Context)this);
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
    return null;
  }
  
  public void X() {
    z z = new z();
    z.c(new e(this));
    z.b(getApplicationContext());
  }
  
  public void Y() {
    if (this.x == null)
      this.x = T(); 
    m.i((Activity)this, new ArrayList<EZCountryCode>(this.x), new d(this));
  }
  
  public void onClick(View paramView) {
    Intent intent;
    switch (paramView.getId()) {
      default:
        return;
      case 2131297633:
        intent = new Intent();
        intent.setClass((Context)this, ShowTipActivityNew.class);
        startActivity(intent);
        overridePendingTransition(2130771970, 2130771977);
        q.b().c("show_tips");
      case 2131296872:
        startActivity(new Intent(getApplicationContext(), SwitchLanguageActivity.class));
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296762:
        intent = new Intent();
        intent.setClass((Context)this, NoDisturbActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131296751:
        intent = new Intent();
        intent.setClass((Context)this, Generalsettings.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131296744:
        try {
          intent = new Intent();
          this("android.intent.action.SENDTO");
          intent.setData(Uri.parse("mailto:andreapps2015@gmail.com"));
          intent.putExtra("android.intent.extra.SUBJECT", "Showcaller-Feedback");
          intent.putExtra("android.intent.extra.TEXT", i1.V());
          startActivity(intent);
        } catch (Exception exception) {
          try {
            Intent intent1 = new Intent();
            this("android.intent.action.SEND");
            intent1.setType("message/rfc822");
            intent1.putExtra("android.intent.extra.EMAIL", new String[] { "andreapps2015@gmail.com" });
            intent1.putExtra("android.intent.extra.SUBJECT", "Showcaller-Feedback");
            intent1.putExtra("android.intent.extra.TEXT", i1.V());
            startActivity(Intent.createChooser(intent1, "E-mail"));
          } catch (Exception exception1) {
            exception1.printStackTrace();
          } 
        } 
        overridePendingTransition(2130771968, 2130771969);
      case 2131296729:
        intent = new Intent();
        intent.setClass((Context)this, ComplaintActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131296727:
        this.u.setVisibility(0);
        X();
      case 2131296719:
        intent = new Intent();
        intent.setClass((Context)this, BlockSettingActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131296713:
        intent = new Intent();
        intent.setClass((Context)this, BackupActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131296455:
        break;
    } 
    startActivity(new Intent((Context)this, CallerActivity.class));
    overridePendingTransition(2130771968, 2130771969);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492915);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.v = d1.a((Context)this, 2130968859, 2131099706);
    V();
    W();
    (j0.a()).b.execute(new a(this));
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      if (this.u.isShown())
        this.u.setVisibility(8); 
      if (i1.a) {
        i1.a = false;
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        overridePendingTransition(2130771968, 2130771969);
        finish();
      } else {
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
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
  
  class a implements Runnable {
    a(CommonSetting this$0) {}
    
    public void run() {
      CommonSetting commonSetting = this.b;
      CommonSetting.O(commonSetting, commonSetting.T());
    }
  }
  
  class b implements View.OnClickListener {
    b(CommonSetting this$0) {}
    
    public void onClick(View param1View) {
      this.b.Y();
      q.b().c("defaults_cc_click");
    }
  }
  
  class c implements View.OnClickListener {
    c(CommonSetting this$0) {}
    
    public void onClick(View param1View) {
      if (i1.a) {
        i1.a = false;
        this.b.startActivity(new Intent((Context)this.b, MainActivity.class));
        this.b.finish();
      } else {
        this.b.finish();
      } 
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class d implements com.allinone.callerid.i.a.b {
    d(CommonSetting this$0) {}
    
    public void a(EZCountryCode param1EZCountryCode) {
      String str = CommonSetting.P(this.a).getText().toString();
      p.h((Context)this.a.getApplication(), param1EZCountryCode);
      CommonSetting.P(this.a).setText(p.d((Context)this.a).getCountry_name());
      if (!str.equals(CommonSetting.P(this.a).getText().toString()) && i1.r0((Context)EZCallApplication.c()))
        (new CommonSetting.h(this.a)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]); 
    }
  }
  
  class e implements z.b {
    e(CommonSetting this$0) {}
    
    public void a(com.allinone.callerid.model.a param1a) {
      this.a.runOnUiThread(new a(this, param1a));
    }
    
    class a implements Runnable {
      a(CommonSetting.e this$0, com.allinone.callerid.model.a param2a) {}
      
      public void run() {
        CommonSetting commonSetting = this.c.a;
        CommonSetting.Q(commonSetting, commonSetting.getApplicationContext(), this.b);
      }
    }
  }
  
  class a implements Runnable {
    a(CommonSetting this$0, com.allinone.callerid.model.a param1a) {}
    
    public void run() {
      CommonSetting commonSetting = this.c.a;
      CommonSetting.Q(commonSetting, commonSetting.getApplicationContext(), this.b);
    }
  }
  
  class f implements DialogInterface.OnClickListener {
    f(CommonSetting this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class g implements DialogInterface.OnClickListener {
    g(CommonSetting this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        Intent intent = new Intent();
        this("android.intent.action.VIEW", Uri.parse(CommonSetting.R(this.b)));
        this.b.startActivity(intent);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  private static class h extends AsyncTask<Void, Void, Void> {
    private WeakReference<CommonSetting> a;
    
    h(CommonSetting param1CommonSetting) {
      this.a = new WeakReference<CommonSetting>(param1CommonSetting);
    }
    
    protected Void a(Void... param1VarArgs) {
      CommonSetting commonSetting = this.a.get();
      if (commonSetting != null && !commonSetting.isFinishing())
        try {
          com.allinone.callerid.f.f.b().a();
        } catch (Exception exception) {
          try {
            exception.printStackTrace();
          } catch (Exception exception1) {
            exception1.printStackTrace();
          } 
        }  
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      CommonSetting commonSetting = this.a.get();
      if (commonSetting != null && !commonSetting.isFinishing()) {
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.RELOAD_DATA");
        b.p.a.a.b((Context)commonSetting).d(intent);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/CommonSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */