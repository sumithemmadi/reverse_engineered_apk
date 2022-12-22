package com.allinone.callerid.mvc.controller.guidep;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.u;

public class GuideAddContantActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "GuideAddContantActivity";
  
  private int t;
  
  private String u;
  
  private String v;
  
  private void O() {
    try {
      Intent intent = new Intent();
      this("android.intent.action.INSERT");
      intent.setType("vnd.android.cursor.dir/person");
      intent.setType("vnd.android.cursor.dir/contact");
      intent.setType("vnd.android.cursor.dir/raw_contact");
      intent.setFlags(268435456);
      intent.putExtra("phone_type", 2);
      intent.putExtra("phone", this.u);
      startActivity(intent);
      overridePendingTransition(2130771968, 2130771969);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void P() {
    Typeface typeface = g1.b();
    TextView textView1 = (TextView)findViewById(2131298183);
    ImageView imageView1 = (ImageView)findViewById(2131297122);
    ImageView imageView2 = (ImageView)findViewById(2131297360);
    TextView textView2 = (TextView)findViewById(2131298022);
    TextView textView3 = (TextView)findViewById(2131297886);
    ((TextView)findViewById(2131298059)).setVisibility(8);
    ConstraintLayout constraintLayout = (ConstraintLayout)findViewById(2131297172);
    TextView textView4 = (TextView)findViewById(2131298099);
    TextView textView5 = (TextView)findViewById(2131297832);
    constraintLayout.setVisibility(0);
    textView4.setOnClickListener(this);
    textView5.setOnClickListener(this);
    imageView1.setOnClickListener(this);
    textView1.setTypeface(typeface);
    textView2.setTypeface(typeface, 1);
    textView4.setTypeface(typeface);
    textView5.setTypeface(typeface);
    String str2 = this.v;
    if (str2 != null && !"".equals(str2)) {
      u.b(getApplicationContext(), this.v, 2131231148, imageView2);
    } else {
      imageView2.setImageResource(2131231148);
    } 
    textView2.setText(this.u);
    String str1 = getResources().getString(2131755384);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("<font color='#FF0000'> ");
    stringBuilder.append(this.t);
    stringBuilder.append("</font>");
    textView3.setText((CharSequence)Html.fromHtml(str1.replace("X", stringBuilder.toString())));
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131297122) {
      if (i != 2131297832) {
        if (i == 2131298099) {
          q.b().c("guide_addcontact_click");
          O();
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } 
      } else {
        q.b().c("guide_addcontact_call_click");
        if (c1.h(getApplicationContext())) {
          i = b1.q();
          if (i == -1) {
            if (Build.VERSION.SDK_INT >= 22) {
              c1.m((Context)this, this.u);
            } else {
              try {
                q0.a(getApplicationContext(), this.u);
                finish();
                overridePendingTransition(2130771968, 2130771969);
              } catch (Exception exception) {
                Toast.makeText(getApplicationContext(), getResources().getString(2131755541), 1).show();
              } 
            } 
          } else {
            c1.d((Context)this, i, this.u);
          } 
        } else {
          try {
            q0.a(getApplicationContext(), this.u);
            finish();
            overridePendingTransition(2130771968, 2130771969);
          } catch (Exception exception) {
            Toast.makeText(getApplicationContext(), getResources().getString(2131755541), 1).show();
          } 
        } 
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
    i1.B0((Activity)this, a.d((Context)this, 2131099937));
    setContentView(2131492899);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    Intent intent = getIntent();
    if (intent != null) {
      this.u = intent.getStringExtra("haoma");
      this.v = intent.getStringExtra("touxiang");
      this.t = intent.getIntExtra("cishu", 3);
    } 
    P();
    q.b().c("guide_addcontact_show");
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/guidep/GuideAddContantActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */