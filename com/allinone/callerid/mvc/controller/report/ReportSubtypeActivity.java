package com.allinone.callerid.mvc.controller.report;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.y;
import com.allinone.callerid.bean.ReportedContent;
import com.allinone.callerid.bean.SubType;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.customview.FlowLayoutManager;
import com.allinone.callerid.dialog.j;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.s0;
import com.allinone.callerid.util.v0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ReportSubtypeActivity extends BaseActivity implements View.OnClickListener {
  private boolean A;
  
  private View B;
  
  private TextView C;
  
  private Intent D;
  
  private FrameLayout E;
  
  private ArrayList<SubType> F;
  
  private TextView G;
  
  private ImageView H;
  
  private j I;
  
  private EZSearchResult J;
  
  private CallLogBean K = null;
  
  private boolean L = false;
  
  private BaseEditText M;
  
  private LinearLayout N;
  
  private LinearLayout O;
  
  private final String s = "ReportSubtypeActivity";
  
  private RelativeLayout t;
  
  private TextView u;
  
  private String v;
  
  private String w;
  
  private String x;
  
  private String y;
  
  private y z;
  
  private void c0(JSONObject paramJSONObject) {
    try {
      SubType subType = new SubType();
      this();
      String str = paramJSONObject.getString("subtype");
      if ("".equals(str) || str == null)
        return; 
      subType.setSubtype(str);
      subType.setSubtype_id(paramJSONObject.getString("subtype_id"));
      subType.setCount(paramJSONObject.getInt("count"));
      subType.setType(paramJSONObject.getString("type"));
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean = this.K;
      if (callLogBean != null && str.equals(callLogBean.H())) {
        subType.setCount(subType.getCount() + 1);
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult = this.J;
      if (eZSearchResult != null && str.equals(eZSearchResult.getSubtype_pdt())) {
        subType.setCount(subType.getCount() + 1);
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void d0() {
    ((ImageView)findViewById(2131297128)).setOnClickListener(this);
    this.M = (BaseEditText)findViewById(2131296644);
    TextView textView = (TextView)findViewById(2131297556);
    ((FrameLayout)findViewById(2131296779)).setOnClickListener(this);
    this.N = (LinearLayout)findViewById(2131297173);
    LinearLayout linearLayout = (LinearLayout)findViewById(2131297154);
    this.O = linearLayout;
    linearLayout.setVisibility(8);
  }
  
  private void e0(boolean paramBoolean) {
    if (paramBoolean) {
      SubType subType = new SubType();
      subType.setSubtype("Abandoned Call");
      subType.setSubtype_id("abandoned-call");
      subType.setType("Spam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean7 = this.K;
      if (callLogBean7 != null && "Abandoned Call".equals(callLogBean7.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult7 = this.J;
      if (eZSearchResult7 != null && "Abandoned Call".equals(eZSearchResult7.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      if (this.F.size() < 10)
        this.F.add(subType); 
      subType = new SubType();
      subType.setSubtype("Silent Call");
      subType.setSubtype_id("silent-call");
      subType.setType("Spam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean6 = this.K;
      if (callLogBean6 != null && "Silent call".equals(callLogBean6.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult6 = this.J;
      if (eZSearchResult6 != null && "Silent call".equals(eZSearchResult6.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      if (this.F.size() < 10)
        this.F.add(subType); 
      subType = new SubType();
      subType.setSubtype("Phishing Scam");
      subType.setSubtype_id("phishing-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean5 = this.K;
      if (callLogBean5 != null && "Phishing scam".equals(callLogBean5.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult5 = this.J;
      if (eZSearchResult5 != null && "Phishing scam".equals(eZSearchResult5.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      if (this.F.size() < 10)
        this.F.add(subType); 
      subType = new SubType();
      subType.setSubtype("Nuisance Call");
      subType.setSubtype_id("nuisance-call");
      subType.setType("Spam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean4 = this.K;
      if (callLogBean4 != null && "Nuisance call".equals(callLogBean4.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult4 = this.J;
      if (eZSearchResult4 != null && "Nuisance call".equals(eZSearchResult4.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      if (this.F.size() < 10)
        this.F.add(subType); 
      subType = new SubType();
      subType.setSubtype("Prizes Scam");
      subType.setSubtype_id("sweepstakes-lottery-prizes-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean3 = this.K;
      if (callLogBean3 != null && "Prizes scam".equals(callLogBean3.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult3 = this.J;
      if (eZSearchResult3 != null && "Prizes scam".equals(eZSearchResult3.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      if (this.F.size() < 10)
        this.F.add(subType); 
      subType = new SubType();
      subType.setSubtype("Travel Scam");
      subType.setSubtype_id("travel-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean2 = this.K;
      if (callLogBean2 != null && "Travel scam".equals(callLogBean2.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult2 = this.J;
      if (eZSearchResult2 != null && "Travel scam".equals(eZSearchResult2.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      if (this.F.size() < 10)
        this.F.add(subType); 
      CallLogBean callLogBean1 = this.K;
      if (callLogBean1 != null && !this.L && callLogBean1.H() != null && !"".equals(this.K.H())) {
        SubType subType1 = new SubType();
        subType1.setSubtype(this.K.H());
        subType1.setType("Spam");
        subType1.setTel_number(this.y);
        subType1.setCc(this.x);
        subType1.setIs_has_bg(true);
        subType1.setIs_custom(true);
        this.L = false;
        this.F.add(subType1);
      } 
      EZSearchResult eZSearchResult1 = this.J;
      if (eZSearchResult1 != null && !this.L && eZSearchResult1.getSubtype_pdt() != null && !"".equals(this.J.getSubtype_pdt())) {
        SubType subType1 = new SubType();
        subType1.setSubtype(this.J.getSubtype_pdt());
        subType1.setType("Spam");
        subType1.setTel_number(this.y);
        subType1.setCc(this.x);
        subType1.setIs_has_bg(true);
        subType1.setIs_custom(true);
        this.L = false;
        this.F.add(subType1);
      } 
    } else {
      SubType subType = new SubType();
      subType.setSubtype("Abandoned Call");
      subType.setSubtype_id("abandoned-call");
      subType.setType("Spam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean11 = this.K;
      if (callLogBean11 != null && "Abandoned Call".equals(callLogBean11.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult11 = this.J;
      if (eZSearchResult11 != null && "Abandoned Call".equals(eZSearchResult11.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("Loan Scam");
      subType.setSubtype_id("advance-fee-loan-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean10 = this.K;
      if (callLogBean10 != null && "Loan Scam".equals(callLogBean10.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult10 = this.J;
      if (eZSearchResult10 != null && "Loan Scam".equals(eZSearchResult10.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("Caller ID spoofing");
      subType.setSubtype_id("caller-id-spoofing");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean9 = this.K;
      if (callLogBean9 != null && "Caller ID spoofing".equals(callLogBean9.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult9 = this.J;
      if (eZSearchResult9 != null && "Caller ID spoofing".equals(eZSearchResult9.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("Charity Scam");
      subType.setSubtype_id("charity-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean8 = this.K;
      if (callLogBean8 != null && "Charity Scam".equals(callLogBean8.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult8 = this.J;
      if (eZSearchResult8 != null && "Charity Scam".equals(eZSearchResult8.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("Computer Scam");
      subType.setSubtype_id("computer-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean7 = this.K;
      if (callLogBean7 != null && "Computer Scam".equals(callLogBean7.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult7 = this.J;
      if (eZSearchResult7 != null && "Computer Scam".equals(eZSearchResult7.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("Credit Card Scam");
      subType.setSubtype_id("credit-card-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean6 = this.K;
      if (callLogBean6 != null && "Credit Card Scam".equals(callLogBean6.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult6 = this.J;
      if (eZSearchResult6 != null && "Credit Card Scam".equals(eZSearchResult6.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("Government Grant Scam");
      subType.setSubtype_id("government-grant-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean5 = this.K;
      if (callLogBean5 != null && "Government Grant Scam".equals(callLogBean5.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult5 = this.J;
      if (eZSearchResult5 != null && "Government Grant Scam".equals(eZSearchResult5.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("Debt Collection Scam");
      subType.setSubtype_id("debt-collection-scam");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean4 = this.K;
      if (callLogBean4 != null && "Debt Collection Scam".equals(callLogBean4.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult4 = this.J;
      if (eZSearchResult4 != null && "Debt Collection Scam".equals(eZSearchResult4.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("IRS Imposter");
      subType.setSubtype_id("irs-imposter");
      subType.setType("Scam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean3 = this.K;
      if (callLogBean3 != null && "IRS Imposter".equals(callLogBean3.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult3 = this.J;
      if (eZSearchResult3 != null && "IRS Imposter".equals(eZSearchResult3.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      subType = new SubType();
      subType.setSubtype("Silent Call");
      subType.setSubtype_id("silent-call");
      subType.setType("Spam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      CallLogBean callLogBean2 = this.K;
      if (callLogBean2 != null && "Silent Call".equals(callLogBean2.H())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      EZSearchResult eZSearchResult2 = this.J;
      if (eZSearchResult2 != null && "Silent Call".equals(eZSearchResult2.getSubtype_pdt())) {
        subType.setIs_has_bg(true);
        this.L = true;
      } 
      this.F.add(subType);
      CallLogBean callLogBean1 = this.K;
      if (callLogBean1 != null && !this.L && callLogBean1.H() != null && !"".equals(this.K.H())) {
        SubType subType1 = new SubType();
        subType1.setSubtype(this.K.H());
        subType1.setType("Spam");
        subType1.setTel_number(this.y);
        subType1.setCc(this.x);
        subType1.setIs_has_bg(true);
        subType1.setIs_custom(true);
        this.L = false;
        this.F.add(subType1);
      } 
      EZSearchResult eZSearchResult1 = this.J;
      if (eZSearchResult1 != null && !this.L && eZSearchResult1.getSubtype_pdt() != null && !"".equals(this.J.getSubtype_pdt())) {
        SubType subType1 = new SubType();
        subType1.setSubtype(this.J.getSubtype_pdt());
        subType1.setType("Spam");
        subType1.setTel_number(this.y);
        subType1.setCc(this.x);
        subType1.setIs_has_bg(true);
        subType1.setIs_custom(true);
        this.L = false;
        this.F.add(subType1);
      } 
    } 
  }
  
  private void f0() {
    Intent intent = new Intent();
    intent.putExtra("isrefush", true);
    setResult(119, intent);
  }
  
  private void g0(String paramString1, String paramString2) {
    if (paramString1 != null && !"".equals(paramString1))
      (j0.a()).b.execute(new b(this, paramString1, paramString2)); 
  }
  
  private String h0(String paramString) {
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = -1;
    switch (i) {
      case 2060815396:
        if (!paramString.equals("Charity scam"))
          break; 
        b = 13;
        break;
      case 1887935850:
        if (!paramString.equals("Abandoned Call"))
          break; 
        b = 12;
        break;
      case 1284587426:
        if (!paramString.equals("Travel scam"))
          break; 
        b = 11;
        break;
      case 1184402555:
        if (!paramString.equals("Prizes scam"))
          break; 
        b = 10;
        break;
      case -219491234:
        if (!paramString.equals("Nuisance call"))
          break; 
        b = 9;
        break;
      case -494032571:
        if (!paramString.equals("Credit Card Scam"))
          break; 
        b = 8;
        break;
      case -674292820:
        if (!paramString.equals("Loan Scam"))
          break; 
        b = 7;
        break;
      case -778967895:
        if (!paramString.equals("Caller ID spoofing"))
          break; 
        b = 6;
        break;
      case -1145426592:
        if (!paramString.equals("Phishing scam"))
          break; 
        b = 5;
        break;
      case -1169951569:
        if (!paramString.equals("Government Grant Scam"))
          break; 
        b = 4;
        break;
      case -1434186415:
        if (!paramString.equals("Debt Collection Scam"))
          break; 
        b = 3;
        break;
      case -1980433753:
        if (!paramString.equals("IRS Imposter"))
          break; 
        b = 2;
        break;
      case -2083787991:
        if (!paramString.equals("Silent call"))
          break; 
        b = 1;
        break;
      case -2140531615:
        if (!paramString.equals("Computer Scam"))
          break; 
        b = 0;
        break;
    } 
    String str = "is_spam";
    paramString = str;
    switch (b) {
      default:
        paramString = str;
        break;
      case 0:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 13:
        paramString = "is_scam";
        break;
      case 1:
      case 9:
      case 12:
        break;
    } 
    return paramString;
  }
  
  private void i0() {
    this.F = new ArrayList<SubType>();
    this.D = getIntent();
    Typeface typeface = g1.b();
    this.C = (TextView)findViewById(2131296352);
    TextView textView2 = (TextView)findViewById(2131297796);
    this.G = (TextView)findViewById(2131298156);
    this.H = (ImageView)findViewById(2131297074);
    textView2.setTypeface(typeface);
    this.G.setTypeface(typeface);
    this.t = (RelativeLayout)findViewById(2131297486);
    this.B = findViewById(2131297766);
    ImageView imageView = (ImageView)findViewById(2131297127);
    this.t.setOnClickListener(this);
    imageView.setOnClickListener(this);
    this.u = (TextView)findViewById(2131298158);
    TextView textView1 = (TextView)findViewById(2131298165);
    this.u.setTypeface(typeface);
    textView1.setTypeface(typeface);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131297186);
    this.E = (FrameLayout)findViewById(2131297198);
    frameLayout.setOnClickListener(this);
    this.E.setOnClickListener(this);
    RecyclerView recyclerView = (RecyclerView)findViewById(2131297452);
    this.z = new y((Context)this, new ArrayList());
    recyclerView.setLayoutManager((RecyclerView.o)new FlowLayoutManager((Context)this));
    recyclerView.setAdapter((RecyclerView.Adapter)this.z);
    this.z.K(new a(this));
  }
  
  private boolean j0(String paramString) {
    boolean bool = Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(paramString).find();
    boolean bool1 = true;
    if (bool) {
      Toast.makeText((Context)EZCallApplication.c(), getResources().getString(2131755028), 1).show();
    } else {
      bool1 = false;
    } 
    return bool1;
  }
  
  private void k0(Context paramContext, String paramString1, String paramString2, String paramString3) {
    try {
      if (i1.a(paramContext)) {
        String str1 = i1.W(paramContext);
        if (paramString2 == null || "".equals(paramString2)) {
          paramString2 = this.v;
          if (paramString2 != null && !"".equals(paramString2) && this.v.contains("_")) {
            paramString2 = this.v.split("_")[0];
          } else {
            paramString2 = p.d(paramContext).getCountry_code();
          } 
        } 
        String str2 = i1.Q(paramContext, paramString1);
        String str3 = i1.G();
        if (paramString1 != null && !"".equals(paramString1) && str1 != null && !"".equals(str1) && paramString2 != null && !"".equals(paramString2) && str2 != null && !"".equals(str2)) {
          s0 s0 = new s0();
          this(paramString1, "android", str1, paramString2, str2, str3, paramString3);
          s0.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void l0(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    if (i1.a(paramContext)) {
      String str2 = i1.W(paramContext);
      if (paramString5 == null || "".equals(paramString5))
        if (paramString2 != null && !"".equals(paramString2)) {
          paramString5 = paramString2.split("_")[0];
        } else {
          paramString5 = p.d(paramContext).getCountry_code();
        }  
      String str3 = i1.Q(paramContext, paramString1);
      String str1 = i1.G();
      if (paramString1 != null && !"".equals(paramString1) && str2 != null && !"".equals(str2) && paramString5 != null && !"".equals(paramString5) && str3 != null && !"".equals(str3))
        (new v0(paramString1, "android", str2, paramString5, str3, str1, paramString2, paramString3, paramString4)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]); 
    } 
  }
  
  private void m0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield D : Landroid/content/Intent;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 694
    //   9: aload_0
    //   10: aload_1
    //   11: ldc_w 'contact_subtype'
    //   14: invokevirtual getParcelableExtra : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   17: checkcast com/allinone/callerid/search/EZSearchResult
    //   20: putfield J : Lcom/allinone/callerid/search/EZSearchResult;
    //   23: aload_0
    //   24: getfield D : Landroid/content/Intent;
    //   27: astore_1
    //   28: iconst_0
    //   29: istore_2
    //   30: aload_0
    //   31: aload_1
    //   32: ldc_w 'is_answer_end'
    //   35: iconst_0
    //   36: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   39: putfield A : Z
    //   42: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   45: ldc_w 'subtype_shownun'
    //   48: invokevirtual c : (Ljava/lang/String;)V
    //   51: aload_0
    //   52: getfield J : Lcom/allinone/callerid/search/EZSearchResult;
    //   55: ifnonnull -> 87
    //   58: aload_0
    //   59: aload_0
    //   60: getfield D : Landroid/content/Intent;
    //   63: ldc_w 'contact_subtype_activity'
    //   66: invokevirtual getParcelableExtra : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   69: checkcast com/allinone/callerid/search/CallLogBean
    //   72: putfield K : Lcom/allinone/callerid/search/CallLogBean;
    //   75: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   78: ldc_w 'subtype_pdt_show'
    //   81: invokevirtual c : (Ljava/lang/String;)V
    //   84: goto -> 122
    //   87: aload_0
    //   88: getfield t : Landroid/widget/RelativeLayout;
    //   91: aload_0
    //   92: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   95: ldc_w 2131099683
    //   98: invokevirtual getColor : (I)I
    //   101: invokevirtual setBackgroundColor : (I)V
    //   104: aload_0
    //   105: getfield B : Landroid/view/View;
    //   108: bipush #8
    //   110: invokevirtual setVisibility : (I)V
    //   113: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   116: ldc_w 'subtype_it_show'
    //   119: invokevirtual c : (Ljava/lang/String;)V
    //   122: aload_0
    //   123: getfield J : Lcom/allinone/callerid/search/EZSearchResult;
    //   126: astore_1
    //   127: aload_1
    //   128: ifnonnull -> 140
    //   131: aload_0
    //   132: getfield K : Lcom/allinone/callerid/search/CallLogBean;
    //   135: astore_3
    //   136: aload_3
    //   137: ifnull -> 694
    //   140: aload_1
    //   141: ifnull -> 333
    //   144: aload_0
    //   145: aload_1
    //   146: invokevirtual getT_p : ()Ljava/lang/String;
    //   149: putfield v : Ljava/lang/String;
    //   152: aload_0
    //   153: aload_0
    //   154: getfield J : Lcom/allinone/callerid/search/EZSearchResult;
    //   157: invokevirtual getOld_tel_number : ()Ljava/lang/String;
    //   160: putfield w : Ljava/lang/String;
    //   163: aload_0
    //   164: aload_0
    //   165: getfield J : Lcom/allinone/callerid/search/EZSearchResult;
    //   168: invokevirtual getTel_number : ()Ljava/lang/String;
    //   171: putfield y : Ljava/lang/String;
    //   174: aload_0
    //   175: aload_0
    //   176: getfield J : Lcom/allinone/callerid/search/EZSearchResult;
    //   179: invokevirtual getSubtype_cc : ()Ljava/lang/String;
    //   182: putfield x : Ljava/lang/String;
    //   185: aload_0
    //   186: getfield J : Lcom/allinone/callerid/search/EZSearchResult;
    //   189: invokevirtual getSubtype : ()Ljava/lang/String;
    //   192: astore_3
    //   193: aload_0
    //   194: getfield G : Landroid/widget/TextView;
    //   197: aload_0
    //   198: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   201: ldc_w 2131755681
    //   204: invokevirtual getString : (I)Ljava/lang/String;
    //   207: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   210: aload_0
    //   211: getfield H : Landroid/widget/ImageView;
    //   214: ldc_w 2131231248
    //   217: invokevirtual setImageResource : (I)V
    //   220: aload_3
    //   221: ifnull -> 325
    //   224: ldc ''
    //   226: aload_3
    //   227: invokevirtual equals : (Ljava/lang/Object;)Z
    //   230: ifne -> 325
    //   233: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   236: ldc_w 'subtype_haschildshow'
    //   239: invokevirtual c : (Ljava/lang/String;)V
    //   242: new org/json/JSONArray
    //   245: astore_1
    //   246: aload_1
    //   247: aload_3
    //   248: invokespecial <init> : (Ljava/lang/String;)V
    //   251: iconst_0
    //   252: istore #4
    //   254: iload #4
    //   256: aload_1
    //   257: invokevirtual length : ()I
    //   260: if_icmpge -> 282
    //   263: aload_0
    //   264: aload_1
    //   265: iload #4
    //   267: invokevirtual get : (I)Ljava/lang/Object;
    //   270: checkcast org/json/JSONObject
    //   273: invokespecial c0 : (Lorg/json/JSONObject;)V
    //   276: iinc #4, 1
    //   279: goto -> 254
    //   282: aload_0
    //   283: getfield F : Ljava/util/ArrayList;
    //   286: astore_1
    //   287: aload_1
    //   288: ifnull -> 317
    //   291: aload_1
    //   292: invokevirtual size : ()I
    //   295: ifle -> 317
    //   298: aload_0
    //   299: getfield F : Ljava/util/ArrayList;
    //   302: astore_1
    //   303: new com/allinone/callerid/mvc/controller/report/ReportSubtypeActivity$d
    //   306: astore_3
    //   307: aload_3
    //   308: aload_0
    //   309: invokespecial <init> : (Lcom/allinone/callerid/mvc/controller/report/ReportSubtypeActivity;)V
    //   312: aload_1
    //   313: aload_3
    //   314: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   317: aload_0
    //   318: iconst_1
    //   319: invokespecial e0 : (Z)V
    //   322: goto -> 553
    //   325: aload_0
    //   326: iconst_0
    //   327: invokespecial e0 : (Z)V
    //   330: goto -> 553
    //   333: aload_0
    //   334: aload_0
    //   335: getfield K : Lcom/allinone/callerid/search/CallLogBean;
    //   338: invokevirtual I : ()Ljava/lang/String;
    //   341: putfield v : Ljava/lang/String;
    //   344: aload_0
    //   345: aload_0
    //   346: getfield K : Lcom/allinone/callerid/search/CallLogBean;
    //   349: invokevirtual s : ()Ljava/lang/String;
    //   352: putfield w : Ljava/lang/String;
    //   355: aload_0
    //   356: aload_0
    //   357: getfield K : Lcom/allinone/callerid/search/CallLogBean;
    //   360: invokevirtual J : ()Ljava/lang/String;
    //   363: putfield y : Ljava/lang/String;
    //   366: aload_0
    //   367: aload_0
    //   368: getfield K : Lcom/allinone/callerid/search/CallLogBean;
    //   371: invokevirtual G : ()Ljava/lang/String;
    //   374: putfield x : Ljava/lang/String;
    //   377: aload_0
    //   378: getfield K : Lcom/allinone/callerid/search/CallLogBean;
    //   381: invokevirtual F : ()Ljava/lang/String;
    //   384: astore_1
    //   385: aload_0
    //   386: getfield C : Landroid/widget/TextView;
    //   389: bipush #8
    //   391: invokevirtual setVisibility : (I)V
    //   394: aload_0
    //   395: getfield G : Landroid/widget/TextView;
    //   398: aload_0
    //   399: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   402: ldc_w 2131755478
    //   405: invokevirtual getString : (I)Ljava/lang/String;
    //   408: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   411: aload_0
    //   412: getfield H : Landroid/widget/ImageView;
    //   415: ldc_w 2131231250
    //   418: invokevirtual setImageResource : (I)V
    //   421: ldc ''
    //   423: aload_0
    //   424: getfield K : Lcom/allinone/callerid/search/CallLogBean;
    //   427: invokevirtual H : ()Ljava/lang/String;
    //   430: invokevirtual equals : (Ljava/lang/Object;)Z
    //   433: ifeq -> 452
    //   436: aload_0
    //   437: ldc_w '1'
    //   440: putfield x : Ljava/lang/String;
    //   443: aload_0
    //   444: getfield E : Landroid/widget/FrameLayout;
    //   447: bipush #8
    //   449: invokevirtual setVisibility : (I)V
    //   452: aload_1
    //   453: ifnull -> 548
    //   456: ldc ''
    //   458: aload_1
    //   459: invokevirtual equals : (Ljava/lang/Object;)Z
    //   462: ifne -> 548
    //   465: new org/json/JSONArray
    //   468: astore_3
    //   469: aload_3
    //   470: aload_1
    //   471: invokespecial <init> : (Ljava/lang/String;)V
    //   474: iconst_0
    //   475: istore #4
    //   477: iload #4
    //   479: aload_3
    //   480: invokevirtual length : ()I
    //   483: if_icmpge -> 505
    //   486: aload_0
    //   487: aload_3
    //   488: iload #4
    //   490: invokevirtual get : (I)Ljava/lang/Object;
    //   493: checkcast org/json/JSONObject
    //   496: invokespecial c0 : (Lorg/json/JSONObject;)V
    //   499: iinc #4, 1
    //   502: goto -> 477
    //   505: aload_0
    //   506: getfield F : Ljava/util/ArrayList;
    //   509: astore_1
    //   510: aload_1
    //   511: ifnull -> 540
    //   514: aload_1
    //   515: invokevirtual size : ()I
    //   518: ifle -> 540
    //   521: aload_0
    //   522: getfield F : Ljava/util/ArrayList;
    //   525: astore_1
    //   526: new com/allinone/callerid/mvc/controller/report/ReportSubtypeActivity$e
    //   529: astore_3
    //   530: aload_3
    //   531: aload_0
    //   532: invokespecial <init> : (Lcom/allinone/callerid/mvc/controller/report/ReportSubtypeActivity;)V
    //   535: aload_1
    //   536: aload_3
    //   537: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   540: aload_0
    //   541: iconst_1
    //   542: invokespecial e0 : (Z)V
    //   545: goto -> 553
    //   548: aload_0
    //   549: iconst_0
    //   550: invokespecial e0 : (Z)V
    //   553: aload_0
    //   554: getfield F : Ljava/util/ArrayList;
    //   557: astore_1
    //   558: aload_1
    //   559: ifnull -> 656
    //   562: aload_1
    //   563: invokevirtual size : ()I
    //   566: ifle -> 656
    //   569: iload_2
    //   570: istore #4
    //   572: iload #4
    //   574: aload_0
    //   575: getfield F : Ljava/util/ArrayList;
    //   578: invokevirtual size : ()I
    //   581: if_icmpge -> 656
    //   584: aload_0
    //   585: getfield F : Ljava/util/ArrayList;
    //   588: invokevirtual size : ()I
    //   591: iconst_1
    //   592: isub
    //   593: istore_2
    //   594: iload_2
    //   595: iload #4
    //   597: if_icmple -> 650
    //   600: aload_0
    //   601: getfield F : Ljava/util/ArrayList;
    //   604: iload #4
    //   606: invokevirtual get : (I)Ljava/lang/Object;
    //   609: checkcast com/allinone/callerid/bean/SubType
    //   612: invokevirtual getSubtype_id : ()Ljava/lang/String;
    //   615: aload_0
    //   616: getfield F : Ljava/util/ArrayList;
    //   619: iload_2
    //   620: invokevirtual get : (I)Ljava/lang/Object;
    //   623: checkcast com/allinone/callerid/bean/SubType
    //   626: invokevirtual getSubtype_id : ()Ljava/lang/String;
    //   629: invokevirtual equals : (Ljava/lang/Object;)Z
    //   632: ifeq -> 644
    //   635: aload_0
    //   636: getfield F : Ljava/util/ArrayList;
    //   639: iload_2
    //   640: invokevirtual remove : (I)Ljava/lang/Object;
    //   643: pop
    //   644: iinc #2, -1
    //   647: goto -> 594
    //   650: iinc #4, 1
    //   653: goto -> 572
    //   656: aload_0
    //   657: getfield u : Landroid/widget/TextView;
    //   660: aload_0
    //   661: getfield w : Ljava/lang/String;
    //   664: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   667: aload_0
    //   668: getfield z : Lcom/allinone/callerid/b/y;
    //   671: aload_0
    //   672: getfield F : Ljava/util/ArrayList;
    //   675: iconst_1
    //   676: invokevirtual A : (Ljava/util/ArrayList;Z)V
    //   679: aload_0
    //   680: getfield z : Lcom/allinone/callerid/b/y;
    //   683: invokevirtual i : ()V
    //   686: goto -> 694
    //   689: astore_1
    //   690: aload_1
    //   691: invokevirtual printStackTrace : ()V
    //   694: return
    // Exception table:
    //   from	to	target	type
    //   0	5	689	java/lang/Exception
    //   9	28	689	java/lang/Exception
    //   30	84	689	java/lang/Exception
    //   87	122	689	java/lang/Exception
    //   122	127	689	java/lang/Exception
    //   131	136	689	java/lang/Exception
    //   144	220	689	java/lang/Exception
    //   224	251	689	java/lang/Exception
    //   254	276	689	java/lang/Exception
    //   282	287	689	java/lang/Exception
    //   291	317	689	java/lang/Exception
    //   317	322	689	java/lang/Exception
    //   325	330	689	java/lang/Exception
    //   333	452	689	java/lang/Exception
    //   456	474	689	java/lang/Exception
    //   477	499	689	java/lang/Exception
    //   505	510	689	java/lang/Exception
    //   514	540	689	java/lang/Exception
    //   540	545	689	java/lang/Exception
    //   548	553	689	java/lang/Exception
    //   553	558	689	java/lang/Exception
    //   562	569	689	java/lang/Exception
    //   572	594	689	java/lang/Exception
    //   600	644	689	java/lang/Exception
    //   656	686	689	java/lang/Exception
  }
  
  private void n0() {
    try {
      if (Build.VERSION.SDK_INT >= 23) {
        if (Settings.canDrawOverlays((Context)EZCallApplication.c()))
          o0(); 
      } else {
        o0();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void o0() {
    j j1 = new j((Context)EZCallApplication.c(), 2131820783, new c(this));
    this.I = j1;
    try {
      if (Build.VERSION.SDK_INT >= 26) {
        j1.getWindow().setType(2038);
      } else {
        j1.getWindow().setType(2010);
      } 
      this.I.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void p0(String paramString) {
    Intent intent = new Intent();
    intent.putExtra("edittype", paramString);
    setResult(120, intent);
  }
  
  private void q0(SubType paramSubType, boolean paramBoolean1, boolean paramBoolean2) {
    com.allinone.callerid.i.a.v.f.a(paramSubType, paramBoolean1, paramBoolean2, this.w, this.K);
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297486:
        if (this.O.getVisibility() == 0) {
          this.O.setVisibility(8);
          this.N.setVisibility(0);
          (new Handler()).postDelayed(new f(this), 121L);
        } else {
          if (this.J != null)
            q.b().c("subtype_it_back"); 
          if (this.A)
            moveTaskToBack(true); 
          finish();
          overridePendingTransition(0, 2130772041);
        } 
      case 2131297198:
        if (this.J != null) {
          if (!i1.v0(this.w)) {
            try {
              Intent intent = new Intent();
              this("android.intent.action.INSERT_OR_EDIT");
              intent.setType("vnd.android.cursor.item/contact");
              intent.putExtra("phone", this.w);
              startActivity(intent);
            } catch (Exception exception) {
              exception.printStackTrace();
              try {
                Intent intent = new Intent();
                this("android.intent.action.INSERT");
                intent.setType("vnd.android.cursor.dir/person");
                intent.setType("vnd.android.cursor.dir/contact");
                intent.setType("vnd.android.cursor.dir/raw_contact");
                intent.putExtra("phone_type", 2);
                intent.putExtra("phone", this.w);
                startActivity(intent);
              } catch (Exception exception1) {
                exception1.printStackTrace();
              } 
            } 
          } else {
            Toast.makeText((Context)EZCallApplication.c(), getResources().getString(2131755829), 0).show();
          } 
          finish();
        } else {
          q.b().c("subtype_deletechild");
          q0(null, false, false);
          Intent intent = new Intent();
          intent.setAction("com.allinone.callerid.RELOAD_DATA");
          b.p.a.a.b(getApplicationContext()).d(intent);
          f0();
          finish();
        } 
      case 2131297186:
        this.N.setVisibility(8);
        this.O.setVisibility(0);
        this.M.setFocusable(true);
        this.M.setFocusableInTouchMode(true);
        this.M.requestFocus();
        this.M.findFocus();
        (new Handler()).postDelayed(new h(this), 121L);
      case 2131297127:
        if (this.J != null)
          q.b().c("subtype_it_close"); 
        if (this.A)
          moveTaskToBack(true); 
        finish();
        overridePendingTransition(0, 2130772041);
      case 2131297128:
        this.O.setVisibility(8);
        this.N.setVisibility(0);
        (new Handler()).postDelayed(new g(this), 121L);
      case 2131296779:
        break;
    } 
    String str = this.M.getText().toString();
    if (TextUtils.isEmpty(str))
      Toast.makeText((Context)EZCallApplication.c(), getResources().getString(2131755026), 0).show(); 
    if (str.length() > 100)
      Toast.makeText((Context)EZCallApplication.c(), getResources().getString(2131755027), 0).show(); 
    if (!j0(str)) {
      SubType subType = new SubType();
      subType.setSubtype(str);
      subType.setType("Spam");
      subType.setTel_number(this.y);
      subType.setCc(this.x);
      q0(subType, true, false);
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.RELOAD_DATA");
      b.p.a.a.b(getApplicationContext()).d(intent);
      if (this.J != null) {
        q.b().c("subtype_it_commitnewtype");
      } else {
        p0(str);
        CallLogBean callLogBean = this.K;
        if (callLogBean != null && !"".equals(callLogBean.H()))
          q.b().c("subtype_editchild"); 
      } 
      n0();
      k0(getApplicationContext(), this.y, this.x, str);
      finish();
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
    setContentView(2131492953);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    i0();
    m0();
    try {
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
    d0();
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      this.M.setOnEditorActionListener(null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      if (this.O.getVisibility() == 0) {
        this.O.setVisibility(8);
        this.N.setVisibility(0);
        (new Handler()).postDelayed(new i(this), 121L);
      } else {
        if (this.J != null)
          q.b().c("subtype_it_back"); 
        if (this.A)
          moveTaskToBack(true); 
        finish();
        overridePendingTransition(0, 2130772041);
      } 
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    q.b().c("subtype_activity");
    super.onResume();
  }
  
  class a implements y.b {
    a(ReportSubtypeActivity this$0) {}
    
    public void a(SubType param1SubType, boolean param1Boolean) {
      if (param1Boolean && ReportSubtypeActivity.O(this.a) != null)
        q.b().c("subtype_it_mark"); 
      if (!param1Boolean && ReportSubtypeActivity.P(this.a) != null)
        q.b().c("subtype_deletechild"); 
      ReportSubtypeActivity.U(this.a, param1SubType, param1Boolean, true);
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.RELOAD_DATA");
      b.p.a.a.b(this.a.getApplicationContext()).d(intent);
      if (param1Boolean) {
        this.a.runOnUiThread(new a(this));
        ReportSubtypeActivity reportSubtypeActivity1 = this.a;
        ReportSubtypeActivity.Y(reportSubtypeActivity1, (Context)reportSubtypeActivity1.getApplication(), param1SubType.getTel_number(), ReportSubtypeActivity.W(this.a), param1SubType.getSubtype_id(), param1SubType.getType(), ReportSubtypeActivity.X(this.a));
        String str = ReportSubtypeActivity.Z(this.a, param1SubType.getSubtype());
        ReportSubtypeActivity reportSubtypeActivity2 = this.a;
        ReportSubtypeActivity.b0(reportSubtypeActivity2, ReportSubtypeActivity.a0(reportSubtypeActivity2), str);
        ReportSubtypeActivity.Q(this.a, param1SubType.getSubtype());
      } else {
        ReportSubtypeActivity.R(this.a);
      } 
      this.a.finish();
    }
    
    class a implements Runnable {
      a(ReportSubtypeActivity.a this$0) {}
      
      public void run() {
        ReportSubtypeActivity.V(this.b.a);
      }
    }
  }
  
  class a implements Runnable {
    a(ReportSubtypeActivity this$0) {}
    
    public void run() {
      ReportSubtypeActivity.V(this.b.a);
    }
  }
  
  class b implements Runnable {
    b(ReportSubtypeActivity this$0, String param1String1, String param1String2) {}
    
    public void run() {
      try {
        b1.O1(b1.i0() + 1);
        ReportedContent reportedContent = new ReportedContent();
        this();
        reportedContent.setNumber(this.b);
        reportedContent.setType(this.c);
        reportedContent.setTime(System.currentTimeMillis());
        com.allinone.callerid.f.g.a().c(reportedContent);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class c implements View.OnClickListener {
    c(ReportSubtypeActivity this$0) {}
    
    public void onClick(View param1View) {
      if (param1View.getId() == 2131297129)
        ReportSubtypeActivity.S(this.b).dismiss(); 
    }
  }
  
  class d implements Comparator<SubType> {
    d(ReportSubtypeActivity this$0) {}
    
    public int a(SubType param1SubType1, SubType param1SubType2) {
      return param1SubType2.getCount() - param1SubType1.getCount();
    }
  }
  
  class e implements Comparator<SubType> {
    e(ReportSubtypeActivity this$0) {}
    
    public int a(SubType param1SubType1, SubType param1SubType2) {
      return param1SubType2.getCount() - param1SubType1.getCount();
    }
  }
  
  class f implements Runnable {
    f(ReportSubtypeActivity this$0) {}
    
    public void run() {
      try {
        InputMethodManager inputMethodManager = (InputMethodManager)ReportSubtypeActivity.T(this.b).getContext().getSystemService("input_method");
        if (inputMethodManager != null)
          inputMethodManager.hideSoftInputFromWindow(ReportSubtypeActivity.T(this.b).getWindowToken(), 0); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements Runnable {
    g(ReportSubtypeActivity this$0) {}
    
    public void run() {
      try {
        InputMethodManager inputMethodManager = (InputMethodManager)ReportSubtypeActivity.T(this.b).getContext().getSystemService("input_method");
        if (inputMethodManager != null)
          inputMethodManager.hideSoftInputFromWindow(ReportSubtypeActivity.T(this.b).getWindowToken(), 0); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class h implements Runnable {
    h(ReportSubtypeActivity this$0) {}
    
    public void run() {
      InputMethodManager inputMethodManager = (InputMethodManager)ReportSubtypeActivity.T(this.b).getContext().getSystemService("input_method");
      if (inputMethodManager != null)
        inputMethodManager.toggleSoftInput(0, 2); 
    }
  }
  
  class i implements Runnable {
    i(ReportSubtypeActivity this$0) {}
    
    public void run() {
      try {
        InputMethodManager inputMethodManager = (InputMethodManager)ReportSubtypeActivity.T(this.b).getContext().getSystemService("input_method");
        if (inputMethodManager != null)
          inputMethodManager.hideSoftInputFromWindow(ReportSubtypeActivity.T(this.b).getWindowToken(), 0); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/report/ReportSubtypeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */