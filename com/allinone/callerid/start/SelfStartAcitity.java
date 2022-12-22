package com.allinone.callerid.start;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.k0;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.x;

public class SelfStartAcitity extends BaseActivity implements View.OnClickListener {
  private final String s = "SelfStartAcitity";
  
  private RelativeLayout t;
  
  private RelativeLayout u;
  
  private boolean v = false;
  
  private x w;
  
  private void O() {
    x x1 = new x((Context)this);
    this.w = x1;
    x1.b(new a(this));
    this.w.c();
  }
  
  public void onClick(View paramView) {
    Intent intent;
    switch (paramView.getId()) {
      default:
        return;
      case 2131296402:
        this.v = true;
        q.b().c("selfactivity_continue");
        (new h0()).b((Context)this);
      case 2131296401:
        q.b().c("selfactivity_notenable");
        b1.E2(Boolean.TRUE);
        intent = new Intent();
        intent.putExtra("isopen", false);
        setResult(111, intent);
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296400:
        q.b().c("selfactivity_enable");
        intent = new Intent();
        intent.putExtra("isopen", true);
        setResult(111, intent);
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296399:
        break;
    } 
    finish();
    overridePendingTransition(2130771968, 2130771969);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
    setContentView(2131492958);
    q.b().c("selfactivity_show");
    Typeface typeface = g1.b();
    this.t = (RelativeLayout)findViewById(2131297500);
    this.u = (RelativeLayout)findViewById(2131297536);
    TextView textView2 = (TextView)findViewById(2131297848);
    TextView textView3 = (TextView)findViewById(2131298184);
    TextView textView4 = (TextView)findViewById(2131298185);
    TextView textView5 = (TextView)findViewById(2131298109);
    TextView textView6 = (TextView)findViewById(2131298013);
    TextView textView1 = (TextView)findViewById(2131297901);
    TextView textView7 = (TextView)findViewById(2131298108);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296402);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296399);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296400);
    FrameLayout frameLayout4 = (FrameLayout)findViewById(2131296401);
    textView2.setTypeface(typeface);
    textView3.setTypeface(typeface);
    textView4.setTypeface(typeface);
    textView7.setTypeface(typeface);
    textView5.setTypeface(typeface);
    textView6.setTypeface(typeface);
    textView1.setTypeface(typeface);
    frameLayout2.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    frameLayout4.setOnClickListener(this);
    O();
  }
  
  protected void onDestroy() {
    super.onDestroy();
    x x1 = this.w;
    if (x1 != null)
      x1.d(); 
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onRestart() {
    super.onRestart();
    k0.b().c((Context)this);
    if (this.v)
      if (this.u != null) {
        RelativeLayout relativeLayout = this.t;
        if (relativeLayout != null)
          relativeLayout.setVisibility(8); 
        this.u.setVisibility(0);
        q.b().c("selfactivity_second_show");
      } else {
        Intent intent = new Intent();
        intent.setClass((Context)this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
        finish();
      }  
  }
  
  protected void onResume() {
    super.onResume();
    k0.b().c((Context)this);
  }
  
  class a implements x.b {
    a(SelfStartAcitity this$0) {}
    
    public void a() {
      k0.b().c(this.a.getApplicationContext());
    }
    
    public void b() {
      k0.b().c(this.a.getApplicationContext());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/SelfStartAcitity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */