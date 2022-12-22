package com.allinone.callerid.mvc.controller.recorder;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.recorder.CustomRecord;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomActivity extends BaseActivity implements View.OnClickListener {
  private FloatingActionButton A;
  
  private FloatingActionButton B;
  
  private ConstraintLayout C;
  
  private ImageView D;
  
  private TextView E;
  
  private ImageView F;
  
  private ImageView G;
  
  private com.allinone.callerid.b.z.d H;
  
  public boolean I = false;
  
  public int J = 0;
  
  private final String s = "CustomActivity";
  
  private Typeface t;
  
  private LinearLayout u;
  
  private ImageView v;
  
  private RecyclerView w;
  
  private LinearLayout x;
  
  private FloatingActionMenu y;
  
  private FloatingActionButton z;
  
  private void R() {
    try {
      View view = LayoutInflater.from((Context)this).inflate(2131493008, null);
      BaseEditText baseEditText1 = (BaseEditText)view.findViewById(2131296565);
      BaseEditText baseEditText2 = (BaseEditText)view.findViewById(2131296566);
      baseEditText1.setTypeface(this.t);
      baseEditText2.setTypeface(this.t);
      androidx.appcompat.app.a.a a = new androidx.appcompat.app.a.a();
      this((Context)this);
      a.p(2131755077);
      a.r(view);
      b b = new b();
      this(this);
      a.i(2131755180, b);
      c c = new c();
      this(this, baseEditText2, baseEditText1);
      a.m(2131755770, c).a().show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void S() {
    (new d(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  private void T() {
    (new e(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  private void U() {
    this.y.setClosedOnTouchOutside(true);
    this.y.setMenuButtonShowAnimation(AnimationUtils.loadAnimation((Context)this, 2130772045));
    this.y.setMenuButtonHideAnimation(AnimationUtils.loadAnimation((Context)this, 2130772033));
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)this);
    linearLayoutManager.z2(1);
    this.w.setLayoutManager((RecyclerView.o)linearLayoutManager);
    this.w.setItemAnimator((RecyclerView.l)new androidx.recyclerview.widget.c());
    com.allinone.callerid.b.z.d d1 = new com.allinone.callerid.b.z.d((Activity)this, new ArrayList());
    this.H = d1;
    this.w.setAdapter((RecyclerView.Adapter)d1);
  }
  
  private void V() {
    this.v.setOnClickListener(this);
    this.z.setOnClickListener(this);
    this.A.setOnClickListener(this);
    this.B.setOnClickListener(this);
    this.D.setOnClickListener(this);
    this.F.setOnClickListener(this);
    this.G.setOnClickListener(this);
  }
  
  private void W() {
    this.t = g1.b();
    this.C = (ConstraintLayout)findViewById(2131296533);
    this.D = (ImageView)findViewById(2131296530);
    this.E = (TextView)findViewById(2131296531);
    this.F = (ImageView)findViewById(2131296529);
    this.G = (ImageView)findViewById(2131296532);
    this.u = (LinearLayout)findViewById(2131297239);
    this.v = (ImageView)findViewById(2131296540);
    TextView textView1 = (TextView)findViewById(2131296541);
    this.w = (RecyclerView)findViewById(2131296528);
    this.x = (LinearLayout)findViewById(2131296525);
    TextView textView2 = (TextView)findViewById(2131296526);
    FloatingActionMenu floatingActionMenu = (FloatingActionMenu)findViewById(2131296527);
    this.y = floatingActionMenu;
    floatingActionMenu.setContentDescription(getResources().getString(2131755077));
    this.z = (FloatingActionButton)findViewById(2131296693);
    this.A = (FloatingActionButton)findViewById(2131296694);
    this.B = (FloatingActionButton)findViewById(2131296697);
    textView1.setTypeface(this.t);
    this.E.setTypeface(this.t);
    textView2.setTypeface(this.t);
    if (i1.f0(getApplicationContext()).booleanValue())
      this.v.setImageResource(2131231059); 
  }
  
  private void X() {
    (new Thread(new a(this))).start();
  }
  
  private void Z() {
    (new f(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  public void Y() {
    if (this.H.C() != null && this.H.C().size() > 0 && this.H.G() != null) {
      TextView textView = this.E;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.H.G().size());
      stringBuilder.append("/");
      stringBuilder.append(this.H.C().size());
      textView.setText(stringBuilder.toString());
    } else {
      this.E.setText("0/0");
    } 
  }
  
  public void a0() {
    this.C.setVisibility(8);
    this.u.setVisibility(0);
    this.I = false;
    T();
  }
  
  public void b0() {
    this.C.setVisibility(0);
    this.u.setVisibility(8);
  }
  
  public void onBackPressed() {
    if (this.I) {
      a0();
      return;
    } 
    super.onBackPressed();
  }
  
  public void onClick(View paramView) {
    Intent intent;
    switch (paramView.getId()) {
      default:
        return;
      case 2131296697:
        intent = new Intent((Context)this, CustomAddActivity.class);
        intent.putExtra("customType", this.J);
        intent.putExtra("phoneDataType", 1);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
        if (this.y.s())
          this.y.u(true); 
      case 2131296694:
        intent = new Intent((Context)this, CustomAddActivity.class);
        intent.putExtra("customType", this.J);
        intent.putExtra("phoneDataType", 0);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
        if (this.y.s())
          this.y.u(true); 
      case 2131296693:
        R();
        if (this.y.s())
          this.y.u(true); 
      case 2131296540:
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296532:
        S();
      case 2131296530:
        a0();
      case 2131296529:
        break;
    } 
    Z();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492919);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.J = getIntent().getIntExtra("customType", 0);
    W();
    U();
    V();
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
    X();
  }
  
  class a implements Runnable {
    a(CustomActivity this$0) {}
    
    public void run() {
      ArrayList arrayList = (ArrayList)com.allinone.callerid.f.k.a.c().e(this.b.J);
      this.b.runOnUiThread(new a(this, arrayList));
    }
    
    class a implements Runnable {
      a(CustomActivity.a this$0, ArrayList param2ArrayList) {}
      
      public void run() {
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.size() > 0) {
          CustomActivity.O(this.c.b).A(this.b, true);
          CustomActivity.O(this.c.b).i();
          CustomActivity.P(this.c.b).setVisibility(8);
          CustomActivity.Q(this.c.b).setVisibility(0);
        } else {
          CustomActivity.P(this.c.b).setVisibility(0);
          CustomActivity.Q(this.c.b).setVisibility(8);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(CustomActivity this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      ArrayList arrayList = this.b;
      if (arrayList != null && arrayList.size() > 0) {
        CustomActivity.O(this.c.b).A(this.b, true);
        CustomActivity.O(this.c.b).i();
        CustomActivity.P(this.c.b).setVisibility(8);
        CustomActivity.Q(this.c.b).setVisibility(0);
      } else {
        CustomActivity.P(this.c.b).setVisibility(0);
        CustomActivity.Q(this.c.b).setVisibility(8);
      } 
    }
  }
  
  class b implements DialogInterface.OnClickListener {
    b(CustomActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      param1DialogInterface.dismiss();
    }
  }
  
  class c implements DialogInterface.OnClickListener {
    c(CustomActivity this$0, BaseEditText param1BaseEditText1, BaseEditText param1BaseEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      param1DialogInterface.dismiss();
      (new Thread(new a(this))).start();
    }
    
    class a implements Runnable {
      a(CustomActivity.c this$0) {}
      
      public void run() {
        CustomRecord customRecord = new CustomRecord();
        customRecord.setPhone(this.b.b.getText().toString());
        customRecord.setName(this.b.c.getText().toString());
        customRecord.setType(this.b.d.J);
        customRecord.setSelect(false);
        if (com.allinone.callerid.f.k.a.c().a(customRecord))
          this.b.d.runOnUiThread(new a(this, customRecord)); 
      }
      
      class a implements Runnable {
        a(CustomActivity.c.a this$0, CustomRecord param3CustomRecord) {}
        
        public void run() {
          if (CustomActivity.O(this.c.b.d) != null) {
            CustomActivity.O(this.c.b.d).B(this.b, false);
            CustomActivity.O(this.c.b.d).j(0);
            if (CustomActivity.O(this.c.b.d).C() != null) {
              CustomActivity.O(this.c.b.d).k(0, CustomActivity.O(this.c.b.d).C().size());
              if (CustomActivity.Q(this.c.b.d).getVisibility() == 8) {
                CustomActivity.Q(this.c.b.d).setVisibility(0);
                CustomActivity.P(this.c.b.d).setVisibility(8);
              } 
            } 
            CustomActivity customActivity = this.c.b.d;
            Toast.makeText((Context)customActivity, customActivity.getString(2131755270), 0).show();
          } 
        }
      }
    }
    
    class a implements Runnable {
      a(CustomActivity.c this$0, CustomRecord param2CustomRecord) {}
      
      public void run() {
        if (CustomActivity.O(this.c.b.d) != null) {
          CustomActivity.O(this.c.b.d).B(this.b, false);
          CustomActivity.O(this.c.b.d).j(0);
          if (CustomActivity.O(this.c.b.d).C() != null) {
            CustomActivity.O(this.c.b.d).k(0, CustomActivity.O(this.c.b.d).C().size());
            if (CustomActivity.Q(this.c.b.d).getVisibility() == 8) {
              CustomActivity.Q(this.c.b.d).setVisibility(0);
              CustomActivity.P(this.c.b.d).setVisibility(8);
            } 
          } 
          CustomActivity customActivity = this.c.b.d;
          Toast.makeText((Context)customActivity, customActivity.getString(2131755270), 0).show();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(CustomActivity this$0) {}
    
    public void run() {
      CustomRecord customRecord = new CustomRecord();
      customRecord.setPhone(this.b.b.getText().toString());
      customRecord.setName(this.b.c.getText().toString());
      customRecord.setType(this.b.d.J);
      customRecord.setSelect(false);
      if (com.allinone.callerid.f.k.a.c().a(customRecord))
        this.b.d.runOnUiThread(new a(this, customRecord)); 
    }
    
    class a implements Runnable {
      a(CustomActivity.c.a this$0, CustomRecord param3CustomRecord) {}
      
      public void run() {
        if (CustomActivity.O(this.c.b.d) != null) {
          CustomActivity.O(this.c.b.d).B(this.b, false);
          CustomActivity.O(this.c.b.d).j(0);
          if (CustomActivity.O(this.c.b.d).C() != null) {
            CustomActivity.O(this.c.b.d).k(0, CustomActivity.O(this.c.b.d).C().size());
            if (CustomActivity.Q(this.c.b.d).getVisibility() == 8) {
              CustomActivity.Q(this.c.b.d).setVisibility(0);
              CustomActivity.P(this.c.b.d).setVisibility(8);
            } 
          } 
          CustomActivity customActivity = this.c.b.d;
          Toast.makeText((Context)customActivity, customActivity.getString(2131755270), 0).show();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(CustomActivity this$0, CustomRecord param1CustomRecord) {}
    
    public void run() {
      if (CustomActivity.O(this.c.b.d) != null) {
        CustomActivity.O(this.c.b.d).B(this.b, false);
        CustomActivity.O(this.c.b.d).j(0);
        if (CustomActivity.O(this.c.b.d).C() != null) {
          CustomActivity.O(this.c.b.d).k(0, CustomActivity.O(this.c.b.d).C().size());
          if (CustomActivity.Q(this.c.b.d).getVisibility() == 8) {
            CustomActivity.Q(this.c.b.d).setVisibility(0);
            CustomActivity.P(this.c.b.d).setVisibility(8);
          } 
        } 
        CustomActivity customActivity = this.c.b.d;
        Toast.makeText((Context)customActivity, customActivity.getString(2131755270), 0).show();
      } 
    }
  }
  
  private static class d extends AsyncTask<Void, Void, String> {
    private WeakReference<CustomActivity> a;
    
    d(CustomActivity param1CustomActivity) {
      this.a = new WeakReference<CustomActivity>(param1CustomActivity);
    }
    
    protected String a(Void... param1VarArgs) {
      CustomActivity customActivity = this.a.get();
      if (customActivity != null && !customActivity.isFinishing())
        try {
          if (CustomActivity.O(customActivity).G() != null && CustomActivity.O(customActivity).G().size() > 0) {
            for (CustomRecord customRecord : CustomActivity.O(customActivity).G()) {
              if (customRecord.isSelect()) {
                com.allinone.callerid.f.k.a.c().b(customRecord.getPhone());
                if (CustomActivity.O(customActivity).C() != null)
                  CustomActivity.O(customActivity).C().remove(customRecord); 
              } 
            } 
            return "success";
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      CustomActivity customActivity = this.a.get();
      if (customActivity != null && !customActivity.isFinishing() && "success".equals(param1String)) {
        CustomActivity.O(customActivity).i();
        CustomActivity.O(customActivity).G().clear();
        customActivity.Y();
        Toast.makeText((Context)customActivity, customActivity.getString(2131755292), 0).show();
        customActivity.overridePendingTransition(2130771968, 2130771969);
        customActivity.a0();
      } 
    }
  }
  
  private static class e extends AsyncTask<Void, Void, Void> {
    private WeakReference<CustomActivity> a;
    
    e(CustomActivity param1CustomActivity) {
      this.a = new WeakReference<CustomActivity>(param1CustomActivity);
    }
    
    protected Void a(Void... param1VarArgs) {
      CustomActivity customActivity = this.a.get();
      if (customActivity != null && !customActivity.isFinishing())
        try {
          if (CustomActivity.O(customActivity).C() != null && CustomActivity.O(customActivity).C().size() > 0 && CustomActivity.O(customActivity).G() != null) {
            Iterator<CustomRecord> iterator = CustomActivity.O(customActivity).C().iterator();
            while (iterator.hasNext())
              ((CustomRecord)iterator.next()).setSelect(false); 
            CustomActivity.O(customActivity).G().clear();
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      CustomActivity customActivity = this.a.get();
      if (customActivity != null && !customActivity.isFinishing())
        CustomActivity.O(customActivity).i(); 
    }
  }
  
  private static class f extends AsyncTask<Void, Void, Void> {
    private WeakReference<CustomActivity> a;
    
    f(CustomActivity param1CustomActivity) {
      this.a = new WeakReference<CustomActivity>(param1CustomActivity);
    }
    
    protected Void a(Void... param1VarArgs) {
      CustomActivity customActivity = this.a.get();
      if (customActivity != null && !customActivity.isFinishing())
        try {
          ArrayList arrayList1 = CustomActivity.O(customActivity).C();
          ArrayList<CustomRecord> arrayList = CustomActivity.O(customActivity).G();
          if (arrayList1 != null && arrayList1.size() > 0 && arrayList != null) {
            Iterator<CustomRecord> iterator;
            if (arrayList.size() >= arrayList1.size()) {
              iterator = arrayList1.iterator();
              while (iterator.hasNext())
                ((CustomRecord)iterator.next()).setSelect(false); 
              arrayList.clear();
            } else {
              arrayList.clear();
              for (CustomRecord customRecord : iterator) {
                customRecord.setSelect(true);
                arrayList.add(customRecord);
              } 
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      CustomActivity customActivity = this.a.get();
      if (customActivity != null && !customActivity.isFinishing()) {
        CustomActivity.O(customActivity).i();
        customActivity.Y();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recorder/CustomActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */