package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class CubeTransitionIndicator extends a {
  float degrees;
  
  float scaleFloat = 1.0F;
  
  float[] translateX = new float[2];
  
  float[] translateY = new float[2];
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    float f1 = (getWidth() / 5);
    float f2 = (getHeight() / 5);
    for (byte b = 0; b < 2; b++) {
      paramCanvas.save();
      paramCanvas.translate(this.translateX[b], this.translateY[b]);
      paramCanvas.rotate(this.degrees);
      float f = this.scaleFloat;
      paramCanvas.scale(f, f);
      paramCanvas.drawRect(new RectF(-f1 / 2.0F, -f2 / 2.0F, f1 / 2.0F, f2 / 2.0F), paramPaint);
      paramCanvas.restore();
    } 
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    float f1 = (getWidth() / 5);
    float f2 = (getHeight() / 5);
    for (final byte index = 0; b < 2; b++) {
      this.translateX[b] = f1;
      ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(new float[] { f1, getWidth() - f1, getWidth() - f1, f1, f1 });
      if (b == 1)
        valueAnimator3 = ValueAnimator.ofFloat(new float[] { getWidth() - f1, f1, f1, getWidth() - f1, getWidth() - f1 }); 
      valueAnimator3.setInterpolator((TimeInterpolator)new LinearInterpolator());
      valueAnimator3.setDuration(1600L);
      valueAnimator3.setRepeatCount(-1);
      valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              CubeTransitionIndicator.this.translateX[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              CubeTransitionIndicator.this.postInvalidate();
            }
          });
      this.translateY[b] = f2;
      ValueAnimator valueAnimator4 = ValueAnimator.ofFloat(new float[] { f2, f2, getHeight() - f2, getHeight() - f2, f2 });
      if (b == 1)
        valueAnimator4 = ValueAnimator.ofFloat(new float[] { getHeight() - f2, getHeight() - f2, f2, f2, getHeight() - f2 }); 
      valueAnimator4.setDuration(1600L);
      valueAnimator4.setInterpolator((TimeInterpolator)new LinearInterpolator());
      valueAnimator4.setRepeatCount(-1);
      addUpdateListener(valueAnimator4, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              CubeTransitionIndicator.this.translateY[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              CubeTransitionIndicator.this.postInvalidate();
            }
          });
      arrayList.add(valueAnimator3);
      arrayList.add(valueAnimator4);
    } 
    ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[] { 1.0F, 0.5F, 1.0F, 0.5F, 1.0F });
    valueAnimator2.setDuration(1600L);
    valueAnimator2.setInterpolator((TimeInterpolator)new LinearInterpolator());
    valueAnimator2.setRepeatCount(-1);
    addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            CubeTransitionIndicator.this.scaleFloat = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
            CubeTransitionIndicator.this.postInvalidate();
          }
        });
    ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 0.0F, 180.0F, 360.0F, 540.0F, 720.0F });
    valueAnimator1.setDuration(1600L);
    valueAnimator1.setInterpolator((TimeInterpolator)new LinearInterpolator());
    valueAnimator1.setRepeatCount(-1);
    addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            CubeTransitionIndicator.this.degrees = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
            CubeTransitionIndicator.this.postInvalidate();
          }
        });
    arrayList.add(valueAnimator2);
    arrayList.add(valueAnimator1);
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/CubeTransitionIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */