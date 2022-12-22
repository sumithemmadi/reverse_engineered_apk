package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class BallRotateIndicator extends a {
  float degress;
  
  private Matrix mMatrix = new Matrix();
  
  float scaleFloat = 0.5F;
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    float f1 = (getWidth() / 10);
    float f2 = (getWidth() / 2);
    float f3 = (getHeight() / 2);
    paramCanvas.rotate(this.degress, centerX(), centerY());
    paramCanvas.save();
    float f4 = 2.0F * f1;
    paramCanvas.translate(f2 - f4 - f1, f3);
    float f5 = this.scaleFloat;
    paramCanvas.scale(f5, f5);
    paramCanvas.drawCircle(0.0F, 0.0F, f1, paramPaint);
    paramCanvas.restore();
    paramCanvas.save();
    paramCanvas.translate(f2, f3);
    f5 = this.scaleFloat;
    paramCanvas.scale(f5, f5);
    paramCanvas.drawCircle(0.0F, 0.0F, f1, paramPaint);
    paramCanvas.restore();
    paramCanvas.save();
    paramCanvas.translate(f2 + f4 + f1, f3);
    f4 = this.scaleFloat;
    paramCanvas.scale(f4, f4);
    paramCanvas.drawCircle(0.0F, 0.0F, f1, paramPaint);
    paramCanvas.restore();
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 0.5F, 1.0F, 0.5F });
    valueAnimator1.setDuration(1000L);
    valueAnimator1.setRepeatCount(-1);
    addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            BallRotateIndicator.this.scaleFloat = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
            BallRotateIndicator.this.postInvalidate();
          }
        });
    ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[] { 0.0F, 180.0F, 360.0F });
    addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            BallRotateIndicator.this.degress = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
            BallRotateIndicator.this.postInvalidate();
          }
        });
    valueAnimator2.setDuration(1000L);
    valueAnimator2.setRepeatCount(-1);
    arrayList.add(valueAnimator1);
    arrayList.add(valueAnimator2);
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BallRotateIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */