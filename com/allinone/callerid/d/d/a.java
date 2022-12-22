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
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public class a extends Fragment implements View.OnClickListener {
  private final String c0 = "PopularFragment";
  
  private Typeface d0;
  
  private View e0;
  
  private Context f0;
  
  private MainActivity g0;
  
  private LRecyclerView h0;
  
  private com.allinone.callerid.d.a.b i0;
  
  private boolean j0;
  
  private ProgressBar k0;
  
  private LinearLayout l0;
  
  private int m0 = 1;
  
  private ArrayList<HomeInfo> n0;
  
  private k o0;
  
  private AlertDialog p0;
  
  private boolean q0;
  
  private boolean r0;
  
  private boolean s0;
  
  private boolean t0;
  
  private boolean u0;
  
  private HomeInfo v0;
  
  private void m2(View paramView) {
    this.h0 = (LRecyclerView)paramView.findViewById(2131297232);
    MyGridLayoutManager myGridLayoutManager = new MyGridLayoutManager(this.f0, 2);
    myGridLayoutManager.z2(1);
    this.h0.setLayoutManager((RecyclerView.o)myGridLayoutManager);
    this.h0.setHasFixedSize(true);
    this.h0.setRefreshProgressStyle(22);
    this.h0.setLoadingMoreProgressStyle(22);
    this.h0.setItemAnimator((RecyclerView.l)new androidx.recyclerview.widget.c());
    this.h0.setOnLoadMoreListener(new a(this));
    this.h0.setOnRefreshListener(new c(this));
    this.h0.setPullRefreshEnabled(true);
    this.i0 = new com.allinone.callerid.d.a.b(this.f0);
    com.github.jdsjlzx.recyclerview.a a1 = new com.github.jdsjlzx.recyclerview.a((RecyclerView.Adapter)this.i0);
    a1.P(new d(this));
    this.i0.E(new e(this));
    this.i0.F(new f(this));
    this.h0.setAdapter((RecyclerView.Adapter)a1);
    this.k0 = (ProgressBar)paramView.findViewById(2131297377);
    this.l0 = (LinearLayout)paramView.findViewById(2131297188);
    TextView textView3 = (TextView)paramView.findViewById(2131298005);
    TextView textView2 = (TextView)paramView.findViewById(2131298006);
    FrameLayout frameLayout = (FrameLayout)paramView.findViewById(2131296819);
    TextView textView1 = (TextView)paramView.findViewById(2131298094);
    frameLayout.setOnClickListener(this);
    textView3.setTypeface(this.d0);
    textView2.setTypeface(this.d0);
    textView1.setTypeface(this.d0);
    if (!com.allinone.callerid.util.e.b(this.f0)) {
      this.l0.setVisibility(0);
    } else {
      this.l0.setVisibility(8);
    } 
  }
  
  private void n2(HomeInfo paramHomeInfo) {
    try {
      boolean bool = paramHomeInfo.isUnLock();
      if (bool) {
        if (this.g0 != null)
          if (com.allinone.callerid.util.k1.a.a(this.f0)) {
            Intent intent = new Intent();
            this(this.f0, CallScreenPdtActivity.class);
            intent.putExtra("homeinfo", (Serializable)paramHomeInfo);
            this.f0.startActivity(intent);
            this.g0.overridePendingTransition(2130771968, 2130771969);
          } else {
            Intent intent = new Intent();
            this();
            intent.setClass(this.f0, OpenPerActivity.class);
            intent.putExtra("homeinfo", (Serializable)paramHomeInfo);
            this.f0.startActivity(intent);
            this.g0.overridePendingTransition(2130771968, 2130771969);
          }  
      } else if (this.g0 != null) {
        if (com.allinone.callerid.util.k1.a.a(this.f0)) {
          r2(paramHomeInfo);
        } else {
          Intent intent = new Intent();
          this();
          intent.setClass(this.f0, OpenPerActivity.class);
          intent.putExtra("homeinfo", (Serializable)paramHomeInfo);
          this.f0.startActivity(intent);
          this.g0.overridePendingTransition(2130771968, 2130771969);
          this.u0 = true;
          this.v0 = paramHomeInfo;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void o2(int paramInt, String paramString) {
    if (com.allinone.callerid.util.e.b(this.f0)) {
      this.l0.setVisibility(8);
      this.k0.setVisibility(0);
      this.i0.j = com.allinone.callerid.d.f.f.i();
      com.allinone.callerid.d.e.c.a(paramInt, paramString, true, new b(this));
    } 
  }
  
  private void p2(HomeInfo paramHomeInfo) {
    this.q0 = false;
    this.r0 = false;
    this.s0 = false;
    this.t0 = false;
    com.allinone.callerid.util.gg.b.a().b(new i(this, paramHomeInfo));
  }
  
  private void r2(HomeInfo paramHomeInfo) {
    try {
      View view = LayoutInflater.from((Context)this.g0).inflate(2131493206, null);
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
      this.p0 = alertDialog;
      alertDialog.setCanceledOnTouchOutside(false);
      this.p0.show();
      p2(paramHomeInfo);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void s2(HomeInfo paramHomeInfo) {
    try {
      this.r0 = true;
      if (this.g0 != null) {
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
        if (this.j0) {
          this.j0 = false;
          o2(1, "publish_time");
        } 
        com.allinone.callerid.d.a.b b1 = this.i0;
        if (b1 != null)
          b1.i(); 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void N0() {
    super.N0();
    try {
      if (this.u0 && this.v0 != null && com.allinone.callerid.util.k1.a.a(this.f0)) {
        r2(this.v0);
        this.u0 = false;
        this.v0 = null;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131296819)
      o2(1, "publish_time"); 
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.f0 = paramContext;
    this.g0 = (MainActivity)paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (this.e0 == null) {
      i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
      this.e0 = paramLayoutInflater.inflate(2131493041, paramViewGroup, false);
      if (i1.f0(t()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        try {
          if (m() != null && m().getWindow() != null)
            m().getWindow().getDecorView().setLayoutDirection(1); 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      this.j0 = true;
      this.d0 = g1.b();
      m2(this.e0);
      this.o0 = new k(null);
      b.p.a.a.b(this.f0).c(this.o0, new IntentFilter("com.allinone.callerid.REFRESH_HOME_DATA"));
    } 
    return this.e0;
  }
  
  public void x0() {
    super.x0();
    try {
      Context context = this.f0;
      if (context != null && this.o0 != null)
        b.p.a.a.b(context).e(this.o0); 
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
    a(a this$0) {}
    
    public void a() {
      com.allinone.callerid.d.e.c.a(a.Q1(this.a), "publish_time", false, new a(this));
    }
    
    class a implements com.allinone.callerid.d.e.c.a {
      a(a.a this$0) {}
      
      public void a(ArrayList<HomeInfo> param2ArrayList, boolean param2Boolean) {
        if (param2ArrayList != null && param2ArrayList.size() > 0) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("homeInfos.size:");
            stringBuilder.append(param2ArrayList.size());
            d0.a("callscreen", stringBuilder.toString());
          } 
          a.c2(this.a.a).A(param2ArrayList, false);
          a.c2(this.a.a).i();
          if (param2Boolean) {
            a.U1(this.a.a);
            a.d2(this.a.a).H1(param2ArrayList.size());
          } else {
            a.d2(this.a.a).setNoMore(true);
            a.d2(this.a.a).setLoadMoreEnabled(false);
          } 
          if (a.e2(this.a.a) == null)
            a.f2(this.a.a, new ArrayList()); 
          a.e2(this.a.a).addAll(param2ArrayList);
        } else {
          a.d2(this.a.a).setNoMore(true);
          a.d2(this.a.a).setLoadMoreEnabled(false);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.c.a {
    a(a this$0) {}
    
    public void a(ArrayList<HomeInfo> param1ArrayList, boolean param1Boolean) {
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("homeInfos.size:");
          stringBuilder.append(param1ArrayList.size());
          d0.a("callscreen", stringBuilder.toString());
        } 
        a.c2(this.a.a).A(param1ArrayList, false);
        a.c2(this.a.a).i();
        if (param1Boolean) {
          a.U1(this.a.a);
          a.d2(this.a.a).H1(param1ArrayList.size());
        } else {
          a.d2(this.a.a).setNoMore(true);
          a.d2(this.a.a).setLoadMoreEnabled(false);
        } 
        if (a.e2(this.a.a) == null)
          a.f2(this.a.a, new ArrayList()); 
        a.e2(this.a.a).addAll(param1ArrayList);
      } else {
        a.d2(this.a.a).setNoMore(true);
        a.d2(this.a.a).setLoadMoreEnabled(false);
      } 
    }
  }
  
  class b implements com.allinone.callerid.d.e.c.a {
    b(a this$0) {}
    
    public void a(ArrayList<HomeInfo> param1ArrayList, boolean param1Boolean) {
      a.b2(this.a).setVisibility(8);
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("homeInfos:");
          stringBuilder.append(param1ArrayList.toString());
          d0.a("callscreen", stringBuilder.toString());
        } 
        a.c2(this.a).A(param1ArrayList, true);
        a.c2(this.a).i();
        if (param1Boolean) {
          a.U1(this.a);
          a.d2(this.a).H1(param1ArrayList.size());
        } else {
          a.d2(this.a).setNoMore(true);
          a.d2(this.a).setLoadMoreEnabled(false);
        } 
        if (a.e2(this.a) == null)
          a.f2(this.a, new ArrayList()); 
        a.e2(this.a).addAll(param1ArrayList);
      } else {
        a.d2(this.a).H1(0);
      } 
    }
  }
  
  class c implements c.b.a.g.g {
    c(a this$0) {}
    
    public void a() {
      a.d2(this.a).setNoMore(false);
      a.d2(this.a).setLoadMoreEnabled(true);
      a.T1(this.a, 1);
      a.g2(this.a, 1, "publish_time");
    }
  }
  
  class d implements com.github.jdsjlzx.recyclerview.a.d {
    d(a this$0) {}
    
    public int a(GridLayoutManager param1GridLayoutManager, int param1Int) {
      if (a.c2(this.a) != null) {
        ArrayList arrayList = a.c2(this.a).B();
        if (arrayList == null || arrayList.size() > 0);
      } 
      return 1;
    }
  }
  
  class e implements com.allinone.callerid.d.a.b.e {
    e(a this$0) {}
    
    public void a(HomeInfo param1HomeInfo) {
      a.h2(this.a, param1HomeInfo);
    }
  }
  
  class f implements com.allinone.callerid.d.a.b.f {
    f(a this$0) {}
    
    public void a(HomeInfo param1HomeInfo) {
      try {
        Intent intent;
        if (com.allinone.callerid.util.k1.a.a(a.i2(this.a))) {
          if (param1HomeInfo.isContacts_diy() || param1HomeInfo.isDefautl_diy()) {
            Intent intent1 = new Intent();
            this(a.i2(this.a), ManageDiyActivity.class);
            a.i2(this.a).startActivity(intent1);
            a.k2(this.a).overridePendingTransition(2130771968, 2130771969);
            return;
          } 
          intent = new Intent();
          this(a.i2(this.a), SelectVideoActivity.class);
          intent.putExtra("is_from_main", true);
          a.i2(this.a).startActivity(intent);
          a.k2(this.a).overridePendingTransition(2130771968, 2130771969);
        } else {
          Intent intent1 = new Intent();
          this();
          intent1.setClass(a.i2(this.a), OpenPerActivity.class);
          intent1.putExtra("homeinfo", (Serializable)intent);
          intent1.putExtra("is_diy", true);
          a.i2(this.a).startActivity(intent1);
          a.k2(this.a).overridePendingTransition(2130771968, 2130771969);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements View.OnClickListener {
    g(a this$0) {}
    
    public void onClick(View param1View) {
      if (a.l2(this.b) != null)
        a.l2(this.b).cancel(); 
    }
  }
  
  class h implements View.OnClickListener {
    h(a this$0, HomeInfo param1HomeInfo) {}
    
    public void onClick(View param1View) {
      if (a.l2(this.c) != null)
        a.l2(this.c).cancel(); 
      if (a.R1(this.c)) {
        a.V1(this.c, this.b);
      } else {
        com.allinone.callerid.util.gg.b.a().c((Activity)a.k2(this.c), new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.util.gg.b.e {
      a(a.h this$0) {}
      
      public void a() {
        a.h h1 = this.a;
        a.V1(h1.c, h1.b);
      }
      
      public void b() {
        a.h h1 = this.a;
        a.V1(h1.c, h1.b);
      }
      
      public void c() {
        a.X1(this.a.c, true);
      }
      
      public void d() {
        a.Z1(this.a.c, true);
        (new Handler()).postDelayed(new a(this), 10000L);
      }
      
      class a implements Runnable {
        a(a.h.a this$0) {}
        
        public void run() {
          a.Z1(this.b.a.c, false);
          if (!a.W1(this.b.a.c) && !a.a2(this.b.a.c)) {
            a.h h = this.b.a;
            a.V1(h.c, h.b);
          } 
        }
      }
    }
    
    class a implements Runnable {
      a(a.h this$0) {}
      
      public void run() {
        a.Z1(this.b.a.c, false);
        if (!a.W1(this.b.a.c) && !a.a2(this.b.a.c)) {
          a.h h = this.b.a;
          a.V1(h.c, h.b);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.util.gg.b.e {
    a(a this$0) {}
    
    public void a() {
      a.h h1 = this.a;
      a.V1(h1.c, h1.b);
    }
    
    public void b() {
      a.h h1 = this.a;
      a.V1(h1.c, h1.b);
    }
    
    public void c() {
      a.X1(this.a.c, true);
    }
    
    public void d() {
      a.Z1(this.a.c, true);
      (new Handler()).postDelayed(new a(this), 10000L);
    }
    
    class a implements Runnable {
      a(a.h.a this$0) {}
      
      public void run() {
        a.Z1(this.b.a.c, false);
        if (!a.W1(this.b.a.c) && !a.a2(this.b.a.c)) {
          a.h h = this.b.a;
          a.V1(h.c, h.b);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(a this$0) {}
    
    public void run() {
      a.Z1(this.b.a.c, false);
      if (!a.W1(this.b.a.c) && !a.a2(this.b.a.c)) {
        a.h h = this.b.a;
        a.V1(h.c, h.b);
      } 
    }
  }
  
  class i implements com.allinone.callerid.util.gg.b.d {
    i(a this$0, HomeInfo param1HomeInfo) {}
    
    public void i() {
      com.allinone.callerid.util.gg.b.a().d(a.Y1(this.b), (Activity)a.k2(this.b), new a(this));
    }
    
    public void j(int param1Int) {
      a.S1(this.b, true);
    }
    
    class a implements com.allinone.callerid.util.gg.b.e {
      a(a.i this$0) {}
      
      public void a() {
        a.i i1 = this.a;
        a.V1(i1.b, i1.a);
      }
      
      public void b() {
        a.i i1 = this.a;
        a.V1(i1.b, i1.a);
      }
      
      public void c() {
        a.X1(this.a.b, true);
      }
      
      public void d() {}
    }
  }
  
  class a implements com.allinone.callerid.util.gg.b.e {
    a(a this$0) {}
    
    public void a() {
      a.i i1 = this.a;
      a.V1(i1.b, i1.a);
    }
    
    public void b() {
      a.i i1 = this.a;
      a.V1(i1.b, i1.a);
    }
    
    public void c() {
      a.X1(this.a.b, true);
    }
    
    public void d() {}
  }
  
  class j implements Runnable {
    j(a this$0, HomeInfo param1HomeInfo) {}
    
    public void run() {
      RewardedAdInfo rewardedAdInfo = new RewardedAdInfo();
      rewardedAdInfo.setName(this.b.getName());
      rewardedAdInfo.setDataId(this.b.getData_id());
      com.allinone.callerid.d.b.d.b().a(rewardedAdInfo);
      a.k2(this.c).runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(a.j this$0) {}
      
      public void run() {
        b.p.a.a.b((Context)a.k2(this.b.c)).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
      }
    }
  }
  
  class a implements Runnable {
    a(a this$0) {}
    
    public void run() {
      b.p.a.a.b((Context)a.k2(this.b.c)).d(new Intent("com.allinone.callerid.REFRESH_HOME_DATA"));
    }
  }
  
  private class k extends BroadcastReceiver {
    private k(a this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (d0.a)
        d0.a("callscreen", "LatestFragmentRefresh"); 
      if (a.c2(this.a) != null && a.c2(this.a).B() != null && a.c2(this.a).B().size() > 0) {
        com.allinone.callerid.d.e.c.b(a.e2(this.a), new a(this));
      } else {
        a.T1(this.a, 1);
        a.g2(this.a, 1, "publish_time");
      } 
    }
    
    class a implements com.allinone.callerid.d.e.c.a {
      a(a.k this$0) {}
      
      public void a(ArrayList<HomeInfo> param2ArrayList, boolean param2Boolean) {
        if (param2ArrayList != null && param2ArrayList.size() > 0) {
          if (d0.a)
            d0.a("callscreen", "LatestFragment刷新数据"); 
          a.c2(this.a.a).A(param2ArrayList, true);
          if (a.c2(this.a.a) != null)
            a.c2(this.a.a).i(); 
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.c.a {
    a(a this$0) {}
    
    public void a(ArrayList<HomeInfo> param1ArrayList, boolean param1Boolean) {
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        if (d0.a)
          d0.a("callscreen", "LatestFragment刷新数据"); 
        a.c2(this.a.a).A(param1ArrayList, true);
        if (a.c2(this.a.a) != null)
          a.c2(this.a.a).i(); 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */