package com.allinone.callerid.mvc.controller.guidep;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.mvc.controller.comment.SubmitCommentActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.u;

public class GuideReportActivity extends BaseActivity implements View.OnClickListener {
  private TextView A;
  
  private ImageView B;
  
  private ImageView C;
  
  private TextView D;
  
  private TextView E;
  
  private TextView F;
  
  private Typeface G;
  
  private final String s = "GuideReportActivity";
  
  private String t;
  
  private int u;
  
  private String v;
  
  private String w;
  
  private String x;
  
  private String y;
  
  private String z;
  
  private void W() {
    this.G = g1.b();
    this.A = (TextView)findViewById(2131298183);
    this.B = (ImageView)findViewById(2131297122);
    this.C = (ImageView)findViewById(2131297360);
    this.D = (TextView)findViewById(2131298022);
    this.E = (TextView)findViewById(2131297886);
    TextView textView = (TextView)findViewById(2131298059);
    this.F = textView;
    textView.setOnClickListener(this);
    this.B.setOnClickListener(this);
    this.A.setTypeface(this.G);
    this.D.setTypeface(this.G, 1);
    this.E.setTypeface(this.G);
    this.D.setText(this.t);
    String str = getResources().getString(2131755389);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("<font color='#FF0000'> ");
    stringBuilder.append(this.u);
    stringBuilder.append("</font>");
    str = str.replace("X", stringBuilder.toString());
    this.E.setText((CharSequence)Html.fromHtml(str));
    str = this.v;
    if (str != null && !"".equals(str)) {
      u.a((Activity)this, this.v, 2131231148, this.C);
    } else {
      this.C.setImageResource(2131231148);
    } 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131297122) {
      if (i == 2131298059) {
        q.b().c("guide_report_click");
        CallLogBean callLogBean = new CallLogBean();
        callLogBean.D0(this.t);
        callLogBean.K0(this.w);
        callLogBean.d1(this.x);
        callLogBean.e1(this.y);
        callLogBean.Y0(this.z);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("number_content", (Parcelable)callLogBean);
        bundle.putInt("is_activity", 3);
        intent.putExtras(bundle);
        intent.setClass((Context)this, SubmitCommentActivity.class);
        intent.setFlags(268435456);
        startActivity(intent);
        finish();
        overridePendingTransition(2130771968, 2130771969);
      } 
    } else {
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      i1.B0((Activity)this, androidx.core.content.a.d((Context)this, 2131099937));
      setContentView(2131492899);
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      View view = getWindow().getDecorView();
      a a = new a();
      this(this);
      view.post(a);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
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
    a(GuideReportActivity this$0) {}
    
    public void run() {
      Intent intent = this.b.getIntent();
      GuideReportActivity.O(this.b, intent.getStringExtra("haoma"));
      GuideReportActivity.P(this.b, intent.getIntExtra("cishu", 0));
      GuideReportActivity.Q(this.b, intent.getStringExtra("icon"));
      GuideReportActivity.R(this.b, intent.getStringExtra("Report_count"));
      GuideReportActivity.S(this.b, intent.getStringExtra("Type_label"));
      GuideReportActivity.T(this.b, intent.getStringExtra("Type_label_id"));
      GuideReportActivity.U(this.b, intent.getStringExtra("T_p"));
      GuideReportActivity.V(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/guidep/GuideReportActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */