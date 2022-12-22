package com.allinone.callerid.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import com.allinone.callerid.R;

public class CirclePercentView extends View {
  private Paint b;
  
  private float c;
  
  private float d;
  
  private RectF e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private LinearGradient j;
  
  private boolean k;
  
  public CirclePercentView(Context paramContext) {
    super(paramContext);
    a();
  }
  
  public CirclePercentView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CirclePercentView);
    this.f = typedArray.getColor(0, getResources().getColor(2131099695));
    this.g = typedArray.getColor(3, getResources().getColor(2131099942));
    this.d = typedArray.getDimension(4, 8.0F);
    this.k = typedArray.getBoolean(2, false);
    this.h = typedArray.getColor(5, getResources().getColor(2131099942));
    this.i = typedArray.getColor(1, getResources().getColor(2131099695));
    typedArray.recycle();
    a();
  }
  
  public CirclePercentView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a() {
    Paint paint = new Paint();
    this.b = paint;
    paint.setStyle(Paint.Style.STROKE);
    this.b.setStrokeCap(Paint.Cap.ROUND);
    this.b.setAntiAlias(true);
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    int i = getWidth() / 2;
    float f1 = i;
    float f2 = f1 / this.d;
    this.b.setShader(null);
    this.b.setStrokeWidth(f2);
    this.b.setColor(this.f);
    f2 /= 2.0F;
    paramCanvas.drawCircle(f1, f1, f1 - f2, this.b);
    if (this.e == null) {
      f1 = (i * 2) - f2;
      this.e = new RectF(f2, f2, f1, f1);
    } 
    if (this.k) {
      this.b.setShader((Shader)this.j);
    } else {
      this.b.setColor(this.g);
    } 
    paramCanvas.drawArc(this.e, -90.0F, this.c * 3.6F, false, this.b);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.j = new LinearGradient(getWidth(), 0.0F, getWidth(), getHeight(), this.h, this.i, Shader.TileMode.MIRROR);
  }
  
  public void setBgColor(int paramInt) {
    this.f = paramInt;
  }
  
  public void setEndColor(int paramInt) {
    this.i = paramInt;
  }
  
  public void setGradient(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  @Keep
  public void setPercentage(float paramFloat) {
    this.c = paramFloat;
    invalidate();
  }
  
  public void setProgressColor(int paramInt) {
    this.g = paramInt;
  }
  
  public void setRadius(int paramInt) {
    this.d = paramInt;
  }
  
  public void setStartColor(int paramInt) {
    this.h = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/CirclePercentView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */