package com.allinone.callerid.mvc.controller;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.customview.EZKeyboardView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.contactpdt.ContactActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.mvc.controller.contactslist.ContactsListActivity;
import com.allinone.callerid.receiver.MyReceiver;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q0;
import com.github.clans.fab.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EZDialerActivity extends BaseActivity implements View.OnClickListener {
  public static boolean s = false;
  
  public static boolean t = true;
  
  private List<CallLogBean> A = new ArrayList<CallLogBean>();
  
  private ArrayList<CallLogBean> B = new ArrayList<CallLogBean>();
  
  private List<String> C = new ArrayList<String>();
  
  private HashMap<String, Integer> D = new HashMap<String, Integer>();
  
  private EZKeyboardView E;
  
  private FloatingActionButton F;
  
  private String G;
  
  private ArrayList<CallLogBean> H;
  
  private ListView I;
  
  private com.allinone.callerid.b.l J;
  
  private com.allinone.callerid.dialog.c K;
  
  private ArrayList<CallLogBean> L = new ArrayList<CallLogBean>();
  
  private ArrayList<CallLogBean> M = new ArrayList<CallLogBean>();
  
  private Animation N;
  
  private Animation O;
  
  private int P = 0;
  
  private ImageView Q;
  
  private ImageView R;
  
  private ImageView S;
  
  private String T;
  
  private String U;
  
  List<SubscriptionInfo> V = new ArrayList<SubscriptionInfo>();
  
  SubscriptionManager W;
  
  private ProgressBar X;
  
  private s Y;
  
  private FrameLayout Z;
  
  private int a0;
  
  private int b0;
  
  private int c0;
  
  private boolean d0;
  
  private boolean e0;
  
  private r f0 = new r((Context)this);
  
  private final String u = "EZDialerActivity";
  
  private ImageView v;
  
  private ImageView w;
  
  private ListView x;
  
  private com.allinone.callerid.b.e y;
  
  private List<CallLogBean> z = new ArrayList<CallLogBean>();
  
  private void I0() {
    try {
      if (androidx.core.content.a.a(getApplicationContext(), "android.permission.READ_PHONE_STATE") == 0) {
        int i = b1.q();
        if (c1.h((Context)this)) {
          if (i == 0) {
            ImageView imageView = this.Q;
            if (imageView != null)
              imageView.setVisibility(0); 
            imageView = this.R;
            if (imageView != null)
              imageView.setVisibility(8); 
            imageView = this.S;
            if (imageView != null)
              imageView.setVisibility(8); 
          } else if (i == 1) {
            ImageView imageView = this.Q;
            if (imageView != null)
              imageView.setVisibility(8); 
            imageView = this.R;
            if (imageView != null)
              imageView.setVisibility(0); 
            imageView = this.S;
            if (imageView != null)
              imageView.setVisibility(8); 
          } else if (i == -1) {
            ImageView imageView = this.Q;
            if (imageView != null)
              imageView.setVisibility(8); 
            imageView = this.R;
            if (imageView != null)
              imageView.setVisibility(8); 
            imageView = this.S;
            if (imageView != null)
              imageView.setVisibility(0); 
          } 
          if (Build.VERSION.SDK_INT >= 22) {
            SubscriptionManager subscriptionManager = SubscriptionManager.from((Context)this);
            this.W = subscriptionManager;
            List<SubscriptionInfo> list = subscriptionManager.getActiveSubscriptionInfoList();
            this.V = list;
            if (list != null && list.size() == 2) {
              SubscriptionInfo subscriptionInfo1 = this.V.get(0);
              SubscriptionInfo subscriptionInfo2 = this.V.get(1);
              if (subscriptionInfo1 != null && subscriptionInfo1.getCarrierName() != null && !"".equals(subscriptionInfo1.getCarrierName())) {
                this.T = subscriptionInfo1.getCarrierName().toString();
              } else {
                this.T = "";
              } 
              if (subscriptionInfo2 != null && subscriptionInfo2.getCarrierName() != null && !"".equals(subscriptionInfo2.getCarrierName())) {
                this.U = subscriptionInfo2.getCarrierName().toString();
              } else {
                this.U = "";
              } 
            } else {
              this.T = "";
              this.U = "";
            } 
          } 
        } else {
          ImageView imageView = this.Q;
          if (imageView != null)
            imageView.setVisibility(8); 
          imageView = this.R;
          if (imageView != null)
            imageView.setVisibility(8); 
          imageView = this.S;
          if (imageView != null)
            imageView.setVisibility(8); 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void J0() {
    s = true;
    if (b1.R())
      b1.j1(true); 
  }
  
  private void L0() {
    com.allinone.callerid.i.a.r.a.a(this.z, this.A, new g(this));
  }
  
  private void M0() {
    u();
    com.allinone.callerid.i.a.r.a.b(new q(this));
  }
  
  private void N0() {
    this.Y = new s(null);
  }
  
  private void O0() {
    ((TextView)findViewById(2131298188)).setTypeface(g1.b());
    this.v = (ImageView)findViewById(2131296850);
    this.E = (EZKeyboardView)findViewById(2131297098);
    this.F = (FloatingActionButton)findViewById(2131296327);
    this.a0 = d1.b((Context)this, 2130969323, 2131231299);
    this.b0 = d1.b((Context)this, 2130969324, 2131231301);
    this.c0 = d1.b((Context)this, 2130969051, 2131230986);
    ProgressBar progressBar = (ProgressBar)findViewById(2131297380);
    this.X = progressBar;
    if (Build.VERSION.SDK_INT <= 20)
      progressBar.setVisibility(0); 
    this.Q = (ImageView)findViewById(2131297057);
    this.R = (ImageView)findViewById(2131297058);
    this.S = (ImageView)findViewById(2131297056);
    this.Z = (FrameLayout)findViewById(2131297538);
    this.Q.setVisibility(8);
    this.R.setVisibility(8);
    this.S.setVisibility(8);
    this.Q.setOnClickListener(this);
    this.R.setOnClickListener(this);
    this.S.setOnClickListener(this);
    this.x = (ListView)findViewById(2131297336);
    this.I = (ListView)findViewById(2131297337);
    if (this.d0)
      this.v.setImageResource(2131231059); 
    this.v.setOnClickListener(new a(this));
    ((ImageView)findViewById(2131297121)).setOnClickListener(new b(this));
    ImageView imageView = (ImageView)findViewById(2131297110);
    this.w = imageView;
    imageView.setOnClickListener(new c(this));
    this.N = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771990);
    Animation animation = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771991);
    this.O = animation;
    animation.setAnimationListener(new d(this));
    this.N.setAnimationListener(new e(this));
  }
  
  private void P0() {
    this.z = com.allinone.callerid.i.a.r.a.d(this.z);
  }
  
  private void Q0(List<CallLogBean> paramList) {
    if (this.y == null) {
      com.allinone.callerid.b.e e1 = new com.allinone.callerid.b.e(this, (Context)EZCallApplication.c(), this.x);
      this.y = e1;
      this.x.setAdapter((ListAdapter)e1);
    } 
  }
  
  private void R0() {
    this.x.setOnItemClickListener(new j(this));
    this.x.setOnScrollListener(new k(this));
    this.I.setOnItemClickListener(new l(this));
    this.I.setOnItemLongClickListener(new m(this));
    this.I.setOnScrollListener(new n(this));
    this.E.setNumberCallBack(new o(this));
    this.F.setImageResource(this.a0);
    this.F.setOnClickListener(new p(this));
    try {
      if (getIntent() != null) {
        BaseEditText baseEditText;
        String str = getIntent().getAction();
        boolean bool = "android.intent.action.DIAL".equals(str);
        if (bool) {
          str = getIntent().getDataString();
          if (str != null && !"".equals(str)) {
            str = str.replace("tel:", "");
            if (str != null && !"".equals(str)) {
              this.G = str;
              this.E.d.setText(str);
              baseEditText = this.E.d;
              baseEditText.setSelection(baseEditText.getText().length());
              this.F.setImageResource(this.c0);
            } 
          } 
        } else if ("android.intent.action.VIEW".equals(baseEditText)) {
          Uri uri = getIntent().getData();
          if (uri != null && "tel".equals(uri.getScheme())) {
            String str1 = uri.toString();
            if (str1 != null && !"".equals(str1)) {
              str1 = str1.replace("tel:", "");
              if (str1 != null && !"".equals(str1)) {
                this.G = str1;
                this.E.d.setText(str1);
                BaseEditText baseEditText1 = this.E.d;
                baseEditText1.setSelection(baseEditText1.getText().length());
                this.F.setImageResource(this.c0);
              } 
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void S0(List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap) {
    com.allinone.callerid.b.l l1 = new com.allinone.callerid.b.l((Context)this, paramList, paramHashMap, this.I);
    this.J = l1;
    this.I.setAdapter((ListAdapter)l1);
  }
  
  private void T0(Context paramContext) {
    this.K = new com.allinone.callerid.dialog.c((Context)this, 2131820783, new h(this, paramContext));
    com.allinone.callerid.util.q.b().c("createshortcut_dialog_show");
    this.K.show();
  }
  
  private void U0(boolean paramBoolean) {
    if (paramBoolean) {
      if (Build.VERSION.SDK_INT < 25) {
        this.w.setVisibility(8);
      } else {
        this.w.setVisibility(0);
      } 
      this.Z.setVisibility(0);
      this.E.setVisibility(0);
      this.E.startAnimation(this.N);
    } else {
      this.w.setVisibility(8);
      this.Z.setVisibility(4);
      this.E.startAnimation(this.O);
    } 
  }
  
  public void K0() {
    finish();
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297058:
        Toast.makeText((Context)this, 2131755098, 0).show();
        b1.m1(false);
        b1.U0(-1);
        I0();
        com.allinone.callerid.util.q.b().c(h1.f);
        com.allinone.callerid.util.q.b().c(h1.i);
      case 2131297057:
        stringBuilder = new StringBuilder();
        stringBuilder.append(getString(2131755186));
        stringBuilder.append(" ");
        stringBuilder.append(this.U);
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        b1.m1(true);
        b1.U0(1);
        I0();
        com.allinone.callerid.util.q.b().c(h1.f);
        com.allinone.callerid.util.q.b().c(h1.h);
      case 2131297056:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getString(2131755185));
    stringBuilder.append(" ");
    stringBuilder.append(this.T);
    Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
    b1.m1(true);
    b1.U0(0);
    I0();
    com.allinone.callerid.util.q.b().c(h1.f);
    com.allinone.callerid.util.q.b().c(h1.g);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      setContentView(2131492922);
      N0();
      boolean bool = i1.f0(getApplicationContext()).booleanValue();
      this.d0 = bool;
      if (bool && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      View view = getWindow().getDecorView();
      i i = new i();
      this(this);
      view.post(i);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    this.f0.removeCallbacksAndMessages(null);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      K0();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
    I0();
    if (getIntent().getBooleanExtra("shortcutdial", false))
      com.allinone.callerid.util.q.b().c("shortcut_dial"); 
    if (s && b1.R() && b1.E() && b1.M()) {
      T0(getApplicationContext());
      b1.w1(false);
      b1.j1(false);
    } 
  }
  
  public void u() {
    try {
      if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
        this.z.clear();
        this.C.clear();
        this.D.clear();
        List<CallLogBean> list = this.z;
        List<String> list1 = this.C;
        HashMap<String, Integer> hashMap = this.D;
        f f = new f();
        this(this);
        com.allinone.callerid.i.a.r.a.c(list, list1, hashMap, f);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements View.OnClickListener {
    a(EZDialerActivity this$0) {}
    
    public void onClick(View param1View) {
      if (EZDialerActivity.G0(this.b).length() > 0) {
        EZDialerActivity.H0(this.b, "");
        EZDialerActivity.Y(this.b).e();
        EZDialerActivity.k0(this.b).clear();
        EZDialerActivity.i0(this.b).setVisibility(8);
        EZDialerActivity.j0(this.b).setVisibility(0);
        if (EZDialerActivity.l0(this.b)) {
          EZDialerActivity.g0(this.b).setImageResource(2131231059);
        } else {
          EZDialerActivity.g0(this.b).setImageResource(2131231058);
        } 
      } else {
        this.b.K0();
      } 
    }
  }
  
  class b implements View.OnClickListener {
    b(EZDialerActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.startActivity(new Intent((Context)this.b, ContactsListActivity.class));
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class c implements View.OnClickListener {
    c(EZDialerActivity this$0) {}
    
    public void onClick(View param1View) {
      Intent intent = new Intent((Context)this.b, QuickContactActivity.class);
      this.b.startActivity(intent);
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class d implements Animation.AnimationListener {
    d(EZDialerActivity this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      EZDialerActivity.Y(this.a).setVisibility(8);
      EZDialerActivity.t = true;
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class e implements Animation.AnimationListener {
    e(EZDialerActivity this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      if (!EZDialerActivity.r0(this.a))
        EZDialerActivity.s0(this.a, true); 
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class f implements com.allinone.callerid.i.a.r.b {
    f(EZDialerActivity this$0) {}
    
    public void a(List<CallLogBean> param1List, List<String> param1List1, HashMap<String, Integer> param1HashMap) {
      if (param1List != null && param1List.size() > 0) {
        EZDialerActivity.R(this.a, param1List);
        EZDialerActivity.t0(this.a, param1List1);
        EZDialerActivity.U(this.a, param1HashMap);
        EZDialerActivity.u0(this.a).e(EZDialerActivity.Q(this.a), EZDialerActivity.T(this.a));
        EZDialerActivity.u0(this.a).notifyDataSetChanged();
        EZDialerActivity.v0(this.a).setVisibility(8);
        (j0.a()).b.execute(new a(this));
      } else {
        EZDialerActivity.v0(this.a).setVisibility(8);
        EZDialerActivity.F0(this.a, true);
        if (EZDialerActivity.Q(this.a) != null && EZDialerActivity.Q(this.a).size() > 0)
          EZDialerActivity.Q(this.a).clear(); 
        EZDialerActivity.u0(this.a).notifyDataSetChanged();
      } 
    }
    
    class a implements Runnable {
      a(EZDialerActivity.f this$0) {}
      
      public void run() {
        if (EZDialerActivity.Q(this.b.a) != null && EZDialerActivity.Q(this.b.a).size() != 0) {
          EZDialerActivity.w0(this.b.a);
          EZDialerActivity.x0(this.b.a).sendEmptyMessage(112);
          EZDialerActivity.y0(this.b.a);
          EZDialerActivity.x0(this.b.a).sendEmptyMessage(112);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(EZDialerActivity this$0) {}
    
    public void run() {
      if (EZDialerActivity.Q(this.b.a) != null && EZDialerActivity.Q(this.b.a).size() != 0) {
        EZDialerActivity.w0(this.b.a);
        EZDialerActivity.x0(this.b.a).sendEmptyMessage(112);
        EZDialerActivity.y0(this.b.a);
        EZDialerActivity.x0(this.b.a).sendEmptyMessage(112);
      } 
    }
  }
  
  class g implements com.allinone.callerid.i.a.r.c {
    g(EZDialerActivity this$0) {}
    
    public void a(List<CallLogBean> param1List1, List<CallLogBean> param1List2) {
      if (param1List1 != null)
        EZDialerActivity.R(this.a, param1List1); 
      if (param1List2 != null)
        EZDialerActivity.B0(this.a, param1List2); 
    }
  }
  
  class h implements View.OnClickListener {
    h(EZDialerActivity this$0, Context param1Context) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131296485) {
        if (i == 2131296733) {
          com.allinone.callerid.util.q.b().c("createshortcut_dialog_click");
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("手机系统：");
            stringBuilder.append(Build.VERSION.SDK_INT);
            d0.a("tony", stringBuilder.toString());
          } 
          if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager)this.b.getSystemService("shortcut");
            if (shortcutManager.isRequestPinShortcutSupported()) {
              Intent intent = new Intent((Context)this.c, EZDialerActivity.class);
              intent.setAction("android.intent.action.VIEW");
              shortcutManager.requestPinShortcut((new ShortcutInfo.Builder(this.b, "only id")).setIcon(Icon.createWithResource(this.b, 2131558400)).setShortLabel(this.c.getResources().getString(2131755736)).setIntent(intent).build(), PendingIntent.getBroadcast(this.b, 0, new Intent(this.b, MyReceiver.class), 134217728).getIntentSender());
              b1.q1(false);
              EZDialerActivity.z0(this.c).dismiss();
            } 
          } else {
            if (b1.L()) {
              com.allinone.callerid.util.d.d(this.c.getApplicationContext());
              b1.q1(false);
            } 
            EZDialerActivity.z0(this.c).dismiss();
          } 
        } 
      } else {
        EZDialerActivity.z0(this.c).dismiss();
      } 
    }
  }
  
  class i implements Runnable {
    i(EZDialerActivity this$0) {}
    
    public void run() {
      EZDialerActivity.E0(this.b);
      EZDialerActivity.F0(this.b, true);
      EZDialerActivity.H0(this.b, "");
      EZDialerActivity.P(this.b);
      EZDialerActivity.R(this.b, new ArrayList());
      EZDialerActivity eZDialerActivity = this.b;
      EZDialerActivity.S(eZDialerActivity, EZDialerActivity.Q(eZDialerActivity));
      eZDialerActivity = this.b;
      EZDialerActivity.V(eZDialerActivity, EZDialerActivity.C0(eZDialerActivity), EZDialerActivity.T(this.b));
      EZDialerActivity.W(this.b);
      EZDialerActivity.X(this.b);
    }
  }
  
  class j implements AdapterView.OnItemClickListener {
    j(EZDialerActivity this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (EZDialerActivity.Q(this.b) != null && EZDialerActivity.Q(this.b).size() != 0) {
        CallLogBean callLogBean = EZDialerActivity.Q(this.b).get(param1Int);
        if (callLogBean.T()) {
          Intent intent = new Intent();
          Bundle bundle = new Bundle();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)this.b, ContactActivity.class);
          this.b.startActivity(intent);
          this.b.overridePendingTransition(2130771968, 2130771969);
        } else {
          Intent intent = new Intent();
          Bundle bundle = new Bundle();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)this.b, UnknownContactActivity.class);
          this.b.startActivity(intent);
          this.b.overridePendingTransition(2130771968, 2130771969);
        } 
      } 
    }
  }
  
  class k implements AbsListView.OnScrollListener {
    k(EZDialerActivity this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      if (EZDialerActivity.Y(this.a).getVisibility() == 0 && EZDialerActivity.t) {
        EZDialerActivity.a0(this.a).setImageResource(EZDialerActivity.Z(this.a));
        EZDialerActivity.F0(this.a, false);
        EZDialerActivity.t = false;
        EZDialerActivity.c0(this.a).setVisibility(8);
        EZDialerActivity.e0(this.a).setVisibility(8);
        EZDialerActivity.f0(this.a).setVisibility(8);
      } 
    }
  }
  
  class l implements AdapterView.OnItemClickListener {
    l(EZDialerActivity this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (EZDialerActivity.C0(this.b) != null && EZDialerActivity.C0(this.b).size() != 0) {
        CallLogBean callLogBean = EZDialerActivity.C0(this.b).get(param1Int);
        try {
          if (c1.h((Context)this.b)) {
            if (b1.H()) {
              param1Int = b1.q();
              c1.d((Context)this.b, param1Int, callLogBean.p());
            } else if (Build.VERSION.SDK_INT >= 22) {
              c1.m((Context)this.b, callLogBean.p());
            } else {
              q0.a(this.b.getApplicationContext(), callLogBean.p());
            } 
          } else {
            q0.a(this.b.getApplicationContext(), callLogBean.p());
          } 
        } catch (Exception exception) {
          Toast.makeText(this.b.getApplicationContext(), this.b.getResources().getString(2131755541), 1).show();
        } 
      } 
    }
  }
  
  class m implements AdapterView.OnItemLongClickListener {
    m(EZDialerActivity this$0) {}
    
    public boolean onItemLongClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      return true;
    }
  }
  
  class n implements AbsListView.OnScrollListener {
    n(EZDialerActivity this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      if (EZDialerActivity.Y(this.a).getVisibility() == 0 && EZDialerActivity.t) {
        EZDialerActivity.a0(this.a).setImageResource(EZDialerActivity.Z(this.a));
        EZDialerActivity.F0(this.a, false);
        EZDialerActivity.t = false;
      } 
    }
  }
  
  class o implements EZKeyboardView.b {
    o(EZDialerActivity this$0) {}
    
    @SuppressLint({"StaticFieldLeak"})
    public void a(String param1String1, String param1String2) {
      try {
        EZDialerActivity.H0(this.a, param1String2);
        EZDialerActivity eZDialerActivity = this.a;
        EZDialerActivity.H0(eZDialerActivity, EZDialerActivity.G0(eZDialerActivity).replaceAll("[ \\(\\)-]+", ""));
        if (EZDialerActivity.G0(this.a).length() > 0) {
          EZDialerActivity.g0(this.a).setImageResource(2131231347);
          EZDialerActivity.h0(this.a).filter(EZDialerActivity.G0(this.a));
          EZDialerActivity.i0(this.a).setVisibility(0);
          EZDialerActivity.j0(this.a).setVisibility(8);
        } else {
          EZDialerActivity.k0(this.a).clear();
          EZDialerActivity.i0(this.a).setVisibility(8);
          EZDialerActivity.j0(this.a).setVisibility(0);
          if (EZDialerActivity.l0(this.a)) {
            EZDialerActivity.g0(this.a).setImageResource(2131231059);
          } else {
            EZDialerActivity.g0(this.a).setImageResource(2131231058);
          } 
        } 
        EZDialerActivity.j0(this.a).setSelection(0);
        if (!"".equals(EZDialerActivity.G0(this.a))) {
          EZDialerActivity.a0(this.a).setImageResource(EZDialerActivity.m0(this.a));
        } else {
          EZDialerActivity.a0(this.a).setImageResource(EZDialerActivity.o0(this.a));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class p implements View.OnClickListener {
    p(EZDialerActivity this$0) {}
    
    public void onClick(View param1View) {
      try {
        int i = EZDialerActivity.Y(this.b).getVisibility();
        if (i == 0) {
          if (EZDialerActivity.G0(this.b) != null && !EZDialerActivity.G0(this.b).equals("")) {
            EZDialerActivity.q0(this.b);
            if (c1.h(this.b.getApplicationContext())) {
              i = b1.q();
              if (i == -1) {
                if (Build.VERSION.SDK_INT >= 22) {
                  EZDialerActivity eZDialerActivity = this.b;
                  c1.m((Context)eZDialerActivity, EZDialerActivity.G0(eZDialerActivity));
                } else {
                  q0.a(this.b.getApplicationContext(), EZDialerActivity.G0(this.b));
                } 
              } else {
                EZDialerActivity eZDialerActivity = this.b;
                c1.d((Context)eZDialerActivity, i, EZDialerActivity.G0(eZDialerActivity));
              } 
            } else {
              q0.a(this.b.getApplicationContext(), EZDialerActivity.G0(this.b));
            } 
          } else {
            EZDialerActivity.a0(this.b).setImageResource(EZDialerActivity.Z(this.b));
            EZDialerActivity.F0(this.b, false);
          } 
        } else {
          EZDialerActivity.F0(this.b, true);
          if (c1.h(this.b.getApplicationContext()))
            EZDialerActivity.P(this.b); 
          if (EZDialerActivity.G0(this.b) != null && !EZDialerActivity.G0(this.b).equals("")) {
            EZDialerActivity.a0(this.b).setImageResource(EZDialerActivity.m0(this.b));
          } else {
            EZDialerActivity.a0(this.b).setImageResource(EZDialerActivity.o0(this.b));
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class q implements com.allinone.callerid.i.a.r.d {
    q(EZDialerActivity this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      EZDialerActivity.d0(this.a, param1ArrayList);
    }
  }
  
  private static class r extends Handler {
    private WeakReference<Context> a;
    
    r(Context param1Context) {
      this.a = new WeakReference<Context>(param1Context);
    }
    
    public void handleMessage(Message param1Message) {
      EZDialerActivity eZDialerActivity = (EZDialerActivity)this.a.get();
      if (eZDialerActivity != null && param1Message.what == 112 && EZDialerActivity.Q(eZDialerActivity) != null && EZDialerActivity.Q(eZDialerActivity).size() > 0) {
        EZDialerActivity.u0(eZDialerActivity).e(EZDialerActivity.Q(eZDialerActivity), null);
        EZDialerActivity.u0(eZDialerActivity).notifyDataSetChanged();
      } 
    }
  }
  
  private class s extends Filter {
    private s(EZDialerActivity this$0) {}
    
    protected Filter.FilterResults performFiltering(CharSequence param1CharSequence) {
      if (EZDialerActivity.O(this.a) != null) {
        EZDialerActivity.O(this.a).clear();
        if (EZDialerActivity.b0(this.a) != null && EZDialerActivity.b0(this.a).size() > 0) {
          List list;
          if (TextUtils.isEmpty(param1CharSequence)) {
            list = EZDialerActivity.b0(this.a);
          } else {
            list = com.allinone.callerid.util.t9.d.d(EZDialerActivity.b0(this.a), param1CharSequence.toString());
          } 
          EZDialerActivity.p0(this.a, list.size());
          EZDialerActivity.O(this.a).addAll(list);
        } 
        if (EZDialerActivity.A0(this.a) != null && EZDialerActivity.A0(this.a).size() > 0) {
          List list;
          if (TextUtils.isEmpty(param1CharSequence)) {
            list = EZDialerActivity.A0(this.a);
          } else {
            list = com.allinone.callerid.util.t9.d.d(EZDialerActivity.A0(this.a), list.toString());
          } 
          EZDialerActivity.O(this.a).addAll(list);
        } 
      } 
      Filter.FilterResults filterResults = new Filter.FilterResults();
      if (EZDialerActivity.O(this.a) != null) {
        filterResults.count = EZDialerActivity.O(this.a).size();
        filterResults.values = EZDialerActivity.O(this.a);
      } else {
        filterResults.count = 0;
        filterResults.values = null;
      } 
      return filterResults;
    }
    
    protected void publishResults(CharSequence param1CharSequence, Filter.FilterResults param1FilterResults) {
      List list = (List)param1FilterResults.values;
      if (list != null) {
        if (EZDialerActivity.C0(this.a) != null) {
          EZDialerActivity.C0(this.a).clear();
          EZDialerActivity.C0(this.a).addAll(list);
        } 
        EZDialerActivity.D0(this.a).b(EZDialerActivity.C0(this.a), EZDialerActivity.n0(this.a));
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/EZDialerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */