package com.allinone.callerid.mvc.controller.nodisturb;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.allinone.callerid.bean.WeekInfo;
import com.allinone.callerid.customview.BlockLinearLayout;
import com.allinone.callerid.dialog.m;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.receiver.LocalBroadcastReceiver;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.m0;
import com.allinone.callerid.util.q;
import java.util.ArrayList;

public class NoDisturbActivity extends DisturbBaseActivity implements View.OnClickListener {
  private TextView A;
  
  private CheckBox B;
  
  private CheckBox C;
  
  private LinearLayout D;
  
  private BlockLinearLayout E;
  
  private boolean F = false;
  
  private int G;
  
  private int H;
  
  private int I;
  
  private int J;
  
  private ArrayList<WeekInfo> K;
  
  private LocalBroadcastReceiver L;
  
  private Switch M;
  
  private final String t = "NoDisturbActivity";
  
  private ImageView u;
  
  private Switch v;
  
  private Switch w;
  
  private TextView x;
  
  private TextView y;
  
  private TextView z;
  
  private void f0(String paramString) {
    int i = this.I;
    int j = this.G;
    if (i < j) {
      this.y.setText(paramString);
      this.y.append(" ");
      this.y.append(getString(2131755019));
    } else if (i == j) {
      if (this.J > this.H) {
        this.y.setText(paramString);
        this.y.append(" ");
        this.y.append(getString(2131755019));
      } else {
        this.y.setText(paramString);
      } 
    } else {
      this.y.setText(paramString);
    } 
  }
  
  protected void N() {
    super.N();
    if (this.s)
      this.u.setRotation(180.0F); 
    if (com.allinone.callerid.util.j1.a.i()) {
      this.v.setChecked(true);
      this.E.setAlpha(1.0F);
      this.E.setClick(false);
    } else {
      this.v.setChecked(false);
      this.E.setAlpha(0.4F);
      this.E.setClick(true);
    } 
    this.v.setOnCheckedChangeListener(new h(this));
    if (com.allinone.callerid.util.j1.a.j()) {
      this.D.setVisibility(0);
      this.w.setChecked(true);
    } else {
      this.D.setVisibility(8);
      this.w.setChecked(false);
    } 
    int i = com.allinone.callerid.util.j1.a.c();
    if (i != 0) {
      if (i == 1)
        this.A.setText(getString(2131755032)); 
    } else {
      this.A.setText(getString(2131755641));
    } 
    if (com.allinone.callerid.util.j1.a.h()) {
      this.M.setChecked(true);
    } else {
      this.M.setChecked(false);
    } 
    this.G = com.allinone.callerid.util.j1.a.a();
    i = com.allinone.callerid.util.j1.a.b();
    this.H = i;
    String str = com.allinone.callerid.util.i.l(this.G, i);
    this.x.setText(str);
    this.I = com.allinone.callerid.util.j1.a.d();
    i = com.allinone.callerid.util.j1.a.e();
    this.J = i;
    f0(com.allinone.callerid.util.i.l(this.I, i));
    this.B.setChecked(com.allinone.callerid.util.j1.a.f());
    this.C.setChecked(com.allinone.callerid.util.j1.a.g());
    com.allinone.callerid.i.a.k.d.b(new i(this));
  }
  
  protected void O() {
    try {
      setContentView(2131492933);
      this.u = (ImageView)findViewById(2131296598);
      TextView textView1 = (TextView)findViewById(2131296623);
      LinearLayout linearLayout1 = (LinearLayout)findViewById(2131296627);
      TextView textView2 = (TextView)findViewById(2131296629);
      this.v = (Switch)findViewById(2131296628);
      LinearLayout linearLayout2 = (LinearLayout)findViewById(2131296619);
      TextView textView3 = (TextView)findViewById(2131296622);
      this.w = (Switch)findViewById(2131296620);
      ConstraintLayout constraintLayout1 = (ConstraintLayout)findViewById(2131296609);
      TextView textView4 = (TextView)findViewById(2131296611);
      this.x = (TextView)findViewById(2131296610);
      ConstraintLayout constraintLayout2 = (ConstraintLayout)findViewById(2131296624);
      TextView textView5 = (TextView)findViewById(2131296626);
      this.y = (TextView)findViewById(2131296625);
      ConstraintLayout constraintLayout3 = (ConstraintLayout)findViewById(2131296616);
      TextView textView6 = (TextView)findViewById(2131296618);
      this.z = (TextView)findViewById(2131296617);
      LinearLayout linearLayout3 = (LinearLayout)findViewById(2131296599);
      TextView textView7 = (TextView)findViewById(2131296602);
      this.A = (TextView)findViewById(2131296601);
      ImageView imageView1 = (ImageView)findViewById(2131296600);
      TextView textView8 = (TextView)findViewById(2131296590);
      ConstraintLayout constraintLayout4 = (ConstraintLayout)findViewById(2131296592);
      TextView textView9 = (TextView)findViewById(2131296593);
      this.B = (CheckBox)findViewById(2131296591);
      ConstraintLayout constraintLayout5 = (ConstraintLayout)findViewById(2131296595);
      TextView textView10 = (TextView)findViewById(2131296597);
      ImageView imageView2 = (ImageView)findViewById(2131296596);
      this.C = (CheckBox)findViewById(2131296594);
      LinearLayout linearLayout4 = (LinearLayout)findViewById(2131296612);
      TextView textView11 = (TextView)findViewById(2131296615);
      TextView textView12 = (TextView)findViewById(2131296614);
      this.M = (Switch)findViewById(2131296613);
      this.D = (LinearLayout)findViewById(2131296621);
      this.E = (BlockLinearLayout)findViewById(2131297615);
      Typeface typeface = g1.b();
      textView1.setTypeface(typeface);
      textView2.setTypeface(typeface);
      textView3.setTypeface(typeface);
      textView4.setTypeface(typeface);
      this.x.setTypeface(typeface);
      textView5.setTypeface(typeface);
      this.y.setTypeface(typeface);
      textView6.setTypeface(typeface);
      this.z.setTypeface(typeface);
      textView7.setTypeface(typeface);
      this.A.setTypeface(typeface);
      textView8.setTypeface(typeface);
      textView9.setTypeface(typeface);
      textView10.setTypeface(typeface);
      textView11.setTypeface(typeface);
      textView12.setTypeface(typeface);
      this.u.setOnClickListener(this);
      linearLayout1.setOnClickListener(this);
      linearLayout2.setOnClickListener(this);
      constraintLayout1.setOnClickListener(this);
      constraintLayout2.setOnClickListener(this);
      constraintLayout3.setOnClickListener(this);
      linearLayout3.setOnClickListener(this);
      imageView2.setOnClickListener(this);
      linearLayout4.setOnClickListener(this);
      CheckBox checkBox1 = this.B;
      a a1 = new a();
      this(this);
      checkBox1.setOnCheckedChangeListener(a1);
      CheckBox checkBox2 = this.C;
      d d = new d();
      this(this);
      checkBox2.setOnCheckedChangeListener(d);
      LocalBroadcastReceiver localBroadcastReceiver2 = new LocalBroadcastReceiver();
      e e = new e();
      this(this);
      this(e);
      this.L = localBroadcastReceiver2;
      Switch switch_ = this.w;
      f f = new f();
      this(this);
      switch_.setOnCheckedChangeListener(f);
      switch_ = this.M;
      g g = new g();
      this(this);
      switch_.setOnCheckedChangeListener(g);
      b.p.a.a a = b.p.a.a.b((Context)this);
      LocalBroadcastReceiver localBroadcastReceiver1 = this.L;
      IntentFilter intentFilter = new IntentFilter();
      this("com.allinone.callerid.DISTURB_NOTIFICATION_UPDATA");
      a.c((BroadcastReceiver)localBroadcastReceiver1, intentFilter);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onClick(View paramView) {
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;
    switch (paramView.getId()) {
      default:
        return;
      case 2131296627:
        if (this.v.isChecked()) {
          this.v.setChecked(false);
        } else {
          this.v.setChecked(true);
        } 
      case 2131296624:
        (new TimePickerDialog((Context)this, new k(this), this.I, this.J, com.allinone.callerid.util.i.p((Context)this))).show();
      case 2131296619:
        if (this.w.isChecked()) {
          this.w.setChecked(false);
          this.D.setVisibility(8);
          com.allinone.callerid.util.j1.a.t(false);
        } else {
          this.w.setChecked(true);
          this.D.setVisibility(0);
          com.allinone.callerid.util.j1.a.t(true);
        } 
      case 2131296616:
        m.e((Context)this, this.K, new b(this));
      case 2131296612:
        if (this.M.isChecked()) {
          this.M.setChecked(false);
          com.allinone.callerid.util.j1.a.r(false);
        } else {
          this.M.setChecked(true);
          com.allinone.callerid.util.j1.a.r(true);
        } 
      case 2131296609:
        (new TimePickerDialog((Context)this, new j(this), this.G, this.H, com.allinone.callerid.util.i.p((Context)this))).show();
      case 2131296599:
        arrayList = new ArrayList();
        arrayList.add(getString(2131755641));
        arrayList.add(getString(2131755032));
        arrayAdapter = new ArrayAdapter((Context)this, 17367043, arrayList);
        (new AlertDialog.Builder((Context)this)).setAdapter((ListAdapter)arrayAdapter, new c(this, arrayList)).setCancelable(true).show();
      case 2131296598:
        M();
      case 2131296596:
        break;
    } 
    startActivity(new Intent((Context)this, DisturbCustomActivity.class));
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void onDestroy() {
    super.onDestroy();
    if (this.L != null)
      b.p.a.a.b((Context)this).e((BroadcastReceiver)this.L); 
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
    if (this.F && com.allinone.callerid.util.k1.a.j()) {
      com.allinone.callerid.util.j1.a.m(1);
      this.A.setText(getString(2131755032));
      this.F = false;
      if (!(EZCallApplication.c()).d)
        q.b().c("openNotificationManagerCount"); 
      (EZCallApplication.c()).d = true;
    } 
  }
  
  class a implements CompoundButton.OnCheckedChangeListener {
    a(NoDisturbActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isChecked: ");
        stringBuilder.append(param1Boolean);
        d0.a("wbb", stringBuilder.toString());
      } 
      if (com.allinone.callerid.util.k1.a.c((Context)this.a)) {
        com.allinone.callerid.util.j1.a.p(param1Boolean);
      } else {
        com.allinone.callerid.util.k1.a.k((Activity)this.a, new a(this, param1Boolean));
      } 
    }
    
    class a implements com.allinone.callerid.util.k1.a.g {
      a(NoDisturbActivity.a this$0, boolean param2Boolean) {}
      
      public void a() {
        if (com.allinone.callerid.util.k1.a.c(this.b.a.getApplicationContext())) {
          com.allinone.callerid.util.j1.a.p(this.a);
        } else {
          NoDisturbActivity.R(this.b.a).setChecked(false);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.util.k1.a.g {
    a(NoDisturbActivity this$0, boolean param1Boolean) {}
    
    public void a() {
      if (com.allinone.callerid.util.k1.a.c(this.b.a.getApplicationContext())) {
        com.allinone.callerid.util.j1.a.p(this.a);
      } else {
        NoDisturbActivity.R(this.b.a).setChecked(false);
      } 
    }
  }
  
  class b implements com.allinone.callerid.i.a.k.c {
    b(NoDisturbActivity this$0) {}
    
    public void a(ArrayList<WeekInfo> param1ArrayList) {
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        NoDisturbActivity.Z(this.a, param1ArrayList);
        WeekInfo weekInfo = param1ArrayList.get(param1ArrayList.size() - 1);
        if (weekInfo != null && weekInfo.getWeekId() == -1 && weekInfo.isSelect()) {
          NoDisturbActivity.a0(this.a).setText(this.a.getString(2131755009));
        } else {
          NoDisturbActivity.a0(this.a).setText("");
          StringBuilder stringBuilder = new StringBuilder();
          for (WeekInfo weekInfo1 : param1ArrayList) {
            if (weekInfo1.isSelect() && weekInfo1.getWeekId() != -1) {
              stringBuilder.append(weekInfo1.getWeek());
              stringBuilder.append(",");
            } 
          } 
          NoDisturbActivity.a0(this.a).setText(stringBuilder.toString());
        } 
      } 
    }
  }
  
  class c implements DialogInterface.OnClickListener {
    c(NoDisturbActivity this$0, ArrayList param1ArrayList) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (param1Int < this.b.size()) {
        String str = this.b.get(param1Int);
        if (this.c.getString(2131755032).equals(str)) {
          if (m.j((Activity)this.c)) {
            com.allinone.callerid.util.j1.a.m(1);
            NoDisturbActivity.V(this.c).setText(this.c.getString(2131755032));
          } else {
            NoDisturbActivity.W(this.c, true);
          } 
        } else {
          com.allinone.callerid.util.j1.a.m(0);
          NoDisturbActivity.V(this.c).setText(this.c.getString(2131755641));
        } 
      } 
    }
  }
  
  class d implements CompoundButton.OnCheckedChangeListener {
    d(NoDisturbActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isChecked: ");
        stringBuilder.append(param1Boolean);
        d0.a("wbb", stringBuilder.toString());
      } 
      com.allinone.callerid.util.j1.a.q(param1Boolean);
    }
  }
  
  class e implements LocalBroadcastReceiver.a {
    e(NoDisturbActivity this$0) {}
    
    public void a(Intent param1Intent) {
      if (d0.a)
        d0.a("wbb", "勿扰模式总开关"); 
      if (com.allinone.callerid.util.j1.a.i()) {
        NoDisturbActivity.S(this.a).setChecked(true);
        NoDisturbActivity.X(this.a).setAlpha(1.0F);
        NoDisturbActivity.X(this.a).setClick(false);
      } else {
        NoDisturbActivity.S(this.a).setChecked(false);
        NoDisturbActivity.X(this.a).setAlpha(0.4F);
        NoDisturbActivity.X(this.a).setClick(true);
      } 
    }
  }
  
  class f implements CompoundButton.OnCheckedChangeListener {
    f(NoDisturbActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        NoDisturbActivity.Y(this.a).setVisibility(0);
        com.allinone.callerid.util.j1.a.t(true);
      } else {
        NoDisturbActivity.Y(this.a).setVisibility(8);
        com.allinone.callerid.util.j1.a.t(false);
      } 
    }
  }
  
  class g implements CompoundButton.OnCheckedChangeListener {
    g(NoDisturbActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      com.allinone.callerid.util.j1.a.r(param1Boolean);
    }
  }
  
  class h implements CompoundButton.OnCheckedChangeListener {
    h(NoDisturbActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        NoDisturbActivity.X(this.a).setAlpha(1.0F);
        NoDisturbActivity.X(this.a).setClick(false);
        com.allinone.callerid.util.j1.a.s(true);
        m0.b(this.a.getApplicationContext());
      } else {
        NoDisturbActivity.X(this.a).setAlpha(0.4F);
        NoDisturbActivity.X(this.a).setClick(true);
        com.allinone.callerid.util.j1.a.s(false);
        m0.a(this.a.getApplicationContext());
      } 
    }
  }
  
  class i implements com.allinone.callerid.i.a.k.c {
    i(NoDisturbActivity this$0) {}
    
    public void a(ArrayList<WeekInfo> param1ArrayList) {
      NoDisturbActivity.Z(this.a, param1ArrayList);
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        WeekInfo weekInfo = param1ArrayList.get(param1ArrayList.size() - 1);
        if (weekInfo != null && weekInfo.getWeekId() == -1 && weekInfo.isSelect()) {
          NoDisturbActivity.a0(this.a).setText(this.a.getString(2131755009));
        } else {
          NoDisturbActivity.a0(this.a).setText("");
          for (WeekInfo weekInfo1 : param1ArrayList) {
            if (weekInfo1.isSelect() && weekInfo1.getWeekId() != -1) {
              NoDisturbActivity.a0(this.a).append(weekInfo1.getWeek());
              NoDisturbActivity.a0(this.a).append(",");
            } 
          } 
        } 
      } 
    }
  }
  
  class j implements TimePickerDialog.OnTimeSetListener {
    j(NoDisturbActivity this$0) {}
    
    public void onTimeSet(TimePicker param1TimePicker, int param1Int1, int param1Int2) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hourOfDay: ");
        stringBuilder.append(param1Int1);
        d0.a("wbb", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("minute: ");
        stringBuilder.append(param1Int2);
        d0.a("wbb", stringBuilder.toString());
      } 
      NoDisturbActivity.b0(this.a, param1Int1);
      NoDisturbActivity.c0(this.a, param1Int2);
      String str = com.allinone.callerid.util.i.l(param1Int1, param1Int2);
      NoDisturbActivity.d0(this.a).setText(str);
      com.allinone.callerid.util.j1.a.k(param1Int1);
      com.allinone.callerid.util.j1.a.l(param1Int2);
    }
  }
  
  class k implements TimePickerDialog.OnTimeSetListener {
    k(NoDisturbActivity this$0) {}
    
    public void onTimeSet(TimePicker param1TimePicker, int param1Int1, int param1Int2) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hourOfDay: ");
        stringBuilder.append(param1Int1);
        d0.a("wbb", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("minute: ");
        stringBuilder.append(param1Int2);
        d0.a("wbb", stringBuilder.toString());
      } 
      NoDisturbActivity.e0(this.a, param1Int1);
      NoDisturbActivity.T(this.a, param1Int2);
      com.allinone.callerid.util.j1.a.n(param1Int1);
      com.allinone.callerid.util.j1.a.o(param1Int2);
      String str = com.allinone.callerid.util.i.l(param1Int1, param1Int2);
      NoDisturbActivity.U(this.a, str);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/nodisturb/NoDisturbActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */