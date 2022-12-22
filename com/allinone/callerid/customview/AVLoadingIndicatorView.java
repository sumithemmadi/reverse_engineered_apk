package com.allinone.callerid.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.allinone.callerid.R;
import com.allinone.callerid.indicator.BaseIndicatorController;
import com.allinone.callerid.indicator.a;

public class AVLoadingIndicatorView extends View {
  int b;
  
  int c;
  
  Paint d;
  
  BaseIndicatorController e;
  
  private boolean f;
  
  public AVLoadingIndicatorView(Context paramContext) {
    super(paramContext);
    e(null, 0);
  }
  
  public AVLoadingIndicatorView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    e(paramAttributeSet, 0);
  }
  
  public AVLoadingIndicatorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    e(paramAttributeSet, paramInt);
  }
  
  private void b() {
    if (this.b == 3)
      this.e = (BaseIndicatorController)new a(); 
    this.e.i(this);
  }
  
  private int c(int paramInt) {
    return (int)(getContext().getResources().getDisplayMetrics()).density * paramInt;
  }
  
  private void e(AttributeSet paramAttributeSet, int paramInt) {
    TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.AVLoadingIndicatorView);
    this.b = typedArray.getInt(0, 0);
    this.c = typedArray.getColor(1, -1);
    typedArray.recycle();
    Paint paint = new Paint();
    this.d = paint;
    paint.setColor(this.c);
    this.d.setStyle(Paint.Style.FILL);
    this.d.setAntiAlias(true);
    b();
  }
  
  private int f(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (i == 1073741824) {
      paramInt2 = j;
    } else {
      paramInt2 = paramInt1;
      if (i == Integer.MIN_VALUE)
        paramInt2 = Math.min(paramInt1, j); 
    } 
    return paramInt2;
  }
  
  void a() {
    this.e.f();
  }
  
  void d(Canvas paramCanvas) {
    this.e.b(paramCanvas, this.d);
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.f)
      this.e.h(BaseIndicatorController.AnimStatus.b); 
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.e.h(BaseIndicatorController.AnimStatus.d);
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    d(paramCanvas);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.f) {
      this.f = true;
      a();
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(f(c(45), paramInt1), f(c(45), paramInt2));
  }
  
  public void setVisibility(int paramInt) {
    if (getVisibility() != paramInt) {
      super.setVisibility(paramInt);
      if (paramInt == 8 || paramInt == 4) {
        this.e.h(BaseIndicatorController.AnimStatus.c);
        return;
      } 
      this.e.h(BaseIndicatorController.AnimStatus.b);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/AVLoadingIndicatorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */