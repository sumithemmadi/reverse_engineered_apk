package com.allinone.callerid.mvc.controller.nodisturb;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.i1;

public abstract class DisturbBaseActivity extends AppCompatActivity {
  protected boolean s;
  
  protected void M() {
    finish();
    overridePendingTransition(2130771968, 2130771969);
  }
  
  protected void N() {}
  
  protected abstract void O();
  
  public void P() {
    int i = b1.A2();
    if (i != 0) {
      if (i != 1) {
        setTheme(2131820814);
      } else {
        setTheme(2131820776);
      } 
    } else {
      setTheme(2131820814);
    } 
  }
  
  protected void Q() {}
  
  protected void onCreate(Bundle paramBundle) {
    P();
    super.onCreate(paramBundle);
    O();
    boolean bool = i1.f0((Context)this).booleanValue();
    this.s = bool;
    if (bool && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    Q();
    N();
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/nodisturb/DisturbBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */