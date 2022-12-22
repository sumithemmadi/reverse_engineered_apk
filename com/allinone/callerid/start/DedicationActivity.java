package com.allinone.callerid.start;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.mvc.controller.report.ReportListActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class DedicationActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "DedicationActivity";
  
  private void O() {
    ((FrameLayout)findViewById(2131296509)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131296773)).setOnClickListener(this);
    ((FrameLayout)findViewById(2131297490)).setOnClickListener(this);
    ImageView imageView = (ImageView)findViewById(2131297125);
    imageView.setOnClickListener(this);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    ((FrameLayout)findViewById(2131297136)).setOnClickListener(this);
    Typeface typeface = g1.b();
    TextView textView1 = (TextView)findViewById(2131297868);
    TextView textView2 = (TextView)findViewById(2131298054);
    TextView textView3 = (TextView)findViewById(2131297858);
    textView1.setTypeface(typeface);
    textView2.setTypeface(typeface);
    textView3.setTypeface(typeface);
    ((TextView)findViewById(2131297965)).setTypeface(typeface);
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297490:
        q.b().c("cehua_complaint");
        intent = new Intent();
        intent.setClass((Context)this, ComplaintActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131297136:
        try {
          intent = new Intent();
          this("android.intent.action.VIEW");
          intent.setData(Uri.parse("fb://page/1096990483708279"));
          if (getPackageManager().queryIntentActivities(intent, 65536).size() == 0)
            intent.setData(Uri.parse("https://www.facebook.com/Showcaller-1096990483708279/")); 
          startActivity(intent);
        } catch (Exception exception) {
          exception.printStackTrace();
          try {
            Intent intent1 = new Intent();
            this("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/Showcaller-1096990483708279/"));
            startActivity(intent1);
          } catch (Exception exception1) {
            exception1.printStackTrace();
          } 
        } 
        q.b().c("like_me");
      case 2131297125:
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296773:
        q.b().c("rate");
        try {
          i1.C0((Context)this, getPackageName());
        } catch (Exception exception) {
          exception.getMessage();
        } 
      case 2131296509:
        break;
    } 
    Intent intent = new Intent();
    intent.setClass((Context)this, ReportListActivity.class);
    startActivity(intent);
    overridePendingTransition(2130771968, 2130771969);
    q.b().c("cehua_contribution");
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492921);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    O();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    finish();
    overridePendingTransition(2130771968, 2130771969);
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/DedicationActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */