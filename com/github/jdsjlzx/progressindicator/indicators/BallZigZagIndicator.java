package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class BallZigZagIndicator extends a {
  float[] translateX = new float[2];
  
  float[] translateY = new float[2];
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    for (byte b = 0; b < 2; b++) {
      paramCanvas.save();
      paramCanvas.translate(this.translateX[b], this.translateY[b]);
      paramCanvas.drawCircle(0.0F, 0.0F, (getWidth() / 10), paramPaint);
      paramCanvas.restore();
    } 
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    float f1 = (getWidth() / 6);
    float f2 = (getWidth() / 6);
    for (final byte index = 0; b < 2; b++) {
      ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { f1, getWidth() - f1, (getWidth() / 2), f1 });
      if (b == 1)
        valueAnimator1 = ValueAnimator.ofFloat(new float[] { getWidth() - f1, f1, (getWidth() / 2), getWidth() - f1 }); 
      ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[] { f2, f2, (getHeight() / 2), f2 });
      if (b == 1)
        valueAnimator2 = ValueAnimator.ofFloat(new float[] { getHeight() - f2, getHeight() - f2, (getHeight() / 2), getHeight() - f2 }); 
      valueAnimator1.setDuration(1000L);
      valueAnimator1.setInterpolator((TimeInterpolator)new LinearInterpolator());
      valueAnimator1.setRepeatCount(-1);
      addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallZigZagIndicator.this.translateX[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              BallZigZagIndicator.this.postInvalidate();
            }
          });
      valueAnimator2.setDuration(1000L);
      valueAnimator2.setInterpolator((TimeInterpolator)new LinearInterpolator());
      valueAnimator2.setRepeatCount(-1);
      addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallZigZagIndicator.this.translateY[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              BallZigZagIndicator.this.postInvalidate();
            }
          });
      arrayList.add(valueAnimator1);
      arrayList.add(valueAnimator2);
    } 
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BallZigZagIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */