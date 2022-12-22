package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class l extends Dialog {
  private View.OnClickListener b;
  
  private Context c;
  
  public l(Context paramContext, int paramInt, View.OnClickListener paramOnClickListener) {
    super(paramContext, paramInt);
    this.b = paramOnClickListener;
    this.c = paramContext;
  }
  
  public void dismiss() {
    super.dismiss();
    b1.t1(false);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.H0(this.c, (EZCallApplication.c()).f);
    setContentView(2131493024);
    if (i1.f0(this.c).booleanValue() && Build.VERSION.SDK_INT >= 17 && getWindow() != null)
      getWindow().getDecorView().setLayoutDirection(1); 
    ((ImageView)findViewById(2131296485)).setOnClickListener(this.b);
    ((FrameLayout)findViewById(2131296752)).setOnClickListener(this.b);
    ((FrameLayout)findViewById(2131296741)).setOnClickListener(this.b);
    ((TextView)findViewById(2131297901)).setTypeface(g1.b());
    ((TextView)findViewById(2131297935)).setTypeface(g1.b());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */