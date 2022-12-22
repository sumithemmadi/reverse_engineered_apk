package com.allinone.callerid.mvc.controller.nodisturb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.EZSimpleContact;
import com.allinone.callerid.bean.NoDisturbBean;
import com.allinone.callerid.customview.DeletableEditText;
import com.allinone.callerid.dialog.m;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.receiver.LocalBroadcastReceiver;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import java.util.ArrayList;

public class DisturbCustomActivity extends DisturbBaseActivity implements View.OnClickListener {
  private int A;
  
  private final String t = "DisturbCustomActivity";
  
  private RecyclerView u;
  
  private LinearLayout v;
  
  private FloatingActionMenu w;
  
  private com.allinone.callerid.b.a0.b x;
  
  private LocalBroadcastReceiver y;
  
  private Typeface z;
  
  private void a0(String paramString1, String paramString2) {
    if (paramString2 != null && paramString2.length() > 0) {
      NoDisturbBean noDisturbBean = new NoDisturbBean();
      noDisturbBean.setName(paramString1);
      noDisturbBean.setNumber(paramString2);
      com.allinone.callerid.i.a.k.e.c.a(noDisturbBean, new i(this));
    } 
  }
  
  private void b0() {
    m.h((Activity)this, new f(this));
  }
  
  private void c0() {
    m.g((Activity)this, new e(this));
  }
  
  private void d0() {
    try {
      View view = LayoutInflater.from((Context)this).inflate(2131493205, null);
      DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
      DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
      deletableEditText1.setHint(2131755120);
      deletableEditText2.setTypeface(this.z);
      deletableEditText2.setHint(2131755123);
      AlertDialog.Builder builder = new AlertDialog.Builder();
      this((Context)this);
      builder = builder.setMessage(getResources().getString(2131755077)).setView(view);
      String str2 = getResources().getString(2131755681);
      h h = new h();
      this(this, deletableEditText2, deletableEditText1);
      builder = builder.setPositiveButton(str2, h);
      String str1 = getResources().getString(2131755180);
      g g = new g();
      this(this);
      AlertDialog alertDialog = builder.setNegativeButton(str1, g).create();
      alertDialog.show();
      alertDialog.getButton(-1).setTextColor(this.A);
      alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void N() {
    super.N();
    com.allinone.callerid.i.a.k.e.c.c(new b(this));
  }
  
  protected void O() {
    setContentView(2131492923);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.A = d1.a((Context)this, 2130968859, 2131099706);
    ImageView imageView = (ImageView)findViewById(2131296603);
    TextView textView1 = (TextView)findViewById(2131296608);
    this.u = (RecyclerView)findViewById(2131296606);
    this.v = (LinearLayout)findViewById(2131296604);
    TextView textView2 = (TextView)findViewById(2131296605);
    FloatingActionMenu floatingActionMenu = (FloatingActionMenu)findViewById(2131296607);
    this.w = floatingActionMenu;
    floatingActionMenu.setContentDescription(getResources().getString(2131755077));
    FloatingActionButton floatingActionButton1 = (FloatingActionButton)findViewById(2131296693);
    FloatingActionButton floatingActionButton2 = (FloatingActionButton)findViewById(2131296695);
    FloatingActionButton floatingActionButton3 = (FloatingActionButton)findViewById(2131296694);
    Typeface typeface = g1.b();
    this.z = typeface;
    textView1.setTypeface(typeface);
    textView2.setTypeface(this.z);
    floatingActionButton1.setLabelTextType(this.z);
    floatingActionButton2.setLabelTextType(this.z);
    floatingActionButton3.setLabelTextType(this.z);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)this);
    linearLayoutManager.z2(1);
    this.u.setLayoutManager((RecyclerView.o)linearLayoutManager);
    this.u.setHasFixedSize(true);
    com.allinone.callerid.b.a0.b b1 = new com.allinone.callerid.b.a0.b((Context)this);
    this.x = b1;
    this.u.setAdapter((RecyclerView.Adapter)b1);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(this);
    floatingActionButton1.setOnClickListener(this);
    floatingActionButton2.setOnClickListener(this);
    floatingActionButton3.setOnClickListener(this);
    this.w.setClosedOnTouchOutside(true);
    this.y = new LocalBroadcastReceiver(new a(this));
    b.p.a.a.b((Context)this).c((BroadcastReceiver)this.y, new IntentFilter("com.allinone.callerid.WHITE_DATE_UPDATA"));
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296603) {
      switch (i) {
        default:
          return;
        case 2131296695:
          if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
            FloatingActionMenu floatingActionMenu1 = this.w;
            if (floatingActionMenu1 != null)
              floatingActionMenu1.g(true); 
            c0();
          } else {
            com.allinone.callerid.util.k1.a.o((Activity)this, new c(this));
          } 
        case 2131296694:
          if (com.allinone.callerid.util.k1.a.c((Context)this)) {
            FloatingActionMenu floatingActionMenu1 = this.w;
            if (floatingActionMenu1 != null)
              floatingActionMenu1.g(true); 
            b0();
          } else {
            com.allinone.callerid.util.k1.a.k((Activity)this, new d(this));
          } 
        case 2131296693:
          break;
      } 
      FloatingActionMenu floatingActionMenu = this.w;
      if (floatingActionMenu != null)
        floatingActionMenu.g(true); 
      d0();
    } 
    M();
  }
  
  public void onDestroy() {
    super.onDestroy();
    if (this.y != null)
      b.p.a.a.b((Context)this).e((BroadcastReceiver)this.y); 
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements LocalBroadcastReceiver.a {
    a(DisturbCustomActivity this$0) {}
    
    public void a(Intent param1Intent) {
      this.a.N();
    }
  }
  
  class b implements com.allinone.callerid.i.a.k.e.a {
    b(DisturbCustomActivity this$0) {}
    
    public void a(ArrayList<NoDisturbBean> param1ArrayList) {
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        DisturbCustomActivity.R(this.a).A(param1ArrayList, true);
        DisturbCustomActivity.R(this.a).i();
        DisturbCustomActivity.S(this.a).setVisibility(0);
        DisturbCustomActivity.T(this.a).setVisibility(8);
      } else {
        DisturbCustomActivity.T(this.a).setVisibility(0);
        DisturbCustomActivity.S(this.a).setVisibility(8);
      } 
    }
  }
  
  class c implements com.allinone.callerid.util.k1.a.g {
    c(DisturbCustomActivity this$0) {}
    
    public void a() {
      if (DisturbCustomActivity.U(this.a) != null)
        DisturbCustomActivity.U(this.a).g(true); 
      DisturbCustomActivity.V(this.a);
    }
  }
  
  class d implements com.allinone.callerid.util.k1.a.g {
    d(DisturbCustomActivity this$0) {}
    
    public void a() {
      if (DisturbCustomActivity.U(this.a) != null)
        DisturbCustomActivity.U(this.a).g(true); 
      DisturbCustomActivity.W(this.a);
    }
  }
  
  class e implements com.allinone.callerid.i.a.f.b {
    e(DisturbCustomActivity this$0) {}
    
    public void a(CallLogBean param1CallLogBean) {
      try {
        View view = LayoutInflater.from((Context)this.a).inflate(2131493205, null);
        DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
        DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
        deletableEditText1.setHint(2131755120);
        deletableEditText2.setTypeface(DisturbCustomActivity.X(this.a));
        deletableEditText2.setHint(2131755123);
        deletableEditText1.setText(param1CallLogBean.n());
        deletableEditText2.setText(param1CallLogBean.p());
        deletableEditText2.setSelection(deletableEditText2.getText().length());
        AlertDialog.Builder builder1 = new AlertDialog.Builder();
        this((Context)this.a);
        AlertDialog.Builder builder3 = builder1.setMessage(this.a.getResources().getString(2131755077)).setView(view);
        String str1 = this.a.getResources().getString(2131755681);
        b b1 = new b();
        this(this, deletableEditText2, deletableEditText1);
        AlertDialog.Builder builder2 = builder3.setPositiveButton(str1, b1);
        String str2 = this.a.getResources().getString(2131755180);
        a a = new a();
        this(this);
        AlertDialog alertDialog = builder2.setNegativeButton(str2, a).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(DisturbCustomActivity.Z(this.a));
        alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(DisturbCustomActivity.e this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(DisturbCustomActivity.e this$0, DeletableEditText param2DeletableEditText1, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str1 = this.b.getText().toString();
          String str2 = this.c.getText().toString();
          DisturbCustomActivity.Y(this.d.a, str2, str1);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(DisturbCustomActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(DisturbCustomActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        DisturbCustomActivity.Y(this.d.a, str2, str1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class f implements com.allinone.callerid.i.a.f.f {
    f(DisturbCustomActivity this$0) {}
    
    public void a(EZSimpleContact param1EZSimpleContact) {
      try {
        View view = LayoutInflater.from((Context)this.a).inflate(2131493205, null);
        DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
        DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
        deletableEditText1.setText(param1EZSimpleContact.getName());
        deletableEditText2.setTypeface(DisturbCustomActivity.X(this.a));
        deletableEditText2.setText(param1EZSimpleContact.getNumber());
        deletableEditText2.setSelection(deletableEditText2.getText().length());
        AlertDialog.Builder builder2 = new AlertDialog.Builder();
        this((Context)this.a);
        AlertDialog.Builder builder3 = builder2.setMessage(this.a.getResources().getString(2131755077)).setView(view);
        String str1 = this.a.getResources().getString(2131755681);
        b b = new b();
        this(this, deletableEditText2, deletableEditText1);
        AlertDialog.Builder builder1 = builder3.setPositiveButton(str1, b);
        String str2 = this.a.getResources().getString(2131755180);
        a a = new a();
        this(this);
        AlertDialog alertDialog = builder1.setNegativeButton(str2, a).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(DisturbCustomActivity.Z(this.a));
        alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(DisturbCustomActivity.f this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(DisturbCustomActivity.f this$0, DeletableEditText param2DeletableEditText1, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str1 = this.b.getText().toString();
          String str2 = this.c.getText().toString();
          DisturbCustomActivity.Y(this.d.a, str2, str1);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(DisturbCustomActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(DisturbCustomActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        DisturbCustomActivity.Y(this.d.a, str2, str1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements DialogInterface.OnClickListener {
    g(DisturbCustomActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class h implements DialogInterface.OnClickListener {
    h(DisturbCustomActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        DisturbCustomActivity.Y(this.d, str2, str1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class i implements com.allinone.callerid.i.a.k.e.b {
    i(DisturbCustomActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      b.p.a.a.b(this.a.getApplicationContext()).d(new Intent("com.allinone.callerid.WHITE_DATE_UPDATA"));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/nodisturb/DisturbCustomActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */