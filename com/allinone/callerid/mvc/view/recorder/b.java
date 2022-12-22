package com.allinone.callerid.mvc.view.recorder;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.allinone.callerid.util.g1;

public class b extends PopupWindow {
  private TextView a;
  
  private TextView b;
  
  private TextView c;
  
  private FrameLayout d;
  
  private FrameLayout e;
  
  private FrameLayout f;
  
  private View g;
  
  private View.OnClickListener h;
  
  private Context i;
  
  public b(Context paramContext) {
    this.i = paramContext;
    this.g = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(2131493150, null);
    setWidth(-2);
    setHeight(-2);
    setContentView(this.g);
    setFocusable(true);
    setOutsideTouchable(true);
    update();
    setBackgroundDrawable((Drawable)new ColorDrawable(0));
    Typeface typeface = g1.b();
    this.d = (FrameLayout)this.g.findViewById(2131297367);
    this.a = (TextView)this.g.findViewById(2131297368);
    this.e = (FrameLayout)this.g.findViewById(2131297365);
    this.b = (TextView)this.g.findViewById(2131297366);
    this.f = (FrameLayout)this.g.findViewById(2131297369);
    this.c = (TextView)this.g.findViewById(2131297370);
    this.a.setTypeface(typeface);
    this.b.setTypeface(typeface);
    this.c.setTypeface(typeface);
  }
  
  public void a(View.OnClickListener paramOnClickListener) {
    this.h = paramOnClickListener;
    this.d.setOnClickListener(paramOnClickListener);
    this.e.setOnClickListener(paramOnClickListener);
    this.f.setOnClickListener(paramOnClickListener);
  }
  
  public void b(String[] paramArrayOfString) {
    if (paramArrayOfString[0] != null)
      this.a.setText(paramArrayOfString[0]); 
    if (paramArrayOfString.length > 1 && paramArrayOfString[1] != null) {
      this.b.setText(paramArrayOfString[1]);
    } else {
      this.e.setVisibility(8);
    } 
    if (paramArrayOfString.length > 2 && paramArrayOfString[2] != null) {
      this.c.setText(paramArrayOfString[2]);
    } else {
      this.f.setVisibility(8);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/view/recorder/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */