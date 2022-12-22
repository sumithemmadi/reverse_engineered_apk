package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class b extends Dialog {
  private View.OnClickListener b;
  
  private Context c;
  
  public b(Context paramContext, int paramInt, View.OnClickListener paramOnClickListener) {
    super(paramContext, paramInt);
    this.c = paramContext;
    this.b = paramOnClickListener;
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.H0(this.c, (EZCallApplication.c()).f);
    setContentView(2131493005);
    Typeface typeface = g1.b();
    ((TextView)findViewById(2131297756)).setTypeface(typeface);
    ((TextView)findViewById(2131296497)).setTypeface(typeface);
    ((TextView)findViewById(2131297843)).setTypeface(typeface);
    ((TextView)findViewById(2131298029)).setTypeface(typeface);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296725);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296767);
    frameLayout2.setOnClickListener(this.b);
    frameLayout1.setOnClickListener(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */