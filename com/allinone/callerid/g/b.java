package com.allinone.callerid.g;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.allinone.callerid.customview.CirclePercentView;
import com.allinone.callerid.l.a.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.block.BlockManagerActivity;
import com.allinone.callerid.mvc.controller.block.BlockSettingActivity;
import com.allinone.callerid.mvc.controller.block.MyBlockListActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.u;
import java.lang.ref.WeakReference;

public class b extends Fragment implements View.OnClickListener {
  private final String c0 = "EZBlockFragment";
  
  private Typeface d0;
  
  private View e0;
  
  private ImageView f0;
  
  private TextView g0;
  
  private FrameLayout h0;
  
  private FrameLayout i0;
  
  private MainActivity j0;
  
  private Context k0;
  
  private androidx.appcompat.app.a l0;
  
  private FrameLayout m0;
  
  private boolean n0 = false;
  
  private CirclePercentView o0;
  
  private int p0 = 100;
  
  private int q0;
  
  private e r0;
  
  private g s0;
  
  private com.google.android.gms.ads.d t0;
  
  private boolean u0;
  
  private int v0;
  
  private int w0;
  
  private void h2(View paramView) {
    this.v0 = d1.b(this.k0, 2130968692, 2131230878);
    this.w0 = d1.b(this.k0, 2130968693, 2131230880);
    this.f0 = (ImageView)paramView.findViewById(2131297082);
    this.g0 = (TextView)paramView.findViewById(2131298028);
    TextView textView = (TextView)paramView.findViewById(2131298204);
    this.h0 = (FrameLayout)paramView.findViewById(2131296803);
    this.o0 = (CirclePercentView)paramView.findViewById(2131296478);
    this.i0 = (FrameLayout)paramView.findViewById(2131296804);
    this.h0.setOnClickListener(this);
    FrameLayout frameLayout1 = (FrameLayout)paramView.findViewById(2131297513);
    FrameLayout frameLayout2 = (FrameLayout)paramView.findViewById(2131297482);
    FrameLayout frameLayout3 = (FrameLayout)paramView.findViewById(2131297480);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    if (i1.f0(this.k0).booleanValue()) {
      ((ImageView)paramView.findViewById(2131297015)).setRotation(180.0F);
      ((ImageView)paramView.findViewById(2131296956)).setRotation(180.0F);
      ((ImageView)paramView.findViewById(2131296955)).setRotation(180.0F);
    } 
    ((TextView)paramView.findViewById(2131298205)).setTypeface(this.d0);
    ((TextView)paramView.findViewById(2131298206)).setTypeface(this.d0);
    ((TextView)paramView.findViewById(2131297982)).setTypeface(this.d0);
    ((TextView)paramView.findViewById(2131297983)).setTypeface(this.d0);
    ((TextView)paramView.findViewById(2131297824)).setTypeface(this.d0);
    ((TextView)paramView.findViewById(2131297825)).setTypeface(this.d0);
    ((TextView)paramView.findViewById(2131297817)).setTypeface(this.d0);
    ((TextView)paramView.findViewById(2131297818)).setTypeface(this.d0);
    this.g0.setTypeface(this.d0);
    textView.setTypeface(this.d0);
    long l = b1.m();
    if (l == 0L) {
      TextView textView1 = this.g0;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(O().getString(2131755431));
      stringBuilder.append(": ");
      stringBuilder.append(i.f(System.currentTimeMillis()));
      textView1.setText(stringBuilder.toString());
    } else {
      TextView textView1 = this.g0;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(O().getString(2131755431));
      stringBuilder.append(": ");
      stringBuilder.append(i.f(l));
      textView1.setText(stringBuilder.toString());
    } 
    i2(l);
    this.r0 = new e(this);
  }
  
  private void i2(long paramLong) {
    try {
      if (System.currentTimeMillis() - paramLong > 120000L) {
        this.i0.setBackgroundResource(this.w0);
        this.h0.setClickable(true);
        this.f0.setImageResource(2131230915);
        this.q0 = 0;
        this.o0.setVisibility(8);
      } else {
        this.f0.setImageResource(2131230916);
        this.i0.setBackgroundResource(this.v0);
        this.h0.setClickable(false);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void k2() {
    com.allinone.callerid.i.a.d.a.a(new d(this));
  }
  
  private void l2(Activity paramActivity) {
    try {
      View view = LayoutInflater.from((Context)paramActivity).inflate(2131493020, null);
      TextView textView = (TextView)view.findViewById(2131298187);
      ((TextView)view.findViewById(2131297866)).setVisibility(8);
      textView.setText(paramActivity.getResources().getString(2131755749));
      ImageView imageView = (ImageView)view.findViewById(2131297122);
      this.m0 = (FrameLayout)view.findViewById(2131296753);
      textView.setTypeface(this.d0);
      c c = new c();
      this(this);
      imageView.setOnClickListener(c);
      if (b0() && !paramActivity.isFinishing()) {
        androidx.appcompat.app.a.a a1 = new androidx.appcompat.app.a.a();
        this((Context)paramActivity);
        this.l0 = a1.r(view).d(true).s();
      } 
      if (this.u0)
        if (this.s0 != null) {
          UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)D().inflate(2131492867, null);
          com.allinone.callerid.util.gg.d.a(this.s0, unifiedNativeAdView);
          if (this.m0 != null) {
            if (d0.a)
              d0.a("tony", "ad has,show ad"); 
            this.m0.removeAllViews();
            this.m0.addView((View)unifiedNativeAdView);
            this.m0.setVisibility(0);
            this.m0 = null;
          } 
          this.s0 = null;
        } else {
          com.google.android.gms.ads.d d1 = this.t0;
          if (d1 != null && !d1.a())
            k2(); 
        }  
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void I0() {
    super.I0();
  }
  
  public void L1(boolean paramBoolean) {
    super.L1(paramBoolean);
    if (paramBoolean)
      try {
        if (this.n0 && this.k0 != null)
          i2(b1.m()); 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void N0() {
    super.N0();
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297513:
        try {
          Intent intent = new Intent();
          this(this.k0, MyBlockListActivity.class);
          M1(intent);
          this.j0.overridePendingTransition(2130771968, 2130771969);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131297482:
        try {
          Intent intent = new Intent();
          this(this.k0, BlockManagerActivity.class);
          M1(intent);
          this.j0.overridePendingTransition(2130771968, 2130771969);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131297480:
        try {
          Intent intent = new Intent();
          this(this.k0, BlockSettingActivity.class);
          M1(intent);
          this.j0.overridePendingTransition(2130771968, 2130771969);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296803:
        break;
    } 
    if (!i1.a((Context)EZCallApplication.c())) {
      Toast.makeText(this.k0, U(2131755688), 0).show();
      return;
    } 
    this.o0.setVisibility(0);
    this.i0.setBackgroundResource(this.v0);
    this.h0.setClickable(false);
    k2();
    (j0.a()).b.execute(new a(this));
    f.h((Context)EZCallApplication.c(), false, new b(this));
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.j0 = (MainActivity)paramContext;
    this.k0 = paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (this.e0 == null)
      try {
        this.n0 = true;
        i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
        this.e0 = paramLayoutInflater.inflate(2131493034, paramViewGroup, false);
        if (i1.f0(this.k0).booleanValue()) {
          int i = Build.VERSION.SDK_INT;
          if (i >= 17)
            try {
              MainActivity mainActivity = this.j0;
              if (mainActivity != null && mainActivity.getWindow() != null)
                this.j0.getWindow().getDecorView().setLayoutDirection(1); 
            } catch (Exception exception) {
              exception.printStackTrace();
            }  
        } 
        this.d0 = g1.b();
        h2(this.e0);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return this.e0;
  }
  
  public void x0() {
    super.x0();
  }
  
  public void z0() {
    super.z0();
    try {
      View view = this.e0;
      if (view != null) {
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null)
          viewGroup.removeView(this.e0); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      while (b.Q1(this.b) < b.Z1(this.b)) {
        b b1 = this.b;
        b.R1(b1, b.Q1(b1) + 5);
        b.b2(this.b).runOnUiThread(b.a2(this.b));
        try {
          Thread.sleep(150L);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
      b.b2(this.b).runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(b.a this$0) {}
      
      public void run() {
        try {
          b.R1(this.b.b, 0);
          b.c2(this.b.b).setImageResource(2131230916);
          b.S1(this.b.b).setVisibility(8);
          TextView textView = b.e2(this.b.b);
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(b.d2(this.b.b).getResources().getString(2131755431));
          stringBuilder.append(": ");
          stringBuilder.append(i.f(System.currentTimeMillis()));
          textView.setText(stringBuilder.toString());
          b1.Q0(System.currentTimeMillis());
          b b = this.b.b;
          b.f2(b, (Activity)b.b2(b));
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      try {
        b.R1(this.b.b, 0);
        b.c2(this.b.b).setImageResource(2131230916);
        b.S1(this.b.b).setVisibility(8);
        TextView textView = b.e2(this.b.b);
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(b.d2(this.b.b).getResources().getString(2131755431));
        stringBuilder.append(": ");
        stringBuilder.append(i.f(System.currentTimeMillis()));
        textView.setText(stringBuilder.toString());
        b1.Q0(System.currentTimeMillis());
        b b = this.b.b;
        b.f2(b, (Activity)b.b2(b));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b implements com.allinone.callerid.l.a.d {
    b(b this$0) {}
    
    public void a() {
      if (d0.a)
        d0.a("checkupdate", "onSuccess"); 
    }
    
    public void b() {
      if (d0.a)
        d0.a("checkupdate", "onEnd"); 
    }
  }
  
  class c implements View.OnClickListener {
    c(b this$0) {}
    
    public void onClick(View param1View) {
      if (b.g2(this.b) != null)
        b.g2(this.b).dismiss(); 
    }
  }
  
  class d implements com.allinone.callerid.i.a.d.b {
    d(b this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        b.T1(this.a, true);
        com.google.android.gms.ads.d.a a = new com.google.android.gms.ads.d.a(b.d2(this.a), "ca-app-pub-5825926894918682/1530656055");
        a.e(new a(this));
        u u = (new u.a()).b(true).a();
        a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
        b.Y1(this.a, a.f(new b(this)).a());
        b.X1(this.a).b((new com.google.android.gms.ads.e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
      } 
    }
    
    class a implements g.a {
      a(b.d this$0) {}
      
      public void r(g param2g) {
        if (d0.a)
          d0.a("tony", "onUnifiedNativeAdLoaded"); 
        try {
          b.U1(this.b.a, param2g);
          UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)this.b.a.D().inflate(2131492867, null);
          com.allinone.callerid.util.gg.d.a(param2g, unifiedNativeAdView);
          if (b.V1(this.b.a) != null) {
            if (d0.a)
              d0.a("tony", "fl_junk"); 
            b.V1(this.b.a).removeAllViews();
            b.V1(this.b.a).addView((View)unifiedNativeAdView);
            b.V1(this.b.a).setVisibility(0);
            b.W1(this.b.a, null);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
    
    class b extends com.google.android.gms.ads.b {
      b(b.d this$0) {}
      
      public void D(int param2Int) {
        super.D(param2Int);
      }
      
      public void K() {
        super.K();
        if (b.g2(this.a.a) != null)
          b.g2(this.a.a).dismiss(); 
      }
    }
  }
  
  class a implements g.a {
    a(b this$0) {}
    
    public void r(g param1g) {
      if (d0.a)
        d0.a("tony", "onUnifiedNativeAdLoaded"); 
      try {
        b.U1(this.b.a, param1g);
        UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)this.b.a.D().inflate(2131492867, null);
        com.allinone.callerid.util.gg.d.a(param1g, unifiedNativeAdView);
        if (b.V1(this.b.a) != null) {
          if (d0.a)
            d0.a("tony", "fl_junk"); 
          b.V1(this.b.a).removeAllViews();
          b.V1(this.b.a).addView((View)unifiedNativeAdView);
          b.V1(this.b.a).setVisibility(0);
          b.W1(this.b.a, null);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b extends com.google.android.gms.ads.b {
    b(b this$0) {}
    
    public void D(int param1Int) {
      super.D(param1Int);
    }
    
    public void K() {
      super.K();
      if (b.g2(this.a.a) != null)
        b.g2(this.a.a).dismiss(); 
    }
  }
  
  public static class e implements Runnable {
    final WeakReference<b> b;
    
    e(b param1b) {
      this.b = new WeakReference<b>(param1b);
    }
    
    public void run() {
      b b = this.b.get();
      if (b != null)
        b.S1(b).setPercentage(b.Q1(b)); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */