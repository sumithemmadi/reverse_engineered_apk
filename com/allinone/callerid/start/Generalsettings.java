package com.allinone.callerid.start;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class Generalsettings extends BaseActivity implements View.OnClickListener {
  private FrameLayout A;
  
  private TextView B;
  
  private TextView C;
  
  private Switch D;
  
  private final String s = "Generalsettings";
  
  private Typeface t;
  
  private Switch u;
  
  private Switch v;
  
  private TextView w;
  
  private RadioButton x;
  
  private RadioButton y;
  
  private RadioButton z;
  
  @TargetApi(22)
  private void T() {
    View view = LayoutInflater.from((Context)this).inflate(2131492972, null, false);
    this.x = (RadioButton)view.findViewById(2131297386);
    this.y = (RadioButton)view.findViewById(2131297387);
    this.z = (RadioButton)view.findViewById(2131297388);
    AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
    builder.setCancelable(true);
    builder.setTitle(getResources().getString(2131755696));
    builder.setView(view);
    builder.show();
    int i = b1.q();
    if (i != -1) {
      if (i != 0) {
        if (i == 1) {
          this.x.setChecked(false);
          this.y.setChecked(true);
          this.z.setChecked(false);
        } 
      } else {
        this.x.setChecked(true);
        this.y.setChecked(false);
        this.z.setChecked(false);
      } 
    } else {
      this.x.setChecked(false);
      this.y.setChecked(false);
      this.z.setChecked(true);
    } 
    this.x.setOnCheckedChangeListener(new e(this));
    this.y.setOnCheckedChangeListener(new f(this));
    this.z.setOnCheckedChangeListener(new g(this));
  }
  
  private void U() {
    TextView textView1 = (TextView)findViewById(2131298193);
    TextView textView2 = (TextView)findViewById(2131297777);
    TextView textView3 = (TextView)findViewById(2131297871);
    TextView textView4 = (TextView)findViewById(2131297870);
    TextView textView5 = (TextView)findViewById(2131298027);
    TextView textView6 = (TextView)findViewById(2131298028);
    ((TextView)findViewById(2131298020)).setTypeface(g1.b());
    ((TextView)findViewById(2131298019)).setTypeface(g1.b());
    long l = b1.m();
    if (l == 0L) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getResources().getString(2131755431));
      stringBuilder.append(" ");
      stringBuilder.append(i.f(System.currentTimeMillis()));
      textView6.setText(stringBuilder.toString());
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getResources().getString(2131755431));
      stringBuilder.append(" ");
      stringBuilder.append(i.f(l));
      textView6.setText(stringBuilder.toString());
    } 
    TextView textView7 = (TextView)findViewById(2131298173);
    TextView textView8 = (TextView)findViewById(2131298046);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296856);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296870);
    frameLayout2 = (FrameLayout)findViewById(2131296732);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296765);
    FrameLayout frameLayout4 = (FrameLayout)findViewById(2131296771);
    this.A = (FrameLayout)findViewById(2131296801);
    this.B = (TextView)findViewById(2131298179);
    this.C = (TextView)findViewById(2131298180);
    this.D = (Switch)findViewById(2131297710);
    if (b1.z0()) {
      this.D.setChecked(true);
    } else {
      this.D.setChecked(false);
    } 
    this.D.setOnCheckedChangeListener(new b(this));
    frameLayout4.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    textView7.setOnClickListener(this);
    textView8.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    this.A.setOnClickListener(this);
    frameLayout1 = (FrameLayout)findViewById(2131296783);
    View view = findViewById(2131297585);
    this.w = (TextView)findViewById(2131298129);
    if (c1.h(getApplicationContext())) {
      frameLayout1.setVisibility(0);
      view.setVisibility(0);
      frameLayout1.setOnClickListener(this);
      int i = b1.q();
      if (i != -1) {
        if (i != 0) {
          if (i == 1) {
            this.w.setText(getResources().getString(2131755182));
            q.b().c(h1.o);
          } 
        } else {
          this.w.setText(getResources().getString(2131755181));
          q.b().c(h1.n);
        } 
      } else {
        this.w.setText(getResources().getString(2131755743));
        q.b().c(h1.p);
      } 
    } else {
      frameLayout1.setVisibility(8);
      view.setVisibility(8);
    } 
    this.u = (Switch)findViewById(2131297695);
    if (b1.l0()) {
      this.u.setChecked(true);
    } else {
      this.u.setChecked(false);
    } 
    this.u.setOnCheckedChangeListener(new c(this));
    this.v = (Switch)findViewById(2131297705);
    if (b1.r0()) {
      this.v.setChecked(true);
    } else {
      this.v.setChecked(false);
    } 
    this.v.setOnCheckedChangeListener(new d(this));
    TextView textView9 = (TextView)findViewById(2131298049);
    TextView textView10 = (TextView)findViewById(2131298050);
    textView9.setTypeface(this.t);
    textView10.setTypeface(this.t);
    textView1.setTypeface(this.t);
    textView3.setTypeface(this.t);
    textView4.setTypeface(this.t);
    textView2.setTypeface(this.t);
    textView7.setTypeface(this.t);
    textView8.setTypeface(this.t);
    textView5.setTypeface(this.t);
    textView6.setTypeface(this.t);
    this.B.setTypeface(this.t);
    this.C.setTypeface(this.t);
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131298173:
        try {
          Intent intent = new Intent();
          this();
          intent.setAction("android.intent.action.VIEW");
          intent.setData(Uri.parse("https://www.show-caller.com/terms.html"));
          if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            overridePendingTransition(2130771968, 2130771969);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131298046:
        try {
          Intent intent = new Intent();
          this();
          intent.setAction("android.intent.action.VIEW");
          intent.setData(Uri.parse("https://www.show-caller.com/privacy.html"));
          if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            overridePendingTransition(2130771968, 2130771969);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296856:
        startActivity(new Intent((Context)this, AboutActivity.class));
        overridePendingTransition(2130771968, 2130771969);
      case 2131296801:
        if (this.D.isChecked()) {
          b1.g2(false);
          this.D.setChecked(false);
        } else {
          b1.g2(true);
          this.D.setChecked(true);
        } 
      case 2131296783:
        T();
      case 2131296771:
        startActivity(new Intent((Context)this, PushControlActivity.class));
        overridePendingTransition(2130771968, 2130771969);
      case 2131296765:
        if (this.v.isChecked()) {
          b1.X1(false);
          this.v.setChecked(false);
        } else {
          b1.X1(true);
          this.v.setChecked(true);
        } 
      case 2131296732:
        break;
    } 
    if (this.u.isChecked()) {
      b1.R1(false);
      this.u.setChecked(false);
    } 
    b1.R1(true);
    this.u.setChecked(true);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492925);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.t = g1.b();
    ImageView imageView = (ImageView)findViewById(2131297125);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new a(this));
    U();
  }
  
  protected void onDestroy() {
    super.onDestroy();
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
    a(Generalsettings this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class b implements CompoundButton.OnCheckedChangeListener {
    b(Generalsettings this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.g2(true);
        if (i1.i0(this.a.getApplicationContext())) {
          if (b1.A2() == 0)
            Generalsettings.O(this.a).postDelayed(new a(this), 350L); 
        } else if (b1.A2() == 1) {
          Generalsettings.O(this.a).postDelayed(new b(this), 350L);
        } 
      } else {
        b1.g2(false);
      } 
    }
    
    class a implements Runnable {
      a(Generalsettings.b this$0) {}
      
      public void run() {
        try {
          this.b.a.finish();
          EZCallApplication.c().e();
          Intent intent = new Intent();
          this((Context)this.b.a, StartActivity.class);
          intent.addFlags(268435456);
          this.b.a.startActivity(intent);
          Process.killProcess(Process.myPid());
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
    
    class b implements Runnable {
      b(Generalsettings.b this$0) {}
      
      public void run() {
        try {
          this.b.a.finish();
          EZCallApplication.c().e();
          Intent intent = new Intent();
          this((Context)this.b.a, StartActivity.class);
          intent.addFlags(268435456);
          this.b.a.startActivity(intent);
          Process.killProcess(Process.myPid());
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(Generalsettings this$0) {}
    
    public void run() {
      try {
        this.b.a.finish();
        EZCallApplication.c().e();
        Intent intent = new Intent();
        this((Context)this.b.a, StartActivity.class);
        intent.addFlags(268435456);
        this.b.a.startActivity(intent);
        Process.killProcess(Process.myPid());
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b implements Runnable {
    b(Generalsettings this$0) {}
    
    public void run() {
      try {
        this.b.a.finish();
        EZCallApplication.c().e();
        Intent intent = new Intent();
        this((Context)this.b.a, StartActivity.class);
        intent.addFlags(268435456);
        this.b.a.startActivity(intent);
        Process.killProcess(Process.myPid());
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class c implements CompoundButton.OnCheckedChangeListener {
    c(Generalsettings this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.R1(true);
      } else {
        b1.R1(false);
      } 
    }
  }
  
  class d implements CompoundButton.OnCheckedChangeListener {
    d(Generalsettings this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.X1(true);
      } else {
        b1.X1(false);
      } 
    }
  }
  
  class e implements CompoundButton.OnCheckedChangeListener {
    e(Generalsettings this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.U0(0);
        b1.m1(true);
        Generalsettings.P(this.a).setChecked(true);
        Generalsettings.Q(this.a).setChecked(false);
        Generalsettings.R(this.a).setChecked(false);
        Generalsettings.S(this.a).setText(this.a.getResources().getString(2131755181));
      } else {
        Generalsettings.P(this.a).setChecked(false);
      } 
    }
  }
  
  class f implements CompoundButton.OnCheckedChangeListener {
    f(Generalsettings this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.U0(1);
        b1.m1(true);
        Generalsettings.Q(this.a).setChecked(true);
        Generalsettings.P(this.a).setChecked(false);
        Generalsettings.R(this.a).setChecked(false);
        Generalsettings.S(this.a).setText(this.a.getResources().getString(2131755182));
      } else {
        Generalsettings.Q(this.a).setChecked(false);
      } 
    }
  }
  
  class g implements CompoundButton.OnCheckedChangeListener {
    g(Generalsettings this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b1.U0(-1);
        b1.m1(false);
        Generalsettings.R(this.a).setChecked(true);
        Generalsettings.P(this.a).setChecked(false);
        Generalsettings.Q(this.a).setChecked(false);
        Generalsettings.S(this.a).setText(this.a.getResources().getString(2131755743));
      } else {
        Generalsettings.R(this.a).setChecked(false);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/Generalsettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */