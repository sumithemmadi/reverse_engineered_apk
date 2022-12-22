package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class BallScaleMultipleIndicator extends a {
  int[] alphaInts = new int[] { 255, 255, 255 };
  
  float[] scaleFloats = new float[] { 1.0F, 1.0F, 1.0F };
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    for (byte b = 0; b < 3; b++) {
      paramPaint.setAlpha(this.alphaInts[b]);
      float[] arrayOfFloat = this.scaleFloats;
      paramCanvas.scale(arrayOfFloat[b], arrayOfFloat[b], (getWidth() / 2), (getHeight() / 2));
      paramCanvas.drawCircle((getWidth() / 2), (getHeight() / 2), (getWidth() / 2) - 4.0F, paramPaint);
    } 
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    long[] arrayOfLong = new long[3];
    arrayOfLong[0] = 0L;
    arrayOfLong[1] = 200L;
    arrayOfLong[2] = 400L;
    for (final byte index = 0; b < 3; b++) {
      ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      valueAnimator1.setInterpolator((TimeInterpolator)new LinearInterpolator());
      valueAnimator1.setDuration(1000L);
      valueAnimator1.setRepeatCount(-1);
      addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallScaleMultipleIndicator.this.scaleFloats[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              BallScaleMultipleIndicator.this.postInvalidate();
            }
          });
      valueAnimator1.setStartDelay(arrayOfLong[b]);
      ValueAnimator valueAnimator2 = ValueAnimator.ofInt(new int[] { 255, 0 });
      valueAnimator2.setInterpolator((TimeInterpolator)new LinearInterpolator());
      valueAnimator2.setDuration(1000L);
      valueAnimator2.setRepeatCount(-1);
      addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallScaleMultipleIndicator.this.alphaInts[index] = ((Integer)param1ValueAnimator.getAnimatedValue()).intValue();
              BallScaleMultipleIndicator.this.postInvalidate();
            }
          });
      valueAnimator1.setStartDelay(arrayOfLong[b]);
      arrayList.add(valueAnimator1);
      arrayList.add(valueAnimator2);
    } 
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BallScaleMultipleIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */