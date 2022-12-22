package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;

public class MotionTelltales extends MockView {
  private Paint m = new Paint();
  
  MotionLayout n;
  
  float[] o = new float[2];
  
  Matrix p = new Matrix();
  
  int q = 0;
  
  int r = -65281;
  
  float s = 0.25F;
  
  public MotionTelltales(Context paramContext) {
    super(paramContext);
    a(paramContext, null);
  }
  
  public MotionTelltales(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public MotionTelltales(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet) {
    if (paramAttributeSet != null) {
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.MotionTelltales);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.MotionTelltales_telltales_tailColor) {
          this.r = typedArray.getColor(j, this.r);
        } else if (j == e.MotionTelltales_telltales_velocityMode) {
          this.q = typedArray.getInt(j, this.q);
        } else if (j == e.MotionTelltales_telltales_tailScale) {
          this.s = typedArray.getFloat(j, this.s);
        } 
      } 
      typedArray.recycle();
    } 
    this.m.setColor(this.r);
    this.m.setStrokeWidth(5.0F);
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
  }
  
  public void onDraw(Canvas paramCanvas) {
    ViewParent viewParent;
    super.onDraw(paramCanvas);
    getMatrix().invert(this.p);
    if (this.n == null) {
      viewParent = getParent();
      if (viewParent instanceof MotionLayout)
        this.n = (MotionLayout)viewParent; 
      return;
    } 
    int i = getWidth();
    int j = getHeight();
    float[] arrayOfFloat = new float[5];
    arrayOfFloat[0] = 0.1F;
    arrayOfFloat[1] = 0.25F;
    arrayOfFloat[2] = 0.5F;
    arrayOfFloat[3] = 0.75F;
    arrayOfFloat[4] = 0.9F;
    for (byte b = 0; b < 5; b++) {
      float f = arrayOfFloat[b];
      for (byte b1 = 0; b1 < 5; b1++) {
        float f1 = arrayOfFloat[b1];
        this.n.g0(this, f1, f, this.o, this.q);
        this.p.mapVectors(this.o);
        float f2 = i * f1;
        float f3 = j * f;
        float[] arrayOfFloat1 = this.o;
        float f4 = arrayOfFloat1[0];
        float f5 = this.s;
        f1 = arrayOfFloat1[1];
        this.p.mapVectors(arrayOfFloat1);
        viewParent.drawLine(f2, f3, f2 - f4 * f5, f3 - f1 * f5, this.m);
      } 
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    postInvalidate();
  }
  
  public void setText(CharSequence paramCharSequence) {
    this.g = paramCharSequence.toString();
    requestLayout();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/utils/widget/MotionTelltales.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */