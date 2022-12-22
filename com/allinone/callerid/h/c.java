package com.allinone.callerid.h;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import b.h.k.w;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.mvc.view.recorder.RecordBallView;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.t;
import com.allinone.callerid.util.u;
import com.allinone.callerid.util.y0;
import com.allinone.callerid.util.z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends b {
  private static volatile c c;
  
  private boolean A;
  
  private boolean B;
  
  private int C;
  
  private TextView D;
  
  private TextView E;
  
  private FrameLayout F;
  
  private ImageView G;
  
  private int[] H = new int[] { 2131493172, 2131493173 };
  
  private List<View> I;
  
  private ViewPager J;
  
  private LinearLayout K;
  
  private LinearLayout L;
  
  private String M;
  
  public boolean N = false;
  
  private RelativeLayout O;
  
  private LinearLayout P;
  
  private TextView Q;
  
  private int R = 1;
  
  private String S;
  
  private String T;
  
  private Handler U = new Handler();
  
  private Runnable V = new j(this);
  
  private boolean W;
  
  private boolean X;
  
  private int Y;
  
  private int Z;
  
  private LinearLayout a0;
  
  private ImageView b0;
  
  private TextView c0;
  
  private Context d = null;
  
  private LinearLayout d0;
  
  private TextView e;
  
  private ImageView e0;
  
  private TextView f;
  
  private TextView f0;
  
  private TextView g;
  
  private boolean g0;
  
  private ImageView h;
  
  private ViewStub h0;
  
  private String i = "";
  
  private String i0;
  
  private float j;
  
  private ImageView j0;
  
  private float k;
  
  private int k0;
  
  private float l;
  
  public ViewGroup l0;
  
  private float m;
  
  private RecordBallView m0;
  
  private WindowManager n;
  
  private int n0;
  
  private WindowManager.LayoutParams o;
  
  private int o0;
  
  private int p;
  
  private boolean p0 = false;
  
  private int q;
  
  private RecordBallView q0;
  
  private boolean r;
  
  private TextView s;
  
  private int t = 3;
  
  private String u = "";
  
  private TextView v;
  
  private FrameLayout w;
  
  private Typeface x;
  
  private Typeface y;
  
  private boolean z;
  
  public static c A0() {
    // Byte code:
    //   0: getstatic com/allinone/callerid/h/c.c : Lcom/allinone/callerid/h/c;
    //   3: ifnonnull -> 39
    //   6: ldc com/allinone/callerid/h/c
    //   8: monitorenter
    //   9: getstatic com/allinone/callerid/h/c.c : Lcom/allinone/callerid/h/c;
    //   12: ifnonnull -> 27
    //   15: new com/allinone/callerid/h/c
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial <init> : ()V
    //   23: aload_0
    //   24: putstatic com/allinone/callerid/h/c.c : Lcom/allinone/callerid/h/c;
    //   27: ldc com/allinone/callerid/h/c
    //   29: monitorexit
    //   30: goto -> 39
    //   33: astore_0
    //   34: ldc com/allinone/callerid/h/c
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    //   39: getstatic com/allinone/callerid/h/c.c : Lcom/allinone/callerid/h/c;
    //   42: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	33	finally
    //   27	30	33	finally
    //   34	37	33	finally
  }
  
  private WindowManager.LayoutParams B0() {
    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
    if (Build.VERSION.SDK_INT >= 26) {
      layoutParams.type = 2038;
    } else {
      layoutParams.type = 2010;
    } 
    layoutParams.height = -2;
    layoutParams.width = -1;
    layoutParams.gravity = 8388659;
    layoutParams.format = 1;
    int i = b1.C0();
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("初始值==--->y==");
      stringBuilder.append(i);
      d0.a("height", stringBuilder.toString());
    } 
    layoutParams.y = i;
    layoutParams.flags = 524840;
    return layoutParams;
  }
  
  private void D0(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    try {
      C0();
      this.o = B0();
      this.n = (WindowManager)paramContext.getSystemService("window");
      if (Build.VERSION.SDK_INT >= 23) {
        if (Settings.canDrawOverlays((Context)EZCallApplication.c())) {
          this.l0 = a(paramContext, paramInt1);
        } else {
          com.allinone.callerid.util.q.b().d("floatview_no_per");
        } 
      } else {
        this.l0 = a(paramContext, paramInt1);
      } 
      if (this.l0 != null) {
        if (d0.a)
          d0.a("callstatus", "overlay"); 
        E0((View)this.l0, paramString, paramInt2, paramInt3);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void E0(View paramView, String paramString, int paramInt1, int paramInt2) {
    this.n0 = d1.b(this.d, 2130968889, 2131231242);
    this.o0 = d1.b(this.d, 2130968888, 2131231243);
    RecordBallView recordBallView = (RecordBallView)paramView.findViewById(2131296826);
    this.m0 = recordBallView;
    recordBallView.setIsonTouch(false);
    this.m0.setCall_status(paramInt1);
    this.m0.setTel_phone(paramString);
    this.m0.setStatus(10001);
    F0(paramString, paramInt2);
    this.L = (LinearLayout)paramView.findViewById(2131296822);
    ViewStub viewStub = (ViewStub)paramView.findViewById(2131298278);
    this.h0 = (ViewStub)paramView.findViewById(2131298275);
    ((TextView)paramView.findViewById(2131297926)).setTypeface(this.x);
    this.K = (LinearLayout)paramView.findViewById(2131297215);
    this.F = (FrameLayout)paramView.findViewById(2131297504);
    this.P = (LinearLayout)paramView.findViewById(2131297201);
    TextView textView = (TextView)paramView.findViewById(2131298105);
    this.Q = (TextView)paramView.findViewById(2131298044);
    this.O = (RelativeLayout)paramView.findViewById(2131297521);
    this.G = (ImageView)paramView.findViewById(2131296997);
    this.j0 = (ImageView)paramView.findViewById(2131296970);
    this.f = (TextView)paramView.findViewById(2131298023);
    this.v = (TextView)paramView.findViewById(2131298033);
    this.w = (FrameLayout)paramView.findViewById(2131297502);
    ImageView imageView = (ImageView)paramView.findViewById(2131296824);
    this.h = (ImageView)paramView.findViewById(2131297360);
    this.e = (TextView)paramView.findViewById(2131297966);
    this.s = (TextView)paramView.findViewById(2131298199);
    this.g = (TextView)paramView.findViewById(2131298022);
    this.D = (TextView)paramView.findViewById(2131298155);
    this.E = (TextView)paramView.findViewById(2131297892);
    this.a0 = (LinearLayout)paramView.findViewById(2131297222);
    this.b0 = (ImageView)paramView.findViewById(2131297083);
    this.c0 = (TextView)paramView.findViewById(2131298218);
    this.d0 = (LinearLayout)paramView.findViewById(2131297223);
    this.e0 = (ImageView)paramView.findViewById(2131297084);
    this.f0 = (TextView)paramView.findViewById(2131298219);
    imageView.setOnClickListener(new k(this));
    com.allinone.callerid.mvc.view.recorder.a a = new com.allinone.callerid.mvc.view.recorder.a();
    a.d(new l(this, paramInt1, paramString));
    this.m0.setOnClickListener(new m(this, a, paramString, paramInt1));
    textView.setTypeface(this.x);
    this.Q.setTypeface(this.x);
    this.f.setTypeface(this.x);
    this.D.setTypeface(this.x);
    this.E.setTypeface(this.x);
    this.v.setTypeface(this.x);
    this.e.setTypeface(this.x);
    this.s.setTypeface(this.x);
    this.g.setTypeface(this.x);
    this.c0.setTypeface(this.x);
    this.J = (ViewPager)paramView.findViewById(2131298265);
    this.I = new ArrayList<View>();
    y0(this.d);
    com.allinone.callerid.b.q q = new com.allinone.callerid.b.q(this.I);
    this.J.setAdapter((androidx.viewpager.widget.a)q);
    this.J.setCurrentItem(1);
    this.J.c(new n(this));
    if (paramString != null && !"".equals(paramString)) {
      String str = q0.b(paramString);
      this.i0 = str;
      if (str != null && !"".equals(str)) {
        this.f.setText(this.i0);
        this.g.setText(this.i0);
      } else {
        this.f.setText(paramString);
        this.g.setText(paramString);
      } 
      J0(this.d, paramString, paramInt1, paramInt2);
      this.g.setVisibility(0);
      if (b1.D0()) {
        try {
          RelativeLayout relativeLayout = (RelativeLayout)viewStub.inflate();
        } catch (Exception exception) {
          viewStub.setVisibility(0);
        } 
        b1.l2(false);
      } 
    } else {
      this.f.setTypeface(this.y);
      this.f.setText(this.d.getResources().getString(2131755403));
    } 
    this.J.setOnTouchListener(new o(this, paramView));
    paramView.setOnTouchListener(new p(this));
  }
  
  private void F0(String paramString, int paramInt) {
    (new s(this, paramString, paramInt)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  private void I0(String paramString1, String paramString2, String paramString3, int paramInt) {
    if (System.currentTimeMillis() - b1.c() > 0L && paramInt == 0 && paramString3 != null && !"".equals(paramString3)) {
      if (b1.d()) {
        com.allinone.callerid.util.q.b().d("search_buyu_token_max");
      } else {
        g0.C(this.d);
        com.allinone.callerid.util.q.b().d("search_buyu_count");
      } 
      com.allinone.callerid.i.a.z.b.a(this.d, paramString2, paramString3, new f(this, paramString1));
    } 
  }
  
  private void K0(String paramString, int paramInt) {
    if (paramInt == 1) {
      if (d0.a)
        d0.a("wbb", "查询本地数据并展示"); 
      com.allinone.callerid.util.q.b().d("search_offline_new");
      com.allinone.callerid.l.a.f.d(paramString, new h(this));
    } 
  }
  
  private void L0(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt2 == 1)
      com.allinone.callerid.i.a.z.d.a(this.d, paramString, paramInt1, paramInt2, new e(this, paramInt2, paramInt1, paramBoolean, paramString)); 
  }
  
  private void M0(String paramString, int paramInt) {
    if (paramInt == 1)
      com.allinone.callerid.i.a.c0.b.a(this.d, this.M, paramString, new g(this, paramString)); 
  }
  
  private void N0(Context paramContext, String paramString, int paramInt) {
    if (paramInt == 1)
      com.allinone.callerid.i.a.e0.b.a(paramContext, paramString, new d(this)); 
  }
  
  private void O0() {
    int i = b1.x0();
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
          this.w.setBackgroundResource(this.n0); 
      } else {
        this.w.setBackgroundResource(this.o0);
      } 
    } else {
      this.w.setBackgroundResource(this.n0);
    } 
  }
  
  private void P0() {
    try {
      String str = this.u;
      q q = new q();
      this(this);
      com.allinone.callerid.i.a.e.b.b(str, q);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void R0() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      if (com.allinone.callerid.util.k1.b.d(this.d) || i >= 28) {
        this.r = true;
        this.F.setVisibility(0);
        this.F.startAnimation(i1.s());
        this.G.startAnimation(i1.q());
        this.U.postDelayed(new b(this), 1500L);
      } 
    } else {
      this.r = true;
      this.F.setVisibility(0);
      this.F.startAnimation(i1.s());
      this.G.startAnimation(i1.q());
      this.U.postDelayed(new c(this), 1500L);
    } 
  }
  
  private void S0(EZSearchContacts paramEZSearchContacts, boolean paramBoolean) {
    if (paramEZSearchContacts != null) {
      int i;
      this.P.setVisibility(8);
      Handler handler = this.U;
      if (handler != null)
        handler.removeCallbacks(this.V); 
      if (paramBoolean)
        try {
          RelativeLayout relativeLayout = (RelativeLayout)this.h0.inflate();
        } catch (Exception exception) {
          this.h0.setVisibility(0);
        }  
      this.f.setVisibility(0);
      String str3 = paramEZSearchContacts.getFormat_tel_number();
      String str2 = this.i0;
      if ((str2 == null || "".equals(str2)) && str3 != null && !"".equals(str3))
        this.g.setText(str3); 
      str2 = paramEZSearchContacts.getName();
      str3 = this.i;
      if ((str3 == null || "".equals(str3)) && str2 != null && !"".equals(str2)) {
        this.i = str2;
        this.f.setText(str2);
      } 
      if (paramEZSearchContacts.getReport_count() == null || "".equals(paramEZSearchContacts.getReport_count())) {
        i = 0;
      } else {
        i = Integer.parseInt(paramEZSearchContacts.getReport_count());
      } 
      str2 = paramEZSearchContacts.getOperator();
      str3 = paramEZSearchContacts.getType();
      if (str2 != null && !"".equals(str2) && str3 != null && !"".equals(str3)) {
        TextView textView = this.v;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i1.J(this.d, str3));
        stringBuilder.append(" - ");
        stringBuilder.append(str2);
        textView.setText(stringBuilder.toString());
      } else {
        this.v.setText(i1.J(this.d, str3));
      } 
      try {
        TextView textView;
        str3 = paramEZSearchContacts.getSubtype();
        str2 = paramEZSearchContacts.getKeyword();
        if (str3 != null && !"".equals(str3)) {
          JSONArray jSONArray = new JSONArray();
          this(str3);
          if (jSONArray.length() > 0) {
            str3 = jSONArray.getJSONObject(0).getString("subtype");
            this.K.setVisibility(0);
            this.D.setVisibility(0);
            textView = this.s;
            if (textView != null && textView.getVisibility() == 0)
              this.E.setVisibility(0); 
            this.D.setText(str3);
          } 
        } else if (textView != null && !"".equals(textView)) {
          this.K.setVisibility(0);
          this.D.setVisibility(0);
          TextView textView1 = this.s;
          if (textView1 != null && textView1.getVisibility() == 0)
            this.E.setVisibility(0); 
          this.D.setText((CharSequence)textView);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      str2 = paramEZSearchContacts.getBelong_area();
      if (str2 != null && !"".equals(str2)) {
        this.e.setText(str2);
        this.e.setVisibility(0);
      } else if (this.e.getText() == null || "".equals(this.e.getText().toString())) {
        this.e.setText(this.d.getResources().getString(2131755539));
        this.e.setVisibility(0);
      } 
      String str1 = paramEZSearchContacts.getType_label();
      if (this.t == 1 && str1 != null && !str1.equals("") && i == 0) {
        this.h.setImageResource(2131230814);
        O0();
        this.K.setVisibility(0);
        this.s.setVisibility(0);
        this.s.setText(this.d.getResources().getString(2131755748));
        if (this.C == 1)
          R0(); 
      } 
      if (this.t == 1 && str1 != null && !str1.equals("") && i > 0) {
        this.h.setImageResource(2131230814);
        O0();
        this.K.setVisibility(0);
        this.s.setVisibility(0);
        TextView textView = this.s;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(" ");
        stringBuilder.append(this.d.getResources().getString(2131755097));
        textView.setText(stringBuilder.toString());
        if (this.C == 1)
          R0(); 
      } 
    } else if ("".equals(this.e.getText().toString())) {
      this.e.setTextSize(12.0F);
      this.e.setVisibility(0);
      this.e.setText(this.d.getResources().getString(2131755539));
    } 
  }
  
  private void T0(int paramInt1, int paramInt2) {
    String str = this.T;
    if (str != null && !"".equals(str)) {
      str = this.S;
      if (str != null && !"".equals(str)) {
        com.allinone.callerid.util.q.b().c("spam_name_show");
      } else {
        com.allinone.callerid.util.q.b().c("spam_no_name_show");
      } 
      if (this.g0) {
        if (paramInt1 >= 3) {
          this.b0.setImageResource(2131231205);
          str = (EZCallApplication.c()).f;
          if ("zh".equals(str) || "zh-TW".equals(str)) {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.getResources().getString(2131755862));
            stringBuilder.append(paramInt1);
            stringBuilder.append(this.d.getResources().getString(2131755793));
            textView.setText(stringBuilder.toString());
          } else {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramInt1);
            stringBuilder.append(" ");
            stringBuilder.append(this.d.getResources().getString(2131755862));
            textView.setText(stringBuilder.toString());
          } 
          this.a0.setVisibility(0);
          str = this.S;
          if (str != null && !"".equals(str)) {
            com.allinone.callerid.util.q.b().c("spam_name_blocked");
          } else {
            com.allinone.callerid.util.q.b().c("spam_no_name_blocked");
          } 
        } else if (paramInt2 >= 3) {
          this.b0.setImageResource(2131231215);
          str = (EZCallApplication.c()).f;
          if ("zh".equals(str) || "zh-TW".equals(str)) {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.getResources().getString(2131755863));
            stringBuilder.append(paramInt2);
            stringBuilder.append(this.d.getResources().getString(2131755793));
            textView.setText(stringBuilder.toString());
          } else {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramInt2);
            stringBuilder.append(" ");
            stringBuilder.append(this.d.getResources().getString(2131755863));
            textView.setText(stringBuilder.toString());
          } 
          this.a0.setVisibility(0);
          str = this.S;
          if (str != null && !"".equals(str)) {
            com.allinone.callerid.util.q.b().c("spam_name_declined");
          } else {
            com.allinone.callerid.util.q.b().c("spam_no_name_declined");
          } 
        } 
      } else if (paramInt1 >= 3) {
        this.e0.setImageResource(2131231205);
        str = (EZCallApplication.c()).f;
        if ("zh".equals(str) || "zh-TW".equals(str)) {
          TextView textView = this.f0;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.d.getResources().getString(2131755862));
          stringBuilder.append(paramInt1);
          stringBuilder.append(this.d.getResources().getString(2131755793));
          textView.setText(stringBuilder.toString());
        } else {
          TextView textView = this.f0;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramInt1);
          stringBuilder.append(" ");
          stringBuilder.append(this.d.getResources().getString(2131755862));
          textView.setText(stringBuilder.toString());
        } 
        this.d0.setVisibility(0);
        this.K.setVisibility(0);
        str = this.S;
        if (str != null && !"".equals(str)) {
          com.allinone.callerid.util.q.b().c("spam_name_blocked");
        } else {
          com.allinone.callerid.util.q.b().c("spam_no_name_blocked");
        } 
      } else if (paramInt2 >= 3) {
        this.e0.setImageResource(2131231215);
        str = (EZCallApplication.c()).f;
        if ("zh".equals(str) || "zh-TW".equals(str)) {
          TextView textView = this.f0;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.d.getResources().getString(2131755863));
          stringBuilder.append(paramInt2);
          stringBuilder.append(this.d.getResources().getString(2131755793));
          textView.setText(stringBuilder.toString());
        } else {
          TextView textView = this.f0;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramInt2);
          stringBuilder.append(" ");
          stringBuilder.append(this.d.getResources().getString(2131755863));
          textView.setText(stringBuilder.toString());
        } 
        this.d0.setVisibility(0);
        this.K.setVisibility(0);
        str = this.S;
        if (str != null && !"".equals(str)) {
          com.allinone.callerid.util.q.b().c("spam_name_declined");
        } else {
          com.allinone.callerid.util.q.b().c("spam_no_name_declined");
        } 
      } 
    } else {
      str = this.S;
      if (str == null || "".equals(str)) {
        com.allinone.callerid.util.q.b().c("no_spam_no_name_show");
        if (paramInt1 >= 3) {
          this.b0.setImageResource(2131231205);
          str = (EZCallApplication.c()).f;
          if ("zh".equals(str) || "zh-TW".equals(str)) {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.getResources().getString(2131755862));
            stringBuilder.append(paramInt1);
            stringBuilder.append(this.d.getResources().getString(2131755793));
            textView.setText(stringBuilder.toString());
          } else {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramInt1);
            stringBuilder.append(" ");
            stringBuilder.append(this.d.getResources().getString(2131755862));
            textView.setText(stringBuilder.toString());
          } 
          this.a0.setVisibility(0);
          com.allinone.callerid.util.q.b().c("no_spam_no_name_blocked");
        } else if (paramInt2 >= 3) {
          this.b0.setImageResource(2131231215);
          str = (EZCallApplication.c()).f;
          if ("zh".equals(str) || "zh-TW".equals(str)) {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.getResources().getString(2131755863));
            stringBuilder.append(paramInt2);
            stringBuilder.append(this.d.getResources().getString(2131755793));
            textView.setText(stringBuilder.toString());
          } else {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramInt2);
            stringBuilder.append(" ");
            stringBuilder.append(this.d.getResources().getString(2131755863));
            textView.setText(stringBuilder.toString());
          } 
          this.a0.setVisibility(0);
          com.allinone.callerid.util.q.b().c("no_spam_no_name_declined");
        } 
      } 
    } 
  }
  
  private void U0() {
    String str = this.T;
    if (str != null && !"".equals(str)) {
      str = this.S;
      if (str != null && !"".equals(str)) {
        com.allinone.callerid.util.q.b().c("spam_name_show");
      } else {
        com.allinone.callerid.util.q.b().c("spam_no_name_show");
      } 
      if (this.Y >= 3) {
        this.b0.setImageResource(2131231205);
        str = (EZCallApplication.c()).f;
        if ("zh".equals(str) || "zh-TW".equals(str)) {
          TextView textView = this.c0;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.d.getResources().getString(2131755862));
          stringBuilder.append(this.Y);
          stringBuilder.append(this.d.getResources().getString(2131755793));
          textView.setText(stringBuilder.toString());
        } else {
          TextView textView = this.c0;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.Y);
          stringBuilder.append(" ");
          stringBuilder.append(this.d.getResources().getString(2131755862));
          textView.setText(stringBuilder.toString());
        } 
        this.a0.setVisibility(0);
        str = this.S;
        if (str != null && !"".equals(str)) {
          com.allinone.callerid.util.q.b().c("spam_name_blocked");
        } else {
          com.allinone.callerid.util.q.b().c("spam_no_name_blocked");
        } 
      } else if (this.Z >= 3) {
        this.b0.setImageResource(2131231215);
        str = (EZCallApplication.c()).f;
        if ("zh".equals(str) || "zh-TW".equals(str)) {
          TextView textView = this.c0;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.d.getResources().getString(2131755863));
          stringBuilder.append(this.Z);
          stringBuilder.append(this.d.getResources().getString(2131755793));
          textView.setText(stringBuilder.toString());
        } else {
          TextView textView = this.c0;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.Z);
          stringBuilder.append(" ");
          stringBuilder.append(this.d.getResources().getString(2131755863));
          textView.setText(stringBuilder.toString());
        } 
        this.a0.setVisibility(0);
        str = this.S;
        if (str != null && !"".equals(str)) {
          com.allinone.callerid.util.q.b().c("spam_name_declined");
        } else {
          com.allinone.callerid.util.q.b().c("spam_no_name_declined");
        } 
      } 
    } else {
      str = this.S;
      if (str == null || "".equals(str)) {
        com.allinone.callerid.util.q.b().c("no_spam_no_name_show");
        if (this.Y >= 3) {
          this.b0.setImageResource(2131231205);
          str = (EZCallApplication.c()).f;
          if ("zh".equals(str) || "zh-TW".equals(str)) {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.getResources().getString(2131755862));
            stringBuilder.append(this.Y);
            stringBuilder.append(this.d.getResources().getString(2131755793));
            textView.setText(stringBuilder.toString());
          } else {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.Y);
            stringBuilder.append(" ");
            stringBuilder.append(this.d.getResources().getString(2131755862));
            textView.setText(stringBuilder.toString());
          } 
          this.a0.setVisibility(0);
          com.allinone.callerid.util.q.b().c("no_spam_no_name_blocked");
        } else if (this.Z >= 3) {
          this.b0.setImageResource(2131231215);
          str = (EZCallApplication.c()).f;
          if ("zh".equals(str) || "zh-TW".equals(str)) {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.getResources().getString(2131755863));
            stringBuilder.append(this.Z);
            stringBuilder.append(this.d.getResources().getString(2131755793));
            textView.setText(stringBuilder.toString());
          } else {
            TextView textView = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.Z);
            stringBuilder.append(" ");
            stringBuilder.append(this.d.getResources().getString(2131755863));
            textView.setText(stringBuilder.toString());
          } 
          this.a0.setVisibility(0);
          com.allinone.callerid.util.q.b().c("no_spam_no_name_declined");
        } 
      } 
    } 
  }
  
  private void y0(Context paramContext) {
    for (byte b1 = 0; b1 < 2; b1++) {
      View view = LayoutInflater.from(paramContext).inflate(this.H[b1], null, false);
      this.I.add(view);
    } 
  }
  
  private void z0(String paramString, int paramInt1, int paramInt2) {
    paramString = paramString.replace(" ", "").replace("-", "").replace("*", "").replace("#", "");
    this.W = false;
    this.X = false;
    this.Y = 0;
    this.Z = 0;
    if (com.allinone.callerid.util.e.b(this.d)) {
      com.allinone.callerid.util.q.b().d("is_connected");
      if (paramInt2 == 1) {
        com.allinone.callerid.util.q.b().d("unknow_is_connected");
        if (paramInt1 == 1)
          com.allinone.callerid.util.q.b().d("unknow_incoming_is_connected"); 
      } 
      g0.w((Context)EZCallApplication.c());
      com.allinone.callerid.i.a.a0.b.a(this.u, new r(this, paramString, paramInt1, paramInt2));
      if (paramInt2 == 1)
        com.allinone.callerid.i.a.l.b.b(this.u, new a(this)); 
    } else {
      ViewGroup viewGroup = this.l0;
      if (viewGroup != null) {
        c(this.d, viewGroup, this.o);
        if (d0.a)
          d0.a("callstatus", "无网展示悬浮窗"); 
      } 
      com.allinone.callerid.util.q.b().d("is_not_connected");
      if (paramInt2 == 1) {
        com.allinone.callerid.util.q.b().d("unknow_not_connected");
        if (paramInt1 == 1)
          com.allinone.callerid.util.q.b().d("unknow_incoming_not_connected"); 
      } 
      g0.x((Context)EZCallApplication.c());
      K0(paramString, paramInt2);
    } 
  }
  
  public void C0() {
    try {
      synchronized (this.b) {
        ViewGroup viewGroup = this.l0;
        if (viewGroup != null) {
          try {
            WindowManager windowManager = this.n;
            if (windowManager != null) {
              windowManager.removeView((View)viewGroup);
            } else {
              ((WindowManager)EZCallApplication.c().getSystemService("window")).removeView((View)this.l0);
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          this.l0 = null;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void G0(String paramString, int paramInt) {
    try {
      if (this.p0) {
        RecordBallView recordBallView2 = this.q0;
        if (recordBallView2 != null) {
          recordBallView2.j();
          this.q0 = null;
        } 
        RecordBallView recordBallView3 = new RecordBallView();
        Context context = this.d;
        WindowManager.LayoutParams layoutParams = this.o;
        this(context, layoutParams.x, layoutParams.y);
        this.q0 = recordBallView3;
        recordBallView3.setCall_status(paramInt);
        this.q0.setTel_phone(paramString);
        this.q0.setStatus(10001);
        this.q0.setLayoutParams(84, 84);
        this.q0.f();
        RecordBallView recordBallView1 = this.q0;
        i i = new i();
        this(this);
        recordBallView1.postDelayed(i, 90L);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void H0() {
    RecordBallView recordBallView = this.q0;
    if (recordBallView != null) {
      recordBallView.j();
      this.q0 = null;
    } 
  }
  
  public void J0(Context paramContext, String paramString, int paramInt1, int paramInt2) {
    String str = this.i;
    if (str != null && "".equals(str)) {
      this.P.setVisibility(0);
      this.f.setVisibility(8);
      this.U.postDelayed(this.V, 500L);
    } else {
      this.f.setText(this.i);
      com.allinone.callerid.main.a.b(this.d).E(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.k0)).b1(2131231148).M0().C0(this.h);
      this.j0.setVisibility(0);
      ViewGroup viewGroup = this.l0;
      if (viewGroup != null) {
        c(this.d, viewGroup, this.o);
        if (d0.a)
          d0.a("callstatus", "联系人直接展示"); 
      } 
    } 
    z0(paramString, paramInt1, paramInt2);
  }
  
  public void Q0(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3) {
    Object object = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (d0.a)
        d0.a("callstatus", "show"); 
      this.d = paramContext;
      this.C = paramInt1;
      this.t = paramInt2;
      this.i = paramString2;
      this.k0 = paramInt3;
      i1.H0(paramContext, (EZCallApplication.c()).f);
      this.M = com.allinone.callerid.util.p.d((Context)EZCallApplication.c()).getCountry_code();
      this.u = paramString1;
      this.x = g1.b();
      this.y = g1.a();
      paramInt3 = b1.x0();
      if (paramInt3 != 0) {
        if (paramInt3 != 1) {
          if (paramInt3 == 2)
            D0(paramContext, paramString1, 2131493211, paramInt1, paramInt2); 
        } else {
          D0(paramContext, paramString1, 2131493212, paramInt1, paramInt2);
        } 
      } else {
        D0(paramContext, paramString1, 2131493211, paramInt1, paramInt2);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  class a implements com.allinone.callerid.i.a.l.a {
    a(c this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean)
        com.allinone.callerid.i.a.g.b.a(c.z(this.a), c.C(this.a), new a(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.g.a {
      a(c.a this$0) {}
      
      public void a(String param2String) {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.g.a {
    a(c this$0) {}
    
    public void a(String param1String) {}
  }
  
  class b implements Runnable {
    b(c this$0) {}
    
    public void run() {
      int i = View.MeasureSpec.makeMeasureSpec(0, 0);
      int j = View.MeasureSpec.makeMeasureSpec(0, 0);
      c.g0(this.b).measure(i, j);
      c.h0(this.b).setVisibility(0);
      j = c.g0(this.b).getHeight();
      i = com.allinone.callerid.util.j.a(c.z(this.b), 51.7F);
      ViewGroup.LayoutParams layoutParams = c.h0(this.b).getLayoutParams();
      layoutParams.height = j + i;
      c.h0(this.b).setLayoutParams(layoutParams);
    }
  }
  
  class c implements Runnable {
    c(c this$0) {}
    
    public void run() {
      int i = View.MeasureSpec.makeMeasureSpec(0, 0);
      int j = View.MeasureSpec.makeMeasureSpec(0, 0);
      c.g0(this.b).measure(i, j);
      c.h0(this.b).setVisibility(0);
      i = c.g0(this.b).getHeight();
      j = com.allinone.callerid.util.j.a(c.z(this.b), 51.7F);
      ViewGroup.LayoutParams layoutParams = c.h0(this.b).getLayoutParams();
      layoutParams.height = i + j;
      c.h0(this.b).setLayoutParams(layoutParams);
    }
  }
  
  class d implements com.allinone.callerid.i.a.e0.a {
    d(c this$0) {}
    
    public void a(boolean param1Boolean, int param1Int1, int param1Int2) {
      c.j0(this.a, param1Boolean);
      if (param1Boolean) {
        c.l0(this.a, param1Int1);
        c.o0(this.a, param1Int2);
        if (c.c0(this.a)) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("searchWikiData--block_count:");
            stringBuilder.append(param1Int1);
            stringBuilder.append(" declined_count:");
            stringBuilder.append(param1Int2);
            d0.a("wiki", stringBuilder.toString());
          } 
          c.b0(this.a, param1Int1, param1Int2);
        } 
      } 
    }
  }
  
  class e implements com.allinone.callerid.i.a.z.c {
    e(c this$0, int param1Int1, int param1Int2, boolean param1Boolean, String param1String) {}
    
    public void a(String param1String) {
      c c1 = this.e;
      if (c1.l0 != null) {
        Context context = c.z(c1);
        c c2 = this.e;
        c1.c(context, c2.l0, c.m0(c2));
        if (d0.a)
          d0.a("callstatus", "未查询过的展示悬浮窗"); 
      } 
      if (param1String != null && !"".equals(param1String))
        try {
          JSONObject jSONObject = new JSONObject();
          this(param1String);
          int i = jSONObject.getInt("status");
          if (i == 1) {
            c.E(this.e).setVisibility(8);
            if (c.f(this.e) != null)
              c.f(this.e).removeCallbacks(c.F(this.e)); 
            boolean bool = d0.a;
            if (bool)
              d0.a("searchNumber", "查询完成"); 
            c.G(this.e).setVisibility(0);
            param1String = jSONObject.getString("type_label");
            c.P(this.e, param1String);
            String str3 = jSONObject.getString("name");
            String str2 = jSONObject.getString("format_tel_number");
            if ((c.H(this.e) == null || "".equals(c.H(this.e))) && str2 != null && !str2.equals("")) {
              c.I(this.e).setText(str2);
              c.G(this.e).setText(str2);
            } 
            c.J(this.e, str3);
            if ((c.A(this.e) == null || "".equals(c.A(this.e))) && str3 != null && !"".equals(str3)) {
              c.B(this.e, str3);
              c.G(this.e).setText(str3);
            } 
            String str4 = jSONObject.getString("report_count");
            if (param1String != null && !param1String.equals("")) {
              c.K(this.e).setImageResource(2131230814);
              c.R(this.e);
              c.S(this.e).setVisibility(0);
              c.T(this.e).setVisibility(0);
              TextView textView = c.T(this.e);
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(str4);
              stringBuilder.append(" ");
              stringBuilder.append(c.z(this.e).getResources().getString(2131755097));
              textView.setText(stringBuilder.toString());
              if (c.U(this.e) == 1)
                c.V(this.e); 
            } 
            str2 = jSONObject.getString("avatar");
            if (str2 != null && !"".equals(str2))
              u.b(c.z(this.e), str2, 2131231148, c.K(this.e)); 
            str2 = jSONObject.getString("belong_area");
            if (str2 != null && !"".equals(str2)) {
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("位置：");
                stringBuilder.append(str2);
                d0.a("searchNumber", stringBuilder.toString());
              } 
              c.N(this.e).setText(str2);
              c.N(this.e).setVisibility(0);
              com.allinone.callerid.util.q.b().d("search_number_float_success");
              g0.H((Context)EZCallApplication.c());
            } 
            String str6 = jSONObject.getString("operator");
            String str5 = jSONObject.getString("type");
            if (str6 != null && !str6.equals("") && str5 != null && !str5.equals("")) {
              TextView textView = c.M(this.e);
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(i1.J(c.z(this.e), str5));
              stringBuilder.append(" - ");
              stringBuilder.append(str6);
              textView.setText(stringBuilder.toString());
            } else {
              c.M(this.e).setText(i1.J(c.z(this.e), str5));
            } 
            if (this.a == 1) {
              if (c.i0(this.e)) {
                if (d0.a) {
                  StringBuilder stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("is_search_wiki_ok--block_count:");
                  stringBuilder.append(c.k0(this.e));
                  stringBuilder.append(" declined_count:");
                  stringBuilder.append(c.n0(this.e));
                  d0.a("wiki", stringBuilder.toString());
                } 
                c.p0(this.e);
              } 
              c.d0(this.e, true);
            } 
            if (str3 != null && !"".equals(str3)) {
              if (this.b == 1)
                com.allinone.callerid.util.q.b().d("unknown_incoming_search_name_ok"); 
              com.allinone.callerid.util.q.b().d("new_search_name_success");
              g0.I((Context)EZCallApplication.c());
            } 
            if (param1String != null && !"".equals(param1String)) {
              if (this.b == 1)
                com.allinone.callerid.util.q.b().d("unknown_incoming_search_spam_ok"); 
              com.allinone.callerid.util.q.b().d("search_number_float_spam");
              g0.O((Context)EZCallApplication.c());
            } 
            JSONArray jSONArray = jSONObject.getJSONArray("soft_comments");
            if (jSONArray != null && !"".equals(jSONArray.toString()) && jSONArray.length() != 0)
              g0.E((Context)EZCallApplication.c()); 
            str4 = jSONObject.getString("e164_tel_number");
            if (str4 != null && !"".equals(str4) && this.b == 1)
              com.allinone.callerid.util.q.b().d("unknown_incoming_search_e164_ok"); 
            String str1 = jSONObject.getString("cc");
            i = jSONObject.getInt("faild_error_log");
            if (this.b == 1 && !this.c)
              c.q0(this.e, this.d, str1, str4, i); 
            if (i == 0) {
              com.allinone.callerid.util.q.b().d("new_search_failed");
            } else if (i == 1) {
              com.allinone.callerid.util.q.b().d("new_search_success");
              if (this.b == 1) {
                com.allinone.callerid.util.q.b().d("unknown_incoming_search_ok");
                if (this.d.startsWith("140") || this.d.startsWith("+91140") || this.d.startsWith("0091140"))
                  g0.G(c.z(this.e)); 
              } 
              g0.J((Context)EZCallApplication.c());
            } 
            jSONObject.getInt("area_error_log");
            if ((param1String != null && !"".equals(param1String)) || (str3 != null && !"".equals(str3))) {
              b1.y1(true);
              i = b1.w0();
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("spam_or_name:");
                stringBuilder.append(i);
                d0.a("searchNumber", stringBuilder.toString());
              } 
              b1.d2(i + 1);
            } else {
              b1.y1(false);
            } 
            if (param1String != null && !"".equals(param1String)) {
              b1.x1(true);
            } else {
              b1.x1(false);
            } 
            y0.b(jSONObject, this.d, false);
          } else {
            if (i == -20) {
              t.a();
              com.allinone.callerid.util.q.b().d("search_result_status_20");
            } 
            com.allinone.callerid.util.q.b().d("search_result_status_failed");
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
          com.allinone.callerid.util.q.b().d("search_number_exception");
        }  
    }
  }
  
  class f implements com.allinone.callerid.i.a.z.a {
    f(c this$0, String param1String) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String))
        try {
          JSONObject jSONObject = new JSONObject();
          this(param1String);
          int i = jSONObject.getInt("status");
          if (i == 1) {
            b1.H0(false);
            if (jSONObject.getInt("faild_error_log") == 1) {
              g0.D(c.z(this.b));
              com.allinone.callerid.util.q.b().d("search_buyu_count_ok");
            } 
            b1.G0(0L);
            param1String = jSONObject.getString("type_label");
            String str1 = jSONObject.getString("name");
            String str2 = jSONObject.getString("format_tel_number");
            if ((c.H(this.b) == null || "".equals(c.H(this.b))) && str2 != null && !str2.equals("")) {
              c.I(this.b).setText(str2);
              c.G(this.b).setText(str2);
            } 
            if ((c.A(this.b) == null || "".equals(c.A(this.b))) && str1 != null && !"".equals(str1)) {
              c.B(this.b, str1);
              c.G(this.b).setText(str1);
            } 
            str1 = jSONObject.getString("avatar");
            if (str1 != null && !"".equals(str1))
              u.b(c.z(this.b), str1, 2131231148, c.K(this.b)); 
            jSONObject.getString("operator");
            jSONObject.getString("type");
            if (param1String != null && !param1String.equals("")) {
              c.K(this.b).setImageResource(2131230814);
              c.R(this.b);
              c.T(this.b).setVisibility(0);
              c.T(this.b).setText(i1.D(c.z(this.b), param1String));
            } 
            y0.a(jSONObject, this.a);
          } else if (i == 2) {
            com.allinone.callerid.util.q.b().c("search_buyu_status_2");
            b1.H0(true);
            param1String = jSONObject.getString("time_stamp");
            if (param1String != null && !"".equals(param1String))
              b1.G0(Long.parseLong(param1String) * 1000L); 
          } else if (i == -30) {
            b1.H0(false);
            com.allinone.callerid.util.q.b().c("search_buyu_error_30");
          } else {
            b1.H0(false);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
  
  class g implements com.allinone.callerid.i.a.c0.a {
    g(c this$0, String param1String) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String))
        try {
          JSONObject jSONObject = new JSONObject();
          this(param1String);
          if (jSONObject.getInt("status") == 1) {
            String str = jSONObject.getString("subtype");
            param1String = jSONObject.getString("keyword");
            if (str != null && !"".equals(str)) {
              JSONArray jSONArray = new JSONArray();
              this(str);
              if (jSONArray.length() > 0) {
                com.allinone.callerid.util.q.b().c("subtype_show");
                param1String = jSONArray.getJSONObject(0).getString("subtype");
                c.S(this.b).setVisibility(0);
                c.W(this.b).setVisibility(0);
                if (c.T(this.b) != null && c.T(this.b).getVisibility() == 0)
                  c.Y(this.b).setVisibility(0); 
                c.W(this.b).setText(param1String);
              } else if (param1String != null && !"".equals(param1String)) {
                com.allinone.callerid.util.q.b().c("keyword_show");
                c.S(this.b).setVisibility(0);
                c.W(this.b).setVisibility(0);
                if (c.T(this.b) != null && c.T(this.b).getVisibility() == 0)
                  c.Y(this.b).setVisibility(0); 
                c.W(this.b).setText(param1String);
                c.a0(this.b, true);
              } 
            } else if (param1String != null && !"".equals(param1String)) {
              com.allinone.callerid.util.q.b().c("keyword_show");
              c.S(this.b).setVisibility(0);
              c.W(this.b).setVisibility(0);
              if (c.T(this.b) != null && c.T(this.b).getVisibility() == 0)
                c.Y(this.b).setVisibility(0); 
              c.W(this.b).setText(param1String);
            } 
            if (c.W(this.b).getVisibility() == 0 && c.r0(this.b).getVisibility() == 0) {
              c.r0(this.b).setVisibility(8);
              c.p0(this.b);
            } 
            z0.a(jSONObject, this.a);
          } 
        } catch (JSONException jSONException) {
          jSONException.printStackTrace();
        }  
    }
  }
  
  class h implements com.allinone.callerid.l.a.c {
    h(c this$0) {}
    
    public void a(EZSearchContacts param1EZSearchContacts, String param1String) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("離線解析器查詢結果: ");
        stringBuilder.append(param1String);
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1EZSearchContacts != null) {
        c.E(this.a).setVisibility(8);
        if (c.f(this.a) != null)
          c.f(this.a).removeCallbacks(c.F(this.a)); 
        c.G(this.a).setVisibility(0);
        String str3 = param1EZSearchContacts.getBelong_area();
        String str2 = param1EZSearchContacts.getType();
        String str4 = param1EZSearchContacts.getOperator();
        String str1 = param1EZSearchContacts.getFormat_tel_number();
        if (str3 != null && !"".equals(str3)) {
          c.N(this.a).setText(str3);
          c.N(this.a).setVisibility(0);
        } 
        if (str4 != null && !str4.equals("") && str2 != null && !str2.equals("")) {
          TextView textView = c.M(this.a);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str2);
          stringBuilder.append(" - ");
          stringBuilder.append(str4);
          textView.setText(stringBuilder.toString());
        } else {
          c.M(this.a).setText(str2);
        } 
        if ((c.H(this.a) == null || "".equals(c.H(this.a))) && str1 != null && !"".equals(str1)) {
          c.I(this.a).setText(str1);
          c.G(this.a).setText(str1);
        } 
      } 
      com.allinone.callerid.i.a.m.a.a(c.z(this.a), c.C(this.a), param1String, new a(this));
    }
    
    public void b(EZSearchContacts param1EZSearchContacts) {
      if (d0.a)
        d0.a("wbb", "本地保存的庫返回數據，該庫返回數據直接展示"); 
      com.allinone.callerid.util.q.b().d("search_offline_location_ok_new");
      c.s0(this.a, param1EZSearchContacts, false);
    }
    
    class a implements com.allinone.callerid.i.a.m.b {
      a(c.h this$0) {}
      
      public void a(EZSearchContacts param2EZSearchContacts) {
        c.s0(this.a.a, param2EZSearchContacts, true);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.m.b {
    a(c this$0) {}
    
    public void a(EZSearchContacts param1EZSearchContacts) {
      c.s0(this.a.a, param1EZSearchContacts, true);
    }
  }
  
  class i implements Runnable {
    i(c this$0) {}
    
    public void run() {
      if (c.X(this.b) != null)
        c.X(this.b).m(c.v0(this.b).getDefaultDisplay().getWidth(), 0); 
    }
  }
  
  class j implements Runnable {
    j(c this$0) {}
    
    void a() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("i=");
      stringBuilder.append(c.d(this.b));
      d0.a("testdian", stringBuilder.toString());
      int i = c.d(this.b) % 3;
      if (i != 0) {
        if (i != 1) {
          if (i == 2)
            c.L(this.b).setText(c.z(this.b).getResources().getString(2131755605)); 
        } else {
          c.L(this.b).setText(c.z(this.b).getResources().getString(2131755604));
        } 
      } else {
        c.L(this.b).setText(c.z(this.b).getResources().getString(2131755606));
      } 
    }
    
    public void run() {
      a();
      c.e(this.b);
      c.f(this.b).postDelayed(this, 500L);
    }
  }
  
  class k implements View.OnClickListener {
    k(c this$0) {}
    
    public void onClick(View param1View) {
      try {
        this.b.C0();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class l implements com.allinone.callerid.mvc.view.recorder.a.b {
    l(c this$0, int param1Int, String param1String) {}
    
    public void a() {
      try {
        c c1 = this.c;
        RecordBallView recordBallView2 = new RecordBallView();
        this(c.z(this.c), (c.m0(this.c)).x, (c.m0(this.c)).y);
        c.Z(c1, recordBallView2);
        c.X(this.c).setCall_status(this.a);
        c.X(this.c).setTel_phone(this.b);
        c.X(this.c).setStatus(10002);
        c.X(this.c).setInitTime();
        c.u0(this.c).setVisibility(8);
        c.X(this.c).f();
        RecordBallView recordBallView1 = c.X(this.c);
        a a = new a();
        this(this);
        recordBallView1.postDelayed(a, 90L);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void b() {}
    
    class a implements Runnable {
      a(c.l this$0) {}
      
      public void run() {
        if (c.X(this.b.c) != null) {
          c.X(this.b.c).i();
          c.X(this.b.c).m(c.v0(this.b.c).getDefaultDisplay().getWidth(), 0);
        } 
        this.b.c.C0();
      }
    }
  }
  
  class a implements Runnable {
    a(c this$0) {}
    
    public void run() {
      if (c.X(this.b.c) != null) {
        c.X(this.b.c).i();
        c.X(this.b.c).m(c.v0(this.b.c).getDefaultDisplay().getWidth(), 0);
      } 
      this.b.c.C0();
    }
  }
  
  class m implements View.OnClickListener {
    m(c this$0, com.allinone.callerid.mvc.view.recorder.a param1a, String param1String, int param1Int) {}
    
    public void onClick(View param1View) {
      try {
        if (w.U((View)c.w0(this.e)) && w.U((View)c.u0(this.e)))
          this.b.c((View)c.u0(this.e), (View)c.w0(this.e)); 
        RecordCall recordCall = new RecordCall();
        this();
        if (Build.VERSION.SDK_INT >= 28) {
          recordCall.setNumber("");
        } else {
          recordCall.setNumber(this.c);
        } 
        if (this.d == 1) {
          recordCall.setPhonestatus(110);
        } else {
          recordCall.setPhonestatus(111);
        } 
        com.allinone.callerid.service.b.f().k(recordCall);
        if (b1.p2().booleanValue()) {
          i1.D0(c.z(this.e));
          com.allinone.callerid.util.q.b().c("speaker_tip_show");
          b1.G2(Boolean.FALSE);
        } 
        com.allinone.callerid.util.q.b().c("recorder_floatingball_click");
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class n implements ViewPager.i {
    n(c this$0) {}
    
    public void a(int param1Int1, float param1Float, int param1Int2) {}
    
    public void c(int param1Int) {
      if (param1Int == 1 && c.x0(this.b))
        com.allinone.callerid.util.q.b().c("spam_huadong"); 
    }
    
    public void d(int param1Int) {
      if (param1Int == 0 && c.x0(this.b)) {
        b1.J2(Boolean.TRUE);
        i1.m(c.z(this.b));
        b1.h1(true);
        com.allinone.callerid.util.q.b().c("spam_huadong_OK");
        c.g(this.b);
      } 
    }
  }
  
  class o implements View.OnTouchListener {
    o(c this$0, View param1View) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      int i = param1MotionEvent.getAction();
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            c.o(this.c, param1MotionEvent.getRawX());
            c.q(this.c, param1MotionEvent.getRawY());
            if (c.l(this.c)) {
              c.s(this.c, (int)(param1MotionEvent.getX() - c.h(this.c)));
              c.u(this.c, (int)(param1MotionEvent.getY() - c.j(this.c)));
              if (c.r(this.c) == 0 || c.t(this.c) == 0)
                return false; 
              if (c.t(this.c) > 0) {
                if (c.r(this.c) > 0) {
                  if (c.t(this.c) > c.r(this.c)) {
                    c.w(this.c, true);
                    c.y(this.c, false);
                  } else if (c.r(this.c) - c.t(this.c) > 2) {
                    c.y(this.c, true);
                    c.w(this.c, false);
                  } else {
                    c.y(this.c, false);
                    c.w(this.c, true);
                  } 
                } else if (c.t(this.c) > -c.r(this.c)) {
                  c.w(this.c, true);
                  c.y(this.c, false);
                } else if (-c.r(this.c) - c.t(this.c) > 2) {
                  c.y(this.c, true);
                  c.w(this.c, false);
                } else {
                  c.y(this.c, false);
                  c.w(this.c, true);
                } 
              } else if (c.r(this.c) > 0) {
                if (-c.t(this.c) > c.r(this.c)) {
                  c.w(this.c, true);
                  c.y(this.c, false);
                } else if (c.r(this.c) - -c.t(this.c) > 2) {
                  c.y(this.c, true);
                  c.w(this.c, false);
                } else {
                  c.y(this.c, false);
                  c.w(this.c, true);
                } 
              } else if (-c.t(this.c) > -c.r(this.c)) {
                c.w(this.c, true);
                c.y(this.c, false);
              } else if (-c.r(this.c) - -c.t(this.c) > 2) {
                c.y(this.c, true);
                c.w(this.c, false);
              } else {
                c.y(this.c, false);
                c.w(this.c, true);
              } 
              c.m(this.c, false);
            } 
            try {
              if (c.v(this.c)) {
                (c.m0(this.c)).y = (int)(c.p(this.c) - c.j(this.c));
                if ((c.m0(this.c)).y > com.allinone.callerid.util.j.a(c.z(this.c), 0.0F) && (c.m0(this.c)).y < c.v0(this.c).getDefaultDisplay().getHeight() - this.b.getHeight())
                  c.v0(this.c).updateViewLayout(this.b, (ViewGroup.LayoutParams)c.m0(this.c)); 
              } 
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
        } else {
          try {
            if (c.v(this.c)) {
              (c.m0(this.c)).y = (int)(c.p(this.c) - c.j(this.c));
              if ((c.m0(this.c)).y > com.allinone.callerid.util.j.a(c.z(this.c), 0.0F) && (c.m0(this.c)).y < c.v0(this.c).getDefaultDisplay().getHeight() - this.b.getHeight()) {
                c.v0(this.c).updateViewLayout(this.b, (ViewGroup.LayoutParams)c.m0(this.c));
                if (b1.a0() == -1)
                  b1.k2((c.m0(this.c)).y); 
              } 
            } 
            if (b1.a0() == -1)
              if ((c.m0(this.c)).y < com.allinone.callerid.util.j.a(c.z(this.c), 0.0F)) {
                b1.k2(com.allinone.callerid.util.j.a(c.z(this.c), 0.0F));
              } else if ((c.m0(this.c)).y > c.v0(this.c).getDefaultDisplay().getHeight() - this.b.getHeight()) {
                b1.k2(c.v0(this.c).getDefaultDisplay().getHeight() - this.b.getHeight());
              } else {
                b1.k2((c.m0(this.c)).y);
              }  
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          c c1 = this.c;
          c.i(c1, c.k(c1, 0.0F));
        } 
      } else {
        c.i(this.c, param1MotionEvent.getX());
        c.k(this.c, param1MotionEvent.getY());
        c.m(this.c, true);
      } 
      return false;
    }
  }
  
  class p implements View.OnTouchListener {
    p(c this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      c c1;
      int i = param1MotionEvent.getAction();
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            c.o(this.b, param1MotionEvent.getRawX());
            c.q(this.b, param1MotionEvent.getRawY());
            if (c.l(this.b)) {
              c.s(this.b, (int)(param1MotionEvent.getX() - c.h(this.b)));
              c.u(this.b, (int)(param1MotionEvent.getY() - c.j(this.b)));
              if (c.r(this.b) == 0 || c.t(this.b) == 0)
                return true; 
              if (c.t(this.b) > 0) {
                if (c.r(this.b) > 0) {
                  if (c.t(this.b) > c.r(this.b)) {
                    c.w(this.b, true);
                    c.y(this.b, false);
                  } else if (c.r(this.b) - c.t(this.b) > 2) {
                    c.y(this.b, true);
                    c.w(this.b, false);
                  } else {
                    c.y(this.b, false);
                    c.w(this.b, true);
                  } 
                } else if (c.t(this.b) > -c.r(this.b)) {
                  c.w(this.b, true);
                  c.y(this.b, false);
                } else if (-c.r(this.b) - c.t(this.b) > 2) {
                  c.y(this.b, true);
                  c.w(this.b, false);
                } else {
                  c.y(this.b, false);
                  c.w(this.b, true);
                } 
              } else if (c.r(this.b) > 0) {
                if (-c.t(this.b) > c.r(this.b)) {
                  c.w(this.b, true);
                  c.y(this.b, false);
                } else if (c.r(this.b) - -c.t(this.b) > 2) {
                  c.y(this.b, true);
                  c.w(this.b, false);
                } else {
                  c.y(this.b, false);
                  c.w(this.b, true);
                } 
              } else if (-c.t(this.b) > -c.r(this.b)) {
                c.w(this.b, true);
                c.y(this.b, false);
              } else if (-c.r(this.b) - -c.t(this.b) > 2) {
                c.y(this.b, true);
                c.w(this.b, false);
              } else {
                c.y(this.b, false);
                c.w(this.b, true);
              } 
              c.m(this.b, false);
            } 
            try {
              if (c.v(this.b)) {
                (c.m0(this.b)).y = (int)(c.p(this.b) - c.j(this.b));
                if ((c.m0(this.b)).y > com.allinone.callerid.util.j.a(c.z(this.b), 0.0F) && (c.m0(this.b)).y < c.v0(this.b).getDefaultDisplay().getHeight() - param1View.getHeight())
                  c.v0(this.b).updateViewLayout(param1View, (ViewGroup.LayoutParams)c.m0(this.b)); 
              } 
              if (c.x(this.b)) {
                (c.m0(this.b)).x = (int)(c.h(this.b) - c.n(this.b));
                param1View.scrollTo((c.m0(this.b)).x, 0);
              } 
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
        } else {
          try {
            if (c.v(this.b)) {
              (c.m0(this.b)).y = (int)(c.p(this.b) - c.j(this.b));
              if ((c.m0(this.b)).y > com.allinone.callerid.util.j.a(c.z(this.b), 0.0F) && (c.m0(this.b)).y < c.v0(this.b).getDefaultDisplay().getHeight() - exception.getHeight()) {
                c.v0(this.b).updateViewLayout((View)exception, (ViewGroup.LayoutParams)c.m0(this.b));
                if (b1.a0() == -1)
                  b1.k2((c.m0(this.b)).y); 
              } 
            } 
            if (c.x(this.b))
              if ((c.m0(this.b)).x > 100 || (c.m0(this.b)).x < -100) {
                this.b.C0();
              } else {
                exception.scrollTo(0, 0);
              }  
            if (b1.a0() == -1)
              if ((c.m0(this.b)).y < com.allinone.callerid.util.j.a(c.z(this.b), 0.0F)) {
                b1.k2(com.allinone.callerid.util.j.a(c.z(this.b), 0.0F));
              } else if ((c.m0(this.b)).y > c.v0(this.b).getDefaultDisplay().getHeight() - exception.getHeight()) {
                b1.k2(c.v0(this.b).getDefaultDisplay().getHeight() - exception.getHeight());
              } else {
                b1.k2((c.m0(this.b)).y);
              }  
          } catch (Exception exception1) {
            exception1.printStackTrace();
          } 
          c1 = this.b;
          c.i(c1, c.k(c1, 0.0F));
          exception.performClick();
        } 
      } else {
        c.i(this.b, c1.getX());
        c.k(this.b, c1.getY());
        c.m(this.b, true);
      } 
      return true;
    }
  }
  
  class q implements com.allinone.callerid.i.a.e.a {
    q(c this$0) {}
    
    public void a(boolean param1Boolean) {
      if (!param1Boolean) {
        EZBlackList eZBlackList = new EZBlackList();
        if (c.A(this.a) != null && !"".equals(c.A(this.a))) {
          eZBlackList.setName(c.A(this.a));
        } else {
          eZBlackList.setName("");
        } 
        eZBlackList.setNumber(c.C(this.a).replace("-", ""));
        eZBlackList.setIs_myblock("true");
        com.allinone.callerid.i.a.e.b.a(eZBlackList, new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(c.q this$0) {}
      
      public void a() {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(c this$0) {}
    
    public void a() {}
  }
  
  class r implements com.allinone.callerid.i.a.a0.a {
    r(c this$0, String param1String, int param1Int1, int param1Int2) {}
    
    public void a(EZSearchContacts param1EZSearchContacts) {
      if (param1EZSearchContacts != null) {
        try {
          boolean bool1 = param1EZSearchContacts.isSearched();
          boolean bool2 = param1EZSearchContacts.isSearched_buyu();
          if (!bool1) {
            c.D(this.d, this.a, this.b, this.c, bool2);
          } else {
            c c1 = this.d;
            if (c1.l0 != null && this.c == 1) {
              Context context = c.z(c1);
              c c2 = this.d;
              c1.c(context, c2.l0, c.m0(c2));
              if (d0.a)
                d0.a("callstatus", "陌生本地有数据展示"); 
            } 
            if (this.c == 1) {
              com.allinone.callerid.util.q.b().d("unknow_searched_ok");
              if (this.b == 1)
                com.allinone.callerid.util.q.b().d("unknow_incoming_searched_ok"); 
            } 
          } 
          c.E(this.d).setVisibility(8);
          if (c.f(this.d) != null)
            c.f(this.d).removeCallbacks(c.F(this.d)); 
          c.G(this.d).setVisibility(0);
          String str2 = param1EZSearchContacts.getFormat_tel_number();
          String str1 = c.H(this.d);
          if ((str1 == null || "".equals(c.H(this.d))) && str2 != null && !str2.equals("")) {
            c.I(this.d).setText(str2);
            c.G(this.d).setText(str2);
          } 
          if (c.A(this.d) == null || "".equals(c.A(this.d))) {
            str1 = param1EZSearchContacts.getName();
            if (str1 != null && !"".equals(str1)) {
              c.B(this.d, str1);
              c.J(this.d, str1);
              c.G(this.d).setText(str1);
            } 
          } 
          str1 = param1EZSearchContacts.getAvatar();
          if (str1 != null && !"".equals(str1))
            u.b(c.z(this.d), str1, 2131231148, c.K(this.d)); 
          str2 = param1EZSearchContacts.getOperator();
          String str3 = param1EZSearchContacts.getType();
          if (str2 != null && !str2.equals("") && str3 != null && !str3.equals("")) {
            TextView textView = c.M(this.d);
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(i1.J(c.z(this.d), str3));
            stringBuilder.append(" - ");
            stringBuilder.append(str2);
            textView.setText(stringBuilder.toString());
          } else {
            c.M(this.d).setText(i1.J(c.z(this.d), str3));
          } 
          str1 = param1EZSearchContacts.getBelong_area();
          if (str1 != null && !"".equals(str1)) {
            c.N(this.d).setText(str1);
            c.N(this.d).setVisibility(0);
          } 
          str1 = param1EZSearchContacts.getType_label();
          c.P(this.d, str1);
          if (c.Q(this.d) == 1 && str1 != null && !str1.equals("")) {
            c.K(this.d).setImageResource(2131230814);
            c.R(this.d);
            c.S(this.d).setVisibility(0);
            c.T(this.d).setVisibility(0);
            TextView textView = c.T(this.d);
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(param1EZSearchContacts.getReport_count());
            stringBuilder.append(" ");
            stringBuilder.append(c.z(this.d).getResources().getString(2131755097));
            textView.setText(stringBuilder.toString());
            if (c.U(this.d) == 1)
              c.V(this.d); 
            b1.x1(true);
          } else {
            b1.x1(false);
          } 
          if (c.Q(this.d) == 1) {
            str1 = param1EZSearchContacts.getSubtype();
            str2 = param1EZSearchContacts.getKeyword();
            if (str1 != null && !"".equals(str1)) {
              JSONArray jSONArray = new JSONArray();
              this(str1);
              if (jSONArray.length() > 0) {
                com.allinone.callerid.util.q.b().c("subtype_show");
                str1 = jSONArray.getJSONObject(0).getString("subtype");
                c.S(this.d).setVisibility(0);
                c.W(this.d).setVisibility(0);
                if (c.T(this.d) != null && c.T(this.d).getVisibility() == 0)
                  c.Y(this.d).setVisibility(0); 
                c.W(this.d).setText(str1);
                c.a0(this.d, true);
              } else if (str2 != null && !"".equals(str2)) {
                com.allinone.callerid.util.q.b().c("keyword_show");
                c.S(this.d).setVisibility(0);
                c.W(this.d).setVisibility(0);
                if (c.T(this.d) != null && c.T(this.d).getVisibility() == 0)
                  c.Y(this.d).setVisibility(0); 
                c.W(this.d).setText(str2);
                c.a0(this.d, true);
              } 
            } else if (str2 != null && !"".equals(str2)) {
              com.allinone.callerid.util.q.b().c("keyword_show");
              c.S(this.d).setVisibility(0);
              c.W(this.d).setVisibility(0);
              if (c.T(this.d) != null && c.T(this.d).getVisibility() == 0)
                c.Y(this.d).setVisibility(0); 
              c.W(this.d).setText(str2);
              c.a0(this.d, true);
            } 
          } 
          if (c.Q(this.d) == 1) {
            int i = param1EZSearchContacts.getBlock_count();
            int j = param1EZSearchContacts.getDeclined_count();
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("block_count:");
              stringBuilder.append(i);
              stringBuilder.append(" declined_count:");
              stringBuilder.append(j);
              d0.a("wiki", stringBuilder.toString());
            } 
            c.b0(this.d, i, j);
            if (c.O(this.d) != null && !"".equals(c.O(this.d)) && (i >= 3 || j >= 3))
              c.d0(this.d, true); 
          } 
          long l = param1EZSearchContacts.getWiki_search_time();
          if (System.currentTimeMillis() - l > 86400000L) {
            c c1 = this.d;
            c.e0(c1, c.z(c1), this.a, this.c);
          } 
          if (!param1EZSearchContacts.isSubtype_isserach())
            c.f0(this.d, this.a, this.c); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        c.D(this.d, this.a, this.b, this.c, false);
        c c1 = this.d;
        c.e0(c1, c.z(c1), this.a, this.c);
        c.f0(this.d, this.a, this.c);
      } 
    }
  }
  
  private static class s extends AsyncTask<Void, Void, Boolean> {
    private WeakReference<c> a;
    
    private String b;
    
    private int c;
    
    s(c param1c, String param1String, int param1Int) {
      this.a = new WeakReference<c>(param1c);
      this.b = param1String;
      this.c = param1Int;
    }
    
    protected Boolean a(Void... param1VarArgs) {
      c c = this.a.get();
      if (c != null) {
        boolean bool = com.allinone.callerid.util.recorder.b.e();
        boolean bool1 = true;
        if (!bool || !com.allinone.callerid.i.a.u.a.a()) {
          c.t0(c, false);
        } else if (com.allinone.callerid.util.recorder.f.n(this.b, this.c)) {
          c.t0(c, false);
        } else {
          com.allinone.callerid.util.q.b().c("recorder_floatingball_show");
          c.t0(c, true);
          return Boolean.valueOf(bool1);
        } 
        bool1 = false;
        return Boolean.valueOf(bool1);
      } 
      return Boolean.FALSE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      try {
        c c = this.a.get();
        if (c != null)
          if (param1Boolean.booleanValue()) {
            c.u0(c).setVisibility(0);
          } else {
            c.u0(c).setVisibility(8);
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */