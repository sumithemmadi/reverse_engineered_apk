package com.allinone.callerid.g;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.CallLogActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.mvc.controller.recorder.RecordListActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.l0;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.u;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.g;

public class i extends Fragment implements View.OnClickListener {
  private UnknownContactActivity c0;
  
  private View d0;
  
  private ImageView e0;
  
  private Context f0;
  
  private CallLogBean g0;
  
  private FrameLayout h0;
  
  private ImageView i0;
  
  private ImageView j0;
  
  private boolean k0;
  
  private TextView l0;
  
  private TextView m0;
  
  private TextView n0;
  
  private TextView o0;
  
  private TextView p0;
  
  private TextView q0;
  
  private View r0;
  
  private FrameLayout s0;
  
  private TextView t0;
  
  private View u0;
  
  private Animation v0;
  
  private TextView w0;
  
  private TextView x0;
  
  private ImageView y0;
  
  private ImageView z0;
  
  private void i2() {
    CallLogBean callLogBean = this.g0;
    if (callLogBean != null && callLogBean.p() != null && !"".equals(this.g0.p()))
      com.allinone.callerid.i.a.e.b.b(this.g0.p(), new e(this)); 
  }
  
  private void k2() {
    this.c0.getWindow().getDecorView().post(new a(this));
  }
  
  private void l2(View paramView) {
    Typeface typeface = g1.b();
    this.h0 = (FrameLayout)paramView.findViewById(2131296753);
    this.i0 = (ImageView)paramView.findViewById(2131296433);
    this.j0 = (ImageView)paramView.findViewById(2131296434);
    this.l0 = (TextView)paramView.findViewById(2131297861);
    this.m0 = (TextView)paramView.findViewById(2131297892);
    this.n0 = (TextView)paramView.findViewById(2131297936);
    this.o0 = (TextView)paramView.findViewById(2131298138);
    this.p0 = (TextView)paramView.findViewById(2131297863);
    this.q0 = (TextView)paramView.findViewById(2131298033);
    ImageView imageView1 = (ImageView)paramView.findViewById(2131296421);
    this.r0 = paramView.findViewById(2131297139);
    this.s0 = (FrameLayout)paramView.findViewById(2131297507);
    FrameLayout frameLayout1 = (FrameLayout)paramView.findViewById(2131297581);
    TextView textView = (TextView)paramView.findViewById(2131296432);
    this.e0 = (ImageView)paramView.findViewById(2131296420);
    this.t0 = (TextView)paramView.findViewById(2131297860);
    imageView1.setOnClickListener(this);
    this.i0.setOnClickListener(this);
    this.j0.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    this.e0.setOnClickListener(this);
    this.s0.setOnClickListener(this);
    this.l0.setTypeface(typeface);
    this.m0.setTypeface(typeface);
    this.n0.setTypeface(typeface);
    this.o0.setTypeface(typeface);
    this.p0.setTypeface(typeface);
    this.q0.setTypeface(typeface);
    textView.setTypeface(typeface);
    this.t0.setTypeface(typeface);
    this.u0 = paramView.findViewById(2131297527);
    FrameLayout frameLayout2 = (FrameLayout)paramView.findViewById(2131296428);
    this.w0 = (TextView)paramView.findViewById(2131298187);
    this.x0 = (TextView)paramView.findViewById(2131297866);
    this.y0 = (ImageView)paramView.findViewById(2131296887);
    ImageView imageView2 = (ImageView)paramView.findViewById(2131296968);
    this.w0.setTypeface(typeface);
    this.x0.setTypeface(typeface);
    ((TextView)paramView.findViewById(2131297780)).setTypeface(typeface);
    this.z0 = (ImageView)paramView.findViewById(2131297059);
    frameLayout2.setOnClickListener(this);
    imageView2.setOnClickListener(this);
    com.allinone.callerid.i.a.d.a.a(new b(this));
  }
  
  private void m2() {
    if (this.h0 != null)
      com.allinone.callerid.util.gg.c.c().d((Context)EZCallApplication.c(), "ca-app-pub-5825926894918682/5960855653", new d(this)); 
  }
  
  private void n2() {
    try {
      CallLogBean callLogBean = this.g0;
      if (callLogBean != null) {
        if (callLogBean.p() != null) {
          Thread thread = new Thread();
          c c = new c();
          this(this);
          this(c);
          thread.start();
        } 
        boolean bool = c1.h(this.f0);
        this.k0 = bool;
        if (bool) {
          this.i0.setVisibility(0);
          this.j0.setVisibility(0);
        } else {
          this.i0.setImageResource(2131231178);
        } 
        callLogBean = this.g0;
        if (callLogBean != null && callLogBean.N() != null && !"".equals(this.g0.N()) && this.g0.x() != null && !"".equals(this.g0.x()) && !this.g0.x().equals("0")) {
          this.o0.setVisibility(0);
          TextView textView = this.o0;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(this.g0.x());
          stringBuilder.append(" ");
          stringBuilder.append(this.g0.N());
          stringBuilder.append(" ");
          stringBuilder.append(O().getString(2131755656));
          textView.setText(stringBuilder.toString());
        } else {
          this.o0.setVisibility(8);
        } 
        if (this.g0.c() != null && !"".equals(this.g0.c())) {
          this.t0.setText(this.g0.c());
          this.s0.setVisibility(0);
          this.r0.setVisibility(0);
        } else {
          this.s0.setVisibility(8);
          this.r0.setVisibility(8);
        } 
        if (this.g0.d() != null && !"".equals(this.g0.d())) {
          this.l0.setText(this.g0.d());
        } else if (this.g0.i() != null && !"".equals(this.g0.i())) {
          this.l0.setText(this.g0.i());
        } else if (this.g0.p() != null) {
          if (i1.v0(this.g0.p())) {
            this.l0.setText(O().getString(2131755829));
          } else {
            this.l0.setText(this.g0.p());
          } 
        } 
        String str = this.g0.r();
        if (str != null && !"".equals(this.g0.r())) {
          this.p0.setText(this.g0.r());
          this.p0.setVisibility(0);
          if (this.g0.t() != null && !"".equals(this.g0.t())) {
            TextView textView = this.q0;
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(" • ");
            stringBuilder.append(this.g0.t());
            textView.setText(stringBuilder.toString());
            this.q0.setVisibility(0);
          } 
        } else if (this.g0.B() != null && !"".equals(this.g0.B())) {
          this.p0.setText(this.g0.B());
          this.p0.setVisibility(0);
          if (this.g0.t() != null && !"".equals(this.g0.t())) {
            TextView textView = this.q0;
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(" • ");
            stringBuilder.append(this.g0.t());
            textView.setText(stringBuilder.toString());
            this.q0.setVisibility(0);
          } 
        } else if (this.g0.t() != null && !"".equals(this.g0.t())) {
          this.q0.setText(this.g0.t());
          this.q0.setVisibility(0);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void N0() {
    super.N0();
  }
  
  public void R0(View paramView, Bundle paramBundle) {
    super.R0(paramView, paramBundle);
    k2();
  }
  
  public void onClick(View paramView) {
    CallLogBean callLogBean;
    switch (paramView.getId()) {
      default:
        return;
      case 2131297581:
        callLogBean = this.g0;
        if (callLogBean != null && callLogBean.p() != null && !"".equals(this.g0.p())) {
          Intent intent = new Intent(this.f0, CallLogActivity.class);
          intent.putExtra("call_log_number", this.g0.p());
          M1(intent);
          this.c0.overridePendingTransition(2130771968, 2130771969);
        } 
        q.b().c("see_history");
      case 2131297507:
        try {
          if (this.g0.c() != null && !"".equals(this.g0.c()))
            i1.x0(this.f0, this.g0.c()); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296968:
        this.u0.setVisibility(8);
        b1.U1(false);
      case 2131296434:
        c1.b(Boolean.valueOf(this.k0), this.g0, this.f0);
      case 2131296433:
        c1.a(Boolean.valueOf(this.k0), this.g0, this.f0);
      case 2131296428:
        q.b().c("pdt_recommend_click");
        i1.J0(this.f0, l0.a(), "showcaller");
        this.u0.setVisibility(8);
      case 2131296421:
        try {
          if (!i1.v0(this.g0.p())) {
            Intent intent = new Intent();
            this("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("smsto:");
            stringBuilder.append(this.g0.p());
            intent.setData(Uri.parse(stringBuilder.toString()));
            intent.addFlags(268468224);
            M1(intent);
          } else {
            Toast.makeText((Context)this.c0, this.f0.getResources().getString(2131755829), 0).show();
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        q.b().c("btn_contact_sms");
      case 2131296420:
        break;
    } 
    try {
      Intent intent = new Intent();
      this(this.f0, RecordListActivity.class);
      intent.putExtra("recordnumber", this.g0.p());
      intent.putExtra("recordname", this.g0.n());
      intent.addFlags(268435456);
      M1(intent);
      this.c0.overridePendingTransition(2130771968, 2130771969);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.f0 = paramContext;
    this.c0 = (UnknownContactActivity)paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
    if (this.d0 == null)
      this.d0 = View.inflate((Context)m(), 2131493046, null); 
    if (i1.f0(this.f0).booleanValue() && Build.VERSION.SDK_INT >= 17) {
      UnknownContactActivity unknownContactActivity = this.c0;
      if (unknownContactActivity != null)
        unknownContactActivity.getWindow().getDecorView().setLayoutDirection(1); 
    } 
    l2(this.d0);
    if (m() != null)
      this.g0 = (CallLogBean)m().getIntent().getParcelableExtra("contact_tony"); 
    return this.d0;
  }
  
  public void x0() {
    super.x0();
  }
  
  class a implements Runnable {
    a(i this$0) {}
    
    public void run() {
      com.allinone.callerid.i.a.d.a.a(new a(this));
      i.R1(this.b);
      i.a2(this.b);
      if (i.b2(this.b) != null)
        i.b2(this.b).d1(new b(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.d.b {
      a(i.a this$0) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean)
          i.Q1(this.a.b); 
      }
    }
    
    class b implements UnknownContactActivity.m0 {
      b(i.a this$0) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean) {
          if (i.e2(this.a.b) != null && i.f2(this.a.b) != null) {
            i.e2(this.a.b).setVisibility(0);
            i.f2(this.a.b).setVisibility(0);
          } 
        } else if (i.e2(this.a.b) != null && i.f2(this.a.b) != null) {
          i.e2(this.a.b).setVisibility(8);
          i.f2(this.a.b).setVisibility(8);
        } 
      }
      
      public void b(boolean param2Boolean, String param2String) {
        if (param2Boolean) {
          try {
            if (i.c2(this.a.b) != null) {
              String str = i.d2(this.a.b).x();
              byte b1 = 1;
              int i = b1;
              if (str != null) {
                i = b1;
                if (!"".equals(str))
                  i = 1 + Integer.parseInt(str); 
              } 
              TextView textView = i.c2(this.a.b);
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(i);
              stringBuilder.append(" ");
              stringBuilder.append(param2String);
              stringBuilder.append(" ");
              stringBuilder.append(this.a.b.O().getString(2131755656));
              textView.setText(stringBuilder.toString());
              i.c2(this.a.b).setVisibility(0);
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } else if (i.c2(this.a.b) != null) {
          i.c2(this.a.b).setVisibility(8);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.d.b {
    a(i this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean)
        i.Q1(this.a.b); 
    }
  }
  
  class b implements UnknownContactActivity.m0 {
    b(i this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        if (i.e2(this.a.b) != null && i.f2(this.a.b) != null) {
          i.e2(this.a.b).setVisibility(0);
          i.f2(this.a.b).setVisibility(0);
        } 
      } else if (i.e2(this.a.b) != null && i.f2(this.a.b) != null) {
        i.e2(this.a.b).setVisibility(8);
        i.f2(this.a.b).setVisibility(8);
      } 
    }
    
    public void b(boolean param1Boolean, String param1String) {
      if (param1Boolean) {
        try {
          if (i.c2(this.a.b) != null) {
            String str = i.d2(this.a.b).x();
            byte b1 = 1;
            int i = b1;
            if (str != null) {
              i = b1;
              if (!"".equals(str))
                i = 1 + Integer.parseInt(str); 
            } 
            TextView textView = i.c2(this.a.b);
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(i);
            stringBuilder.append(" ");
            stringBuilder.append(param1String);
            stringBuilder.append(" ");
            stringBuilder.append(this.a.b.O().getString(2131755656));
            textView.setText(stringBuilder.toString());
            i.c2(this.a.b).setVisibility(0);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else if (i.c2(this.a.b) != null) {
        i.c2(this.a.b).setVisibility(8);
      } 
    }
  }
  
  class b implements com.allinone.callerid.i.a.d.b {
    b(i this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean && l0.u() && b1.o0() && i1.j0(i.g2(this.a)) && i1.r0(i.g2(this.a)) && !i1.o0(i.g2(this.a), l0.a())) {
        if (l0.e() != null && !"".equals(l0.e()))
          u.b(i.g2(this.a), l0.e(), 2131231148, i.h2(this.a)); 
        if (l0.c() != null && !"".equals(l0.c()))
          i.S1(this.a).setText(l0.c()); 
        if (l0.b() != null && !"".equals(l0.b()))
          i.T1(this.a).setText(l0.b()); 
        i.U1(this.a).setVisibility(0);
        q.b().c("pdt_recommend_show");
        i.V1(this.a).setVisibility(8);
        if (b1.t0()) {
          i i1 = this.a;
          i.X1(i1, AnimationUtils.loadAnimation(i.g2(i1), 2130772035));
          i.W1(this.a).setInterpolator((Interpolator)new LinearInterpolator());
          i.h2(this.a).startAnimation(i.W1(this.a));
          b1.a2(false);
        } else {
          i.V1(this.a).setVisibility(0);
        } 
      } 
    }
  }
  
  class c implements Runnable {
    c(i this$0) {}
    
    public void run() {
      int j = com.allinone.callerid.f.k.b.d().e(i.d2(this.b).p());
      i.b2(this.b).runOnUiThread(new a(this, j));
    }
    
    class a implements Runnable {
      a(i.c this$0, int param2Int) {}
      
      public void run() {
        try {
          if (this.b > 0)
            i.Y1(this.c.b).setVisibility(0); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(i this$0, int param1Int) {}
    
    public void run() {
      try {
        if (this.b > 0)
          i.Y1(this.c.b).setVisibility(0); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class d implements com.allinone.callerid.util.gg.c.c {
    d(i this$0) {}
    
    public void a() {
      com.allinone.callerid.util.gg.c.c().b();
      i.Q1(this.a);
    }
    
    public void b(g param1g) {
      try {
        UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)View.inflate((Context)i.b2(this.a), 2131492868, null);
        com.allinone.callerid.util.gg.d.a(param1g, unifiedNativeAdView);
        i.Z1(this.a).removeAllViews();
        i.Z1(this.a).addView((View)unifiedNativeAdView);
        i.Z1(this.a).setVisibility(0);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class e implements com.allinone.callerid.i.a.e.a {
    e(i this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        try {
          i.e2(this.a).setVisibility(0);
          i.f2(this.a).setVisibility(0);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        i.e2(this.a).setVisibility(8);
        i.f2(this.a).setVisibility(8);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */