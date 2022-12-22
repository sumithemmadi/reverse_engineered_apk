package com.allinone.callerid.callscreen.activitys;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.main.BaseThemeActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.io.Serializable;

public class GuideSetActivity extends BaseThemeActivity implements View.OnClickListener {
  private final String s = "OverlayGuideActivity";
  
  private Typeface t;
  
  private HomeInfo u;
  
  private long v;
  
  private void N() {
    this.u = (HomeInfo)getIntent().getSerializableExtra("homeinfo");
  }
  
  private void O() {
    ((RelativeLayout)findViewById(2131297503)).setOnClickListener(this);
    ((TextView)findViewById(2131297924)).setTypeface(this.t);
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131297503)
      if (this.u != null) {
        Intent intent = new Intent((Context)this, CallScreenPdtActivity.class);
        intent.putExtra("homeinfo", (Serializable)this.u);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
        finish();
      } else {
        finish();
        overridePendingTransition(2130771968, 2130771969);
      }  
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492910);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.t = g1.a();
    O();
    N();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      if (System.currentTimeMillis() - this.v > 2000L) {
        this.v = System.currentTimeMillis();
      } else {
        q.b().c("callscreen_list_tips_back");
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/GuideSetActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */