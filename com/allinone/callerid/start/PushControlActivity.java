package com.allinone.callerid.start;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class PushControlActivity extends BaseActivity {
  private final String s = "PushControlActivity";
  
  private Typeface t;
  
  private Switch u;
  
  private boolean v;
  
  private void R() {
    ImageView imageView = (ImageView)findViewById(2131297116);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new a(this));
    Switch switch_ = (Switch)findViewById(2131297703);
    switch_.setOnCheckedChangeListener(new b(this));
    if (b1.v2().booleanValue()) {
      switch_.setChecked(true);
    } else {
      switch_.setChecked(false);
    } 
    switch_ = (Switch)findViewById(2131297690);
    switch_.setOnCheckedChangeListener(new c(this));
    if (b1.m2().booleanValue()) {
      switch_.setChecked(true);
    } else {
      switch_.setChecked(false);
    } 
    View view = findViewById(2131298242);
    RelativeLayout relativeLayout = (RelativeLayout)findViewById(2131297519);
    if (Build.VERSION.SDK_INT > 25) {
      view.setVisibility(0);
      relativeLayout.setVisibility(0);
      ((TextView)findViewById(2131297814)).setTypeface(this.t);
      ((TextView)findViewById(2131298017)).setTypeface(this.t);
      this.u = (Switch)findViewById(2131297705);
      if (b1.p0()) {
        this.u.setChecked(true);
      } else {
        this.u.setChecked(false);
      } 
      this.u.setOnCheckedChangeListener(new d(this));
    } else {
      view.setVisibility(8);
      relativeLayout.setVisibility(8);
    } 
    TextView textView2 = (TextView)findViewById(2131298051);
    TextView textView3 = (TextView)findViewById(2131297972);
    TextView textView1 = (TextView)findViewById(2131297814);
    textView2.setTypeface(this.t);
    textView3.setTypeface(this.t);
    textView1.setTypeface(this.t);
  }
  
  private void S() {
    try {
      com.allinone.callerid.dialog.e e = new com.allinone.callerid.dialog.e();
      this((Context)this, 2131820783);
      e.setCanceledOnTouchOutside(false);
      e e1 = new e();
      this(this);
      e.setOnDismissListener(e1);
      e.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492944);
    this.t = g1.b();
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    R();
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
    if (com.allinone.callerid.util.k1.b.a) {
      if (com.allinone.callerid.util.k1.b.b(getApplicationContext()))
        q.b().c("dialog_notifi_per_quest_enalbleed"); 
      com.allinone.callerid.util.k1.b.a = false;
    } 
    if (this.v) {
      this.v = false;
      if (com.allinone.callerid.util.k1.b.b(getApplicationContext())) {
        this.u.setChecked(false);
        b1.V1(false);
      } else {
        this.u.setChecked(true);
      } 
    } 
  }
  
  class a implements View.OnClickListener {
    a(PushControlActivity this$0) {}
    
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
  
  class b implements CompoundButton.OnCheckedChangeListener {
    b(PushControlActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.N2(Boolean.TRUE);
      } else {
        b1.N2(Boolean.FALSE);
      } 
    }
  }
  
  class c implements CompoundButton.OnCheckedChangeListener {
    c(PushControlActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.C2(Boolean.TRUE);
      } else {
        b1.C2(Boolean.FALSE);
      } 
    }
  }
  
  class d implements CompoundButton.OnCheckedChangeListener {
    d(PushControlActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        try {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("checked：");
            stringBuilder.append(param1Boolean);
            d0.a("wbb", stringBuilder.toString());
          } 
          (EZCallApplication.c()).g = true;
          b1.V1(true);
          Intent intent = new Intent();
          this("com.allinone.callerid.CHANGE_NOTIFI");
          b.p.a.a.b(this.a.getApplicationContext()).d(intent);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("checked：");
          stringBuilder.append(param1Boolean);
          d0.a("wbb", stringBuilder.toString());
        } 
        if (!com.allinone.callerid.util.k1.b.d(this.a.getApplicationContext())) {
          PushControlActivity.O(this.a, true);
          PushControlActivity.P(this.a);
        } else {
          (EZCallApplication.c()).g = false;
          b1.V1(false);
          Intent intent = new Intent();
          this("com.allinone.callerid.CHANGE_NOTIFI");
          b.p.a.a.b(this.a.getApplicationContext()).d(intent);
        } 
      } 
    }
  }
  
  class e implements DialogInterface.OnDismissListener {
    e(PushControlActivity this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      if (d0.a) {
        d0.a("wbb", "onDismiss");
        PushControlActivity.Q(this.b).setChecked(true);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/PushControlActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */