package com.allinone.callerid.start;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.permission.OverlayPerActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class PrivacyActivity extends BaseActivity {
  private void O() {
    Typeface typeface = g1.b();
    TextView textView1 = (TextView)findViewById(2131298047);
    TextView textView2 = (TextView)findViewById(2131296499);
    TextView textView3 = (TextView)findViewById(2131296500);
    TextView textView4 = (TextView)findViewById(2131296501);
    TextView textView5 = (TextView)findViewById(2131296502);
    TextView textView6 = (TextView)findViewById(2131296503);
    TextView textView7 = (TextView)findViewById(2131296504);
    TextView textView8 = (TextView)findViewById(2131296505);
    TextView textView9 = (TextView)findViewById(2131296506);
    TextView textView10 = (TextView)findViewById(2131296507);
    TextView textView11 = (TextView)findViewById(2131298046);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296815);
    TextView textView12 = (TextView)findViewById(2131297830);
    textView2.setMovementMethod(LinkMovementMethod.getInstance());
    textView6.setMovementMethod(LinkMovementMethod.getInstance());
    textView11.setMovementMethod(LinkMovementMethod.getInstance());
    i1.G0(textView2);
    i1.G0(textView6);
    frameLayout.setOnClickListener(new a(this));
    textView1.setTypeface(typeface);
    textView2.setTypeface(typeface);
    textView3.setTypeface(typeface);
    textView4.setTypeface(typeface);
    textView5.setTypeface(typeface);
    textView6.setTypeface(typeface);
    textView7.setTypeface(typeface);
    textView8.setTypeface(typeface);
    textView9.setTypeface(typeface);
    textView10.setTypeface(typeface);
    textView11.setTypeface(typeface);
    textView12.setTypeface(typeface);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492943);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    q.b().c("privacy_show");
    O();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      try {
        Intent intent = new Intent();
        this("android.intent.action.MAIN");
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return true;
    } 
    return super.onKeyDown(paramInt, (KeyEvent)exception);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements View.OnClickListener {
    a(PrivacyActivity this$0) {}
    
    public void onClick(View param1View) {
      q.b().c("privacy_click");
      Intent intent = new Intent();
      if (com.allinone.callerid.util.k1.a.f()) {
        intent.setClass((Context)this.b, MainActivity.class);
      } else {
        intent.setClass((Context)this.b, OverlayPerActivity.class);
      } 
      this.b.startActivity(intent);
      this.b.overridePendingTransition(2130771968, 2130771969);
      this.b.finish();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/PrivacyActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */