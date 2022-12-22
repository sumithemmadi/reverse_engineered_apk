package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import java.io.File;

public class i extends Dialog {
  private View.OnClickListener b;
  
  private Context c;
  
  private String d;
  
  private String e;
  
  private LinearLayout f;
  
  public i(Context paramContext, int paramInt, View.OnClickListener paramOnClickListener, String paramString1, String paramString2) {
    super(paramContext, paramInt);
    this.b = paramOnClickListener;
    this.c = paramContext;
    this.d = paramString1;
    this.e = paramString2;
  }
  
  public void dismiss() {
    super.dismiss();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.H0(this.c, (EZCallApplication.c()).f);
    setContentView(2131493022);
    if (i1.f0(this.c).booleanValue() && Build.VERSION.SDK_INT >= 17 && getWindow() != null)
      getWindow().getDecorView().setLayoutDirection(1); 
    ((ImageView)findViewById(2131296968)).setOnClickListener(this.b);
    ((FrameLayout)findViewById(2131296741)).setOnClickListener(this.b);
    this.f = (LinearLayout)findViewById(2131297206);
    TextView textView2 = (TextView)findViewById(2131298139);
    TextView textView3 = (TextView)findViewById(2131298141);
    TextView textView4 = (TextView)findViewById(2131298140);
    TextView textView5 = (TextView)findViewById(2131298142);
    TextView textView1 = (TextView)findViewById(2131298144);
    ((TextView)findViewById(2131297901)).setTypeface(g1.b());
    textView2.setTypeface(g1.b());
    textView3.setTypeface(g1.b());
    textView4.setTypeface(g1.b());
    textView5.setTypeface(g1.b());
    textView1.setTypeface(g1.b());
    ((TextView)findViewById(2131298024)).setTypeface(g1.b());
    ((TextView)findViewById(2131298025)).setTypeface(g1.b());
    String str2 = this.d;
    if (str2 != null && !"".equals(str2)) {
      textView2.setText(this.d);
      textView2.setVisibility(0);
      textView4.setText(this.d);
      textView4.setVisibility(0);
    } 
    String str1 = this.e;
    if (str1 != null && !"".equals(str1)) {
      textView3.setText(this.e);
      textView5.setText(this.e);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.e);
      stringBuilder.append(" ");
      stringBuilder.append(this.c.getResources().getString(2131755131));
      textView1.setText(stringBuilder.toString());
    } 
    (new Handler()).postDelayed(new a(this), 800L);
  }
  
  class a implements Runnable {
    a(i this$0) {}
    
    public void run() {
      if (i.a(this.b) != null) {
        i.a(this.b).setDrawingCacheEnabled(true);
        i.a(this.b).buildDrawingCache();
        Bitmap bitmap = i.a(this.b).getDrawingCache();
        if (bitmap != null) {
          File file = i.b(this.b).getExternalFilesDir("");
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(file);
          stringBuilder.append("/");
          i1.z0(bitmap, stringBuilder.toString(), "share.png");
        } else if (d0.a) {
          d0.a("shareimage", "bitmap==null");
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */