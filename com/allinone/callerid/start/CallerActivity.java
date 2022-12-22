package com.allinone.callerid.start;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import java.lang.ref.WeakReference;

public class CallerActivity extends BaseActivity {
  private final String s = "CallerActivity";
  
  private Typeface t;
  
  private RadioButton u;
  
  private RadioButton v;
  
  private RadioButton w;
  
  private RadioButton x;
  
  private RadioButton y;
  
  private void T() {
    TextView textView1 = (TextView)findViewById(2131297838);
    TextView textView2 = (TextView)findViewById(2131297839);
    TextView textView3 = (TextView)findViewById(2131297903);
    TextView textView4 = (TextView)findViewById(2131297864);
    TextView textView5 = (TextView)findViewById(2131298012);
    TextView textView6 = (TextView)findViewById(2131298133);
    ((TextView)findViewById(2131298011)).setTypeface(this.t);
    textView5.setTypeface(this.t);
    textView6.setTypeface(this.t);
    ((TextView)findViewById(2131298132)).setTypeface(this.t);
    ((TextView)findViewById(2131298133)).setTypeface(this.t);
    ((TextView)findViewById(2131297974)).setTypeface(this.t);
    TextView textView7 = (TextView)findViewById(2131298194);
    TextView textView8 = (TextView)findViewById(2131298195);
    this.w = (RadioButton)findViewById(2131297405);
    TextView textView9 = (TextView)findViewById(2131297827);
    TextView textView10 = (TextView)findViewById(2131297828);
    this.x = (RadioButton)findViewById(2131297389);
    TextView textView11 = (TextView)findViewById(2131297882);
    TextView textView12 = (TextView)findViewById(2131297884);
    this.y = (RadioButton)findViewById(2131297391);
    ((TextView)findViewById(2131298045)).setTypeface(this.t);
    textView7.setTypeface(this.t);
    textView8.setTypeface(this.t);
    textView9.setTypeface(this.t);
    textView10.setTypeface(this.t);
    textView11.setTypeface(this.t);
    textView12.setTypeface(this.t);
    textView5.setOnClickListener(new i(this));
    textView6.setOnClickListener(new j(this));
    Switch switch_1 = (Switch)findViewById(2131297693);
    if (b1.u0()) {
      switch_1.setChecked(true);
    } else {
      switch_1.setChecked(false);
    } 
    Switch switch_2 = (Switch)findViewById(2131297694);
    if (b1.v0()) {
      switch_2.setChecked(true);
    } else {
      switch_2.setChecked(false);
    } 
    Switch switch_3 = (Switch)findViewById(2131297699);
    switch_3.setOnCheckedChangeListener(new k(this));
    if (b1.q2().booleanValue()) {
      switch_3.setChecked(true);
    } else {
      switch_3.setChecked(false);
    } 
    switch_3 = (Switch)findViewById(2131297706);
    switch_3.setOnCheckedChangeListener(new l(this));
    if (b1.z2().booleanValue()) {
      switch_3.setChecked(true);
    } else {
      switch_3.setChecked(false);
    } 
    switch_3 = (Switch)findViewById(2131297704);
    if (b1.n0()) {
      switch_3.setChecked(true);
    } else {
      switch_3.setChecked(false);
    } 
    switch_1.setOnCheckedChangeListener(new m(this));
    switch_2.setOnCheckedChangeListener(new n(this));
    switch_3.setOnCheckedChangeListener(new o(this));
    this.u = (RadioButton)findViewById(2131297396);
    this.v = (RadioButton)findViewById(2131297404);
    int i = b1.x0();
    if (i != 0) {
      if (i == 1) {
        this.v.setChecked(true);
        this.u.setChecked(false);
      } 
    } else {
      this.u.setChecked(true);
      this.v.setChecked(false);
    } 
    this.u.setOnCheckedChangeListener(new p(this));
    this.v.setOnCheckedChangeListener(new a(this));
    i = b1.a0();
    if (i != -1) {
      if (i != 0) {
        if (i == 1) {
          this.y.setChecked(false);
          this.w.setChecked(false);
          this.x.setChecked(true);
        } 
      } else {
        this.y.setChecked(false);
        this.w.setChecked(true);
        this.x.setChecked(false);
      } 
    } else {
      this.y.setChecked(true);
      this.w.setChecked(false);
      this.x.setChecked(false);
    } 
    this.w.setOnCheckedChangeListener(new b(this));
    this.x.setOnCheckedChangeListener(new c(this));
    this.y.setOnCheckedChangeListener(new d(this));
    textView8.setOnClickListener(new e(this));
    textView10.setOnClickListener(new f(this));
    textView12.setOnClickListener(new g(this));
    textView8 = (TextView)findViewById(2131297933);
    textView12 = (TextView)findViewById(2131298034);
    textView8.setTypeface(this.t);
    textView12.setTypeface(this.t);
    textView8 = (TextView)findViewById(2131298151);
    textView3.setTypeface(this.t);
    textView4.setTypeface(this.t);
    textView1.setTypeface(this.t);
    textView2.setTypeface(this.t);
    textView8.setTypeface(this.t);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492907);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.t = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");
    ImageView imageView = (ImageView)findViewById(2131297116);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new h(this));
    T();
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
  
  class a implements CompoundButton.OnCheckedChangeListener {
    a(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.e2(1);
        CallerActivity.P(this.a).setChecked(false);
      } else {
        b1.e2(0);
        CallerActivity.P(this.a).setChecked(true);
      } 
    }
  }
  
  class b implements CompoundButton.OnCheckedChangeListener {
    b(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        (j0.a()).b.execute(new CallerActivity.s(this.a));
        CallerActivity.Q(this.a).setChecked(false);
        CallerActivity.R(this.a).setChecked(false);
      } 
    }
  }
  
  class c implements CompoundButton.OnCheckedChangeListener {
    c(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        (j0.a()).b.execute(new CallerActivity.q(this.a));
        CallerActivity.S(this.a).setChecked(false);
        CallerActivity.R(this.a).setChecked(false);
      } 
    }
  }
  
  class d implements CompoundButton.OnCheckedChangeListener {
    d(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        (j0.a()).b.execute(new CallerActivity.r(this.a));
        CallerActivity.Q(this.a).setChecked(false);
        CallerActivity.S(this.a).setChecked(false);
      } 
    }
  }
  
  class e implements View.OnClickListener {
    e(CallerActivity this$0) {}
    
    public void onClick(View param1View) {
      if (CallerActivity.P(this.b).isChecked()) {
        this.b.startActivity(new Intent((Context)this.b, PreviewTopBigActivity.class));
      } else {
        this.b.startActivity(new Intent((Context)this.b, PreviewTopSmallActivity.class));
      } 
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class f implements View.OnClickListener {
    f(CallerActivity this$0) {}
    
    public void onClick(View param1View) {
      if (CallerActivity.P(this.b).isChecked()) {
        this.b.startActivity(new Intent((Context)this.b, PreviewBottomBigActivity.class));
      } else {
        this.b.startActivity(new Intent((Context)this.b, PreviewBottomSmallActivity.class));
      } 
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class g implements View.OnClickListener {
    g(CallerActivity this$0) {}
    
    public void onClick(View param1View) {
      if (CallerActivity.P(this.b).isChecked()) {
        this.b.startActivity(new Intent((Context)this.b, PreviewNormalActivity.class));
      } else {
        this.b.startActivity(new Intent((Context)this.b, PreviewSimpleActivity.class));
      } 
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class h implements View.OnClickListener {
    h(CallerActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class i implements View.OnClickListener {
    i(CallerActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.startActivity(new Intent((Context)this.b, PreviewNormalActivity.class));
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class j implements View.OnClickListener {
    j(CallerActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.startActivity(new Intent((Context)this.b, PreviewSimpleActivity.class));
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class k implements CompoundButton.OnCheckedChangeListener {
    k(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.H2(Boolean.TRUE);
      } else {
        b1.H2(Boolean.FALSE);
      } 
    }
  }
  
  class l implements CompoundButton.OnCheckedChangeListener {
    l(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.S2(Boolean.TRUE);
      } else {
        b1.S2(Boolean.FALSE);
      } 
    }
  }
  
  class m implements CompoundButton.OnCheckedChangeListener {
    m(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.util.q.b().c("open_xuanfu_unknow");
        b1.b2(true);
      } else {
        com.allinone.callerid.util.q.b().c("close_xuanfu_unknow");
        b1.b2(false);
      } 
    }
  }
  
  class n implements CompoundButton.OnCheckedChangeListener {
    n(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.util.q.b().c("open_xuanfu_contact");
        b1.c2(true);
      } else {
        com.allinone.callerid.util.q.b().c("close_xuanfu_contact");
        b1.c2(false);
      } 
    }
  }
  
  class o implements CompoundButton.OnCheckedChangeListener {
    o(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.util.q.b().c("open_xuanfu_missed");
        b1.T1(true);
      } else {
        com.allinone.callerid.util.q.b().c("close_xuanfu_missed");
        b1.T1(false);
      } 
    }
  }
  
  class p implements CompoundButton.OnCheckedChangeListener {
    p(CallerActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.e2(0);
        CallerActivity.O(this.a).setChecked(false);
      } else {
        b1.e2(1);
        CallerActivity.O(this.a).setChecked(true);
      } 
    }
  }
  
  private static class q implements Runnable {
    final WeakReference<CallerActivity> b;
    
    q(CallerActivity param1CallerActivity) {
      this.b = new WeakReference<CallerActivity>(param1CallerActivity);
    }
    
    public void run() {
      CallerActivity callerActivity = this.b.get();
      if (callerActivity != null && !callerActivity.isFinishing()) {
        b1.G1(1);
        b1.k2(1000);
      } 
    }
  }
  
  private static class r implements Runnable {
    final WeakReference<CallerActivity> b;
    
    r(CallerActivity param1CallerActivity) {
      this.b = new WeakReference<CallerActivity>(param1CallerActivity);
    }
    
    public void run() {
      CallerActivity callerActivity = this.b.get();
      if (callerActivity != null && !callerActivity.isFinishing()) {
        b1.G1(-1);
        com.allinone.callerid.util.d.g(callerActivity.getApplicationContext());
      } 
    }
  }
  
  private static class s implements Runnable {
    final WeakReference<CallerActivity> b;
    
    s(CallerActivity param1CallerActivity) {
      this.b = new WeakReference<CallerActivity>(param1CallerActivity);
    }
    
    public void run() {
      CallerActivity callerActivity = this.b.get();
      if (callerActivity != null && !callerActivity.isFinishing()) {
        b1.G1(0);
        b1.k2(0);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/CallerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */