package com.allinone.callerid.mvc.controller;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.b.s;
import com.allinone.callerid.bean.QuickContactBean;
import com.allinone.callerid.customview.DeletableEditText;
import com.allinone.callerid.customview.SortToken;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.n;
import com.allinone.callerid.util.u;
import com.allinone.callerid.util.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class QuickContactActivity extends BaseActivity implements View.OnClickListener {
  private s A;
  
  public List<CallLogBean> B = new ArrayList<CallLogBean>();
  
  private Typeface C;
  
  String D = "[\\u4E00-\\u9FA5]+";
  
  public Handler E = new i(this, null);
  
  private int F;
  
  private final String s = "QuickContactActivity";
  
  private LinearLayout t;
  
  private ListView u;
  
  private RelativeLayout v;
  
  private LinearLayout w;
  
  private n x;
  
  private ArrayList<QuickContactBean> y;
  
  private ArrayList<QuickContactBean> z = new ArrayList<QuickContactBean>();
  
  private void i0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493205, null);
    DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
    DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
    deletableEditText1.setHint(2131755120);
    deletableEditText2.setHint(2131755123);
    deletableEditText1.setTypeface(this.C);
    deletableEditText2.setTypeface(this.C);
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)this)).setView(view).setMessage(getResources().getString(2131755077)).setPositiveButton(getResources().getString(2131755681), new f(this, deletableEditText2, deletableEditText1)).setNegativeButton(getResources().getString(2131755180), new e(this)).create();
    alertDialog.show();
    alertDialog.getButton(-1).setTextColor(this.F);
    alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
  }
  
  private void j0(String paramString) {
    (j0.a()).b.execute(new d(this, paramString));
  }
  
  private String k0(String paramString) {
    String str1 = "#";
    if (paramString == null)
      return "#"; 
    String str2 = ((v.a)v.c().b(paramString).get(0)).c.substring(0, 1).toUpperCase(Locale.CHINESE);
    paramString = str1;
    if (str2.matches("[A-Z]"))
      paramString = str2.toUpperCase(Locale.CHINESE); 
    return paramString;
  }
  
  private String l0(String paramString) {
    if (paramString == null || "".equals(paramString.trim()))
      return null; 
    paramString = ((v.a)v.c().b(paramString).get(0)).c.trim().substring(0, 1).toUpperCase(Locale.CHINESE);
    if (paramString.matches("[A-Z]")) {
      paramString = paramString.toUpperCase(Locale.CHINESE);
    } else {
      paramString = "#";
    } 
    return paramString;
  }
  
  private void m0() {
    ImageView imageView1 = (ImageView)findViewById(2131297111);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView1.setImageResource(2131231059); 
    ImageView imageView2 = (ImageView)findViewById(2131297109);
    this.t = (LinearLayout)findViewById(2131297174);
    TextView textView1 = (TextView)findViewById(2131297922);
    TextView textView2 = (TextView)findViewById(2131297887);
    TextView textView3 = (TextView)findViewById(2131297888);
    this.u = (ListView)findViewById(2131297237);
    this.v = (RelativeLayout)findViewById(2131297518);
    TextView textView4 = (TextView)findViewById(2131297999);
    ImageView imageView3 = (ImageView)findViewById(2131296975);
    ImageView imageView4 = (ImageView)findViewById(2131296976);
    ImageView imageView5 = (ImageView)findViewById(2131296977);
    ImageView imageView6 = (ImageView)findViewById(2131296978);
    this.w = (LinearLayout)findViewById(2131297153);
    RelativeLayout relativeLayout1 = (RelativeLayout)findViewById(2131297493);
    RelativeLayout relativeLayout2 = (RelativeLayout)findViewById(2131297494);
    RelativeLayout relativeLayout3 = (RelativeLayout)findViewById(2131297495);
    RelativeLayout relativeLayout4 = (RelativeLayout)findViewById(2131297496);
    this.w.setVisibility(8);
    relativeLayout1.setVisibility(4);
    relativeLayout2.setVisibility(4);
    relativeLayout3.setVisibility(4);
    relativeLayout4.setVisibility(4);
    Typeface typeface = g1.b();
    this.C = typeface;
    textView2.setTypeface(typeface);
    textView3.setTypeface(this.C);
    textView1.setTypeface(this.C);
    textView4.setTypeface(this.C);
    if (b1.P()) {
      this.t.setVisibility(0);
    } else {
      this.t.setVisibility(8);
    } 
    imageView1.setOnClickListener(this);
    imageView2.setOnClickListener(this);
    textView1.setOnClickListener(this);
    imageView3.setOnClickListener(this);
    imageView4.setOnClickListener(this);
    imageView5.setOnClickListener(this);
    imageView6.setOnClickListener(this);
  }
  
  private void n0(String paramString) {
    ArrayList<QuickContactBean> arrayList = this.y;
    if (arrayList != null && arrayList.size() > 0) {
      for (byte b = 0; b < this.y.size(); b++) {
        QuickContactBean quickContactBean = this.y.get(b);
        if (paramString.equals(quickContactBean.getBean().p()))
          quickContactBean.setIsquick(Boolean.valueOf(quickContactBean.getIsquick().booleanValue() ^ true)); 
      } 
      this.z.clear();
      this.z.addAll(this.y);
      this.A.b(this.z);
    } 
  }
  
  private void o0() {
    (j0.a()).b.execute(new h(this));
  }
  
  private void p0() {
    (j0.a()).b.execute(new b(this));
  }
  
  private void r0(String paramString1, String paramString2) {
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("name=");
      stringBuilder.append(paramString1);
      stringBuilder.append("----number=");
      stringBuilder.append(paramString2);
      d0.a("quickcontact", stringBuilder.toString());
    } 
    if (!"".equals(paramString2))
      (j0.a()).b.execute(new g(this, paramString2, paramString1)); 
  }
  
  private void s0() {
    Intent intent = new Intent("com.allinone.callerid.SET_SHORTCUT");
    b.p.a.a.b(getApplicationContext()).d(intent);
  }
  
  private void t0() {
    if (this.B.size() > 0) {
      this.w.setVisibility(0);
      int[] arrayOfInt1 = new int[4];
      arrayOfInt1[0] = 2131297984;
      arrayOfInt1[1] = 2131297986;
      arrayOfInt1[2] = 2131297987;
      arrayOfInt1[3] = 2131297988;
      int[] arrayOfInt2 = new int[4];
      arrayOfInt2[0] = 2131297493;
      arrayOfInt2[1] = 2131297494;
      arrayOfInt2[2] = 2131297495;
      arrayOfInt2[3] = 2131297496;
      byte b;
      for (b = 0; b < 4; b++)
        ((RelativeLayout)findViewById(arrayOfInt2[b])).setVisibility(4); 
      for (b = 0; b < this.B.size(); b++) {
        if (b < 4) {
          (new int[4])[0] = 2131296941;
          (new int[4])[1] = 2131296942;
          (new int[4])[2] = 2131296943;
          (new int[4])[3] = 2131296944;
          ImageView imageView = (ImageView)findViewById((new int[4])[b]);
          CallLogBean callLogBean = this.B.get(b);
          int i = callLogBean.v();
          if (i != 0) {
            u.c((Activity)this, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, i), "", 2131231148, imageView);
          } else {
            imageView.setImageResource(2131231191);
          } 
          String str2 = callLogBean.n();
          String str1 = str2;
          if ("".equals(str2))
            str1 = callLogBean.p(); 
          ((TextView)findViewById(arrayOfInt1[b])).setText(str1);
          ((TextView)findViewById(arrayOfInt1[b])).setTypeface(this.C);
          (new int[4])[0] = 2131296975;
          (new int[4])[1] = 2131296976;
          (new int[4])[2] = 2131296977;
          (new int[4])[3] = 2131296978;
          ((ImageView)findViewById((new int[4])[b])).setVisibility(0);
          ((RelativeLayout)findViewById(arrayOfInt2[b])).setVisibility(0);
        } 
      } 
    } else {
      this.w.setVisibility(8);
    } 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131297109) {
      if (i != 2131297111) {
        if (i != 2131297922) {
          switch (i) {
            default:
              return;
            case 2131296978:
              try {
                j0(((CallLogBean)this.B.get(3)).p());
                n0(((CallLogBean)this.B.get(3)).p());
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            case 2131296977:
              try {
                j0(((CallLogBean)this.B.get(2)).p());
                n0(((CallLogBean)this.B.get(2)).p());
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            case 2131296976:
              try {
                j0(((CallLogBean)this.B.get(1)).p());
                n0(((CallLogBean)this.B.get(1)).p());
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            case 2131296975:
              break;
          } 
          try {
            j0(((CallLogBean)this.B.get(0)).p());
            n0(((CallLogBean)this.B.get(0)).p());
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } 
        Animation animation = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771995);
        animation.setAnimationListener(new c(this));
        this.t.startAnimation(animation);
      } 
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
    i0();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492945);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    getWindow().getDecorView().post(new a(this));
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
  
  public SortToken q0(String paramString) {
    SortToken sortToken = new SortToken();
    if (paramString != null && paramString.length() > 0)
      for (String str : paramString.replace(" ", "").split(this.D)) {
        if (str.length() > 0) {
          StringBuilder stringBuilder = new StringBuilder(sortToken.b);
          stringBuilder.append(str.charAt(0));
          sortToken.b = String.valueOf(stringBuilder);
          stringBuilder = new StringBuilder(sortToken.c);
          stringBuilder.append(str);
          sortToken.c = String.valueOf(stringBuilder);
        } 
      }  
    return sortToken;
  }
  
  class a implements Runnable {
    a(QuickContactActivity this$0) {}
    
    public void run() {
      QuickContactActivity quickContactActivity1 = this.b;
      QuickContactActivity.Z(quickContactActivity1, new n(quickContactActivity1.getApplicationContext()));
      quickContactActivity1 = this.b;
      QuickContactActivity.a0(quickContactActivity1, d1.a((Context)quickContactActivity1, 2130968859, 2131099706));
      QuickContactActivity.b0(this.b);
      if (com.allinone.callerid.util.k1.a.c(this.b.getApplicationContext()))
        QuickContactActivity.c0(this.b); 
      QuickContactActivity.d0(this.b);
      QuickContactActivity quickContactActivity2 = this.b;
      quickContactActivity1 = this.b;
      QuickContactActivity.f0(quickContactActivity2, new s((Activity)quickContactActivity1, QuickContactActivity.g0(quickContactActivity1), QuickContactActivity.h0(this.b)));
      QuickContactActivity.h0(this.b).setAdapter((ListAdapter)QuickContactActivity.e0(this.b));
      QuickContactActivity.h0(this.b).setOnItemClickListener(new a(this));
    }
    
    class a implements AdapterView.OnItemClickListener {
      a(QuickContactActivity.a this$0) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        QuickContactActivity quickContactActivity;
        QuickContactBean quickContactBean = (QuickContactBean)QuickContactActivity.e0(this.b.b).getItem(param2Int);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("bean:");
          stringBuilder.append(quickContactBean.toString());
          d0.a("quick", stringBuilder.toString());
        } 
        if (quickContactBean.getIsquick() == null) {
          List<CallLogBean> list = this.b.b.B;
          if (list != null)
            if (list.size() >= 4) {
              quickContactActivity = this.b.b;
              Toast.makeText((Context)quickContactActivity, quickContactActivity.getResources().getString(2131755534), 0).show();
            } else {
              quickContactActivity.setIsquick(Boolean.TRUE);
              QuickContactActivity.e0(this.b.b).b(QuickContactActivity.P(this.b.b));
              QuickContactActivity.R(this.b.b, quickContactActivity.getBean().n(), quickContactActivity.getBean().p());
            }  
        } else if (!quickContactActivity.getIsquick().booleanValue()) {
          List<CallLogBean> list = this.b.b.B;
          if (list != null)
            if (list.size() >= 4) {
              quickContactActivity = this.b.b;
              Toast.makeText((Context)quickContactActivity, quickContactActivity.getResources().getString(2131755534), 0).show();
            } else {
              quickContactActivity.setIsquick(Boolean.valueOf(quickContactActivity.getIsquick().booleanValue() ^ true));
              QuickContactActivity.e0(this.b.b).b(QuickContactActivity.P(this.b.b));
              QuickContactActivity.R(this.b.b, quickContactActivity.getBean().n(), quickContactActivity.getBean().p());
            }  
        } else {
          quickContactActivity.setIsquick(Boolean.valueOf(quickContactActivity.getIsquick().booleanValue() ^ true));
          QuickContactActivity.e0(this.b.b).b(QuickContactActivity.P(this.b.b));
          QuickContactActivity.S(this.b.b, quickContactActivity.getBean().p());
        } 
      }
    }
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(QuickContactActivity this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      QuickContactActivity quickContactActivity;
      QuickContactBean quickContactBean = (QuickContactBean)QuickContactActivity.e0(this.b.b).getItem(param1Int);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bean:");
        stringBuilder.append(quickContactBean.toString());
        d0.a("quick", stringBuilder.toString());
      } 
      if (quickContactBean.getIsquick() == null) {
        List<CallLogBean> list = this.b.b.B;
        if (list != null)
          if (list.size() >= 4) {
            quickContactActivity = this.b.b;
            Toast.makeText((Context)quickContactActivity, quickContactActivity.getResources().getString(2131755534), 0).show();
          } else {
            quickContactActivity.setIsquick(Boolean.TRUE);
            QuickContactActivity.e0(this.b.b).b(QuickContactActivity.P(this.b.b));
            QuickContactActivity.R(this.b.b, quickContactActivity.getBean().n(), quickContactActivity.getBean().p());
          }  
      } else if (!quickContactActivity.getIsquick().booleanValue()) {
        List<CallLogBean> list = this.b.b.B;
        if (list != null)
          if (list.size() >= 4) {
            quickContactActivity = this.b.b;
            Toast.makeText((Context)quickContactActivity, quickContactActivity.getResources().getString(2131755534), 0).show();
          } else {
            quickContactActivity.setIsquick(Boolean.valueOf(quickContactActivity.getIsquick().booleanValue() ^ true));
            QuickContactActivity.e0(this.b.b).b(QuickContactActivity.P(this.b.b));
            QuickContactActivity.R(this.b.b, quickContactActivity.getBean().n(), quickContactActivity.getBean().p());
          }  
      } else {
        quickContactActivity.setIsquick(Boolean.valueOf(quickContactActivity.getIsquick().booleanValue() ^ true));
        QuickContactActivity.e0(this.b.b).b(QuickContactActivity.P(this.b.b));
        QuickContactActivity.S(this.b.b, quickContactActivity.getBean().p());
      } 
    }
  }
  
  class b implements Runnable {
    b(QuickContactActivity this$0) {}
    
    public void run() {
      QuickContactActivity quickContactActivity = this.b;
      quickContactActivity.B = QuickContactActivity.Y(quickContactActivity).c();
      this.b.E.sendEmptyMessage(100);
    }
  }
  
  class c implements Animation.AnimationListener {
    c(QuickContactActivity this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      if (QuickContactActivity.T(this.a) != null)
        QuickContactActivity.T(this.a).setVisibility(8); 
      b1.u1(false);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class d implements Runnable {
    d(QuickContactActivity this$0, String param1String) {}
    
    public void run() {
      try {
        QuickContactActivity.Y(this.c).b(this.b);
        QuickContactActivity quickContactActivity = this.c;
        a a = new a();
        this(this);
        quickContactActivity.runOnUiThread(a);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements Runnable {
      a(QuickContactActivity.d this$0) {}
      
      public void run() {
        QuickContactActivity.e0(this.b.c).b(QuickContactActivity.P(this.b.c));
        QuickContactActivity.d0(this.b.c);
        QuickContactActivity.U(this.b.c);
      }
    }
  }
  
  class a implements Runnable {
    a(QuickContactActivity this$0) {}
    
    public void run() {
      QuickContactActivity.e0(this.b.c).b(QuickContactActivity.P(this.b.c));
      QuickContactActivity.d0(this.b.c);
      QuickContactActivity.U(this.b.c);
    }
  }
  
  class e implements DialogInterface.OnClickListener {
    e(QuickContactActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class f implements DialogInterface.OnClickListener {
    f(QuickContactActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        QuickContactActivity quickContactActivity;
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        if (this.d.B.size() >= 4) {
          quickContactActivity = this.d;
          Toast.makeText((Context)quickContactActivity, quickContactActivity.getResources().getString(2131755534), 0).show();
        } else {
          QuickContactActivity.R(this.d, str2, (String)quickContactActivity);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements Runnable {
    g(QuickContactActivity this$0, String param1String1, String param1String2) {}
    
    public void run() {
      CallLogBean callLogBean = new CallLogBean();
      callLogBean.D0(this.b.replace("-", ""));
      callLogBean.B0(this.c);
      QuickContactActivity.Y(this.d).e(callLogBean);
      this.d.runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(QuickContactActivity.g this$0) {}
      
      public void run() {
        QuickContactActivity.d0(this.b.d);
        QuickContactActivity.U(this.b.d);
      }
    }
  }
  
  class a implements Runnable {
    a(QuickContactActivity this$0) {}
    
    public void run() {
      QuickContactActivity.d0(this.b.d);
      QuickContactActivity.U(this.b.d);
    }
  }
  
  class h implements Runnable {
    h(QuickContactActivity this$0) {}
    
    public void run() {
      String str1 = "data2";
      String str2 = "starred";
      String str3 = "photo_id";
      String str4 = "contact_id";
      try {
        a a;
        Cursor cursor = EZCallApplication.c().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "display_name", "data1", "sort_key", "contact_id", "photo_id", "starred", "data2" }, null, null, "sort_key COLLATE LOCALIZED ASC");
        if (cursor == null || cursor.getCount() == 0) {
          QuickContactActivity quickContactActivity1 = this.b;
          a = new a();
          this(this);
          quickContactActivity1.runOnUiThread(a);
          return;
        } 
        int i = cursor.getColumnIndex("data1");
        int j = cursor.getColumnIndex("display_name");
        int k = cursor.getColumnIndex("sort_key");
        if (cursor.getCount() > 0) {
          QuickContactActivity quickContactActivity1 = this.b;
          ArrayList arrayList = new ArrayList();
          this();
          QuickContactActivity.Q(quickContactActivity1, arrayList);
          while (cursor.moveToNext()) {
            String str5;
            String str7 = cursor.getString(i);
            if (TextUtils.isEmpty(str7))
              continue; 
            String str8 = cursor.getString(j);
            String str9 = cursor.getString(k);
            String str6 = cursor.getString(cursor.getColumnIndex(str2));
            String str10 = cursor.getString(cursor.getColumnIndex(str3));
            int m = cursor.getInt(cursor.getColumnIndex((String)a));
            int n = cursor.getInt(cursor.getColumnIndex(str1));
            if (n != 1) {
              if (n != 2) {
                if (n != 3) {
                  if (n != 4) {
                    str5 = "";
                  } else {
                    str5 = this.b.getResources().getString(2131755865);
                  } 
                } else {
                  str5 = this.b.getResources().getString(2131755864);
                } 
              } else {
                str5 = this.b.getResources().getString(2131755473);
              } 
            } else {
              str5 = this.b.getResources().getString(2131755410);
            } 
            CallLogBean callLogBean = new CallLogBean();
            this();
            QuickContactBean quickContactBean = new QuickContactBean();
            this();
            callLogBean.I0(m);
            callLogBean.U0(str6);
            callLogBean.S0(str9);
            String str11 = QuickContactActivity.W(this.b, str9);
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("sortLetters:");
              stringBuilder.append(str11);
              d0.a("contactlist", stringBuilder.toString());
            } 
            str6 = str11;
            if (str11 == null)
              str6 = QuickContactActivity.X(this.b, str8); 
            callLogBean.r = str6;
            callLogBean.f0 = this.b.q0(str9);
            if (str5 != null && !"".equals(str5)) {
              callLogBean.E0(str5);
              callLogBean.N0(str5);
            } 
            callLogBean.D0(str7);
            quickContactBean.setIsquick(QuickContactActivity.Y(this.b).d(str7));
            if (str10 != null && !"".equals(str10) && !"0".equals(str10))
              callLogBean.H0(str10); 
            if (str8 != null) {
              callLogBean.B0(str8);
              quickContactBean.setBean(callLogBean);
              QuickContactActivity.P(this.b).add(quickContactBean);
            } 
          } 
        } 
        cursor.close();
        if (QuickContactActivity.P(this.b) != null && QuickContactActivity.P(this.b).size() != 0)
          for (k = 0; k < QuickContactActivity.P(this.b).size(); k++) {
            for (i = QuickContactActivity.P(this.b).size() - 1; i > k; i--) {
              if (((QuickContactBean)QuickContactActivity.P(this.b).get(k)).getBean().v() == ((QuickContactBean)QuickContactActivity.P(this.b).get(i)).getBean().v())
                QuickContactActivity.P(this.b).remove(i); 
            } 
          }  
        QuickContactActivity quickContactActivity = this.b;
        b b = new b();
        this(this);
        quickContactActivity.runOnUiThread(b);
      } catch (Exception exception) {}
    }
    
    class a implements Runnable {
      a(QuickContactActivity.h this$0) {}
      
      public void run() {
        QuickContactActivity.h0(this.b.b).setVisibility(8);
        QuickContactActivity.V(this.b.b).setVisibility(0);
      }
    }
    
    class b implements Runnable {
      b(QuickContactActivity.h this$0) {}
      
      public void run() {
        if (QuickContactActivity.P(this.b.b) != null && QuickContactActivity.P(this.b.b).size() > 0) {
          QuickContactActivity.g0(this.b.b).clear();
          QuickContactActivity.g0(this.b.b).addAll(QuickContactActivity.P(this.b.b));
        } 
        QuickContactActivity.e0(this.b.b).b(QuickContactActivity.g0(this.b.b));
      }
    }
  }
  
  class a implements Runnable {
    a(QuickContactActivity this$0) {}
    
    public void run() {
      QuickContactActivity.h0(this.b.b).setVisibility(8);
      QuickContactActivity.V(this.b.b).setVisibility(0);
    }
  }
  
  class b implements Runnable {
    b(QuickContactActivity this$0) {}
    
    public void run() {
      if (QuickContactActivity.P(this.b.b) != null && QuickContactActivity.P(this.b.b).size() > 0) {
        QuickContactActivity.g0(this.b.b).clear();
        QuickContactActivity.g0(this.b.b).addAll(QuickContactActivity.P(this.b.b));
      } 
      QuickContactActivity.e0(this.b.b).b(QuickContactActivity.g0(this.b.b));
    }
  }
  
  private static class i extends Handler {
    private final WeakReference<QuickContactActivity> a;
    
    private i(QuickContactActivity param1QuickContactActivity) {
      this.a = new WeakReference<QuickContactActivity>(param1QuickContactActivity);
    }
    
    public void handleMessage(Message param1Message) {
      QuickContactActivity quickContactActivity = this.a.get();
      if (quickContactActivity != null && param1Message.what == 100 && quickContactActivity.B != null)
        QuickContactActivity.O(quickContactActivity); 
      super.handleMessage(param1Message);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/QuickContactActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */