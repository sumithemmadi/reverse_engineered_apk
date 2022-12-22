package com.allinone.callerid.callscreen.activitys;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.customview.DeletableEditText;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.bumptech.glide.h;
import com.yanzhenjie.nohttp.NoHttp;

public class CallScreenUploadActivity extends BaseActivity implements View.OnClickListener {
  private Uri A;
  
  private androidx.appcompat.app.a B;
  
  private androidx.appcompat.app.a C;
  
  private final String s = "CallScreenUploadActivity";
  
  private Typeface t;
  
  private TextView u;
  
  private DeletableEditText v;
  
  private TextView w;
  
  private DeletableEditText x;
  
  private ImageView y;
  
  private ImageView z;
  
  private void W() {
    this.v.addTextChangedListener(new b(this));
    this.x.addTextChangedListener(new c(this));
  }
  
  private void X() {
    ImageView imageView1 = (ImageView)findViewById(2131296949);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView1.setImageResource(2131231059); 
    TextView textView1 = (TextView)findViewById(2131298207);
    ImageView imageView2 = (ImageView)findViewById(2131296873);
    TextView textView2 = (TextView)findViewById(2131298186);
    this.u = (TextView)findViewById(2131298187);
    this.v = (DeletableEditText)findViewById(2131296662);
    this.w = (TextView)findViewById(2131297803);
    this.x = (DeletableEditText)findViewById(2131296657);
    this.y = (ImageView)findViewById(2131297042);
    this.z = (ImageView)findViewById(2131297034);
    imageView1.setOnClickListener(this);
    imageView2.setOnClickListener(this);
    this.y.setOnClickListener(this);
    this.z.setOnClickListener(this);
    textView1.setTypeface(this.t);
    this.u.setTypeface(this.t);
    this.v.setTypeface(this.t);
    this.w.setTypeface(this.t);
    this.x.setTypeface(this.t);
  }
  
  private void Z(Context paramContext) {
    View view = LayoutInflater.from(paramContext).inflate(2131493020, null);
    TextView textView1 = (TextView)view.findViewById(2131298187);
    TextView textView2 = (TextView)view.findViewById(2131297866);
    ImageView imageView = (ImageView)view.findViewById(2131297122);
    textView1.setText(paramContext.getResources().getString(2131755843));
    textView2.setText(paramContext.getResources().getString(2131755844));
    textView1.setTypeface(this.t);
    textView2.setTypeface(this.t);
    imageView.setOnClickListener(new e(this));
    this.B = (new androidx.appcompat.app.a.a(paramContext)).r(view).d(true).k(new f(this)).s();
  }
  
  private void a0(Context paramContext) {
    View view = LayoutInflater.from(paramContext).inflate(2131493025, null);
    TextView textView = (TextView)view.findViewById(2131298209);
    ProgressBar progressBar = (ProgressBar)view.findViewById(2131297381);
    textView.setTypeface(this.t);
    this.C = (new androidx.appcompat.app.a.a(paramContext)).r(view).d(false).s();
  }
  
  private void b0(Uri paramUri) {
    try {
      ImageView imageView = this.z;
      if (imageView != null)
        imageView.setVisibility(0); 
      ((h)((h)com.bumptech.glide.c.u(getApplicationContext()).p(paramUri).b0(2131231460)).n(2131231460)).C0(this.y);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void c0(String paramString1, String paramString2, Uri paramUri) {
    q.b().c("callscreen_upload");
    com.allinone.callerid.d.e.d.a(paramString1, paramString2, paramUri, new d(this));
  }
  
  public void Y() {
    if (com.allinone.callerid.util.k1.a.e(getApplicationContext())) {
      com.allinone.callerid.d.f.a.h((Activity)this, 160);
    } else {
      com.allinone.callerid.util.k1.a.p((Activity)this, new g(this));
    } 
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == -1 && paramInt1 == 160)
      try {
        if (com.allinone.callerid.d.f.a.e()) {
          if (paramIntent != null) {
            Uri uri = paramIntent.getData();
            this.A = uri;
            b0(uri);
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("select_video_uri:");
              stringBuilder.append(this.A);
              d0.a("callscreen", stringBuilder.toString());
            } 
          } 
        } else {
          Toast.makeText((Context)this, "Has no SD card!", 0).show();
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297042:
        Y();
      case 2131297034:
        this.z.setVisibility(8);
        this.y.setImageResource(2131231460);
        this.A = null;
      case 2131296949:
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296873:
        break;
    } 
    String str1 = this.v.getText().toString();
    String str2 = this.x.getText().toString();
    if (!"".equals(str1)) {
      if (!"".equals(str2)) {
        if (this.A != null) {
          a0((Context)this);
          c0(str1, str2, this.A);
        } 
        Toast.makeText(getApplicationContext(), getResources().getString(2131755542), 1).show();
      } 
      Toast.makeText(getApplicationContext(), getResources().getString(2131755840), 1).show();
    } 
    Toast.makeText(getApplicationContext(), getResources().getString(2131755847), 1).show();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492914);
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
    a(CallScreenUploadActivity this$0) {}
    
    public void run() {
      NoHttp.initialize(this.b.getApplicationContext());
      CallScreenUploadActivity.O(this.b, g1.b());
      CallScreenUploadActivity.P(this.b);
      CallScreenUploadActivity.Q(this.b);
      q.b().c("callscreen_upload_show");
    }
  }
  
  class b implements TextWatcher {
    b(CallScreenUploadActivity this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      if (param1CharSequence.length() > 0) {
        CallScreenUploadActivity.R(this.b).setVisibility(0);
      } else {
        CallScreenUploadActivity.R(this.b).setVisibility(4);
      } 
    }
  }
  
  class c implements TextWatcher {
    c(CallScreenUploadActivity this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      if (param1CharSequence.length() > 0) {
        CallScreenUploadActivity.S(this.b).setVisibility(0);
      } else {
        CallScreenUploadActivity.S(this.b).setVisibility(4);
      } 
    }
  }
  
  class d implements com.allinone.callerid.d.e.d.a {
    d(CallScreenUploadActivity this$0) {}
    
    public void a(boolean param1Boolean1, boolean param1Boolean2) {
      if (CallScreenUploadActivity.T(this.a) != null)
        CallScreenUploadActivity.T(this.a).dismiss(); 
      if (param1Boolean1) {
        CallScreenUploadActivity callScreenUploadActivity = this.a;
        CallScreenUploadActivity.U(callScreenUploadActivity, (Context)callScreenUploadActivity);
        q.b().c("callscreen_upload_success");
      } else if (param1Boolean2) {
        Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755852), 1).show();
      } else {
        Toast.makeText(this.a.getApplicationContext(), this.a.getResources().getString(2131755841), 1).show();
      } 
    }
  }
  
  class e implements View.OnClickListener {
    e(CallScreenUploadActivity this$0) {}
    
    public void onClick(View param1View) {
      if (CallScreenUploadActivity.V(this.b) != null)
        CallScreenUploadActivity.V(this.b).dismiss(); 
    }
  }
  
  class f implements DialogInterface.OnDismissListener {
    f(CallScreenUploadActivity this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class g implements com.allinone.callerid.util.k1.a.g {
    g(CallScreenUploadActivity this$0) {}
    
    public void a() {
      com.allinone.callerid.d.f.a.h((Activity)this.a, 160);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/CallScreenUploadActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */