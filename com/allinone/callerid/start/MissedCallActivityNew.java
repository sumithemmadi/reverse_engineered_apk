package com.allinone.callerid.start;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.dialog.DialogMissed;
import com.allinone.callerid.dialog.k;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.contactpdt.ContactActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.mvc.controller.recommend.RecommendActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.u;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.u;
import java.util.Date;
import org.json.JSONArray;

public class MissedCallActivityNew extends BaseActivity implements View.OnClickListener {
  private boolean A;
  
  private FrameLayout B;
  
  private FrameLayout C;
  
  private String D = "";
  
  private Context E;
  
  private ConstraintLayout F;
  
  private ConstraintLayout G;
  
  private boolean H;
  
  private TextView I;
  
  private TextView J;
  
  private int K;
  
  private LinearLayout L;
  
  private LinearLayout M;
  
  private ImageView N;
  
  private ImageView O;
  
  private TextView P;
  
  private TextView Q;
  
  private LinearLayout R;
  
  private ImageView S;
  
  private TextView T;
  
  private CallLogBean U;
  
  private ImageView V;
  
  private FrameLayout W;
  
  private boolean X;
  
  private ConstraintLayout Y;
  
  private FrameLayout Z;
  
  private TextView a0;
  
  private FrameLayout b0;
  
  private TextView c0;
  
  private FrameLayout d0;
  
  private TextView e0;
  
  private FrameLayout f0;
  
  private TextView g0;
  
  private TextView h0;
  
  private int i0;
  
  private final String s = "MissedCallActivityNew";
  
  private EZSearchResult t;
  
  private LinearLayout u;
  
  private TextView v;
  
  private TextView w;
  
  private TextView x;
  
  private ImageView y;
  
  private TextView z;
  
  private void U() {
    String str = this.D;
    if (str != null && !"".equals(str)) {
      if (c1.h(getApplicationContext())) {
        int i = b1.q();
        if (i == -1) {
          if (Build.VERSION.SDK_INT >= 22) {
            c1.m((Context)this, this.D);
          } else {
            try {
              q0.a(getApplicationContext(), this.D);
              finish();
              overridePendingTransition(2130771968, 2130771969);
            } catch (Exception exception) {
              Toast.makeText(getApplicationContext(), getResources().getString(2131755541), 1).show();
            } 
          } 
        } else {
          c1.d((Context)this, i, this.D);
        } 
      } else {
        try {
          q0.a(getApplicationContext(), this.D);
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } catch (Exception exception) {
          Toast.makeText(getApplicationContext(), getResources().getString(2131755541), 1).show();
        } 
      } 
      q.b().c("missed_dialog_call");
    } 
  }
  
  private void V() {
    try {
      if (i1.t0() && b1.T() && this.H) {
        b1.y1(false);
        if (Build.VERSION.SDK_INT >= 23) {
          if (Settings.canDrawOverlays(getApplicationContext()))
            a0(getApplicationContext()); 
        } else {
          a0(getApplicationContext());
        } 
      } else if (System.currentTimeMillis() - b1.d0() > 86400000L) {
        f f = new f();
        this(this);
        com.allinone.callerid.i.a.d.a.a(f);
      } else if (i1.e(getApplicationContext()) && this.K == 0) {
        Intent intent = new Intent();
        this((Context)this, RecommendActivity.class);
        intent.setFlags(268435456);
        startActivity(intent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void W() {
    q.b().c("missed_request_num");
    com.google.android.gms.ads.d.a a = new com.google.android.gms.ads.d.a((Context)EZCallApplication.c(), "ca-app-pub-5825926894918682/7437588851");
    a.e(new b(this));
    u u = (new u.a()).b(true).a();
    a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
    a.f(new c(this)).a().b((new com.google.android.gms.ads.e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
  }
  
  private void X() {
    try {
      if (!b1.y2().booleanValue()) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
          com.allinone.callerid.dialog.f f = new com.allinone.callerid.dialog.f();
          this((Context)this, 2131820783);
          f.setCanceledOnTouchOutside(false);
          f.show();
          return;
        } 
      } 
      EZSearchResult eZSearchResult = this.t;
      if (eZSearchResult != null && !"".equals(eZSearchResult.getNumber())) {
        String str = this.t.getNumber();
        g g = new g();
        this(this);
        com.allinone.callerid.i.a.e.b.b(str, g);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void Y() {
    if (this.K == 1) {
      u.c((Activity)this, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.t.getRaw_contact_id()), "", 2131231148, this.y);
    } else if (this.t.getIcon() != null && !"".equals(this.t.getIcon())) {
      u.b(this.E, this.t.getIcon(), 2131231148, this.y);
    } else if (this.K == 0 && this.t.getType_label() != null && !"".equals(this.t.getType_label()) && this.t.getReport_count() > 0) {
      this.y.setImageResource(2131231149);
    } else {
      this.y.setImageResource(2131231148);
    } 
  }
  
  private void Z() {
    if (this.t != null)
      try {
        Y();
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("ezSearchResult");
          stringBuilder.append(this.t.toString());
          d0.a("missed_activity", stringBuilder.toString());
        } 
        if (!this.A)
          if (this.t.getDate() == 1L) {
            this.H = true;
            this.v.setText(getResources().getString(2131755467));
          } else {
            this.v.setText(getResources().getString(2131755425));
          }  
        String str = this.t.getNumber();
        if (str != null && !"".equals(this.t.getNumber()))
          this.D = this.t.getNumber(); 
        str = this.t.getFormat_tel_number();
        if (this.t.getName() != null && !"".equals(this.t.getName())) {
          this.w.setText(this.t.getName());
          if (str != null && !"".equals(str)) {
            this.J.setText(str);
            this.h0.setText(str);
          } else {
            this.J.setText(this.t.getNumber());
            this.h0.setText(this.t.getNumber());
          } 
          this.J.setVisibility(0);
        } else {
          if (str != null && !"".equals(str)) {
            this.w.setText(str);
          } else {
            this.w.setText(this.t.getNumber());
          } 
          this.J.setVisibility(8);
        } 
        if (this.t.getLocation() != null && !"".equals(this.t.getLocation())) {
          this.x.setVisibility(0);
          this.x.setText(this.t.getLocation());
        } 
        if (this.K == 0) {
          JSONArray jSONArray;
          String str1 = this.t.getType_label();
          if (str1 != null && !"".equals(str1) && this.t.getReport_count() > 0) {
            this.u.setBackgroundResource(this.i0);
            this.y.setImageResource(2131231149);
            this.F.setVisibility(0);
            this.G.setVisibility(8);
            this.z.setVisibility(0);
            TextView textView = this.z;
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.t.getReport_count());
            stringBuilder.append(" ");
            stringBuilder.append(getResources().getString(2131755656));
            stringBuilder.append(" ");
            stringBuilder.append(str1);
            textView.setText(stringBuilder.toString());
          } 
          str = this.t.getSubtype();
          String str2 = this.t.getKeyword();
          if (str != null && !"".equals(str)) {
            jSONArray = new JSONArray();
            this(str);
            if (jSONArray.length() > 0) {
              str = jSONArray.getJSONObject(0).getString("subtype");
              this.I.setVisibility(0);
              this.I.setText(str);
            } 
          } else if (jSONArray != null && !"".equals(jSONArray)) {
            this.I.setVisibility(0);
            this.I.setText((CharSequence)jSONArray);
          } else if (this.z.getVisibility() == 8 && (this.t.getLocation() == null || "".equals(this.t.getLocation()))) {
            this.L.setVisibility(8);
          } else if (this.z.getVisibility() == 8) {
            this.M.setVisibility(8);
          } 
          int i = this.t.getBlock_count();
          int j = this.t.getDeclined_count();
          str = this.t.getName();
          if (str1 != null && !"".equals(str1)) {
            if (str != null && !"".equals(str)) {
              q.b().c("spam_name_missed_dialog");
            } else {
              q.b().c("spam_no_name_missed_dialog");
            } 
            if (i >= 3) {
              this.S.setImageResource(2131231205);
              str1 = (EZCallApplication.c()).f;
              if ("zh".equals(str1) || "zh-TW".equals(str1)) {
                TextView textView = this.T;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(getResources().getString(2131755862));
                stringBuilder.append(i);
                stringBuilder.append(getResources().getString(2131755793));
                textView.setText(stringBuilder.toString());
              } else {
                TextView textView = this.T;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(i);
                stringBuilder.append(" ");
                stringBuilder.append(getResources().getString(2131755862));
                textView.setText(stringBuilder.toString());
              } 
              this.R.setVisibility(0);
              if (str != null && !"".equals(str)) {
                q.b().c("spam_name_missed_blocked");
              } else {
                q.b().c("spam_no_name_missed_blocked");
              } 
            } else if (j >= 3) {
              this.S.setImageResource(2131231215);
              str1 = (EZCallApplication.c()).f;
              if ("zh".equals(str1) || "zh-TW".equals(str1)) {
                TextView textView = this.T;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(getResources().getString(2131755863));
                stringBuilder.append(j);
                stringBuilder.append(getResources().getString(2131755793));
                textView.setText(stringBuilder.toString());
              } else {
                TextView textView = this.T;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(j);
                stringBuilder.append(" ");
                stringBuilder.append(getResources().getString(2131755863));
                textView.setText(stringBuilder.toString());
              } 
              this.R.setVisibility(0);
              if (str != null && !"".equals(str)) {
                q.b().c("spam_name_missed_declined");
              } else {
                q.b().c("spam_no_name_missed_declined");
              } 
            } 
          } else if (str == null || "".equals(str)) {
            q.b().c("no_spam_no_name_missed_dialog");
            if (i >= 3) {
              this.S.setImageResource(2131231205);
              str = (EZCallApplication.c()).f;
              if ("zh".equals(str) || "zh-TW".equals(str)) {
                TextView textView = this.T;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(getResources().getString(2131755862));
                stringBuilder.append(i);
                stringBuilder.append(getResources().getString(2131755793));
                textView.setText(stringBuilder.toString());
              } else {
                TextView textView = this.T;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(i);
                stringBuilder.append(" ");
                stringBuilder.append(getResources().getString(2131755862));
                textView.setText(stringBuilder.toString());
              } 
              this.R.setVisibility(0);
              q.b().c("no_spam_no_name_missed_blocked");
            } else if (j >= 3) {
              this.S.setImageResource(2131231215);
              str = (EZCallApplication.c()).f;
              if ("zh".equals(str) || "zh-TW".equals(str)) {
                TextView textView = this.T;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(getResources().getString(2131755863));
                stringBuilder.append(j);
                stringBuilder.append(getResources().getString(2131755793));
                textView.setText(stringBuilder.toString());
              } else {
                TextView textView = this.T;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(j);
                stringBuilder.append(" ");
                stringBuilder.append(getResources().getString(2131755863));
                textView.setText(stringBuilder.toString());
              } 
              this.R.setVisibility(0);
              q.b().c("no_spam_no_name_missed_declined");
            } 
          } 
        } else {
          this.B.setBackgroundResource(2131230864);
          this.N.setImageResource(2131230986);
          this.Q.setTextColor(getResources().getColor(2131099942));
          this.C.setBackgroundResource(2131230861);
          this.O.setImageResource(2131231103);
          this.P.setTextColor(getResources().getColor(2131099706));
          this.V.setVisibility(0);
          if (this.t.getDate() == 1L)
            if (this.X) {
              if (com.allinone.callerid.d.f.f.h()) {
                this.B.setVisibility(8);
                this.W.setVisibility(0);
              } 
            } else {
              this.G.setVisibility(8);
              this.L.setVisibility(8);
              this.Y.setVisibility(0);
              this.h0.setVisibility(0);
              if (com.allinone.callerid.d.f.f.h())
                this.f0.setVisibility(0); 
            }  
        } 
        CallLogBean callLogBean = new CallLogBean();
        this();
        this.U = callLogBean;
        callLogBean.B0(this.t.getName());
        this.U.D0(this.t.getNumber());
        this.U.a0(this.t.getAddress());
        this.U.h1(this.t.getWebsite());
        this.U.b0(this.t.getIcon());
        this.U.N0(this.t.getType());
        this.U.d1(this.t.getType_label());
        this.U.Y0(this.t.getT_p());
        this.U.Z0(this.t.getTel_number());
        this.U.K0(String.valueOf(this.t.getReport_count()));
        this.U.e0(this.t.getAddress());
        this.U.L0(this.t.getName());
        this.U.w0(this.t.getFormat_tel_number());
        this.U.G0(this.t.getOperator());
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  private void a0(Context paramContext) {
    try {
      k k = new k();
      this(paramContext, 2131820783, false);
      if (Build.VERSION.SDK_INT >= 26) {
        if (k.getWindow() != null)
          k.getWindow().setType(2038); 
      } else if (k.getWindow() != null) {
        k.getWindow().setType(2003);
      } 
      k.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void u() {
    this.i0 = d1.b((Context)this, 2130968681, 2131230843);
    Typeface typeface1 = g1.b();
    Typeface typeface2 = g1.a();
    ((RelativeLayout)findViewById(2131296342)).setOnClickListener(this);
    ImageView imageView = (ImageView)findViewById(2131297122);
    this.B = (FrameLayout)findViewById(2131296411);
    this.C = (FrameLayout)findViewById(2131296422);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296738);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296410);
    this.y = (ImageView)findViewById(2131297360);
    this.F = (ConstraintLayout)findViewById(2131297208);
    this.G = (ConstraintLayout)findViewById(2131297169);
    this.L = (LinearLayout)findViewById(2131297192);
    this.M = (LinearLayout)findViewById(2131297209);
    this.N = (ImageView)findViewById(2131296900);
    this.O = (ImageView)findViewById(2131296906);
    this.V = (ImageView)findViewById(2131297005);
    this.W = (FrameLayout)findViewById(2131296415);
    TextView textView2 = (TextView)findViewById(2131297841);
    this.W.setOnClickListener(this);
    textView2.setTypeface(typeface1);
    this.Y = (ConstraintLayout)findViewById(2131297171);
    this.Z = (FrameLayout)findViewById(2131296417);
    this.a0 = (TextView)findViewById(2131297859);
    this.b0 = (FrameLayout)findViewById(2131296421);
    this.c0 = (TextView)findViewById(2131297862);
    this.d0 = (FrameLayout)findViewById(2131296419);
    this.e0 = (TextView)findViewById(2131297970);
    this.f0 = (FrameLayout)findViewById(2131296418);
    this.g0 = (TextView)findViewById(2131297810);
    this.Z.setOnClickListener(this);
    this.b0.setOnClickListener(this);
    this.d0.setOnClickListener(this);
    this.f0.setOnClickListener(this);
    this.a0.setTypeface(typeface1);
    this.c0.setTypeface(typeface1);
    this.e0.setTypeface(typeface1);
    this.g0.setTypeface(typeface1);
    imageView.setOnClickListener(this);
    this.B.setOnClickListener(this);
    this.C.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    this.u = (LinearLayout)findViewById(2131297502);
    this.J = (TextView)findViewById(2131297975);
    this.h0 = (TextView)findViewById(2131297865);
    this.v = (TextView)findViewById(2131297976);
    this.I = (TextView)findViewById(2131297855);
    this.w = (TextView)findViewById(2131298023);
    this.z = (TextView)findViewById(2131298136);
    this.x = (TextView)findViewById(2131297973);
    this.Q = (TextView)findViewById(2131297832);
    this.P = (TextView)findViewById(2131297889);
    ((TextView)findViewById(2131298183)).setTypeface(typeface1);
    this.Q.setTypeface(typeface2);
    this.P.setTypeface(typeface2);
    ((TextView)findViewById(2131297819)).setTypeface(typeface2);
    this.J.setTypeface(typeface1);
    this.h0.setTypeface(typeface1);
    this.v.setTypeface(typeface1);
    this.I.setTypeface(typeface1);
    this.w.setTypeface(typeface2);
    this.z.setTypeface(typeface2);
    this.x.setTypeface(typeface1);
    this.R = (LinearLayout)findViewById(2131297222);
    this.S = (ImageView)findViewById(2131297083);
    TextView textView1 = (TextView)findViewById(2131298218);
    this.T = textView1;
    textView1.setTypeface(typeface1);
  }
  
  public void onClick(View paramView) {
    try {
      Intent intent;
      int i = paramView.getId();
      switch (i) {
        default:
          return;
        case 2131297122:
          q.b().c("missed_close");
          V();
          finish();
          overridePendingTransition(2130771968, 2130771969);
        case 2131296738:
          try {
            EZSearchResult eZSearchResult = this.t;
            if (eZSearchResult != null) {
              if (eZSearchResult.isContact()) {
                Intent intent1 = new Intent();
                this((Context)this, ContactActivity.class);
                Bundle bundle = new Bundle();
                this();
                bundle.putParcelable("contact_tony", (Parcelable)this.U);
                intent1.putExtra("is_missed", true);
                intent1.putExtras(bundle);
                intent1.setFlags(268435456);
                startActivity(intent1);
              } else {
                Intent intent1 = new Intent();
                this((Context)this, UnknownContactActivity.class);
                Bundle bundle = new Bundle();
                this();
                bundle.putParcelable("contact_tony", (Parcelable)this.U);
                intent1.putExtra("is_missed", true);
                intent1.putExtras(bundle);
                intent1.setFlags(268435456);
                startActivity(intent1);
              } 
              finish();
              overridePendingTransition(2130771968, 2130771969);
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          q.b().c("missed_btn_detial");
        case 2131296422:
          try {
            EZSearchResult eZSearchResult = this.t;
            if (eZSearchResult != null) {
              if (eZSearchResult.isContact()) {
                Intent intent1 = new Intent();
                this((Context)this, ContactActivity.class);
                Bundle bundle = new Bundle();
                this();
                bundle.putParcelable("contact_tony", (Parcelable)this.U);
                intent1.putExtra("is_missed", true);
                intent1.putExtras(bundle);
                intent1.setFlags(268435456);
                startActivity(intent1);
              } else {
                Intent intent1 = new Intent();
                this((Context)this, UnknownContactActivity.class);
                Bundle bundle = new Bundle();
                this();
                bundle.putParcelable("contact_tony", (Parcelable)this.U);
                intent1.putExtra("is_missed", true);
                intent1.putExtras(bundle);
                intent1.setFlags(268435456);
                startActivity(intent1);
              } 
              finish();
              overridePendingTransition(2130771968, 2130771969);
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          q.b().c("missed_btn_detial");
        case 2131296421:
          try {
            Intent intent1 = new Intent();
            this("android.intent.action.VIEW");
            intent1.setType("vnd.android-dir/mms-sms");
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("smsto:");
            stringBuilder.append(this.U.p());
            intent1.setData(Uri.parse(stringBuilder.toString()));
            intent1.addFlags(268468224);
            startActivity(intent1);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        case 2131296419:
          try {
            if (this.t != null) {
              Intent intent1 = new Intent();
              this((Context)this, ContactActivity.class);
              Bundle bundle = new Bundle();
              this();
              bundle.putParcelable("contact_tony", (Parcelable)this.U);
              intent1.putExtra("is_missed", true);
              intent1.putExtras(bundle);
              intent1.setFlags(268435456);
              startActivity(intent1);
              finish();
              overridePendingTransition(2130771968, 2130771969);
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          q.b().c("missed_btn_detial");
        case 2131296418:
          intent = new Intent();
          this((Context)this, MainActivity.class);
          intent.putExtra("is_callscreen", true);
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
          finish();
        case 2131296417:
          U();
        case 2131296415:
          intent = new Intent();
          this((Context)this, MainActivity.class);
          intent.putExtra("is_callscreen", true);
          startActivity(intent);
          overridePendingTransition(2130771968, 2130771969);
          finish();
        case 2131296411:
          U();
        case 2131296410:
          X();
          q.b().c("missed_btn_block_spam");
        case 2131296342:
          break;
      } 
      V();
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
      this.E = getApplicationContext();
      Intent intent = getIntent();
      if (intent != null) {
        this.t = (EZSearchResult)intent.getParcelableExtra("contact_missed");
        this.A = intent.getBooleanExtra("isuserrejected", false);
        this.X = intent.getBooleanExtra("answer", false);
        this.K = intent.getIntExtra("isContact", 0);
      } 
      setContentView(2131492931);
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      q.b().c("missed_activity");
      View view = getWindow().getDecorView();
      a a = new a();
      this(this);
      view.post(a);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    Log.e("wjjj", "MISSCALLonDestroy");
    (j0.a()).b.execute(new d(this));
    com.allinone.callerid.util.a.c((Activity)this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      V();
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
    try {
      if (this.t != null) {
        String str = this.D;
        if (str != null) {
          boolean bool = "".equals(str);
          if (!bool)
            try {
              if (!this.A) {
                String str1 = this.D;
                e e = new e();
                this(this);
                com.allinone.callerid.i.a.f.d.a(str1, e);
              } 
            } catch (Exception exception) {
              exception.printStackTrace();
            }  
        } 
      } 
      if (com.allinone.callerid.util.k1.b.a) {
        if (com.allinone.callerid.util.k1.b.b(getApplicationContext()))
          q.b().c("dialog_notifi_per_tip_enalbleed"); 
        com.allinone.callerid.util.k1.b.a = false;
        X();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements Runnable {
    a(MissedCallActivityNew this$0) {}
    
    public void run() {
      MissedCallActivityNew.O(this.b);
      MissedCallActivityNew.P(this.b);
      com.allinone.callerid.util.a.a((Activity)this.b);
    }
  }
  
  class b implements com.google.android.gms.ads.formats.g.a {
    b(MissedCallActivityNew this$0) {}
    
    public void r(com.google.android.gms.ads.formats.g param1g) {
      (com.allinone.callerid.util.gg.a.a()).b = param1g;
      Log.e("wjjj", "成功");
      Intent intent = new Intent((Context)EZCallApplication.c(), DialogMissed.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  class c extends com.google.android.gms.ads.b {
    c(MissedCallActivityNew this$0) {}
    
    public void D(int param1Int) {
      super.D(param1Int);
      Log.e("wjjj", "失败");
    }
    
    public void K() {
      super.K();
    }
  }
  
  class d implements Runnable {
    d(MissedCallActivityNew this$0) {}
    
    public void run() {
      if (MissedCallActivityNew.Q(this.b) == 0 && System.currentTimeMillis() - b1.e0() > 86400000L)
        b1.L1(b1.f0() + 1); 
    }
  }
  
  class e implements com.allinone.callerid.i.a.f.a {
    e(MissedCallActivityNew this$0) {}
    
    public void a(long param1Long) {
      if (param1Long != 0L)
        if (MissedCallActivityNew.R(this.a).getDate() == 1L) {
          TextView textView = MissedCallActivityNew.S(this.a);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(i.e(new Date(param1Long)));
          stringBuilder.append(" ");
          stringBuilder.append(this.a.getResources().getString(2131755466));
          textView.setText(stringBuilder.toString());
        } else {
          TextView textView = MissedCallActivityNew.S(this.a);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(i.e(new Date(param1Long)));
          stringBuilder.append(" ");
          stringBuilder.append(this.a.getResources().getString(2131755425));
          textView.setText(stringBuilder.toString());
        }  
    }
  }
  
  class f implements com.allinone.callerid.i.a.d.b {
    f(MissedCallActivityNew this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean)
        MissedCallActivityNew.T(this.a); 
    }
  }
  
  class g implements com.allinone.callerid.i.a.e.a {
    g(MissedCallActivityNew this$0) {}
    
    public void a(boolean param1Boolean) {
      try {
        boolean bool = this.a.isFinishing();
        if (!bool) {
          String str1;
          String str2;
          if (param1Boolean) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.a.getResources().getString(2131755825));
            stringBuilder.append(" ");
            stringBuilder.append(MissedCallActivityNew.R(this.a).getNumber());
            str2 = stringBuilder.toString();
            str1 = this.a.getResources().getString(2131755826);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.a.getResources().getString(2131755114));
            stringBuilder.append(" ");
            stringBuilder.append(MissedCallActivityNew.R(this.a).getNumber());
            stringBuilder.append(" ?");
            str2 = stringBuilder.toString();
            str1 = this.a.getResources().getString(2131755116);
          } 
          androidx.appcompat.app.a.a a5 = new androidx.appcompat.app.a.a();
          this((Context)this.a);
          androidx.appcompat.app.a.a a4 = a5.h(str2);
          b b = new b();
          this(this);
          androidx.appcompat.app.a.a a2 = a4.n(str1, b);
          String str3 = this.a.getResources().getString(2131755180);
          a a3 = new a();
          this(this);
          androidx.appcompat.app.a a1 = a2.j(str3, a3).a();
          a1.show();
          a1.g(-1).setTextColor(this.a.getResources().getColor(2131099706));
          a1.g(-2).setTextColor(this.a.getResources().getColor(2131099695));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(MissedCallActivityNew.g this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(MissedCallActivityNew.g this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str = MissedCallActivityNew.R(this.b.a).getNumber().replace("-", "");
          if (!"".equals(str)) {
            a a = new a();
            this(this, str);
            com.allinone.callerid.i.a.e.b.b(str, a);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
      
      class a implements com.allinone.callerid.i.a.e.a {
        a(MissedCallActivityNew.g.b this$0, String param3String) {}
        
        public void a(boolean param3Boolean) {
          if (param3Boolean) {
            com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
          } else {
            EZBlackList eZBlackList = new EZBlackList();
            if (MissedCallActivityNew.R(this.b.b.a).getName() != null && !"".equals(MissedCallActivityNew.R(this.b.b.a).getName())) {
              eZBlackList.setName(MissedCallActivityNew.R(this.b.b.a).getName());
            } else {
              eZBlackList.setName("");
            } 
            eZBlackList.setNumber(this.a);
            eZBlackList.setIs_myblock("true");
            com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
          } 
        }
        
        class a implements com.allinone.callerid.i.a.a {
          a(MissedCallActivityNew.g.b.a this$0) {}
          
          public void a() {}
        }
        
        class b implements com.allinone.callerid.i.a.a {
          b(MissedCallActivityNew.g.b.a this$0) {}
          
          public void a() {
            CollectInfo collectInfo = new CollectInfo();
            collectInfo.setNumber(this.a.a);
            collectInfo.setUser_blocked("1");
            collectInfo.setUser_commented("0");
            collectInfo.setUser_reported("0");
            collectInfo.setUser_upload_recording("0");
            com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
            this.a.b.b.a.finish();
          }
        }
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(MissedCallActivityNew.g.b this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(MissedCallActivityNew.g.b this$0) {}
        
        public void a() {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          this.a.b.b.a.finish();
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(MissedCallActivityNew.g this$0, String param2String) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          if (MissedCallActivityNew.R(this.b.b.a).getName() != null && !"".equals(MissedCallActivityNew.R(this.b.b.a).getName())) {
            eZBlackList.setName(MissedCallActivityNew.R(this.b.b.a).getName());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setNumber(this.a);
          eZBlackList.setIs_myblock("true");
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(MissedCallActivityNew.g.b.a this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(MissedCallActivityNew.g.b.a this$0) {}
        
        public void a() {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          this.a.b.b.a.finish();
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MissedCallActivityNew.g this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(MissedCallActivityNew.g this$0) {}
      
      public void a() {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        this.a.b.b.a.finish();
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(MissedCallActivityNew this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(MissedCallActivityNew this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str = MissedCallActivityNew.R(this.b.a).getNumber().replace("-", "");
        if (!"".equals(str)) {
          a a = new a();
          this(this, str);
          com.allinone.callerid.i.a.e.b.b(str, a);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(MissedCallActivityNew.g.b this$0, String param3String) {}
      
      public void a(boolean param3Boolean) {
        if (param3Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          if (MissedCallActivityNew.R(this.b.b.a).getName() != null && !"".equals(MissedCallActivityNew.R(this.b.b.a).getName())) {
            eZBlackList.setName(MissedCallActivityNew.R(this.b.b.a).getName());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setNumber(this.a);
          eZBlackList.setIs_myblock("true");
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(MissedCallActivityNew.g.b.a this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(MissedCallActivityNew.g.b.a this$0) {}
        
        public void a() {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          this.a.b.b.a.finish();
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MissedCallActivityNew.g.b this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(MissedCallActivityNew.g.b this$0) {}
      
      public void a() {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        this.a.b.b.a.finish();
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.e.a {
    a(MissedCallActivityNew this$0, String param1String) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
      } else {
        EZBlackList eZBlackList = new EZBlackList();
        if (MissedCallActivityNew.R(this.b.b.a).getName() != null && !"".equals(MissedCallActivityNew.R(this.b.b.a).getName())) {
          eZBlackList.setName(MissedCallActivityNew.R(this.b.b.a).getName());
        } else {
          eZBlackList.setName("");
        } 
        eZBlackList.setNumber(this.a);
        eZBlackList.setIs_myblock("true");
        com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(MissedCallActivityNew.g.b.a this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(MissedCallActivityNew.g.b.a this$0) {}
      
      public void a() {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        this.a.b.b.a.finish();
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(MissedCallActivityNew this$0) {}
    
    public void a() {}
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(MissedCallActivityNew this$0) {}
    
    public void a() {
      CollectInfo collectInfo = new CollectInfo();
      collectInfo.setNumber(this.a.a);
      collectInfo.setUser_blocked("1");
      collectInfo.setUser_commented("0");
      collectInfo.setUser_reported("0");
      collectInfo.setUser_upload_recording("0");
      com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      this.a.b.b.a.finish();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/MissedCallActivityNew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */