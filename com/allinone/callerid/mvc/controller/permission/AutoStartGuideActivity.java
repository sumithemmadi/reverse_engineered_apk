package com.allinone.callerid.mvc.controller.permission;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.allinone.callerid.main.BaseThemeActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class AutoStartGuideActivity extends BaseThemeActivity implements View.OnClickListener {
  private final String s = "AutoStartGuideActivity";
  
  private Typeface t;
  
  private Switch u;
  
  private ImageView v;
  
  private Animation w;
  
  private Animation x;
  
  private void R() {
    ((TextView)findViewById(2131297984)).setTypeface(this.t);
    ((TextView)findViewById(2131298042)).setTypeface(this.t);
    View view = findViewById(2131297472);
    this.u = (Switch)findViewById(2131297691);
    this.v = (ImageView)findViewById(2131296992);
    view.setOnClickListener(this);
    this.w = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771993);
    this.x = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771994);
    this.w.setAnimationListener(new a(this));
    this.x.setAnimationListener(new b(this));
    this.v.startAnimation(this.w);
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131297472) {
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492901);
    try {
      Display display = getWindowManager().getDefaultDisplay();
      WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
      int i = display.getWidth();
      double d = i;
      Double.isNaN(d);
      i = (int)(d * 1.0D);
      layoutParams.width = i;
      getWindow().setAttributes(layoutParams);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.t = g1.b();
    R();
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
  
  class a implements Animation.AnimationListener {
    a(AutoStartGuideActivity this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      AutoStartGuideActivity.O(this.a).startAnimation(AutoStartGuideActivity.N(this.a));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class b implements Animation.AnimationListener {
    b(AutoStartGuideActivity this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      AutoStartGuideActivity.O(this.a).setVisibility(4);
      AutoStartGuideActivity.P(this.a).setChecked(true);
      AutoStartGuideActivity.O(this.a).postDelayed(new a(this), 1000L);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
    
    class a implements Runnable {
      a(AutoStartGuideActivity.b this$0) {}
      
      public void run() {
        AutoStartGuideActivity.P(this.b.a).setChecked(false);
        AutoStartGuideActivity.O(this.b.a).setVisibility(0);
        AutoStartGuideActivity.O(this.b.a).startAnimation(AutoStartGuideActivity.Q(this.b.a));
      }
    }
  }
  
  class a implements Runnable {
    a(AutoStartGuideActivity this$0) {}
    
    public void run() {
      AutoStartGuideActivity.P(this.b.a).setChecked(false);
      AutoStartGuideActivity.O(this.b.a).setVisibility(0);
      AutoStartGuideActivity.O(this.b.a).startAnimation(AutoStartGuideActivity.Q(this.b.a));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/permission/AutoStartGuideActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */