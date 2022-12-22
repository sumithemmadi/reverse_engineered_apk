package com.allinone.callerid.g;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.b.n;
import com.allinone.callerid.d.d.b;
import com.allinone.callerid.d.f.f;
import com.allinone.callerid.main.CustomViewPager;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.view.recorder.LTabIndicator;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.util.Date;

public class d extends Fragment implements View.OnClickListener {
  private final String c0 = "EZCallScreenFragment";
  
  private View d0;
  
  private CustomViewPager e0;
  
  private b f0;
  
  private Context g0;
  
  private boolean h0;
  
  private void Q1(View paramView) {
    this.e0 = (CustomViewPager)paramView.findViewById(2131298266);
    LTabIndicator lTabIndicator = (LTabIndicator)paramView.findViewById(2131297242);
    n n = new n(B());
    this.f0 = new b();
    com.allinone.callerid.d.d.a a = new com.allinone.callerid.d.d.a();
    n.y((Fragment)this.f0, U(2131755607));
    n.y((Fragment)a, U(2131755433));
    this.e0.c(new a(this));
    this.e0.setAdapter((androidx.viewpager.widget.a)n);
    lTabIndicator.p = d1.a(this.g0, 2130968868, 2131099727);
    lTabIndicator.o = d1.a(this.g0, 2130968901, 2131099742);
    lTabIndicator.setIndicatorColor(d1.a(this.g0, 2130968901, 2131099742));
    lTabIndicator.z = 16;
    lTabIndicator.q = 0;
    lTabIndicator.setViewPager((ViewPager)this.e0);
  }
  
  public void I0() {
    super.I0();
  }
  
  public void L1(boolean paramBoolean) {
    super.L1(paramBoolean);
    if (paramBoolean) {
      f.q(false);
      if (f.e() && i.r(new Date(f.c()), new Date(System.currentTimeMillis())))
        q.b().c("new_user_callscreen_show"); 
      com.allinone.callerid.d.f.a.d = true;
      if (this.h0) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("isEnterOnCreate:");
          stringBuilder.append(this.h0);
          d0.a("callscreen", stringBuilder.toString());
        } 
        this.h0 = false;
        this.f0.o2(1, "download_count");
      } 
      CustomViewPager customViewPager = this.e0;
      if (customViewPager != null) {
        int i = customViewPager.getCurrentItem();
        if (i != 0) {
          if (i == 1) {
            if (d0.a)
              d0.a("callscreen", "latestFragment"); 
            q.b().c("callscreen_list_last_show_new");
          } 
        } else {
          if (d0.a)
            d0.a("callscreen", "popularFragment"); 
          q.b().c("callscreen_list_download_show_new");
        } 
        if (com.allinone.callerid.d.f.a.e) {
          com.allinone.callerid.d.f.a.e = false;
          this.e0.setCurrentItem(1);
        } 
      } 
      try {
        InputMethodManager inputMethodManager = (InputMethodManager)t().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive()) {
          View view = m().getWindow().peekDecorView();
          if (view != null && view.getWindowToken() != null)
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } else {
      com.allinone.callerid.d.f.a.d = false;
    } 
  }
  
  public void N0() {
    super.N0();
  }
  
  public void onClick(View paramView) {}
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.g0 = paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    this.h0 = true;
    i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
    if (this.d0 == null) {
      this.d0 = paramLayoutInflater.inflate(2131493036, paramViewGroup, false);
      if (i1.f0(t()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        try {
          if (m() != null && m().getWindow() != null)
            m().getWindow().getDecorView().setLayoutDirection(1); 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      Q1(this.d0);
    } 
    return this.d0;
  }
  
  public void x0() {
    super.x0();
  }
  
  public void z0() {
    super.z0();
    try {
      View view = this.d0;
      if (view != null) {
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null)
          viewGroup.removeView(this.d0); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements ViewPager.i {
    a(d this$0) {}
    
    public void a(int param1Int1, float param1Float, int param1Int2) {}
    
    public void c(int param1Int) {}
    
    public void d(int param1Int) {
      if (param1Int != 0) {
        if (param1Int == 1) {
          if (d0.a)
            d0.a("callscreen", "latestFragment"); 
          q.b().c("callscreen_list_last_show_new");
        } 
      } else {
        if (d0.a)
          d0.a("callscreen", "popularFragment"); 
        q.b().c("callscreen_list_download_show_new");
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */