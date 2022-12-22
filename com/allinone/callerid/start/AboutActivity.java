package com.allinone.callerid.start;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class AboutActivity extends BaseActivity {
  private final String s = "AboutActivity";
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492897);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    TextView textView2 = (TextView)findViewById(2131298188);
    TextView textView3 = (TextView)findViewById(2131297802);
    TextView textView1 = (TextView)findViewById(2131297754);
    TextView textView4 = (TextView)findViewById(2131298245);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getResources().getString(2131755850));
    stringBuilder.append(":");
    stringBuilder.append(i1.W((Context)this));
    textView4.setText(stringBuilder.toString());
    ImageView imageView = (ImageView)findViewById(2131296850);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new a(this));
    textView3.setTypeface(g1.b());
    textView1.setTypeface(g1.b());
    textView4.setTypeface(g1.b());
    textView2.setTypeface(g1.b());
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
  
  class a implements View.OnClickListener {
    a(AboutActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/AboutActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */