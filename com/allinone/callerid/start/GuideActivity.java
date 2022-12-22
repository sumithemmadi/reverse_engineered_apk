package com.allinone.callerid.start;

import android.app.Activity;
import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.b.n;
import com.allinone.callerid.b.x;
import com.allinone.callerid.customview.CirclePageIndicator;
import com.allinone.callerid.d.f.f;
import com.allinone.callerid.g.f;
import com.allinone.callerid.g.g;
import com.allinone.callerid.g.h;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.CustomViewPager;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZCountryCode;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.permission.OverlayPerActivity;
import com.allinone.callerid.mvc.controller.permission.RequestPermissionActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.t;
import com.allinone.callerid.util.x;
import java.util.Iterator;
import java.util.List;

public class GuideActivity extends BaseActivity {
  private final String s = "GuideActivity";
  
  private TextView t;
  
  private Typeface u;
  
  private boolean v;
  
  private List<EZCountryCode> w;
  
  private EZCountryCode x;
  
  private x y;
  
  private androidx.appcompat.app.a z;
  
  private void Z() {
    t.a();
    Intent intent = new Intent();
    if (com.allinone.callerid.util.k1.a.f()) {
      intent.setClass((Context)this, MainActivity.class);
    } else {
      intent.setClass((Context)this, OverlayPerActivity.class);
    } 
    startActivity(intent);
    overridePendingTransition(2130771968, 2130771969);
    finish();
  }
  
  private int a0() {
    try {
      String str = p.b((Context)EZCallApplication.c());
      boolean bool = d0.a;
      if (bool) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("countryISO=");
        stringBuilder.append(str);
        d0.a("country", stringBuilder.toString());
      } 
      if (str == null || str.equals("")) {
        str = i1.E();
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("country=");
          stringBuilder.append(str);
          d0.a("country", stringBuilder.toString());
        } 
        if (str == null || str.equals("")) {
          String str1 = i1.K(getApplicationContext());
          if (str1 == null || str1.equals(""))
            return 0; 
          for (EZCountryCode eZCountryCode : this.w) {
            String str2 = eZCountryCode.getIso_code().split("/")[0];
            if (str1.equals(str2)) {
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("countryISO:");
                stringBuilder.append(str);
                stringBuilder.append("    ");
                stringBuilder.append("tempISO:");
                stringBuilder.append(str2);
                d0.a("country", stringBuilder.toString());
              } 
              this.x = eZCountryCode;
              return 1;
            } 
          } 
          return 2;
        } 
        Iterator<EZCountryCode> iterator1 = this.w.iterator();
        while (iterator1.hasNext()) {
          EZCountryCode eZCountryCode = iterator1.next();
          String str1 = eZCountryCode.getIso_code().split("/")[0];
          if (str.equals(str1)) {
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("countryISO:");
              stringBuilder.append(str);
              stringBuilder.append("    ");
              stringBuilder.append("tempISO:");
              stringBuilder.append(str1);
              d0.a("country", stringBuilder.toString());
            } 
            this.x = eZCountryCode;
            return 1;
          } 
        } 
        return 2;
      } 
      Iterator<EZCountryCode> iterator = this.w.iterator();
      while (iterator.hasNext()) {
        EZCountryCode eZCountryCode = iterator.next();
        String str1 = eZCountryCode.getIso_code().split("/")[0];
        if (str.equals(str1)) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("countryISO:");
            stringBuilder.append(str);
            stringBuilder.append("    ");
            stringBuilder.append("tempISO:");
            stringBuilder.append(str1);
            d0.a("country", stringBuilder.toString());
          } 
          this.x = eZCountryCode;
          return 1;
        } 
      } 
      return 2;
    } catch (Exception exception) {
      exception.printStackTrace();
      return 2;
    } 
  }
  
  private List<EZCountryCode> b0() {
    try {
      return p.a((Context)this);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  private String c0(String paramString) {
    if ("English".equals(paramString)) {
      paramString = "en";
    } else if ("हिन्दी".equals(paramString)) {
      paramString = "hi";
    } else if ("বাংলা ভাষা".equals(paramString)) {
      paramString = "bn";
    } else if ("فارسی".equals(paramString)) {
      paramString = "fa";
    } else if ("русский".equals(paramString)) {
      paramString = "ru";
    } else if ("Türk".equals(paramString)) {
      paramString = "tr";
    } else if ("Indonesia".equals(paramString)) {
      paramString = "in";
    } else if ("Melayu".equals(paramString)) {
      paramString = "ms";
    } else if ("简体中文".equals(paramString)) {
      paramString = "zh";
    } else if ("العربية".equals(paramString)) {
      paramString = "ar";
    } else if ("Espanol".equals(paramString)) {
      paramString = "es";
    } else if ("Português".equals(paramString)) {
      paramString = "pt";
    } else if ("ภาษาไทย".equals(paramString)) {
      paramString = "th";
    } else if ("עִבְרִית".equals(paramString)) {
      paramString = "iw";
    } else if ("Deutsch".equals(paramString)) {
      paramString = "de";
    } else if ("繁体中文".equals(paramString)) {
      paramString = "zh-TW";
    } else if ("Français".equals(paramString)) {
      paramString = "fr";
    } else if ("한국어".equals(paramString)) {
      paramString = "ko";
    } else if ("Tiếng Việt".equals(paramString)) {
      paramString = "vi";
    } else if ("қазақ тілі".equals(paramString)) {
      paramString = "kk";
    } else if ("Italiano".equals(paramString)) {
      paramString = "it";
    } else if ("Ελληνικά".equals(paramString)) {
      paramString = "el";
    } else if ("বతెలుగు".equals(paramString)) {
      paramString = "te";
    } else if ("اردو".equals(paramString)) {
      paramString = "ur";
    } else {
      paramString = null;
    } 
    return paramString;
  }
  
  private void d0() {
    try {
      TextView textView1 = (TextView)findViewById(2131298111);
      TextView textView2 = (TextView)findViewById(2131298046);
      TextView textView3 = (TextView)findViewById(2131298112);
      TextView textView4 = (TextView)findViewById(2131297801);
      TextView textView5 = (TextView)findViewById(2131297830);
      RelativeLayout relativeLayout = (RelativeLayout)findViewById(2131297485);
      this.t = (TextView)findViewById(2131297847);
      FrameLayout frameLayout = (FrameLayout)findViewById(2131296815);
      CustomViewPager customViewPager = (CustomViewPager)findViewById(2131298267);
      CirclePageIndicator circlePageIndicator = (CirclePageIndicator)findViewById(2131298268);
      n n = new n();
      this(s());
      f f = new f();
      this();
      n.y((Fragment)f, "");
      h h = new h();
      this();
      n.y((Fragment)h, "");
      g g = new g();
      this();
      n.y((Fragment)g, "");
      customViewPager.setAdapter((androidx.viewpager.widget.a)n);
      float f1 = (getResources().getDisplayMetrics()).density;
      circlePageIndicator.setRadius(4.0F * f1);
      circlePageIndicator.setPageColor(getResources().getColor(2131099939));
      circlePageIndicator.setFillColor(getResources().getColor(2131099706));
      circlePageIndicator.setStrokeColor(getResources().getColor(2131099939));
      circlePageIndicator.setPaddind(f1 * 10.0F);
      circlePageIndicator.setViewPager((ViewPager)customViewPager);
      textView1.setTypeface(this.u);
      textView2.setTypeface(this.u);
      textView3.setTypeface(this.u);
      textView4.setTypeface(this.u);
      textView5.setTypeface(this.u);
      this.t.setTypeface(this.u);
      textView2.setMovementMethod(LinkMovementMethod.getInstance());
      textView3.setMovementMethod(LinkMovementMethod.getInstance());
      a a1 = new a();
      this(this);
      frameLayout.setOnClickListener(a1);
      b b = new b();
      this(this);
      relativeLayout.setOnClickListener(b);
      h0();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void e0() {
    x x1 = new x((Context)this);
    this.y = x1;
    x1.b(new e(this));
    this.y.c();
  }
  
  private void f0(boolean paramBoolean) {
    Intent intent = new Intent();
    intent.setClass((Context)this, RequestPermissionActivity.class);
    intent.putExtra("isShowDefault", paramBoolean);
    startActivity(intent);
    overridePendingTransition(2130771968, 2130771969);
    finish();
  }
  
  private void g0() {
    View view = LayoutInflater.from((Context)this).inflate(2131493175, null);
    ListView listView = (ListView)view.findViewById(2131297660);
    ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
    double d = getWindowManager().getDefaultDisplay().getHeight();
    Double.isNaN(d);
    layoutParams.height = (int)(d * 0.75D);
    listView.setLayoutParams(layoutParams);
    String[] arrayOfString = new String[24];
    arrayOfString[0] = "English";
    arrayOfString[1] = "Deutsch";
    arrayOfString[2] = "Espanol";
    arrayOfString[3] = "Português";
    arrayOfString[4] = "Indonesia";
    arrayOfString[5] = "Melayu";
    arrayOfString[6] = "हिन्दी";
    arrayOfString[7] = "বతెలుగు";
    arrayOfString[8] = "עִבְרִית";
    arrayOfString[9] = "ภาษาไทย";
    arrayOfString[10] = "العربية";
    arrayOfString[11] = "русский";
    arrayOfString[12] = "Français";
    arrayOfString[13] = "Türk";
    arrayOfString[14] = "한국어";
    arrayOfString[15] = "বাংলা ভাষা";
    arrayOfString[16] = "فارسی";
    arrayOfString[17] = "Tiếng Việt";
    arrayOfString[18] = "қазақ тілі";
    arrayOfString[19] = "Italiano";
    arrayOfString[20] = "Ελληνικά";
    arrayOfString[21] = "اردو";
    arrayOfString[22] = "简体中文";
    arrayOfString[23] = "繁体中文";
    listView.setAdapter((ListAdapter)new x((Context)this, arrayOfString, listView));
    listView.setOnItemClickListener(new c(this, arrayOfString));
    this.z = (new androidx.appcompat.app.a.a((Context)this)).h(getResources().getString(2131755193)).r(view).d(true).s();
  }
  
  private void h0() {
    String str = (EZCallApplication.c()).f;
    if (str.equals("en")) {
      this.t.setText("English");
    } else if (str.equals("en_GB")) {
      this.t.setText("English");
    } else if (str.equals("en_CA")) {
      this.t.setText("English");
    } else if (str.equals("hi")) {
      this.t.setText("हिन्दी");
    } else if (str.equals("bn")) {
      this.t.setText("বাংলা ভাষা");
    } else if (str.equals("fa")) {
      this.t.setText("فارسی");
    } else if (str.equals("ru")) {
      this.t.setText("русский");
    } else if (str.equals("tr")) {
      this.t.setText("Türk");
    } else if (str.equals("in")) {
      this.t.setText("Indonesia");
    } else if (str.equals("ms")) {
      this.t.setText("Melayu");
    } else if (str.equals("zh")) {
      this.t.setText("简体中文");
    } else if (str.equals("ar")) {
      this.t.setText("العربية");
    } else if (str.equals("es")) {
      this.t.setText("Espanol");
    } else if (str.equals("pt")) {
      this.t.setText("Português");
    } else if (str.equals("th")) {
      this.t.setText("ภาษาไทย");
    } else if (str.equals("iw")) {
      this.t.setText("עִבְרִית");
    } else if (str.equals("de")) {
      this.t.setText("Deutsch");
    } else if (str.equals("zh-TW")) {
      this.t.setText("繁体中文");
    } else if (str.equals("fr")) {
      this.t.setText("Français");
    } else if (str.equals("ko")) {
      this.t.setText("한국어");
    } else if (str.equals("vi")) {
      this.t.setText("Tiếng Việt");
    } else if (str.equals("kk")) {
      this.t.setText("қазақ тілі");
    } else if (str.equals("it")) {
      this.t.setText("Italiano");
    } else if (str.equals("el")) {
      this.t.setText("Ελληνικά");
    } else if (str.equals("te")) {
      this.t.setText("বతెలుగు");
    } else if (str.equals("ur")) {
      this.t.setText("اردو");
    } 
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 999)
      if (com.allinone.callerid.util.k1.a.g(getApplicationContext())) {
        if (com.allinone.callerid.util.k1.a.d(getApplicationContext()) && com.allinone.callerid.util.k1.a.c(getApplicationContext())) {
          Z();
        } else {
          f0(false);
        } 
        q.b().c("first_request_default_dialer_enabled");
        if (d0.a)
          d0.a("default_dialer", "isEnable"); 
      } else {
        f0(false);
        if (d0.a)
          d0.a("default_dialer", "notEnable"); 
      }  
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      requestWindowFeature(1);
      getWindow().setFlags(1024, 1024);
      setContentView(2131493076);
      this.u = g1.b();
      d0();
      this.v = true;
      e0();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      x x1 = this.y;
      if (x1 != null)
        x1.d(); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    Intent intent;
    if (paramInt == 4) {
      if (i1.B((Context)EZCallApplication.c())) {
        if (d0.a)
          d0.a("first_enter", "keycode_back"); 
        q.b().c("guide1_key_back");
        if (com.allinone.callerid.util.k1.a.d(getApplicationContext()) && com.allinone.callerid.util.k1.a.c(getApplicationContext())) {
          intent = new Intent();
          intent.setClass((Context)this, MainActivity.class);
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
          finish();
        } else {
          f0(true);
        } 
      } 
      return true;
    } 
    return super.onKeyDown(paramInt, (KeyEvent)intent);
  }
  
  public void onPause() {
    super.onPause();
  }
  
  public void onResume() {
    super.onResume();
    if (this.v)
      i1.F0((Activity)this); 
    (j0.a()).b.execute(new d(this));
  }
  
  class a implements View.OnClickListener {
    a(GuideActivity this$0) {}
    
    public void onClick(View param1View) {
      if (i1.B((Context)EZCallApplication.c()))
        q.b().c("get_start_click"); 
      if (com.allinone.callerid.util.k1.a.d(this.b.getApplicationContext()) && com.allinone.callerid.util.k1.a.c(this.b.getApplicationContext())) {
        q.b().c("first_enter_has_per");
        Intent intent = new Intent();
        intent.setClass((Context)this.b, PrivacyActivity.class);
        this.b.startActivity(intent);
        this.b.overridePendingTransition(2130771968, 2130771969);
        this.b.finish();
      } else {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
          if (com.allinone.callerid.util.k1.a.g(this.b.getApplicationContext())) {
            GuideActivity.O(this.b, false);
          } else if (i >= 29) {
            try {
              RoleManager roleManager = (RoleManager)this.b.getSystemService(RoleManager.class);
              if (roleManager != null && roleManager.isRoleAvailable("android.app.role.DIALER")) {
                boolean bool = roleManager.isRoleHeld("android.app.role.DIALER");
                if (bool) {
                  if (d0.a)
                    d0.a("default_dialer", "This app is the default dialer app"); 
                  GuideActivity.O(this.b, false);
                } else {
                  if (d0.a)
                    d0.a("default_dialer", "This app isn't the default dialer app"); 
                  Intent intent = roleManager.createRequestRoleIntent("android.app.role.DIALER");
                  this.b.startActivityForResult(intent, 999);
                } 
              } 
              q.b().c("first_request_default_dialer");
            } catch (Exception exception) {
              GuideActivity.O(this.b, false);
              exception.printStackTrace();
            } 
          } else {
            Intent intent = new Intent();
            this("android.telecom.action.CHANGE_DEFAULT_DIALER");
            intent.putExtra("android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME", this.b.getPackageName());
            this.b.startActivityForResult(intent, 999);
            q.b().c("first_request_default_dialer");
          } 
        } else {
          GuideActivity.O(this.b, false);
        } 
      } 
    }
  }
  
  class b implements View.OnClickListener {
    b(GuideActivity this$0) {}
    
    public void onClick(View param1View) {
      GuideActivity.P(this.b);
      q.b().c("seleck_language_click");
    }
  }
  
  class c implements AdapterView.OnItemClickListener {
    c(GuideActivity this$0, String[] param1ArrayOfString) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      String str = this.b[param1Int];
      str = GuideActivity.Q(this.c, str);
      i1.a = true;
      (EZCallApplication.c()).f = str;
      GuideActivity.R(this.c, str);
      if (GuideActivity.S(this.c) != null)
        GuideActivity.S(this.c).dismiss(); 
      this.c.finish();
      this.c.startActivity(new Intent((Context)this.c, GuideActivity.class));
    }
  }
  
  class d implements Runnable {
    d(GuideActivity this$0) {}
    
    public void run() {
      if (GuideActivity.T(this.b)) {
        GuideActivity.U(this.b, false);
        GuideActivity guideActivity = this.b;
        GuideActivity.V(guideActivity, GuideActivity.W(guideActivity));
        if (i1.B(this.b.getApplicationContext())) {
          q.b().c("first_enter_laucher_oncreate_online");
          if (d0.a)
            d0.a("first_enter", "first_enter_laucher"); 
          if (i1.c0(this.b.getApplicationContext())) {
            q.b().c("have_simcard");
            if (d0.a)
              d0.a("country", "have_sim"); 
          } else {
            if (d0.a)
              d0.a("country", "no_sim"); 
            q.b().c("no_simcard");
          } 
          if (d0.a)
            d0.a("first_enter", "first_enter_guide1"); 
          String str = p.d(this.b.getApplicationContext()).getCountry_name();
          if (str == null || "".equals(str)) {
            int i = GuideActivity.X(this.b);
            if (i != 0) {
              if (i != 1) {
                if (i == 2)
                  q.b().c("get_unmatched_countrycode"); 
              } else {
                q.b().c("get_matched_countrycode");
              } 
            } else {
              q.b().c("not_get_countrycode");
            } 
            if (GuideActivity.Y(this.b) != null)
              p.h((Context)this.b.getApplication(), GuideActivity.Y(this.b)); 
          } 
        } 
      } 
      if (i1.B(this.b.getApplicationContext())) {
        b1.o1(true);
        b1.g1(System.currentTimeMillis());
        b1.Y1(System.currentTimeMillis() + 86400000L);
        b1.K1(System.currentTimeMillis());
      } else {
        b1.o1(false);
      } 
      if (b1.K()) {
        b1.c1(System.currentTimeMillis());
        b1.p1(false);
      } 
      if (!i1.e0(this.b.getApplicationContext()))
        p.d(this.b.getApplicationContext()).getCountry_code(); 
      if (!i1.e0(this.b.getApplicationContext()))
        b1.y0(); 
      f.t(true);
      f.n(true);
      f.v(true);
      q.b().c("callscreen_can_use");
    }
  }
  
  class e implements x.b {
    e(GuideActivity this$0) {}
    
    public void a() {
      if (i1.B((Context)EZCallApplication.c())) {
        if (d0.a)
          d0.a("first_enter", "HomeLongPressed"); 
        q.b().c("homelongpressed");
      } 
    }
    
    public void b() {
      if (i1.B((Context)EZCallApplication.c())) {
        if (d0.a)
          d0.a("first_enter", "keycode_home"); 
        q.b().c("guide1_key_home");
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/GuideActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */