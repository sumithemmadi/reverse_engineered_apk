package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {
  private final c b;
  
  private b c;
  
  private float d;
  
  private int e = 0;
  
  public AspectRatioFrameLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public AspectRatioFrameLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    if (paramAttributeSet != null) {
      TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, k.AspectRatioFrameLayout, 0, 0);
      try {
        this.e = typedArray.getInt(k.AspectRatioFrameLayout_resize_mode, 0);
      } finally {
        typedArray.recycle();
      } 
    } 
    this.b = new c(null);
  }
  
  public int getResizeMode() {
    return this.e;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.d <= 0.0F)
      return; 
    paramInt2 = getMeasuredWidth();
    paramInt1 = getMeasuredHeight();
    float f1 = paramInt2;
    float f2 = paramInt1;
    float f3 = f1 / f2;
    float f4 = this.d / f3 - 1.0F;
    if (Math.abs(f4) <= 0.01F) {
      this.b.a(this.d, f3, false);
      return;
    } 
    int i = this.e;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 4) {
            this.b.a(this.d, f3, true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824));
            return;
          } 
          if (f4 > 0.0F) {
            f4 = this.d;
          } else {
            f4 = this.d;
            paramInt1 = (int)(f1 / f4);
          } 
        } else {
          f4 = this.d;
        } 
      } else {
        f4 = this.d;
        paramInt1 = (int)(f1 / f4);
      } 
    } else {
      if (f4 > 0.0F) {
        f4 = this.d;
      } else {
        f4 = this.d;
        paramInt2 = (int)(f2 * f4);
      } 
      paramInt1 = (int)(f1 / f4);
    } 
    paramInt2 = (int)(f2 * f4);
  }
  
  public void setAspectRatio(float paramFloat) {
    if (this.d != paramFloat) {
      this.d = paramFloat;
      requestLayout();
    } 
  }
  
  public void setAspectRatioListener(b paramb) {
    this.c = paramb;
  }
  
  public void setResizeMode(int paramInt) {
    if (this.e != paramInt) {
      this.e = paramInt;
      requestLayout();
    } 
  }
  
  public static interface b {
    void a(float param1Float1, float param1Float2, boolean param1Boolean);
  }
  
  private final class c implements Runnable {
    private float b;
    
    private float c;
    
    private boolean d;
    
    private boolean e;
    
    private c(AspectRatioFrameLayout this$0) {}
    
    public void a(float param1Float1, float param1Float2, boolean param1Boolean) {
      this.b = param1Float1;
      this.c = param1Float2;
      this.d = param1Boolean;
      if (!this.e) {
        this.e = true;
        this.f.post(this);
      } 
    }
    
    public void run() {
      this.e = false;
      if (AspectRatioFrameLayout.a(this.f) == null)
        return; 
      AspectRatioFrameLayout.a(this.f).a(this.b, this.c, this.d);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/AspectRatioFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */