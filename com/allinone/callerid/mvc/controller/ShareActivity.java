package com.allinone.callerid.mvc.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.BaseThemeActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class ShareActivity extends BaseThemeActivity implements View.OnClickListener {
  private final String s = "ShareActivity";
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296820) {
      if (i == 2131297117) {
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } else {
      try {
        b1.F2(Boolean.FALSE);
        q.b().c("dialog_share");
        Intent intent = new Intent();
        this("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131755727));
        intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131755728));
        intent.setFlags(268435456);
        startActivity(Intent.createChooser(intent, "Choose type"));
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
    setContentView(2131492960);
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
    a(ShareActivity this$0) {}
    
    public void run() {
      if (i1.f0(this.b.getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        this.b.getWindow().getDecorView().setLayoutDirection(1); 
      q.b().c("share_dialog");
      Typeface typeface = g1.b();
      TextView textView1 = (TextView)this.b.findViewById(2131297923);
      TextView textView2 = (TextView)this.b.findViewById(2131297930);
      TextView textView3 = (TextView)this.b.findViewById(2131298123);
      ImageView imageView = (ImageView)this.b.findViewById(2131297117);
      ((FrameLayout)this.b.findViewById(2131296820)).setOnClickListener(this.b);
      imageView.setOnClickListener(this.b);
      textView1.setTypeface(typeface, 1);
      textView2.setTypeface(typeface);
      textView3.setTypeface(typeface, 1);
      textView2.setText(this.b.getResources().getString(2131755415).replace("X", String.valueOf(b1.w0())));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/ShareActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */