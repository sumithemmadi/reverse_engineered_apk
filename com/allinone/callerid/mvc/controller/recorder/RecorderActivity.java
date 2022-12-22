package com.allinone.callerid.mvc.controller.recorder;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.b.z.h;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.CustomViewPager;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.view.recorder.LTabIndicator;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class RecorderActivity extends BaseActivity implements View.OnClickListener {
  private StrangerRecordFragment s;
  
  private a t;
  
  private Boolean u;
  
  private Boolean v;
  
  private boolean w;
  
  private void P() {
    ((NotificationManager)EZCallApplication.c().getSystemService("notification")).cancel(9707);
  }
  
  private void Q() {
    startActivity(new Intent((Context)this, RecordSetting.class));
    overridePendingTransition(2130771968, 2130771969);
  }
  
  private void R() {
    ImageView imageView1 = (ImageView)findViewById(2131297431);
    TextView textView = (TextView)findViewById(2131297435);
    ImageView imageView2 = (ImageView)findViewById(2131297432);
    LTabIndicator lTabIndicator = (LTabIndicator)findViewById(2131297434);
    if (this.u.booleanValue() && this.v.booleanValue())
      U(); 
    lTabIndicator.p = d1.a((Context)this, 2130968868, 2131099727);
    lTabIndicator.o = d1.a((Context)this, 2130968901, 2131099742);
    lTabIndicator.setIndicatorColor(d1.a((Context)this, 2130968901, 2131099742));
    lTabIndicator.z = 16;
    lTabIndicator.q = 0;
    CustomViewPager customViewPager = (CustomViewPager)findViewById(2131297436);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView1.setImageResource(2131231059); 
    textView.setTypeface(g1.b());
    imageView1.setOnClickListener(this);
    imageView2.setOnClickListener(this);
    h h = new h(s());
    this.s = new StrangerRecordFragment();
    this.t = new a();
    h.y(this.s, getString(2131755682));
    h.y(this.t, getString(2131755820));
    customViewPager.setAdapter((androidx.viewpager.widget.a)h);
    lTabIndicator.setViewPager((ViewPager)customViewPager);
  }
  
  public void S() {
    a a1 = this.t;
    if (a1 != null)
      a1.V1(); 
    StrangerRecordFragment strangerRecordFragment = this.s;
    if (strangerRecordFragment != null)
      strangerRecordFragment.Z1(); 
  }
  
  public void T() {
    if (this.u.booleanValue() && com.allinone.callerid.util.recorder.b.e()) {
      q.b().c("record_setting_guide");
      U();
    } 
  }
  
  public void U() {
    Dialog dialog = new Dialog((Context)this, 2131821097);
    dialog.setContentView(2131493153);
    LinearLayout linearLayout = (LinearLayout)dialog.findViewById(2131297203);
    View view = dialog.findViewById(2131298250);
    dialog.show();
    Window window = dialog.getWindow();
    if (window != null) {
      window.getDecorView().setPadding(0, 0, 0, 0);
      WindowManager.LayoutParams layoutParams = window.getAttributes();
      layoutParams.width = -1;
      layoutParams.height = -1;
      window.setAttributes(layoutParams);
    } 
    linearLayout.setOnClickListener(new a(this, dialog));
    view.setOnClickListener(new b(this, dialog));
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297432:
        com.allinone.callerid.util.recorder.b.l(Boolean.FALSE);
        Q();
      case 2131297431:
        break;
    } 
    com.allinone.callerid.util.recorder.b.l(Boolean.FALSE);
    if (this.w)
      startActivity(new Intent((Context)this, MainActivity.class)); 
    finish();
    overridePendingTransition(2130771968, 2130771969);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492949);
    if (com.allinone.callerid.util.recorder.b.c().booleanValue()) {
      this.u = Boolean.TRUE;
    } else {
      this.u = Boolean.FALSE;
    } 
    if (getIntent() != null) {
      if (getIntent().getBooleanExtra("record_success", false)) {
        this.w = true;
        q.b().c("record_push_click");
        if (d0.a)
          d0.a("recorder", "record_success"); 
        P();
      } 
      if (getIntent().getBooleanExtra("record_success_upload", false)) {
        q.b().c("record_success_upload");
        if (d0.a)
          d0.a("recorder", "record_success_upload"); 
        P();
      } 
    } 
    if (com.allinone.callerid.util.recorder.b.e()) {
      this.v = Boolean.TRUE;
    } else {
      this.v = Boolean.FALSE;
    } 
    R();
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      com.allinone.callerid.util.recorder.b.l(Boolean.FALSE);
      if (this.w) {
        startActivity(new Intent((Context)this, MainActivity.class));
      } else {
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  class a implements View.OnClickListener {
    a(RecorderActivity this$0, Dialog param1Dialog) {}
    
    public void onClick(View param1View) {
      this.b.dismiss();
    }
  }
  
  class b implements View.OnClickListener {
    b(RecorderActivity this$0, Dialog param1Dialog) {}
    
    public void onClick(View param1View) {
      this.b.dismiss();
      q.b().c("record_setting_guide_click");
      RecorderActivity.O(this.c);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recorder/RecorderActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */