package com.allinone.callerid.start;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.allinone.callerid.main.BaseActivity;

public class PreviewTopSmallActivity extends BaseActivity {
  private final String s = "PreviewTopSmallActivity";
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492942);
    ((ImageView)findViewById(2131296904)).setOnClickListener(new a(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      finish();
      overridePendingTransition(2130771968, 2130771969);
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause() {
    super.onPause();
  }
  
  public void onResume() {
    super.onResume();
  }
  
  class a implements View.OnClickListener {
    a(PreviewTopSmallActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/PreviewTopSmallActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */