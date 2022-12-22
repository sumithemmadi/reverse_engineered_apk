package com.allinone.callerid.start;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class BlockedHangupActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "BlockedHangupActivity";
  
  private EZSearchResult t;
  
  private void u() {
    ImageView imageView = (ImageView)findViewById(2131297122);
    ((FrameLayout)findViewById(2131296737)).setOnClickListener(this);
    imageView.setOnClickListener(this);
    TextView textView = (TextView)findViewById(2131298022);
    ((TextView)findViewById(2131297890)).setTypeface(g1.b());
    ((TextView)findViewById(2131298183)).setTypeface(g1.b());
    textView.setTypeface(g1.b());
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getResources().getString(2131755872));
    stringBuilder.append(" ");
    stringBuilder.append(this.t.getNumber());
    stringBuilder.append(" ");
    stringBuilder.append(getResources().getString(2131755767));
    textView.setText(stringBuilder.toString());
  }
  
  public void onClick(View paramView) {
    try {
      int i = paramView.getId();
      if (i != 2131296737) {
        if (i == 2131297122) {
          finish();
          overridePendingTransition(2130771968, 2130771969);
        } 
      } else {
        q.b().c("blocked_dialog_details");
        Intent intent = new Intent();
        this((Context)this, UnknownContactActivity.class);
        CallLogBean callLogBean = new CallLogBean();
        this();
        callLogBean.B0(this.t.getName());
        callLogBean.D0(this.t.getNumber());
        callLogBean.a0(this.t.getAddress());
        callLogBean.h1(this.t.getWebsite());
        callLogBean.b0(this.t.getIcon());
        callLogBean.N0(this.t.getType());
        callLogBean.Z0(this.t.getTel_number());
        callLogBean.Y0(this.t.getT_p());
        callLogBean.d1(this.t.getType_label());
        callLogBean.K0(String.valueOf(this.t.getReport_count()));
        callLogBean.e0(this.t.getLocation());
        callLogBean.L0(this.t.getName());
        callLogBean.w0(this.t.getFormat_tel_number());
        callLogBean.G0(this.t.getOperator());
        Bundle bundle = new Bundle();
        this();
        bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
        intent.putExtras(bundle);
        intent.setFlags(268435456);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
        finish();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.B0((Activity)this, a.d((Context)this, 2131099937));
    Intent intent = getIntent();
    if (intent != null)
      this.t = (EZSearchResult)intent.getParcelableExtra("contact_missed"); 
    q.b().c("blocked_dialog_show");
    setContentView(2131492905);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    u();
  }
  
  protected void onDestroy() {
    super.onDestroy();
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/BlockedHangupActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */