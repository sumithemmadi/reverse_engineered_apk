package com.allinone.callerid.customview;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.allinone.callerid.util.j;

public class SpeakerTiplView extends LinearLayout {
  private static WindowManager b;
  
  private Context c = null;
  
  private WindowManager.LayoutParams d = new WindowManager.LayoutParams();
  
  public SpeakerTiplView(Context paramContext) {
    super(paramContext);
    this.c = paramContext;
    LayoutInflater.from(paramContext).inflate(2131493197, (ViewGroup)this);
    b = (WindowManager)paramContext.getSystemService("window");
    a();
  }
  
  private void a() {
    int i = b.getDefaultDisplay().getHeight();
    if (Build.VERSION.SDK_INT >= 26) {
      this.d.type = 2038;
    } else {
      this.d.type = 2010;
    } 
    WindowManager.LayoutParams layoutParams = this.d;
    layoutParams.flags = 40;
    layoutParams.gravity = 49;
    layoutParams.y = i - j.a(this.c, 98.0F);
    layoutParams = this.d;
    layoutParams.width = -2;
    layoutParams.height = -2;
    layoutParams.format = -2;
    b.addView((View)this, (ViewGroup.LayoutParams)layoutParams);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/SpeakerTiplView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */