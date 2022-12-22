package com.allinone.callerid.mvc.controller.guidep;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.dialog.DialogMissed;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.u;
import java.util.ArrayList;
import java.util.List;

public class MissedCallActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "MissedCallActivity";
  
  private List<EZSearchResult> t = new ArrayList<EZSearchResult>();
  
  private TextView u;
  
  private int v;
  
  private int w;
  
  private void S() {
    q.b().c("missed_request_num");
    com.google.android.gms.ads.d.a a = new com.google.android.gms.ads.d.a((Context)EZCallApplication.c(), "ca-app-pub-5825926894918682/7437588851");
    a.e(new e(this));
    u u = (new u.a()).b(true).a();
    a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
    a.f(new f(this)).a().b((new com.google.android.gms.ads.e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
  }
  
  private void T() {
    List<EZSearchResult> list = this.t;
    if (list != null) {
      int i = list.size();
      boolean bool = true;
      if (i > 1) {
        String str = ((EZSearchResult)this.t.get(0)).getNumber();
        byte b = 1;
        while (true) {
          i = bool;
          if (b < this.t.size()) {
            if (!str.equals(((EZSearchResult)this.t.get(b)).getNumber())) {
              i = 0;
              break;
            } 
            b++;
            continue;
          } 
          break;
        } 
        if (this.v > 0)
          if (i != 0) {
            String str2 = ((EZSearchResult)this.t.get(0)).getFormat_tel_number();
            String str1 = str;
            if (str2 != null) {
              str1 = str;
              if (!"".equals(str2))
                str1 = str2; 
            } 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str1);
            stringBuilder.append(" (");
            stringBuilder.append(this.v);
            stringBuilder.append(")");
            str1 = stringBuilder.toString();
            this.u.setText((CharSequence)Html.fromHtml(str1));
          } else {
            String str1 = getResources().getString(2131755470);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<font color='#EE5164'>");
            stringBuilder.append(this.v);
            stringBuilder.append("</font>");
            String str2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(" ");
            stringBuilder.append(str1);
            str1 = stringBuilder.toString();
            this.u.setText((CharSequence)Html.fromHtml(str1));
          }  
      } 
    } 
  }
  
  private void U() {
    if (System.currentTimeMillis() - b1.d0() > 86400000L) {
      com.allinone.callerid.i.a.d.a.a(new c(this));
    } else if (System.currentTimeMillis() - b1.e0() > 86400000L && b1.f0() == 2) {
      Intent intent = new Intent((Context)this, MainActivity.class);
      intent.setFlags(268435456);
      startActivity(intent);
      (j0.a()).b.execute(new d(this));
    } 
  }
  
  private void u() {
    Typeface typeface = g1.b();
    ImageView imageView = (ImageView)findViewById(2131297122);
    this.u = (TextView)findViewById(2131297971);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296736);
    imageView.setOnClickListener(this);
    frameLayout.setOnClickListener(this);
    ((RelativeLayout)findViewById(2131296346)).setOnClickListener(this);
    ((TextView)findViewById(2131298183)).setTypeface(typeface);
    ((TextView)findViewById(2131297889)).setTypeface(typeface);
    ((TextView)findViewById(2131297977)).setTypeface(typeface);
    this.u.setTypeface(typeface);
  }
  
  public void onClick(View paramView) {
    try {
      int i = paramView.getId();
      if (i != 2131296346) {
        if (i != 2131296736) {
          if (i == 2131297122) {
            q.b().c("missed_close");
            U();
            finish();
            overridePendingTransition(2130771968, 2130771969);
          } 
        } else {
          q.b().c("misscall_more_pdtclick");
          Intent intent = new Intent();
          this((Context)this, MainActivity.class);
          intent.setFlags(268435456);
          startActivity(intent);
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } 
      } else {
        U();
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      Intent intent = getIntent();
      if (intent != null) {
        paramBundle = intent.getExtras();
        if (paramBundle != null) {
          this.t = paramBundle.getParcelableArrayList("contact_missed");
          this.v = paramBundle.getInt("unreadkey");
          this.w = intent.getIntExtra("isContact", 0);
        } 
      } 
      setContentView(2131493009);
      View view = getWindow().getDecorView();
      a a = new a();
      this(this);
      view.post(a);
      q.b().c("misscall_more_show");
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    (j0.a()).b.execute(new b(this));
    com.allinone.callerid.util.a.c((Activity)this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      U();
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
  
  class a implements Runnable {
    a(MissedCallActivity this$0) {}
    
    public void run() {
      MissedCallActivity.O(this.b);
      MissedCallActivity.P(this.b);
      com.allinone.callerid.util.a.a((Activity)this.b);
    }
  }
  
  class b implements Runnable {
    b(MissedCallActivity this$0) {}
    
    public void run() {
      if (MissedCallActivity.Q(this.b) == 0 && System.currentTimeMillis() - b1.e0() > 86400000L)
        b1.L1(b1.f0() + 1); 
    }
  }
  
  class c implements com.allinone.callerid.i.a.d.b {
    c(MissedCallActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean)
        MissedCallActivity.R(this.a); 
    }
  }
  
  class d implements Runnable {
    d(MissedCallActivity this$0) {}
    
    public void run() {
      b1.K1(System.currentTimeMillis());
      b1.L1(0);
    }
  }
  
  class e implements g.a {
    e(MissedCallActivity this$0) {}
    
    public void r(g param1g) {
      (com.allinone.callerid.util.gg.a.a()).b = param1g;
      Log.e("wjjj", "成功");
      Intent intent = new Intent((Context)EZCallApplication.c(), DialogMissed.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  class f extends com.google.android.gms.ads.b {
    f(MissedCallActivity this$0) {}
    
    public void D(int param1Int) {
      super.D(param1Int);
      Log.e("wjjj", "失败");
    }
    
    public void K() {
      super.K();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/guidep/MissedCallActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */