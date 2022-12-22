package com.allinone.callerid.mvc.controller;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZCountryCode;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.n0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class EZSearchNumberActivity extends BaseActivity {
  public List<EZCountryCode> A;
  
  public LinearLayout B;
  
  public FrameLayout C;
  
  public TextView D;
  
  private ImageView E;
  
  private String F = "";
  
  private String G;
  
  public TextView H;
  
  private ListView I;
  
  private List<CallLogBean> J;
  
  private TextView K;
  
  private com.allinone.callerid.b.b0.a L;
  
  private boolean M;
  
  private boolean N = true;
  
  private ViewStub O;
  
  private ViewStub P;
  
  private ListView Q;
  
  private com.allinone.callerid.b.o R;
  
  private ArrayList<CallLogBean> S = new ArrayList<CallLogBean>();
  
  private ArrayList<CallLogBean> T = new ArrayList<CallLogBean>();
  
  private HashMap<String, Integer> U = new HashMap<String, Integer>();
  
  private ArrayList<CallLogBean> V;
  
  private List<CallLogBean> W = new ArrayList<CallLogBean>();
  
  private List<String> X = new ArrayList<String>();
  
  private List<CallLogBean> Y = new ArrayList<CallLogBean>();
  
  private FrameLayout Z;
  
  private boolean a0 = false;
  
  private int b0 = 0;
  
  private ViewStub c0;
  
  private ViewStub d0;
  
  private ImageView e0;
  
  private Typeface f0;
  
  private ImageView g0;
  
  private TextWatcher h0;
  
  private Handler i0 = new Handler();
  
  private Runnable j0 = new l(this);
  
  private final String s = "EZSearchNumberActivity";
  
  public BaseEditText t;
  
  public ImageView u;
  
  private ProgressBar v;
  
  public ListView w;
  
  public List<EZSearchResult> x = new ArrayList<EZSearchResult>();
  
  public String y = "";
  
  com.allinone.callerid.b.b0.b z;
  
  private void A1() {
    try {
      ((TextView)((LinearLayout)this.P.inflate()).findViewById(2131298110)).setTypeface(this.f0);
    } catch (Exception exception) {
      this.P.setVisibility(0);
    } 
  }
  
  private void B1() {
    try {
      ((TextView)((LinearLayout)this.d0.inflate()).findViewById(2131298182)).setTypeface(this.f0);
    } catch (Exception exception) {
      this.d0.setVisibility(0);
    } 
  }
  
  private void C1() {
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(this.u, "alpha", new float[] { 1.0F, 0.3F, 1.0F });
    objectAnimator.setDuration(1500L);
    objectAnimator.setRepeatCount(2);
    objectAnimator.setRepeatMode(1);
    objectAnimator.start();
  }
  
  private void j1() {
    com.allinone.callerid.i.a.w.a.c(this.J, new c(this));
  }
  
  private void m1() {
    getWindow().getDecorView().post(new m(this));
  }
  
  private void n1() {
    View view = LayoutInflater.from((Context)this).inflate(2131493159, null);
    this.I.addFooterView(view, null, false);
    FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296431);
    this.Z = frameLayout;
    frameLayout.setOnClickListener(new b(this));
  }
  
  private void o1() {
    if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CONTACTS") == 0)
      com.allinone.callerid.i.a.w.a.d(new n(this)); 
  }
  
  private void p1(String paramString, boolean paramBoolean) {
    String str1 = this.G;
    String str2 = paramString;
    if (str1 != null) {
      str2 = paramString;
      if (!"".equals(str1))
        str2 = this.G; 
    } 
    com.allinone.callerid.l.a.f.f(this.y, str2, new p(this, paramBoolean));
  }
  
  private void r1() {
    String str = com.allinone.callerid.util.p.d(getApplicationContext()).getCountry_code();
    com.allinone.callerid.i.a.c0.b.a(getApplicationContext(), str, this.y, new h(this));
  }
  
  private void s1() {
    Intent intent = new Intent();
    intent.setAction("com.allinone.callerid.INIT_HISTORY");
    b.p.a.a.b(getApplicationContext()).d(intent);
  }
  
  private void v1() {
    this.Q.setOnItemClickListener(new q(this));
    this.Q.setOnItemLongClickListener(new r(this));
    this.E.setOnClickListener(new s(this));
    this.u.setOnClickListener(new t(this));
    this.t.setOnClickListener(new u(this));
    this.e0.setOnClickListener(new v(this));
    this.C.setOnClickListener(new w(this));
    this.t.setOnEditorActionListener(new x(this));
  }
  
  private void w1() {
    com.allinone.callerid.i.a.w.a.h(this.t.getText().toString());
  }
  
  private void x1(List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap) {
    com.allinone.callerid.b.o o1 = new com.allinone.callerid.b.o((Context)this, paramList, paramHashMap, this.Q);
    this.R = o1;
    this.Q.setAdapter((ListAdapter)o1);
  }
  
  private void y1(String paramString) {
    try {
      TextView textView = (TextView)((LinearLayout)this.O.inflate()).findViewById(2131298015);
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(getResources().getString(2131755535));
      stringBuilder.append(" ");
      stringBuilder.append(paramString);
      stringBuilder.append(" ");
      stringBuilder.append(getResources().getString(2131755421));
      textView.setText(stringBuilder.toString());
      textView.setTypeface(this.f0);
    } catch (Exception exception) {
      this.O.setVisibility(0);
    } 
  }
  
  private void z1() {
    try {
      ((TextView)((LinearLayout)this.c0.inflate()).findViewById(2131298007)).setTypeface(this.f0);
    } catch (Exception exception) {
      this.c0.setVisibility(0);
    } 
  }
  
  public void D1() {
    if (this.A == null)
      this.A = l1(); 
    com.allinone.callerid.dialog.m.i((Activity)this, new ArrayList<EZCountryCode>(this.A), new k(this));
  }
  
  public void h1() {
    i i = new i(this);
    this.h0 = i;
    this.t.addTextChangedListener(i);
    this.g0.setOnClickListener(new j(this));
  }
  
  public void i1() {
    String str = com.allinone.callerid.util.p.d((Context)EZCallApplication.c()).getCountry_code();
    if (str == null || "".equals(str)) {
      Toast.makeText(getApplicationContext(), 2131755752, 0).show();
      return;
    } 
    this.y = this.t.getText().toString();
    this.I.setVisibility(8);
    this.Z.setVisibility(8);
    this.v.setVisibility(0);
    if (!i1.a((Context)EZCallApplication.c())) {
      p1(str, false);
    } else {
      com.allinone.callerid.i.a.w.a.g(getApplicationContext(), this.G, str, this.y, new f(this, str));
    } 
    (j0.a()).b.execute(new g(this));
  }
  
  public void k1() {
    try {
      InputMethodManager inputMethodManager = (InputMethodManager)this.t.getContext().getSystemService("input_method");
      if (inputMethodManager != null && inputMethodManager.isActive()) {
        inputMethodManager.hideSoftInputFromWindow(this.t.getWindowToken(), 0);
        Handler handler = new Handler();
        this();
        d d = new d();
        this(this);
        handler.postDelayed(d, 300L);
      } else {
        setResult(777);
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public List<EZCountryCode> l1() {
    try {
      return com.allinone.callerid.util.p.a((Context)this);
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
    return null;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 10002 && paramInt2 == -1 && paramIntent != null) {
      ArrayList<String> arrayList = paramIntent.getStringArrayListExtra("android.speech.extra.RESULTS");
      if (arrayList != null && arrayList.size() > 0) {
        String str = n0.a(arrayList.get(0));
        if (str.matches("[0-9]+")) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("voiceText: ");
            stringBuilder.append(str);
            d0.a("wbb", stringBuilder.toString());
          } 
          this.a0 = true;
          this.t.setText(str);
          BaseEditText baseEditText = this.t;
          baseEditText.setSelection(baseEditText.getText().length());
          this.I.setVisibility(8);
          this.Z.setVisibility(8);
          i1();
          w1();
        } 
      } 
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      setContentView(2131492956);
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      View view = getWindow().getDecorView();
      a a1 = new a();
      this(this);
      view.post(a1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      this.t.removeTextChangedListener(this.h0);
      this.h0 = null;
      this.t.setOnEditorActionListener(null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4 && paramKeyEvent.getRepeatCount() == 0) {
      k1();
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
  
  public void q1() {
    (new Handler()).postDelayed(new e(this), 100L);
  }
  
  public void t1() {
    String str = b1.j();
    if (str != null && !"".equals(str)) {
      this.G = str;
      this.D.setText(b1.k());
      this.H.setText(b1.l().split("/")[0].replace(" ", ""));
    } else {
      EZCountryCode eZCountryCode = com.allinone.callerid.util.p.d(getApplicationContext());
      this.G = eZCountryCode.getCountry_code();
      this.D.setText(eZCountryCode.getCountry_name());
      this.H.setText(eZCountryCode.getIso_code().split("/")[0].replace(" ", ""));
    } 
  }
  
  public void u() {
    try {
      if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
        List<CallLogBean> list1 = this.W;
        List<String> list = this.X;
        HashMap<String, Integer> hashMap = this.U;
        List<CallLogBean> list2 = this.Y;
        o o1 = new o();
        this(this);
        com.allinone.callerid.i.a.w.a.b(list1, list, hashMap, list2, o1);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void u1() {
    EZCountryCode eZCountryCode = com.allinone.callerid.util.p.d(getApplicationContext());
    this.G = eZCountryCode.getCountry_code();
    this.D.setText(eZCountryCode.getCountry_name());
    this.H.setText(eZCountryCode.getIso_code().split("/")[0].replace(" ", ""));
    b1.N0(eZCountryCode.getCountry_code());
    b1.P0(eZCountryCode.getIso_code());
    b1.O0(eZCountryCode.getCountry_name());
  }
  
  class a implements Runnable {
    a(EZSearchNumberActivity this$0) {}
    
    public void run() {
      EZSearchNumberActivity.P(this.b, g1.b());
      EZSearchNumberActivity eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.T(eZSearchNumberActivity1, (ImageView)eZSearchNumberActivity1.findViewById(2131296368));
      if (i1.f0(this.b.getApplicationContext()).booleanValue())
        EZSearchNumberActivity.Q(this.b).setImageResource(2131231344); 
      EZSearchNumberActivity.l0(this.b, new ArrayList());
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.t = (BaseEditText)eZSearchNumberActivity1.findViewById(2131296924);
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.A0(eZSearchNumberActivity1, (ImageView)eZSearchNumberActivity1.findViewById(2131296967));
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.t.setTypeface(EZSearchNumberActivity.O(eZSearchNumberActivity1));
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.u = (ImageView)eZSearchNumberActivity1.findViewById(2131297632);
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.Q0(eZSearchNumberActivity1, (ImageView)eZSearchNumberActivity1.findViewById(2131296437));
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.X0(eZSearchNumberActivity1, (ProgressBar)eZSearchNumberActivity1.findViewById(2131297380));
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.w = (ListView)eZSearchNumberActivity1.findViewById(2131297576);
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.a1(eZSearchNumberActivity1, (ListView)eZSearchNumberActivity1.findViewById(2131297575));
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.B = (LinearLayout)eZSearchNumberActivity1.findViewById(2131297701);
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.C = (FrameLayout)eZSearchNumberActivity1.findViewById(2131297696);
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.D = (TextView)eZSearchNumberActivity1.findViewById(2131297702);
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.c1(eZSearchNumberActivity1, (TextView)eZSearchNumberActivity1.findViewById(2131298107));
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.e1(eZSearchNumberActivity1, (ViewStub)eZSearchNumberActivity1.findViewById(2131298274));
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.g1(eZSearchNumberActivity1, (ViewStub)eZSearchNumberActivity1.findViewById(2131298276));
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.S(eZSearchNumberActivity1, (ViewStub)eZSearchNumberActivity1.findViewById(2131298273));
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.V(eZSearchNumberActivity1, (ViewStub)eZSearchNumberActivity1.findViewById(2131298277));
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.D.setTypeface(EZSearchNumberActivity.O(eZSearchNumberActivity1));
      EZSearchNumberActivity.b1(this.b).setTypeface(EZSearchNumberActivity.O(this.b));
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.H = (TextView)eZSearchNumberActivity1.findViewById(2131297700);
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.H.setTypeface(EZSearchNumberActivity.O(eZSearchNumberActivity1));
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.X(eZSearchNumberActivity1, (ListView)eZSearchNumberActivity1.findViewById(2131297337));
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity.c0(eZSearchNumberActivity1, EZSearchNumberActivity.Y(eZSearchNumberActivity1), EZSearchNumberActivity.a0(this.b));
      EZSearchNumberActivity.e0(this.b, new com.allinone.callerid.b.b0.a((Activity)this.b));
      EZSearchNumberActivity.Z0(this.b).setAdapter((ListAdapter)EZSearchNumberActivity.d0(this.b));
      EZSearchNumberActivity.d0(this.b).c(new a(this));
      EZSearchNumberActivity.i0(this.b);
      this.b.h1();
      eZSearchNumberActivity1 = this.b;
      EZSearchNumberActivity eZSearchNumberActivity2 = this.b;
      eZSearchNumberActivity1.z = new com.allinone.callerid.b.b0.b((Activity)eZSearchNumberActivity2, eZSearchNumberActivity2.x);
      eZSearchNumberActivity1 = this.b;
      eZSearchNumberActivity1.w.setAdapter((ListAdapter)eZSearchNumberActivity1.z);
      this.b.u1();
      EZSearchNumberActivity.k0(this.b);
    }
    
    class a implements com.allinone.callerid.b.b0.a.c {
      a(EZSearchNumberActivity.a this$0) {}
      
      public void a(String param2String) {
        try {
          EZSearchNumberActivity.g0(this.a.b, false);
          this.a.b.t.setText(param2String);
          BaseEditText baseEditText = this.a.b.t;
          baseEditText.setSelection(baseEditText.getText().length());
          EZSearchNumberActivity.Z0(this.a.b).setVisibility(8);
          EZSearchNumberActivity.h0(this.a.b).setVisibility(8);
          this.a.b.i1();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.b.b0.a.c {
    a(EZSearchNumberActivity this$0) {}
    
    public void a(String param1String) {
      try {
        EZSearchNumberActivity.g0(this.a.b, false);
        this.a.b.t.setText(param1String);
        BaseEditText baseEditText = this.a.b.t;
        baseEditText.setSelection(baseEditText.getText().length());
        EZSearchNumberActivity.Z0(this.a.b).setVisibility(8);
        EZSearchNumberActivity.h0(this.a.b).setVisibility(8);
        this.a.b.i1();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b implements View.OnClickListener {
    b(EZSearchNumberActivity this$0) {}
    
    public void onClick(View param1View) {
      com.allinone.callerid.i.a.w.a.a(new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.w.b {
      a(EZSearchNumberActivity.b this$0) {}
      
      public void a() {
        EZSearchNumberActivity.n0(this.a.b);
        EZSearchNumberActivity.o0(this.a.b);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.w.b {
    a(EZSearchNumberActivity this$0) {}
    
    public void a() {
      EZSearchNumberActivity.n0(this.a.b);
      EZSearchNumberActivity.o0(this.a.b);
    }
  }
  
  class c implements com.allinone.callerid.i.a.w.d {
    c(EZSearchNumberActivity this$0) {}
    
    public void a(List<CallLogBean> param1List) {
      if (param1List != null)
        EZSearchNumberActivity.l0(this.a, param1List); 
      if (EZSearchNumberActivity.d0(this.a) != null) {
        EZSearchNumberActivity.d0(this.a).b(EZSearchNumberActivity.j0(this.a));
        EZSearchNumberActivity.d0(this.a).notifyDataSetChanged();
      } else {
        EZSearchNumberActivity.e0(this.a, new com.allinone.callerid.b.b0.a((Activity)this.a));
        EZSearchNumberActivity.Z0(this.a).setAdapter((ListAdapter)EZSearchNumberActivity.d0(this.a));
      } 
      if (EZSearchNumberActivity.j0(this.a) != null && EZSearchNumberActivity.j0(this.a).size() >= 1 && EZSearchNumberActivity.Y(this.a).size() == 0) {
        EZSearchNumberActivity.b1(this.a).setVisibility(8);
        EZSearchNumberActivity.d1(this.a).setVisibility(8);
        EZSearchNumberActivity.f1(this.a).setVisibility(8);
        EZSearchNumberActivity.R(this.a).setVisibility(8);
        EZSearchNumberActivity.U(this.a).setVisibility(8);
        EZSearchNumberActivity.Z0(this.a).setVisibility(0);
        EZSearchNumberActivity.h0(this.a).setVisibility(0);
      } else {
        EZSearchNumberActivity.b1(this.a).setVisibility(0);
        EZSearchNumberActivity.d1(this.a).setVisibility(8);
        EZSearchNumberActivity.f1(this.a).setVisibility(8);
        EZSearchNumberActivity.R(this.a).setVisibility(8);
        EZSearchNumberActivity.U(this.a).setVisibility(8);
        EZSearchNumberActivity.Z0(this.a).setVisibility(8);
        EZSearchNumberActivity.h0(this.a).setVisibility(8);
      } 
    }
  }
  
  class d implements Runnable {
    d(EZSearchNumberActivity this$0) {}
    
    public void run() {
      this.b.setResult(777);
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class e implements Runnable {
    e(EZSearchNumberActivity this$0) {}
    
    public void run() {
      try {
        ((InputMethodManager)this.b.t.getContext().getSystemService("input_method")).showSoftInput((View)this.b.t, 0);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class f implements com.allinone.callerid.i.a.w.e {
    f(EZSearchNumberActivity this$0, String param1String) {}
    
    public void a(EZSearchResult param1EZSearchResult, boolean param1Boolean) {
      EZSearchNumberActivity.W0(this.b).setVisibility(8);
      List<EZSearchResult> list = this.b.x;
      if (list != null && list.size() > 0) {
        this.b.x.clear();
        EZSearchNumberActivity eZSearchNumberActivity = this.b;
        eZSearchNumberActivity.z.b(eZSearchNumberActivity.x);
        this.b.z.notifyDataSetChanged();
      } 
      if (param1EZSearchResult != null) {
        if (param1EZSearchResult.getStatus() == 1) {
          list = this.b.x;
          if (list != null && list.size() == 0) {
            EZSearchNumberActivity.b1(this.b).setVisibility(8);
            EZSearchNumberActivity.d1(this.b).setVisibility(8);
            EZSearchNumberActivity.f1(this.b).setVisibility(8);
            EZSearchNumberActivity.R(this.b).setVisibility(8);
            EZSearchNumberActivity.U(this.b).setVisibility(8);
            this.b.x.add(param1EZSearchResult);
            EZSearchNumberActivity eZSearchNumberActivity = this.b;
            eZSearchNumberActivity.z.b(eZSearchNumberActivity.x);
            this.b.z.notifyDataSetChanged();
            this.b.w.setVisibility(0);
            EZSearchNumberActivity.p0(this.b);
          } 
        } else {
          EZSearchNumberActivity.Z0(this.b).setVisibility(8);
          EZSearchNumberActivity.h0(this.b).setVisibility(8);
          this.b.w.setVisibility(8);
          EZSearchNumberActivity.b1(this.b).setVisibility(8);
          EZSearchNumberActivity.r0(this.b, true);
          EZSearchNumberActivity eZSearchNumberActivity = this.b;
          EZSearchNumberActivity.s0(eZSearchNumberActivity, eZSearchNumberActivity.y);
          EZSearchNumberActivity.f1(this.b).setVisibility(8);
          EZSearchNumberActivity.R(this.b).setVisibility(8);
          EZSearchNumberActivity.U(this.b).setVisibility(8);
        } 
      } else {
        EZSearchNumberActivity.Z0(this.b).setVisibility(8);
        EZSearchNumberActivity.h0(this.b).setVisibility(8);
        this.b.w.setVisibility(8);
        EZSearchNumberActivity.b1(this.b).setVisibility(8);
        EZSearchNumberActivity.d1(this.b).setVisibility(8);
        EZSearchNumberActivity.R(this.b).setVisibility(8);
        if (param1Boolean) {
          EZSearchNumberActivity.f1(this.b).setVisibility(8);
          EZSearchNumberActivity.t0(this.b);
        } else {
          EZSearchNumberActivity.u0(this.b, this.a, true);
        } 
      } 
      com.allinone.callerid.i.a.h.l.b.a(this.b.getApplicationContext(), this.b.y, new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.h.l.a {
      a(EZSearchNumberActivity.f this$0) {}
      
      public void a(JSONArray param2JSONArray) {
        if (param2JSONArray != null && param2JSONArray.length() > 0)
          com.allinone.callerid.i.a.h.b.a(this.a.b.getApplicationContext(), param2JSONArray, new a(this)); 
      }
      
      class a implements com.allinone.callerid.i.a.h.a {
        a(EZSearchNumberActivity.f.a this$0) {}
        
        public void a(String param3String) {}
      }
    }
    
    class a implements com.allinone.callerid.i.a.h.a {
      a(EZSearchNumberActivity.f this$0) {}
      
      public void a(String param2String) {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.h.l.a {
    a(EZSearchNumberActivity this$0) {}
    
    public void a(JSONArray param1JSONArray) {
      if (param1JSONArray != null && param1JSONArray.length() > 0)
        com.allinone.callerid.i.a.h.b.a(this.a.b.getApplicationContext(), param1JSONArray, new a(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.h.a {
      a(EZSearchNumberActivity.f.a this$0) {}
      
      public void a(String param3String) {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.h.a {
    a(EZSearchNumberActivity this$0) {}
    
    public void a(String param1String) {}
  }
  
  class g implements Runnable {
    g(EZSearchNumberActivity this$0) {}
    
    public void run() {
      long l = b1.X();
      if (com.allinone.callerid.util.i.r(new Date(System.currentTimeMillis()), new Date(l))) {
        int i = b1.j0();
        if (i == 0) {
          if (d0.a)
            d0.a("tony", "当天查询一次"); 
          com.allinone.callerid.util.q.b().c("search_number_once");
        } else if (i == 1) {
          if (d0.a)
            d0.a("tony", "当天查询两次"); 
          com.allinone.callerid.util.q.b().c("search_number_twice");
        } else {
          if (d0.a)
            d0.a("tony", "当天查询三次及以上"); 
          com.allinone.callerid.util.q.b().c("search_number_more");
        } 
        b1.P1(i + 1);
      } else {
        b1.P1(1);
      } 
      b1.C1(System.currentTimeMillis());
    }
  }
  
  class h implements com.allinone.callerid.i.a.c0.a {
    h(EZSearchNumberActivity this$0) {}
    
    public void a(String param1String) {
      // Byte code:
      //   0: aload_1
      //   1: ifnull -> 227
      //   4: ldc ''
      //   6: aload_1
      //   7: invokevirtual equals : (Ljava/lang/Object;)Z
      //   10: ifne -> 227
      //   13: new org/json/JSONObject
      //   16: astore_2
      //   17: aload_2
      //   18: aload_1
      //   19: invokespecial <init> : (Ljava/lang/String;)V
      //   22: aload_2
      //   23: ldc 'status'
      //   25: invokevirtual getInt : (Ljava/lang/String;)I
      //   28: iconst_1
      //   29: if_icmpne -> 227
      //   32: aload_2
      //   33: ldc 'subtype'
      //   35: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   38: astore_3
      //   39: aload_2
      //   40: ldc 'keyword'
      //   42: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   45: astore_1
      //   46: aload_3
      //   47: ifnull -> 109
      //   50: ldc ''
      //   52: aload_3
      //   53: invokevirtual equals : (Ljava/lang/Object;)Z
      //   56: ifne -> 109
      //   59: new org/json/JSONArray
      //   62: astore #4
      //   64: aload #4
      //   66: aload_3
      //   67: invokespecial <init> : (Ljava/lang/String;)V
      //   70: aload #4
      //   72: invokevirtual length : ()I
      //   75: ifle -> 93
      //   78: aload #4
      //   80: iconst_0
      //   81: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
      //   84: ldc 'subtype'
      //   86: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   89: astore_1
      //   90: goto -> 128
      //   93: aload_1
      //   94: ifnull -> 125
      //   97: ldc ''
      //   99: aload_1
      //   100: invokevirtual equals : (Ljava/lang/Object;)Z
      //   103: ifne -> 125
      //   106: goto -> 128
      //   109: aload_1
      //   110: ifnull -> 125
      //   113: ldc ''
      //   115: aload_1
      //   116: invokevirtual equals : (Ljava/lang/Object;)Z
      //   119: ifne -> 125
      //   122: goto -> 128
      //   125: ldc ''
      //   127: astore_1
      //   128: aload_0
      //   129: getfield a : Lcom/allinone/callerid/mvc/controller/EZSearchNumberActivity;
      //   132: getfield x : Ljava/util/List;
      //   135: astore_3
      //   136: aload_3
      //   137: ifnull -> 227
      //   140: aload_3
      //   141: invokeinterface size : ()I
      //   146: ifle -> 227
      //   149: aload_1
      //   150: ifnull -> 227
      //   153: ldc ''
      //   155: aload_1
      //   156: invokevirtual equals : (Ljava/lang/Object;)Z
      //   159: ifne -> 227
      //   162: aload_0
      //   163: getfield a : Lcom/allinone/callerid/mvc/controller/EZSearchNumberActivity;
      //   166: getfield x : Ljava/util/List;
      //   169: iconst_0
      //   170: invokeinterface get : (I)Ljava/lang/Object;
      //   175: checkcast com/allinone/callerid/search/EZSearchResult
      //   178: aload_1
      //   179: invokevirtual setKeyword : (Ljava/lang/String;)V
      //   182: aload_0
      //   183: getfield a : Lcom/allinone/callerid/mvc/controller/EZSearchNumberActivity;
      //   186: astore_1
      //   187: aload_1
      //   188: getfield z : Lcom/allinone/callerid/b/b0/b;
      //   191: aload_1
      //   192: getfield x : Ljava/util/List;
      //   195: invokevirtual b : (Ljava/util/List;)V
      //   198: aload_0
      //   199: getfield a : Lcom/allinone/callerid/mvc/controller/EZSearchNumberActivity;
      //   202: getfield z : Lcom/allinone/callerid/b/b0/b;
      //   205: invokevirtual notifyDataSetChanged : ()V
      //   208: aload_2
      //   209: aload_0
      //   210: getfield a : Lcom/allinone/callerid/mvc/controller/EZSearchNumberActivity;
      //   213: getfield y : Ljava/lang/String;
      //   216: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)V
      //   219: goto -> 227
      //   222: astore_1
      //   223: aload_1
      //   224: invokevirtual printStackTrace : ()V
      //   227: return
      // Exception table:
      //   from	to	target	type
      //   13	46	222	org/json/JSONException
      //   50	90	222	org/json/JSONException
      //   97	106	222	org/json/JSONException
      //   113	122	222	org/json/JSONException
      //   128	136	222	org/json/JSONException
      //   140	149	222	org/json/JSONException
      //   153	219	222	org/json/JSONException
    }
  }
  
  class i implements TextWatcher {
    i(EZSearchNumberActivity this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      if (d0.a)
        d0.a("searchNumber", "afterTextChanged"); 
      if ("".equals(this.b.t.getText().toString())) {
        EZSearchNumberActivity.x0(this.b).setVisibility(4);
      } else {
        EZSearchNumberActivity.x0(this.b).setVisibility(0);
      } 
      if (this.b.x.size() > 0) {
        this.b.x.clear();
        EZSearchNumberActivity eZSearchNumberActivity = this.b;
        eZSearchNumberActivity.z.b(eZSearchNumberActivity.x);
        this.b.z.notifyDataSetChanged();
        this.b.w.setVisibility(8);
        EZSearchNumberActivity.n0(this.b);
      } else if (EZSearchNumberActivity.q0(this.b)) {
        this.b.w.setVisibility(8);
        EZSearchNumberActivity.n0(this.b);
        EZSearchNumberActivity.r0(this.b, false);
      } 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      try {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("onTextChanged---CharSequence:");
          stringBuilder.append(param1CharSequence);
          d0.a("searchNumber", stringBuilder.toString());
        } 
        if (EZSearchNumberActivity.v0(this.b)) {
          EZSearchNumberActivity.w0(this.b, false);
          return;
        } 
        if (param1CharSequence != null && !"".equals(param1CharSequence.toString())) {
          if ((param1CharSequence.toString().startsWith("00") || param1CharSequence.toString().startsWith("+")) && param1CharSequence.length() <= 8 && param1CharSequence.length() >= 2) {
            Context context = this.b.getApplicationContext();
            String str1 = EZSearchNumberActivity.y0(this.b);
            String str2 = param1CharSequence.toString();
            a a = new a();
            this(this);
            com.allinone.callerid.i.a.x.b.c(context, str1, str2, a);
          } 
          if (param1CharSequence.length() > 0) {
            if (EZSearchNumberActivity.f0(this.b)) {
              String str = param1CharSequence.toString();
              EZSearchNumberActivity.y y = new EZSearchNumberActivity.y();
              this(this.b);
              y.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[] { str });
              EZSearchNumberActivity.W(this.b).setVisibility(0);
              EZSearchNumberActivity.Z0(this.b).setVisibility(8);
              EZSearchNumberActivity.h0(this.b).setVisibility(8);
              if (EZSearchNumberActivity.b1(this.b).getVisibility() == 0)
                EZSearchNumberActivity.b1(this.b).setVisibility(8); 
            } else {
              EZSearchNumberActivity.g0(this.b, true);
            } 
          } else {
            EZSearchNumberActivity.Y(this.b).clear();
            EZSearchNumberActivity.W(this.b).setVisibility(8);
            EZSearchNumberActivity.R(this.b).setVisibility(8);
            EZSearchNumberActivity.f1(this.b).setVisibility(8);
            EZSearchNumberActivity.U(this.b).setVisibility(8);
            if (EZSearchNumberActivity.j0(this.b) != null && EZSearchNumberActivity.j0(this.b).size() != 0) {
              EZSearchNumberActivity.Z0(this.b).setVisibility(0);
              EZSearchNumberActivity.h0(this.b).setVisibility(0);
            } else {
              EZSearchNumberActivity.b1(this.b).setVisibility(0);
            } 
          } 
        } else {
          EZSearchNumberActivity.Y(this.b).clear();
          EZSearchNumberActivity.W(this.b).setVisibility(8);
          EZSearchNumberActivity.R(this.b).setVisibility(8);
          EZSearchNumberActivity.f1(this.b).setVisibility(8);
          EZSearchNumberActivity.U(this.b).setVisibility(8);
          if (EZSearchNumberActivity.j0(this.b) != null && EZSearchNumberActivity.j0(this.b).size() != 0) {
            EZSearchNumberActivity.Z0(this.b).setVisibility(0);
            EZSearchNumberActivity.h0(this.b).setVisibility(0);
          } else {
            EZSearchNumberActivity.b1(this.b).setVisibility(0);
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.x.a {
      a(EZSearchNumberActivity.i this$0) {}
      
      public void a(String param2String) {
        if (param2String != null && !"".equals(param2String)) {
          EZSearchNumberActivity.C0(this.a.b, param2String);
          if (!EZSearchNumberActivity.B0(this.a.b).equals(EZSearchNumberActivity.y0(this.a.b))) {
            EZSearchNumberActivity eZSearchNumberActivity = this.a.b;
            EZSearchNumberActivity.z0(eZSearchNumberActivity, EZSearchNumberActivity.B0(eZSearchNumberActivity));
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("def_cc==");
              stringBuilder.append(EZSearchNumberActivity.y0(this.a.b));
              d0.a("searchCC", stringBuilder.toString());
            } 
            this.a.b.t1();
            EZSearchNumberActivity.C0(this.a.b, "");
          } 
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.x.a {
    a(EZSearchNumberActivity this$0) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String)) {
        EZSearchNumberActivity.C0(this.a.b, param1String);
        if (!EZSearchNumberActivity.B0(this.a.b).equals(EZSearchNumberActivity.y0(this.a.b))) {
          EZSearchNumberActivity eZSearchNumberActivity = this.a.b;
          EZSearchNumberActivity.z0(eZSearchNumberActivity, EZSearchNumberActivity.B0(eZSearchNumberActivity));
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("def_cc==");
            stringBuilder.append(EZSearchNumberActivity.y0(this.a.b));
            d0.a("searchCC", stringBuilder.toString());
          } 
          this.a.b.t1();
          EZSearchNumberActivity.C0(this.a.b, "");
        } 
      } 
    }
  }
  
  class j implements View.OnClickListener {
    j(EZSearchNumberActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.t.setText("");
    }
  }
  
  class k implements com.allinone.callerid.i.a.b {
    k(EZSearchNumberActivity this$0) {}
    
    public void a(EZCountryCode param1EZCountryCode) {
      try {
        EZCountryCode eZCountryCode = com.allinone.callerid.util.p.d(this.a.getApplicationContext());
        if (eZCountryCode != null && "".equals(eZCountryCode.getCountry_code()))
          com.allinone.callerid.util.p.h((Context)this.a.getApplication(), param1EZCountryCode); 
        b1.N0(param1EZCountryCode.getCountry_code());
        b1.P0(param1EZCountryCode.getIso_code());
        b1.O0(param1EZCountryCode.getCountry_name());
        this.a.t1();
        this.a.t.setFocusable(true);
        this.a.t.setFocusableInTouchMode(true);
        this.a.t.requestFocus();
        this.a.t.findFocus();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class l implements Runnable {
    l(EZSearchNumberActivity this$0) {}
    
    public void run() {
      if (b1.F()) {
        EZSearchNumberActivity.M0(this.b);
        b1.k1(false);
      } 
      EZSearchNumberActivity.N0(this.b);
      this.b.q1();
      Intent intent = this.b.getIntent();
      if (intent != null) {
        String str = intent.getStringExtra("searchnumber");
        if (str != null && !"".equals(str)) {
          EZSearchNumberActivity.w0(this.b, true);
          this.b.t.setText(str);
          BaseEditText baseEditText = this.b.t;
          baseEditText.setSelection(baseEditText.getText().length());
          EZSearchNumberActivity.Z0(this.b).setVisibility(8);
          EZSearchNumberActivity.h0(this.b).setVisibility(8);
          this.b.i1();
          EZSearchNumberActivity.m0(this.b);
        } else {
          EZSearchNumberActivity.n0(this.b);
        } 
        if (intent.getBooleanExtra("speak_search_number", false)) {
          intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
          intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
          try {
            this.b.startActivityForResult(intent, 10002);
          } catch (Exception exception) {
            Toast.makeText(this.b.getApplicationContext(), this.b.getResources().getString(2131755855), 0).show();
          } 
        } 
      } 
      (j0.a()).b.execute(new a(this));
      EZSearchNumberActivity.O0(this.b);
      this.b.u();
    }
    
    class a implements Runnable {
      a(EZSearchNumberActivity.l this$0) {}
      
      public void run() {
        EZSearchNumberActivity eZSearchNumberActivity = this.b.b;
        eZSearchNumberActivity.A = eZSearchNumberActivity.l1();
      }
    }
  }
  
  class a implements Runnable {
    a(EZSearchNumberActivity this$0) {}
    
    public void run() {
      EZSearchNumberActivity eZSearchNumberActivity = this.b.b;
      eZSearchNumberActivity.A = eZSearchNumberActivity.l1();
    }
  }
  
  class m implements Runnable {
    m(EZSearchNumberActivity this$0) {}
    
    public void run() {
      EZSearchNumberActivity.R0(this.b).post(EZSearchNumberActivity.P0(this.b));
    }
  }
  
  class n implements com.allinone.callerid.i.a.w.d {
    n(EZSearchNumberActivity this$0) {}
    
    public void a(List<CallLogBean> param1List) {
      EZSearchNumberActivity.E0(this.a, (ArrayList)param1List);
    }
  }
  
  class o implements com.allinone.callerid.i.a.w.c {
    o(EZSearchNumberActivity this$0) {}
    
    public void a(List<CallLogBean> param1List1, List<String> param1List, HashMap<String, Integer> param1HashMap, List<CallLogBean> param1List2) {
      EZSearchNumberActivity.S0(this.a, param1List1);
      EZSearchNumberActivity.T0(this.a, param1List);
      EZSearchNumberActivity.b0(this.a, param1HashMap);
      EZSearchNumberActivity.K0(this.a, param1List2);
    }
  }
  
  class p implements com.allinone.callerid.l.a.g {
    p(EZSearchNumberActivity this$0, boolean param1Boolean) {}
    
    public void a(EZSearchResult param1EZSearchResult) {
      EZSearchNumberActivity.W0(this.b).setVisibility(8);
      List<EZSearchResult> list = this.b.x;
      if (list != null && list.size() > 0) {
        this.b.x.clear();
        EZSearchNumberActivity eZSearchNumberActivity = this.b;
        eZSearchNumberActivity.z.b(eZSearchNumberActivity.x);
        this.b.z.notifyDataSetChanged();
      } 
      if (param1EZSearchResult != null) {
        list = this.b.x;
        if (list != null && list.size() == 0) {
          String str2 = param1EZSearchResult.getName();
          String str1 = param1EZSearchResult.getType_label();
          String str3 = param1EZSearchResult.getLocation();
          if ((str2 != null && !"".equals(str2)) || (str1 != null && !"".equals(str1)) || (str3 != null && !"".equals(str3))) {
            EZSearchNumberActivity.b1(this.b).setVisibility(8);
            EZSearchNumberActivity.d1(this.b).setVisibility(8);
            EZSearchNumberActivity.f1(this.b).setVisibility(8);
            EZSearchNumberActivity.R(this.b).setVisibility(8);
            EZSearchNumberActivity.U(this.b).setVisibility(8);
            this.b.x.add(param1EZSearchResult);
            EZSearchNumberActivity eZSearchNumberActivity = this.b;
            eZSearchNumberActivity.z.b(eZSearchNumberActivity.x);
            this.b.z.notifyDataSetChanged();
            this.b.w.setVisibility(0);
          } else {
            EZSearchNumberActivity.Z0(this.b).setVisibility(8);
            EZSearchNumberActivity.h0(this.b).setVisibility(8);
            this.b.w.setVisibility(8);
            EZSearchNumberActivity.b1(this.b).setVisibility(8);
            EZSearchNumberActivity.d1(this.b).setVisibility(8);
            EZSearchNumberActivity.U(this.b).setVisibility(8);
            if (this.a) {
              EZSearchNumberActivity.U0(this.b);
              EZSearchNumberActivity.R(this.b).setVisibility(8);
            } else {
              EZSearchNumberActivity.V0(this.b);
              EZSearchNumberActivity.f1(this.b).setVisibility(8);
            } 
          } 
          return;
        } 
      } 
      EZSearchNumberActivity.Z0(this.b).setVisibility(8);
      EZSearchNumberActivity.h0(this.b).setVisibility(8);
      this.b.w.setVisibility(8);
      EZSearchNumberActivity.b1(this.b).setVisibility(8);
      EZSearchNumberActivity.d1(this.b).setVisibility(8);
      EZSearchNumberActivity.U(this.b).setVisibility(8);
      if (this.a) {
        EZSearchNumberActivity.U0(this.b);
        EZSearchNumberActivity.R(this.b).setVisibility(8);
      } else {
        EZSearchNumberActivity.V0(this.b);
        EZSearchNumberActivity.f1(this.b).setVisibility(8);
      } 
    }
  }
  
  class q implements AdapterView.OnItemClickListener {
    q(EZSearchNumberActivity this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      try {
        if (EZSearchNumberActivity.Y(this.b) != null && EZSearchNumberActivity.Y(this.b).size() != 0) {
          CallLogBean callLogBean = EZSearchNumberActivity.Y(this.b).get(param1Int);
          this.b.t.setText(callLogBean.p());
          BaseEditText baseEditText = this.b.t;
          baseEditText.setSelection(baseEditText.getText().length());
          EZSearchNumberActivity.Z0(this.b).setVisibility(8);
          EZSearchNumberActivity.h0(this.b).setVisibility(8);
          EZSearchNumberActivity.Y(this.b).clear();
          EZSearchNumberActivity.W(this.b).setVisibility(8);
          this.b.i1();
          EZSearchNumberActivity.m0(this.b);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class r implements AdapterView.OnItemLongClickListener {
    r(EZSearchNumberActivity this$0) {}
    
    public boolean onItemLongClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      return true;
    }
  }
  
  class s implements View.OnClickListener {
    s(EZSearchNumberActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.k1();
    }
  }
  
  class t implements View.OnClickListener {
    t(EZSearchNumberActivity this$0) {}
    
    public void onClick(View param1View) {
      com.allinone.callerid.util.q.b().c("switch_cc_click");
      if (this.b.B.getVisibility() == 0) {
        this.b.u.setImageResource(2131231318);
        Animation animation = AnimationUtils.loadAnimation(this.b.getApplicationContext(), 2130771969);
        this.b.B.startAnimation(animation);
        this.b.B.setVisibility(8);
      } else {
        this.b.u.setImageResource(2131231319);
        this.b.B.setVisibility(0);
      } 
    }
  }
  
  class u implements View.OnClickListener {
    u(EZSearchNumberActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.t.setFocusable(true);
      this.b.t.setFocusableInTouchMode(true);
      this.b.t.requestFocus();
      this.b.t.findFocus();
    }
  }
  
  class v implements View.OnClickListener {
    v(EZSearchNumberActivity this$0) {}
    
    public void onClick(View param1View) {
      Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
      intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
      try {
        this.b.startActivityForResult(intent, 10002);
      } catch (Exception exception) {
        Toast.makeText(this.b.getApplicationContext(), this.b.getResources().getString(2131755855), 0).show();
      } 
    }
  }
  
  class w implements View.OnClickListener {
    w(EZSearchNumberActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.D1();
    }
  }
  
  class x implements TextView.OnEditorActionListener {
    x(EZSearchNumberActivity this$0) {}
    
    public boolean onEditorAction(TextView param1TextView, int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int == 3) {
        try {
          ((InputMethodManager)param1TextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(param1TextView.getWindowToken(), 0);
          EZSearchNumberActivity.W(this.a).setVisibility(8);
          if (!"".equals(this.a.t.getText().toString())) {
            this.a.i1();
            EZSearchNumberActivity.m0(this.a);
          } else {
            if (EZSearchNumberActivity.j0(this.a) != null && EZSearchNumberActivity.j0(this.a).size() != 0) {
              EZSearchNumberActivity.Z0(this.a).setVisibility(0);
              EZSearchNumberActivity.h0(this.a).setVisibility(0);
            } 
            Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755420), 0).show();
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        return true;
      } 
      return false;
    }
  }
  
  private static class y extends AsyncTask<String, Void, String> {
    private WeakReference<EZSearchNumberActivity> a;
    
    y(EZSearchNumberActivity param1EZSearchNumberActivity) {
      this.a = new WeakReference<EZSearchNumberActivity>(param1EZSearchNumberActivity);
    }
    
    protected String a(String... param1VarArgs) {
      String str = param1VarArgs[0];
      EZSearchNumberActivity eZSearchNumberActivity = this.a.get();
      if (eZSearchNumberActivity != null && !eZSearchNumberActivity.isFinishing())
        try {
          EZSearchNumberActivity.Z(eZSearchNumberActivity, (ArrayList)com.allinone.callerid.i.a.w.a.f(EZSearchNumberActivity.D0(eZSearchNumberActivity), str));
          EZSearchNumberActivity.G0(eZSearchNumberActivity, EZSearchNumberActivity.Y(eZSearchNumberActivity).size());
          EZSearchNumberActivity.I0(eZSearchNumberActivity, (ArrayList)com.allinone.callerid.i.a.w.a.e(EZSearchNumberActivity.J0(eZSearchNumberActivity), str));
          EZSearchNumberActivity.Y(eZSearchNumberActivity).addAll(EZSearchNumberActivity.H0(eZSearchNumberActivity));
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return str;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      EZSearchNumberActivity eZSearchNumberActivity = this.a.get();
      if (eZSearchNumberActivity != null && !eZSearchNumberActivity.isFinishing())
        EZSearchNumberActivity.L0(eZSearchNumberActivity).b(EZSearchNumberActivity.Y(eZSearchNumberActivity), EZSearchNumberActivity.F0(eZSearchNumberActivity), param1String); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/EZSearchNumberActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */