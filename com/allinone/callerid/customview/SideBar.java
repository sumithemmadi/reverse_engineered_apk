package com.allinone.callerid.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.j;

public class SideBar extends View {
  public static String[] b = new String[] { 
      "☆", "#", "A", "B", "C", "D", "E", "F", "G", "H", 
      "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
      "S", "T", "U", "V", "W", "X", "Y", "Z" };
  
  private a c;
  
  private int d = -1;
  
  private Paint e = new Paint();
  
  private TextView f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private Typeface j;
  
  private float k;
  
  public SideBar(Context paramContext) {
    super(paramContext);
    a(paramContext);
  }
  
  public SideBar(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public SideBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  public void a(Context paramContext) {
    this.h = d1.a(paramContext, 2130968857, 2131099725);
    this.i = d1.a(paramContext, 2130968859, 2131099706);
    this.g = d1.b(paramContext, 2130969723, 2131231435);
    this.j = g1.b();
    this.k = j.b(paramContext, 13.0F);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    float f = paramMotionEvent.getY();
    int j = this.d;
    a a1 = this.c;
    int k = (int)(f / getHeight() * b.length);
    if (i != 1) {
      setBackgroundResource(this.g);
      if (j != k && k >= 0) {
        String[] arrayOfString = b;
        if (k < arrayOfString.length) {
          if (a1 != null)
            a1.a(arrayOfString[k]); 
          TextView textView = this.f;
          if (textView != null) {
            textView.setText(b[k]);
            this.f.setVisibility(0);
          } 
          this.d = k;
          invalidate();
        } 
      } 
    } else {
      setBackgroundDrawable((Drawable)new ColorDrawable(0));
      this.d = -1;
      invalidate();
      TextView textView = this.f;
      if (textView != null)
        textView.setVisibility(4); 
    } 
    return true;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = getWidth();
    float f1 = i * 1.0F;
    String[] arrayOfString = b;
    float f2 = (f1 - f1 / arrayOfString.length / 2.0F) / arrayOfString.length;
    for (i = 0; i < b.length; i++) {
      this.e.setColor(this.h);
      this.e.setTypeface(this.j);
      this.e.setAntiAlias(true);
      this.e.setTextSize(this.k);
      if (i == this.d) {
        this.e.setColor(this.i);
        this.e.setFakeBoldText(true);
      } 
      float f3 = (j / 2);
      float f4 = this.e.measureText(b[i]) / 2.0F;
      f1 = i;
      paramCanvas.drawText(b[i], f3 - f4, f1 * f2 + f2, this.e);
      this.e.reset();
    } 
  }
  
  public void setOnTouchingLetterChangedListener(a parama) {
    this.c = parama;
  }
  
  public void setTextView(TextView paramTextView) {
    this.f = paramTextView;
  }
  
  public static interface a {
    void a(String param1String);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/SideBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */