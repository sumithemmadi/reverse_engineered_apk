package com.allinone.callerid.mvc.controller.report;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.q;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.CustomViewPager;
import com.allinone.callerid.mvc.view.recorder.LTabIndicator;
import com.allinone.callerid.util.d;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ReportListActivity extends BaseActivity {
  private Tab[] s = new Tab[] { Tab.b, Tab.c };
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492951);
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
  
  public enum Tab {
    b, c;
    
    private final String name;
    
    static {
      Tab tab1 = new Tab("REPORTLIST", 0, d.f());
      b = tab1;
      Tab tab2 = new Tab("MYREPORTLIST", 1, d.e());
      c = tab2;
      d = new Tab[] { tab1, tab2 };
    }
    
    Tab(String param1String1) {
      this.name = param1String1;
    }
    
    public boolean equalsName(String param1String) {
      boolean bool;
      if (param1String != null && this.name.equals(param1String)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public String toString() {
      return this.name;
    }
  }
  
  class a implements Runnable {
    a(ReportListActivity this$0) {}
    
    public void run() {
      TextView textView = (TextView)this.b.findViewById(2131298190);
      ImageView imageView = (ImageView)this.b.findViewById(2131296850);
      if (i1.f0(this.b.getApplicationContext()).booleanValue())
        imageView.setImageResource(2131231059); 
      imageView.setOnClickListener(new a(this));
      textView.setTypeface(g1.b());
      CustomViewPager customViewPager = (CustomViewPager)this.b.findViewById(2131297243);
      LTabIndicator lTabIndicator = (LTabIndicator)this.b.findViewById(2131297242);
      lTabIndicator.p = d1.a((Context)this.b, 2130968868, 2131099727);
      lTabIndicator.o = d1.a((Context)this.b, 2130968901, 2131099742);
      lTabIndicator.setIndicatorColor(d1.a((Context)this.b, 2130968901, 2131099742));
      lTabIndicator.z = 16;
      lTabIndicator.q = 0;
      customViewPager.setAdapter((androidx.viewpager.widget.a)new ReportListActivity.c(this.b.s(), ReportListActivity.O(this.b)));
      lTabIndicator.setViewPager((ViewPager)customViewPager);
      customViewPager.setOffscreenPageLimit(2);
      customViewPager.setCurrentItem(0);
    }
    
    class a implements View.OnClickListener {
      a(ReportListActivity.a this$0) {}
      
      public void onClick(View param2View) {
        this.b.b.finish();
        this.b.b.overridePendingTransition(2130771968, 2130771969);
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(ReportListActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.b.finish();
      this.b.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  private static class c extends q {
    private static final Field j;
    
    Fragment[] k;
    
    ReportListActivity.Tab[] l;
    
    static {
      Field field = null;
      try {
        Field field1 = Class.forName("android.support.v4.app.FragmentManagerImpl").getDeclaredField("mActive");
        field = field1;
        field1.setAccessible(true);
        field = field1;
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      j = field;
    }
    
    public c(FragmentManager param1FragmentManager, ReportListActivity.Tab[] param1ArrayOfTab) {
      super(param1FragmentManager);
      this.l = param1ArrayOfTab;
      this.k = new Fragment[param1ArrayOfTab.length];
      try {
        ArrayList arrayList = (ArrayList)j.get(param1FragmentManager);
        if (arrayList != null)
          for (Fragment fragment : arrayList) {
            if (fragment instanceof b) {
              w(ReportListActivity.Tab.b, fragment);
              continue;
            } 
            if (fragment instanceof a)
              w(ReportListActivity.Tab.c, fragment); 
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    private void w(ReportListActivity.Tab param1Tab, Fragment param1Fragment) {
      byte b = 0;
      while (true) {
        ReportListActivity.Tab[] arrayOfTab = this.l;
        if (b < arrayOfTab.length) {
          if (arrayOfTab[b] == param1Tab) {
            this.k[b] = param1Fragment;
            break;
          } 
          b++;
          continue;
        } 
        break;
      } 
    }
    
    public int e() {
      return this.k.length;
    }
    
    public CharSequence g(int param1Int) {
      return (param1Int == 0) ? d.f() : ((param1Int == 1) ? d.e() : this.l[param1Int].toString());
    }
    
    public Fragment v(int param1Int) {
      if (this.k[param1Int] == null) {
        int i = ReportListActivity.b.a[this.l[param1Int].ordinal()];
        if (i != 1) {
          if (i == 2)
            this.k[param1Int] = a.o2(); 
        } else {
          this.k[param1Int] = b.V1();
        } 
      } 
      return this.k[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/report/ReportListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */