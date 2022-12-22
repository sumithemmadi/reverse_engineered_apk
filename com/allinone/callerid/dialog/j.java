package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class j extends Dialog {
  private final Context b;
  
  private View.OnClickListener c;
  
  public j(Context paramContext, int paramInt, View.OnClickListener paramOnClickListener) {
    super(paramContext, paramInt);
    this.c = paramOnClickListener;
    this.b = paramContext;
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131493196);
    if (i1.f0(this.b).booleanValue() && Build.VERSION.SDK_INT >= 17 && getWindow() != null)
      getWindow().getDecorView().setLayoutDirection(1); 
    ((TextView)findViewById(2131298175)).setTypeface(g1.b());
    ((TextView)findViewById(2131298176)).setTypeface(g1.b());
    ((TextView)findViewById(2131298177)).setTypeface(g1.b());
    ((TextView)findViewById(2131298178)).setTypeface(g1.b());
    TextView textView2 = (TextView)findViewById(2131298174);
    TextView textView1 = (TextView)findViewById(2131298066);
    textView2.setTypeface(g1.b());
    textView1.setTypeface(g1.b());
    textView2.setText(i1.P());
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(b1.i0());
    stringBuilder.append("");
    textView1.setText(stringBuilder.toString());
    ((ImageView)findViewById(2131297129)).setOnClickListener(this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */