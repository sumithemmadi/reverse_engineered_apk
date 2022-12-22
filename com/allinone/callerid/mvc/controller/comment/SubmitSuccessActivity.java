package com.allinone.callerid.mvc.controller.comment;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class SubmitSuccessActivity extends BaseActivity {
  private final String s = "SubmitSuccessActivity";
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492963);
    Typeface typeface = g1.b();
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    getWindow().getDecorView().post(new a(this, typeface));
    q.b().c("seubmit_comment_success");
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
    a(SubmitSuccessActivity this$0, Typeface param1Typeface) {}
    
    public void run() {
      TextView textView1 = (TextView)this.c.findViewById(2131298187);
      TextView textView2 = (TextView)this.c.findViewById(2131298153);
      TextView textView3 = (TextView)this.c.findViewById(2131298154);
      ImageView imageView = (ImageView)this.c.findViewById(2131296850);
      if (i1.f0(this.c.getApplicationContext()).booleanValue())
        imageView.setImageResource(2131231059); 
      imageView.setOnClickListener(new a(this));
      textView1.setTypeface(this.b);
      textView2.setTypeface(this.b);
      textView3.setTypeface(this.b);
    }
    
    class a implements View.OnClickListener {
      a(SubmitSuccessActivity.a this$0) {}
      
      public void onClick(View param2View) {
        this.b.c.finish();
        this.b.c.overridePendingTransition(2130771968, 2130771969);
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(SubmitSuccessActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.c.finish();
      this.b.c.overridePendingTransition(2130771968, 2130771969);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/comment/SubmitSuccessActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */