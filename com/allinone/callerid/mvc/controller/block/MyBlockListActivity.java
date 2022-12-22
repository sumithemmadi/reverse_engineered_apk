package com.allinone.callerid.mvc.controller.block;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.CustomBlock;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.bean.EZSimpleContact;
import com.allinone.callerid.customview.DeletableEditText;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class MyBlockListActivity extends BaseActivity implements View.OnClickListener {
  private ImageView A;
  
  private ImageView B;
  
  private List<CustomBlock> C = new ArrayList<CustomBlock>();
  
  private FloatingActionButton D;
  
  private boolean E;
  
  private boolean F;
  
  private Handler G = new r(this, null);
  
  private LayoutInflater H;
  
  private androidx.appcompat.app.a I;
  
  private int J;
  
  private RelativeLayout K;
  
  private FloatingActionMenu L;
  
  private List<Object> M = new ArrayList();
  
  private LinearLayout N;
  
  private Typeface O;
  
  private final String s = "MyBlockListActivity";
  
  private ImageView t;
  
  private TextView u;
  
  private com.allinone.callerid.util.m v;
  
  private ListView w;
  
  private q x;
  
  private RelativeLayout y;
  
  private List<EZBlackList> z = new ArrayList<EZBlackList>();
  
  private void J0() {
    if (i1.f0(getApplicationContext()).booleanValue()) {
      this.t.setImageResource(2131231059);
    } else {
      this.t.setImageResource(2131231058);
    } 
  }
  
  private void L0() {
    List<Object> list = this.M;
    if (list != null && list.size() > 0) {
      this.N.setVisibility(8);
      if (!b1.y2().booleanValue()) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
          com.allinone.callerid.dialog.f f = new com.allinone.callerid.dialog.f((Context)this, 2131820783);
          f.setCanceledOnTouchOutside(false);
          f.show();
        } 
      } 
    } else {
      if (!b1.y2().booleanValue()) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
          com.allinone.callerid.util.q.b().c("block_norifi_per_show");
          this.N.setVisibility(0);
          this.K.setVisibility(8);
          return;
        } 
      } 
      this.N.setVisibility(8);
      this.K.setVisibility(0);
    } 
  }
  
  private void M0() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext()) && this.L.s())
      this.L.u(true); 
  }
  
  private void N0() {
    try {
      if (!isFinishing()) {
        androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a();
        this((Context)this);
        androidx.appcompat.app.a.a a3 = a2.h(getResources().getString(2131755283));
        String str1 = getResources().getString(2131755836);
        o o = new o();
        this(this);
        androidx.appcompat.app.a.a a4 = a3.n(str1, o);
        String str2 = getResources().getString(2131755180);
        n n = new n();
        this(this);
        androidx.appcompat.app.a a1 = a4.j(str2, n).a();
        a1.show();
        a1.g(-1).setTextColor(this.J);
        a1.g(-2).setTextColor(getResources().getColor(2131099695));
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void O() {
    (j0.a()).b.execute(new d(this));
  }
  
  private void O0(List<Object> paramList) {
    try {
      if (!isFinishing()) {
        androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a();
        this((Context)this);
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(getResources().getString(2131755290));
        stringBuilder.append(" ");
        stringBuilder.append(paramList.size());
        stringBuilder.append(" ");
        stringBuilder.append(getResources().getString(2131755291));
        androidx.appcompat.app.a.a a4 = a2.h(stringBuilder.toString());
        String str2 = getResources().getString(2131755836);
        b b = new b();
        this(this, paramList);
        androidx.appcompat.app.a.a a3 = a4.n(str2, b);
        String str1 = getResources().getString(2131755180);
        p p = new p();
        this(this);
        androidx.appcompat.app.a a1 = a3.j(str1, p).a();
        a1.show();
        a1.g(-1).setTextColor(this.J);
        a1.g(-2).setTextColor(getResources().getColor(2131099695));
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void P0(List<Object> paramList) {
    (j0.a()).b.execute(new c(this, paramList));
  }
  
  private void Q0() {
    (j0.a()).b.execute(new i(this));
  }
  
  private void R0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493124, null);
    Z0(view);
    this.w.addHeaderView(view, null, false);
  }
  
  private void S0() {
    this.N = (LinearLayout)findViewById(2131297190);
    ((FrameLayout)findViewById(2131296817)).setOnClickListener(this);
    ((TextView)findViewById(2131298038)).setTypeface(this.O);
    ((TextView)findViewById(2131297901)).setTypeface(this.O);
    FloatingActionMenu floatingActionMenu = (FloatingActionMenu)findViewById(2131297697);
    this.L = floatingActionMenu;
    floatingActionMenu.setContentDescription(getResources().getString(2131755077));
    this.L.setClosedOnTouchOutside(true);
    FloatingActionButton floatingActionButton2 = (FloatingActionButton)findViewById(2131296693);
    FloatingActionButton floatingActionButton3 = (FloatingActionButton)findViewById(2131296695);
    FloatingActionButton floatingActionButton1 = (FloatingActionButton)findViewById(2131296694);
    floatingActionButton2.setOnClickListener(this);
    floatingActionButton3.setOnClickListener(this);
    floatingActionButton1.setOnClickListener(this);
    floatingActionButton2.setLabelTextType(this.O);
    floatingActionButton3.setLabelTextType(this.O);
    floatingActionButton1.setLabelTextType(this.O);
    this.L.setMenuButtonShowAnimation(AnimationUtils.loadAnimation((Context)this, 2130772045));
    this.L.setMenuButtonHideAnimation(AnimationUtils.loadAnimation((Context)this, 2130772033));
    this.L.setOnMenuToggleListener(new j(this));
  }
  
  private void T0(List<Object> paramList) {
    if (paramList != null && paramList.size() > 0)
      for (byte b = 0; b < paramList.size(); b++) {
        Object object = paramList.get(b);
        if (object instanceof CustomBlock) {
          object = object;
          this.M.remove(object);
        } else {
          object = object;
          if (object.getIs_myblock() != null && object.getIs_myblock().equals("true"))
            this.M.remove(object); 
        } 
      }  
  }
  
  private void U0(String paramString1, String paramString2, boolean paramBoolean) {
    if (paramString2 != null) {
      try {
        if (!"".equals(paramString2)) {
          m m1 = new m();
          this(this, paramString2, paramString1, paramBoolean);
          com.allinone.callerid.i.a.e.b.b(paramString2, m1);
          return;
        } 
        Toast.makeText((Context)this, getResources().getString(2131755420), 0).show();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return;
    } 
    Toast.makeText((Context)this, getResources().getString(2131755420), 0).show();
  }
  
  private void V0() {
    com.allinone.callerid.dialog.m.h((Activity)this, new g(this));
  }
  
  private void W0() {
    com.allinone.callerid.dialog.m.g((Activity)this, new h(this));
  }
  
  private void X0() {
    try {
      if (!isFinishing()) {
        View view = this.H.inflate(2131493205, null);
        DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
        DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
        deletableEditText1.setHint(2131755120);
        deletableEditText2.setTypeface(this.O);
        deletableEditText2.setHint(2131755123);
        androidx.appcompat.app.a.a a4 = new androidx.appcompat.app.a.a();
        this((Context)this);
        androidx.appcompat.app.a.a a1 = a4.h(getResources().getString(2131755077)).r(view);
        String str2 = getResources().getString(2131755681);
        l l = new l();
        this(this, deletableEditText2, deletableEditText1);
        androidx.appcompat.app.a.a a3 = a1.n(str2, l);
        String str1 = getResources().getString(2131755180);
        k k = new k();
        this(this);
        androidx.appcompat.app.a a2 = a3.j(str1, k).a();
        a2.show();
        a2.g(-1).setTextColor(this.J);
        a2.g(-2).setTextColor(getResources().getColor(2131099695));
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void Z0(View paramView) {
    this.y = (RelativeLayout)paramView.findViewById(2131297513);
    ((TextView)paramView.findViewById(2131298232)).setTypeface(g1.a());
    K0();
  }
  
  public void K0() {
    if (this.y != null) {
      List<Object> list = this.M;
      if (list != null && !list.isEmpty() && this.M.size() > 0) {
        this.y.setVisibility(0);
        this.A.setVisibility(0);
        this.K.setVisibility(8);
      } else {
        this.y.setVisibility(8);
        this.A.setVisibility(8);
        this.K.setVisibility(0);
        if (this.B.getVisibility() == 0) {
          J0();
          this.B.setVisibility(8);
        } 
      } 
      L0();
    } 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296817) {
      switch (i) {
        default:
          return;
        case 2131296695:
          if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
            if (this.L.s())
              this.L.u(true); 
            W0();
          } else {
            com.allinone.callerid.util.k1.a.o((Activity)this, new e(this));
          } 
        case 2131296694:
          if (com.allinone.callerid.util.k1.a.c(getApplicationContext())) {
            if (this.L.s())
              this.L.u(true); 
            V0();
          } else {
            com.allinone.callerid.util.k1.a.k((Activity)this, new f(this));
          } 
        case 2131296693:
          if (this.L.s())
            this.L.u(true); 
          X0();
        case 2131296692:
          break;
      } 
      if (this.L.s())
        this.L.u(true); 
      com.allinone.callerid.util.q.b().c(h1.q);
      Intent intent = new Intent();
      intent.setClass((Context)this, AddCustomNumActivity.class);
      startActivity(intent);
      overridePendingTransition(2130771968, 2130771969);
      finish();
    } 
    com.allinone.callerid.util.q.b().c("block_norifi_per_click");
    com.allinone.callerid.util.k1.b.a = true;
    com.allinone.callerid.util.k1.b.c(getApplicationContext());
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492932);
    this.O = g1.b();
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.J = d1.a((Context)this, 2130968859, 2131099706);
    this.H = LayoutInflater.from((Context)this);
    getWindow().getDecorView().post(new a(this));
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      try {
        ImageView imageView = this.B;
        if (imageView != null && imageView.getVisibility() == 0) {
          imageView = this.t;
          if (imageView != null)
            imageView.setImageResource(2131231058); 
          this.B.setVisibility(8);
          this.E = false;
          this.F = false;
          List<EZBlackList> list = this.z;
          if (list != null && list.size() > 0)
            for (paramInt = 0; paramInt < this.z.size(); paramInt++)
              ((EZBlackList)this.z.get(paramInt)).setIsselected(false);  
          q q1 = this.x;
          if (q1 != null)
            q1.notifyDataSetChanged(); 
        } else {
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return true;
    } 
    return super.onKeyDown(paramInt, (KeyEvent)exception);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
    if (com.allinone.callerid.util.k1.b.a) {
      if (com.allinone.callerid.util.k1.b.b(getApplicationContext()))
        com.allinone.callerid.util.q.b().c("dialog_notifi_per_tip_enalbleed"); 
      com.allinone.callerid.util.k1.b.a = false;
      L0();
    } 
  }
  
  class a implements Runnable {
    a(MyBlockListActivity this$0) {}
    
    public void run() {
      MyBlockListActivity myBlockListActivity1 = this.b;
      MyBlockListActivity.D0(myBlockListActivity1, (FloatingActionButton)myBlockListActivity1.findViewById(2131296692));
      MyBlockListActivity.C0(this.b).setLabelTextType(MyBlockListActivity.E0(this.b));
      MyBlockListActivity.C0(this.b).setOnClickListener(this.b);
      myBlockListActivity1 = this.b;
      MyBlockListActivity.G0(myBlockListActivity1, (TextView)myBlockListActivity1.findViewById(2131297808));
      myBlockListActivity1 = this.b;
      MyBlockListActivity.I0(myBlockListActivity1, (ImageView)myBlockListActivity1.findViewById(2131297120));
      myBlockListActivity1 = this.b;
      MyBlockListActivity.R(myBlockListActivity1, (ImageView)myBlockListActivity1.findViewById(2131296850));
      MyBlockListActivity.S(this.b);
      MyBlockListActivity.Q(this.b).setOnClickListener(new a(this));
      myBlockListActivity1 = this.b;
      MyBlockListActivity.Y(myBlockListActivity1, (ImageView)myBlockListActivity1.findViewById(2131297112));
      MyBlockListActivity.X(this.b).setOnClickListener(new b(this));
      MyBlockListActivity.H0(this.b).setOnClickListener(new c(this));
      myBlockListActivity1 = this.b;
      MyBlockListActivity.b0(myBlockListActivity1, (RelativeLayout)myBlockListActivity1.findViewById(2131297515));
      ((TextView)this.b.findViewById(2131297807)).setTypeface(MyBlockListActivity.E0(this.b));
      MyBlockListActivity.c0(this.b);
      MyBlockListActivity.F0(this.b).setTypeface(MyBlockListActivity.E0(this.b));
      myBlockListActivity1 = this.b;
      MyBlockListActivity.e0(myBlockListActivity1, new com.allinone.callerid.util.m(myBlockListActivity1.getApplicationContext()));
      myBlockListActivity1 = this.b;
      MyBlockListActivity.h0(myBlockListActivity1, (ListView)myBlockListActivity1.findViewById(2131297336));
      MyBlockListActivity myBlockListActivity2 = this.b;
      myBlockListActivity1 = this.b;
      MyBlockListActivity.u0(myBlockListActivity2, new MyBlockListActivity.q(myBlockListActivity1, (Context)myBlockListActivity1, MyBlockListActivity.P(myBlockListActivity1)));
      MyBlockListActivity.j0(this.b);
      MyBlockListActivity.g0(this.b).setAdapter((ListAdapter)MyBlockListActivity.s0(this.b));
      MyBlockListActivity.k0(this.b);
    }
    
    class a implements View.OnClickListener {
      a(MyBlockListActivity.a this$0) {}
      
      public void onClick(View param2View) {
        if (MyBlockListActivity.H0(this.b.b).getVisibility() == 0) {
          MyBlockListActivity.S(this.b.b);
          MyBlockListActivity.H0(this.b.b).setVisibility(8);
          MyBlockListActivity.U(this.b.b, false);
          MyBlockListActivity.W(this.b.b, false);
          if (MyBlockListActivity.A0(this.b.b) != null && MyBlockListActivity.A0(this.b.b).size() > 0)
            for (byte b = 0; b < MyBlockListActivity.A0(this.b.b).size(); b++)
              ((EZBlackList)MyBlockListActivity.A0(this.b.b).get(b)).setIsselected(false);  
          if (MyBlockListActivity.s0(this.b.b) != null)
            MyBlockListActivity.s0(this.b.b).notifyDataSetChanged(); 
        } else {
          this.b.b.finish();
          this.b.b.overridePendingTransition(2130771968, 2130771969);
        } 
      }
    }
    
    class b implements View.OnClickListener {
      b(MyBlockListActivity.a this$0) {}
      
      public void onClick(View param2View) {
        if (!MyBlockListActivity.V(this.b.b) && !MyBlockListActivity.T(this.b.b)) {
          MyBlockListActivity.Z(this.b.b);
        } else {
          ArrayList<EZBlackList> arrayList = new ArrayList();
          List list = MyBlockListActivity.A0(this.b.b);
          byte b1 = 0;
          if (list != null && MyBlockListActivity.A0(this.b.b).size() > 0)
            for (byte b2 = 0; b2 < MyBlockListActivity.A0(this.b.b).size(); b2++) {
              EZBlackList eZBlackList = MyBlockListActivity.A0(this.b.b).get(b2);
              if (eZBlackList.isselected())
                arrayList.add(eZBlackList); 
            }  
          if (MyBlockListActivity.f0(this.b.b) != null && MyBlockListActivity.f0(this.b.b).size() > 0)
            for (byte b2 = b1; b2 < MyBlockListActivity.f0(this.b.b).size(); b2++) {
              CustomBlock customBlock = MyBlockListActivity.f0(this.b.b).get(b2);
              if (customBlock.isselected())
                arrayList.add(customBlock); 
            }  
          if (arrayList.size() > 0 && !arrayList.isEmpty())
            MyBlockListActivity.a0(this.b.b, arrayList); 
        } 
      }
    }
    
    class c implements View.OnClickListener {
      c(MyBlockListActivity.a this$0) {}
      
      public void onClick(View param2View) {
        boolean bool = MyBlockListActivity.V(this.b.b);
        byte b = 0;
        if (bool) {
          if (MyBlockListActivity.A0(this.b.b) != null && MyBlockListActivity.A0(this.b.b).size() > 0)
            for (byte b1 = 0; b1 < MyBlockListActivity.A0(this.b.b).size(); b1++)
              ((EZBlackList)MyBlockListActivity.A0(this.b.b).get(b1)).setIsselected(false);  
          if (MyBlockListActivity.f0(this.b.b) != null && MyBlockListActivity.f0(this.b.b).size() > 0)
            for (byte b1 = 0; b1 < MyBlockListActivity.f0(this.b.b).size(); b1++)
              ((CustomBlock)MyBlockListActivity.f0(this.b.b).get(b1)).setIsselected(false);  
          MyBlockListActivity.W(this.b.b, false);
        } else {
          if (MyBlockListActivity.A0(this.b.b) != null && MyBlockListActivity.A0(this.b.b).size() > 0)
            for (byte b1 = 0; b1 < MyBlockListActivity.A0(this.b.b).size(); b1++)
              ((EZBlackList)MyBlockListActivity.A0(this.b.b).get(b1)).setIsselected(true);  
          if (MyBlockListActivity.f0(this.b.b) != null && MyBlockListActivity.f0(this.b.b).size() > 0)
            for (byte b1 = b; b1 < MyBlockListActivity.f0(this.b.b).size(); b1++)
              ((CustomBlock)MyBlockListActivity.f0(this.b.b).get(b1)).setIsselected(true);  
          MyBlockListActivity.W(this.b.b, true);
        } 
        if (MyBlockListActivity.s0(this.b.b) != null)
          MyBlockListActivity.s0(this.b.b).notifyDataSetChanged(); 
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(MyBlockListActivity this$0) {}
    
    public void onClick(View param1View) {
      if (MyBlockListActivity.H0(this.b.b).getVisibility() == 0) {
        MyBlockListActivity.S(this.b.b);
        MyBlockListActivity.H0(this.b.b).setVisibility(8);
        MyBlockListActivity.U(this.b.b, false);
        MyBlockListActivity.W(this.b.b, false);
        if (MyBlockListActivity.A0(this.b.b) != null && MyBlockListActivity.A0(this.b.b).size() > 0)
          for (byte b = 0; b < MyBlockListActivity.A0(this.b.b).size(); b++)
            ((EZBlackList)MyBlockListActivity.A0(this.b.b).get(b)).setIsselected(false);  
        if (MyBlockListActivity.s0(this.b.b) != null)
          MyBlockListActivity.s0(this.b.b).notifyDataSetChanged(); 
      } else {
        this.b.b.finish();
        this.b.b.overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  class b implements View.OnClickListener {
    b(MyBlockListActivity this$0) {}
    
    public void onClick(View param1View) {
      if (!MyBlockListActivity.V(this.b.b) && !MyBlockListActivity.T(this.b.b)) {
        MyBlockListActivity.Z(this.b.b);
      } else {
        ArrayList<EZBlackList> arrayList = new ArrayList();
        List list = MyBlockListActivity.A0(this.b.b);
        byte b1 = 0;
        if (list != null && MyBlockListActivity.A0(this.b.b).size() > 0)
          for (byte b2 = 0; b2 < MyBlockListActivity.A0(this.b.b).size(); b2++) {
            EZBlackList eZBlackList = MyBlockListActivity.A0(this.b.b).get(b2);
            if (eZBlackList.isselected())
              arrayList.add(eZBlackList); 
          }  
        if (MyBlockListActivity.f0(this.b.b) != null && MyBlockListActivity.f0(this.b.b).size() > 0)
          for (byte b2 = b1; b2 < MyBlockListActivity.f0(this.b.b).size(); b2++) {
            CustomBlock customBlock = MyBlockListActivity.f0(this.b.b).get(b2);
            if (customBlock.isselected())
              arrayList.add(customBlock); 
          }  
        if (arrayList.size() > 0 && !arrayList.isEmpty())
          MyBlockListActivity.a0(this.b.b, arrayList); 
      } 
    }
  }
  
  class c implements View.OnClickListener {
    c(MyBlockListActivity this$0) {}
    
    public void onClick(View param1View) {
      boolean bool = MyBlockListActivity.V(this.b.b);
      byte b = 0;
      if (bool) {
        if (MyBlockListActivity.A0(this.b.b) != null && MyBlockListActivity.A0(this.b.b).size() > 0)
          for (byte b1 = 0; b1 < MyBlockListActivity.A0(this.b.b).size(); b1++)
            ((EZBlackList)MyBlockListActivity.A0(this.b.b).get(b1)).setIsselected(false);  
        if (MyBlockListActivity.f0(this.b.b) != null && MyBlockListActivity.f0(this.b.b).size() > 0)
          for (byte b1 = 0; b1 < MyBlockListActivity.f0(this.b.b).size(); b1++)
            ((CustomBlock)MyBlockListActivity.f0(this.b.b).get(b1)).setIsselected(false);  
        MyBlockListActivity.W(this.b.b, false);
      } else {
        if (MyBlockListActivity.A0(this.b.b) != null && MyBlockListActivity.A0(this.b.b).size() > 0)
          for (byte b1 = 0; b1 < MyBlockListActivity.A0(this.b.b).size(); b1++)
            ((EZBlackList)MyBlockListActivity.A0(this.b.b).get(b1)).setIsselected(true);  
        if (MyBlockListActivity.f0(this.b.b) != null && MyBlockListActivity.f0(this.b.b).size() > 0)
          for (byte b1 = b; b1 < MyBlockListActivity.f0(this.b.b).size(); b1++)
            ((CustomBlock)MyBlockListActivity.f0(this.b.b).get(b1)).setIsselected(true);  
        MyBlockListActivity.W(this.b.b, true);
      } 
      if (MyBlockListActivity.s0(this.b.b) != null)
        MyBlockListActivity.s0(this.b.b).notifyDataSetChanged(); 
    }
  }
  
  class b implements DialogInterface.OnClickListener {
    b(MyBlockListActivity this$0, List param1List) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        MyBlockListActivity.o0(this.c, this.b);
        MyBlockListActivity.p0(this.c, this.b);
        this.c.K0();
        MyBlockListActivity.s0(this.c).i(MyBlockListActivity.P(this.c));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class c implements Runnable {
    c(MyBlockListActivity this$0, List param1List) {}
    
    public void run() {
      List list = this.b;
      if (list != null && list.size() > 0)
        for (byte b = 0; b < this.b.size(); b++) {
          CustomBlock customBlock;
          list = this.b.get(b);
          if (list instanceof CustomBlock) {
            customBlock = (CustomBlock)list;
            MyBlockListActivity.d0(this.c).e(customBlock.getNumber());
          } else {
            EZBlackList eZBlackList = (EZBlackList)customBlock;
            MyBlockListActivity.d0(this.c).c(eZBlackList.getNumber());
          } 
        }  
    }
  }
  
  class d implements Runnable {
    d(MyBlockListActivity this$0) {}
    
    public void run() {
      MyBlockListActivity myBlockListActivity = this.b;
      MyBlockListActivity.B0(myBlockListActivity, MyBlockListActivity.d0(myBlockListActivity).h());
      if (MyBlockListActivity.A0(this.b) != null)
        MyBlockListActivity.l0(this.b).sendEmptyMessage(200); 
    }
  }
  
  class e implements com.allinone.callerid.util.k1.a.g {
    e(MyBlockListActivity this$0) {}
    
    public void a() {
      if (MyBlockListActivity.q0(this.a).s())
        MyBlockListActivity.q0(this.a).u(true); 
      MyBlockListActivity.r0(this.a);
    }
  }
  
  class f implements com.allinone.callerid.util.k1.a.g {
    f(MyBlockListActivity this$0) {}
    
    public void a() {
      if (MyBlockListActivity.q0(this.a).s())
        MyBlockListActivity.q0(this.a).u(true); 
      MyBlockListActivity.t0(this.a);
    }
  }
  
  class g implements com.allinone.callerid.i.a.f.f {
    g(MyBlockListActivity this$0) {}
    
    public void a(EZSimpleContact param1EZSimpleContact) {
      try {
        if (!this.a.isFinishing()) {
          View view = LayoutInflater.from((Context)this.a).inflate(2131493205, null);
          DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
          DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
          deletableEditText1.setText(param1EZSimpleContact.getName());
          deletableEditText2.setTypeface(MyBlockListActivity.E0(this.a));
          deletableEditText2.setText(param1EZSimpleContact.getNumber());
          deletableEditText2.setSelection(deletableEditText2.getText().length());
          AlertDialog.Builder builder1 = new AlertDialog.Builder();
          this((Context)this.a);
          builder1 = builder1.setMessage(this.a.getResources().getString(2131755077)).setView(view);
          String str1 = this.a.getResources().getString(2131755681);
          b b = new b();
          this(this, deletableEditText2, deletableEditText1);
          AlertDialog.Builder builder2 = builder1.setPositiveButton(str1, b);
          String str2 = this.a.getResources().getString(2131755180);
          a a = new a();
          this(this);
          AlertDialog alertDialog = builder2.setNegativeButton(str2, a).create();
          alertDialog.show();
          alertDialog.getButton(-1).setTextColor(MyBlockListActivity.v0(this.a));
          alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(MyBlockListActivity.g this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(MyBlockListActivity.g this$0, DeletableEditText param2DeletableEditText1, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str2 = this.b.getText().toString();
          String str1 = this.c.getText().toString();
          MyBlockListActivity.n0(this.d.a, str1, str2, false);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(MyBlockListActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(MyBlockListActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str2 = this.b.getText().toString();
        String str1 = this.c.getText().toString();
        MyBlockListActivity.n0(this.d.a, str1, str2, false);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class h implements com.allinone.callerid.i.a.f.b {
    h(MyBlockListActivity this$0) {}
    
    public void a(CallLogBean param1CallLogBean) {
      try {
        if (!this.a.isFinishing()) {
          View view = LayoutInflater.from((Context)this.a).inflate(2131493205, null);
          DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
          DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
          deletableEditText1.setHint(2131755120);
          deletableEditText2.setTypeface(MyBlockListActivity.E0(this.a));
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
          alertDialog.getButton(-1).setTextColor(MyBlockListActivity.v0(this.a));
          alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(MyBlockListActivity.h this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(MyBlockListActivity.h this$0, DeletableEditText param2DeletableEditText1, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str2 = this.b.getText().toString();
          String str1 = this.c.getText().toString();
          MyBlockListActivity.n0(this.d.a, str1, str2, true);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(MyBlockListActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(MyBlockListActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str2 = this.b.getText().toString();
        String str1 = this.c.getText().toString();
        MyBlockListActivity.n0(this.d.a, str1, str2, true);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class i implements Runnable {
    i(MyBlockListActivity this$0) {}
    
    public void run() {
      MyBlockListActivity myBlockListActivity = this.b;
      MyBlockListActivity.i0(myBlockListActivity, MyBlockListActivity.d0(myBlockListActivity).f());
      MyBlockListActivity.l0(this.b).sendEmptyMessage(100);
    }
  }
  
  class j implements FloatingActionMenu.h {
    j(MyBlockListActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.util.q.b().c("blacklist_add_clik");
        if (!b1.y2().booleanValue()) {
          int i = Build.VERSION.SDK_INT;
          if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(this.a.getApplicationContext())) {
            com.allinone.callerid.dialog.f f = new com.allinone.callerid.dialog.f((Context)this.a, 2131820783);
            f.setCanceledOnTouchOutside(false);
            f.setOnDismissListener(new a(this));
            f.show();
          } 
        } 
      } 
    }
    
    class a implements DialogInterface.OnDismissListener {
      a(MyBlockListActivity.j this$0) {}
      
      public void onDismiss(DialogInterface param2DialogInterface) {
        MyBlockListActivity.m0(this.b.a);
      }
    }
  }
  
  class a implements DialogInterface.OnDismissListener {
    a(MyBlockListActivity this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      MyBlockListActivity.m0(this.b.a);
    }
  }
  
  class k implements DialogInterface.OnClickListener {
    k(MyBlockListActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class l implements DialogInterface.OnClickListener {
    l(MyBlockListActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        MyBlockListActivity.n0(this.d, str2, str1, true);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class m implements com.allinone.callerid.i.a.e.a {
    m(MyBlockListActivity this$0, String param1String1, String param1String2, boolean param1Boolean) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        try {
          MyBlockListActivity myBlockListActivity = this.d;
          Toast.makeText((Context)myBlockListActivity, myBlockListActivity.getResources().getString(2131755131), 0).show();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        EZBlackList eZBlackList = new EZBlackList();
        this();
        eZBlackList.setNumber(this.a.replace("-", ""));
        eZBlackList.setName(this.b);
        eZBlackList.setIs_myblock("true");
        a a1 = new a();
        this(this);
        com.allinone.callerid.i.a.e.b.a(eZBlackList, a1);
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MyBlockListActivity.m this$0) {}
      
      public void a() {
        MyBlockListActivity.k0(this.a.d);
        com.allinone.callerid.util.q.b().c("add_blacklist");
        MyBlockListActivity myBlockListActivity = this.a.d;
        Toast.makeText((Context)myBlockListActivity, myBlockListActivity.getResources().getString(2131755131), 0).show();
        if (this.a.c) {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(MyBlockListActivity this$0) {}
    
    public void a() {
      MyBlockListActivity.k0(this.a.d);
      com.allinone.callerid.util.q.b().c("add_blacklist");
      MyBlockListActivity myBlockListActivity = this.a.d;
      Toast.makeText((Context)myBlockListActivity, myBlockListActivity.getResources().getString(2131755131), 0).show();
      if (this.a.c) {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      } 
    }
  }
  
  class n implements DialogInterface.OnClickListener {
    n(MyBlockListActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class o implements DialogInterface.OnClickListener {
    o(MyBlockListActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        if (MyBlockListActivity.A0(this.b) != null && MyBlockListActivity.A0(this.b).size() > 0) {
          a a = new a();
          this(this);
          com.allinone.callerid.i.a.e.b.c(a);
          MyBlockListActivity.A0(this.b).clear();
        } 
        if (MyBlockListActivity.f0(this.b) != null && MyBlockListActivity.f0(this.b).size() > 0) {
          b b = new b();
          this(this);
          com.allinone.callerid.i.a.e.b.d(b);
          MyBlockListActivity.f0(this.b).clear();
        } 
        if (MyBlockListActivity.P(this.b) != null && MyBlockListActivity.P(this.b).size() > 0)
          MyBlockListActivity.P(this.b).clear(); 
        MyBlockListActivity.s0(this.b).i(MyBlockListActivity.P(this.b));
        this.b.K0();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MyBlockListActivity.o this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(MyBlockListActivity.o this$0) {}
      
      public void a() {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(MyBlockListActivity this$0) {}
    
    public void a() {}
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(MyBlockListActivity this$0) {}
    
    public void a() {}
  }
  
  class p implements DialogInterface.OnClickListener {
    p(MyBlockListActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  public class q extends BaseAdapter {
    private List<Object> b = new ArrayList();
    
    private Context c;
    
    private int d;
    
    private int e;
    
    h f;
    
    public q(MyBlockListActivity this$0, Context param1Context, List<Object> param1List) {
      this.c = param1Context;
      this.b = param1List;
      this.d = d1.b(param1Context, 2130968686, 2131230858);
      this.e = d1.b(param1Context, 2130968687, 2131230859);
    }
    
    private void f(int param1Int1, Object param1Object, int param1Int2) {
      if (param1Int2 == 0) {
        try {
          String str1;
          String str2;
          CustomBlock customBlock = (CustomBlock)param1Object;
          if (customBlock.getType() == 3) {
            str1 = this.g.getResources().getString(2131755132);
            str2 = this.g.getResources().getString(2131755132);
          } else {
            str2 = str1.getNumber();
            str1 = str1.getNumber();
            String str = str1;
            str1 = str2;
            str2 = str;
          } 
          String str3 = str1;
          if (str2 != null) {
            str3 = str1;
            if (!"".equals(str2))
              str3 = str2; 
          } 
          if (!this.g.isFinishing()) {
            androidx.appcompat.app.a.a a3 = new androidx.appcompat.app.a.a();
            this((Context)this.g);
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.g.getResources().getString(2131755825));
            stringBuilder.append(" '");
            stringBuilder.append(str3);
            stringBuilder.append("' ?");
            androidx.appcompat.app.a.a a1 = a3.h(stringBuilder.toString());
            str3 = this.g.getResources().getString(2131755836);
            g g = new g();
            this(this, param1Int2, param1Object, param1Int1);
            androidx.appcompat.app.a.a a2 = a1.n(str3, g);
            param1Object = this.g.getResources().getString(2131755180);
            f f = new f();
            this(this);
            param1Object = a2.j((CharSequence)param1Object, f).a();
            param1Object.show();
            param1Object.g(-1).setTextColor(MyBlockListActivity.v0(this.g));
            param1Object.g(-2).setTextColor(this.g.getResources().getColor(2131099695));
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        EZBlackList eZBlackList = (EZBlackList)exception;
        String str2 = eZBlackList.getNumber();
        String str1 = eZBlackList.getName();
        String str3 = str1;
        str1 = str2;
        str2 = str3;
      } 
    }
    
    private void g(int param1Int) {
      // Byte code:
      //   0: iconst_0
      //   1: istore_2
      //   2: iload_1
      //   3: istore_3
      //   4: iload_2
      //   5: istore_1
      //   6: iload_1
      //   7: aload_0
      //   8: getfield b : Ljava/util/List;
      //   11: invokeinterface size : ()I
      //   16: if_icmpge -> 80
      //   19: aload_0
      //   20: getfield b : Ljava/util/List;
      //   23: iload_1
      //   24: invokeinterface get : (I)Ljava/lang/Object;
      //   29: astore #4
      //   31: aload #4
      //   33: instanceof com/allinone/callerid/bean/CustomBlock
      //   36: ifeq -> 55
      //   39: iload_3
      //   40: istore_2
      //   41: aload #4
      //   43: checkcast com/allinone/callerid/bean/CustomBlock
      //   46: invokevirtual isselected : ()Z
      //   49: ifeq -> 72
      //   52: goto -> 68
      //   55: iload_3
      //   56: istore_2
      //   57: aload #4
      //   59: checkcast com/allinone/callerid/bean/EZBlackList
      //   62: invokevirtual isselected : ()Z
      //   65: ifeq -> 72
      //   68: iload_3
      //   69: iconst_1
      //   70: iadd
      //   71: istore_2
      //   72: iinc #1, 1
      //   75: iload_2
      //   76: istore_3
      //   77: goto -> 6
      //   80: iload_3
      //   81: aload_0
      //   82: getfield b : Ljava/util/List;
      //   85: invokeinterface size : ()I
      //   90: if_icmpne -> 102
      //   93: aload_0
      //   94: getfield g : Lcom/allinone/callerid/mvc/controller/block/MyBlockListActivity;
      //   97: iconst_1
      //   98: invokestatic W : (Lcom/allinone/callerid/mvc/controller/block/MyBlockListActivity;Z)Z
      //   101: pop
      //   102: return
    }
    
    private void h(int param1Int) {
      // Byte code:
      //   0: iconst_0
      //   1: istore_2
      //   2: iload_2
      //   3: aload_0
      //   4: getfield b : Ljava/util/List;
      //   7: invokeinterface size : ()I
      //   12: if_icmpge -> 76
      //   15: aload_0
      //   16: getfield b : Ljava/util/List;
      //   19: iload_2
      //   20: invokeinterface get : (I)Ljava/lang/Object;
      //   25: astore_3
      //   26: aload_3
      //   27: instanceof com/allinone/callerid/bean/CustomBlock
      //   30: ifeq -> 49
      //   33: iload_1
      //   34: istore #4
      //   36: aload_3
      //   37: checkcast com/allinone/callerid/bean/CustomBlock
      //   40: invokevirtual isselected : ()Z
      //   43: ifne -> 67
      //   46: goto -> 62
      //   49: iload_1
      //   50: istore #4
      //   52: aload_3
      //   53: checkcast com/allinone/callerid/bean/EZBlackList
      //   56: invokevirtual isselected : ()Z
      //   59: ifne -> 67
      //   62: iload_1
      //   63: iconst_1
      //   64: iadd
      //   65: istore #4
      //   67: iinc #2, 1
      //   70: iload #4
      //   72: istore_1
      //   73: goto -> 2
      //   76: iload_1
      //   77: aload_0
      //   78: getfield b : Ljava/util/List;
      //   81: invokeinterface size : ()I
      //   86: if_icmpne -> 98
      //   89: aload_0
      //   90: getfield g : Lcom/allinone/callerid/mvc/controller/block/MyBlockListActivity;
      //   93: iconst_0
      //   94: invokestatic W : (Lcom/allinone/callerid/mvc/controller/block/MyBlockListActivity;Z)Z
      //   97: pop
      //   98: return
    }
    
    public void e(View param1View, int param1Int1, int param1Int2) {
      try {
        androidx.appcompat.app.a.a a;
        EZBlackList eZBlackList = (EZBlackList)this.b.get(param1Int1);
        int i = param1View.getId();
        switch (i) {
          default:
            return;
          case 2131297476:
            try {
              if (!this.g.isFinishing()) {
                View view = MyBlockListActivity.w0(this.g).inflate(2131493205, null);
                DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296645);
                DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296646);
                deletableEditText2.setTypeface(MyBlockListActivity.E0(this.g));
                deletableEditText1.setTypeface(MyBlockListActivity.E0(this.g));
                deletableEditText2.setHint(2131755120);
                deletableEditText1.setHint(2131755123);
                deletableEditText2.setText(eZBlackList.getName());
                deletableEditText1.setText(eZBlackList.getNumber());
                deletableEditText1.setSelection(deletableEditText1.getText().length());
                androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a();
                this((Context)this.g);
                androidx.appcompat.app.a.a a3 = a2.r(view).h(this.g.getResources().getString(2131755118));
                String str2 = this.g.getResources().getString(2131755681);
                e e = new e();
                this(this, deletableEditText1, eZBlackList, deletableEditText2);
                a = a3.n(str2, e);
                String str1 = this.g.getResources().getString(2131755180);
                d d = new d();
                this(this);
                androidx.appcompat.app.a a1 = a.j(str1, d).a();
                a1.show();
                a1.g(-1).setTextColor(MyBlockListActivity.v0(this.g));
                a1.g(-2).setTextColor(this.g.getResources().getColor(2131099695));
              } 
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          case 2131297475:
            break;
        } 
        f(param1Int1, a, param1Int2);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public int getCount() {
      return this.b.size();
    }
    
    public Object getItem(int param1Int) {
      return this.b.get(param1Int);
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public int getItemViewType(int param1Int) {
      return (this.b.get(param1Int) instanceof CustomBlock) ? 0 : ((this.b.get(param1Int) instanceof EZBlackList) ? 1 : 0);
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      String str1;
      String str2;
      View view;
      String str3;
      Boolean bool;
      int i = getItemViewType(param1Int);
      if (param1View == null) {
        this.f = new h(this);
        view = LayoutInflater.from(this.c).inflate(2131492967, null);
        this.f.a = (TextView)view.findViewById(2131296384);
        this.f.b = (TextView)view.findViewById(2131296385);
        this.f.a.setTypeface(MyBlockListActivity.E0(this.g));
        this.f.b.setTypeface(MyBlockListActivity.E0(this.g));
        this.f.f = (ImageView)view.findViewById(2131296383);
        this.f.c = (FrameLayout)view.findViewById(2131297469);
        this.f.d = (RelativeLayout)view.findViewById(2131297474);
        this.f.e = (RelativeLayout)view.findViewById(2131297473);
        view.setTag(this.f);
      } else {
        this.f = (h)param1View.getTag();
        view = param1View;
      } 
      if (param1Int == this.b.size() - 1) {
        this.f.d.setVisibility(0);
        this.f.e.setBackgroundResource(this.d);
      } else {
        this.f.e.setBackgroundResource(this.e);
        this.f.d.setVisibility(8);
      } 
      Object object = this.b.get(param1Int);
      if (i == 0) {
        CustomBlock customBlock = (CustomBlock)object;
        Boolean bool1 = Boolean.valueOf(customBlock.isselected());
        int j = customBlock.getType();
        if (j != 0) {
          if (j != 1) {
            if (j != 2) {
              if (j != 3) {
                str1 = "";
              } else {
                str1 = this.c.getResources().getString(2131755132);
              } 
            } else {
              str1 = this.c.getResources().getString(2131755309);
            } 
          } else {
            str1 = this.c.getResources().getString(2131755249);
          } 
        } else {
          str1 = this.c.getResources().getString(2131755111);
        } 
        if (j < 3) {
          str2 = customBlock.getNumber();
          String str = customBlock.getNumber();
          str3 = str1;
          str1 = str;
          bool = bool1;
        } else {
          String str = "";
          str2 = str;
          str3 = str1;
          str1 = str;
          bool = bool1;
        } 
      } else {
        EZBlackList eZBlackList = (EZBlackList)object;
        bool = Boolean.valueOf(eZBlackList.isselected());
        str3 = eZBlackList.getName();
        str2 = eZBlackList.getFormat_number();
        str1 = eZBlackList.getNumber();
      } 
      if (MyBlockListActivity.T(this.g)) {
        if (bool.booleanValue()) {
          this.f.f.setImageResource(2131231166);
        } else {
          this.f.f.setImageResource(2131231184);
        } 
      } else {
        this.f.f.setImageResource(2131231181);
      } 
      this.f.b.setVisibility(0);
      if (str3 != null && !"".equals(str3)) {
        this.f.a.setVisibility(0);
        this.f.a.setText(str3);
      } else {
        this.f.b.setVisibility(8);
        if (str2 != null && !"".equals(str2)) {
          this.f.a.setText(str2);
        } else {
          this.f.a.setText(str1);
        } 
      } 
      if (str2 != null && !"".equals(str2)) {
        this.f.b.setText(str2);
      } else {
        this.f.b.setText(str1);
      } 
      this.f.f.setOnClickListener(new a(this, i, object, param1Int));
      this.f.c.setOnClickListener(new b(this, i, object, param1Int));
      this.f.c.setOnLongClickListener(new c(this, i, object));
      return view;
    }
    
    public int getViewTypeCount() {
      return 2;
    }
    
    public void i(List<Object> param1List) {
      List<Object> list = this.b;
      if (list == null || list.size() == 0) {
        this.b = param1List;
      } else {
        this.b = param1List;
      } 
      notifyDataSetChanged();
    }
    
    class a implements View.OnClickListener {
      a(MyBlockListActivity.q this$0, int param2Int1, Object param2Object, int param2Int2) {}
      
      public void onClick(View param2View) {
        if (MyBlockListActivity.T(this.e.g)) {
          if (this.b == 0) {
            CustomBlock customBlock = (CustomBlock)this.c;
            if (customBlock.isselected()) {
              this.e.f.f.setImageResource(2131231184);
              customBlock.setIsselected(false);
              if (MyBlockListActivity.V(this.e.g))
                MyBlockListActivity.W(this.e.g, false); 
              MyBlockListActivity.q.a(this.e, 0);
            } else {
              this.e.f.f.setImageResource(2131231166);
              customBlock.setIsselected(true);
              MyBlockListActivity.q.b(this.e, 0);
            } 
          } else {
            EZBlackList eZBlackList = (EZBlackList)this.c;
            if (eZBlackList.isselected()) {
              this.e.f.f.setImageResource(2131231184);
              eZBlackList.setIsselected(false);
              MyBlockListActivity.q.a(this.e, 0);
            } else {
              this.e.f.f.setImageResource(2131231166);
              eZBlackList.setIsselected(true);
              MyBlockListActivity.q.b(this.e, 0);
            } 
          } 
          this.e.notifyDataSetChanged();
        } else {
          MyBlockListActivity.q.c(this.e, this.d, this.c, this.b);
        } 
      }
    }
    
    class b implements View.OnClickListener {
      b(MyBlockListActivity.q this$0, int param2Int1, Object param2Object, int param2Int2) {}
      
      public void onClick(View param2View) {
        if (MyBlockListActivity.T(this.e.g)) {
          if (this.b == 0) {
            CustomBlock customBlock = (CustomBlock)this.c;
            if (customBlock.isselected()) {
              this.e.f.f.setImageResource(2131231184);
              customBlock.setIsselected(false);
              MyBlockListActivity.W(this.e.g, false);
              MyBlockListActivity.q.a(this.e, 0);
            } else {
              this.e.f.f.setImageResource(2131231166);
              customBlock.setIsselected(true);
              MyBlockListActivity.q.b(this.e, 0);
            } 
          } else {
            EZBlackList eZBlackList = (EZBlackList)this.c;
            if (eZBlackList.isselected()) {
              this.e.f.f.setImageResource(2131231184);
              eZBlackList.setIsselected(false);
              MyBlockListActivity.q.a(this.e, 0);
            } else {
              this.e.f.f.setImageResource(2131231166);
              eZBlackList.setIsselected(true);
              MyBlockListActivity.q.b(this.e, 0);
            } 
          } 
          this.e.notifyDataSetChanged();
        } else if (this.b == 1) {
          param2View = MyBlockListActivity.w0(this.e.g).inflate(2131493204, null);
          TextView textView1 = (TextView)param2View.findViewById(2131296382);
          TextView textView2 = (TextView)param2View.findViewById(2131296381);
          FrameLayout frameLayout1 = (FrameLayout)param2View.findViewById(2131297476);
          FrameLayout frameLayout2 = (FrameLayout)param2View.findViewById(2131297475);
          textView1.setTypeface(MyBlockListActivity.E0(this.e.g));
          textView2.setTypeface(MyBlockListActivity.E0(this.e.g));
          a a = new a(this);
          frameLayout1.setOnClickListener(a);
          frameLayout2.setOnClickListener(a);
          if (!this.e.g.isFinishing()) {
            MyBlockListActivity myBlockListActivity = this.e.g;
            MyBlockListActivity.y0(myBlockListActivity, (new androidx.appcompat.app.a.a((Context)myBlockListActivity)).r(param2View).a());
            MyBlockListActivity.x0(this.e.g).show();
          } 
        } 
      }
      
      class a implements View.OnClickListener {
        a(MyBlockListActivity.q.b this$0) {}
        
        public void onClick(View param3View) {
          MyBlockListActivity.q.b b1 = this.b;
          b1.e.e(param3View, b1.d, b1.b);
          if (MyBlockListActivity.x0(this.b.e.g) != null)
            MyBlockListActivity.x0(this.b.e.g).dismiss(); 
        }
      }
    }
    
    class a implements View.OnClickListener {
      a(MyBlockListActivity.q this$0) {}
      
      public void onClick(View param2View) {
        MyBlockListActivity.q.b b1 = this.b;
        b1.e.e(param2View, b1.d, b1.b);
        if (MyBlockListActivity.x0(this.b.e.g) != null)
          MyBlockListActivity.x0(this.b.e.g).dismiss(); 
      }
    }
    
    class c implements View.OnLongClickListener {
      c(MyBlockListActivity.q this$0, int param2Int, Object param2Object) {}
      
      public boolean onLongClick(View param2View) {
        MyBlockListActivity.H0(this.d.g).setVisibility(0);
        MyBlockListActivity.Q(this.d.g).setImageResource(2131231347);
        MyBlockListActivity.U(this.d.g, true);
        if (this.b == 0) {
          ((CustomBlock)this.c).setIsselected(true);
        } else {
          ((EZBlackList)this.c).setIsselected(true);
        } 
        if (MyBlockListActivity.s0(this.d.g) != null)
          MyBlockListActivity.s0(this.d.g).notifyDataSetChanged(); 
        return true;
      }
    }
    
    class d implements DialogInterface.OnClickListener {
      d(MyBlockListActivity.q this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class e implements DialogInterface.OnClickListener {
      e(MyBlockListActivity.q this$0, DeletableEditText param2DeletableEditText1, EZBlackList param2EZBlackList, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          if (this.b.getText().toString() != null && !"".equals(this.b.getText().toString())) {
            if (this.c.getName() != null && "".equals(this.c.getName()))
              this.c.setIs_myblock("true"); 
            this.c.setName(this.d.getText().toString());
            this.c.setNumber(this.b.getText().toString().replace("-", ""));
            this.c.setFormat_number(this.b.getText().toString().replace("-", ""));
            EZBlackList eZBlackList = this.c;
            a a = new a();
            this(this);
            com.allinone.callerid.i.a.e.b.g(eZBlackList, a);
            MyBlockListActivity.s0(this.e.g).notifyDataSetChanged();
            this.e.g.K0();
          } else {
            Toast.makeText(this.e.g.getApplicationContext(), this.e.g.getResources().getString(2131755420), 0).show();
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(MyBlockListActivity.q.e this$0) {}
        
        public void a() {}
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MyBlockListActivity.q this$0) {}
      
      public void a() {}
    }
    
    class f implements DialogInterface.OnClickListener {
      f(MyBlockListActivity.q this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class g implements DialogInterface.OnClickListener {
      g(MyBlockListActivity.q this$0, int param2Int1, Object param2Object, int param2Int2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          if (this.b == 0) {
            String str = ((CustomBlock)this.c).getNumber();
            a a = new a();
            this(this);
            com.allinone.callerid.i.a.e.b.f(str, a);
          } else {
            String str = ((EZBlackList)this.c).getNumber();
            b b = new b();
            this(this);
            com.allinone.callerid.i.a.e.b.e(str, b);
          } 
          MyBlockListActivity.q.d(this.e).remove(this.d);
          this.e.g.K0();
          MyBlockListActivity.s0(this.e.g).notifyDataSetChanged();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(MyBlockListActivity.q.g this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(MyBlockListActivity.q.g this$0) {}
        
        public void a() {}
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MyBlockListActivity.q this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(MyBlockListActivity.q this$0) {}
      
      public void a() {}
    }
    
    public class h {
      TextView a;
      
      TextView b;
      
      FrameLayout c;
      
      RelativeLayout d;
      
      RelativeLayout e;
      
      ImageView f;
      
      public h(MyBlockListActivity.q this$0) {}
    }
  }
  
  class a implements View.OnClickListener {
    a(MyBlockListActivity this$0, int param1Int1, Object param1Object, int param1Int2) {}
    
    public void onClick(View param1View) {
      if (MyBlockListActivity.T(this.e.g)) {
        if (this.b == 0) {
          CustomBlock customBlock = (CustomBlock)this.c;
          if (customBlock.isselected()) {
            this.e.f.f.setImageResource(2131231184);
            customBlock.setIsselected(false);
            if (MyBlockListActivity.V(this.e.g))
              MyBlockListActivity.W(this.e.g, false); 
            MyBlockListActivity.q.a(this.e, 0);
          } else {
            this.e.f.f.setImageResource(2131231166);
            customBlock.setIsselected(true);
            MyBlockListActivity.q.b(this.e, 0);
          } 
        } else {
          EZBlackList eZBlackList = (EZBlackList)this.c;
          if (eZBlackList.isselected()) {
            this.e.f.f.setImageResource(2131231184);
            eZBlackList.setIsselected(false);
            MyBlockListActivity.q.a(this.e, 0);
          } else {
            this.e.f.f.setImageResource(2131231166);
            eZBlackList.setIsselected(true);
            MyBlockListActivity.q.b(this.e, 0);
          } 
        } 
        this.e.notifyDataSetChanged();
      } else {
        MyBlockListActivity.q.c(this.e, this.d, this.c, this.b);
      } 
    }
  }
  
  class b implements View.OnClickListener {
    b(MyBlockListActivity this$0, int param1Int1, Object param1Object, int param1Int2) {}
    
    public void onClick(View param1View) {
      if (MyBlockListActivity.T(this.e.g)) {
        if (this.b == 0) {
          CustomBlock customBlock = (CustomBlock)this.c;
          if (customBlock.isselected()) {
            this.e.f.f.setImageResource(2131231184);
            customBlock.setIsselected(false);
            MyBlockListActivity.W(this.e.g, false);
            MyBlockListActivity.q.a(this.e, 0);
          } else {
            this.e.f.f.setImageResource(2131231166);
            customBlock.setIsselected(true);
            MyBlockListActivity.q.b(this.e, 0);
          } 
        } else {
          EZBlackList eZBlackList = (EZBlackList)this.c;
          if (eZBlackList.isselected()) {
            this.e.f.f.setImageResource(2131231184);
            eZBlackList.setIsselected(false);
            MyBlockListActivity.q.a(this.e, 0);
          } else {
            this.e.f.f.setImageResource(2131231166);
            eZBlackList.setIsselected(true);
            MyBlockListActivity.q.b(this.e, 0);
          } 
        } 
        this.e.notifyDataSetChanged();
      } else if (this.b == 1) {
        param1View = MyBlockListActivity.w0(this.e.g).inflate(2131493204, null);
        TextView textView1 = (TextView)param1View.findViewById(2131296382);
        TextView textView2 = (TextView)param1View.findViewById(2131296381);
        FrameLayout frameLayout1 = (FrameLayout)param1View.findViewById(2131297476);
        FrameLayout frameLayout2 = (FrameLayout)param1View.findViewById(2131297475);
        textView1.setTypeface(MyBlockListActivity.E0(this.e.g));
        textView2.setTypeface(MyBlockListActivity.E0(this.e.g));
        a a = new a(this);
        frameLayout1.setOnClickListener(a);
        frameLayout2.setOnClickListener(a);
        if (!this.e.g.isFinishing()) {
          MyBlockListActivity myBlockListActivity = this.e.g;
          MyBlockListActivity.y0(myBlockListActivity, (new androidx.appcompat.app.a.a((Context)myBlockListActivity)).r(param1View).a());
          MyBlockListActivity.x0(this.e.g).show();
        } 
      } 
    }
    
    class a implements View.OnClickListener {
      a(MyBlockListActivity.q.b this$0) {}
      
      public void onClick(View param3View) {
        MyBlockListActivity.q.b b1 = this.b;
        b1.e.e(param3View, b1.d, b1.b);
        if (MyBlockListActivity.x0(this.b.e.g) != null)
          MyBlockListActivity.x0(this.b.e.g).dismiss(); 
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(MyBlockListActivity this$0) {}
    
    public void onClick(View param1View) {
      MyBlockListActivity.q.b b1 = this.b;
      b1.e.e(param1View, b1.d, b1.b);
      if (MyBlockListActivity.x0(this.b.e.g) != null)
        MyBlockListActivity.x0(this.b.e.g).dismiss(); 
    }
  }
  
  class c implements View.OnLongClickListener {
    c(MyBlockListActivity this$0, int param1Int, Object param1Object) {}
    
    public boolean onLongClick(View param1View) {
      MyBlockListActivity.H0(this.d.g).setVisibility(0);
      MyBlockListActivity.Q(this.d.g).setImageResource(2131231347);
      MyBlockListActivity.U(this.d.g, true);
      if (this.b == 0) {
        ((CustomBlock)this.c).setIsselected(true);
      } else {
        ((EZBlackList)this.c).setIsselected(true);
      } 
      if (MyBlockListActivity.s0(this.d.g) != null)
        MyBlockListActivity.s0(this.d.g).notifyDataSetChanged(); 
      return true;
    }
  }
  
  class d implements DialogInterface.OnClickListener {
    d(MyBlockListActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class e implements DialogInterface.OnClickListener {
    e(MyBlockListActivity this$0, DeletableEditText param1DeletableEditText1, EZBlackList param1EZBlackList, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        if (this.b.getText().toString() != null && !"".equals(this.b.getText().toString())) {
          if (this.c.getName() != null && "".equals(this.c.getName()))
            this.c.setIs_myblock("true"); 
          this.c.setName(this.d.getText().toString());
          this.c.setNumber(this.b.getText().toString().replace("-", ""));
          this.c.setFormat_number(this.b.getText().toString().replace("-", ""));
          EZBlackList eZBlackList = this.c;
          a a = new a();
          this(this);
          com.allinone.callerid.i.a.e.b.g(eZBlackList, a);
          MyBlockListActivity.s0(this.e.g).notifyDataSetChanged();
          this.e.g.K0();
        } else {
          Toast.makeText(this.e.g.getApplicationContext(), this.e.g.getResources().getString(2131755420), 0).show();
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MyBlockListActivity.q.e this$0) {}
      
      public void a() {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(MyBlockListActivity this$0) {}
    
    public void a() {}
  }
  
  class f implements DialogInterface.OnClickListener {
    f(MyBlockListActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class g implements DialogInterface.OnClickListener {
    g(MyBlockListActivity this$0, int param1Int1, Object param1Object, int param1Int2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        if (this.b == 0) {
          String str = ((CustomBlock)this.c).getNumber();
          a a = new a();
          this(this);
          com.allinone.callerid.i.a.e.b.f(str, a);
        } else {
          String str = ((EZBlackList)this.c).getNumber();
          b b = new b();
          this(this);
          com.allinone.callerid.i.a.e.b.e(str, b);
        } 
        MyBlockListActivity.q.d(this.e).remove(this.d);
        this.e.g.K0();
        MyBlockListActivity.s0(this.e.g).notifyDataSetChanged();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MyBlockListActivity.q.g this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(MyBlockListActivity.q.g this$0) {}
      
      public void a() {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(MyBlockListActivity this$0) {}
    
    public void a() {}
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(MyBlockListActivity this$0) {}
    
    public void a() {}
  }
  
  public class h {
    TextView a;
    
    TextView b;
    
    FrameLayout c;
    
    RelativeLayout d;
    
    RelativeLayout e;
    
    ImageView f;
    
    public h(MyBlockListActivity this$0) {}
  }
  
  private static class r extends Handler {
    private final WeakReference<MyBlockListActivity> a;
    
    private r(MyBlockListActivity param1MyBlockListActivity) {
      this.a = new WeakReference<MyBlockListActivity>(param1MyBlockListActivity);
    }
    
    public void handleMessage(Message param1Message) {
      MyBlockListActivity myBlockListActivity = this.a.get();
      if (myBlockListActivity != null) {
        int i = param1Message.what;
        if (i != 100) {
          if (i == 200) {
            MyBlockListActivity.P(myBlockListActivity).addAll(MyBlockListActivity.A0(myBlockListActivity));
            myBlockListActivity.K0();
            if (MyBlockListActivity.P(myBlockListActivity) != null && MyBlockListActivity.P(myBlockListActivity).size() > 0 && MyBlockListActivity.s0(myBlockListActivity) != null)
              MyBlockListActivity.s0(myBlockListActivity).i(MyBlockListActivity.P(myBlockListActivity)); 
          } 
        } else {
          if (MyBlockListActivity.P(myBlockListActivity) != null)
            MyBlockListActivity.P(myBlockListActivity).clear(); 
          if (MyBlockListActivity.f0(myBlockListActivity) != null && MyBlockListActivity.f0(myBlockListActivity).size() > 0)
            MyBlockListActivity.P(myBlockListActivity).addAll(MyBlockListActivity.f0(myBlockListActivity)); 
          myBlockListActivity.K0();
          if (MyBlockListActivity.P(myBlockListActivity) != null && MyBlockListActivity.P(myBlockListActivity).size() > 0 && MyBlockListActivity.s0(myBlockListActivity) != null)
            MyBlockListActivity.s0(myBlockListActivity).i(MyBlockListActivity.P(myBlockListActivity)); 
          MyBlockListActivity.z0(myBlockListActivity);
        } 
      } 
      super.handleMessage(param1Message);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/block/MyBlockListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */