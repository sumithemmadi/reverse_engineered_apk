package com.allinone.callerid.callscreen.activitys;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.customview.MyGridLayoutManager;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import java.util.ArrayList;
import java.util.List;

public class ManageDiyActivity extends BaseActivity implements View.OnClickListener {
  private FrameLayout A;
  
  private TextView B;
  
  private f C;
  
  private ArrayList<PersonaliseContact> D = new ArrayList<PersonaliseContact>();
  
  private ArrayList<PersonaliseContact> E = new ArrayList<PersonaliseContact>();
  
  private boolean F;
  
  private boolean G;
  
  private ViewStub H;
  
  private final String s = "ManageDiyActivity";
  
  private RecyclerView t;
  
  private com.allinone.callerid.d.a.c u;
  
  private TextView v;
  
  private ImageView w;
  
  private ImageView x;
  
  private ImageView y;
  
  private ImageView z;
  
  private void c0(List<PersonaliseContact> paramList) {
    (j0.a()).b.execute(new e(this, paramList));
  }
  
  private void d0() {
    (j0.a()).b.execute(new a(this));
  }
  
  private void e0() {
    this.v = (TextView)findViewById(2131298187);
    this.H = (ViewStub)findViewById(2131298272);
    this.x = (ImageView)findViewById(2131297044);
    this.y = (ImageView)findViewById(2131296973);
    this.z = (ImageView)findViewById(2131296983);
    this.A = (FrameLayout)findViewById(2131296712);
    this.B = (TextView)findViewById(2131297789);
    this.x.setOnClickListener(this);
    this.y.setOnClickListener(this);
    this.z.setOnClickListener(this);
    this.A.setOnClickListener(this);
    this.w = (ImageView)findViewById(2131296949);
    if (i1.f0(getApplicationContext()).booleanValue())
      this.w.setImageResource(2131231059); 
    this.w.setOnClickListener(this);
    Typeface typeface = g1.b();
    this.v.setTypeface(typeface);
    this.B.setTypeface(typeface);
    this.t = (RecyclerView)findViewById(2131297453);
    MyGridLayoutManager myGridLayoutManager = new MyGridLayoutManager(getApplicationContext(), 2);
    myGridLayoutManager.z2(1);
    myGridLayoutManager.f3(true);
    this.t.setLayoutManager((RecyclerView.o)myGridLayoutManager);
    com.allinone.callerid.d.a.c c1 = new com.allinone.callerid.d.a.c((Context)this);
    this.u = c1;
    this.t.setAdapter((RecyclerView.Adapter)c1);
    this.u.I(new b(this));
    this.C = new f(null);
    b.p.a.a.b(getApplicationContext()).c(this.C, new IntentFilter("com.allinone.callerid.REFRESH_HOME_DATA"));
  }
  
  private void f0() {
    try {
      TextView textView = (TextView)((RelativeLayout)this.H.inflate()).findViewById(2131297997);
      textView.setText(getResources().getString(2131755536));
      textView.setTypeface(g1.b());
    } catch (Exception exception) {
      this.H.setVisibility(0);
    } 
  }
  
  public void onClick(View paramView) {
    StringBuilder stringBuilder;
    com.allinone.callerid.d.a.c c1;
    TextView textView;
    int i = paramView.getId();
    byte b = 0;
    switch (i) {
      default:
        return;
      case 2131297044:
        try {
          if (this.G) {
            this.G = false;
            ArrayList<PersonaliseContact> arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0)
              for (b = 0; b < this.D.size(); b++)
                ((PersonaliseContact)this.D.get(b)).setIsselect(false);  
            TextView textView1 = this.v;
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("0/");
            stringBuilder1.append(this.D.size());
            textView1.setText(stringBuilder1.toString());
            this.E.clear();
          } else {
            this.G = true;
            ArrayList<PersonaliseContact> arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0)
              while (b < this.D.size()) {
                ((PersonaliseContact)this.D.get(b)).setIsselect(true);
                b++;
              }  
            TextView textView1 = this.v;
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append(this.D.size());
            stringBuilder1.append("/");
            stringBuilder1.append(this.D.size());
            textView1.setText(stringBuilder1.toString());
            this.E.clear();
            this.E.addAll(this.D);
          } 
          com.allinone.callerid.d.a.c c2 = this.u;
          if (c2 != null)
            c2.i(); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296983:
        this.F = true;
        this.z.setVisibility(8);
        this.x.setVisibility(0);
        this.y.setVisibility(0);
        textView = this.v;
        stringBuilder = new StringBuilder();
        stringBuilder.append("0/");
        stringBuilder.append(this.D.size());
        textView.setText(stringBuilder.toString());
        this.w.setImageResource(2131231347);
        c1 = this.u;
        if (c1 != null) {
          c1.H(true);
          this.u.i();
        } 
      case 2131296973:
        try {
          ArrayList<PersonaliseContact> arrayList = this.E;
          if (arrayList != null && arrayList.size() > 0) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder();
            this((Context)this);
            AlertDialog.Builder builder2 = builder1.setMessage(getResources().getString(2131755288));
            String str1 = getResources().getString(2131755287);
            d d = new d();
            this(this);
            builder2 = builder2.setPositiveButton(str1, d);
            String str2 = getResources().getString(2131755180);
            c c2 = new c();
            this(this);
            AlertDialog alertDialog = builder2.setNegativeButton(str2, c2).create();
            alertDialog.show();
            alertDialog.getButton(-1).setTextColor(getResources().getColor(2131099706));
            alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296949:
        if (this.F) {
          this.F = false;
          this.w.setImageResource(2131231058);
          this.z.setVisibility(0);
          this.x.setVisibility(8);
          this.y.setVisibility(8);
          this.v.setText(getResources().getString(2131755514));
          this.E.clear();
          this.u.H(false);
          this.u.i();
        } else {
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } 
      case 2131296712:
        break;
    } 
    startActivity(new Intent(getApplicationContext(), SelectVideoActivity.class));
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492930);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    e0();
    d0();
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      if (this.C != null)
        b.p.a.a.b(getApplicationContext()).e(this.C); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
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
  
  class a implements Runnable {
    a(ManageDiyActivity this$0) {}
    
    public void run() {
      try {
        ManageDiyActivity.O(this.b).clear();
        HomeInfo homeInfo = com.allinone.callerid.d.b.e.e().g();
        if (homeInfo != null) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("default_diy:");
            stringBuilder.append(homeInfo.toString());
            d0.a("callscreen", stringBuilder.toString());
          } 
          PersonaliseContact personaliseContact = new PersonaliseContact();
          this();
          personaliseContact.setThemtname(homeInfo.getName());
          personaliseContact.setPath(homeInfo.getPath());
          personaliseContact.setIs_default(true);
          personaliseContact.setIsdiy(true);
          ManageDiyActivity.O(this.b).add(personaliseContact);
        } 
        List<PersonaliseContact> list = com.allinone.callerid.d.b.c.d().e();
        if (list != null && list.size() > 0) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("contacts_diy:");
            stringBuilder.append(list.toString());
            d0.a("callscreen", stringBuilder.toString());
          } 
          for (byte b = 0; b < list.size(); b++) {
            PersonaliseContact personaliseContact = list.get(b);
            String str = personaliseContact.getPath();
            for (int i = list.size() - 1; i > b; i--) {
              if (str.equals(((PersonaliseContact)list.get(i)).getPath())) {
                personaliseContact.setContacts_counts(personaliseContact.getContacts_counts() + 1);
                list.remove(i);
              } 
            } 
          } 
          ManageDiyActivity.O(this.b).addAll(list);
        } 
        ManageDiyActivity manageDiyActivity = this.b;
        a a1 = new a();
        this(this);
        manageDiyActivity.runOnUiThread(a1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements Runnable {
      a(ManageDiyActivity.a this$0) {}
      
      public void run() {
        if (ManageDiyActivity.O(this.b.b) != null) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("diy_list:");
            stringBuilder.append(ManageDiyActivity.O(this.b.b).toString());
            d0.a("callscreen", stringBuilder.toString());
          } 
          ManageDiyActivity.P(this.b.b).A(ManageDiyActivity.O(this.b.b), true);
          ManageDiyActivity.P(this.b.b).i();
          if (ManageDiyActivity.O(this.b.b).size() > 0) {
            ManageDiyActivity.V(this.b.b).setVisibility(8);
          } else {
            ManageDiyActivity.W(this.b.b);
          } 
        } else {
          ManageDiyActivity.W(this.b.b);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(ManageDiyActivity this$0) {}
    
    public void run() {
      if (ManageDiyActivity.O(this.b.b) != null) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("diy_list:");
          stringBuilder.append(ManageDiyActivity.O(this.b.b).toString());
          d0.a("callscreen", stringBuilder.toString());
        } 
        ManageDiyActivity.P(this.b.b).A(ManageDiyActivity.O(this.b.b), true);
        ManageDiyActivity.P(this.b.b).i();
        if (ManageDiyActivity.O(this.b.b).size() > 0) {
          ManageDiyActivity.V(this.b.b).setVisibility(8);
        } else {
          ManageDiyActivity.W(this.b.b);
        } 
      } else {
        ManageDiyActivity.W(this.b.b);
      } 
    }
  }
  
  class b implements com.allinone.callerid.d.a.c.b {
    b(ManageDiyActivity this$0) {}
    
    public void a(View param1View, int param1Int, List<PersonaliseContact> param1List) {
      boolean bool;
      ManageDiyActivity.X(this.a).clear();
      ManageDiyActivity.X(this.a).addAll(param1List);
      TextView textView = ManageDiyActivity.Y(this.a);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(ManageDiyActivity.X(this.a).size());
      stringBuilder.append("/");
      stringBuilder.append(ManageDiyActivity.O(this.a).size());
      textView.setText(stringBuilder.toString());
      ManageDiyActivity manageDiyActivity = this.a;
      if (ManageDiyActivity.X(manageDiyActivity).size() == ManageDiyActivity.O(this.a).size()) {
        bool = true;
      } else {
        bool = false;
      } 
      ManageDiyActivity.Z(manageDiyActivity, bool);
    }
  }
  
  class c implements DialogInterface.OnClickListener {
    c(ManageDiyActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class d implements DialogInterface.OnClickListener {
    d(ManageDiyActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        ManageDiyActivity manageDiyActivity = this.b;
        ManageDiyActivity.a0(manageDiyActivity, ManageDiyActivity.X(manageDiyActivity));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class e implements Runnable {
    e(ManageDiyActivity this$0, List param1List) {}
    
    public void run() {
      List list = this.b;
      if (list != null && list.size() > 0)
        for (byte b = 0; b < this.b.size(); b++) {
          PersonaliseContact personaliseContact = this.b.get(b);
          if (personaliseContact.isIs_default())
            com.allinone.callerid.d.b.e.e().d(); 
          com.allinone.callerid.d.b.c.d().c(personaliseContact.getPath());
        }  
      this.c.runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(ManageDiyActivity.e this$0) {}
      
      public void run() {
        ManageDiyActivity.b0(this.b.c, false);
        ManageDiyActivity.Q(this.b.c).setImageResource(2131231058);
        ManageDiyActivity.R(this.b.c).setVisibility(0);
        ManageDiyActivity.S(this.b.c).setVisibility(8);
        ManageDiyActivity.T(this.b.c).setVisibility(8);
        ManageDiyActivity.Y(this.b.c).setText(this.b.c.getResources().getString(2131755514));
        ManageDiyActivity.X(this.b.c).clear();
        ManageDiyActivity.P(this.b.c).H(false);
        b.p.a.a.b((Context)this.b.c).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
        ManageDiyActivity.U(this.b.c);
      }
    }
  }
  
  class a implements Runnable {
    a(ManageDiyActivity this$0) {}
    
    public void run() {
      ManageDiyActivity.b0(this.b.c, false);
      ManageDiyActivity.Q(this.b.c).setImageResource(2131231058);
      ManageDiyActivity.R(this.b.c).setVisibility(0);
      ManageDiyActivity.S(this.b.c).setVisibility(8);
      ManageDiyActivity.T(this.b.c).setVisibility(8);
      ManageDiyActivity.Y(this.b.c).setText(this.b.c.getResources().getString(2131755514));
      ManageDiyActivity.X(this.b.c).clear();
      ManageDiyActivity.P(this.b.c).H(false);
      b.p.a.a.b((Context)this.b.c).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
      ManageDiyActivity.U(this.b.c);
    }
  }
  
  private class f extends BroadcastReceiver {
    private f(ManageDiyActivity this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (d0.a)
        d0.a("callscreen", "diy_Refresh"); 
      ManageDiyActivity.U(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/ManageDiyActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */