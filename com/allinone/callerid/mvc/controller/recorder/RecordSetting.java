package com.allinone.callerid.mvc.controller.recorder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.mvc.view.recorder.ExpandLayout;
import com.allinone.callerid.start.CommonSetting;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class RecordSetting extends BaseActivity implements View.OnClickListener {
  private ExpandLayout A;
  
  private ConstraintLayout B;
  
  private CheckBox C;
  
  private ConstraintLayout D;
  
  private CheckBox E;
  
  private ConstraintLayout F;
  
  private FrameLayout G;
  
  private TextView H;
  
  private Switch I;
  
  private final String s = "RecordSetting";
  
  private Switch t;
  
  private FrameLayout u;
  
  private Typeface v;
  
  private FrameLayout w;
  
  private ConstraintLayout x;
  
  private TextView y;
  
  private ImageView z;
  
  private void f0() {
    if (com.allinone.callerid.util.recorder.b.f()) {
      com.allinone.callerid.util.recorder.b.n(true);
      g0();
    } else {
      AlertDialog alertDialog = com.allinone.callerid.util.recorder.f.p((Activity)this, null);
      if (alertDialog != null)
        alertDialog.setOnDismissListener(new h(this)); 
    } 
  }
  
  private void g0() {
    if (com.allinone.callerid.util.recorder.b.e()) {
      this.t.setChecked(true);
      this.u.setAlpha(1.0F);
      this.u.setClickable(true);
      this.w.setAlpha(1.0F);
      this.x.setAlpha(1.0F);
      this.x.setClickable(true);
      this.B.setAlpha(1.0F);
      this.B.setClickable(true);
      this.D.setAlpha(1.0F);
      this.D.setClickable(true);
      this.F.setAlpha(1.0F);
      this.F.setClickable(true);
      this.C.setClickable(true);
      this.E.setClickable(true);
      this.G.setClickable(true);
      this.G.setAlpha(1.0F);
      this.I.setEnabled(true);
    } else {
      this.t.setChecked(false);
      this.u.setAlpha(0.3F);
      this.u.setClickable(false);
      this.w.setAlpha(0.3F);
      this.x.setAlpha(0.3F);
      this.x.setClickable(false);
      this.B.setAlpha(0.3F);
      this.B.setClickable(false);
      this.D.setAlpha(0.3F);
      this.D.setClickable(false);
      this.F.setAlpha(0.3F);
      this.F.setClickable(false);
      this.C.setClickable(false);
      this.E.setClickable(false);
      this.G.setClickable(false);
      this.G.setAlpha(0.3F);
      this.I.setEnabled(false);
      com.allinone.callerid.util.recorder.d.c();
    } 
    if (com.allinone.callerid.util.recorder.b.i()) {
      this.C.setChecked(true);
    } else {
      this.C.setChecked(false);
    } 
  }
  
  private void h0() {
    this.w = (FrameLayout)findViewById(2131297607);
    ImageView imageView1 = (ImageView)findViewById(2131297608);
    TextView textView1 = (TextView)findViewById(2131297611);
    this.x = (ConstraintLayout)findViewById(2131297624);
    this.y = (TextView)findViewById(2131297609);
    this.z = (ImageView)findViewById(2131297610);
    this.A = (ExpandLayout)findViewById(2131297606);
    this.B = (ConstraintLayout)findViewById(2131297613);
    TextView textView2 = (TextView)findViewById(2131297614);
    this.C = (CheckBox)findViewById(2131297612);
    this.D = (ConstraintLayout)findViewById(2131297601);
    TextView textView3 = (TextView)findViewById(2131297602);
    this.E = (CheckBox)findViewById(2131297600);
    this.F = (ConstraintLayout)findViewById(2131297604);
    TextView textView4 = (TextView)findViewById(2131297605);
    imageView1 = (ImageView)findViewById(2131297603);
    if (Build.VERSION.SDK_INT >= 28) {
      this.w.setVisibility(8);
      this.x.setVisibility(8);
      this.A.setVisibility(8);
    } 
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131297620);
    TextView textView5 = (TextView)findViewById(2131297625);
    TextView textView6 = (TextView)findViewById(2131297623);
    this.t = (Switch)findViewById(2131297622);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131297616);
    TextView textView7 = (TextView)findViewById(2131297619);
    TextView textView8 = (TextView)findViewById(2131297618);
    this.u = (FrameLayout)findViewById(2131297597);
    TextView textView9 = (TextView)findViewById(2131297599);
    TextView textView10 = (TextView)findViewById(2131297596);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131297591);
    this.G = frameLayout3;
    frameLayout3.setOnClickListener(this);
    this.H = (TextView)findViewById(2131297593);
    TextView textView11 = (TextView)findViewById(2131297595);
    this.I = (Switch)findViewById(2131297594);
    Typeface typeface = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");
    this.v = typeface;
    textView5.setTypeface(typeface);
    textView6.setTypeface(this.v);
    textView7.setTypeface(this.v);
    textView8.setTypeface(this.v);
    textView9.setTypeface(this.v);
    textView1.setTypeface(this.v);
    this.y.setTypeface(this.v);
    textView2.setTypeface(this.v);
    textView3.setTypeface(this.v);
    textView4.setTypeface(this.v);
    textView11.setTypeface(this.v);
    this.H.setTypeface(this.v);
    textView10.setTypeface(this.v);
    ImageView imageView2 = (ImageView)findViewById(2131297125);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView2.setImageResource(2131231059); 
    imageView2.setOnClickListener(new b(this));
    if (com.allinone.callerid.util.recorder.b.g()) {
      this.E.setChecked(true);
    } else {
      this.E.setChecked(false);
    } 
    this.u.setOnClickListener(this);
    textView8.setText(com.allinone.callerid.util.recorder.c.a);
    frameLayout1.setAlpha(0.3F);
    frameLayout2.setOnClickListener(new c(this));
    int i = com.allinone.callerid.util.recorder.b.h();
    if (i == 0) {
      this.y.setText(getString(2131755720));
      this.A.g(false);
    } else if (i == 1) {
      this.y.setText(getString(2131755721));
      this.A.g(true);
    } 
    this.C.setOnCheckedChangeListener(new d(this));
    this.E.setOnCheckedChangeListener(new e(this));
    this.x.setOnClickListener(this);
    this.B.setOnClickListener(this);
    this.D.setOnClickListener(this);
    this.F.setOnClickListener(this);
    String str1 = com.allinone.callerid.util.recorder.b.b();
    String str2 = getString(2131755716);
    if (str1 != null && !"".equals(str1)) {
      str1 = str2.replace("$$", str1);
      this.H.setText(str1);
      this.I.setChecked(true);
    } else {
      str1 = str2.replace("$$", "X");
      this.H.setText(str1);
      this.I.setChecked(false);
    } 
    this.I.setOnCheckedChangeListener(new f(this));
    g0();
    this.t.setOnCheckedChangeListener(new g(this));
  }
  
  private void i0() {
    try {
      View view = LayoutInflater.from((Context)this).inflate(2131493021, null);
      BaseEditText baseEditText = (BaseEditText)view.findViewById(2131296578);
      baseEditText.setTypeface(this.v);
      AlertDialog.Builder builder = new AlertDialog.Builder();
      this((Context)this);
      builder.setTitle(2131755021);
      builder.setView(view);
      i i = new i();
      this(this, baseEditText);
      builder.setPositiveButton(2131755681, i);
      AlertDialog alertDialog = builder.create();
      j j = new j();
      this(this);
      alertDialog.setOnDismissListener(j);
      alertDialog.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void j0(View paramView) {
    com.allinone.callerid.mvc.view.recorder.b b = new com.allinone.callerid.mvc.view.recorder.b((Context)this);
    b.b(new String[] { getString(2131755720), getString(2131755721) });
    b.a(new a(this, b));
    b.showAsDropDown(paramView);
  }
  
  public void onClick(View paramView) {
    Intent intent;
    switch (paramView.getId()) {
      default:
        return;
      case 2131297624:
        j0((View)this.z);
      case 2131297613:
        if (this.C.isChecked()) {
          q.b().c("auto_record_unknown_call_unselect");
          this.C.setChecked(false);
          com.allinone.callerid.util.recorder.b.r(false);
        } else {
          this.C.setChecked(true);
          com.allinone.callerid.util.recorder.b.r(true);
        } 
      case 2131297604:
        q.b().c("auto_record_custom");
        intent = new Intent((Context)this, CustomActivity.class);
        intent.putExtra("customType", 0);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131297601:
        if (this.E.isChecked()) {
          this.E.setChecked(false);
          com.allinone.callerid.util.recorder.b.p(false);
        } else {
          this.E.setChecked(true);
          com.allinone.callerid.util.recorder.b.p(true);
        } 
      case 2131297597:
        startActivity(new Intent((Context)this, RecordProblemActivity.class));
        overridePendingTransition(2130771968, 2130771969);
      case 2131297591:
        break;
    } 
    if (this.I.isChecked()) {
      this.I.setChecked(false);
      com.allinone.callerid.util.recorder.b.k("");
      String str = getString(2131755716).replace("$$", "X");
      this.H.setText(str);
    } 
    this.I.setChecked(true);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492948);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    h0();
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
    a(RecordSetting this$0, com.allinone.callerid.mvc.view.recorder.b param1b) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131297365) {
        if (i == 2131297367) {
          q.b().c("auto_record_all");
          com.allinone.callerid.util.recorder.b.q(0);
          RecordSetting.V(this.c).setText(this.c.getString(2131755720));
          if (RecordSetting.W(this.c).i())
            RecordSetting.W(this.c).e(); 
          this.b.dismiss();
        } 
      } else {
        com.allinone.callerid.util.recorder.b.q(1);
        RecordSetting.V(this.c).setText(this.c.getString(2131755721));
        RecordSetting.W(this.c).f();
        this.b.dismiss();
      } 
    }
  }
  
  class b implements View.OnClickListener {
    b(RecordSetting this$0) {}
    
    public void onClick(View param1View) {
      if (i1.a) {
        i1.a = false;
        this.b.startActivity(new Intent((Context)this.b, CommonSetting.class));
        this.b.finish();
      } else {
        this.b.finish();
      } 
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class c implements View.OnClickListener {
    c(RecordSetting this$0) {}
    
    public void onClick(View param1View) {
      if (RecordSetting.O(this.b).isChecked()) {
        com.allinone.callerid.util.recorder.b.n(false);
        RecordSetting.O(this.b).setChecked(false);
        RecordSetting.P(this.b).setAlpha(0.3F);
        RecordSetting.P(this.b).setClickable(false);
        RecordSetting.X(this.b).setAlpha(0.3F);
        RecordSetting.Y(this.b).setAlpha(0.3F);
        RecordSetting.Y(this.b).setClickable(false);
        RecordSetting.Z(this.b).setAlpha(0.3F);
        RecordSetting.Z(this.b).setClickable(false);
        RecordSetting.a0(this.b).setAlpha(0.3F);
        RecordSetting.a0(this.b).setClickable(false);
        RecordSetting.b0(this.b).setAlpha(0.3F);
        RecordSetting.b0(this.b).setClickable(false);
        RecordSetting.c0(this.b).setClickable(false);
        RecordSetting.d0(this.b).setClickable(false);
        RecordSetting.e0(this.b).setClickable(false);
        RecordSetting.e0(this.b).setAlpha(0.3F);
        RecordSetting.Q(this.b).setEnabled(false);
      } else {
        RecordSetting.R(this.b);
      } 
    }
  }
  
  class d implements CompoundButton.OnCheckedChangeListener {
    d(RecordSetting this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.util.recorder.b.r(true);
      } else {
        com.allinone.callerid.util.recorder.b.r(false);
      } 
    }
  }
  
  class e implements CompoundButton.OnCheckedChangeListener {
    e(RecordSetting this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      com.allinone.callerid.util.recorder.b.p(param1Boolean);
    }
  }
  
  class f implements CompoundButton.OnCheckedChangeListener {
    f(RecordSetting this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        RecordSetting.S(this.a);
      } else {
        com.allinone.callerid.util.recorder.b.k("");
        String str = this.a.getString(2131755716).replace("$$", "X");
        RecordSetting.T(this.a).setText(str);
      } 
    }
  }
  
  class g implements CompoundButton.OnCheckedChangeListener {
    g(RecordSetting this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (!param1Boolean) {
        com.allinone.callerid.util.recorder.b.n(false);
        RecordSetting.P(this.a).setAlpha(0.3F);
        RecordSetting.P(this.a).setClickable(false);
        RecordSetting.X(this.a).setAlpha(0.3F);
        RecordSetting.Y(this.a).setAlpha(0.3F);
        RecordSetting.Y(this.a).setClickable(false);
        RecordSetting.Z(this.a).setAlpha(0.3F);
        RecordSetting.Z(this.a).setClickable(false);
        RecordSetting.a0(this.a).setAlpha(0.3F);
        RecordSetting.a0(this.a).setClickable(false);
        RecordSetting.b0(this.a).setAlpha(0.3F);
        RecordSetting.b0(this.a).setClickable(false);
        RecordSetting.c0(this.a).setClickable(false);
        RecordSetting.d0(this.a).setClickable(false);
        RecordSetting.e0(this.a).setClickable(false);
        RecordSetting.e0(this.a).setAlpha(0.3F);
        RecordSetting.Q(this.a).setEnabled(false);
      } else {
        RecordSetting.R(this.a);
      } 
    }
  }
  
  class h implements DialogInterface.OnDismissListener {
    h(RecordSetting this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      RecordSetting.U(this.b);
    }
  }
  
  class i implements DialogInterface.OnClickListener {
    i(RecordSetting this$0, BaseEditText param1BaseEditText) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      String str = this.b.getText().toString();
      if (!str.equals("") && !str.equals("0")) {
        String str1 = this.c.getString(2131755716).replace("$$", str);
        RecordSetting.T(this.c).setText(str1);
        com.allinone.callerid.util.recorder.b.k(str);
      } 
      param1DialogInterface.dismiss();
    }
  }
  
  class j implements DialogInterface.OnDismissListener {
    j(RecordSetting this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      String str2 = com.allinone.callerid.util.recorder.b.b();
      String str1 = this.b.getString(2131755716);
      if (str2 != null && !"".equals(str2) && !"0".equals(str2)) {
        str1 = str1.replace("$$", str2);
        RecordSetting.T(this.b).setText(str1);
        RecordSetting.Q(this.b).setChecked(true);
      } else {
        str1 = str1.replace("$$", "X");
        RecordSetting.T(this.b).setText(str1);
        RecordSetting.Q(this.b).setChecked(false);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recorder/RecordSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */