package com.allinone.callerid.mvc.controller;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.allinone.callerid.util.b0;
import com.allinone.callerid.util.d0;

public class SinglePixelActivity extends AppCompatActivity {
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    Window window = getWindow();
    window.setGravity(8388659);
    WindowManager.LayoutParams layoutParams = window.getAttributes();
    layoutParams.x = 0;
    layoutParams.y = 0;
    layoutParams.height = 1;
    layoutParams.width = 1;
    window.setAttributes(layoutParams);
    b0.b().d(this);
    if (d0.a)
      d0.a("tony", "SinglePixe--onCreate"); 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    if (d0.a)
      d0.a("tony", "SinglePixe--onDestroy"); 
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    finish();
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/SinglePixelActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */