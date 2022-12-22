package com.allinone.callerid.mvc.controller;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;

public class GuideNotifiPerActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "GuideNotifiPerActivity";
  
  private Typeface t;
  
  private void Q() {
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296815);
    ImageView imageView = (ImageView)findViewById(2131296968);
    View view = findViewById(2131298250);
    ((TextView)findViewById(2131298183)).setTypeface(this.t);
    ((TextView)findViewById(2131297830)).setTypeface(this.t);
    frameLayout.setOnClickListener(this);
    imageView.setOnClickListener(this);
    view.setOnClickListener(this);
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296815) {
      if (i != 2131296968) {
        if (i == 2131298250) {
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } 
      } else {
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } else {
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492926);
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
  
  class a implements Runnable {
    a(GuideNotifiPerActivity this$0) {}
    
    public void run() {
      GuideNotifiPerActivity.O(this.b, g1.b());
      GuideNotifiPerActivity.P(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/GuideNotifiPerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */