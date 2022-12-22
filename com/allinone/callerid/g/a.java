package com.allinone.callerid.g;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.g;
import com.allinone.callerid.bean.CommentContent;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.y;
import java.util.ArrayList;
import java.util.List;

public class a extends Fragment implements View.OnClickListener {
  private CallLogBean c0;
  
  private Context d0;
  
  private UnknownContactActivity e0;
  
  private RelativeLayout f0;
  
  private g g0;
  
  private List<CommentContent> h0 = new ArrayList<CommentContent>();
  
  private String i0;
  
  private String j0;
  
  private int k0 = 1;
  
  private int l0;
  
  private y m0;
  
  private ViewStub n0;
  
  private PopupWindow o0;
  
  private View p0;
  
  private String q0;
  
  private e r0;
  
  private ProgressBar s0;
  
  private ProgressBar t0;
  
  private boolean u0 = true;
  
  private void r2(Context paramContext, String paramString1, String paramString2, int paramInt) {
    if (i1.a(paramContext) && paramString1 != null && !"".equals(paramString1)) {
      com.allinone.callerid.i.a.i.e.a(paramString1, paramString2, paramInt, new d(this, paramString2));
    } else {
      this.s0.setVisibility(8);
      this.t0.setVisibility(8);
      List<CommentContent> list = this.h0;
      if (list != null && list.size() == 0)
        w2(); 
    } 
  }
  
  private void s2(Context paramContext, int paramInt, String paramString1, String paramString2) {
    y y1;
    if (i1.a(paramContext)) {
      y1 = new y(paramContext, "android", paramString1, i1.f(paramString2));
      this.m0 = y1;
      y1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    } else {
      Toast.makeText(y1.getApplicationContext(), 2131755688, 0).show();
    } 
  }
  
  private void t2() {
    CallLogBean callLogBean = this.c0;
    if (callLogBean != null)
      this.q0 = callLogBean.p(); 
    this.e0.getWindow().getDecorView().post(new c(this));
  }
  
  private void u2(View paramView) {
    Typeface typeface = g1.b();
    this.n0 = (ViewStub)paramView.findViewById(2131298270);
    this.f0 = (RelativeLayout)paramView.findViewById(2131297487);
    TextView textView = (TextView)paramView.findViewById(2131297857);
    RecyclerView recyclerView = (RecyclerView)paramView.findViewById(2131297451);
    NestedScrollView nestedScrollView = (NestedScrollView)paramView.findViewById(2131297308);
    this.s0 = (ProgressBar)paramView.findViewById(2131297374);
    this.t0 = (ProgressBar)paramView.findViewById(2131297379);
    this.f0.setVisibility(8);
    textView.setTypeface(typeface);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d0, 1, false);
    linearLayoutManager.B2(true);
    linearLayoutManager.z1(true);
    recyclerView.setHasFixedSize(true);
    recyclerView.setNestedScrollingEnabled(false);
    recyclerView.setLayoutManager((RecyclerView.o)linearLayoutManager);
    recyclerView.setItemAnimator((RecyclerView.l)new androidx.recyclerview.widget.c());
    g g1 = new g((Activity)this.e0, this.h0);
    this.g0 = g1;
    recyclerView.setAdapter((RecyclerView.Adapter)g1);
    this.g0.C(new a(this));
    nestedScrollView.setOnScrollChangeListener(new b(this));
  }
  
  private void v2() {
    CallLogBean callLogBean = this.c0;
    if (callLogBean != null) {
      this.i0 = callLogBean.J();
      String str = this.c0.I();
      this.j0 = str;
      this.k0 = 1;
      r2(this.d0, this.i0, str, 1);
    } 
  }
  
  private void w2() {
    try {
      ((TextView)((RelativeLayout)this.n0.inflate()).findViewById(2131297998)).setTypeface(g1.b());
    } catch (Exception exception) {
      this.n0.setVisibility(0);
    } 
  }
  
  public void I0() {
    super.I0();
  }
  
  public void N0() {
    super.N0();
  }
  
  public void R0(View paramView, Bundle paramBundle) {
    super.R0(paramView, paramBundle);
    if (m() != null)
      this.c0 = (CallLogBean)m().getIntent().getParcelableExtra("contact_tony"); 
    t2();
  }
  
  public void onClick(View paramView) {
    paramView.getId();
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.d0 = paramContext;
    this.e0 = (UnknownContactActivity)paramContext;
    this.r0 = new e(this);
    b.p.a.a.b(paramContext).c(this.r0, new IntentFilter("com.allinone.callerid.UPDATE_COMMENT"));
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
    if (this.p0 == null) {
      this.p0 = View.inflate((Context)m(), 2131493037, null);
      if (i1.f0(t()).booleanValue() && Build.VERSION.SDK_INT >= 17 && m() != null && m().getWindow() != null)
        m().getWindow().getDecorView().setLayoutDirection(1); 
      u2(this.p0);
    } 
    return this.p0;
  }
  
  public void x0() {
    super.x0();
    try {
      if (this.r0 != null)
        b.p.a.a.b(this.d0).e(this.r0); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements g.b {
    a(a this$0) {}
    
    public void a(View param1View, int param1Int) {
      View view = LayoutInflater.from(a.Q1(this.a)).inflate(2131493144, null);
      TextView textView = (TextView)view.findViewById(2131297854);
      FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296721);
      textView.setTypeface(g1.b());
      frameLayout.setOnClickListener(new a(this, param1Int));
      a.g2(this.a, new PopupWindow(view));
      param1Int = a.i2(this.a).getWindowManager().getDefaultDisplay().getWidth();
      a.f2(this.a).setWidth(param1Int / 4);
      a.f2(this.a).setHeight(-2);
      a.f2(this.a).setFocusable(true);
      if (i1.f0(a.Q1(this.a)).booleanValue()) {
        a.f2(this.a).setAnimationStyle(2131821306);
      } else {
        a.f2(this.a).setAnimationStyle(2131821305);
      } 
      ColorDrawable colorDrawable = new ColorDrawable(0);
      a.f2(this.a).setBackgroundDrawable((Drawable)colorDrawable);
      int[] arrayOfInt = new int[2];
      param1View.getLocationOnScreen(arrayOfInt);
      a.f2(this.a).showAtLocation(param1View, 0, arrayOfInt[0], arrayOfInt[1] - a.f2(this.a).getHeight());
    }
    
    class a implements View.OnClickListener {
      a(a.a this$0, int param2Int) {}
      
      public void onClick(View param2View) {
        q.b().c("comment_report_click");
        a a1 = this.c.a;
        a.d2(a1, a.Q1(a1), this.b, ((CommentContent)a.R1(this.c.a).get(this.b)).getCid(), ((CommentContent)a.R1(this.c.a).get(this.b)).getT_p());
        if (a.f2(this.c.a) != null && a.f2(this.c.a).isShowing())
          a.f2(this.c.a).dismiss(); 
        if (a.h2(this.c.a) != null) {
          a.h2(this.c.a).a(new a(this));
        } else {
          Toast.makeText(a.Q1(this.c.a), 2131755418, 0).show();
        } 
      }
      
      class a implements y.a {
        a(a.a.a this$0) {}
        
        public void a(int param3Int) {
          CommentContent commentContent = a.R1(this.a.c.a).get(this.a.b);
          if (1 == param3Int) {
            q.b().c(h1.v);
            Toast.makeText(a.Q1(this.a.c.a), 2131755418, 0).show();
          } else if (-30 == param3Int) {
            Toast.makeText(a.Q1(this.a.c.a), 2131755422, 0).show();
          } else {
            Toast.makeText(a.Q1(this.a.c.a), 2131755654, 0).show();
          } 
        }
      }
    }
    
    class a implements y.a {
      a(a.a this$0) {}
      
      public void a(int param2Int) {
        CommentContent commentContent = a.R1(this.a.c.a).get(this.a.b);
        if (1 == param2Int) {
          q.b().c(h1.v);
          Toast.makeText(a.Q1(this.a.c.a), 2131755418, 0).show();
        } else if (-30 == param2Int) {
          Toast.makeText(a.Q1(this.a.c.a), 2131755422, 0).show();
        } else {
          Toast.makeText(a.Q1(this.a.c.a), 2131755654, 0).show();
        } 
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(a this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      q.b().c("comment_report_click");
      a a1 = this.c.a;
      a.d2(a1, a.Q1(a1), this.b, ((CommentContent)a.R1(this.c.a).get(this.b)).getCid(), ((CommentContent)a.R1(this.c.a).get(this.b)).getT_p());
      if (a.f2(this.c.a) != null && a.f2(this.c.a).isShowing())
        a.f2(this.c.a).dismiss(); 
      if (a.h2(this.c.a) != null) {
        a.h2(this.c.a).a(new a(this));
      } else {
        Toast.makeText(a.Q1(this.c.a), 2131755418, 0).show();
      } 
    }
    
    class a implements y.a {
      a(a.a.a this$0) {}
      
      public void a(int param3Int) {
        CommentContent commentContent = a.R1(this.a.c.a).get(this.a.b);
        if (1 == param3Int) {
          q.b().c(h1.v);
          Toast.makeText(a.Q1(this.a.c.a), 2131755418, 0).show();
        } else if (-30 == param3Int) {
          Toast.makeText(a.Q1(this.a.c.a), 2131755422, 0).show();
        } else {
          Toast.makeText(a.Q1(this.a.c.a), 2131755654, 0).show();
        } 
      }
    }
  }
  
  class a implements y.a {
    a(a this$0) {}
    
    public void a(int param1Int) {
      CommentContent commentContent = a.R1(this.a.c.a).get(this.a.b);
      if (1 == param1Int) {
        q.b().c(h1.v);
        Toast.makeText(a.Q1(this.a.c.a), 2131755418, 0).show();
      } else if (-30 == param1Int) {
        Toast.makeText(a.Q1(this.a.c.a), 2131755422, 0).show();
      } else {
        Toast.makeText(a.Q1(this.a.c.a), 2131755654, 0).show();
      } 
    }
  }
  
  class b implements NestedScrollView.b {
    b(a this$0) {}
    
    public void a(NestedScrollView param1NestedScrollView, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (param1Int2 == param1NestedScrollView.getChildAt(0).getMeasuredHeight() - param1NestedScrollView.getMeasuredHeight() + j.a(a.Q1(this.a), 9.0F)) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("pageCount:");
          stringBuilder.append(a.k2(this.a));
          d0.a("comment", stringBuilder.toString());
        } 
        if (a.R1(this.a).size() < a.k2(this.a) && a.m2(this.a)) {
          a.o2(this.a).setVisibility(0);
          a a1 = this.a;
          a.V1(a1, a.Q1(a1), a.p2(this.a), a.S1(this.a), a.T1(this.a));
          a.n2(this.a, false);
        } 
      } 
    }
  }
  
  class c implements Runnable {
    c(a this$0) {}
    
    public void run() {
      a.W1(this.b).setVisibility(0);
      com.allinone.callerid.i.a.i.a.a(a.X1(this.b), new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.i.b {
      a(a.c this$0) {}
      
      public void a(List<CommentContent> param2List) {
        if (param2List != null && param2List.size() > 0) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("contentList:");
            stringBuilder.append(param2List.toString());
            d0.a("comment", stringBuilder.toString());
          } 
          a.R1(this.a.b).clear();
          a.R1(this.a.b).addAll(param2List);
          if (a.R1(this.a.b) != null && a.R1(this.a.b).size() > 0) {
            a.Y1(this.a.b).i();
            a.Z1(this.a.b).setVisibility(8);
            a.W1(this.a.b).setVisibility(8);
            a.a2(this.a.b).setVisibility(0);
          } 
        } else if (a.b2(this.a.b) == null || a.b2(this.a.b).e() == null || "".equals(a.b2(this.a.b).e())) {
          a.W1(this.a.b).setVisibility(8);
          a.c2(this.a.b);
        } 
        a.e2(this.a.b);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.i.b {
    a(a this$0) {}
    
    public void a(List<CommentContent> param1List) {
      if (param1List != null && param1List.size() > 0) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("contentList:");
          stringBuilder.append(param1List.toString());
          d0.a("comment", stringBuilder.toString());
        } 
        a.R1(this.a.b).clear();
        a.R1(this.a.b).addAll(param1List);
        if (a.R1(this.a.b) != null && a.R1(this.a.b).size() > 0) {
          a.Y1(this.a.b).i();
          a.Z1(this.a.b).setVisibility(8);
          a.W1(this.a.b).setVisibility(8);
          a.a2(this.a.b).setVisibility(0);
        } 
      } else if (a.b2(this.a.b) == null || a.b2(this.a.b).e() == null || "".equals(a.b2(this.a.b).e())) {
        a.W1(this.a.b).setVisibility(8);
        a.c2(this.a.b);
      } 
      a.e2(this.a.b);
    }
  }
  
  class d implements com.allinone.callerid.i.a.i.d {
    d(a this$0, String param1String) {}
    
    public void a(String param1String) {
      // Byte code:
      //   0: aload_1
      //   1: ifnull -> 636
      //   4: ldc ''
      //   6: aload_1
      //   7: invokevirtual equals : (Ljava/lang/Object;)Z
      //   10: ifne -> 636
      //   13: new org/json/JSONObject
      //   16: astore_2
      //   17: aload_2
      //   18: aload_1
      //   19: invokespecial <init> : (Ljava/lang/String;)V
      //   22: aload_2
      //   23: ldc 'status'
      //   25: invokevirtual getInt : (Ljava/lang/String;)I
      //   28: iconst_1
      //   29: if_icmpne -> 577
      //   32: aload_0
      //   33: getfield b : Lcom/allinone/callerid/g/a;
      //   36: aload_2
      //   37: ldc 'comments_count'
      //   39: invokevirtual getInt : (Ljava/lang/String;)I
      //   42: invokestatic l2 : (Lcom/allinone/callerid/g/a;I)I
      //   45: pop
      //   46: aload_2
      //   47: ldc 'soft_comments'
      //   49: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
      //   52: astore_1
      //   53: aload_1
      //   54: ifnull -> 518
      //   57: aload_1
      //   58: invokevirtual length : ()I
      //   61: ifeq -> 518
      //   64: iconst_0
      //   65: istore_3
      //   66: iload_3
      //   67: aload_1
      //   68: invokevirtual length : ()I
      //   71: if_icmpge -> 247
      //   74: aload_1
      //   75: iload_3
      //   76: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
      //   79: astore_2
      //   80: new com/allinone/callerid/bean/CommentContent
      //   83: astore #4
      //   85: aload #4
      //   87: invokespecial <init> : ()V
      //   90: aload #4
      //   92: aload_0
      //   93: getfield a : Ljava/lang/String;
      //   96: invokevirtual setT_p : (Ljava/lang/String;)V
      //   99: aload #4
      //   101: aload_2
      //   102: ldc 'id'
      //   104: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
      //   107: invokevirtual setCid : (Ljava/lang/String;)V
      //   110: aload #4
      //   112: aload_2
      //   113: ldc 'tel_number'
      //   115: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   118: invokevirtual setTel_number : (Ljava/lang/String;)V
      //   121: aload #4
      //   123: aload_2
      //   124: ldc 'author'
      //   126: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   129: invokevirtual setAuthor : (Ljava/lang/String;)V
      //   132: aload #4
      //   134: aload_2
      //   135: ldc 'create_time'
      //   137: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   140: invokevirtual setCreate_time : (Ljava/lang/String;)V
      //   143: aload #4
      //   145: aload_2
      //   146: ldc 'content'
      //   148: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   151: invokevirtual setContent : (Ljava/lang/String;)V
      //   154: aload #4
      //   156: aload_2
      //   157: ldc 'audit'
      //   159: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   162: invokevirtual setAudit : (Ljava/lang/String;)V
      //   165: aload #4
      //   167: aload_2
      //   168: ldc 'inform'
      //   170: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   173: invokevirtual setInform : (Ljava/lang/String;)V
      //   176: aload #4
      //   178: aload_0
      //   179: getfield b : Lcom/allinone/callerid/g/a;
      //   182: invokestatic Q1 : (Lcom/allinone/callerid/g/a;)Landroid/content/Context;
      //   185: aload_2
      //   186: ldc 'type_label'
      //   188: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   191: invokestatic D : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   194: invokevirtual setType_label : (Ljava/lang/String;)V
      //   197: ldc ''
      //   199: aload #4
      //   201: invokevirtual getContent : ()Ljava/lang/String;
      //   204: invokevirtual equals : (Ljava/lang/Object;)Z
      //   207: ifeq -> 226
      //   210: ldc ''
      //   212: aload #4
      //   214: invokevirtual getType_label : ()Ljava/lang/String;
      //   217: invokevirtual equals : (Ljava/lang/Object;)Z
      //   220: ifeq -> 226
      //   223: goto -> 241
      //   226: aload_0
      //   227: getfield b : Lcom/allinone/callerid/g/a;
      //   230: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   233: aload #4
      //   235: invokeinterface add : (Ljava/lang/Object;)Z
      //   240: pop
      //   241: iinc #3, 1
      //   244: goto -> 66
      //   247: aload_0
      //   248: getfield b : Lcom/allinone/callerid/g/a;
      //   251: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   254: ifnull -> 384
      //   257: aload_0
      //   258: getfield b : Lcom/allinone/callerid/g/a;
      //   261: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   264: invokeinterface size : ()I
      //   269: ifeq -> 384
      //   272: iconst_0
      //   273: istore_3
      //   274: iload_3
      //   275: aload_0
      //   276: getfield b : Lcom/allinone/callerid/g/a;
      //   279: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   282: invokeinterface size : ()I
      //   287: if_icmpge -> 384
      //   290: aload_0
      //   291: getfield b : Lcom/allinone/callerid/g/a;
      //   294: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   297: invokeinterface size : ()I
      //   302: iconst_1
      //   303: isub
      //   304: istore #5
      //   306: iload #5
      //   308: iload_3
      //   309: if_icmple -> 378
      //   312: aload_0
      //   313: getfield b : Lcom/allinone/callerid/g/a;
      //   316: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   319: iload_3
      //   320: invokeinterface get : (I)Ljava/lang/Object;
      //   325: checkcast com/allinone/callerid/bean/CommentContent
      //   328: invokevirtual getCreate_time : ()Ljava/lang/String;
      //   331: aload_0
      //   332: getfield b : Lcom/allinone/callerid/g/a;
      //   335: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   338: iload #5
      //   340: invokeinterface get : (I)Ljava/lang/Object;
      //   345: checkcast com/allinone/callerid/bean/CommentContent
      //   348: invokevirtual getCreate_time : ()Ljava/lang/String;
      //   351: invokevirtual equals : (Ljava/lang/Object;)Z
      //   354: ifeq -> 372
      //   357: aload_0
      //   358: getfield b : Lcom/allinone/callerid/g/a;
      //   361: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   364: iload #5
      //   366: invokeinterface remove : (I)Ljava/lang/Object;
      //   371: pop
      //   372: iinc #5, -1
      //   375: goto -> 306
      //   378: iinc #3, 1
      //   381: goto -> 274
      //   384: aload_0
      //   385: getfield b : Lcom/allinone/callerid/g/a;
      //   388: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   391: ifnull -> 483
      //   394: aload_0
      //   395: getfield b : Lcom/allinone/callerid/g/a;
      //   398: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   401: invokeinterface size : ()I
      //   406: ifle -> 483
      //   409: aload_0
      //   410: getfield b : Lcom/allinone/callerid/g/a;
      //   413: invokestatic Y1 : (Lcom/allinone/callerid/g/a;)Lcom/allinone/callerid/b/g;
      //   416: invokevirtual i : ()V
      //   419: aload_0
      //   420: getfield b : Lcom/allinone/callerid/g/a;
      //   423: invokestatic W1 : (Lcom/allinone/callerid/g/a;)Landroid/widget/ProgressBar;
      //   426: bipush #8
      //   428: invokevirtual setVisibility : (I)V
      //   431: aload_0
      //   432: getfield b : Lcom/allinone/callerid/g/a;
      //   435: invokestatic o2 : (Lcom/allinone/callerid/g/a;)Landroid/widget/ProgressBar;
      //   438: bipush #8
      //   440: invokevirtual setVisibility : (I)V
      //   443: aload_0
      //   444: getfield b : Lcom/allinone/callerid/g/a;
      //   447: invokestatic Z1 : (Lcom/allinone/callerid/g/a;)Landroid/view/ViewStub;
      //   450: bipush #8
      //   452: invokevirtual setVisibility : (I)V
      //   455: aload_0
      //   456: getfield b : Lcom/allinone/callerid/g/a;
      //   459: invokestatic a2 : (Lcom/allinone/callerid/g/a;)Landroid/widget/RelativeLayout;
      //   462: iconst_0
      //   463: invokevirtual setVisibility : (I)V
      //   466: aload_1
      //   467: invokevirtual length : ()I
      //   470: bipush #10
      //   472: if_icmplt -> 483
      //   475: aload_0
      //   476: getfield b : Lcom/allinone/callerid/g/a;
      //   479: invokestatic U1 : (Lcom/allinone/callerid/g/a;)I
      //   482: pop
      //   483: aload_0
      //   484: getfield b : Lcom/allinone/callerid/g/a;
      //   487: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   490: invokeinterface size : ()I
      //   495: pop
      //   496: aload_1
      //   497: invokevirtual length : ()I
      //   500: bipush #10
      //   502: if_icmpge -> 739
      //   505: aload_0
      //   506: getfield b : Lcom/allinone/callerid/g/a;
      //   509: invokestatic Y1 : (Lcom/allinone/callerid/g/a;)Lcom/allinone/callerid/b/g;
      //   512: invokevirtual i : ()V
      //   515: goto -> 739
      //   518: aload_0
      //   519: getfield b : Lcom/allinone/callerid/g/a;
      //   522: invokestatic W1 : (Lcom/allinone/callerid/g/a;)Landroid/widget/ProgressBar;
      //   525: bipush #8
      //   527: invokevirtual setVisibility : (I)V
      //   530: aload_0
      //   531: getfield b : Lcom/allinone/callerid/g/a;
      //   534: invokestatic o2 : (Lcom/allinone/callerid/g/a;)Landroid/widget/ProgressBar;
      //   537: bipush #8
      //   539: invokevirtual setVisibility : (I)V
      //   542: aload_0
      //   543: getfield b : Lcom/allinone/callerid/g/a;
      //   546: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   549: ifnull -> 739
      //   552: aload_0
      //   553: getfield b : Lcom/allinone/callerid/g/a;
      //   556: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   559: invokeinterface size : ()I
      //   564: ifne -> 739
      //   567: aload_0
      //   568: getfield b : Lcom/allinone/callerid/g/a;
      //   571: invokestatic c2 : (Lcom/allinone/callerid/g/a;)V
      //   574: goto -> 739
      //   577: aload_0
      //   578: getfield b : Lcom/allinone/callerid/g/a;
      //   581: invokestatic W1 : (Lcom/allinone/callerid/g/a;)Landroid/widget/ProgressBar;
      //   584: bipush #8
      //   586: invokevirtual setVisibility : (I)V
      //   589: aload_0
      //   590: getfield b : Lcom/allinone/callerid/g/a;
      //   593: invokestatic o2 : (Lcom/allinone/callerid/g/a;)Landroid/widget/ProgressBar;
      //   596: bipush #8
      //   598: invokevirtual setVisibility : (I)V
      //   601: aload_0
      //   602: getfield b : Lcom/allinone/callerid/g/a;
      //   605: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   608: ifnull -> 739
      //   611: aload_0
      //   612: getfield b : Lcom/allinone/callerid/g/a;
      //   615: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   618: invokeinterface size : ()I
      //   623: ifne -> 739
      //   626: aload_0
      //   627: getfield b : Lcom/allinone/callerid/g/a;
      //   630: invokestatic c2 : (Lcom/allinone/callerid/g/a;)V
      //   633: goto -> 739
      //   636: aload_0
      //   637: getfield b : Lcom/allinone/callerid/g/a;
      //   640: invokestatic W1 : (Lcom/allinone/callerid/g/a;)Landroid/widget/ProgressBar;
      //   643: bipush #8
      //   645: invokevirtual setVisibility : (I)V
      //   648: aload_0
      //   649: getfield b : Lcom/allinone/callerid/g/a;
      //   652: invokestatic o2 : (Lcom/allinone/callerid/g/a;)Landroid/widget/ProgressBar;
      //   655: bipush #8
      //   657: invokevirtual setVisibility : (I)V
      //   660: aload_0
      //   661: getfield b : Lcom/allinone/callerid/g/a;
      //   664: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   667: ifnull -> 739
      //   670: aload_0
      //   671: getfield b : Lcom/allinone/callerid/g/a;
      //   674: invokestatic R1 : (Lcom/allinone/callerid/g/a;)Ljava/util/List;
      //   677: invokeinterface size : ()I
      //   682: ifne -> 739
      //   685: aload_0
      //   686: getfield b : Lcom/allinone/callerid/g/a;
      //   689: invokestatic c2 : (Lcom/allinone/callerid/g/a;)V
      //   692: goto -> 739
      //   695: astore_2
      //   696: aload_2
      //   697: invokevirtual printStackTrace : ()V
      //   700: getstatic com/allinone/callerid/util/d0.a : Z
      //   703: ifeq -> 739
      //   706: new java/lang/StringBuilder
      //   709: dup
      //   710: invokespecial <init> : ()V
      //   713: astore_1
      //   714: aload_1
      //   715: ldc '出错啦=='
      //   717: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   720: pop
      //   721: aload_1
      //   722: aload_2
      //   723: invokevirtual getMessage : ()Ljava/lang/String;
      //   726: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   729: pop
      //   730: ldc 'comment'
      //   732: aload_1
      //   733: invokevirtual toString : ()Ljava/lang/String;
      //   736: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   739: return
      // Exception table:
      //   from	to	target	type
      //   4	53	695	java/lang/Exception
      //   57	64	695	java/lang/Exception
      //   66	223	695	java/lang/Exception
      //   226	241	695	java/lang/Exception
      //   247	272	695	java/lang/Exception
      //   274	306	695	java/lang/Exception
      //   312	372	695	java/lang/Exception
      //   384	483	695	java/lang/Exception
      //   483	515	695	java/lang/Exception
      //   518	574	695	java/lang/Exception
      //   577	633	695	java/lang/Exception
      //   636	692	695	java/lang/Exception
    }
  }
  
  class e extends BroadcastReceiver {
    e(a this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      com.allinone.callerid.i.a.i.a.a(a.X1(this.a), new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.i.b {
      a(a.e this$0) {}
      
      public void a(List<CommentContent> param2List) {
        if (param2List != null && param2List.size() > 0) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("contentList:");
            stringBuilder.append(param2List.toString());
            d0.a("comment", stringBuilder.toString());
          } 
          a.R1(this.a.a).clear();
          a.R1(this.a.a).addAll(param2List);
          if (a.R1(this.a.a) != null && a.R1(this.a.a).size() > 0) {
            a.Y1(this.a.a).i();
            a.Z1(this.a.a).setVisibility(8);
            a.a2(this.a.a).setVisibility(0);
          } 
        } 
        a.e2(this.a.a);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.i.b {
    a(a this$0) {}
    
    public void a(List<CommentContent> param1List) {
      if (param1List != null && param1List.size() > 0) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("contentList:");
          stringBuilder.append(param1List.toString());
          d0.a("comment", stringBuilder.toString());
        } 
        a.R1(this.a.a).clear();
        a.R1(this.a.a).addAll(param1List);
        if (a.R1(this.a.a) != null && a.R1(this.a.a).size() > 0) {
          a.Y1(this.a.a).i();
          a.Z1(this.a.a).setVisibility(8);
          a.a2(this.a.a).setVisibility(0);
        } 
      } 
      a.e2(this.a.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */