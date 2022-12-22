package com.allinone.callerid.start;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.bean.ReportedContent;
import com.allinone.callerid.dialog.DialogMissed;
import com.allinone.callerid.dialog.j;
import com.allinone.callerid.dialog.k;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.recommend.RecommendActivity;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.u;
import com.allinone.callerid.util.u0;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.u;

public class AnsweredActivity extends BaseActivity implements View.OnClickListener {
  private Context A;
  
  private ConstraintLayout B;
  
  private boolean C;
  
  private int D;
  
  private TextView E;
  
  private TextView F;
  
  private LinearLayout G;
  
  private FrameLayout H;
  
  private FrameLayout I;
  
  private FrameLayout J;
  
  private j K;
  
  private TextView L;
  
  private FrameLayout M;
  
  private final String s = "AnsweredActivity";
  
  private EZSearchResult t;
  
  private TextView u;
  
  private ImageView v;
  
  private TextView w;
  
  private FrameLayout x;
  
  private FrameLayout y;
  
  private String z = "";
  
  private void Y() {
    try {
      Intent intent = new Intent();
      this("android.intent.action.INSERT");
      intent.setType("vnd.android.cursor.dir/person");
      intent.setType("vnd.android.cursor.dir/contact");
      intent.setType("vnd.android.cursor.dir/raw_contact");
      intent.putExtra("phone_type", 2);
      intent.putExtra("phone", this.t.getNumber());
      intent.putExtra("name", this.t.getName());
      startActivity(intent);
      overridePendingTransition(2130771968, 2130771969);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void Z() {
    if (i1.t0() && b1.T() && this.C) {
      b1.y1(false);
      if (Build.VERSION.SDK_INT >= 23) {
        if (Settings.canDrawOverlays(getApplicationContext()))
          f0(getApplicationContext()); 
      } else {
        f0(getApplicationContext());
      } 
    } else {
      com.allinone.callerid.i.a.d.a.a(new d(this));
    } 
  }
  
  private void a0() {
    q.b().c("missed_request_num");
    com.google.android.gms.ads.d.a a = new com.google.android.gms.ads.d.a((Context)EZCallApplication.c(), "ca-app-pub-5825926894918682/7437588851");
    a.e(new b(this));
    u u = (new u.a()).b(true).a();
    a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
    a.f(new c(this)).a().b((new com.google.android.gms.ads.e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
  }
  
  private void b0(String paramString1, String paramString2, String paramString3) {
    try {
      ReportedContent reportedContent = new ReportedContent();
      this();
      reportedContent.setNumber(paramString1);
      reportedContent.setType(paramString2);
      reportedContent.setTime(System.currentTimeMillis());
      com.allinone.callerid.i.a.v.d.d(reportedContent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    (new u0(this.A, paramString1, paramString2, "android", i1.W((Context)EZCallApplication.c()), p.d((Context)EZCallApplication.c()).getCountry_code(), paramString3)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    CollectInfo collectInfo = new CollectInfo();
    collectInfo.setNumber(paramString1);
    collectInfo.setUser_blocked("0");
    collectInfo.setUser_commented("0");
    collectInfo.setUser_reported("1");
    collectInfo.setUser_upload_recording("0");
    com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
  }
  
  private void c0() {
    if (!b1.y2().booleanValue()) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
        com.allinone.callerid.dialog.f f = new com.allinone.callerid.dialog.f((Context)this, 2131820783);
        f.setCanceledOnTouchOutside(false);
        f.show();
        return;
      } 
    } 
    com.allinone.callerid.i.a.e.b.b(this.t.getNumber(), new i(this));
  }
  
  private void d0() {
    if (this.D == 1) {
      u.c((Activity)this, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.t.getRaw_contact_id()), "", 2131231148, this.v);
    } else if (this.t.getIcon() != null && !"".equals(this.t.getIcon())) {
      u.b(this.A, this.t.getIcon(), 2131231148, this.v);
    } else if (this.D == 0 && this.t.getType_label() != null && !"".equals(this.t.getType_label()) && this.t.getReport_count() > 0) {
      this.v.setImageResource(2131231149);
    } else {
      this.v.setImageResource(2131231148);
    } 
  }
  
  private void e0() {
    if (this.t != null)
      try {
        d0();
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("ezSearchResult");
          stringBuilder.append(this.t.toString());
          d0.a("missed_activity", stringBuilder.toString());
        } 
        if (this.t.getDate() == 1L)
          this.C = true; 
        String str = this.t.getNumber();
        if (str != null && !"".equals(this.t.getNumber()))
          this.z = this.t.getNumber(); 
        str = this.t.getFormat_tel_number();
        if (this.t.getName() != null && !"".equals(this.t.getName())) {
          this.u.setText(this.t.getName());
          if (str != null && !"".equals(str)) {
            this.L.setText(str);
          } else {
            this.L.setText(this.t.getNumber());
          } 
          this.L.setVisibility(0);
        } else if (str != null && !"".equals(str)) {
          this.u.setText(str);
        } else {
          this.u.setText(this.t.getNumber());
        } 
        if (this.D == 0 && this.t.getType_label() != null && !"".equals(this.t.getType_label()) && this.t.getReport_count() > 0) {
          this.M.setVisibility(0);
          this.B.setVisibility(8);
          this.v.setImageResource(2131231149);
          this.w.setVisibility(0);
          this.E.setVisibility(0);
          this.L.setTextColor(getResources().getColor(2131099745));
          TextView textView = this.E;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(this.t.getReport_count());
          stringBuilder.append("");
          textView.setText(stringBuilder.toString());
          textView = this.w;
          stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(getResources().getString(2131755656));
          stringBuilder.append(" ");
          stringBuilder.append(this.t.getType_label());
          textView.setText(stringBuilder.toString());
          this.G.setVisibility(0);
          this.F.setText(getResources().getString(2131755127));
          this.F.setVisibility(0);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  private void f0(Context paramContext) {
    try {
      k k = new k();
      this(paramContext, 2131820783, false);
      if (Build.VERSION.SDK_INT >= 26) {
        if (k.getWindow() != null)
          k.getWindow().setType(2038); 
      } else if (k.getWindow() != null) {
        k.getWindow().setType(2003);
      } 
      k.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void g0() {
    j j1 = new j(this.A, 2131820783, new h(this));
    this.K = j1;
    try {
      j1.getWindow().setType(2003);
      this.K.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void u() {
    ((RelativeLayout)findViewById(2131296342)).setOnClickListener(this);
    Typeface typeface1 = g1.a();
    Typeface typeface2 = g1.b();
    ImageView imageView = (ImageView)findViewById(2131297122);
    this.x = (FrameLayout)findViewById(2131296425);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296409);
    this.y = (FrameLayout)findViewById(2131296407);
    this.M = (FrameLayout)findViewById(2131296410);
    this.v = (ImageView)findViewById(2131297360);
    this.B = (ConstraintLayout)findViewById(2131297169);
    this.G = (LinearLayout)findViewById(2131297210);
    this.H = (FrameLayout)findViewById(2131296430);
    this.I = (FrameLayout)findViewById(2131296436);
    this.J = (FrameLayout)findViewById(2131296440);
    this.H.setOnClickListener(this);
    this.I.setOnClickListener(this);
    this.J.setOnClickListener(this);
    imageView.setOnClickListener(this);
    this.x.setOnClickListener(this);
    frameLayout.setOnClickListener(this);
    this.y.setOnClickListener(this);
    this.M.setOnClickListener(this);
    this.u = (TextView)findViewById(2131298023);
    this.L = (TextView)findViewById(2131298143);
    this.w = (TextView)findViewById(2131298136);
    this.E = (TextView)findViewById(2131298138);
    this.F = (TextView)findViewById(2131297820);
    ((TextView)findViewById(2131298146)).setTypeface(typeface1);
    ((TextView)findViewById(2131298100)).setTypeface(typeface1);
    ((TextView)findViewById(2131298170)).setTypeface(typeface1);
    ((TextView)findViewById(2131298183)).setTypeface(typeface2);
    ((TextView)findViewById(2131297970)).setTypeface(typeface1);
    ((TextView)findViewById(2131297906)).setTypeface(typeface1);
    ((TextView)findViewById(2131297810)).setTypeface(typeface1);
    ((TextView)findViewById(2131297819)).setTypeface(typeface1);
    this.u.setTypeface(typeface1);
    this.L.setTypeface(typeface2);
    this.w.setTypeface(typeface2);
    this.E.setTypeface(typeface2);
    this.F.setTypeface(typeface2);
  }
  
  public void onClick(View paramView) {
    try {
      String str;
      int i = paramView.getId();
      switch (i) {
        default:
          return;
        case 2131297122:
          q.b().c("missed_close");
          Z();
          finish();
          overridePendingTransition(2130771968, 2130771969);
        case 2131296440:
          q.b().c("answered_telemarket");
          str = this.z;
          if (str != null && !"".equals(str)) {
            String str1 = this.z;
            g g = new g();
            this(this);
            com.allinone.callerid.i.a.l.b.a(str1, g);
          } 
        case 2131296436:
          q.b().c("answered_spam");
          str = this.z;
          if (str != null && !"".equals(str)) {
            str = this.z;
            f f = new f();
            this(this);
            com.allinone.callerid.i.a.l.b.a(str, f);
          } 
        case 2131296430:
          q.b().c("answered_scam");
          str = this.z;
          if (str != null && !"".equals(str)) {
            String str1 = this.z;
            e e = new e();
            this(this);
            com.allinone.callerid.i.a.l.b.a(str1, e);
          } 
        case 2131296425:
          q.b().c("answered_btn_report");
          this.x.setVisibility(8);
          this.y.setVisibility(8);
          this.H.setVisibility(0);
          this.I.setVisibility(0);
          this.J.setVisibility(0);
        case 2131296410:
          c0();
          q.b().c("answered_btn_block_spam");
        case 2131296409:
          c0();
          q.b().c("answered_btn_block");
        case 2131296407:
          Y();
          q.b().c("answered_btn_add_contact");
        case 2131296342:
          break;
      } 
      Z();
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
      this.A = getApplicationContext();
      Intent intent = getIntent();
      if (intent != null) {
        this.t = (EZSearchResult)intent.getParcelableExtra("contact_missed");
        this.D = intent.getIntExtra("isContact", 0);
      } 
      setContentView(2131492900);
      if (i1.f0(this.A).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      q.b().c("answered_activity");
      View view = getWindow().getDecorView();
      a a = new a();
      this(this);
      view.post(a);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    com.allinone.callerid.util.a.c((Activity)this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      Z();
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
    if (com.allinone.callerid.util.k1.b.a) {
      if (com.allinone.callerid.util.k1.b.b(getApplicationContext()))
        q.b().c("dialog_notifi_per_tip_enalbleed"); 
      com.allinone.callerid.util.k1.b.a = false;
      c0();
    } 
  }
  
  class a implements Runnable {
    a(AnsweredActivity this$0) {}
    
    public void run() {
      AnsweredActivity.O(this.b);
      AnsweredActivity.P(this.b);
      com.allinone.callerid.util.a.a((Activity)this.b);
    }
  }
  
  class b implements com.google.android.gms.ads.formats.g.a {
    b(AnsweredActivity this$0) {}
    
    public void r(com.google.android.gms.ads.formats.g param1g) {
      (com.allinone.callerid.util.gg.a.a()).b = param1g;
      Log.e("wjjj", "成功");
      Intent intent = new Intent((Context)EZCallApplication.c(), DialogMissed.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  class c extends com.google.android.gms.ads.b {
    c(AnsweredActivity this$0) {}
    
    public void D(int param1Int) {
      super.D(param1Int);
      Log.e("wjjj", "失败");
    }
    
    public void K() {
      super.K();
    }
  }
  
  class d implements com.allinone.callerid.i.a.d.b {
    d(AnsweredActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean && System.currentTimeMillis() - b1.d0() > 86400000L) {
        AnsweredActivity.Q(this.a);
      } else if (param1Boolean && i1.e(this.a.getApplicationContext()) && AnsweredActivity.R(this.a) == 0) {
        Intent intent = new Intent((Context)this.a, RecommendActivity.class);
        intent.setFlags(268435456);
        this.a.startActivity(intent);
      } 
    }
  }
  
  class e implements com.allinone.callerid.i.a.l.a {
    e(AnsweredActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        b1.O1(b1.i0() + 1);
        AnsweredActivity answeredActivity = this.a;
        AnsweredActivity.T(answeredActivity, AnsweredActivity.S(answeredActivity), "is_scam", "Scam");
        if (Build.VERSION.SDK_INT >= 23) {
          if (Settings.canDrawOverlays(AnsweredActivity.U(this.a)))
            AnsweredActivity.V(this.a); 
        } else {
          AnsweredActivity.V(this.a);
        } 
      } else {
        Toast.makeText(AnsweredActivity.U(this.a), this.a.getResources().getString(2131755653), 1).show();
      } 
    }
  }
  
  class f implements com.allinone.callerid.i.a.l.a {
    f(AnsweredActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        b1.O1(b1.i0() + 1);
        AnsweredActivity answeredActivity = this.a;
        AnsweredActivity.T(answeredActivity, AnsweredActivity.S(answeredActivity), "is_spam", "Spam");
        if (Build.VERSION.SDK_INT >= 23) {
          if (Settings.canDrawOverlays(AnsweredActivity.U(this.a)))
            AnsweredActivity.V(this.a); 
        } else {
          AnsweredActivity.V(this.a);
        } 
      } else {
        Toast.makeText(AnsweredActivity.U(this.a), this.a.getResources().getString(2131755653), 1).show();
      } 
    }
  }
  
  class g implements com.allinone.callerid.i.a.l.a {
    g(AnsweredActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        b1.O1(b1.i0() + 1);
        AnsweredActivity answeredActivity = this.a;
        AnsweredActivity.T(answeredActivity, AnsweredActivity.S(answeredActivity), "is_telemarketing", "Telemarketing");
        if (Build.VERSION.SDK_INT >= 23) {
          if (Settings.canDrawOverlays(AnsweredActivity.U(this.a)))
            AnsweredActivity.V(this.a); 
        } else {
          AnsweredActivity.V(this.a);
        } 
      } else {
        Toast.makeText(AnsweredActivity.U(this.a), this.a.getResources().getString(2131755653), 1).show();
      } 
    }
  }
  
  class h implements View.OnClickListener {
    h(AnsweredActivity this$0) {}
    
    public void onClick(View param1View) {
      if (param1View.getId() == 2131297129)
        AnsweredActivity.W(this.b).dismiss(); 
    }
  }
  
  class i implements com.allinone.callerid.i.a.e.a {
    i(AnsweredActivity this$0) {}
    
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
            stringBuilder.append(AnsweredActivity.X(this.a).getNumber());
            str2 = stringBuilder.toString();
            str1 = this.a.getResources().getString(2131755826);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.a.getResources().getString(2131755114));
            stringBuilder.append(" ");
            stringBuilder.append(AnsweredActivity.X(this.a).getNumber());
            stringBuilder.append(" ?");
            str2 = stringBuilder.toString();
            str1 = this.a.getResources().getString(2131755116);
          } 
          androidx.appcompat.app.a.a a4 = new androidx.appcompat.app.a.a();
          this((Context)this.a);
          a4 = a4.h(str2);
          b b = new b();
          this(this);
          androidx.appcompat.app.a.a a2 = a4.n(str1, b);
          String str1 = this.a.getResources().getString(2131755180);
          a a3 = new a();
          this(this);
          androidx.appcompat.app.a a1 = a2.j(str1, a3).a();
          a1.show();
          a1.g(-1).setTextColor(this.a.getResources().getColor(2131099706));
          a1.g(-2).setTextColor(this.a.getResources().getColor(2131099695));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(AnsweredActivity.i this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(AnsweredActivity.i this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        String str = AnsweredActivity.X(this.b.a).getNumber().replace("-", "");
        if (str != null && !"".equals(str))
          com.allinone.callerid.i.a.e.b.b(str, new a(this, str)); 
      }
      
      class a implements com.allinone.callerid.i.a.e.a {
        a(AnsweredActivity.i.b this$0, String param3String) {}
        
        public void a(boolean param3Boolean) {
          if (param3Boolean) {
            com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
          } else {
            EZBlackList eZBlackList = new EZBlackList();
            if (AnsweredActivity.X(this.b.b.a).getName() != null && !"".equals(AnsweredActivity.X(this.b.b.a).getName())) {
              eZBlackList.setName(AnsweredActivity.X(this.b.b.a).getName());
            } else {
              eZBlackList.setName("");
            } 
            eZBlackList.setIs_myblock("true");
            eZBlackList.setNumber(this.a);
            com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
          } 
        }
        
        class a implements com.allinone.callerid.i.a.a {
          a(AnsweredActivity.i.b.a this$0) {}
          
          public void a() {}
        }
        
        class b implements com.allinone.callerid.i.a.a {
          b(AnsweredActivity.i.b.a this$0) {}
          
          public void a() {
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
      
      class a implements com.allinone.callerid.i.a.a {
        a(AnsweredActivity.i.b this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(AnsweredActivity.i.b this$0) {}
        
        public void a() {
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
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(AnsweredActivity.i this$0, String param2String) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          if (AnsweredActivity.X(this.b.b.a).getName() != null && !"".equals(AnsweredActivity.X(this.b.b.a).getName())) {
            eZBlackList.setName(AnsweredActivity.X(this.b.b.a).getName());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setIs_myblock("true");
          eZBlackList.setNumber(this.a);
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(AnsweredActivity.i.b.a this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(AnsweredActivity.i.b.a this$0) {}
        
        public void a() {
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
    
    class a implements com.allinone.callerid.i.a.a {
      a(AnsweredActivity.i this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(AnsweredActivity.i this$0) {}
      
      public void a() {
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
  
  class a implements DialogInterface.OnClickListener {
    a(AnsweredActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(AnsweredActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      String str = AnsweredActivity.X(this.b.a).getNumber().replace("-", "");
      if (str != null && !"".equals(str))
        com.allinone.callerid.i.a.e.b.b(str, new a(this, str)); 
    }
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(AnsweredActivity.i.b this$0, String param3String) {}
      
      public void a(boolean param3Boolean) {
        if (param3Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          if (AnsweredActivity.X(this.b.b.a).getName() != null && !"".equals(AnsweredActivity.X(this.b.b.a).getName())) {
            eZBlackList.setName(AnsweredActivity.X(this.b.b.a).getName());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setIs_myblock("true");
          eZBlackList.setNumber(this.a);
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(AnsweredActivity.i.b.a this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(AnsweredActivity.i.b.a this$0) {}
        
        public void a() {
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
    
    class a implements com.allinone.callerid.i.a.a {
      a(AnsweredActivity.i.b this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(AnsweredActivity.i.b this$0) {}
      
      public void a() {
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
  
  class a implements com.allinone.callerid.i.a.e.a {
    a(AnsweredActivity this$0, String param1String) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
      } else {
        EZBlackList eZBlackList = new EZBlackList();
        if (AnsweredActivity.X(this.b.b.a).getName() != null && !"".equals(AnsweredActivity.X(this.b.b.a).getName())) {
          eZBlackList.setName(AnsweredActivity.X(this.b.b.a).getName());
        } else {
          eZBlackList.setName("");
        } 
        eZBlackList.setIs_myblock("true");
        eZBlackList.setNumber(this.a);
        com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(AnsweredActivity.i.b.a this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(AnsweredActivity.i.b.a this$0) {}
      
      public void a() {
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
  
  class a implements com.allinone.callerid.i.a.a {
    a(AnsweredActivity this$0) {}
    
    public void a() {}
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(AnsweredActivity this$0) {}
    
    public void a() {
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/AnsweredActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */