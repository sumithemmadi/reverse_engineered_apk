package com.allinone.callerid.d.c;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.h.k.w;
import cn.jzvd.Jzvd;
import cn.jzvd.t;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.callscreen.CustomMedia.JZMediaExo;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.view.MyJzvdStd;
import com.allinone.callerid.h.b;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.mvc.view.recorder.RecordBallView;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.t;
import com.allinone.callerid.util.u;
import com.allinone.callerid.util.y0;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

public class a extends b {
  private static volatile a c;
  
  private int d = 3;
  
  private String e;
  
  private Context f;
  
  private ImageView g;
  
  private TextView h;
  
  private TextView i;
  
  private HomeInfo j;
  
  private String k;
  
  private MyJzvdStd l;
  
  private TextView m;
  
  private TextView n;
  
  private TextView o;
  
  private String p;
  
  private boolean q;
  
  private RecordBallView r;
  
  private RecordBallView s;
  
  private WindowManager t;
  
  private RelativeLayout u;
  
  private WindowManager.LayoutParams v;
  
  private int w;
  
  public ViewGroup x;
  
  private ImageView y;
  
  private WindowManager.LayoutParams A() {
    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
    if (Build.VERSION.SDK_INT >= 26) {
      layoutParams.type = 2038;
    } else {
      layoutParams.type = 2010;
    } 
    layoutParams.height = -2;
    layoutParams.width = -1;
    layoutParams.gravity = 51;
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
  
  private void C() {
    try {
      B();
      WindowManager.LayoutParams layoutParams = z();
      this.t = (WindowManager)this.f.getSystemService("window");
      if (Build.VERSION.SDK_INT >= 23) {
        if (Settings.canDrawOverlays((Context)EZCallApplication.c())) {
          this.x = b(this.f, 2131493004, layoutParams);
        } else {
          q.b().d("floatview_no_per");
        } 
      } else {
        this.x = b(this.f, 2131493004, layoutParams);
      } 
      ViewGroup viewGroup = this.x;
      if (viewGroup != null) {
        this.t.updateViewLayout((View)viewGroup, (ViewGroup.LayoutParams)layoutParams);
        if (d0.a)
          d0.a("callstatus", "overlay"); 
        F((View)this.x);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void D() {
    if (this.d == 0) {
      this.y.setVisibility(0);
      this.h.setText(this.e);
      com.allinone.callerid.main.a.b(this.f).E(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.w)).b1(2131231148).M0().C0(this.g);
    } 
    x();
  }
  
  private void E() {
    this.v = A();
    com.allinone.callerid.mvc.view.recorder.a a1 = new com.allinone.callerid.mvc.view.recorder.a();
    a1.d(new e(this));
    this.s.setOnClickListener(new f(this, a1));
  }
  
  private void F(View paramView) {
    this.u = (RelativeLayout)paramView.findViewById(2131297472);
    this.l = (MyJzvdStd)paramView.findViewById(2131297097);
    this.g = (ImageView)paramView.findViewById(2131296447);
    this.h = (TextView)paramView.findViewById(2131296449);
    this.i = (TextView)paramView.findViewById(2131296450);
    ImageView imageView1 = (ImageView)paramView.findViewById(2131296652);
    ImageView imageView2 = (ImageView)paramView.findViewById(2131296273);
    ImageView imageView3 = (ImageView)paramView.findViewById(2131296968);
    this.y = (ImageView)paramView.findViewById(2131297005);
    this.m = (TextView)paramView.findViewById(2131298136);
    this.n = (TextView)paramView.findViewById(2131297966);
    this.o = (TextView)paramView.findViewById(2131298061);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("展示来电闪屏弹窗: ");
      stringBuilder.append(this.k);
      d0.a("contact", stringBuilder.toString());
    } 
    Typeface typeface = g1.a();
    this.h.setTypeface(typeface);
    this.i.setTypeface(typeface);
    this.m.setTypeface(typeface);
    this.n.setTypeface(typeface);
    this.o.setTypeface(typeface);
    String str = this.k;
    if (str != null) {
      str = q0.b(str);
      this.p = str;
      if (str != null && !"".equals(str)) {
        this.i.setText(this.p);
      } else {
        this.i.setText(this.k);
      } 
    } 
    imageView3.setOnClickListener(new b(this));
    imageView1.setOnClickListener(new c(this));
    imageView2.setOnClickListener(new d(this));
    q.b().c("callscreen_show");
    HomeInfo homeInfo = this.j;
    if (homeInfo != null)
      I(homeInfo); 
    com.allinone.callerid.customview.e.d.h(new View[] { (View)imageView2 }).d().l(new float[] { 5.0F, -5.0F, 5.0F }).c().j(400L).m(-1).n();
    RecordBallView recordBallView = (RecordBallView)paramView.findViewById(2131296826);
    this.s = recordBallView;
    recordBallView.setIsonTouch(false);
    this.s.setCall_status(1);
    this.s.setTel_phone(this.k);
    this.s.setStatus(10001);
    G(this.k, this.d);
    E();
    D();
  }
  
  private void G(String paramString, int paramInt) {
    (new k(this, paramString, paramInt)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  private void I(HomeInfo paramHomeInfo) {
    try {
      if (paramHomeInfo.getPath() != null && !"".equals(paramHomeInfo.getPath())) {
        File file = new File();
        this(paramHomeInfo.getPath());
        if (file.exists() && com.allinone.callerid.util.k1.a.e(this.f)) {
          Jzvd.D();
          t t = new t();
          this(Uri.parse(paramHomeInfo.getPath()));
          t.e = true;
          this.l.setUp(t, 1, JZMediaExo.class);
          if (paramHomeInfo.isIsdiy() && paramHomeInfo.isUseVideoAudioRing()) {
            this.l.setSilence(false);
          } else {
            this.l.setSilence(true);
          } 
          this.l.L();
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void K(String paramString1, String paramString2, String paramString3, int paramInt) {
    if (System.currentTimeMillis() - b1.c() > 0L && paramInt == 0 && paramString3 != null && !"".equals(paramString3)) {
      if (b1.d()) {
        q.b().d("search_buyu_token_max");
      } else {
        g0.C(this.f);
        q.b().d("search_buyu_count");
      } 
      com.allinone.callerid.i.a.z.b.a(this.f, paramString2, paramString3, new i(this, paramString1));
    } 
  }
  
  private void L(String paramString, int paramInt) {
    if (paramInt == 1) {
      if (d0.a)
        d0.a("wbb", "查询本地数据并展示"); 
      q.b().c("search_offline_new");
      q.b().d("search_offline_new");
      com.allinone.callerid.l.a.f.d(paramString, new j(this));
    } 
  }
  
  private void M(String paramString, int paramInt, boolean paramBoolean) {
    if (paramInt == 1)
      com.allinone.callerid.i.a.z.d.a(this.f, paramString, 1, paramInt, new h(this, paramBoolean, paramString)); 
  }
  
  private void O(EZSearchContacts paramEZSearchContacts, boolean paramBoolean) {
    if (paramEZSearchContacts != null) {
      int i;
      String str2 = paramEZSearchContacts.getFormat_tel_number();
      String str3 = this.p;
      if ((str3 == null || "".equals(str3)) && str2 != null && !"".equals(str2))
        this.i.setText(str2); 
      str3 = paramEZSearchContacts.getName();
      if (this.d == 1 && str3 != null && !"".equals(str3))
        this.h.setText(str3); 
      if (paramEZSearchContacts.getReport_count() == null || "".equals(paramEZSearchContacts.getReport_count())) {
        i = 0;
      } else {
        i = Integer.parseInt(paramEZSearchContacts.getReport_count());
      } 
      str3 = paramEZSearchContacts.getBelong_area();
      if (str3 != null && !"".equals(str3)) {
        this.n.setText(str3);
        this.n.setVisibility(0);
      } 
      String str1 = paramEZSearchContacts.getType_label();
      if (str1 != null && !str1.equals("") && i == 0) {
        this.g.setImageResource(2131230814);
        this.m.setVisibility(0);
      } 
      if (str1 != null && !str1.equals("") && i > 0) {
        this.g.setImageResource(2131230814);
        this.m.setVisibility(0);
        this.o.setVisibility(0);
        TextView textView = this.o;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(" ");
        stringBuilder.append(this.f.getResources().getString(2131755097));
        textView.setText(stringBuilder.toString());
      } 
    } 
  }
  
  private void x() {
    String str = this.k.replace(" ", "").replace("-", "").replace("*", "").replace("#", "");
    if (com.allinone.callerid.util.e.b(this.f)) {
      q.b().d("is_connected");
      if (this.d == 1) {
        q.b().d("unknow_is_connected");
        q.b().d("unknow_incoming_is_connected");
      } 
      g0.w((Context)EZCallApplication.c());
      com.allinone.callerid.i.a.a0.b.a(this.k, new g(this, str));
    } else {
      q.b().d("is_not_connected");
      q.b().d("unknow_not_connected");
      q.b().d("unknow_incoming_not_connected");
      g0.x((Context)EZCallApplication.c());
      L(str, this.d);
    } 
  }
  
  public static a y() {
    // Byte code:
    //   0: getstatic com/allinone/callerid/d/c/a.c : Lcom/allinone/callerid/d/c/a;
    //   3: ifnonnull -> 39
    //   6: ldc com/allinone/callerid/d/c/a
    //   8: monitorenter
    //   9: getstatic com/allinone/callerid/d/c/a.c : Lcom/allinone/callerid/d/c/a;
    //   12: ifnonnull -> 27
    //   15: new com/allinone/callerid/d/c/a
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial <init> : ()V
    //   23: aload_0
    //   24: putstatic com/allinone/callerid/d/c/a.c : Lcom/allinone/callerid/d/c/a;
    //   27: ldc com/allinone/callerid/d/c/a
    //   29: monitorexit
    //   30: goto -> 39
    //   33: astore_0
    //   34: ldc com/allinone/callerid/d/c/a
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    //   39: getstatic com/allinone/callerid/d/c/a.c : Lcom/allinone/callerid/d/c/a;
    //   42: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	33	finally
    //   27	30	33	finally
    //   34	37	33	finally
  }
  
  private WindowManager.LayoutParams z() {
    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
    if (Build.VERSION.SDK_INT >= 26) {
      layoutParams.type = 2038;
    } else {
      layoutParams.type = 2010;
    } 
    layoutParams.height = -1;
    layoutParams.width = -1;
    layoutParams.flags = 17303336;
    return layoutParams;
  }
  
  public void B() {
    synchronized (this.b) {
      ViewGroup viewGroup = this.x;
      if (viewGroup != null) {
        try {
          WindowManager windowManager = this.t;
          if (windowManager != null) {
            try {
              Jzvd.D();
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
            this.t.removeView((View)this.x);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        this.x = null;
      } 
      return;
    } 
  }
  
  public void H(String paramString, int paramInt) {
    try {
      if (this.q) {
        RecordBallView recordBallView2 = this.r;
        if (recordBallView2 != null) {
          recordBallView2.j();
          this.r = null;
        } 
        RecordBallView recordBallView3 = new RecordBallView();
        Context context = this.f;
        WindowManager.LayoutParams layoutParams = this.v;
        this(context, layoutParams.x, layoutParams.y);
        this.r = recordBallView3;
        recordBallView3.setCall_status(paramInt);
        this.r.setTel_phone(paramString);
        this.r.setStatus(10001);
        this.r.setLayoutParams(84, 84);
        this.r.f();
        RecordBallView recordBallView1 = this.r;
        a a1 = new a();
        this(this);
        recordBallView1.postDelayed(a1, 90L);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void J() {
    RecordBallView recordBallView = this.r;
    if (recordBallView != null) {
      recordBallView.j();
      this.r = null;
    } 
  }
  
  public void N(Context paramContext, String paramString1, HomeInfo paramHomeInfo, int paramInt1, String paramString2, int paramInt2) {
    synchronized (this.b) {
      this.f = paramContext;
      this.j = paramHomeInfo;
      this.k = paramString1;
      this.d = paramInt1;
      this.e = paramString2;
      this.w = paramInt2;
      C();
      return;
    } 
  }
  
  class a implements Runnable {
    a(a this$0) {}
    
    public void run() {
      if (a.e(this.b) != null)
        a.e(this.b).m(a.s(this.b).getDefaultDisplay().getWidth(), 0); 
    }
  }
  
  class b implements View.OnClickListener {
    b(a this$0) {}
    
    public void onClick(View param1View) {
      this.b.B();
    }
  }
  
  class c implements View.OnClickListener {
    c(a this$0) {}
    
    public void onClick(View param1View) {
      this.b.B();
      i1.m(a.d(this.b));
    }
  }
  
  class d implements View.OnClickListener {
    d(a this$0) {}
    
    public void onClick(View param1View) {
      this.b.B();
      com.allinone.callerid.d.f.a.a(a.d(this.b));
    }
  }
  
  class e implements com.allinone.callerid.mvc.view.recorder.a.b {
    e(a this$0) {}
    
    public void a() {
      try {
        a a1 = this.a;
        RecordBallView recordBallView2 = new RecordBallView();
        this(a.d(this.a), (a.p(this.a)).x, (a.p(this.a)).y);
        a.g(a1, recordBallView2);
        a.e(this.a).setCall_status(1);
        a.e(this.a).setTel_phone(a.q(this.a));
        a.e(this.a).setStatus(10002);
        a.e(this.a).setInitTime();
        a.r(this.a).setVisibility(8);
        a.e(this.a).f();
        RecordBallView recordBallView1 = a.e(this.a);
        a a2 = new a();
        this(this);
        recordBallView1.postDelayed(a2, 90L);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void b() {}
    
    class a implements Runnable {
      a(a.e this$0) {}
      
      public void run() {
        if (a.e(this.b.a) != null) {
          a.e(this.b.a).i();
          a.e(this.b.a).m(a.s(this.b.a).getDefaultDisplay().getWidth(), 0);
        } 
        this.b.a.B();
      }
    }
  }
  
  class a implements Runnable {
    a(a this$0) {}
    
    public void run() {
      if (a.e(this.b.a) != null) {
        a.e(this.b.a).i();
        a.e(this.b.a).m(a.s(this.b.a).getDefaultDisplay().getWidth(), 0);
      } 
      this.b.a.B();
    }
  }
  
  class f implements View.OnClickListener {
    f(a this$0, com.allinone.callerid.mvc.view.recorder.a param1a) {}
    
    public void onClick(View param1View) {
      try {
        if (w.U((View)a.t(this.c)) && w.U((View)a.r(this.c)))
          this.b.c((View)a.r(this.c), (View)a.t(this.c)); 
        RecordCall recordCall = new RecordCall();
        this();
        if (Build.VERSION.SDK_INT >= 28) {
          recordCall.setNumber("");
        } else {
          recordCall.setNumber(a.q(this.c));
        } 
        recordCall.setPhonestatus(111);
        com.allinone.callerid.service.b.f().k(recordCall);
        if (b1.p2().booleanValue()) {
          i1.D0(a.d(this.c));
          q.b().c("speaker_tip_show");
          b1.G2(Boolean.FALSE);
        } 
        q.b().c("recorder_floatingball_click");
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements com.allinone.callerid.i.a.a0.a {
    g(a this$0, String param1String) {}
    
    public void a(EZSearchContacts param1EZSearchContacts) {
      if (param1EZSearchContacts != null) {
        try {
          boolean bool1 = param1EZSearchContacts.isSearched();
          boolean bool2 = param1EZSearchContacts.isSearched_buyu();
          if (!bool1) {
            a a1 = this.b;
            a.v(a1, this.a, a.u(a1), bool2);
          } else if (a.u(this.b) == 1) {
            q.b().d("unknow_searched_ok");
            q.b().d("unknow_incoming_searched_ok");
          } 
          String str2 = param1EZSearchContacts.getFormat_tel_number();
          String str1 = a.w(this.b);
          if ((str1 == null || "".equals(a.w(this.b))) && str2 != null && !str2.equals(""))
            a.f(this.b).setText(str2); 
          if (a.u(this.b) == 1) {
            str1 = param1EZSearchContacts.getName();
            if (str1 != null && !"".equals(str1))
              a.h(this.b).setText(str1); 
          } 
          str1 = param1EZSearchContacts.getAvatar();
          if (str1 != null && !"".equals(str1))
            u.b(a.d(this.b), str1, 2131231148, a.i(this.b)); 
          str1 = param1EZSearchContacts.getBelong_area();
          if (str1 != null && !"".equals(str1)) {
            a.j(this.b).setText(str1);
            a.j(this.b).setVisibility(0);
          } 
          str1 = param1EZSearchContacts.getType_label();
          if (a.u(this.b) == 1 && str1 != null && !str1.equals("")) {
            a.i(this.b).setImageResource(2131230814);
            a.k(this.b).setVisibility(0);
            TextView textView = a.l(this.b);
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(param1EZSearchContacts.getReport_count());
            stringBuilder.append(" ");
            stringBuilder.append(a.d(this.b).getResources().getString(2131755097));
            textView.setText(stringBuilder.toString());
            a.l(this.b).setVisibility(0);
            b1.x1(true);
          } else {
            b1.x1(false);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        a a1 = this.b;
        a.v(a1, this.a, a.u(a1), false);
      } 
    }
  }
  
  class h implements com.allinone.callerid.i.a.z.c {
    h(a this$0, boolean param1Boolean, String param1String) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String))
        try {
          JSONObject jSONObject = new JSONObject();
          this(param1String);
          int i = jSONObject.getInt("status");
          if (i == 1) {
            boolean bool = d0.a;
            if (bool)
              d0.a("searchNumber", "查询完成"); 
            param1String = jSONObject.getString("type_label");
            String str1 = jSONObject.getString("name");
            String str3 = jSONObject.getString("format_tel_number");
            if ((a.w(this.c) == null || "".equals(a.w(this.c))) && str3 != null && !str3.equals(""))
              a.f(this.c).setText(str3); 
            if (str1 != null && !"".equals(str1))
              a.h(this.c).setText(str1); 
            String str4 = jSONObject.getString("report_count");
            if (param1String != null && !param1String.equals("")) {
              a.i(this.c).setImageResource(2131230814);
              a.k(this.c).setVisibility(0);
              TextView textView = a.l(this.c);
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(str4);
              stringBuilder.append(" ");
              stringBuilder.append(a.d(this.c).getResources().getString(2131755097));
              textView.setText(stringBuilder.toString());
              a.l(this.c).setVisibility(0);
            } 
            str3 = jSONObject.getString("avatar");
            if (str3 != null && !"".equals(str3))
              u.b(a.d(this.c), str3, 2131231148, a.i(this.c)); 
            str3 = jSONObject.getString("belong_area");
            if (str3 != null && !"".equals(str3)) {
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("位置：");
                stringBuilder.append(str3);
                d0.a("searchNumber", stringBuilder.toString());
              } 
              a.j(this.c).setText(str3);
              a.j(this.c).setVisibility(0);
              q.b().d("search_number_float_success");
              g0.H((Context)EZCallApplication.c());
            } 
            if (str1 != null && !"".equals(str1)) {
              q.b().d("unknown_incoming_search_name_ok");
              q.b().d("new_search_name_success");
              g0.I((Context)EZCallApplication.c());
            } 
            if (param1String != null && !"".equals(param1String)) {
              q.b().d("unknown_incoming_search_spam_ok");
              q.b().d("search_number_float_spam");
              g0.O((Context)EZCallApplication.c());
            } 
            JSONArray jSONArray = jSONObject.getJSONArray("soft_comments");
            if (jSONArray != null && !"".equals(jSONArray.toString()) && jSONArray.length() != 0)
              g0.E((Context)EZCallApplication.c()); 
            String str5 = jSONObject.getString("e164_tel_number");
            if (str5 != null && !"".equals(str5))
              q.b().d("unknown_incoming_search_e164_ok"); 
            String str2 = jSONObject.getString("cc");
            i = jSONObject.getInt("faild_error_log");
            if (!this.a)
              a.m(this.c, this.b, str2, str5, i); 
            if (i == 0) {
              q.b().d("new_search_failed");
            } else if (i == 1) {
              q.b().d("new_search_success");
              q.b().d("unknown_incoming_search_ok");
              if (this.b.startsWith("140") || this.b.startsWith("+91140") || this.b.startsWith("0091140"))
                g0.G(a.d(this.c)); 
              g0.J((Context)EZCallApplication.c());
            } 
            jSONObject.getInt("area_error_log");
            if ((param1String != null && !"".equals(param1String)) || (str1 != null && !"".equals(str1))) {
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
            y0.b(jSONObject, this.b, false);
          } else {
            if (i == -20) {
              t.a();
              q.b().d("search_result_status_20");
            } 
            q.b().d("search_result_status_failed");
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
          q.b().d("search_number_exception");
        }  
    }
  }
  
  class i implements com.allinone.callerid.i.a.z.a {
    i(a this$0, String param1String) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String))
        try {
          JSONObject jSONObject = new JSONObject();
          this(param1String);
          int j = jSONObject.getInt("status");
          if (j == 1) {
            b1.H0(false);
            if (jSONObject.getInt("faild_error_log") == 1) {
              g0.D(a.d(this.b));
              q.b().d("search_buyu_count_ok");
            } 
            b1.G0(0L);
            param1String = jSONObject.getString("type_label");
            String str1 = jSONObject.getString("name");
            String str2 = jSONObject.getString("format_tel_number");
            if ((a.w(this.b) == null || "".equals(a.w(this.b))) && str2 != null && !str2.equals(""))
              a.f(this.b).setText(str2); 
            if (a.u(this.b) == 1 && str1 != null && !"".equals(str1))
              a.h(this.b).setText(str1); 
            if (param1String != null && !param1String.equals("")) {
              a.i(this.b).setImageResource(2131230814);
              a.k(this.b).setVisibility(0);
            } 
            param1String = jSONObject.getString("avatar");
            if (param1String != null && !"".equals(param1String))
              u.b(a.d(this.b), param1String, 2131231148, a.i(this.b)); 
            y0.a(jSONObject, this.a);
          } else if (j == 2) {
            q.b().c("search_buyu_status_2");
            b1.H0(true);
            param1String = jSONObject.getString("time_stamp");
            if (param1String != null && !"".equals(param1String))
              b1.G0(Long.parseLong(param1String) * 1000L); 
          } else if (j == -30) {
            b1.H0(false);
            q.b().c("search_buyu_error_30");
          } else {
            b1.H0(false);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
  
  class j implements com.allinone.callerid.l.a.c {
    j(a this$0) {}
    
    public void a(EZSearchContacts param1EZSearchContacts, String param1String) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("離線解析器查詢結果: ");
        stringBuilder.append(param1String);
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1EZSearchContacts != null) {
        String str2 = param1EZSearchContacts.getBelong_area();
        param1EZSearchContacts.getType();
        param1EZSearchContacts.getOperator();
        String str1 = param1EZSearchContacts.getFormat_tel_number();
        if (str2 != null && !"".equals(str2)) {
          a.j(this.a).setText(str2);
          a.j(this.a).setVisibility(0);
        } 
        if ((a.w(this.a) == null || "".equals(a.w(this.a))) && str1 != null && !"".equals(str1))
          a.f(this.a).setText(str1); 
      } 
      com.allinone.callerid.i.a.m.a.a(a.d(this.a), a.q(this.a), param1String, new a(this));
    }
    
    public void b(EZSearchContacts param1EZSearchContacts) {
      if (d0.a)
        d0.a("wbb", "本地保存的庫返回數據，該庫返回數據直接展示"); 
      q.b().c("search_offline_location_ok_new");
      q.b().d("search_offline_location_ok_new");
      a.n(this.a, param1EZSearchContacts, false);
    }
    
    class a implements com.allinone.callerid.i.a.m.b {
      a(a.j this$0) {}
      
      public void a(EZSearchContacts param2EZSearchContacts) {
        a.n(this.a.a, param2EZSearchContacts, true);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.m.b {
    a(a this$0) {}
    
    public void a(EZSearchContacts param1EZSearchContacts) {
      a.n(this.a.a, param1EZSearchContacts, true);
    }
  }
  
  private static class k extends AsyncTask<Void, Void, Boolean> {
    private WeakReference<a> a;
    
    private String b;
    
    private int c;
    
    k(a param1a, String param1String, int param1Int) {
      this.a = new WeakReference<a>(param1a);
      this.b = param1String;
      this.c = param1Int;
    }
    
    protected Boolean a(Void... param1VarArgs) {
      a a = this.a.get();
      if (a != null) {
        boolean bool = com.allinone.callerid.util.recorder.b.e();
        boolean bool1 = true;
        if (!bool || !com.allinone.callerid.i.a.u.a.a()) {
          a.o(a, false);
        } else if (com.allinone.callerid.util.recorder.f.n(this.b, this.c)) {
          a.o(a, false);
        } else {
          q.b().c("recorder_floatingball_show");
          a.o(a, true);
          return Boolean.valueOf(bool1);
        } 
        bool1 = false;
        return Boolean.valueOf(bool1);
      } 
      return Boolean.FALSE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      a a = this.a.get();
      if (a != null)
        if (param1Boolean.booleanValue()) {
          a.r(a).setVisibility(0);
        } else {
          a.r(a).setVisibility(8);
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */