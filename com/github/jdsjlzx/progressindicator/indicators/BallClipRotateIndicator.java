package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class BallClipRotateIndicator extends a {
  float degrees;
  
  float scaleFloat = 1.0F;
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    paramPaint.setStyle(Paint.Style.STROKE);
    paramPaint.setStrokeWidth(3.0F);
    float f1 = (getWidth() / 2);
    float f2 = (getHeight() / 2);
    paramCanvas.translate(f1, f2);
    float f3 = this.scaleFloat;
    paramCanvas.scale(f3, f3);
    paramCanvas.rotate(this.degrees);
    paramCanvas.drawArc(new RectF(-f1 + 12.0F, -f2 + 12.0F, f1 + 0.0F - 12.0F, f2 + 0.0F - 12.0F), -45.0F, 270.0F, false, paramPaint);
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 1.0F, 0.6F, 0.5F, 1.0F });
    valueAnimator1.setDuration(750L);
    valueAnimator1.setRepeatCount(-1);
    addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            BallClipRotateIndicator.this.scaleFloat = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
            BallClipRotateIndicator.this.postInvalidate();
          }
        });
    ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[] { 0.0F, 180.0F, 360.0F });
    valueAnimator2.setDuration(750L);
    valueAnimator2.setRepeatCount(-1);
    addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            BallClipRotateIndicator.this.degrees = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
            BallClipRotateIndicator.this.postInvalidate();
          }
        });
    arrayList.add(valueAnimator1);
    arrayList.add(valueAnimator2);
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BallClipRotateIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */