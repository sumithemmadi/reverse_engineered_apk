package com.allinone.callerid.callscreen.activitys;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.d.f.f;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.io.File;

public class CallScreenSettingActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "CallScreenSettingActivity";
  
  private Switch t;
  
  private FrameLayout u;
  
  private Switch v;
  
  private Typeface w;
  
  private FrameLayout x;
  
  private TextView y;
  
  private void R() {
    if (com.allinone.callerid.util.k1.a.a(getApplicationContext())) {
      this.u.setVisibility(8);
    } else {
      this.u.setVisibility(0);
    } 
    this.t.setChecked(f.b());
    this.v.setChecked(f.f());
    this.t.setOnCheckedChangeListener(new b(this));
    this.v.setOnCheckedChangeListener(new c(this));
  }
  
  private void S() {
    ImageView imageView = (ImageView)findViewById(2131296949);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    TextView textView1 = (TextView)findViewById(2131298113);
    TextView textView2 = (TextView)findViewById(2131297837);
    this.t = (Switch)findViewById(2131297692);
    this.u = (FrameLayout)findViewById(2131296769);
    TextView textView3 = (TextView)findViewById(2131298037);
    TextView textView4 = (TextView)findViewById(2131298039);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296805);
    TextView textView5 = (TextView)findViewById(2131298207);
    TextView textView6 = (TextView)findViewById(2131298208);
    TextView textView7 = (TextView)findViewById(2131298217);
    TextView textView8 = (TextView)findViewById(2131298216);
    this.v = (Switch)findViewById(2131297712);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296728);
    TextView textView9 = (TextView)findViewById(2131297831);
    this.x = (FrameLayout)findViewById(2131296806);
    this.y = (TextView)findViewById(2131298210);
    imageView.setOnClickListener(this);
    this.u.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    this.x.setOnClickListener(this);
    textView1.setTypeface(this.w);
    textView2.setTypeface(this.w);
    textView3.setTypeface(this.w);
    textView4.setTypeface(this.w);
    textView5.setTypeface(this.w);
    textView6.setTypeface(this.w);
    textView7.setTypeface(this.w);
    textView8.setTypeface(this.w);
    textView9.setTypeface(this.w);
    this.y.setTypeface(this.w);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    try {
      if (com.allinone.callerid.util.k1.a.a(getApplicationContext())) {
        this.u.setVisibility(8);
      } else {
        this.u.setVisibility(0);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onClick(View paramView) {
    Intent intent;
    switch (paramView.getId()) {
      default:
        return;
      case 2131296949:
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296806:
        startActivity(new Intent((Context)this, GuideUseActivity.class));
        overridePendingTransition(2130771968, 2130771969);
      case 2131296805:
        try {
          Intent intent1 = new Intent();
          this();
          intent1.setClass((Context)this, CallScreenUploadActivity.class);
          startActivity(intent1);
          overridePendingTransition(2130771968, 2130771969);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296769:
        intent = new Intent();
        intent.setClass((Context)this, OpenPerActivity.class);
        startActivityForResult(intent, 10010);
        overridePendingTransition(2130771968, 2130771969);
      case 2131296728:
        break;
    } 
    Toast.makeText(getApplicationContext(), getApplicationContext().getResources().getString(2131755199), 0).show();
    (new d(this)).start();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492913);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
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
    a(CallScreenSettingActivity this$0) {}
    
    public void run() {
      CallScreenSettingActivity.O(this.b, g1.b());
      CallScreenSettingActivity.P(this.b);
      CallScreenSettingActivity.Q(this.b);
    }
  }
  
  class b implements CompoundButton.OnCheckedChangeListener {
    b(CallScreenSettingActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      f.n(param1Boolean);
      if (!param1Boolean)
        q.b().c("callscreen_close"); 
    }
  }
  
  class c implements CompoundButton.OnCheckedChangeListener {
    c(CallScreenSettingActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      f.r(param1Boolean);
    }
  }
  
  class d extends Thread {
    d(CallScreenSettingActivity this$0) {}
    
    public void run() {
      super.run();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b.getApplicationContext().getExternalCacheDir());
      stringBuilder.append("/video-cache");
      File file = new File(stringBuilder.toString());
      if (file.exists())
        i1.l(file); 
      this.b.runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(CallScreenSettingActivity.d this$0) {}
      
      public void run() {
        Toast.makeText(this.b.b.getApplicationContext(), this.b.b.getApplicationContext().getResources().getString(2131755198), 0).show();
      }
    }
  }
  
  class a implements Runnable {
    a(CallScreenSettingActivity this$0) {}
    
    public void run() {
      Toast.makeText(this.b.b.getApplicationContext(), this.b.b.getApplicationContext().getResources().getString(2131755198), 0).show();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/CallScreenSettingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */