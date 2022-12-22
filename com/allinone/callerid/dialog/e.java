package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.k1.b;
import com.allinone.callerid.util.q;

public class e extends Dialog implements View.OnClickListener {
  private Context b;
  
  public e(Context paramContext, int paramInt) {
    super(paramContext, paramInt);
    this.b = paramContext;
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296817) {
      if (i == 2131297132)
        dismiss(); 
    } else {
      b.a = true;
      q.b().c("dialog_notifi_per_quest_click");
      b.c(this.b);
      dismiss();
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131493012);
    Typeface typeface = g1.b();
    ((TextView)findViewById(2131298187)).setTypeface(typeface, 1);
    ((TextView)findViewById(2131297866)).setTypeface(typeface);
    ((TextView)findViewById(2131297901)).setTypeface(typeface);
    ImageView imageView = (ImageView)findViewById(2131297132);
    ((FrameLayout)findViewById(2131296817)).setOnClickListener(this);
    imageView.setOnClickListener(this);
    q.b().c("dialog_notifi_per_quest_show");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */