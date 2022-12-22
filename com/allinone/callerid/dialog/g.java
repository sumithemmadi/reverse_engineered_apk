package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.mvc.controller.permission.OverlayGuideActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.q;

public class g extends Dialog implements View.OnClickListener {
  private Context b;
  
  public g(Context paramContext, int paramInt) {
    super(paramContext, paramInt);
    this.b = paramContext;
  }
  
  private void b() {
    try {
      Handler handler = new Handler();
      this();
      a a = new a();
      this(this);
      handler.postDelayed(a, 500L);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297132:
        dismiss();
      case 2131296817:
        try {
          b();
          Intent intent = new Intent();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("package:");
          stringBuilder.append(this.b.getApplicationContext().getPackageName());
          this("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuilder.toString()));
          intent.setFlags(268435456);
          this.b.startActivity(intent);
          q.b().c("over_per_first_show_click");
          dismiss();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296816:
        break;
    } 
    dismiss();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131493013);
    Typeface typeface = g1.b();
    ((TextView)findViewById(2131298187)).setTypeface(typeface, 1);
    ((TextView)findViewById(2131297866)).setTypeface(typeface);
    ((TextView)findViewById(2131297901)).setTypeface(typeface);
    ((TextView)findViewById(2131297843)).setTypeface(typeface);
    ImageView imageView = (ImageView)findViewById(2131297132);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296817);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296816);
    frameLayout2.setOnClickListener(this);
    frameLayout1.setOnClickListener(this);
    imageView.setOnClickListener(this);
  }
  
  class a implements Runnable {
    a(g this$0) {}
    
    public void run() {
      Intent intent = new Intent(g.a(this.b), OverlayGuideActivity.class);
      intent.addFlags(268435456);
      g.a(this.b).startActivity(intent);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */