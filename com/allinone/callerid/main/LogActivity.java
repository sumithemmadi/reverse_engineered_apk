package com.allinone.callerid.main;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.allinone.callerid.customview.ExpandTextView;
import com.allinone.callerid.util.a0;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LogActivity extends AppCompatActivity {
  private TextView A;
  
  private TextView B;
  
  private TextView C;
  
  private TextView D;
  
  private TextView E;
  
  private TextView F;
  
  private TextView G;
  
  private TextView H;
  
  private TextView I;
  
  private TextView J;
  
  private TextView K;
  
  private ScrollView L;
  
  private ExpandTextView M;
  
  private ExpandTextView N;
  
  private ExpandTextView O;
  
  private ExpandTextView P;
  
  private String Q;
  
  private String R;
  
  private String S = "android";
  
  private String T = "86";
  
  private String U = "13021125524";
  
  String V = "001";
  
  String W;
  
  String X;
  
  String Y;
  
  private int Z;
  
  private int a0;
  
  private Handler b0 = new c(this);
  
  private TextView s;
  
  private TextView t;
  
  private TextView u;
  
  private TextView v;
  
  private TextView w;
  
  private TextView x;
  
  private TextView y;
  
  private TextView z;
  
  private String p0() {
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("last_update_time", "0");
      hashMap.put("cc", "91");
      hashMap.put("platform", "android");
      hashMap.put("package", this.X);
      hashMap.put("app_version", this.R);
      hashMap.put("uid", this.Q);
      hashMap.put("stamp", i1.Q(getApplicationContext(), this.Q));
      hashMap.put("country", "in");
      hashMap.put("state", "");
      hashMap.put("city", "");
      boolean bool = d0.a;
      if (bool) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("params: ");
        stringBuilder.append(hashMap.toString());
        d0.a("checkupdate", stringBuilder.toString());
      } 
      String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/proc/v1/offpaccheupd.php", hashMap);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("enlode_result: ");
        stringBuilder.append(str);
        d0.a("checkupdate", stringBuilder.toString());
      } 
      return str;
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  private void q0(String paramString) {
    (new e(this, paramString)).start();
  }
  
  private String s0() {
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("device", this.S);
      hashMap.put("uid", this.Q);
      hashMap.put("version", this.R);
      String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/sertim.php", hashMap);
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    return (String)exception;
  }
  
  private void t0() {
    this.s = (TextView)findViewById(2131298072);
    this.t = (TextView)findViewById(2131298077);
    this.M = (ExpandTextView)findViewById(2131298078);
    this.u = (TextView)findViewById(2131298079);
    this.N = (ExpandTextView)findViewById(2131298080);
    this.w = (TextView)findViewById(2131298081);
    this.v = (TextView)findViewById(2131298082);
    this.x = (TextView)findViewById(2131298083);
    this.O = (ExpandTextView)findViewById(2131298084);
    this.y = (TextView)findViewById(2131298085);
    this.z = (TextView)findViewById(2131298086);
    this.A = (TextView)findViewById(2131298087);
    this.P = (ExpandTextView)findViewById(2131298088);
    this.B = (TextView)findViewById(2131298089);
    this.C = (TextView)findViewById(2131298090);
    this.D = (TextView)findViewById(2131298091);
    this.E = (TextView)findViewById(2131298092);
    this.F = (TextView)findViewById(2131298093);
    this.G = (TextView)findViewById(2131298073);
    this.H = (TextView)findViewById(2131298074);
    this.I = (TextView)findViewById(2131298075);
    this.J = (TextView)findViewById(2131298076);
    this.K = (TextView)findViewById(2131297872);
    this.L = (ScrollView)findViewById(2131297565);
    this.N.setAnimationDuration(500);
    this.N.setMinVisibleLines(3);
    this.P.setAnimationDuration(500);
    this.P.setMinVisibleLines(3);
    this.P.setOnReadMoreListener(new b(this));
  }
  
  private String u0() {
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("tel_number", this.U);
      hashMap.put("device", this.S);
      hashMap.put("uid", this.Q);
      hashMap.put("version", this.R);
      hashMap.put("default_cc", this.T);
      hashMap.put("cc", this.W);
      hashMap.put("stamp", this.Y);
      hashMap.put("cid", "");
      hashMap.put("is_contacts", "");
      String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/sea.php", hashMap);
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    return (String)exception;
  }
  
  private String v0() {
    try {
      ArrayList<String> arrayList = new ArrayList();
      this();
      arrayList.add("18813032887");
      arrayList.add("10086");
      arrayList.add("13653310377");
      arrayList.add("10010");
      if (arrayList.size() > 0) {
        JSONArray jSONArray = new JSONArray();
        this(arrayList);
        String str = w.c(jSONArray.toString());
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        hashMap.put("tel_number_list", str);
        hashMap.put("device", this.S);
        hashMap.put("uid", this.Q);
        hashMap.put("version", this.R);
        hashMap.put("default_cc", this.T);
        hashMap.put("cc", this.T);
        hashMap.put("stamp", i1.Q((Context)EZCallApplication.c(), arrayList.get(arrayList.size() - 1)));
        return com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/sealis.php", hashMap);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return null;
  }
  
  private void w0() {
    (new Thread(new d(this))).start();
  }
  
  public String o0() {
    String str3;
    String str1 = null;
    String str2 = str1;
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      str2 = str1;
      this();
      str2 = str1;
      hashMap.put("app_version", this.X);
      str2 = str1;
      hashMap.put("uid", this.Q);
      str2 = str1;
      hashMap.put("country", "cn");
      str2 = str1;
      hashMap.put("cc", "86");
      str2 = str1;
      hashMap.put("language", Locale.getDefault().getLanguage());
      str2 = str1;
      hashMap.put("last_update_time", "0");
      str2 = str1;
      hashMap.put("stamp", i1.Q((Context)EZCallApplication.c(), this.Q));
      str2 = str1;
      boolean bool = d0.a;
      if (bool) {
        str2 = str1;
        StringBuilder stringBuilder = new StringBuilder();
        str2 = str1;
        this();
        str2 = str1;
        stringBuilder.append("params: ");
        str2 = str1;
        stringBuilder.append(hashMap.toString());
        str2 = str1;
        d0.a("wbb", stringBuilder.toString());
      } 
      str2 = str1;
      str1 = com.allinone.callerid.j.a.b("https://app.show-caller.com/proc/v1/parcheupd.php", hashMap);
      str2 = str1;
      str3 = str1;
      if (d0.a) {
        str2 = str1;
        StringBuilder stringBuilder = new StringBuilder();
        str2 = str1;
        this();
        str2 = str1;
        stringBuilder.append("enlode_result: ");
        str2 = str1;
        stringBuilder.append(str1);
        str2 = str1;
        d0.a("wbb", stringBuilder.toString());
        String str = str1;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      str3 = str2;
    } 
    return str3;
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492928);
    t0();
    this.Q = i1.T((Context)this);
    this.R = i1.W((Context)this);
    this.X = i1.M(getApplicationContext());
    this.W = p.d((Context)EZCallApplication.c()).getCountry_code();
    this.Y = i1.Q((Context)this, this.U);
    this.L.getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
    w0();
  }
  
  public String r0() {
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("tel_number", this.V);
      hashMap.put("device", this.S);
      hashMap.put("uid", this.Q);
      hashMap.put("version", this.R);
      hashMap.put("default_cc", this.T);
      hashMap.put("stamp", i1.Q(getApplicationContext(), this.V));
      String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/gecc.php", hashMap);
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    return (String)exception;
  }
  
  class a implements ViewTreeObserver.OnGlobalLayoutListener {
    a(LogActivity this$0) {}
    
    public void onGlobalLayout() {
      LogActivity.M(this.b).post(new a(this));
    }
    
    class a implements Runnable {
      a(LogActivity.a this$0) {}
      
      public void run() {
        LogActivity.M(this.b.b).fullScroll(130);
      }
    }
  }
  
  class a implements Runnable {
    a(LogActivity this$0) {}
    
    public void run() {
      LogActivity.M(this.b.b).fullScroll(130);
    }
  }
  
  class b implements com.allinone.callerid.customview.c {
    b(LogActivity this$0) {}
    
    public void a() {}
    
    public void b() {}
  }
  
  class c extends Handler {
    c(LogActivity this$0) {}
    
    public void handleMessage(Message param1Message) {
      super.handleMessage(param1Message);
      int i = param1Message.what;
      if (i != 0) {
        StringBuilder stringBuilder;
        if (i != 1) {
          if (i != 20) {
            if (i != 30) {
              if (i != 40) {
                if (i != 80) {
                  if (i != 100) {
                    if (i != 110) {
                      ExpandTextView expandTextView;
                      if (i != 210) {
                        if (i != 211) {
                          if (i != 310) {
                            String str;
                            if (i != 311) {
                              TextView textView;
                              if (i != 410) {
                                if (i != 411) {
                                  if (i != 810) {
                                    if (i != 811) {
                                      if (i != 1010) {
                                        if (i != 1011) {
                                          if (i != 1110) {
                                            if (i == 1111) {
                                              String str1 = param1Message.obj.toString();
                                              TextView textView2 = LogActivity.S(this.a);
                                              stringBuilder = new StringBuilder();
                                              stringBuilder.append("8.检查离线解析器接口：\n");
                                              stringBuilder.append(a0.b(str1));
                                              textView2.setText(stringBuilder.toString());
                                              LogActivity.T(this.a).setText("检查离线解析器结果：OK\n\n");
                                              TextView textView1 = LogActivity.Y(this.a);
                                              stringBuilder = new StringBuilder();
                                              stringBuilder.append("成功个数：");
                                              stringBuilder.append(LogActivity.U(this.a));
                                              stringBuilder.append("\n");
                                              stringBuilder.append("失败个数：");
                                              stringBuilder.append(LogActivity.W(this.a));
                                              textView1.setText(stringBuilder.toString());
                                            } 
                                          } else {
                                            String str1 = ((Message)stringBuilder).obj.toString();
                                            textView = LogActivity.S(this.a);
                                            StringBuilder stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append("8.检查离线解析器：\n");
                                            stringBuilder2.append(a0.b(str1));
                                            textView.setText(stringBuilder2.toString());
                                            LogActivity.T(this.a).setText("检查离线解析器：Failed\n\n");
                                            textView = LogActivity.Y(this.a);
                                            StringBuilder stringBuilder1 = new StringBuilder();
                                            stringBuilder1.append("成功个数：");
                                            stringBuilder1.append(LogActivity.U(this.a));
                                            stringBuilder1.append("\n");
                                            stringBuilder1.append("失败个数：");
                                            stringBuilder1.append(LogActivity.W(this.a));
                                            textView.setText(stringBuilder1.toString());
                                          } 
                                        } else {
                                          str = ((Message)textView).obj.toString();
                                          TextView textView1 = LogActivity.Q(this.a);
                                          StringBuilder stringBuilder1 = new StringBuilder();
                                          stringBuilder1.append("7.检查离线db接口（新）：\n");
                                          stringBuilder1.append(a0.b(str));
                                          textView1.setText(stringBuilder1.toString());
                                          LogActivity.R(this.a).setText("检查离线db接口（新）结果：OK\n\n");
                                          (new LogActivity.j(this.a)).start();
                                        } 
                                      } else {
                                        String str1 = ((Message)str).obj.toString();
                                        TextView textView1 = LogActivity.Q(this.a);
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("7.检查离线db接口（新）：\n");
                                        stringBuilder.append(a0.b(str1));
                                        textView1.setText(stringBuilder.toString());
                                        LogActivity.R(this.a).setText("检查离线db接口（新）结果：Failed\n\n");
                                        (new LogActivity.j(this.a)).start();
                                      } 
                                    } else {
                                      str = ((Message)stringBuilder).obj.toString();
                                      TextView textView1 = LogActivity.O(this.a);
                                      StringBuilder stringBuilder1 = new StringBuilder();
                                      stringBuilder1.append("5.日志收集接口：\n");
                                      stringBuilder1.append(a0.b(str));
                                      textView1.setText(stringBuilder1.toString());
                                      LogActivity.P(this.a).setText("日志收集接口结果：OK\n\n");
                                      (new LogActivity.i(this.a)).start();
                                    } 
                                  } else {
                                    str = ((Message)str).obj.toString();
                                    TextView textView1 = LogActivity.O(this.a);
                                    StringBuilder stringBuilder1 = new StringBuilder();
                                    stringBuilder1.append("5.日志收集接口：\n");
                                    stringBuilder1.append(a0.b(str));
                                    textView1.setText(stringBuilder1.toString());
                                    LogActivity.P(this.a).setText("日志收集接口结果：Failed\n\n");
                                    (new LogActivity.i(this.a)).start();
                                  } 
                                } else {
                                  String str1 = ((Message)str).obj.toString();
                                  textView = LogActivity.l0(this.a);
                                  StringBuilder stringBuilder1 = new StringBuilder();
                                  stringBuilder1.append("4.获取CC请求：\n");
                                  stringBuilder1.append(a0.b(str1));
                                  textView.setText(stringBuilder1.toString());
                                  LogActivity.m0(this.a).setText("测试结果：OK\n\n");
                                  LogActivity.n0(this.a, "18813032887");
                                } 
                              } else {
                                str = ((Message)textView).obj.toString();
                                LogActivity.l0(this.a).setVisibility(0);
                                TextView textView1 = LogActivity.l0(this.a);
                                StringBuilder stringBuilder1 = new StringBuilder();
                                stringBuilder1.append("4.获取CC请求：\n");
                                stringBuilder1.append(a0.b(str));
                                textView1.setText(stringBuilder1.toString());
                                LogActivity.m0(this.a).setText("测试结果：Failed\n\n");
                                LogActivity.n0(this.a, "18813032887");
                              } 
                            } else {
                              String str1 = ((Message)str).obj.toString();
                              LogActivity.j0(this.a).setVisibility(0);
                              ExpandTextView expandTextView1 = LogActivity.j0(this.a);
                              stringBuilder = new StringBuilder();
                              stringBuilder.append("3.号码查询的结果：\n");
                              stringBuilder.append(a0.b(str1));
                              expandTextView1.setContent(stringBuilder.toString());
                              LogActivity.k0(this.a).setText("测试结果：OK\n\n");
                              (new LogActivity.f(this.a)).start();
                            } 
                          } else {
                            String str = ((Message)stringBuilder).obj.toString();
                            LogActivity.j0(this.a).setVisibility(0);
                            ExpandTextView expandTextView1 = LogActivity.j0(this.a);
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("3.号码查询的结果：\n");
                            stringBuilder.append(a0.b(str));
                            expandTextView1.setContent(stringBuilder.toString());
                            LogActivity.k0(this.a).setText("测试结果：Failed\n\n");
                            (new LogActivity.f(this.a)).start();
                          } 
                        } else {
                          String str = ((Message)stringBuilder).obj.toString();
                          LogActivity.h0(this.a).setVisibility(0);
                          expandTextView = LogActivity.h0(this.a);
                          StringBuilder stringBuilder1 = new StringBuilder();
                          stringBuilder1.append("2.批量查询的结果：\n");
                          stringBuilder1.append(a0.b(str));
                          expandTextView.setContent(stringBuilder1.toString());
                          LogActivity.i0(this.a).setText("测试结果：OK\n\n");
                          (new LogActivity.h(this.a)).start();
                        } 
                      } else {
                        String str = ((Message)expandTextView).obj.toString();
                        LogActivity.h0(this.a).setVisibility(0);
                        ExpandTextView expandTextView1 = LogActivity.h0(this.a);
                        StringBuilder stringBuilder1 = new StringBuilder();
                        stringBuilder1.append("2.批量查询的结果：\n");
                        stringBuilder1.append(a0.b(str));
                        expandTextView1.setContent(stringBuilder1.toString());
                        LogActivity.i0(this.a).setText("测试结果：Failed\n\n");
                        (new LogActivity.h(this.a)).start();
                      } 
                    } else {
                      LogActivity.T(this.a).setText("8.检查离线解析器请求失败\n\n");
                      TextView textView = LogActivity.Y(this.a);
                      stringBuilder = new StringBuilder();
                      stringBuilder.append("成功个数：");
                      stringBuilder.append(LogActivity.U(this.a));
                      stringBuilder.append("\n");
                      stringBuilder.append("失败个数：");
                      stringBuilder.append(LogActivity.W(this.a));
                      textView.setText(stringBuilder.toString());
                    } 
                  } else {
                    LogActivity.R(this.a).setText("7.检查离线db接口（新）请求失败\n\n");
                    (new LogActivity.j(this.a)).start();
                  } 
                } else {
                  LogActivity.P(this.a).setText("请求失败\n\n");
                  (new LogActivity.i(this.a)).start();
                } 
              } else {
                LogActivity.m0(this.a).setText("请求失败\n\n");
                LogActivity.n0(this.a, "18813032887");
              } 
            } else {
              LogActivity.j0(this.a).setVisibility(0);
              LogActivity.k0(this.a).setText("请求失败\n\n");
              (new LogActivity.f(this.a)).start();
            } 
          } else {
            LogActivity.i0(this.a).setText("请求失败");
            (new LogActivity.h(this.a)).start();
          } 
        } else {
          String str = ((Message)stringBuilder).obj.toString();
          TextView textView = LogActivity.N(this.a);
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("1.获取服务端的时间：\n");
          stringBuilder1.append(a0.b(str));
          textView.setText(stringBuilder1.toString());
          LogActivity.a0(this.a).setText("测试结果：OK\n\n");
          (new LogActivity.g(this.a)).start();
        } 
      } else {
        LogActivity.N(this.a).setVisibility(8);
        LogActivity.a0(this.a).setText("获取服务端的时间：返回值为空，请查看网络等原因");
      } 
    }
  }
  
  class d implements Runnable {
    d(LogActivity this$0) {}
    
    public void run() {
      try {
        String str = LogActivity.Z(this.b);
        Message message = new Message();
        this();
        if (str != null) {
          JSONObject jSONObject = new JSONObject();
          this(str);
          if (jSONObject.getString("status").equals("1")) {
            message.what = 1;
            message.obj = str;
            LogActivity.V(this.b);
          } 
        } else {
          message.what = 0;
          LogActivity.X(this.b);
        } 
        LogActivity.b0(this.b).sendMessage(message);
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
  
  class e extends Thread {
    e(LogActivity this$0, String param1String) {}
    
    public void run() {
      super.run();
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        String str1 = i1.R();
        String str2 = i1.N();
        String str3 = i1.G();
        JSONArray jSONArray1 = new JSONArray();
        this();
        JSONArray jSONArray2 = new JSONArray();
        this();
        jSONArray2.put(this.b);
        jSONArray2.put(i1.f(this.c.W));
        jSONArray2.put("0");
        jSONArray2.put("0");
        jSONArray2.put("0");
        jSONArray2.put("0");
        jSONArray2.put("0");
        jSONArray2.put("0");
        jSONArray2.put("0");
        jSONArray2.put("0");
        jSONArray2.put("0");
        jSONArray2.put("2");
        jSONArray2.put("0");
        jSONArray2.put("");
        jSONArray1.put(jSONArray2);
        JSONObject jSONObject = new JSONObject();
        this();
        jSONArray2 = new JSONArray();
        this();
        jSONArray2.put(i1.f(""));
        jSONArray2.put(i1.f("86"));
        jSONArray2.put(i1.f(str1));
        jSONArray2.put(i1.f(str2));
        jSONArray2.put(i1.f(str3));
        jSONArray2.put(i1.f(""));
        jSONArray2.put(i1.f("cn"));
        jSONArray2.put(i1.f(""));
        jSONArray2.put(i1.f(""));
        jSONObject.put("user_info", jSONArray2);
        jSONObject.put("tel_number_info", jSONArray1);
        hashMap.put("platform", "android");
        hashMap.put("uid", LogActivity.f0(this.c));
        hashMap.put("app_version", LogActivity.g0(this.c));
        hashMap.put("origin", "app");
        hashMap.put("stamp", i1.Q(this.c.getApplicationContext(), LogActivity.f0(this.c)));
        hashMap.put("content", w.c(jSONObject.toString().replaceAll("\\\\", "")));
        str2 = com.allinone.callerid.j.a.b("https://ct.show-caller.com/c_n/api/v1/cnwik.php", hashMap);
        Message message = new Message();
        this();
        if (str2 != null) {
          JSONObject jSONObject1 = new JSONObject();
          this(str2);
          message.obj = str2;
          if (jSONObject1.getInt("status") == 1) {
            LogActivity.V(this.c);
            message.what = 811;
          } else {
            LogActivity.X(this.c);
            message.what = 810;
          } 
        } else {
          LogActivity.X(this.c);
          message.what = 80;
        } 
        LogActivity.b0(this.c).sendMessage(message);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class f extends Thread {
    f(LogActivity this$0) {}
    
    public void run() {
      super.run();
      try {
        String str = this.b.r0();
        Message message = new Message();
        this();
        if (str != null) {
          JSONObject jSONObject = new JSONObject();
          this(str);
          message.obj = str;
          if (jSONObject.getInt("status") == 1) {
            LogActivity.V(this.b);
            message.what = 411;
          } else {
            LogActivity.X(this.b);
            message.what = 410;
          } 
        } else {
          LogActivity.X(this.b);
          message.what = 40;
        } 
        LogActivity.b0(this.b).sendMessage(message);
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
  
  class g extends Thread {
    g(LogActivity this$0) {}
    
    public void run() {
      super.run();
      try {
        String str = LogActivity.c0(this.b);
        Message message = new Message();
        this();
        if (str != null) {
          JSONObject jSONObject = new JSONObject();
          this(str);
          message.obj = str;
          if (jSONObject.getInt("status") == 1 || jSONObject.getInt("status") == -10) {
            message.what = 211;
            LogActivity.V(this.b);
          } else {
            LogActivity.X(this.b);
            message.what = 210;
          } 
        } else {
          LogActivity.X(this.b);
          message.what = 20;
        } 
        LogActivity.b0(this.b).sendMessage(message);
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
  
  class h extends Thread {
    h(LogActivity this$0) {}
    
    public void run() {
      super.run();
      try {
        String str = LogActivity.d0(this.b);
        Message message = new Message();
        this();
        if (str != null) {
          JSONObject jSONObject = new JSONObject();
          this(str);
          message.obj = str;
          if (jSONObject.getInt("status") == 1) {
            message.what = 311;
            LogActivity.V(this.b);
          } else {
            message.what = 310;
            LogActivity.X(this.b);
          } 
        } else {
          LogActivity.X(this.b);
          message.what = 30;
        } 
        LogActivity.b0(this.b).sendMessage(message);
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
  
  class i extends Thread {
    i(LogActivity this$0) {}
    
    public void run() {
      super.run();
      try {
        String str = LogActivity.e0(this.b);
        Message message = new Message();
        this();
        if (str != null) {
          JSONObject jSONObject = new JSONObject();
          this(str);
          message.obj = str;
          if (jSONObject.getInt("status") == 1) {
            LogActivity.V(this.b);
            message.what = 1011;
          } else {
            LogActivity.X(this.b);
            message.what = 1010;
          } 
        } else {
          LogActivity.X(this.b);
          message.what = 100;
        } 
        LogActivity.b0(this.b).sendMessage(message);
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
  
  class j extends Thread {
    j(LogActivity this$0) {}
    
    public void run() {
      super.run();
      try {
        String str = this.b.o0();
        Message message = new Message();
        this();
        if (str != null) {
          JSONObject jSONObject = new JSONObject();
          this(str);
          message.obj = str;
          if (jSONObject.getInt("status") == 1 || jSONObject.getInt("status") == -30) {
            LogActivity.V(this.b);
            message.what = 1111;
          } else {
            LogActivity.X(this.b);
            message.what = 1110;
          } 
        } else {
          LogActivity.X(this.b);
          message.what = 110;
        } 
        LogActivity.b0(this.b).sendMessage(message);
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/main/LogActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */