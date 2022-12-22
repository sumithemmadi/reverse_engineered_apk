package com.allinone.callerid.mvc.controller.report;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.bean.ReportedContent;
import com.allinone.callerid.dialog.j;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.u0;

public class ReportContactActivity extends BaseActivity implements View.OnClickListener {
  private TextView A;
  
  private TextView B;
  
  private AlertDialog C;
  
  private final String s = "ReportContactActivity";
  
  private TextView t;
  
  private TextView u;
  
  private TextView v;
  
  private String w;
  
  private TextView x;
  
  private j y;
  
  private TextView z;
  
  private void W(String paramString, Context paramContext) {
    if (paramString != null)
      try {
        if (!"".equals(paramString)) {
          String str = paramString.replace("-", "");
          b b = new b();
          this(this, paramString, paramContext);
          com.allinone.callerid.i.a.e.b.b(str, b);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  private void X() {
    RelativeLayout relativeLayout = (RelativeLayout)findViewById(2131297486);
    ImageView imageView = (ImageView)findViewById(2131297127);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296430);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296440);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296436);
    relativeLayout.setOnClickListener(this);
    imageView.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    this.x = (TextView)findViewById(2131298158);
    TextView textView = (TextView)findViewById(2131298165);
    this.t = (TextView)findViewById(2131298159);
    this.u = (TextView)findViewById(2131298163);
    this.v = (TextView)findViewById(2131298161);
    this.z = (TextView)findViewById(2131298164);
    this.A = (TextView)findViewById(2131298162);
    this.B = (TextView)findViewById(2131298160);
    this.x.setTypeface(g1.b());
    textView.setTypeface(g1.b());
    this.t.setTypeface(g1.b());
    this.u.setTypeface(g1.b());
    this.v.setTypeface(g1.b());
    this.B.setTypeface(g1.b());
    this.A.setTypeface(g1.b());
    this.z.setTypeface(g1.b());
  }
  
  private void Y(String paramString) {
    com.allinone.callerid.i.a.v.b.a(paramString, new a(this));
  }
  
  private void Z(String paramString1, String paramString2, String paramString3, String paramString4) {
    View view = LayoutInflater.from((Context)this).inflate(2131493156, null);
    TextView textView = (TextView)view.findViewById(2131298064);
    CheckBox checkBox = (CheckBox)view.findViewById(2131296458);
    textView.setText(paramString3);
    textView.setTypeface(g1.b());
    ((TextView)view.findViewById(2131298063)).setTypeface(g1.b());
    ((TextView)view.findViewById(2131298060)).setTypeface(g1.b());
    ((TextView)view.findViewById(2131297830)).setTypeface(g1.b());
    FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296416);
    ImageView imageView = (ImageView)view.findViewById(2131297124);
    frameLayout.setOnClickListener(new c(this, paramString1, paramString2, paramString4, checkBox));
    imageView.setOnClickListener(new d(this));
    if (!isFinishing()) {
      AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setView(view).create();
      this.C = alertDialog;
      alertDialog.show();
    } 
  }
  
  private void a0(String paramString1, String paramString2, String paramString3) {
    (new u0((Context)EZCallApplication.c(), paramString1, paramString2, "android", i1.W((Context)EZCallApplication.c()), p.d((Context)EZCallApplication.c()).getCountry_code(), paramString3)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
  }
  
  private void b0() {
    Intent intent = getIntent();
    if (intent != null) {
      String str = intent.getStringExtra("report_number");
      this.w = str;
      this.x.setText(str);
      str = this.w;
      if (str != null && !"".equals(str))
        Y(this.w); 
    } 
  }
  
  private void c0() {
    j j1 = new j(getApplicationContext(), 2131820783, new e(this));
    this.y = j1;
    try {
      if (Build.VERSION.SDK_INT >= 26) {
        j1.getWindow().setType(2038);
      } else {
        j1.getWindow().setType(2003);
      } 
      this.y.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297486:
        finish();
        overridePendingTransition(0, 2130772041);
      case 2131297127:
        finish();
        overridePendingTransition(0, 2130772041);
      case 2131296440:
        q.b().c("report_telemarketing_click");
        str = this.w;
        if (str != null && !"".equals(str)) {
          Z(this.w, "is_telemarketing", this.u.getText().toString(), "Telemarketing");
        } else {
          Toast.makeText((Context)this, getResources().getString(2131755420), 0).show();
        } 
      case 2131296436:
        q.b().c("report_spam_click");
        str = this.w;
        if (str != null && !"".equals(str)) {
          Z(this.w, "is_spam", this.v.getText().toString(), "Spam");
        } else {
          Toast.makeText((Context)this, getResources().getString(2131755420), 0).show();
        } 
      case 2131296430:
        break;
    } 
    q.b().c("report_scam_click");
    String str = this.w;
    if (str != null && !"".equals(str))
      Z(this.w, "is_scam", this.t.getText().toString(), "Scam"); 
    Toast.makeText((Context)this, getResources().getString(2131755420), 0).show();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
    setContentView(2131492952);
    q.b().c("report_activity");
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    X();
    b0();
    try {
      Display display = getWindowManager().getDefaultDisplay();
      WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
      int i = display.getWidth();
      double d = i;
      Double.isNaN(d);
      i = (int)(d * 1.0D);
      layoutParams.width = i;
      layoutParams.alpha = 1.0F;
      layoutParams.dimAmount = 0.0F;
      getWindow().setAttributes(layoutParams);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      finish();
      overridePendingTransition(0, 2130772041);
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
  
  class a implements com.allinone.callerid.i.a.v.a {
    a(ReportContactActivity this$0) {}
    
    public void a(String param1String1, String param1String2, String param1String3) {
      if (param1String1 != null && !"".equals(param1String1) && Integer.parseInt(param1String1) != 0) {
        TextView textView = ReportContactActivity.O(this.a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String1);
        stringBuilder.append(" ");
        stringBuilder.append(this.a.getResources().getString(2131755656));
        textView.setText(stringBuilder.toString());
        ReportContactActivity.O(this.a).setVisibility(0);
        ReportContactActivity.P(this.a).setVisibility(0);
        ReportContactActivity.Q(this.a).setVisibility(0);
      } 
      if (param1String2 != null && !"".equals(param1String2) && Integer.parseInt(param1String2) != 0) {
        TextView textView = ReportContactActivity.P(this.a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String2);
        stringBuilder.append(" ");
        stringBuilder.append(this.a.getResources().getString(2131755656));
        textView.setText(stringBuilder.toString());
        ReportContactActivity.P(this.a).setVisibility(0);
        ReportContactActivity.O(this.a).setVisibility(0);
        ReportContactActivity.Q(this.a).setVisibility(0);
      } 
      if (param1String3 != null && !"".equals(param1String3) && Integer.parseInt(param1String3) != 0) {
        TextView textView = ReportContactActivity.Q(this.a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String3);
        stringBuilder.append(" ");
        stringBuilder.append(this.a.getResources().getString(2131755656));
        textView.setText(stringBuilder.toString());
        ReportContactActivity.Q(this.a).setVisibility(0);
        ReportContactActivity.O(this.a).setVisibility(0);
        ReportContactActivity.P(this.a).setVisibility(0);
      } 
    }
  }
  
  class b implements com.allinone.callerid.i.a.e.a {
    b(ReportContactActivity this$0, String param1String, Context param1Context) {}
    
    public void a(boolean param1Boolean) {
      if (!param1Boolean) {
        EZBlackList eZBlackList = new EZBlackList();
        eZBlackList.setName("");
        eZBlackList.setNumber(this.a);
        eZBlackList.setIs_myblock("true");
        com.allinone.callerid.i.a.e.b.a(eZBlackList, new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(ReportContactActivity.b this$0) {}
      
      public void a() {
        b.p.a.a.b(this.a.b).d(new Intent("com.allinone.callerid.REPORT_BLOCK"));
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(ReportContactActivity this$0) {}
    
    public void a() {
      b.p.a.a.b(this.a.b).d(new Intent("com.allinone.callerid.REPORT_BLOCK"));
    }
  }
  
  class c implements View.OnClickListener {
    c(ReportContactActivity this$0, String param1String1, String param1String2, String param1String3, CheckBox param1CheckBox) {}
    
    public void onClick(View param1View) {
      try {
        b1.O1(b1.i0() + 1);
        ReportContactActivity.R(this.f, this.b, this.c, this.d);
        ReportedContent reportedContent = new ReportedContent();
        this();
        reportedContent.setNumber(this.b);
        reportedContent.setType(this.c);
        reportedContent.setTime(System.currentTimeMillis());
        com.allinone.callerid.i.a.v.d.d(reportedContent);
        if (this.e.isChecked())
          ReportContactActivity.S(this.f, this.b, (Context)EZCallApplication.c()); 
        CollectInfo collectInfo = new CollectInfo();
        this();
        collectInfo.setNumber(this.b);
        boolean bool = this.e.isChecked();
        if (bool) {
          collectInfo.setUser_blocked("1");
        } else {
          collectInfo.setUser_blocked("0");
        } 
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("1");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        if (Build.VERSION.SDK_INT >= 23) {
          if (Settings.canDrawOverlays((Context)EZCallApplication.c()))
            ReportContactActivity.T(this.f); 
        } else {
          ReportContactActivity.T(this.f);
        } 
        if (ReportContactActivity.U(this.f) != null)
          ReportContactActivity.U(this.f).dismiss(); 
        Intent intent = new Intent();
        this();
        intent.putExtra("typelabel", this.d);
        this.f.setResult(963, intent);
        this.f.finish();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class d implements View.OnClickListener {
    d(ReportContactActivity this$0) {}
    
    public void onClick(View param1View) {
      if (ReportContactActivity.U(this.b) != null)
        ReportContactActivity.U(this.b).dismiss(); 
    }
  }
  
  class e implements View.OnClickListener {
    e(ReportContactActivity this$0) {}
    
    public void onClick(View param1View) {
      if (param1View.getId() == 2131297129)
        ReportContactActivity.V(this.b).dismiss(); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/report/ReportContactActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */