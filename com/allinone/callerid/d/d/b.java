package com.allinone.callerid.d.d;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.callscreen.activitys.CallScreenPdtActivity;
import com.allinone.callerid.callscreen.activitys.GuideUseActivity;
import com.allinone.callerid.callscreen.activitys.ManageDiyActivity;
import com.allinone.callerid.callscreen.activitys.OpenPerActivity;
import com.allinone.callerid.callscreen.activitys.SelectVideoActivity;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.bean.RewardedAdInfo;
import com.allinone.callerid.customview.MyGridLayoutManager;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public class b extends Fragment implements View.OnClickListener {
  private final String c0 = "PopularFragment";
  
  private Typeface d0;
  
  private View e0;
  
  private Context f0;
  
  private LRecyclerView g0;
  
  private com.allinone.callerid.d.a.b h0;
  
  private ProgressBar i0;
  
  private LinearLayout j0;
  
  private int k0 = 1;
  
  private FrameLayout l0;
  
  private k m0;
  
  private ArrayList<HomeInfo> n0;
  
  private MainActivity o0;
  
  private MyGridLayoutManager p0;
  
  private AlertDialog q0;
  
  private boolean r0;
  
  private boolean s0;
  
  private boolean t0;
  
  private boolean u0;
  
  private boolean v0;
  
  private HomeInfo w0;
  
  private void m2(View paramView) {
    this.g0 = (LRecyclerView)paramView.findViewById(2131297232);
    MyGridLayoutManager myGridLayoutManager = new MyGridLayoutManager(this.f0, 2);
    this.p0 = myGridLayoutManager;
    myGridLayoutManager.z2(1);
    this.p0.f3(true);
    this.g0.setLayoutManager((RecyclerView.o)this.p0);
    this.g0.setHasFixedSize(true);
    this.g0.setRefreshProgressStyle(22);
    this.g0.setLoadingMoreProgressStyle(22);
    this.g0.setItemAnimator((RecyclerView.l)new androidx.recyclerview.widget.c());
    this.g0.setOnLoadMoreListener(new a(this));
    this.g0.setOnRefreshListener(new c(this));
    this.g0.setPullRefreshEnabled(true);
    this.h0 = new com.allinone.callerid.d.a.b(this.f0);
    com.github.jdsjlzx.recyclerview.a a = new com.github.jdsjlzx.recyclerview.a((RecyclerView.Adapter)this.h0);
    a.P(new d(this));
    this.h0.E(new e(this));
    this.h0.F(new f(this));
    this.g0.setAdapter((RecyclerView.Adapter)a);
    this.i0 = (ProgressBar)paramView.findViewById(2131297377);
    this.j0 = (LinearLayout)paramView.findViewById(2131297188);
    TextView textView2 = (TextView)paramView.findViewById(2131298005);
    TextView textView3 = (TextView)paramView.findViewById(2131298006);
    FrameLayout frameLayout = (FrameLayout)paramView.findViewById(2131296819);
    TextView textView1 = (TextView)paramView.findViewById(2131298094);
    frameLayout.setOnClickListener(this);
    textView2.setTypeface(this.d0);
    textView3.setTypeface(this.d0);
    textView1.setTypeface(this.d0);
    if (!com.allinone.callerid.util.e.b(this.f0)) {
      this.j0.setVisibility(0);
    } else {
      this.j0.setVisibility(8);
    } 
    this.l0 = (FrameLayout)paramView.findViewById(2131297525);
    ((TextView)paramView.findViewById(2131298039)).setTypeface(this.d0);
    this.l0.setOnClickListener(this);
    if (!com.allinone.callerid.d.f.f.j() && !com.allinone.callerid.util.k1.a.a(this.f0))
      this.l0.setVisibility(0); 
  }
  
  private void n2(HomeInfo paramHomeInfo) {
    try {
      boolean bool = paramHomeInfo.isUnLock();
      if (bool) {
        if (this.o0 != null)
          if (com.allinone.callerid.util.k1.a.a(this.f0)) {
            Intent intent = new Intent();
            this(this.f0, CallScreenPdtActivity.class);
            intent.putExtra("homeinfo", (Serializable)paramHomeInfo);
            this.f0.startActivity(intent);
            this.o0.overridePendingTransition(2130771968, 2130771969);
          } else {
            Intent intent = new Intent();
            this();
            intent.setClass(this.f0, OpenPerActivity.class);
            intent.putExtra("homeinfo", (Serializable)paramHomeInfo);
            this.f0.startActivity(intent);
            this.o0.overridePendingTransition(2130771968, 2130771969);
          }  
      } else if (this.o0 != null) {
        if (com.allinone.callerid.util.k1.a.a(this.f0)) {
          s2(paramHomeInfo);
        } else {
          Intent intent = new Intent();
          this();
          intent.setClass(this.f0, OpenPerActivity.class);
          intent.putExtra("homeinfo", (Serializable)paramHomeInfo);
          this.f0.startActivity(intent);
          this.o0.overridePendingTransition(2130771968, 2130771969);
          this.v0 = true;
          this.w0 = paramHomeInfo;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void p2(HomeInfo paramHomeInfo) {
    this.r0 = false;
    this.s0 = false;
    this.t0 = false;
    this.u0 = false;
    com.allinone.callerid.util.gg.b.a().b(new i(this, paramHomeInfo));
  }
  
  private void r2() {
    try {
      if (com.allinone.callerid.d.f.f.j() && com.allinone.callerid.d.f.a.d) {
        Intent intent = new Intent();
        this(this.f0, GuideUseActivity.class);
        M1(intent);
        this.o0.overridePendingTransition(2130771968, 2130771969);
        com.allinone.callerid.d.f.f.v(false);
        q.b().c("callscreen_user_guide");
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void s2(HomeInfo paramHomeInfo) {
    try {
      View view = LayoutInflater.from((Context)this.o0).inflate(2131493206, null);
      TextView textView1 = (TextView)view.findViewById(2131297866);
      ImageView imageView = (ImageView)view.findViewById(2131296968);
      FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296807);
      TextView textView2 = (TextView)view.findViewById(2131298212);
      textView1.setTypeface(this.d0);
      textView2.setTypeface(this.d0);
      g g = new g();
      this(this);
      imageView.setOnClickListener(g);
      h h = new h();
      this(this, paramHomeInfo);
      frameLayout.setOnClickListener(h);
      AlertDialog.Builder builder = new AlertDialog.Builder();
      this(this.f0);
      AlertDialog alertDialog = builder.setView(view).create();
      this.q0 = alertDialog;
      alertDialog.setCanceledOnTouchOutside(false);
      this.q0.show();
      p2(paramHomeInfo);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void t2(HomeInfo paramHomeInfo) {
    try {
      this.s0 = true;
      q.b().c("unlock_resouse");
      if (this.o0 != null) {
        ExecutorService executorService = (j0.a()).b;
        j j = new j();
        this(this, paramHomeInfo);
        executorService.execute(j);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void I0() {
    super.I0();
  }
  
  public void L1(boolean paramBoolean) {
    super.L1(paramBoolean);
    if (paramBoolean)
      try {
        com.allinone.callerid.d.a.b b1 = this.h0;
        if (b1 != null)
          b1.i(); 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void N0() {
    super.N0();
    try {
      if (com.allinone.callerid.util.k1.a.a(this.f0))
        this.l0.setVisibility(8); 
      if (this.v0 && this.w0 != null && com.allinone.callerid.util.k1.a.a(this.f0)) {
        s2(this.w0);
        this.v0 = false;
        this.w0 = null;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void n0(int paramInt1, int paramInt2, Intent paramIntent) {
    super.n0(paramInt1, paramInt2, paramIntent);
    if (d0.a)
      d0.a("callscreen", "onActivityResult"); 
    if (paramInt1 == 10010 && com.allinone.callerid.util.k1.a.a(this.f0))
      this.l0.setVisibility(8); 
  }
  
  public void o2(int paramInt, String paramString) {
    try {
      if (com.allinone.callerid.util.e.b((Context)EZCallApplication.c())) {
        this.j0.setVisibility(8);
        this.i0.setVisibility(0);
        this.h0.j = com.allinone.callerid.d.f.f.i();
        b b1 = new b();
        this(this);
        com.allinone.callerid.d.e.c.a(paramInt, paramString, true, b1);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296819) {
      if (i == 2131297525) {
        Intent intent = new Intent();
        intent.setClass((Context)this.o0, OpenPerActivity.class);
        startActivityForResult(intent, 10010);
        this.o0.overridePendingTransition(2130771968, 2130771969);
      } 
    } else {
      o2(1, "download_count");
    } 
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.f0 = paramContext;
    this.o0 = (MainActivity)paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (this.e0 == null)
      try {
        i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
        this.e0 = paramLayoutInflater.inflate(2131493043, paramViewGroup, false);
        if (i1.f0(t()).booleanValue()) {
          int i = Build.VERSION.SDK_INT;
          if (i >= 17)
            try {
              if (m() != null && m().getWindow() != null)
                m().getWindow().getDecorView().setLayoutDirection(1); 
            } catch (Exception exception) {
              exception.printStackTrace();
            }  
        } 
        this.d0 = g1.b();
        m2(this.e0);
        k k1 = new k();
        this(this, null);
        this.m0 = k1;
        b.p.a.a a = b.p.a.a.b(this.f0);
        k k2 = this.m0;
        IntentFilter intentFilter = new IntentFilter();
        this("com.allinone.callerid.REFRESH_HOME_DATA");
        a.c(k2, intentFilter);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return this.e0;
  }
  
  public void x0() {
    super.x0();
    try {
      Context context = this.f0;
      if (context != null && this.m0 != null)
        b.p.a.a.b(context).e(this.m0); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void z0() {
    super.z0();
    try {
      View view = this.e0;
      if (view != null) {
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null)
          viewGroup.removeView(this.e0); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements c.b.a.g.e {
    a(b this$0) {}
    
    public void a() {
      com.allinone.callerid.d.e.c.a(b.Q1(this.a), "download_count", false, new a(this));
    }
    
    class a implements com.allinone.callerid.d.e.c.a {
      a(b.a this$0) {}
      
      public void a(ArrayList<HomeInfo> param2ArrayList, boolean param2Boolean) {
        if (param2ArrayList != null && param2ArrayList.size() > 0) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("homeInfos.size:");
            stringBuilder.append(param2ArrayList.size());
            d0.a("callscreen", stringBuilder.toString());
          } 
          b.b2(this.a.a).A(param2ArrayList, false);
          b.b2(this.a.a).i();
          if (param2Boolean) {
            b.T1(this.a.a);
            b.c2(this.a.a).H1(param2ArrayList.size());
          } else {
            b.c2(this.a.a).setNoMore(true);
            b.c2(this.a.a).setLoadMoreEnabled(false);
          } 
          if (b.d2(this.a.a) == null)
            b.e2(this.a.a, new ArrayList()); 
          b.d2(this.a.a).addAll(param2ArrayList);
        } else {
          b.c2(this.a.a).setNoMore(true);
          b.c2(this.a.a).setLoadMoreEnabled(false);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.c.a {
    a(b this$0) {}
    
    public void a(ArrayList<HomeInfo> param1ArrayList, boolean param1Boolean) {
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("homeInfos.size:");
          stringBuilder.append(param1ArrayList.size());
          d0.a("callscreen", stringBuilder.toString());
        } 
        b.b2(this.a.a).A(param1ArrayList, false);
        b.b2(this.a.a).i();
        if (param1Boolean) {
          b.T1(this.a.a);
          b.c2(this.a.a).H1(param1ArrayList.size());
        } else {
          b.c2(this.a.a).setNoMore(true);
          b.c2(this.a.a).setLoadMoreEnabled(false);
        } 
        if (b.d2(this.a.a) == null)
          b.e2(this.a.a, new ArrayList()); 
        b.d2(this.a.a).addAll(param1ArrayList);
      } else {
        b.c2(this.a.a).setNoMore(true);
        b.c2(this.a.a).setLoadMoreEnabled(false);
      } 
    }
  }
  
  class b implements com.allinone.callerid.d.e.c.a {
    b(b this$0) {}
    
    public void a(ArrayList<HomeInfo> param1ArrayList, boolean param1Boolean) {
      b.Z1(this.a).setVisibility(8);
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        b.b2(this.a).A(param1ArrayList, true);
        b.b2(this.a).i();
        if (param1Boolean) {
          b.T1(this.a);
          b.c2(this.a).H1(param1ArrayList.size());
        } else {
          b.c2(this.a).setNoMore(true);
          b.c2(this.a).setLoadMoreEnabled(false);
        } 
        if (b.d2(this.a) == null)
          b.e2(this.a, new ArrayList()); 
        b.d2(this.a).addAll(param1ArrayList);
        b.a2(this.a);
      } else {
        b.c2(this.a).H1(0);
      } 
    }
  }
  
  class c implements c.b.a.g.g {
    c(b this$0) {}
    
    public void a() {
      b.c2(this.a).setNoMore(false);
      b.c2(this.a).setLoadMoreEnabled(true);
      b.S1(this.a, 1);
      this.a.o2(1, "download_count");
    }
  }
  
  class d implements com.github.jdsjlzx.recyclerview.a.d {
    d(b this$0) {}
    
    public int a(GridLayoutManager param1GridLayoutManager, int param1Int) {
      if (b.b2(this.a) != null) {
        ArrayList arrayList = b.b2(this.a).B();
        if (arrayList == null || arrayList.size() > 0);
      } 
      return 1;
    }
  }
  
  class e implements com.allinone.callerid.d.a.b.e {
    e(b this$0) {}
    
    public void a(HomeInfo param1HomeInfo) {
      b.f2(this.a, param1HomeInfo);
    }
  }
  
  class f implements com.allinone.callerid.d.a.b.f {
    f(b this$0) {}
    
    public void a(HomeInfo param1HomeInfo) {
      try {
        Intent intent;
        if (com.allinone.callerid.util.k1.a.a(b.g2(this.a))) {
          if (param1HomeInfo.isContacts_diy() || param1HomeInfo.isDefautl_diy()) {
            Intent intent1 = new Intent();
            this(b.g2(this.a), ManageDiyActivity.class);
            b.g2(this.a).startActivity(intent1);
            b.h2(this.a).overridePendingTransition(2130771968, 2130771969);
            return;
          } 
          intent = new Intent();
          this(b.g2(this.a), SelectVideoActivity.class);
          intent.putExtra("is_from_main", true);
          b.g2(this.a).startActivity(intent);
          b.h2(this.a).overridePendingTransition(2130771968, 2130771969);
        } else {
          Intent intent1 = new Intent();
          this();
          intent1.setClass(b.g2(this.a), OpenPerActivity.class);
          intent1.putExtra("homeinfo", (Serializable)intent);
          intent1.putExtra("is_diy", true);
          b.g2(this.a).startActivity(intent1);
          b.h2(this.a).overridePendingTransition(2130771968, 2130771969);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements View.OnClickListener {
    g(b this$0) {}
    
    public void onClick(View param1View) {
      if (b.i2(this.b) != null)
        b.i2(this.b).cancel(); 
    }
  }
  
  class h implements View.OnClickListener {
    h(b this$0, HomeInfo param1HomeInfo) {}
    
    public void onClick(View param1View) {
      if (b.i2(this.c) != null)
        b.i2(this.c).cancel(); 
      if (b.k2(this.c)) {
        b.R1(this.c, this.b);
      } else {
        com.allinone.callerid.util.gg.b.a().c((Activity)b.h2(this.c), new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.util.gg.b.e {
      a(b.h this$0) {}
      
      public void a() {
        b.h h1 = this.a;
        b.R1(h1.c, h1.b);
      }
      
      public void b() {
        b.h h1 = this.a;
        b.R1(h1.c, h1.b);
      }
      
      public void c() {
        b.V1(this.a.c, true);
      }
      
      public void d() {
        b.X1(this.a.c, true);
        (new Handler()).postDelayed(new a(this), 10000L);
      }
      
      class a implements Runnable {
        a(b.h.a this$0) {}
        
        public void run() {
          b.X1(this.b.a.c, false);
          if (!b.U1(this.b.a.c) && !b.Y1(this.b.a.c)) {
            b.h h = this.b.a;
            b.R1(h.c, h.b);
          } 
        }
      }
    }
    
    class a implements Runnable {
      a(b.h this$0) {}
      
      public void run() {
        b.X1(this.b.a.c, false);
        if (!b.U1(this.b.a.c) && !b.Y1(this.b.a.c)) {
          b.h h = this.b.a;
          b.R1(h.c, h.b);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.util.gg.b.e {
    a(b this$0) {}
    
    public void a() {
      b.h h1 = this.a;
      b.R1(h1.c, h1.b);
    }
    
    public void b() {
      b.h h1 = this.a;
      b.R1(h1.c, h1.b);
    }
    
    public void c() {
      b.V1(this.a.c, true);
    }
    
    public void d() {
      b.X1(this.a.c, true);
      (new Handler()).postDelayed(new a(this), 10000L);
    }
    
    class a implements Runnable {
      a(b.h.a this$0) {}
      
      public void run() {
        b.X1(this.b.a.c, false);
        if (!b.U1(this.b.a.c) && !b.Y1(this.b.a.c)) {
          b.h h = this.b.a;
          b.R1(h.c, h.b);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      b.X1(this.b.a.c, false);
      if (!b.U1(this.b.a.c) && !b.Y1(this.b.a.c)) {
        b.h h = this.b.a;
        b.R1(h.c, h.b);
      } 
    }
  }
  
  class i implements com.allinone.callerid.util.gg.b.d {
    i(b this$0, HomeInfo param1HomeInfo) {}
    
    public void i() {
      com.allinone.callerid.util.gg.b.a().d(b.W1(this.b), (Activity)b.h2(this.b), new a(this));
    }
    
    public void j(int param1Int) {
      b.l2(this.b, true);
    }
    
    class a implements com.allinone.callerid.util.gg.b.e {
      a(b.i this$0) {}
      
      public void a() {
        b.i i1 = this.a;
        b.R1(i1.b, i1.a);
      }
      
      public void b() {
        b.i i1 = this.a;
        b.R1(i1.b, i1.a);
      }
      
      public void c() {
        b.V1(this.a.b, true);
      }
      
      public void d() {}
    }
  }
  
  class a implements com.allinone.callerid.util.gg.b.e {
    a(b this$0) {}
    
    public void a() {
      b.i i1 = this.a;
      b.R1(i1.b, i1.a);
    }
    
    public void b() {
      b.i i1 = this.a;
      b.R1(i1.b, i1.a);
    }
    
    public void c() {
      b.V1(this.a.b, true);
    }
    
    public void d() {}
  }
  
  class j implements Runnable {
    j(b this$0, HomeInfo param1HomeInfo) {}
    
    public void run() {
      RewardedAdInfo rewardedAdInfo = new RewardedAdInfo();
      rewardedAdInfo.setName(this.b.getName());
      rewardedAdInfo.setDataId(this.b.getData_id());
      com.allinone.callerid.d.b.d.b().a(rewardedAdInfo);
      b.h2(this.c).runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(b.j this$0) {}
      
      public void run() {
        b.p.a.a.b((Context)b.h2(this.b.c)).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
      }
    }
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      b.p.a.a.b((Context)b.h2(this.b.c)).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
    }
  }
  
  private class k extends BroadcastReceiver {
    private k(b this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (d0.a)
        d0.a("callscreen", "Refresh"); 
      if (b.b2(this.a) != null && b.b2(this.a).B() != null && b.b2(this.a).B().size() > 0) {
        if (d0.a)
          d0.a("callscreen", "刷新数据"); 
        com.allinone.callerid.d.e.c.b(b.d2(this.a), new a(this));
      } else {
        b.S1(this.a, 1);
        this.a.o2(1, "download_count");
      } 
    }
    
    class a implements com.allinone.callerid.d.e.c.a {
      a(b.k this$0) {}
      
      public void a(ArrayList<HomeInfo> param2ArrayList, boolean param2Boolean) {
        if (param2ArrayList != null && param2ArrayList.size() > 0) {
          if (d0.a)
            d0.a("callscreen", "刷新数据"); 
          b.b2(this.a.a).A(param2ArrayList, true);
          if (b.b2(this.a.a) != null)
            b.b2(this.a.a).i(); 
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.c.a {
    a(b this$0) {}
    
    public void a(ArrayList<HomeInfo> param1ArrayList, boolean param1Boolean) {
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        if (d0.a)
          d0.a("callscreen", "刷新数据"); 
        b.b2(this.a.a).A(param1ArrayList, true);
        if (b.b2(this.a.a) != null)
          b.b2(this.a.a).i(); 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */