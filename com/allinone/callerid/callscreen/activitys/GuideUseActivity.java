package com.allinone.callerid.callscreen.activitys;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.customview.CirclePageIndicator;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.CustomViewPager;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.q;
import java.util.ArrayList;
import java.util.List;

public class GuideUseActivity extends BaseActivity implements View.OnClickListener {
  private TextView A;
  
  private ArrayList<View> B;
  
  private final String s = "GuideUseActivity";
  
  private Typeface t;
  
  private CustomViewPager u;
  
  private ImageView v;
  
  private CirclePageIndicator w;
  
  private TextView x;
  
  private TextView y;
  
  private FrameLayout z;
  
  private void R() {
    ArrayList<View> arrayList = this.B;
    if (arrayList == null) {
      this.B = new ArrayList<View>();
    } else {
      arrayList.clear();
    } 
    for (byte b = 0; b < 3; b++) {
      (new int[3])[0] = 2131493213;
      (new int[3])[1] = 2131493215;
      (new int[3])[2] = 2131493214;
      View view = getLayoutInflater().inflate((new int[3])[b], null, false);
      this.B.add(view);
    } 
    this.u.setAdapter(new b(this.B));
    this.u.c(new a(this));
    float f = (getResources().getDisplayMetrics()).density;
    this.w.setRadius(4.0F * f);
    this.w.setPageColor(getResources().getColor(2131099941));
    this.w.setFillColor(getResources().getColor(2131099940));
    this.w.setStrokeColor(getResources().getColor(2131099941));
    this.w.setPaddind(f * 6.0F);
    this.w.setViewPager((ViewPager)this.u);
  }
  
  private void u() {
    this.u = (CustomViewPager)findViewById(2131298267);
    this.v = (ImageView)findViewById(2131296968);
    this.w = (CirclePageIndicator)findViewById(2131298268);
    this.x = (TextView)findViewById(2131298187);
    this.y = (TextView)findViewById(2131297867);
    this.z = (FrameLayout)findViewById(2131296815);
    this.A = (TextView)findViewById(2131297830);
    this.v.setOnClickListener(this);
    this.z.setOnClickListener(this);
    this.x.setTypeface(this.t);
    this.y.setTypeface(this.t);
    this.A.setTypeface(this.t);
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296815) {
      if (i == 2131296968) {
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } else {
      i = this.u.getCurrentItem();
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            finish();
            overridePendingTransition(2130771968, 2130771969);
            q.b().c("callscreen_user_guide_gotit");
          } 
        } else {
          this.u.setCurrentItem(2);
        } 
      } else {
        this.u.setCurrentItem(1);
      } 
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492911);
    this.t = g1.b();
    u();
    R();
  }
  
  protected void onDestroy() {
    super.onDestroy();
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
  
  class a implements ViewPager.i {
    a(GuideUseActivity this$0) {}
    
    public void a(int param1Int1, float param1Float, int param1Int2) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("当前页：");
        stringBuilder.append(param1Int1);
        d0.a("scollpage", stringBuilder.toString());
      } 
    }
    
    public void c(int param1Int) {}
    
    public void d(int param1Int) {
      if (param1Int == 0) {
        GuideUseActivity.O(this.b).setText(this.b.getResources().getString(2131755396));
        GuideUseActivity.P(this.b).setText(this.b.getResources().getString(2131755386));
        GuideUseActivity.Q(this.b).setText(this.b.getResources().getString(2131755818));
      } else if (param1Int == 1) {
        GuideUseActivity.O(this.b).setText(this.b.getResources().getString(2131755398));
        GuideUseActivity.P(this.b).setText(this.b.getResources().getString(2131755388));
        GuideUseActivity.Q(this.b).setText(this.b.getResources().getString(2131755818));
      } else if (param1Int == 2) {
        GuideUseActivity.O(this.b).setText(this.b.getResources().getString(2131755397));
        GuideUseActivity.P(this.b).setText(this.b.getResources().getString(2131755387));
        GuideUseActivity.Q(this.b).setText(this.b.getResources().getString(2131755797));
      } 
    }
  }
  
  static class b extends androidx.viewpager.widget.a {
    List<View> c;
    
    b(List<View> param1List) {
      this.c = param1List;
    }
    
    public void b(ViewGroup param1ViewGroup, int param1Int, Object<View> param1Object) {
      param1Object = (Object<View>)this.c;
      if (param1Object != null && param1Object.size() > param1Int && this.c.get(param1Int) != null)
        param1ViewGroup.removeView(this.c.get(param1Int)); 
    }
    
    public int e() {
      return this.c.size();
    }
    
    public Object j(ViewGroup param1ViewGroup, int param1Int) {
      try {
        param1ViewGroup.addView(this.c.get(param1Int), 0);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      ((View)this.c.get(param1Int)).setOnClickListener(new a(this));
      return this.c.get(param1Int);
    }
    
    public boolean k(View param1View, Object param1Object) {
      boolean bool;
      if (param1View == param1Object) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void n(Parcelable param1Parcelable, ClassLoader param1ClassLoader) {
      super.n(param1Parcelable, param1ClassLoader);
    }
    
    public Parcelable o() {
      return super.o();
    }
    
    public void t(ViewGroup param1ViewGroup) {
      super.t(param1ViewGroup);
    }
    
    class a implements View.OnClickListener {
      a(GuideUseActivity.b this$0) {}
      
      public void onClick(View param2View) {}
    }
  }
  
  class a implements View.OnClickListener {
    a(GuideUseActivity this$0) {}
    
    public void onClick(View param1View) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/GuideUseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */