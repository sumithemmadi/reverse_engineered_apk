package com.allinone.callerid.mvc.controller.comment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.CommentContent;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.i.a.f.m;
import com.allinone.callerid.i.a.f.o;
import com.allinone.callerid.i.a.i.g;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.x;
import org.json.JSONObject;

public class SubmitCommentActivity extends BaseActivity implements View.OnClickListener {
  private TextView A;
  
  private BaseEditText B;
  
  private FrameLayout C;
  
  private String D;
  
  private ImageView E;
  
  private ImageView F;
  
  private ImageView G;
  
  private ImageView H;
  
  private boolean I;
  
  private String J = "";
  
  private String K;
  
  private String L;
  
  private String M;
  
  private FrameLayout N;
  
  private TextView O;
  
  private FrameLayout P;
  
  private com.allinone.callerid.dialog.a Q;
  
  private boolean R;
  
  private boolean S = true;
  
  private x T;
  
  private int U;
  
  private int V;
  
  private int W;
  
  private int X;
  
  private TextWatcher Y;
  
  private final String s = "SubmitCommentActivity";
  
  private Typeface t;
  
  private TextView u;
  
  private TextView v;
  
  private TextView w;
  
  private TextView x;
  
  private TextView y;
  
  private TextView z;
  
  private void f0() {
    String str = this.B.getText().toString();
    if (str != null) {
      if (!"".equals(str)) {
        q.b().c("unknow_submit_has_comment");
        if (str.length() < 5) {
          this.O.setText(getResources().getString(2131755218));
          this.N.setVisibility(0);
          this.P.setBackgroundResource(2131230828);
          this.A.setTextColor(this.W);
          q.b().c("unknow_submit_comment_least");
          return;
        } 
        if (str.contains("http") || str.contains("wwww")) {
          this.O.setText(getResources().getString(2131755208));
          this.N.setVisibility(0);
          this.P.setBackgroundResource(2131230828);
          q.b().c("unknow_submit_comment_url");
          return;
        } 
        if (i1.l0(str)) {
          this.O.setText(getResources().getString(2131755217));
          this.N.setVisibility(0);
          this.P.setBackgroundResource(2131230828);
          q.b().c("unknow_submit_comment_special");
          return;
        } 
      } else {
        q.b().c("unknow_submit_no_comment");
      } 
      long l = System.currentTimeMillis();
      k0(this.L, str, l);
      n0(getApplicationContext(), this.L, str, l);
      Toast.makeText(getApplicationContext(), getResources().getString(2131755764), 0).show();
      this.S = false;
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  private void g0() {
    if (this.I) {
      this.Q = new com.allinone.callerid.dialog.a((Context)this, 2131820783, new c(this));
      q.b().c("unknow_select_dialog_show");
      this.Q.show();
    } else {
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  private void h0(IBinder paramIBinder) {
    if (paramIBinder != null)
      try {
        InputMethodManager inputMethodManager = (InputMethodManager)getSystemService("input_method");
        if (inputMethodManager != null)
          inputMethodManager.hideSoftInputFromWindow(paramIBinder, 2); 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  private void i0() {
    this.U = d1.a((Context)this, 2130968859, 2131099706);
    this.V = d1.a((Context)this, 2130968902, 2131099725);
    this.W = d1.a((Context)this, 2130968858, 2131099729);
    this.X = d1.b((Context)this, 2130968675, 2131230826);
    this.u = (TextView)findViewById(2131297857);
    this.v = (TextView)findViewById(2131298011);
    this.w = (TextView)findViewById(2131298136);
    this.x = (TextView)findViewById(2131298100);
    this.y = (TextView)findViewById(2131298169);
    this.z = (TextView)findViewById(2131297830);
    this.A = (TextView)findViewById(2131297968);
    this.B = (BaseEditText)findViewById(2131296658);
    this.N = (FrameLayout)findViewById(2131297488);
    this.P = (FrameLayout)findViewById(2131297499);
    this.O = (TextView)findViewById(2131297856);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296763);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296798);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296780);
    FrameLayout frameLayout4 = (FrameLayout)findViewById(2131296800);
    this.C = (FrameLayout)findViewById(2131296776);
    this.E = (ImageView)findViewById(2131296912);
    this.F = (ImageView)findViewById(2131296914);
    this.G = (ImageView)findViewById(2131296913);
    this.H = (ImageView)findViewById(2131296917);
    FrameLayout frameLayout5 = (FrameLayout)findViewById(2131297489);
    View view = findViewById(2131298254);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    frameLayout4.setOnClickListener(this);
    this.C.setOnClickListener(this);
    frameLayout5.setOnClickListener(this);
    view.setOnClickListener(this);
    this.u.setTypeface(this.t);
    this.v.setTypeface(this.t);
    this.w.setTypeface(this.t);
    this.x.setTypeface(this.t);
    this.y.setTypeface(this.t);
    this.z.setTypeface(this.t);
    this.A.setTypeface(this.t);
    this.B.setTypeface(this.t);
    this.O.setTypeface(this.t);
    b b = new b(this);
    this.Y = b;
    this.B.addTextChangedListener(b);
  }
  
  private void j0() {
    x x1 = new x((Context)this);
    this.T = x1;
    x1.b(new f(this));
    this.T.c();
  }
  
  private void k0(String paramString1, String paramString2, long paramLong) {
    CommentContent commentContent = new CommentContent();
    commentContent.setTel_number(paramString1);
    commentContent.setType_label(this.D);
    commentContent.setAuthor(getApplicationContext().getResources().getString(2131755871));
    commentContent.setCreate_time(i.d(paramLong));
    commentContent.setContent(paramString2);
    commentContent.setT_p(this.K);
    com.allinone.callerid.i.a.i.a.b(commentContent, new e(this, paramString1, paramString2));
  }
  
  private void l0() {
    Intent intent = getIntent();
    if (intent != null) {
      CallLogBean callLogBean = (CallLogBean)intent.getParcelableExtra("number_content");
      int i = intent.getIntExtra("is_activity", 0);
      String str = intent.getStringExtra("activity_count");
      if (callLogBean != null) {
        StringBuilder stringBuilder;
        String str2 = callLogBean.O();
        this.D = callLogBean.N();
        String str1 = callLogBean.x();
        this.K = callLogBean.I();
        this.L = callLogBean.p();
        if (str2 != null && !"".equals(str2)) {
          byte b = -1;
          switch (str2.hashCode()) {
            case 1172387228:
              if (!str2.equals("Telemarketing"))
                break; 
              b = 2;
              break;
            case 2583401:
              if (!str2.equals("Spam"))
                break; 
              b = 1;
              break;
            case 2570908:
              if (!str2.equals("Scam"))
                break; 
              b = 0;
              break;
          } 
          switch (b) {
            case 2:
              this.J = "is_telemarketing";
              this.D = "Telemarketing";
              this.I = true;
              this.M = "";
              this.R = true;
              this.P.setVisibility(0);
              this.B.setHint(getResources().getString(2131755207));
              this.E.setImageResource(2131230949);
              this.v.setTextColor(this.V);
              this.G.setImageResource(2131230950);
              this.x.setTextColor(this.V);
              this.F.setImageResource(2131230952);
              this.w.setTextColor(this.V);
              this.H.setImageResource(2131230955);
              this.y.setTextColor(getResources().getColor(2131099745));
              this.z.setTextColor(getResources().getColor(2131099942));
              this.C.setBackgroundResource(2131230896);
              break;
            case 1:
              this.J = "is_spam";
              this.D = "Spam";
              this.I = true;
              this.M = "";
              this.R = true;
              this.P.setVisibility(0);
              this.B.setHint(getResources().getString(2131755207));
              this.E.setImageResource(2131230949);
              this.v.setTextColor(this.V);
              this.G.setImageResource(2131230950);
              this.x.setTextColor(this.V);
              this.F.setImageResource(2131230953);
              this.w.setTextColor(getResources().getColor(2131099745));
              this.H.setImageResource(2131230954);
              this.y.setTextColor(this.V);
              this.z.setTextColor(getResources().getColor(2131099942));
              this.C.setBackgroundResource(2131230896);
              break;
            case 0:
              this.J = "is_scam";
              this.D = "Scam";
              this.I = true;
              this.M = "";
              this.R = true;
              this.P.setVisibility(0);
              this.B.setHint(getResources().getString(2131755207));
              this.E.setImageResource(2131230949);
              this.v.setTextColor(this.V);
              this.G.setImageResource(2131230951);
              this.x.setTextColor(getResources().getColor(2131099745));
              this.F.setImageResource(2131230952);
              this.w.setTextColor(this.V);
              this.H.setImageResource(2131230954);
              this.y.setTextColor(this.V);
              this.z.setTextColor(getResources().getColor(2131099942));
              this.C.setBackgroundResource(2131230896);
              break;
          } 
        } 
        str2 = this.D;
        if (str2 != null && !"".equals(str2)) {
          str = getResources().getString(2131755222);
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("<font color='#ee5164'> ");
          stringBuilder1.append(callLogBean.N());
          stringBuilder1.append("</font>");
          String str3 = str.replace("XX", stringBuilder1.toString());
          if (str1 != null && !"".equals(str1) && !"0".equals(str1)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<font color='#ee5164'> ");
            stringBuilder.append(str1);
            stringBuilder.append("</font>");
            str1 = str3.replace("X", stringBuilder.toString());
            this.u.setText((CharSequence)Html.fromHtml(str1));
          } else {
            str1 = str3.replace("X", "<font color='#ee5164'> 10</font>");
            this.u.setText((CharSequence)Html.fromHtml(str1));
          } 
        } else if (i == 1) {
          String str3 = getResources().getString(2131755221);
          if (stringBuilder != null && !"".equals(stringBuilder)) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("<font color='#ee5164'> ");
            stringBuilder1.append((String)stringBuilder);
            stringBuilder1.append("</font>");
            String str4 = str3.replace("X", stringBuilder1.toString());
            this.u.setText((CharSequence)Html.fromHtml(str4));
          } else {
            str1 = str3.replace("X", "<font color='#ee5164'> 10</font>");
            this.u.setText((CharSequence)Html.fromHtml(str1));
          } 
        } 
      } 
    } 
  }
  
  private void m0() {
    InputMethodManager inputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (inputMethodManager != null) {
      this.B.requestFocus();
      inputMethodManager.showSoftInput((View)this.B, 0);
    } 
  }
  
  private void n0(Context paramContext, String paramString1, String paramString2, long paramLong) {
    m.a(paramContext, paramString1, new d(this, paramString1, paramLong, paramString2));
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131298254:
        h0(paramView.getWindowToken());
      case 2131297489:
        h0(paramView.getWindowToken());
      case 2131297127:
        g0();
      case 2131296800:
        this.J = "is_telemarketing";
        this.D = "Telemarketing";
        this.I = true;
        this.M = "";
        if ("Telemarketing" == null || "".equals("Telemarketing"))
          this.R = true; 
        this.P.setVisibility(0);
        this.B.setHint(getResources().getString(2131755207));
        this.E.setImageResource(2131230949);
        this.v.setTextColor(this.V);
        this.G.setImageResource(2131230950);
        this.x.setTextColor(this.V);
        this.F.setImageResource(2131230952);
        this.w.setTextColor(this.V);
        this.H.setImageResource(2131230955);
        this.y.setTextColor(getResources().getColor(2131099745));
        this.z.setTextColor(getResources().getColor(2131099942));
        this.C.setBackgroundResource(2131230896);
        m0();
        this.B.setHint(getResources().getString(2131755207));
        q.b().c("unknow_type_select");
      case 2131296798:
        this.J = "is_spam";
        this.D = "Spam";
        this.I = true;
        this.M = "";
        if ("Spam" == null || "".equals("Spam"))
          this.R = true; 
        this.P.setVisibility(0);
        this.B.setHint(getResources().getString(2131755207));
        this.E.setImageResource(2131230949);
        this.v.setTextColor(this.V);
        this.G.setImageResource(2131230950);
        this.x.setTextColor(this.V);
        this.F.setImageResource(2131230953);
        this.w.setTextColor(getResources().getColor(2131099745));
        this.H.setImageResource(2131230954);
        this.y.setTextColor(this.V);
        this.z.setTextColor(getResources().getColor(2131099942));
        this.C.setBackgroundResource(2131230896);
        m0();
        this.B.setHint(getResources().getString(2131755207));
        q.b().c("unknow_type_select");
      case 2131296780:
        this.J = "is_scam";
        this.D = "Scam";
        this.I = true;
        this.M = "";
        if ("Scam" == null || "".equals("Scam"))
          this.R = true; 
        this.P.setVisibility(0);
        this.B.setHint(getResources().getString(2131755207));
        this.E.setImageResource(2131230949);
        this.v.setTextColor(this.V);
        this.G.setImageResource(2131230951);
        this.x.setTextColor(getResources().getColor(2131099745));
        this.F.setImageResource(2131230952);
        this.w.setTextColor(this.V);
        this.H.setImageResource(2131230954);
        this.y.setTextColor(this.V);
        this.z.setTextColor(getResources().getColor(2131099942));
        this.C.setBackgroundResource(2131230896);
        m0();
        this.B.setHint(getResources().getString(2131755207));
        q.b().c("unknow_type_select");
      case 2131296776:
        try {
          boolean bool = this.I;
          if (bool) {
            if (i1.a(getApplicationContext())) {
              f0();
              q.b().c("unknow_submit_comment_click");
            } else {
              Toast.makeText(getApplicationContext(), 2131755688, 0).show();
            } 
            CollectInfo collectInfo = new CollectInfo();
            this();
            collectInfo.setNumber(this.L);
            collectInfo.setUser_blocked("0");
            collectInfo.setUser_commented("1");
            if (this.R) {
              collectInfo.setUser_reported("1");
            } else {
              collectInfo.setUser_reported("0");
            } 
            collectInfo.setUser_upload_recording("0");
            com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          } else {
            String str1 = this.B.getText().toString();
            if (str1 != null && !"".equals(str1)) {
              if (i1.a(getApplicationContext())) {
                f0();
                q.b().c("unknow_submit_comment_click");
              } else {
                Toast.makeText(getApplicationContext(), 2131755688, 0).show();
              } 
              CollectInfo collectInfo = new CollectInfo();
              this();
              collectInfo.setNumber(this.L);
              collectInfo.setUser_blocked("0");
              collectInfo.setUser_commented("1");
              collectInfo.setUser_reported("0");
              collectInfo.setUser_upload_recording("0");
              com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296763:
        break;
    } 
    String str = this.D;
    if (str != null && !"".equals(str)) {
      this.M = "1";
    } else {
      this.M = "0";
    } 
    this.J = "";
    this.D = "";
    this.I = true;
    this.P.setVisibility(0);
    this.B.setHint(getResources().getString(2131755206));
    this.E.setImageResource(2131230948);
    this.v.setTextColor(this.U);
    this.G.setImageResource(2131230950);
    this.x.setTextColor(this.V);
    this.F.setImageResource(2131230952);
    this.w.setTextColor(this.V);
    this.H.setImageResource(2131230954);
    this.y.setTextColor(this.V);
    this.z.setTextColor(getResources().getColor(2131099942));
    this.C.setBackgroundResource(2131230896);
    m0();
    this.B.setHint(getResources().getString(2131755206));
    q.b().c("unknow_type_select");
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
      setContentView(2131492962);
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      View view = getWindow().getDecorView();
      a a1 = new a();
      this(this);
      view.post(a1);
      Display display = getWindowManager().getDefaultDisplay();
      WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
      int i = display.getWidth();
      double d = i;
      Double.isNaN(d);
      i = (int)(d * 1.0D);
      layoutParams.width = i;
      layoutParams.alpha = 1.0F;
      layoutParams.dimAmount = 0.0F;
      getWindow().setAttributes(layoutParams);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      if (this.S) {
        q.b().c("unknow_submit_comment_drop_out");
        if (this.I) {
          q.b().c("unknow_drop_out_select_type");
        } else if (!"".equals(this.B.getText().toString())) {
          q.b().c("unknow_drop_out_write_text");
        } else {
          q.b().c("unknow_drop_out_unselect");
        } 
      } 
      this.T.d();
      this.B.removeTextChangedListener(this.Y);
      this.Y = null;
      this.B.setOnEditorActionListener(null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      g0();
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
  
  class a implements Runnable {
    a(SubmitCommentActivity this$0) {}
    
    public void run() {
      SubmitCommentActivity.O(this.b);
      SubmitCommentActivity.R(this.b, g1.b());
      q.b().c("unknow_submit_comment_show");
      TextView textView = (TextView)this.b.findViewById(2131298187);
      ImageView imageView = (ImageView)this.b.findViewById(2131297127);
      this.b.findViewById(2131297486).setOnClickListener(this.b);
      imageView.setOnClickListener(this.b);
      textView.setTypeface(SubmitCommentActivity.P(this.b));
      SubmitCommentActivity.X(this.b);
      SubmitCommentActivity.Y(this.b);
    }
  }
  
  class b implements TextWatcher {
    b(SubmitCommentActivity this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      if (param1CharSequence != null && !"".equals(param1CharSequence.toString())) {
        q.b().c("unknow_write_comment");
        TextView textView = SubmitCommentActivity.Z(this.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1CharSequence.length());
        stringBuilder.append("/500");
        textView.setText(stringBuilder.toString());
        param1CharSequence = param1CharSequence.toString();
        if (param1CharSequence.length() >= 5 && !param1CharSequence.contains("http") && !param1CharSequence.contains("wwww.") && !i1.l0((String)param1CharSequence)) {
          SubmitCommentActivity.a0(this.b).setVisibility(8);
          SubmitCommentActivity.c0(this.b).setBackgroundResource(SubmitCommentActivity.b0(this.b));
          SubmitCommentActivity.Z(this.b).setTextColor(SubmitCommentActivity.d0(this.b));
        } else {
          SubmitCommentActivity.e0(this.b).setBackgroundResource(2131230896);
        } 
        if (param1CharSequence.length() >= 495) {
          SubmitCommentActivity.Z(this.b).setTextColor(SubmitCommentActivity.Q(this.b));
        } else {
          SubmitCommentActivity.Z(this.b).setTextColor(SubmitCommentActivity.d0(this.b));
        } 
      } else {
        SubmitCommentActivity.Z(this.b).setText("0/500");
      } 
    }
  }
  
  class c implements View.OnClickListener {
    c(SubmitCommentActivity this$0) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131296725) {
        if (i == 2131296767) {
          q.b().c("unknow_select_dialog_submit");
          SubmitCommentActivity.S(this.b).dismiss();
          if (i1.a(this.b.getApplicationContext())) {
            SubmitCommentActivity.T(this.b);
          } else {
            Toast.makeText(this.b.getApplicationContext(), 2131755688, 0).show();
          } 
        } 
      } else {
        q.b().c("unknow_select_dialog_cancel");
        SubmitCommentActivity.S(this.b).dismiss();
        this.b.finish();
        this.b.overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  class d implements o {
    d(SubmitCommentActivity this$0, String param1String1, long param1Long, String param1String2) {}
    
    public void a(String param1String1, String param1String2) {
      String str;
      if (param1String1 != null && !"".equals(param1String1) && param1String2 != null && !"".equals(param1String2)) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("call_time:");
          stringBuilder.append(param1String1);
          stringBuilder.append("\n");
          stringBuilder.append("is_answered:");
          stringBuilder.append(param1String2);
          d0.a("submitcomment", stringBuilder.toString());
        } 
        str = param1String1;
        param1String1 = param1String2;
      } else {
        str = "";
        param1String1 = str;
      } 
      g.a(this.a, this.b, str, param1String1, SubmitCommentActivity.U(this.d), SubmitCommentActivity.V(this.d), this.c, new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.i.f {
      a(SubmitCommentActivity.d this$0) {}
      
      public void a(String param2String) {
        if (param2String != null)
          try {
            if (!"".equals(param2String)) {
              JSONObject jSONObject = new JSONObject();
              this(param2String);
              if (jSONObject.getInt("status") == 1) {
                q.b().c("unknow_submit_comment_success");
                if (SubmitCommentActivity.U(this.a.d).equals("1"))
                  q.b().c("unknow_submit_comment_success_isnormal"); 
                if (SubmitCommentActivity.W(this.a.d))
                  q.b().c("unknow_submit_comment_success_isspam"); 
              } else {
                q.b().c("unknow_submit_comment_fail");
              } 
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          }  
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.i.f {
    a(SubmitCommentActivity this$0) {}
    
    public void a(String param1String) {
      if (param1String != null)
        try {
          if (!"".equals(param1String)) {
            JSONObject jSONObject = new JSONObject();
            this(param1String);
            if (jSONObject.getInt("status") == 1) {
              q.b().c("unknow_submit_comment_success");
              if (SubmitCommentActivity.U(this.a.d).equals("1"))
                q.b().c("unknow_submit_comment_success_isnormal"); 
              if (SubmitCommentActivity.W(this.a.d))
                q.b().c("unknow_submit_comment_success_isspam"); 
            } else {
              q.b().c("unknow_submit_comment_fail");
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
  
  class e implements com.allinone.callerid.i.a.i.c {
    e(SubmitCommentActivity this$0, String param1String1, String param1String2) {}
    
    public void a(String param1String) {
      if (param1String != null && "ok".equals(param1String)) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("s:");
          stringBuilder.append(param1String);
          d0.a("comment", stringBuilder.toString());
        } 
        com.allinone.callerid.i.a.a0.b.b(this.a, this.b, SubmitCommentActivity.V(this.c), new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.z.c {
      a(SubmitCommentActivity.e this$0) {}
      
      public void a(String param2String) {
        if (param2String != null && "ok".equals(param2String))
          i1.I0(this.a.c.getApplicationContext()); 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.z.c {
    a(SubmitCommentActivity this$0) {}
    
    public void a(String param1String) {
      if (param1String != null && "ok".equals(param1String))
        i1.I0(this.a.c.getApplicationContext()); 
    }
  }
  
  class f implements x.b {
    f(SubmitCommentActivity this$0) {}
    
    public void a() {}
    
    public void b() {
      q.b().c("unknow_submit_comment_click_home");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/comment/SubmitCommentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */