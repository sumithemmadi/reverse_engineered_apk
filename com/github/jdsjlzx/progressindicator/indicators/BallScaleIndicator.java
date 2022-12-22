package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class BallScaleIndicator extends a {
  int alpha = 255;
  
  float scale = 1.0F;
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    paramPaint.setAlpha(this.alpha);
    float f = this.scale;
    paramCanvas.scale(f, f, (getWidth() / 2), (getHeight() / 2));
    paramPaint.setAlpha(this.alpha);
    paramCanvas.drawCircle((getWidth() / 2), (getHeight() / 2), (getWidth() / 2) - 4.0F, paramPaint);
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    valueAnimator1.setInterpolator((TimeInterpolator)new LinearInterpolator());
    valueAnimator1.setDuration(1000L);
    valueAnimator1.setRepeatCount(-1);
    addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            BallScaleIndicator.this.scale = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
            BallScaleIndicator.this.postInvalidate();
          }
        });
    ValueAnimator valueAnimator2 = ValueAnimator.ofInt(new int[] { 255, 0 });
    valueAnimator2.setInterpolator((TimeInterpolator)new LinearInterpolator());
    valueAnimator2.setDuration(1000L);
    valueAnimator2.setRepeatCount(-1);
    addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            BallScaleIndicator.this.alpha = ((Integer)param1ValueAnimator.getAnimatedValue()).intValue();
            BallScaleIndicator.this.postInvalidate();
          }
        });
    arrayList.add(valueAnimator1);
    arrayList.add(valueAnimator2);
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BallScaleIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */