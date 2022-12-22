package com.allinone.callerid.mvc.controller.recommend;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.l0;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.u;

public class RecommendActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "RecommendActivity";
  
  private boolean t;
  
  private void O() {
    b1.R0(b1.n() + 1);
    if (b1.n() > 1)
      b1.D2(Boolean.FALSE); 
  }
  
  private void u() {
    Typeface typeface = g1.b();
    TextView textView1 = (TextView)findViewById(2131298187);
    TextView textView2 = (TextView)findViewById(2131297866);
    ImageView imageView1 = (ImageView)findViewById(2131297122);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296739);
    ImageView imageView2 = (ImageView)findViewById(2131297003);
    if (l0.d() != null && !"".equals(l0.d()))
      u.b(getApplicationContext(), l0.d(), 2131231148, imageView2); 
    if (l0.c() != null && !"".equals(l0.c()))
      textView1.setText(l0.c()); 
    if (l0.b() != null && !"".equals(l0.b()))
      textView2.setText(l0.b()); 
    imageView1.setOnClickListener(this);
    frameLayout.setOnClickListener(this);
    ((TextView)findViewById(2131298183)).setTypeface(typeface);
    textView1.setTypeface(typeface);
    textView2.setTypeface(typeface);
    ((TextView)findViewById(2131297927)).setTypeface(typeface);
  }
  
  public void onClick(View paramView) {
    try {
      int i = paramView.getId();
      if (i != 2131296739) {
        if (i == 2131297122) {
          O();
          q.b().c("callend_recommend_close");
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } 
      } else {
        O();
        q.b().c("callend_recommend_click");
        i1.J0(getApplicationContext(), l0.a(), "showcaller");
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.B0((Activity)this, a.d((Context)this, 2131099937));
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    setContentView(2131492946);
    u();
    this.t = true;
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  protected void onResume() {
    super.onResume();
    if (this.t) {
      this.t = false;
      q.b().c("callend_recommend_show");
      b1.Z1(System.currentTimeMillis());
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recommend/RecommendActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */